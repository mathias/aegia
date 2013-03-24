(ns aegia.service-test
  (:require [clojure.test :refer :all]
            [io.pedestal.service.test :refer :all]
            [io.pedestal.service.http :as bootstrap]
            [aegia.service :as service]))

(def service
  (::bootstrap/service-fn (bootstrap/create-servlet service/service)))

(deftest home-page-test
  (is (=
       (:body (response-for service :get "/"))
       "Must provide a URL parameter")))

(deftest about-page-test
  (is (.contains
       (:body (response-for service :get "/about"))
       "Clojure 1.5")))
