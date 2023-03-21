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
        FileConfiguration config = plugin.getConfig();
        FileConfiguration messages = plugin.getMessages();
        Player killer = event.getEntity().getKiller();
        EntityType entidad = event.getEntityType();
        if(killer !=null && killer.getType().equals(EntityType.PLAYER) && entidad.equals(EntityType.PLAYER)){            
            config.set("Players."+killer.getUniqueId()+".name", killer.getName());
            if(config.contains("Players."+killer.getUniqueId()+".player_kills")){  
                int reward1 = Integer.valueOf(config.getString("Config.recompensa-mobs.first-reward-number-of-kills"));                
                int id1 = Integer.valueOf(config.getString("Config.recompensa-mobs.first-reward-item-id"));
                int amount1 = Integer.valueOf(config.getString("Config.recompensa-mobs.first-reward-item-amount"));
                int reward2 = Integer.valueOf(config.getString("Config.recompensa-mobs.second-reward-number-of-kills"));
                int id2 = Integer.valueOf(config.getString("Config.recompensa-mobs.second-reward-item-id"));
                int amount2 = Integer.valueOf(config.getString("Config.recompensa-mobs.second-reward-item-amount"));
                int cantidadPlayer = Integer.valueOf(config.getString("Players."+killer.getUniqueId()+".player_kills"));
                config.set("Players."+killer.getUniqueId()+".player_kills", cantidadPlayer+1);
                plugin.saveConfig();
                if(cantidadPlayer == reward1-1){
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
						ItemStack item = new ItemStack(id1,amount1);
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
                        ItemStack item = new ItemStack(id1,amount1);
                        killer.getInventory().addItem(item); 
                        return;                                                                   
                        }
                    }
                    return;
                    }else if(cantidadPlayer == reward2-1){
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
                            ItemStack item = new ItemStack(id2,amount2);
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
                            ItemStack item = new ItemStack(id2,amount2);
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
        FileConfiguration config = plugin.getConfig();
        FileConfiguration messages = plugin.getMessages();
        Player killer = event.getEntity().getKiller();
        EntityType entidad = event.getEntityType();
        if(killer !=null && killer.getType().equals(EntityType.PLAYER) && entidad.equals(EntityType.BLAZE)){            
            config.set("Players."+killer.getUniqueId()+".name", killer.getName());
            if(config.contains("Players."+killer.getUniqueId()+".blaze_kills")){  
                int reward1 = Integer.valueOf(config.getString("Config.recompensa-mobs.first-reward-number-of-kills"));                
                int id1 = Integer.valueOf(config.getString("Config.recompensa-mobs.first-reward-item-id"));
                int amount1 = Integer.valueOf(config.getString("Config.recompensa-mobs.first-reward-item-amount"));
                int reward2 = Integer.valueOf(config.getString("Config.recompensa-mobs.second-reward-number-of-kills"));
                int id2 = Integer.valueOf(config.getString("Config.recompensa-mobs.second-reward-item-id"));
                int amount2 = Integer.valueOf(config.getString("Config.recompensa-mobs.second-reward-item-amount"));
                int cantidadBlaze = Integer.valueOf(config.getString("Players."+killer.getUniqueId()+".blaze_kills"));
                config.set("Players."+killer.getUniqueId()+".blaze_kills", cantidadBlaze+1);
                plugin.saveConfig();
                if(cantidadBlaze == reward1-1){
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
                        ItemStack item = new ItemStack(id1,amount1);
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
                        ItemStack item = new ItemStack(id1,amount1);
                        killer.getInventory().addItem(item); 
                        return;                                                                   
                        }
                    }
                    return;
                    }else if(cantidadBlaze == reward2-1){
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
                            ItemStack item = new ItemStack(id2,amount2);
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
                            ItemStack item = new ItemStack(id2,amount2);
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
    public void matarSpiders(EntityDeathEvent event){
        FileConfiguration config = plugin.getConfig();
        FileConfiguration messages = plugin.getMessages();
        Player killer = event.getEntity().getKiller();
        EntityType entidad = event.getEntityType();
        if(killer !=null && killer.getType().equals(EntityType.PLAYER) && entidad.equals(EntityType.SPIDER)){            
            config.set("Players."+killer.getUniqueId()+".name", killer.getName());
            if(config.contains("Players."+killer.getUniqueId()+".spider_kills")){  
                int reward1 = Integer.valueOf(config.getString("Config.recompensa-mobs.first-reward-number-of-kills"));                
                int id1 = Integer.valueOf(config.getString("Config.recompensa-mobs.first-reward-item-id"));
                int amount1 = Integer.valueOf(config.getString("Config.recompensa-mobs.first-reward-item-amount"));
                int reward2 = Integer.valueOf(config.getString("Config.recompensa-mobs.second-reward-number-of-kills"));
                int id2 = Integer.valueOf(config.getString("Config.recompensa-mobs.second-reward-item-id"));
                int amount2 = Integer.valueOf(config.getString("Config.recompensa-mobs.second-reward-item-amount"));
                int cantidadSpider = Integer.valueOf(config.getString("Players."+killer.getUniqueId()+".spider_kills"));
                config.set("Players."+killer.getUniqueId()+".spider_kills", cantidadSpider+1);
                plugin.saveConfig();
                if(cantidadSpider == reward1-1){
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
                        ItemStack item = new ItemStack(id1,amount1);
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
                        ItemStack item = new ItemStack(id1,amount1);
                        killer.getInventory().addItem(item); 
                        return;                                                                   
                        }
                    }
                    return;
                    }else if(cantidadSpider == reward2-1){
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
                            ItemStack item = new ItemStack(id2,amount2);
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
                            ItemStack item = new ItemStack(id2,amount2);
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
    public void matarCaveSpiders(EntityDeathEvent event){
        FileConfiguration config = plugin.getConfig();
        FileConfiguration messages = plugin.getMessages();
        Player killer = event.getEntity().getKiller();
        EntityType entidad = event.getEntityType();
        if(killer !=null && killer.getType().equals(EntityType.PLAYER) && entidad.equals(EntityType.CAVE_SPIDER)){            
            config.set("Players."+killer.getUniqueId()+".name", killer.getName());
            if(config.contains("Players."+killer.getUniqueId()+".cave_spider_kills")){  
                int reward1 = Integer.valueOf(config.getString("Config.recompensa-mobs.first-reward-number-of-kills"));                
                int id1 = Integer.valueOf(config.getString("Config.recompensa-mobs.first-reward-item-id"));
                int amount1 = Integer.valueOf(config.getString("Config.recompensa-mobs.first-reward-item-amount"));
                int reward2 = Integer.valueOf(config.getString("Config.recompensa-mobs.second-reward-number-of-kills"));
                int id2 = Integer.valueOf(config.getString("Config.recompensa-mobs.second-reward-item-id"));
                int amount2 = Integer.valueOf(config.getString("Config.recompensa-mobs.second-reward-item-amount"));
                int cantidadCaveSpider = Integer.valueOf(config.getString("Players."+killer.getUniqueId()+".cave_spider_kills"));
                config.set("Players."+killer.getUniqueId()+".cave_spider_kills", cantidadCaveSpider+1);
                plugin.saveConfig();
                if(cantidadCaveSpider == reward1-1){
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
                        ItemStack item = new ItemStack(id1,amount1);
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
                        ItemStack item = new ItemStack(id1,amount1);
                        killer.getInventory().addItem(item); 
                        return;                                                                   
                        }
                    }
                    return;
                    }else if(cantidadCaveSpider == reward2-1){
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
                            ItemStack item = new ItemStack(id2,amount2);
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
                            ItemStack item = new ItemStack(id2,amount2);
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
        FileConfiguration config = plugin.getConfig();
        FileConfiguration messages = plugin.getMessages();
        Player killer = event.getEntity().getKiller();
        EntityType entidad = event.getEntityType();
        if(killer !=null && killer.getType().equals(EntityType.PLAYER) && entidad.equals(EntityType.CREEPER)){            
            config.set("Players."+killer.getUniqueId()+".name", killer.getName());
            if(config.contains("Players."+killer.getUniqueId()+".creeper_kills")){  
                int reward1 = Integer.valueOf(config.getString("Config.recompensa-mobs.first-reward-number-of-kills"));                
                int id1 = Integer.valueOf(config.getString("Config.recompensa-mobs.first-reward-item-id"));
                int amount1 = Integer.valueOf(config.getString("Config.recompensa-mobs.first-reward-item-amount"));
                int reward2 = Integer.valueOf(config.getString("Config.recompensa-mobs.second-reward-number-of-kills"));
                int id2 = Integer.valueOf(config.getString("Config.recompensa-mobs.second-reward-item-id"));
                int amount2 = Integer.valueOf(config.getString("Config.recompensa-mobs.second-reward-item-amount"));
                int cantidadCreeper = Integer.valueOf(config.getString("Players."+killer.getUniqueId()+".creeper_kills"));
                config.set("Players."+killer.getUniqueId()+".creeper_kills", cantidadCreeper+1);
                plugin.saveConfig();
                if(cantidadCreeper == reward1-1){
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
                        ItemStack item = new ItemStack(id1,amount1);
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
                        ItemStack item = new ItemStack(id1,amount1);
                        killer.getInventory().addItem(item); 
                        return;                                                                   
                        }
                    }
                    return;
                    }else if(cantidadCreeper == reward2-1){
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
                            ItemStack item = new ItemStack(id2,amount2);
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
                            ItemStack item = new ItemStack(id2,amount2);
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
        FileConfiguration config = plugin.getConfig();
        FileConfiguration messages = plugin.getMessages();
        Player killer = event.getEntity().getKiller();
        EntityType entidad = event.getEntityType();
        if(killer !=null && killer.getType().equals(EntityType.PLAYER) && entidad.equals(EntityType.ENDERMAN)){            
            config.set("Players."+killer.getUniqueId()+".name", killer.getName());
            if(config.contains("Players."+killer.getUniqueId()+".enderman_kills")){  
                int reward1 = Integer.valueOf(config.getString("Config.recompensa-mobs.first-reward-number-of-kills"));                
                int id1 = Integer.valueOf(config.getString("Config.recompensa-mobs.first-reward-item-id"));
                int amount1 = Integer.valueOf(config.getString("Config.recompensa-mobs.first-reward-item-amount"));
                int reward2 = Integer.valueOf(config.getString("Config.recompensa-mobs.second-reward-number-of-kills"));
                int id2 = Integer.valueOf(config.getString("Config.recompensa-mobs.second-reward-item-id"));
                int amount2 = Integer.valueOf(config.getString("Config.recompensa-mobs.second-reward-item-amount"));
                int cantidadEnderman = Integer.valueOf(config.getString("Players."+killer.getUniqueId()+".enderman_kills"));
                config.set("Players."+killer.getUniqueId()+".enderman_kills", cantidadEnderman+1);
                plugin.saveConfig();
                if(cantidadEnderman == reward1-1){
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
                        ItemStack item = new ItemStack(id1,amount1);
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
                        ItemStack item = new ItemStack(id1,amount1);
                        killer.getInventory().addItem(item); 
                        return;                                                                   
                        }
                    }
                    return;
                    }else if(cantidadEnderman == reward2-1){
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
                            ItemStack item = new ItemStack(id2,amount2);
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
                            ItemStack item = new ItemStack(id2,amount2);
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
        FileConfiguration config = plugin.getConfig();
        FileConfiguration messages = plugin.getMessages();
        Player killer = event.getEntity().getKiller();
        EntityType entidad = event.getEntityType();
        if(killer !=null && killer.getType().equals(EntityType.PLAYER) && entidad.equals(EntityType.ENDERMITE)){            
            config.set("Players."+killer.getUniqueId()+".name", killer.getName());
            if(config.contains("Players."+killer.getUniqueId()+".endermite_kills")){  
                int reward1 = Integer.valueOf(config.getString("Config.recompensa-mobs.first-reward-number-of-kills"));                
                int id1 = Integer.valueOf(config.getString("Config.recompensa-mobs.first-reward-item-id"));
                int amount1 = Integer.valueOf(config.getString("Config.recompensa-mobs.first-reward-item-amount"));
                int reward2 = Integer.valueOf(config.getString("Config.recompensa-mobs.second-reward-number-of-kills"));
                int id2 = Integer.valueOf(config.getString("Config.recompensa-mobs.second-reward-item-id"));
                int amount2 = Integer.valueOf(config.getString("Config.recompensa-mobs.second-reward-item-amount"));
                int cantidadEndermite = Integer.valueOf(config.getString("Players."+killer.getUniqueId()+".endermite_kills"));
                config.set("Players."+killer.getUniqueId()+".endermite_kills", cantidadEndermite+1);
                plugin.saveConfig();
                if(cantidadEndermite == reward1-1){
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
                        ItemStack item = new ItemStack(id1,amount1);
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
                        ItemStack item = new ItemStack(id1,amount1);
                        killer.getInventory().addItem(item); 
                        return;                                                                   
                        }
                    }
                    return;
                    }else if(cantidadEndermite == reward2-1){
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
                            ItemStack item = new ItemStack(id2,amount2);
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
                            ItemStack item = new ItemStack(id2,amount2);
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
        FileConfiguration config = plugin.getConfig();
        FileConfiguration messages = plugin.getMessages();
        Player killer = event.getEntity().getKiller();
        EntityType entidad = event.getEntityType();
        if(killer !=null && killer.getType().equals(EntityType.PLAYER) && entidad.equals(EntityType.GHAST)){            
            config.set("Players."+killer.getUniqueId()+".name", killer.getName());
            if(config.contains("Players."+killer.getUniqueId()+".ghast_kills")){  
                int reward1 = Integer.valueOf(config.getString("Config.recompensa-mobs.first-reward-number-of-kills"));                
                int id1 = Integer.valueOf(config.getString("Config.recompensa-mobs.first-reward-item-id"));
                int amount1 = Integer.valueOf(config.getString("Config.recompensa-mobs.first-reward-item-amount"));
                int reward2 = Integer.valueOf(config.getString("Config.recompensa-mobs.second-reward-number-of-kills"));
                int id2 = Integer.valueOf(config.getString("Config.recompensa-mobs.second-reward-item-id"));
                int amount2 = Integer.valueOf(config.getString("Config.recompensa-mobs.second-reward-item-amount"));
                int cantidadGhast = Integer.valueOf(config.getString("Players."+killer.getUniqueId()+".ghast_kills"));
                config.set("Players."+killer.getUniqueId()+".ghast_kills", cantidadGhast+1);
                plugin.saveConfig();
                if(cantidadGhast == reward1-1){
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
                        ItemStack item = new ItemStack(id1,amount1);
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
                        ItemStack item = new ItemStack(id1,amount1);
                        killer.getInventory().addItem(item); 
                        return;                                                                   
                        }
                    }
                    return;
                    }else if(cantidadGhast == reward2-1){
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
                            ItemStack item = new ItemStack(id2,amount2);
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
                            ItemStack item = new ItemStack(id2,amount2);
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
        FileConfiguration config = plugin.getConfig();
        FileConfiguration messages = plugin.getMessages();
        Player killer = event.getEntity().getKiller();
        EntityType entidad = event.getEntityType();
        if(killer !=null && killer.getType().equals(EntityType.PLAYER) && entidad.equals(EntityType.GUARDIAN)){            
            config.set("Players."+killer.getUniqueId()+".name", killer.getName());
            if(config.contains("Players."+killer.getUniqueId()+".guardian_kills")){  
                int reward1 = Integer.valueOf(config.getString("Config.recompensa-mobs.first-reward-number-of-kills"));                
                int id1 = Integer.valueOf(config.getString("Config.recompensa-mobs.first-reward-item-id"));
                int amount1 = Integer.valueOf(config.getString("Config.recompensa-mobs.first-reward-item-amount"));
                int reward2 = Integer.valueOf(config.getString("Config.recompensa-mobs.second-reward-number-of-kills"));
                int id2 = Integer.valueOf(config.getString("Config.recompensa-mobs.second-reward-item-id"));
                int amount2 = Integer.valueOf(config.getString("Config.recompensa-mobs.second-reward-item-amount"));
                int cantidadGuardian = Integer.valueOf(config.getString("Players."+killer.getUniqueId()+".guardian_kills"));
                config.set("Players."+killer.getUniqueId()+".guardian_kills", cantidadGuardian+1);
                plugin.saveConfig();
                if(cantidadGuardian == reward1-1){
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
                        ItemStack item = new ItemStack(id1,amount1);
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
                        ItemStack item = new ItemStack(id1,amount1);
                        killer.getInventory().addItem(item); 
                        return;                                                                   
                        }
                    }
                    return;
                    }else if(cantidadGuardian == reward2-1){
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
                            ItemStack item = new ItemStack(id2,amount2);
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
                            ItemStack item = new ItemStack(id2,amount2);
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
        FileConfiguration config = plugin.getConfig();
        FileConfiguration messages = plugin.getMessages();
        Player killer = event.getEntity().getKiller();
        EntityType entidad = event.getEntityType();
        if(killer !=null && killer.getType().equals(EntityType.PLAYER) && entidad.equals(EntityType.IRON_GOLEM)){            
            config.set("Players."+killer.getUniqueId()+".name", killer.getName());
            if(config.contains("Players."+killer.getUniqueId()+".iron_golem_kills")){  
                int reward1 = Integer.valueOf(config.getString("Config.recompensa-mobs.first-reward-number-of-kills"));                
                int id1 = Integer.valueOf(config.getString("Config.recompensa-mobs.first-reward-item-id"));
                int amount1 = Integer.valueOf(config.getString("Config.recompensa-mobs.first-reward-item-amount"));
                int reward2 = Integer.valueOf(config.getString("Config.recompensa-mobs.second-reward-number-of-kills"));
                int id2 = Integer.valueOf(config.getString("Config.recompensa-mobs.second-reward-item-id"));
                int amount2 = Integer.valueOf(config.getString("Config.recompensa-mobs.second-reward-item-amount"));
                int cantidadIronGolem = Integer.valueOf(config.getString("Players."+killer.getUniqueId()+".iron_golem_kills"));
                config.set("Players."+killer.getUniqueId()+".iron_golem_kills", cantidadIronGolem+1);
                plugin.saveConfig();
                if(cantidadIronGolem == reward1-1){
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
                        ItemStack item = new ItemStack(id1,amount1);
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
                        ItemStack item = new ItemStack(id1,amount1);
                        killer.getInventory().addItem(item); 
                        return;                                                                   
                        }
                    }
                    return;
                    }else if(cantidadIronGolem == reward2-1){
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
                            ItemStack item = new ItemStack(id2,amount2);
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
                            ItemStack item = new ItemStack(id2,amount2);
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
        FileConfiguration config = plugin.getConfig();
        FileConfiguration messages = plugin.getMessages();
        Player killer = event.getEntity().getKiller();
        EntityType entidad = event.getEntityType();
        if(killer !=null && killer.getType().equals(EntityType.PLAYER) && entidad.equals(EntityType.MAGMA_CUBE)){            
            config.set("Players."+killer.getUniqueId()+".name", killer.getName());
            if(config.contains("Players."+killer.getUniqueId()+".magma_cube_kills")){  
                int reward1 = Integer.valueOf(config.getString("Config.recompensa-mobs.first-reward-number-of-kills"));                
                int id1 = Integer.valueOf(config.getString("Config.recompensa-mobs.first-reward-item-id"));
                int amount1 = Integer.valueOf(config.getString("Config.recompensa-mobs.first-reward-item-amount"));
                int reward2 = Integer.valueOf(config.getString("Config.recompensa-mobs.second-reward-number-of-kills"));
                int id2 = Integer.valueOf(config.getString("Config.recompensa-mobs.second-reward-item-id"));
                int amount2 = Integer.valueOf(config.getString("Config.recompensa-mobs.second-reward-item-amount"));
                int cantidadMagmaCube = Integer.valueOf(config.getString("Players."+killer.getUniqueId()+".magma_cube_kills"));
                config.set("Players."+killer.getUniqueId()+".magma_cube_kills", cantidadMagmaCube+1);
                plugin.saveConfig();
                if(cantidadMagmaCube == reward1-1){
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
                        ItemStack item = new ItemStack(id1,amount1);
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
                        ItemStack item = new ItemStack(id1,amount1);
                        killer.getInventory().addItem(item); 
                        return;                                                                   
                        }
                    }
                    return;
                    }else if(cantidadMagmaCube == reward2-1){
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
                            ItemStack item = new ItemStack(id2,amount2);
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
                            ItemStack item = new ItemStack(id2,amount2);
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
    public void matarSilverFishs(EntityDeathEvent event){
        FileConfiguration config = plugin.getConfig();
        FileConfiguration messages = plugin.getMessages();
        Player killer = event.getEntity().getKiller();
        EntityType entidad = event.getEntityType();
        if(killer !=null && killer.getType().equals(EntityType.PLAYER) && entidad.equals(EntityType.SILVERFISH)){            
            config.set("Players."+killer.getUniqueId()+".name", killer.getName());
            if(config.contains("Players."+killer.getUniqueId()+".silverfish_kills")){  
                int reward1 = Integer.valueOf(config.getString("Config.recompensa-mobs.first-reward-number-of-kills"));                
                int id1 = Integer.valueOf(config.getString("Config.recompensa-mobs.first-reward-item-id"));
                int amount1 = Integer.valueOf(config.getString("Config.recompensa-mobs.first-reward-item-amount"));
                int reward2 = Integer.valueOf(config.getString("Config.recompensa-mobs.second-reward-number-of-kills"));
                int id2 = Integer.valueOf(config.getString("Config.recompensa-mobs.second-reward-item-id"));
                int amount2 = Integer.valueOf(config.getString("Config.recompensa-mobs.second-reward-item-amount"));
                int cantidadSilverFish = Integer.valueOf(config.getString("Players."+killer.getUniqueId()+".silverfish_kills"));
                config.set("Players."+killer.getUniqueId()+".silverfish_kills", cantidadSilverFish+1);
                plugin.saveConfig();
                if(cantidadSilverFish == reward1-1){
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
                        ItemStack item = new ItemStack(id1,amount1);
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
                        ItemStack item = new ItemStack(id1,amount1);
                        killer.getInventory().addItem(item); 
                        return;                                                                   
                        }
                    }
                    return;
                    }else if(cantidadSilverFish == reward2-1){
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
                            ItemStack item = new ItemStack(id2,amount2);
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
                            ItemStack item = new ItemStack(id2,amount2);
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
    public void matarSkeletons(EntityDeathEvent event){
        FileConfiguration config = plugin.getConfig();
        FileConfiguration messages = plugin.getMessages();
        Player killer = event.getEntity().getKiller();
        EntityType entidad = event.getEntityType();
        if(killer !=null && killer.getType().equals(EntityType.PLAYER) && entidad.equals(EntityType.SKELETON)){            
            config.set("Players."+killer.getUniqueId()+".name", killer.getName());
            if(config.contains("Players."+killer.getUniqueId()+".skeleton_kills")){  
                int reward1 = Integer.valueOf(config.getString("Config.recompensa-mobs.first-reward-number-of-kills"));                
                int id1 = Integer.valueOf(config.getString("Config.recompensa-mobs.first-reward-item-id"));
                int amount1 = Integer.valueOf(config.getString("Config.recompensa-mobs.first-reward-item-amount"));
                int reward2 = Integer.valueOf(config.getString("Config.recompensa-mobs.second-reward-number-of-kills"));
                int id2 = Integer.valueOf(config.getString("Config.recompensa-mobs.second-reward-item-id"));
                int amount2 = Integer.valueOf(config.getString("Config.recompensa-mobs.second-reward-item-amount"));
                int cantidadSkeleton = Integer.valueOf(config.getString("Players."+killer.getUniqueId()+".skeleton_kills"));
                config.set("Players."+killer.getUniqueId()+".skeleton_kills", cantidadSkeleton+1);
                plugin.saveConfig();
                if(cantidadSkeleton == reward1-1){
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
                        ItemStack item = new ItemStack(id1,amount1);
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
                        ItemStack item = new ItemStack(id1,amount1);
                        killer.getInventory().addItem(item); 
                        return;                                                                   
                        }
                    }
                    return;
                    }else if(cantidadSkeleton == reward2-1){
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
                            ItemStack item = new ItemStack(id2,amount2);
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
                            ItemStack item = new ItemStack(id2,amount2);
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
        FileConfiguration config = plugin.getConfig();
        FileConfiguration messages = plugin.getMessages();
        Player killer = event.getEntity().getKiller();
        EntityType entidad = event.getEntityType();
        if(killer !=null && killer.getType().equals(EntityType.PLAYER) && entidad.equals(EntityType.SLIME)){            
            config.set("Players."+killer.getUniqueId()+".name", killer.getName());
            if(config.contains("Players."+killer.getUniqueId()+".slime_kills")){  
                int reward1 = Integer.valueOf(config.getString("Config.recompensa-mobs.first-reward-number-of-kills"));                
                int id1 = Integer.valueOf(config.getString("Config.recompensa-mobs.first-reward-item-id"));
                int amount1 = Integer.valueOf(config.getString("Config.recompensa-mobs.first-reward-item-amount"));
                int reward2 = Integer.valueOf(config.getString("Config.recompensa-mobs.second-reward-number-of-kills"));
                int id2 = Integer.valueOf(config.getString("Config.recompensa-mobs.second-reward-item-id"));
                int amount2 = Integer.valueOf(config.getString("Config.recompensa-mobs.second-reward-item-amount"));
                int cantidadSlime = Integer.valueOf(config.getString("Players."+killer.getUniqueId()+".slime_kills"));
                config.set("Players."+killer.getUniqueId()+".slime_kills", cantidadSlime+1);
                plugin.saveConfig();
                if(cantidadSlime == reward1-1){
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
                        ItemStack item = new ItemStack(id1,amount1);
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
                        ItemStack item = new ItemStack(id1,amount1);
                        killer.getInventory().addItem(item); 
                        return;                                                                   
                        }
                    }
                    return;
                    }else if(cantidadSlime == reward2-1){
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
                            ItemStack item = new ItemStack(id2,amount2);
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
                            ItemStack item = new ItemStack(id2,amount2);
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
    public void matarWitchs(EntityDeathEvent event){
        FileConfiguration config = plugin.getConfig();
        FileConfiguration messages = plugin.getMessages();
        Player killer = event.getEntity().getKiller();
        EntityType entidad = event.getEntityType();
        if(killer !=null && killer.getType().equals(EntityType.PLAYER) && entidad.equals(EntityType.WITCH)){            
            config.set("Players."+killer.getUniqueId()+".name", killer.getName());
            if(config.contains("Players."+killer.getUniqueId()+".witch_kills")){  
                int reward1 = Integer.valueOf(config.getString("Config.recompensa-mobs.first-reward-number-of-kills"));                
                int id1 = Integer.valueOf(config.getString("Config.recompensa-mobs.first-reward-item-id"));
                int amount1 = Integer.valueOf(config.getString("Config.recompensa-mobs.first-reward-item-amount"));
                int reward2 = Integer.valueOf(config.getString("Config.recompensa-mobs.second-reward-number-of-kills"));
                int id2 = Integer.valueOf(config.getString("Config.recompensa-mobs.second-reward-item-id"));
                int amount2 = Integer.valueOf(config.getString("Config.recompensa-mobs.second-reward-item-amount"));
                int cantidadWitch = Integer.valueOf(config.getString("Players."+killer.getUniqueId()+".witch_kills"));
                config.set("Players."+killer.getUniqueId()+".witch_kills", cantidadWitch+1);
                plugin.saveConfig();
                if(cantidadWitch == reward1-1){
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
                        ItemStack item = new ItemStack(id1,amount1);
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
                        ItemStack item = new ItemStack(id1,amount1);
                        killer.getInventory().addItem(item); 
                        return;                                                                   
                        }
                    }
                    return;
                    }else if(cantidadWitch == reward2-1){
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
                            ItemStack item = new ItemStack(id2,amount2);
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
                            ItemStack item = new ItemStack(id2,amount2);
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
        FileConfiguration config = plugin.getConfig();
        FileConfiguration messages = plugin.getMessages();
        Player killer = event.getEntity().getKiller();
        EntityType entidad = event.getEntityType();
        if(killer !=null && killer.getType().equals(EntityType.PLAYER) && entidad.equals(EntityType.WITHER)){            
            config.set("Players."+killer.getUniqueId()+".name", killer.getName());
            if(config.contains("Players."+killer.getUniqueId()+".wither_kills")){  
                int reward1 = Integer.valueOf(config.getString("Config.recompensa-mobs.first-reward-number-of-kills"));                
                int id1 = Integer.valueOf(config.getString("Config.recompensa-mobs.first-reward-item-id"));
                int amount1 = Integer.valueOf(config.getString("Config.recompensa-mobs.first-reward-item-amount"));
                int reward2 = Integer.valueOf(config.getString("Config.recompensa-mobs.second-reward-number-of-kills"));
                int id2 = Integer.valueOf(config.getString("Config.recompensa-mobs.second-reward-item-id"));
                int amount2 = Integer.valueOf(config.getString("Config.recompensa-mobs.second-reward-item-amount"));
                int cantidadWither = Integer.valueOf(config.getString("Players."+killer.getUniqueId()+".wither_kills"));
                config.set("Players."+killer.getUniqueId()+".wither_kills", cantidadWither+1);
                plugin.saveConfig();
                if(cantidadWither == reward1-1){
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
                        ItemStack item = new ItemStack(id1,amount1);
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
                        ItemStack item = new ItemStack(id1,amount1);
                        killer.getInventory().addItem(item); 
                        return;                                                                   
                        }
                    }
                    return;
                    }else if(cantidadWither == reward2-1){
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
                            ItemStack item = new ItemStack(id2,amount2);
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
                            ItemStack item = new ItemStack(id2,amount2);
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
        FileConfiguration config = plugin.getConfig();
        FileConfiguration messages = plugin.getMessages();
        Player killer = event.getEntity().getKiller();
        EntityType entidad = event.getEntityType();
        if(killer !=null && killer.getType().equals(EntityType.PLAYER) && entidad.equals(EntityType.ZOMBIE)){            
            config.set("Players."+killer.getUniqueId()+".name", killer.getName());
            if(config.contains("Players."+killer.getUniqueId()+".zombie_kills")){  
                int reward1 = Integer.valueOf(config.getString("Config.recompensa-mobs.first-reward-number-of-kills"));                
                int id1 = Integer.valueOf(config.getString("Config.recompensa-mobs.first-reward-item-id"));
                int amount1 = Integer.valueOf(config.getString("Config.recompensa-mobs.first-reward-item-amount"));
                int reward2 = Integer.valueOf(config.getString("Config.recompensa-mobs.second-reward-number-of-kills"));
                int id2 = Integer.valueOf(config.getString("Config.recompensa-mobs.second-reward-item-id"));
                int amount2 = Integer.valueOf(config.getString("Config.recompensa-mobs.second-reward-item-amount"));
                int cantidadZombie = Integer.valueOf(config.getString("Players."+killer.getUniqueId()+".zombie_kills"));
                config.set("Players."+killer.getUniqueId()+".zombie_kills", cantidadZombie+1);
                plugin.saveConfig();
                if(cantidadZombie == reward1-1){
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
                        ItemStack item = new ItemStack(id1,amount1);
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
                        ItemStack item = new ItemStack(id1,amount1);
                        killer.getInventory().addItem(item); 
                        return;                                                                   
                        }
                    }
                    return;
                    }else if(cantidadZombie == reward2-1){
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
                            ItemStack item = new ItemStack(id2,amount2);
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
                            ItemStack item = new ItemStack(id2,amount2);
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