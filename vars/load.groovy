import groovy.grape.Grape

def call() {
  ClassLoader classLoader = ClassLoader.systemClassLoader
  Map[] grapez = [[group : 'org.apache.commons', module : 'commons-math3', version : '3.4.1']]
  Grape.grab(classLoader: classLoader, grapez)
}

