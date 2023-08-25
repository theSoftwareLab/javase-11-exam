package eu.thesoftwarelab.cert.io;

import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * @author Emmanouil Georgopoulos
 */
class TestPath {

  public static void main(String[] args) {
    Path path = Paths.get("c:\\java\\TestPath.java");
    System.out.println(path.getRoot());
    System.out.println(path.getNameCount());
    System.out.println(path.getName(0));
    System.out.println(path.getName(1));
    // System.out.println(path.getName(2)); // IllegalArgumentException
  }

}
