package tz.co.asoft.interview.school

import tz.co.asoft.interview.school.students.StudentService
import tz.co.asoft.interview.school.teachers.TeacherService

interface School {
    val name: String
    val teachers: TeacherService
    val students: StudentService
}