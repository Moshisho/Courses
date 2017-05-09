# jenkins-course

https://drive.google.com/file/d/0B96eKW0Yt8K6QkdORER0NGhzaTQ/view

https://github.com/otomato-gh/mvnJunitExample

http://centos.syn.co.il/7/isos/x86_64/?sort=size DVD iso for installing CentOS - in VirtualBox: Type:Linux Version:RedHat


### SCRIPTING GROOVY CONSOLE:         
http://JENKINS_IP:8080/console  

## GROOVY JENKINS OBJECTS:
~~~
item = Jenkins.instance.getItemByFullName("your-job-name-
here")

//THIS WILL REMOVE ALL BUILD HISTORY

item.builds.each() { build ->

build.delete()

}

Use *.dump() function and instanceof for object reflection

Retrieve a list of successful builds of a project:

job = Jenkins.instance.getItem("myjob")

def good_builds = []

job.getBuilds().each() { build ->

if ( build.result.toString() == "SUCCESS")

{

good_builds.add(build.number)

}

}

//return value is a list
good_builds
~~~
