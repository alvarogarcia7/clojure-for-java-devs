basic of clojure
-------------

## hello world

```lisp
(println "hello world")
```

## working with sequences

an empty sequence

```lisp
'()
```

adding an element to the list

```lisp
(conj '() 1)
```

the order of inserting into the list is important:

```lisp
(conj '() 1 2 3 4)
```