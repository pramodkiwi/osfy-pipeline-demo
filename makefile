cc=gcc

src := $(wildcard src/*.c)
obj := $(src:.c=.o)

pipimage: $(obj)
	$(cc) -o $@ $^

.PHONY: clean

clean:
	rm -f $(obj) pipimage
