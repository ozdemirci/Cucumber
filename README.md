# Cucumber

(https://medunna.com/) sitesinin testlerini gerçekleştirdiğimiz bu projemizde Cucumber framework ile çalıştık.Bu framework de 
Object Oriented Programming(OOP)  konseptine uyarak Page Object Model(POM) dizayn modelini kullandık.

# Page Dosyası

Pages dosyamızda testini yaptığımız sitenin testlerini gerçekleştireceğimiz elementlerin locatelerini locatorlar yardımıyla oluşturduğumuz 
classlarımız bulunmakta. kullanacağımız locateleri almak için oluşturduğumuz classın adında constructar oluşturuyoruz ve içine PageFactory
classını ve içerisine driverı çağırıp, burada olduğunu belli ettiğimiz this key kullanılır. Locatelerimizi getirmek
için de FindBy notasyonunu kullanırız.

#Test Dosyası

Tests dosyamızda otomasyon kodlarımızı, test raporlarımızı ve failed olan kısımların ekran goruntulerinin alınacagı kodlarımızı olusturulup run 
etmeye hazır hale getirdik.


# Utilities Dosyası

Utilities Package ında projemizi daha anlaşılır hale getirecek classlarımız ve methodlarımız vardır. Bunlar Authentication, ConfigReader,DataBaseUtility, Driver,
ReadText, ReusableMethods, WriteToText vb. dosyalarımız bulunmaktadır.


# Configuration.properties

Properties dosyamızda sürekli kullandığımız variablelarımız Key = value olarak oluşturulmaktadır.
Buradaki bilgileri başka classlara çağırabilmek için utilities Package ından ConfigReader classı çağrılır. Methodlar sayesinde istediğimiz kodlardan bu 
bilgilere ulaşabiliriz.


# Pom.xml

Tüm kod bilgilerimizin bulunduğu bu dosyada kullanmak istediğimiz kodların kütüphanesini dependencies tagının içerisinde bulundurarak güncel bilgilerini sürekli 
olarak bulun durabiliriz. Dependencies sayesinde tüm kodlara erişimi sağlayabiliriz.


# Selenium Testi

Java11 ve Maven projesi oluşturulup Cucumber framework kullanılarak oluşturulmuştur.

<img height="40" width="40" src="https://raw.githubusercontent.com/github/explore/5b3600551e122a3277c2c5368af2ad5725ffa9a1/topics/java/java.png"> <img height="40" width="40" src="https://raw.githubusercontent.com/github/explore/5b3600551e122a3277c2c5368af2ad5725ffa9a1/topics/selenium/selenium.png">
<img src="https://github.com/devicons/devicon/blob/master/icons/cucumber/cucumber-plain.svg" title="Cucumber" alt="Cucumber" width="40" height="40"/> <a href="https://www.api.com" target="_blank" rel="noreferrer"> <img src="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQFpswKqlwex1UtYOHT6cWIVsJ3dQfEg__lFQ&usqp=CAU" alt="api" width="40" height="40"/> </a>
<a href="https://swagger.io/" target="_blank" rel=”noopener”> <img src="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcT2-qHhkU65OgRkaxFh1vRF4ycDfUOznjs7cEu5aXbMwWCYpNUMNPfDcL9Fox0a3_mbtAY&usqp=CAU" alt="swagger" width="40" height="40"/> </a>
<img height="40" width="40" src="https://raw.githubusercontent.com/github/explore/5b3600551e122a3277c2c5368af2ad5725ffa9a1/topics/git/git.png"> <a href="https://www.jetbrains.com/idea/features/" target="_blank" rel=”noopener”> <img src="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQalKFwVDd0H7Xx8HaqWBbUmDRdrgxUoicGBZC0eIzTsww7Sev-ySXJ3in9Udv2R9CR3lo&usqp=CAU" alt="IntelliJ" width="40" height="40"/> </a>
<img width="40" src="https://raw.githubusercontent.com/github/explore/80688e429a7d4ef2fca1e82350fe8e3517d3494d/topics/visual-studio-code/visual-studio-code.png" />
<img src="https://github.com/devicons/devicon/blob/master/icons/jira/jira-original-wordmark.svg" title="Jira" alt="Jira" width="40" height="40"/> <a href="https://postman.com" target="_blank" rel=”noopener”> <img src="https://www.vectorlogo.zone/logos/getpostman/getpostman-icon.svg" alt="postman" width="40" height="40"/> </a>
<img width="40" src="https://raw.githubusercontent.com/github/explore/80688e429a7d4ef2fca1e82350fe8e3517d3494d/topics/postgresql/postgresql.png" /> <img height="40" width="40" src="https://raw.githubusercontent.com/github/explore/5b3600551e122a3277c2c5368af2ad5725ffa9a1/topics/github/github.png">


## GETWELLSOON









