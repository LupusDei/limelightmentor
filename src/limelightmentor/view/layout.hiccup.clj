(doctype :html5)
[:html
 [:head
  [:meta {:http-equiv "Content-Type" :content "text/html" :charset "iso-8859-1"}]
  [:title "limelightmentor"]
  (include-css "/stylesheets/limelightmentor.css")
  (include-js "/javascript/limelightmentor.js")]
 [:body
  (eval (:template-body gaeshi.views/*view-context*))
]]