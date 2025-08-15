After 5 years, this is my first Full Stack application which I produced and hosted after battling a bit with Java, Vue.js and hosting platform settings.


The purpose of this application is to provide one of our clients with an easier method to create HTML webforms after creating forms inside ExpertSender. Forms there created produce very simplified code, custom fields of the system are created with <input type="text"> in all cases. However, for fields of type Single Select, it would be useful to be created with <input type="radio">, or else, by using the <select> tag for single selection (without attribute "multiple").


This application simplifies the job of creating webforms inside ExpertSender because it is no longer necessary to create every single needed field inside the webform wizard, only the system field Email is enough. After generating the HTML inside the plataform, some parameters can be taken (business unit id, webform id, sender domain, server and api key), and these ones are used in the SPA application which, in turn, calls the Spring Boot API, that eventually, consumes the ExpertSender API endPoint for getting custom fields (https://sites.google.com/expertsender.com/api-documentation-v2/methods/custom-field/get-custom-fields-list?authuser=0). Only the fields set to visible are fetched, and they are brought to the SPA with their settings (field type, name, etc.), which then creates the webform with all those fields, together with more 3 system fields (Email, Firstname and Lastname).


In a practical manner, for Single Select fields, the user can alternate between <input type="radio"> and <select> tag and check to see what fits better.


By the end of the process, the user can delete the unneed custom fields since all are brought, and either copy the code or download an HTML file containing the code.


Taking into account that the client told us he is going to create many webforms, this application will be helpful, and might just as well be used by any other person interested in saving time writing HTML code.


All this code has been produced by Chat GPT 5. My role was to edit, tweak, add, remove, test, compile, deploy, host, configure, etc. In the end, I saw that I concluded everything in 2 days, and this was fabulous!
