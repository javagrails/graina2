grails.servlet.version = "2.5" // Change depending on target container compliance (2.5 or 3.0)
grails.project.class.dir = "target/classes"
grails.project.test.class.dir = "target/test-classes"
grails.project.test.reports.dir = "target/test-reports"
grails.project.target.level = 1.6
grails.project.source.level = 1.6

grails.project.dependency.resolution = {
    inherits "global"
    log "info"
    checksums true

    repositories {
        inherits true

        grailsPlugins()
        grailsHome()
        grailsCentral()

        mavenLocal()
        mavenCentral()
    }

    dependencies {
        test "org.spockframework:spock-grails-support:0.7-groovy-2.0"

        // next four lines are required if you're using embedded/ha *and* you want the webadmin available
        /*compile(group:"org.neo4j.app", name:"neo4j-server", version:"1.8")
        runtime(group:"org.neo4j.app", name:"neo4j-server", version:"1.8", branch:"static-web")
        runtime('com.sun.jersey:jersey-server:1.9')
        runtime('com.sun.jersey:jersey-core:1.9')*/
    }

    plugins {
        runtime ":hibernate:$grailsVersion"
        runtime ":jquery:1.7.2"
        runtime ":resources:1.2"
        runtime ":navigation:1.3.2"
        runtime ":jquery-ui:1.8.24", ":famfamfam:1.0.1"
 
        build ":tomcat:$grailsVersion"

        runtime ":database-migration:1.1"

        compile ':cache:1.0.1', ":cache-redis:1.0.0"
        compile ":mail:1.0.1"
        compile ":spring-security-core:1.2.7.3", ":spring-security-ui:0.2"
        compile ":spring-security-twitter:0.4.4"
        compile ":jms:1.2"
        compile ":quartz:1.0-RC9"

        compile ":redis:1.3.3"
        compile ":mongodb:1.3.0"
        compile ":neo4j:1.0.1"

        compile ":platform-core:1.0.RC5"

        test ":spock:0.7", {
            exclude "spock-grails-support"
        }
    }
}
