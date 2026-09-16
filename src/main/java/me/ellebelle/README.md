* skapa en klass Counter som sparar en integer i ett fält
* Lägg till metoder för att:
- - öka värdet med 1
- - minska värdet med 1
- - hämta värdet

* Counter klassen ska hålla reda på hur många Counter
  objekt som har skapats,, alltså hur många gånger har vi 
  kört new på den. 
  Jag behöver en counter för varje Counter-objekt.
* Om jag använder static så hör inte den till klassen
  så där för kan jag lägga till en statisk int instances = 0; 
  variabel som bara finns i ett exempler så jag kan 
  använda den till att hålla ordning på hur många objekr
  jag har skapat. 
* Denna instances-variabel behöver räknas upp nu och det görs den i
  konstruktorn för där vet jag att när konstruktorn
  körs så vet jag att objektet skapas.



* Skapa en klass som kan lagra många värden.
* Lägg till metoder för att:
- stoppa in ett värde sist
- hämta värdet
- ta bort sista värdet
- ta bort ett värde på index