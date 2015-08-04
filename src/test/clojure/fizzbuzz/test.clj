(ns fizzbuzz.test
  (:use [clojure.test])
  (:use [fizzbuzz]))

  
(deftest canary-test []
    (is (= 1 1)))
	
(deftest fizz-buzz-numbers []
	(is (= '("1") (fizzbuzz 1))))
	
(deftest fizz-buzz-up-to-fizz []
	(is (= '("1" "2" "Fizz") (fizzbuzz 3))))
	
(deftest fizz-buzz-up-to-buzz []
	(is (= '("1" "2" "Fizz" "4" "Buzz") (fizzbuzz 5))))
	
(deftest fizz-buzz-up-to-fizzbuzz []
	(is (= '("1" "2" "Fizz" "4" "Buzz" "Fizz" "7" "8" "Fizz" "Buzz" "11" "Fizz" "13" "14" "FizzBuzz") (fizzbuzz 15))))	
	