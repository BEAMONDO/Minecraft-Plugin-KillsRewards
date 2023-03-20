# KillsRewards
 
-------------
El jugador recibe 1 diamante cuando mata 10 mobs iguales:

[SPOILER="Mobs"]
Jugador

Zombi
Esqueleto
Creeper
Araña
Araña de cueva
Bruja
Blaze
Wither
Slime
Lepisma
Cubo de magma
Golem de hierro
Guardian
Ghast
Endermite
Enderman
[/SPOILER]

VARIABLES
%player%
Nombre del jugador

%plugin%
Nombre del plugin

%version%
Versión del plugin

COMANDOS
/kills
/kills player
/kills <nombre del mob en ingles>
Muestra la cantidad de kills de cada mob

/kr help
Para poder utilizarlo se necesita el permiso
killsrewards.help
Muestra la lista de comandos

/kr version
Para poder utilizarlo se necesita el permiso
killsrewards.admin
Muestra la versión del plugin

/kr reload
Para poder utilizarlo se necesita el permiso
killsrewards.admin
Recarga el plugin

Alias
killsrewards, krewards


Se pueden traducir casi todos los mensajes
[code]
Messages:
  killsrewards-help:
  - '&b<-----------------&aCOMANDOS&b----------------->'
  - '&e/kr version &7o &e/kr ver &7Version'
  - '&e/kr reload &7Recargar plugin'
  - '&e/kills &7Ver todas las Mob Kills'
  - '&e/kills player &7Ver total de Player Kills'
  - '&e/kills <nombre mob en ingles> &7Mob Kills del mob elejido'
  killsrewards-reload:
  - '&aEl plugin &c[&e%plugin%&c] &ase ha recargado correctamente'
  killsrewards-version:
  - '&c[&e%plugin%&c] &aVersion &e%version%'
  killsrewards-noperm:
  - '&cNo tienes permiso para ejecutar ese comando'
  mensaje-recompensa:
  - '&aHas recibido la recompensa'
  mensaje-no-recompensa:
  - '&cNo tienes espacio en el inventario, no has recibido la recompensa'
[/code]

Se pueden activar o desactivar los mensajes desde la configuracion:
[code]
Config:
  mensaje-help: true
  mensaje-reload: true
  mensaje-version: true
  mensaje-recompensa: true
[/code]
