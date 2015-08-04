(ns fizzbuzz)

;(defn fizzbuzz[n]
;	"1")

(defn is-multiple-of? [n divisor]
  (= 0 (rem n divisor)))

(defn fizzbuzz[n]
  (map
	#(cond
	(is-multiple-of? % 15) "FizzBuzz"
	(= 0 (rem % 3)) "Fizz"
	(= 0 (rem % 5)) "Buzz"
	:else (str %))
  (range 1 (inc n))))