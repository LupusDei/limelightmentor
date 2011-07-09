(ns limelightmentor.core
  (:use
    [compojure.core :only (defroutes GET)]
    [compojure.route :only (not-found)]
    [gaeshi.middleware.view-context :only (wrap-view-context)]
    [gaeshi.views :only (render-template render-html)]
    [gaeshi.controllers :only (controller-router)]))

(defroutes limelightmentor-routes
  (GET "/" [] (render-template "index"))
  (controller-router 'limelightmentor.controller)
  (not-found (render-template "not_found" :template-root "limelightmentor/view" :ns `limelightmentor.view.view-helpers)))

(def app-handler
  (->
    limelightmentor-routes
    (wrap-view-context :template-root "limelightmentor/view" :ns `limelightmentor.view.view-helpers)))

