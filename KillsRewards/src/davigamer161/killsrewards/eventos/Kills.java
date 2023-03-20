package davigamer161.killsrewards.eventos;

import java.util.List;

import org.bukkit.ChatColor;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDeathEvent;
import org.bukkit.inventory.ItemStack;

import davigamer161.killsrewards.KillsRewards;
@SuppressWarnings("deprecation")
public class Kills implements Listener{
	private KillsRewards plugin;

    public Kills(KillsRewards plugin){
        this.plugin = plugin;
    }
    @EventHandler
    public void matarPlayers(EntityDeathEvent event){
        Player killer = event.getEntity().getKiller();
        EntityType entidad = event.getEntityType();
        if(killer !=null && killer.getType().equals(EntityType.PLAYER) && entidad.equals(EntityType.PLAYER)){
            FileConfiguration config = plugin.getConfig();
            config.set("Players."+killer.getUniqueId()+".name", killer.getName());
            if(config.contains("Players."+killer.getUniqueId()+".player_kills")){
                int cantidadPlayer = Integer.valueOf(config.getString("Players."+killer.getUniqueId()+".player_kills"));
                config.set("Players."+killer.getUniqueId()+".player_kills", cantidadPlayer+1);
                plugin.saveConfig();
                if(cantidadPlayer == 10-1){
                    FileConfiguration messages = plugin.getMessages();
                    String path = "Config.mensaje-recompensa";
                    if(config.getString(path).equals("true")){
                        if(killer.getInventory().firstEmpty() == -1){
                            List<String> mensaje = messages.getStringList("Messages.mensaje-no-recompensa");
                                    for(int i=0;i<mensaje.size();i++){
                                        String texto = mensaje.get(i);
                                        killer.sendMessage(ChatColor.translateAlternateColorCodes('&', texto));
                                    }    
                                    return;                    
                        }else{
                        ItemStack item = new ItemStack(264,1);
                        killer.getInventory().addItem(item);                                                                    
                        List<String> mensaje = messages.getStringList("Messages.mensaje-recompensa");
                            for(int i=0;i<mensaje.size();i++){
                                String texto = mensaje.get(i);
                                killer.sendMessage(ChatColor.translateAlternateColorCodes('&', texto));
                            }
                        }
                    }else{
                        if(killer.getInventory().firstEmpty() == -1){    
                            return;                    
                        }else{
                        ItemStack item = new ItemStack(264,1);
                        killer.getInventory().addItem(item); 
                        return;                                                                   
                        }
                    }
                    return;
                    }
            }else{
                config.set("Players."+killer.getUniqueId()+".player_kills", 1);
                plugin.saveConfig();
                return;
            }
        }
    }
    @EventHandler
    public void matarBlazes(EntityDeathEvent event){
        Player killer = event.getEntity().getKiller();
        EntityType entidad = event.getEntityType();
        if(killer !=null && killer.getType().equals(EntityType.PLAYER) && entidad.equals(EntityType.BLAZE)){
            FileConfiguration config = plugin.getConfig();
            config.set("Players."+killer.getUniqueId()+".name", killer.getName());
            if(config.contains("Players."+killer.getUniqueId()+".blaze_kills")){
                int cantidadBlaze = Integer.valueOf(config.getString("Players."+killer.getUniqueId()+".blaze_kills"));
                config.set("Players."+killer.getUniqueId()+".blaze_kills", cantidadBlaze+1);
                plugin.saveConfig();
                if(cantidadBlaze == 10-1){
                    FileConfiguration messages = plugin.getMessages();
                    String path = "Config.mensaje-recompensa";
                    if(config.getString(path).equals("true")){
                        if(killer.getInventory().firstEmpty() == -1){
                            List<String> mensaje = messages.getStringList("Messages.mensaje-no-recompensa");
                                    for(int i=0;i<mensaje.size();i++){
                                        String texto = mensaje.get(i);
                                        killer.sendMessage(ChatColor.translateAlternateColorCodes('&', texto));
                                    }    
                                    return;                    
                        }else{
                        ItemStack item = new ItemStack(264,1);
                        killer.getInventory().addItem(item);                                                                    
                        List<String> mensaje = messages.getStringList("Messages.mensaje-recompensa");
                            for(int i=0;i<mensaje.size();i++){
                                String texto = mensaje.get(i);
                                killer.sendMessage(ChatColor.translateAlternateColorCodes('&', texto));
                            }
                        }
                    }else{
                        if(killer.getInventory().firstEmpty() == -1){    
                            return;                    
                        }else{
                        ItemStack item = new ItemStack(264,1);
                        killer.getInventory().addItem(item); 
                        return;                                                                   
                        }
                    }
                    return;
                    }
            }else{
                config.set("Players."+killer.getUniqueId()+".blaze_kills", 1);
                plugin.saveConfig();
                return;
            }
        }
    }
    @EventHandler
    public void matarSpider(EntityDeathEvent event){
        Player killer = event.getEntity().getKiller();
        EntityType entidad = event.getEntityType();
        if(killer !=null && killer.getType().equals(EntityType.PLAYER) && entidad.equals(EntityType.SPIDER)){
            FileConfiguration config = plugin.getConfig();
            config.set("Players."+killer.getUniqueId()+".name", killer.getName());
            if(config.contains("Players."+killer.getUniqueId()+".spider_kills")){
                int cantidadSpider = Integer.valueOf(config.getString("Players."+killer.getUniqueId()+".spider_kills"));
                config.set("Players."+killer.getUniqueId()+".spider_kills", cantidadSpider+1);
                plugin.saveConfig();
                if(cantidadSpider == 10-1){
                    FileConfiguration messages = plugin.getMessages();
                    String path = "Config.mensaje-recompensa";
                    if(config.getString(path).equals("true")){
                        if(killer.getInventory().firstEmpty() == -1){
                            List<String> mensaje = messages.getStringList("Messages.mensaje-no-recompensa");
                                    for(int i=0;i<mensaje.size();i++){
                                        String texto = mensaje.get(i);
                                        killer.sendMessage(ChatColor.translateAlternateColorCodes('&', texto));
                                    }    
                                    return;                    
                        }else{
                        ItemStack item = new ItemStack(264,1);
                        killer.getInventory().addItem(item);                                                                    
                        List<String> mensaje = messages.getStringList("Messages.mensaje-recompensa");
                            for(int i=0;i<mensaje.size();i++){
                                String texto = mensaje.get(i);
                                killer.sendMessage(ChatColor.translateAlternateColorCodes('&', texto));
                            }
                        }
                    }else{
                        if(killer.getInventory().firstEmpty() == -1){    
                            return;                    
                        }else{
                        ItemStack item = new ItemStack(264,1);
                        killer.getInventory().addItem(item); 
                        return;                                                                   
                        }
                    }
                    return;
                    }
            }else{
                config.set("Players."+killer.getUniqueId()+".spider_kills", 1);
                plugin.saveConfig();
                return;
            }
        }
    }
    @EventHandler
    public void matarCaveSpider(EntityDeathEvent event){
        Player killer = event.getEntity().getKiller();
        EntityType entidad = event.getEntityType();
        if(killer !=null && killer.getType().equals(EntityType.PLAYER) && entidad.equals(EntityType.CAVE_SPIDER)){
            FileConfiguration config = plugin.getConfig();
            config.set("Players."+killer.getUniqueId()+".name", killer.getName());
            if(config.contains("Players."+killer.getUniqueId()+".cave_spider_kills")){
                int cantidadCaveSpider = Integer.valueOf(config.getString("Players."+killer.getUniqueId()+".cave_spider_kills"));
                config.set("Players."+killer.getUniqueId()+".cave_spider_kills", cantidadCaveSpider+1);
                plugin.saveConfig();
                if(cantidadCaveSpider == 10-1){
                    FileConfiguration messages = plugin.getMessages();
                    String path = "Config.mensaje-recompensa";
                    if(config.getString(path).equals("true")){
                        if(killer.getInventory().firstEmpty() == -1){
                            List<String> mensaje = messages.getStringList("Messages.mensaje-no-recompensa");
                                    for(int i=0;i<mensaje.size();i++){
                                        String texto = mensaje.get(i);
                                        killer.sendMessage(ChatColor.translateAlternateColorCodes('&', texto));
                                    }    
                                    return;                    
                        }else{
                        ItemStack item = new ItemStack(264,1);
                        killer.getInventory().addItem(item);                                                                    
                        List<String> mensaje = messages.getStringList("Messages.mensaje-recompensa");
                            for(int i=0;i<mensaje.size();i++){
                                String texto = mensaje.get(i);
                                killer.sendMessage(ChatColor.translateAlternateColorCodes('&', texto));
                            }
                        }
                    }else{
                        if(killer.getInventory().firstEmpty() == -1){    
                            return;                    
                        }else{
                        ItemStack item = new ItemStack(264,1);
                        killer.getInventory().addItem(item); 
                        return;                                                                   
                        }
                    }
                    return;
                    }
            }else{
                config.set("Players."+killer.getUniqueId()+".cave_spider_kills", 1);
                plugin.saveConfig();
                return;
            }
        }
    }
    @EventHandler
    public void matarCreepers(EntityDeathEvent event){
        Player killer = event.getEntity().getKiller();
        EntityType entidad = event.getEntityType();
        if(killer !=null && killer.getType().equals(EntityType.PLAYER) && entidad.equals(EntityType.CREEPER)){
            FileConfiguration config = plugin.getConfig();
            config.set("Players."+killer.getUniqueId()+".name", killer.getName());
            if(config.contains("Players."+killer.getUniqueId()+".creeper_kills")){
                int cantidadCreeper = Integer.valueOf(config.getString("Players."+killer.getUniqueId()+".creeper_kills"));
                config.set("Players."+killer.getUniqueId()+".creeper_kills", cantidadCreeper+1);
                plugin.saveConfig();
                if(cantidadCreeper == 10-1){
                    FileConfiguration messages = plugin.getMessages();
                    String path = "Config.mensaje-recompensa";
                    if(config.getString(path).equals("true")){
                        if(killer.getInventory().firstEmpty() == -1){
                            List<String> mensaje = messages.getStringList("Messages.mensaje-no-recompensa");
                                    for(int i=0;i<mensaje.size();i++){
                                        String texto = mensaje.get(i);
                                        killer.sendMessage(ChatColor.translateAlternateColorCodes('&', texto));
                                    }    
                                    return;                    
                        }else{
                        ItemStack item = new ItemStack(264,1);
                        killer.getInventory().addItem(item);                                                                    
                        List<String> mensaje = messages.getStringList("Messages.mensaje-recompensa");
                            for(int i=0;i<mensaje.size();i++){
                                String texto = mensaje.get(i);
                                killer.sendMessage(ChatColor.translateAlternateColorCodes('&', texto));
                            }
                        }
                    }else{
                        if(killer.getInventory().firstEmpty() == -1){    
                            return;                    
                        }else{
                        ItemStack item = new ItemStack(264,1);
                        killer.getInventory().addItem(item); 
                        return;                                                                   
                        }
                    }
                    return;
                    }
            }else{
                config.set("Players."+killer.getUniqueId()+".creeper_kills", 1);
                plugin.saveConfig();
                return;
            }
        }
    }
    @EventHandler
    public void matarEndermans(EntityDeathEvent event){
        Player killer = event.getEntity().getKiller();
        EntityType entidad = event.getEntityType();
        if(killer !=null && killer.getType().equals(EntityType.PLAYER) && entidad.equals(EntityType.ENDERMAN)){
            FileConfiguration config = plugin.getConfig();
            config.set("Players."+killer.getUniqueId()+".name", killer.getName());
            if(config.contains("Players."+killer.getUniqueId()+".enderman_kills")){
                int cantidadEnderman = Integer.valueOf(config.getString("Players."+killer.getUniqueId()+".enderman_kills"));
                config.set("Players."+killer.getUniqueId()+".enderman_kills", cantidadEnderman+1);
                plugin.saveConfig();
                if(cantidadEnderman == 10-1){
                    FileConfiguration messages = plugin.getMessages();
                    String path = "Config.mensaje-recompensa";
                    if(config.getString(path).equals("true")){
                        if(killer.getInventory().firstEmpty() == -1){
                            List<String> mensaje = messages.getStringList("Messages.mensaje-no-recompensa");
                                    for(int i=0;i<mensaje.size();i++){
                                        String texto = mensaje.get(i);
                                        killer.sendMessage(ChatColor.translateAlternateColorCodes('&', texto));
                                    }    
                                    return;                    
                        }else{
                        ItemStack item = new ItemStack(264,1);
                        killer.getInventory().addItem(item);                                                                    
                        List<String> mensaje = messages.getStringList("Messages.mensaje-recompensa");
                            for(int i=0;i<mensaje.size();i++){
                                String texto = mensaje.get(i);
                                killer.sendMessage(ChatColor.translateAlternateColorCodes('&', texto));
                            }
                        }
                    }else{
                        if(killer.getInventory().firstEmpty() == -1){    
                            return;                    
                        }else{
                        ItemStack item = new ItemStack(264,1);
                        killer.getInventory().addItem(item); 
                        return;                                                                   
                        }
                    }
                    return;
                    }
            }else{
                config.set("Players."+killer.getUniqueId()+".enderman_kills", 1);
                plugin.saveConfig();
                return;
            }
        }
    }
    @EventHandler
    public void matarEndermites(EntityDeathEvent event){
        Player killer = event.getEntity().getKiller();
        EntityType entidad = event.getEntityType();
        if(killer !=null && killer.getType().equals(EntityType.PLAYER) && entidad.equals(EntityType.ENDERMITE)){
            FileConfiguration config = plugin.getConfig();
            config.set("Players."+killer.getUniqueId()+".name", killer.getName());
            if(config.contains("Players."+killer.getUniqueId()+".endermite_kills")){
                int cantidadEndermite = Integer.valueOf(config.getString("Players."+killer.getUniqueId()+".endermite_kills"));
                config.set("Players."+killer.getUniqueId()+".endermite_kills", cantidadEndermite+1);
                plugin.saveConfig();
                if(cantidadEndermite == 10-1){
                    FileConfiguration messages = plugin.getMessages();
                    String path = "Config.mensaje-recompensa";
                    if(config.getString(path).equals("true")){
                        if(killer.getInventory().firstEmpty() == -1){
                            List<String> mensaje = messages.getStringList("Messages.mensaje-no-recompensa");
                                    for(int i=0;i<mensaje.size();i++){
                                        String texto = mensaje.get(i);
                                        killer.sendMessage(ChatColor.translateAlternateColorCodes('&', texto));
                                    }    
                                    return;                    
                        }else{
                        ItemStack item = new ItemStack(264,1);
                        killer.getInventory().addItem(item);                                                                    
                        List<String> mensaje = messages.getStringList("Messages.mensaje-recompensa");
                            for(int i=0;i<mensaje.size();i++){
                                String texto = mensaje.get(i);
                                killer.sendMessage(ChatColor.translateAlternateColorCodes('&', texto));
                            }
                        }
                    }else{
                        if(killer.getInventory().firstEmpty() == -1){    
                            return;                    
                        }else{
                        ItemStack item = new ItemStack(264,1);
                        killer.getInventory().addItem(item); 
                        return;                                                                   
                        }
                    }
                    return;
                    }
            }else{
                config.set("Players."+killer.getUniqueId()+".endermite_kills", 1);
                plugin.saveConfig();
                return;
            }
        }
    }
    @EventHandler
    public void matarGhasts(EntityDeathEvent event){
        Player killer = event.getEntity().getKiller();
        EntityType entidad = event.getEntityType();
        if(killer !=null && killer.getType().equals(EntityType.PLAYER) && entidad.equals(EntityType.GHAST)){
            FileConfiguration config = plugin.getConfig();
            config.set("Players."+killer.getUniqueId()+".name", killer.getName());
            if(config.contains("Players."+killer.getUniqueId()+".ghast_kills")){
                int cantidadGhast = Integer.valueOf(config.getString("Players."+killer.getUniqueId()+".ghast_kills"));
                config.set("Players."+killer.getUniqueId()+".ghast_kills", cantidadGhast+1);
                plugin.saveConfig();
                if(cantidadGhast == 10-1){
                    FileConfiguration messages = plugin.getMessages();
                    String path = "Config.mensaje-recompensa";
                    if(config.getString(path).equals("true")){
                        if(killer.getInventory().firstEmpty() == -1){
                            List<String> mensaje = messages.getStringList("Messages.mensaje-no-recompensa");
                                    for(int i=0;i<mensaje.size();i++){
                                        String texto = mensaje.get(i);
                                        killer.sendMessage(ChatColor.translateAlternateColorCodes('&', texto));
                                    }    
                                    return;                    
                        }else{
                        ItemStack item = new ItemStack(264,1);
                        killer.getInventory().addItem(item);                                                                    
                        List<String> mensaje = messages.getStringList("Messages.mensaje-recompensa");
                            for(int i=0;i<mensaje.size();i++){
                                String texto = mensaje.get(i);
                                killer.sendMessage(ChatColor.translateAlternateColorCodes('&', texto));
                            }
                        }
                    }else{
                        if(killer.getInventory().firstEmpty() == -1){    
                            return;                    
                        }else{
                        ItemStack item = new ItemStack(264,1);
                        killer.getInventory().addItem(item); 
                        return;                                                                   
                        }
                    }
                    return;
                    }
            }else{
                config.set("Players."+killer.getUniqueId()+".ghast_kills", 1);
                plugin.saveConfig();
                return;
            }
        }
    }
    @EventHandler
    public void matarGuardians(EntityDeathEvent event){
        Player killer = event.getEntity().getKiller();
        EntityType entidad = event.getEntityType();
        if(killer !=null && killer.getType().equals(EntityType.PLAYER) && entidad.equals(EntityType.GUARDIAN)){
            FileConfiguration config = plugin.getConfig();
            config.set("Players."+killer.getUniqueId()+".name", killer.getName());
            if(config.contains("Players."+killer.getUniqueId()+".guardian_kills")){
                int cantidadGuardian = Integer.valueOf(config.getString("Players."+killer.getUniqueId()+".guardian_kills"));
                config.set("Players."+killer.getUniqueId()+".guardian_kills", cantidadGuardian+1);
                plugin.saveConfig();
                if(cantidadGuardian == 10-1){
                    FileConfiguration messages = plugin.getMessages();
                    String path = "Config.mensaje-recompensa";
                    if(config.getString(path).equals("true")){
                        if(killer.getInventory().firstEmpty() == -1){
                            List<String> mensaje = messages.getStringList("Messages.mensaje-no-recompensa");
                                    for(int i=0;i<mensaje.size();i++){
                                        String texto = mensaje.get(i);
                                        killer.sendMessage(ChatColor.translateAlternateColorCodes('&', texto));
                                    }    
                                    return;                    
                        }else{
                        ItemStack item = new ItemStack(264,1);
                        killer.getInventory().addItem(item);                                                                    
                        List<String> mensaje = messages.getStringList("Messages.mensaje-recompensa");
                            for(int i=0;i<mensaje.size();i++){
                                String texto = mensaje.get(i);
                                killer.sendMessage(ChatColor.translateAlternateColorCodes('&', texto));
                            }
                        }
                    }else{
                        if(killer.getInventory().firstEmpty() == -1){    
                            return;                    
                        }else{
                        ItemStack item = new ItemStack(264,1);
                        killer.getInventory().addItem(item); 
                        return;                                                                   
                        }
                    }
                    return;
                    }
            }else{
                config.set("Players."+killer.getUniqueId()+".guardian_kills", 1);
                plugin.saveConfig();
                return;
            }
        }
    }
    @EventHandler
    public void matarIronGolems(EntityDeathEvent event){
        Player killer = event.getEntity().getKiller();
        EntityType entidad = event.getEntityType();
        if(killer !=null && killer.getType().equals(EntityType.PLAYER) && entidad.equals(EntityType.IRON_GOLEM)){
            FileConfiguration config = plugin.getConfig();
            config.set("Players."+killer.getUniqueId()+".name", killer.getName());
            if(config.contains("Players."+killer.getUniqueId()+".iron_golem_kills")){
                int cantidadIronGolem = Integer.valueOf(config.getString("Players."+killer.getUniqueId()+".iron_golem_kills"));
                config.set("Players."+killer.getUniqueId()+".iron_golem_kills", cantidadIronGolem+1);
                plugin.saveConfig();
                if(cantidadIronGolem == 10-1){
                    FileConfiguration messages = plugin.getMessages();
                    String path = "Config.mensaje-recompensa";
                    if(config.getString(path).equals("true")){
                        if(killer.getInventory().firstEmpty() == -1){
                            List<String> mensaje = messages.getStringList("Messages.mensaje-no-recompensa");
                                    for(int i=0;i<mensaje.size();i++){
                                        String texto = mensaje.get(i);
                                        killer.sendMessage(ChatColor.translateAlternateColorCodes('&', texto));
                                    }    
                                    return;                    
                        }else{
                        ItemStack item = new ItemStack(264,1);
                        killer.getInventory().addItem(item);                                                                    
                        List<String> mensaje = messages.getStringList("Messages.mensaje-recompensa");
                            for(int i=0;i<mensaje.size();i++){
                                String texto = mensaje.get(i);
                                killer.sendMessage(ChatColor.translateAlternateColorCodes('&', texto));
                            }
                        }
                    }else{
                        if(killer.getInventory().firstEmpty() == -1){    
                            return;                    
                        }else{
                        ItemStack item = new ItemStack(264,1);
                        killer.getInventory().addItem(item); 
                        return;                                                                   
                        }
                    }
                    return;
                    }
            }else{
                config.set("Players."+killer.getUniqueId()+".iron_golem_kills", 1);
                plugin.saveConfig();
                return;
            }
        }
    }
    @EventHandler
    public void matarMagmaCubes(EntityDeathEvent event){
        Player killer = event.getEntity().getKiller();
        EntityType entidad = event.getEntityType();
        if(killer !=null && killer.getType().equals(EntityType.PLAYER) && entidad.equals(EntityType.MAGMA_CUBE)){
            FileConfiguration config = plugin.getConfig();
            config.set("Players."+killer.getUniqueId()+".name", killer.getName());
            if(config.contains("Players."+killer.getUniqueId()+".magma_cube_kills")){
                int cantidadMagmaCube = Integer.valueOf(config.getString("Players."+killer.getUniqueId()+".magma_cube_kills"));
                config.set("Players."+killer.getUniqueId()+".magma_cube_kills", cantidadMagmaCube+1);
                plugin.saveConfig();
                if(cantidadMagmaCube == 10-1){
                    FileConfiguration messages = plugin.getMessages();
                    String path = "Config.mensaje-recompensa";
                    if(config.getString(path).equals("true")){
                        if(killer.getInventory().firstEmpty() == -1){
                            List<String> mensaje = messages.getStringList("Messages.mensaje-no-recompensa");
                                    for(int i=0;i<mensaje.size();i++){
                                        String texto = mensaje.get(i);
                                        killer.sendMessage(ChatColor.translateAlternateColorCodes('&', texto));
                                    }    
                                    return;                    
                        }else{
                        ItemStack item = new ItemStack(264,1);
                        killer.getInventory().addItem(item);                                                                    
                        List<String> mensaje = messages.getStringList("Messages.mensaje-recompensa");
                            for(int i=0;i<mensaje.size();i++){
                                String texto = mensaje.get(i);
                                killer.sendMessage(ChatColor.translateAlternateColorCodes('&', texto));
                            }
                        }
                    }else{
                        if(killer.getInventory().firstEmpty() == -1){    
                            return;                    
                        }else{
                        ItemStack item = new ItemStack(264,1);
                        killer.getInventory().addItem(item); 
                        return;                                                                   
                        }
                    }
                    return;
                    }
            }else{
                config.set("Players."+killer.getUniqueId()+".magma_cube_kills", 1);
                plugin.saveConfig();
                return;
            }
        }
    }
    @EventHandler
    public void matarSilverfishs(EntityDeathEvent event){
        Player killer = event.getEntity().getKiller();
        EntityType entidad = event.getEntityType();
        if(killer !=null && killer.getType().equals(EntityType.PLAYER) && entidad.equals(EntityType.SILVERFISH)){
            FileConfiguration config = plugin.getConfig();
            config.set("Players."+killer.getUniqueId()+".name", killer.getName());
            if(config.contains("Players."+killer.getUniqueId()+".silverfish_kills")){
                int cantidadSilverfish = Integer.valueOf(config.getString("Players."+killer.getUniqueId()+".silverfish_kills"));
                config.set("Players."+killer.getUniqueId()+".silverfish_kills", cantidadSilverfish+1);
                plugin.saveConfig();
                if(cantidadSilverfish == 10-1){
                    FileConfiguration messages = plugin.getMessages();
                    String path = "Config.mensaje-recompensa";
                    if(config.getString(path).equals("true")){
                        if(killer.getInventory().firstEmpty() == -1){
                            List<String> mensaje = messages.getStringList("Messages.mensaje-no-recompensa");
                                    for(int i=0;i<mensaje.size();i++){
                                        String texto = mensaje.get(i);
                                        killer.sendMessage(ChatColor.translateAlternateColorCodes('&', texto));
                                    }    
                                    return;                    
                        }else{
                        ItemStack item = new ItemStack(264,1);
                        killer.getInventory().addItem(item);                                                                    
                        List<String> mensaje = messages.getStringList("Messages.mensaje-recompensa");
                            for(int i=0;i<mensaje.size();i++){
                                String texto = mensaje.get(i);
                                killer.sendMessage(ChatColor.translateAlternateColorCodes('&', texto));
                            }
                        }
                    }else{
                        if(killer.getInventory().firstEmpty() == -1){    
                            return;                    
                        }else{
                        ItemStack item = new ItemStack(264,1);
                        killer.getInventory().addItem(item); 
                        return;                                                                   
                        }
                    }
                    return;
                    }
            }else{
                config.set("Players."+killer.getUniqueId()+".silverfish_kills", 1);
                plugin.saveConfig();
                return;
            }
        }
    }
    @EventHandler
    public void matarSkeleton(EntityDeathEvent event){
        Player killer = event.getEntity().getKiller();
        EntityType entidad = event.getEntityType();
        if(killer !=null && killer.getType().equals(EntityType.PLAYER) && entidad.equals(EntityType.SKELETON)){
            FileConfiguration config = plugin.getConfig();
            config.set("Players."+killer.getUniqueId()+".name", killer.getName());
            if(config.contains("Players."+killer.getUniqueId()+".skeleton_kills")){
                int cantidadSkeleton = Integer.valueOf(config.getString("Players."+killer.getUniqueId()+".skeleton_kills"));
                config.set("Players."+killer.getUniqueId()+".skeleton_kills", cantidadSkeleton+1);
                plugin.saveConfig();
                if(cantidadSkeleton == 10-1){
                    FileConfiguration messages = plugin.getMessages();
                    String path = "Config.mensaje-recompensa";
                    if(config.getString(path).equals("true")){
                        if(killer.getInventory().firstEmpty() == -1){
                            List<String> mensaje = messages.getStringList("Messages.mensaje-no-recompensa");
                                    for(int i=0;i<mensaje.size();i++){
                                        String texto = mensaje.get(i);
                                        killer.sendMessage(ChatColor.translateAlternateColorCodes('&', texto));
                                    }    
                                    return;                    
                        }else{
                        ItemStack item = new ItemStack(264,1);
                        killer.getInventory().addItem(item);                                                                    
                        List<String> mensaje = messages.getStringList("Messages.mensaje-recompensa");
                            for(int i=0;i<mensaje.size();i++){
                                String texto = mensaje.get(i);
                                killer.sendMessage(ChatColor.translateAlternateColorCodes('&', texto));
                            }
                        }
                    }else{
                        if(killer.getInventory().firstEmpty() == -1){    
                            return;                    
                        }else{
                        ItemStack item = new ItemStack(264,1);
                        killer.getInventory().addItem(item); 
                        return;                                                                   
                        }
                    }
                    return;
                    }
            }else{
                config.set("Players."+killer.getUniqueId()+".skeleton_kills", 1);
                plugin.saveConfig();
                return;
            }
        }
    }
    @EventHandler
    public void matarSlimes(EntityDeathEvent event){
        Player killer = event.getEntity().getKiller();
        EntityType entidad = event.getEntityType();
        if(killer !=null && killer.getType().equals(EntityType.PLAYER) && entidad.equals(EntityType.SLIME)){
            FileConfiguration config = plugin.getConfig();
            config.set("Players."+killer.getUniqueId()+".name", killer.getName());
            if(config.contains("Players."+killer.getUniqueId()+".slime_kills")){
                int cantidadSlime = Integer.valueOf(config.getString("Players."+killer.getUniqueId()+".slime_kills"));
                config.set("Players."+killer.getUniqueId()+".slime_kills", cantidadSlime+1);
                plugin.saveConfig();
                if(cantidadSlime == 10-1){
                    FileConfiguration messages = plugin.getMessages();
                    String path = "Config.mensaje-recompensa";
                    if(config.getString(path).equals("true")){
                        if(killer.getInventory().firstEmpty() == -1){
                            List<String> mensaje = messages.getStringList("Messages.mensaje-no-recompensa");
                                    for(int i=0;i<mensaje.size();i++){
                                        String texto = mensaje.get(i);
                                        killer.sendMessage(ChatColor.translateAlternateColorCodes('&', texto));
                                    }    
                                    return;                    
                        }else{
                        ItemStack item = new ItemStack(264,1);
                        killer.getInventory().addItem(item);                                                                    
                        List<String> mensaje = messages.getStringList("Messages.mensaje-recompensa");
                            for(int i=0;i<mensaje.size();i++){
                                String texto = mensaje.get(i);
                                killer.sendMessage(ChatColor.translateAlternateColorCodes('&', texto));
                            }
                        }
                    }else{
                        if(killer.getInventory().firstEmpty() == -1){    
                            return;                    
                        }else{
                        ItemStack item = new ItemStack(264,1);
                        killer.getInventory().addItem(item); 
                        return;                                                                   
                        }
                    }
                    return;
                    }
            }else{
                config.set("Players."+killer.getUniqueId()+".slime_kills", 1);
                plugin.saveConfig();
                return;
            }
        }
    }
    @EventHandler
    public void matarWitch(EntityDeathEvent event){
        Player killer = event.getEntity().getKiller();
        EntityType entidad = event.getEntityType();
        if(killer !=null && killer.getType().equals(EntityType.PLAYER) && entidad.equals(EntityType.WITCH)){
            FileConfiguration config = plugin.getConfig();
            config.set("Players."+killer.getUniqueId()+".name", killer.getName());
            if(config.contains("Players."+killer.getUniqueId()+".witch_kills")){
                int cantidadWitch = Integer.valueOf(config.getString("Players."+killer.getUniqueId()+".witch_kills"));
                config.set("Players."+killer.getUniqueId()+".witch_kills", cantidadWitch+1);
                plugin.saveConfig();
                if(cantidadWitch == 10-1){
                    FileConfiguration messages = plugin.getMessages();
                    String path = "Config.mensaje-recompensa";
                    if(config.getString(path).equals("true")){
                        if(killer.getInventory().firstEmpty() == -1){
                            List<String> mensaje = messages.getStringList("Messages.mensaje-no-recompensa");
                                    for(int i=0;i<mensaje.size();i++){
                                        String texto = mensaje.get(i);
                                        killer.sendMessage(ChatColor.translateAlternateColorCodes('&', texto));
                                    }    
                                    return;                    
                        }else{
                        ItemStack item = new ItemStack(264,1);
                        killer.getInventory().addItem(item);                                                                    
                        List<String> mensaje = messages.getStringList("Messages.mensaje-recompensa");
                            for(int i=0;i<mensaje.size();i++){
                                String texto = mensaje.get(i);
                                killer.sendMessage(ChatColor.translateAlternateColorCodes('&', texto));
                            }
                        }
                    }else{
                        if(killer.getInventory().firstEmpty() == -1){    
                            return;                    
                        }else{
                        ItemStack item = new ItemStack(264,1);
                        killer.getInventory().addItem(item); 
                        return;                                                                   
                        }
                    }
                    return;
                    }
            }else{
                config.set("Players."+killer.getUniqueId()+".witch_kills", 1);
                plugin.saveConfig();
                return;
            }
        }
    }
    @EventHandler
    public void matarWithers(EntityDeathEvent event){
        Player killer = event.getEntity().getKiller();
        EntityType entidad = event.getEntityType();
        if(killer !=null && killer.getType().equals(EntityType.PLAYER) && entidad.equals(EntityType.WITHER)){
            FileConfiguration config = plugin.getConfig();            
            config.set("Players."+killer.getUniqueId()+".name", killer.getName());
            if(config.contains("Players."+killer.getUniqueId()+".wither_kills")){
                int cantidadWither = Integer.valueOf(config.getString("Players."+killer.getUniqueId()+".wither_kills"));
                config.set("Players."+killer.getUniqueId()+".wither_kills", cantidadWither+1);
                plugin.saveConfig();
                if(cantidadWither == 10-1){
                    FileConfiguration messages = plugin.getMessages();
                    String path = "Config.mensaje-recompensa";
                    if(config.getString(path).equals("true")){
                        if(killer.getInventory().firstEmpty() == -1){
                            List<String> mensaje = messages.getStringList("Messages.mensaje-no-recompensa");
                                    for(int i=0;i<mensaje.size();i++){
                                        String texto = mensaje.get(i);
                                        killer.sendMessage(ChatColor.translateAlternateColorCodes('&', texto));
                                    }    
                                    return;                    
                        }else{
                        ItemStack item = new ItemStack(264,1);
                        killer.getInventory().addItem(item);                                                                    
                        List<String> mensaje = messages.getStringList("Messages.mensaje-recompensa");
                            for(int i=0;i<mensaje.size();i++){
                                String texto = mensaje.get(i);
                                killer.sendMessage(ChatColor.translateAlternateColorCodes('&', texto));
                            }
                        }
                    }else{
                        if(killer.getInventory().firstEmpty() == -1){    
                            return;                    
                        }else{
                        ItemStack item = new ItemStack(264,1);
                        killer.getInventory().addItem(item); 
                        return;                                                                   
                        }
                    }
                    return;
                    }
            }else{
                config.set("Players."+killer.getUniqueId()+".wither_kills", 1);
                plugin.saveConfig();
                return;
            }
        }
    }
    @EventHandler
    public void matarZombies(EntityDeathEvent event){
        Player killer = event.getEntity().getKiller();
        EntityType entidad = event.getEntityType();
        if(killer !=null && killer.getType().equals(EntityType.PLAYER) && entidad.equals(EntityType.ZOMBIE)){
            FileConfiguration config = plugin.getConfig();
            FileConfiguration messages = plugin.getMessages();
            config.set("Players."+killer.getUniqueId()+".name", killer.getName());
            if(config.contains("Players."+killer.getUniqueId()+".zombie_kills")){                
                int cantidadZombie = Integer.valueOf(config.getString("Players."+killer.getUniqueId()+".zombie_kills"));
                config.set("Players."+killer.getUniqueId()+".zombie_kills", cantidadZombie+1);
                plugin.saveConfig();
                if(cantidadZombie == 10-1){
                    String path = "Config.mensaje-recompensa";
                    if(config.getString(path).equals("true")){
                        if(killer.getInventory().firstEmpty() == -1){
                            List<String> mensaje = messages.getStringList("Messages.mensaje-no-recompensa");
                                    for(int i=0;i<mensaje.size();i++){
                                        String texto = mensaje.get(i);
                                        killer.sendMessage(ChatColor.translateAlternateColorCodes('&', texto));
                                    }    
                                    return;                    
                        }else{
                        ItemStack item = new ItemStack(264,1);
                        killer.getInventory().addItem(item);                                                                    
                        List<String> mensaje = messages.getStringList("Messages.mensaje-recompensa");
                            for(int i=0;i<mensaje.size();i++){
                                String texto = mensaje.get(i);
                                killer.sendMessage(ChatColor.translateAlternateColorCodes('&', texto));
                            }
                        }
                    }else{
                        if(killer.getInventory().firstEmpty() == -1){    
                            return;                    
                        }else{
                        ItemStack item = new ItemStack(264,1);
                        killer.getInventory().addItem(item); 
                        return;                                                                   
                        }
                    }
                    return;
                    }
            }else{
                config.set("Players."+killer.getUniqueId()+".zombie_kills", 1);
                plugin.saveConfig();
                return;
            }
        }
    }
}
