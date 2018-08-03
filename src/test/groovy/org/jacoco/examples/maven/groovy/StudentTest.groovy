package org.jacoco.examples.maven.groovy

class StudentTest extends GroovyTestCase {
   void testDisplay() {
      def stud = new Student(name : 'Joe', ID : '1')
      def expected = 'Joe49'
      assertToString(stud.Display(), expected)
   }
}
