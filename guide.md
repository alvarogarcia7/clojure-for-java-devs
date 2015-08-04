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

## variables

```lisp
(def variable 1)
```

```lisp
(def other-symbols-as-well true)
```

```lisp
(def is-true? true)
```

let's try mutating the state*:

```lisp
(def listt '(1 2 3))

(cons 4 listt)
```

what is the value of ``listt``?

### idiomatic use

```lisp
(def listt (cons 4 listt))
```

is not very idiomatic.

What do you want to do with it?