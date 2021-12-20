# Projekt December 2021

Projektet omhandler udvikling af program til track 'n' trace.
På nuværende tidspunkt er der lavet til at man kan skrive information ind til databasen via statisk input i koden.
Dette kan bruges til følgende oprettelser:
- Kunde
- Pakke
- En opdatering

Man kan også søge på følgende emner:
- Kunde, dette er på forskellige informationer (id, fornavn, efternavn, mail, telefon, adresse, land, postnummer, samt noter)
- Pakke, dette er på følgende informationer (id, pakkenavn, pakke vægt, sendt dato og tracking id)
- Placering, dette er på følgende informationer (id og beskrivelse)
- Man kan også få al information omkring kunder, pakker og placering udskrevet gennem flere arraylister.

Søgningerne bliver udskrevet i konsollen.

Det er muligt at redigere i forskellige ting gennem søgninger på id.
Dette kan gøres på forskellige elementer (se punkt 24-38 i switch).

Switch er blevet etableret i koden med scanner input.
Følgende funktioner kan køres på nuværende tidspunkt:
1. Opretter bruger med statiske værdier
2. Opretter pakke med statiske værdier
3. Opretter en placering med statiske værdier
4. Søger efter statisk kunde id
5. Søger efter statisk pakke id
6. Søger efter statisk placerings id
7. Sletter kunde angived med statisk id
8. Sletter pakke angived med statisk id
9. Sletter placering angived med statisk id
10. Udskriver første person i CreateUser tabel med statisk angivet fornavn
11. Udskriver første person i CreateUser tabel med statisk angivet efternavn
12. Udskriver første person i CreateUser tabel med statisk angivet mail
13. Udskriver første person i CreateUser tabel med statisk angivet telefon nr
14. Udskriver første person i CreateUser tabel med statisk angivet adresse
15. Udskriver første person i CreateUser tabel med statisk angivet postnummer
16. Udskriver første person i CreateUser tabel med statisk angivet land
17. Udskriver første person i CreateUser tabel med statisk angivet note
18. Udskriver første pakke i CreatePackage tabel med statisk angivet navn
19. Udskriver første pakke i CreatePackage tabel med statisk angivet vægt
20. Udskriver første pakke i CreatePackage tabel med statisk angivet forsendelsesdato
21. Udskriver første pakke i CreatePackage tabel med statisk angivet tracking id
22. Udskriver første placering i CreatePlacement tabel med statisk angivet id
23. Udskriver første placering i CreatePlacement tabel med statisk angivet beskrivelse
24. Giver mulighed for at skifte kunde fornavn ved at søge på id gennem scanner
25. Giver mulighed for at skifte kunde efternavn ved at søge på id gennem scanner
26. Giver mulighed for at skifte kunde mail ved at søge på id gennem scanner
27. Giver mulighed for at skifte kunde telefon nr ved at søge på id gennem scanner
28. Giver mulighed for at skifte kunde adresse ved at søge på id gennem scanner
29. Giver mulighed for at skifte kunde postnummer ved at søge på id gennem scanner
30. Giver mulighed for at skifte kunde land ved at søge på id gennem scanner
31. Giver mulighed for at skifte kunde note ved at søge på id gennem scanner
32. Giver mulighed for at skifte en pakkes id ved at søge på id gennem scanner
33. Giver mulighed for at skifte en pakkes navn ved at søge på id gennem scanner
34. Giver mulighed for at skifte en pakkes vægt ved at søge på id gennem scanner
35. Giver mulighed for at skifte en pakkes afsendelsesdato ved at søge på id gennem scanner
36. Giver mulighed for at skifte en pakkes tracking id ved at søge på id gennem scanner
37. Giver mulighed for at skifte en placerings id ved at søge på id gennem scanner
38. Giver mulighed for at skifte en placerings beskrivelse ved at søge på id gennem scanner
39. Udskriver alle users i tabellen allekunder gennem arraylist
40. Udskriver alle users i tabellen allepakker gennem arraylist
41. Udskriver alle users i tabellen alleplaceringer gennem arraylist


Et forslag til menu og oprettelse af bruger kunne se ud på følgende måde:
![decemberGuiCreateUser](https://user-images.githubusercontent.com/89969218/146743427-81b006e0-dce5-48de-bfb7-652e46fcdebe.PNG)

Hvis man trykker på find pakke så kommer denne muligheder op:

Man indtaster et tracking nummer her også får man en af de 2 nedenstående billeder frem.
![Indtast trackingnummer](https://user-images.githubusercontent.com/89455430/146743609-d357dfab-6c94-450b-b0c6-de3faa336a2c.PNG)

I tilfælde af at pakken ikke finde i systemet, fx. hvis man har skrevet noget forkert, er følgende en mulighed:
![Pakke ikke fundet](https://user-images.githubusercontent.com/89455430/146743623-9594d15e-5faa-40d5-9067-0629382ef115.PNG)

Dette vil være hvad der sker når en pakke er fundet. Den giver et overblik over processen pakken har været i og dens nuværende placering/situation.

![Sporing af pakke](https://user-images.githubusercontent.com/89455430/146743631-5f9ce715-c873-4891-89c8-5f545f478c70.PNG)


Fremtidige muligheder:
- Oprettelse af kunde via scanner input.
- Oprettelse af pakke via scanner input.
- Redigering af pakke placering (update) via scanner input.
- Søgning på kunder via scanner input.
- Søgning på pakker via scanner input.
- - Denne kan videreudvikles til også at udskrive opdateringer på pakken. Dette skal være alt information der ligger omkring den pakke (id) i update tabellen.
- Poteltielt inførsel af simpel GUI.
- - Potentielt inførsel af fuld GUI (komplet program).
