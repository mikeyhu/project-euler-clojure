(ns project-euler-clojure.problem3)

;The prime factors of 13195 are 5, 7, 13 and 29.
;What is the largest prime factor of the number 600851475143 ?

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
  (let [p (take-while (partial > (sqrt n)) (primes))]
    (filter #(= (mod n %) 0) p)
  )
)
