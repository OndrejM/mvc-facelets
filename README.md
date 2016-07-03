# mvc-facelets
The simplest example how to use JavaEE MVC 1.0 (Ozark) with Facelet pages

The application demonstrates how to setup Ozark with JSF Facelets as template engine. 

There are 2 ways to turn on Facelets:
 - using web.xml file (branch master and web-xml)
 - using faces-config.xml file (branch faces-config)

Facelets should be used only to render (X)HTML, without any active JSF elements (don't use h:commandButton, h:form, and the like).

# Run the demo

1. Build and deploy the application on an application server (tested with GlassFish 4.1.1 and Payara 4.1.1.161).
2. Open location [http://localhost:8080/JavaEE_MVC_Facelets/](http://localhost:8080/JavaEE_MVC_Facelets/)
3. Click on either option with JSP or with Facelets
  - JSP version opens [http://localhost:8080/JavaEE_MVC_Facelets/rest/hello?view=JSP](http://localhost:8080/JavaEE_MVC_Facelets/rest/hello?view=JSP)
  - Facelet version opens [http://localhost:8080/JavaEE_MVC_Facelets/rest/hello?view=FACELET](http://localhost:8080/JavaEE_MVC_Facelets/rest/hello?view=FACELET)
