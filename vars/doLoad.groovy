import groovy.grape.Grape

def call() {
  ClassLoader classLoader = new groovy.lang.GroovyClassLoader()
  Map[] grapez = [[group : 'org.apache.commons', module : 'commons-math3', version : '3.4.1']]
  Grape.grab(classLoader: classLoader, grapez)
  Thread.currentThread().setContextClassLoader(classLoader)
  echo "Done grabbing"
}
