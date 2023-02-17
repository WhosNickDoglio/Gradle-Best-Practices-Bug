import org.gradle.api.DefaultTask
import org.gradle.api.logging.LogLevel
import org.gradle.api.tasks.TaskAction

abstract class MyBadTask: DefaultTask() {

    @TaskAction
    fun execute() {
        project.allprojects.forEach {
            logger.log(LogLevel.LIFECYCLE, "Project $it")
        }
    }
}