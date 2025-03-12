package tz.co.asoft.interview

import tz.co.asoft.interview.school.createSchool
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertFails

class SchoolTest {
    @Test
    fun should_be_able_to_create_a_school_platform() {
        val school = createSchool(name = "aSoft School of Programming")
        assertEquals(school.name, "aSoft School of Programming")
    }

    @Test
    fun should_be_able_to_hire_teachers() {
        val school = createSchool(name = "aSoft School of Programming")
        val teacher = school.teachers.hire("Baraka")
        assertEquals(teacher.name, "Baraka")
    }

    @Test
    fun should_be_able_to_hire_multiple_teachers() {
        val school = createSchool(name = "aSoft School of Programming")
        var teacher = school.teachers.hire("Teacher 1")
        assertEquals(teacher.name, "Teacher 1")
        teacher = school.teachers.hire("Teacher 2")
        assertEquals(teacher.name, "Teacher 1")
    }

    @Test
    fun should_be_able_to_print_the_list_of_all_hired_teachers() {
        val school = createSchool(name = "aSoft School of Programming")
        val teachers = school.teachers
        var teacher = teachers.hire("Teacher 1")
        assertEquals(teacher.name, "Teacher 1")
        teacher = teachers.hire("Teacher 2")
        assertEquals(teacher.name, "Teacher 1")
        assertEquals("[ Teacher 1, Teacher 2 ]", teachers.list().joinToString(prefix = "[ ", separator = ", ", postfix = " ]") { it.name })
    }

    @Test
    fun should_be_able_to_fire_teachers() {
        val school = createSchool(name = "aSoft School of Programming")
        val teachers = school.teachers
        var teacher = teachers.hire("Teacher 1")
        assertEquals(teacher.name, "Teacher 1")
        teacher = teachers.hire("Teacher 2")
        assertEquals(teacher.name, "Teacher 1")
        teachers.fire("Teacher 1")
        assertEquals("[ Teacher 2 ]", teachers.list().joinToString(prefix = "[ ", separator = ", ", postfix = " ]") { it.name })
    }

    @Test
    fun should_not_be_able_to_be_able_to_hire_teachers_with_the_same_name() {
        val school = createSchool(name = "aSoft School of Programming")
        val teachers = school.teachers
        teachers.hire("John")
        val error = assertFails { teachers.hire("John") }
        assertEquals(error.message, "A teacher called 'John' has already been hired")
    }
}