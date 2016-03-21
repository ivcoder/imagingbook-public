<project xmlns="http://maven.apache.org/POM/4.0.0" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd">
  <modelVersion>4.0.0</modelVersion>
  <parent>
    <groupId>com.imagingbook</groupId>
    <artifactId>imagingbook-public</artifactId>
    <version>1.0</version>
  </parent>
  <artifactId>imagingbook-common</artifactId>
  <packaging>jar</packaging>
  <!-- <version>1.0</version> -->

  <properties>
	<myproject.root>${basedir}/../..</myproject.root>
	<!-- <javadoc-doctitle>ImagingBook common library</javadoc-doctitle> -->
  </properties>
  	
  <dependencies>
  	<dependency>
		<groupId>org.apache.commons</groupId>
		<artifactId>commons-math3</artifactId>
		<version>3.5</version>
	</dependency>
  </dependencies>
  
</project>