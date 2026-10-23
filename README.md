# OmarZeydi_LSI3_DevAppReparties_TP2
Activité1:
Changement sur la coté client: 

<img width="660" height="525" alt="Capture d&#39;écran 2026-10-24 023617" src="https://github.com/user-attachments/assets/19f417bf-1687-4c94-b29e-c7af61c8338c" />
<img width="539" height="146" alt="Capture d&#39;écran 2026-10-24 023628" src="https://github.com/user-attachments/assets/6f5424f7-bf2c-4bbe-8b1f-0c29c4a5a493" />
Changement sur la coté serveur:
<img width="583" height="530" alt="Capture d&#39;écran 2026-10-24 023639" src="https://github.com/user-attachments/assets/c21cdd0b-430d-4e58-8d87-5b072345f506" />
<img width="456" height="230" alt="Capture d&#39;écran 2026-10-24 023644" src="https://github.com/user-attachments/assets/2833f357-a458-4c69-ba82-453e408ead6b" />

-------Resultat-----------------------

<img width="567" height="494" alt="Capture d&#39;écran 2026-10-24 023714" src="https://github.com/user-attachments/assets/3dd581c6-cc81-41a0-a41f-4fb63ea90ee6" />
<img width="655" height="146" alt="Capture d&#39;écran 2026-10-24 023723" src="https://github.com/user-attachments/assets/2820b650-77f6-423b-8ffd-23147c473185" />
<img width="501" height="125" alt="Capture d&#39;écran 2026-10-24 023702" src="https://github.com/user-attachments/assets/2d29cbec-5453-449c-b650-487a6cd72f1f" />

Activité2:

j'ajoute un package common contenant la class calcul qui implemente serializable et je l'importe dans les deux clases client et serveur:
<img width="284" height="175" alt="Capture d&#39;écran 2026-10-24 043503" src="https://github.com/user-attachments/assets/2d3730da-dc3b-4589-ab14-ef42a14c2a22" />
<img width="684" height="375" alt="Capture d&#39;écran 2026-10-24 043514" src="https://github.com/user-attachments/assets/3345659c-a8a1-494c-87b8-58b3db9f9c96" />
<img width="222" height="54" alt="Capture d&#39;écran 2026-10-24 043528" src="https://github.com/user-attachments/assets/96eb3098-4ec7-4c20-b6e6-d30b08746bde" />

On ajoute ObjectInputstream et ObjectOutputStream dans ce ordre dans les deux clases pour eviter un blocage (freeze) dont chacun attend l'autre.

<img width="626" height="76" alt="Capture d&#39;écran 2026-10-24 043538" src="https://github.com/user-attachments/assets/228e461e-85ed-4a49-91d0-39fd7edeae7b" />

On utilise la classe calcul pour envoyer un object contenant x,y et op

Client:
<img width="674" height="328" alt="Capture d&#39;écran 2026-10-24 043625" src="https://github.com/user-attachments/assets/961ac1f4-89ba-4d5a-91e8-e8416e67a873" />
<img width="617" height="499" alt="Capture d&#39;écran 2026-10-24 043639" src="https://github.com/user-attachments/assets/a2a9279e-df59-44df-af0d-268fa70ef291" />

Serveur:

<img width="445" height="554" alt="Capture d&#39;écran 2026-10-24 043547" src="https://github.com/user-attachments/assets/5e65e07c-048c-42ad-97e1-39ac1c76389e" />
<img width="366" height="235" alt="Capture d&#39;écran 2026-10-24 043553" src="https://github.com/user-attachments/assets/073573d6-f912-4d2c-8d54-54e26d78ae20" />









