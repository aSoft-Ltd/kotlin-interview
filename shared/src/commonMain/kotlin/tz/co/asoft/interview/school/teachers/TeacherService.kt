package tz.co.asoft.interview.school.teachers

interface TeacherService {
    fun hire(name: String): Teacher
    fun fire(name: String): Teacher
    fun list(): List<Teacher>
}