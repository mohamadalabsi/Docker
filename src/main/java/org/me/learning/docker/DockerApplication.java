package org.me.learning.docker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DockerApplication {

	public static void main(String[] args) {
		SpringApplication.run(DockerApplication.class, args);
	}
// starting docker with java today
//	if u work with a team and u work on your laptop and all the testing and stuff just on ur
//	laptop and then another team or a testers want the project sometimes it does not work on
//	their laptops and they have to install all the libraries and configuration to make it work so
//	in this case we use docker to containerize the app and just give it to them with all the things
//	that makes the app run
//	and if they were able to do all these stuff and made it work we give it to ops team to deploy
//	it they have to do all these stuff again and before docker we used virtualization and also
//	might not work and also virtual machines are heavy
//	see SWE Design course to see the difference between Docker and VM
//	 with Docker u give the entire Container  to them
//	 so they are running the Software inside the container
//	 inside the container we have everything we needed to run the app on the Dev laptop
//! and image of the app is just snapshot from it , image is where we put everything like repo and
// code , container is running instance of an image or in other words we have a container on our
// machine and the image is  a blueprint from the container we have on
// our machine and give it to them, it is a lightweight file of my running container,
//	 and from one image we can run multiple containers to scale it and simply they load the image
//	 to run the container
//	 and we can run the same container in multiple instances to scale it
//	 first we want to download images to see how things work then we will create our images
//	to delete the image we have to delete the container first



}
