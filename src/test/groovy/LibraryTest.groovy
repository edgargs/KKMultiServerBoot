/*
 * This Spock specification was auto generated by running the Gradle 'init' task
 * by 'Edgar Rios' at '10/03/17 10:30 AM' with Gradle 3.2.1
 *
 * @author Edgar Rios, @date 10/03/17 10:30 AM
 */

import spock.lang.Specification

class LibraryTest extends Specification{
    def "someLibraryMethod returns true"() {
        setup:
        Library lib = new Library()
        when:
        def result = lib.someLibraryMethod()
        then:
        result == true
    }
}