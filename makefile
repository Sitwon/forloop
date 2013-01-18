CC= gcc
CPPFLAGS=
CFLAGS= -O2 -Wall -Werror -g
LDFLAGS=
LDLIBS=
OBJECTS= forloop

.PHONY: all clean debug
all: $(OBJECTS)
	strip $(OBJECTS)

debug: clean $(OBJECTS) ;

clean:
	rm -f $(OBJECTS)

