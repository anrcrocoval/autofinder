PLUGINDIR=/home/stephan/install/icy/plugins/building/autofinder/
JARNAME=autofinder-1.0-SNAPSHOT.jar
NAME=autofinder

all: $(NAME)
	cp -i target/$(JARNAME) $(PLUGINDIR)

$(NAME):
	mvn install

clean:
	mvn clean

