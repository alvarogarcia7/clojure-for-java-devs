(ns fizzbuzz.test
  (:use [clojure.test])
  (:use [fizzbuzz]))

  
(deftest canary-test []
    (is (= 1 1)))
	
;(deftest fizz-buzz-1 []
;	(is (= "1" (fizzbuzz 1))))