(ns fizzbuzz)

;(defn fizzbuzz[n]
;	"1")

(defn is-multiple-of? [n divisor]
  (= 0 (rem n divisor)))

(defn fizzbuzz[n]
  (map
	#(cond
	(is-multiple-of? % 15) "FizzBuzz"
	(is-multiple-of? % 3) "Fizz"
	(is-multiple-of? % 5) "Buzz"
	:else (str %))
  (range 1 (inc n))))