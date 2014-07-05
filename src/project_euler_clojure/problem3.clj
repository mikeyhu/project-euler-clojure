(ns project-euler-clojure.problem3
  (:require [clojure.math.numeric-tower :as math])
)

(defn divisible? [primes number-to-check]
  (not-any? #(= (mod number-to-check %) 0) primes)
)

(defn primes
  ([] (cons 1 (primes [] 2)))
  ([prev, check]
    (if (divisible? prev check)
      (cons check (lazy-seq (primes (concat prev [check]) (inc check))))
      (primes prev (inc check))
    )
  )
)

(defn prime-factors [n]
  (let [p (take-while (partial > (math/sqrt n)) (primes))]
    (first (sort > (filter #(= (mod n %) 0) p)))
  )
)
