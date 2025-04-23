package projectwarnet;

import java.awt.Color;
import java.awt.Desktop;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import static javax.swing.JSplitPane.LEFT;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.management.openmbean.OpenDataException;
import javax.swing.Timer;
import java.time.*;
import javax.swing.JFrame;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.time.LocalTime;


/**
 *
 * @author Reyhan Al Farel
 */
import static projectwarnet.Login.username;

public class ProgramWarnet extends javax.swing.JFrame {
    /**
     * Creates new form ProgramWarnet
     */
    
    public static String name;
    
    Timer t;
    SimpleDateFormat st;
    
    public ProgramWarnet() {
        initComponents();
//        ProgramWarnet frame = new ProgramWarnet();
        
        scaleImage();
        //scaleImageWallpaper();
        scaleImageTournament();
        // Mematikan Panel Pembayaran Makanan
        jPanel_JikaDiaPesanMieBiasa.setVisible(false);
        jPanel_JikaDiaPesanMieTelur.setVisible(false);
        jPanel_JikaDiaPesanSosTeng.setVisible(false);
        jPanel_JikaDiaPesanNasiGoreng.setVisible(false);
        jPanel_JikaDiaPesanKwetiawGoreng.setVisible(false);
        // Mematikan Panel Pembayaran Minuman
        jPanel_JikaDiaPesanKopi.setVisible(false);
        jPanel_JikaDiaPesanEsTeh.setVisible(false);
        jPanel_JikaDiaPesanAirMineral.setVisible(false);
        jPanel_JikaDiaPesanCocaCola.setVisible(false);
        jPanel_JikaDiaPesanSprite.setVisible(false);
        // Mematikan Visual Grafic, Jika Tidak Dimatikan, tiba tiba muncul button atau yg lain lain
        jPanel_Game.setVisible(false);
        jPanel_Order.setVisible(false);
        jPanel_Waktu.setVisible(false);
        
        jTextField_Search.setVisible(false);
        jPanel_JikaPilihMakananMiebiasa.setVisible(false);
        jButton_Back.setVisible(false);
        jButton_MilihMieBiasaBack.setVisible(false);
        jButton_BackMilihSosTeng.setVisible(false);
        jButton_BackMilihNasiGoreng.setVisible(false);
        jButton_BackMilihKwetiawGoreng.setVisible(false);
        jButton_Back_MinumanKopi.setVisible(false);
        jButton_Back_MinumanEsTeh.setVisible(false);
        jButton_Back_MinumanAirMineral.setVisible(false);
        jButton_Back_MinumanCocaCola.setVisible(false);
        jButton_Back_MinumanSprite.setVisible(false);
        
        // Button yg ada di Mie Biasa
        jTextField_JumlahMieBiasa.setVisible(false);
        jTextField_HargaMieBiasa.setVisible(false);
        jButton_MieBiasa.setVisible(false);
        jButton_MinusMieBiasa.setVisible(false);
        jButton_PlusMieBiasa.setVisible(false);
        
        // Button yg ada di Mie Telur
        jTextField_MilihMieGorengTelur_Jumlah.setVisible(false);
        jTextField_MilihMieGorengTelur_Harga.setVisible(false);
        jButton_PesanMilihMieGorengTelur.setVisible(false);
        jButton_MinusMieGorengTelur.setVisible(false);
        jButton_PlusMieGorengTelur.setVisible(false);
        
        // Button yg ada di Sos Teng
        jTextField_JumlahMilihSosTeng.setVisible(false);
        jTextField_HargaMilihSosTeng.setVisible(false);
        jButton_PesanMilihSosTeng.setVisible(false);
        jButton_MinusMilihSosTeng.setVisible(false);
        jButton_PlusMilihSosTeng.setVisible(false);
        
        // Button yg ada di Nasi Goreng
        jTextField_JumlahMilihNasiGoreng.setVisible(false);
        jTextField_HargaMilihNasiGoreng.setVisible(false);
        jButton_PesanMilihNasiGoreng.setVisible(false);
        jButton_PlusMilihNasiGoreng.setVisible(false);
        jButton_MinusMilihNasiGoreng.setVisible(false);
        
        // Button yg ada di Kwetiaw Goreng
        jTextField_JumlahMilihKwetiawGoreng.setVisible(false);
        jTextField_HargaMilihKwetiawGoreng.setVisible(false);
        jButton_PesanMilihKwetiawGoreng.setVisible(false);
        jButton_MinusMilihKwetiawGoreng.setVisible(false);
        jButton_PlusMilihKwetiawGoreng.setVisible(false);
        
        // Button yg ada di Kopi
        jTextField_Jumlah_MinumanKopi.setVisible(false);
        jTextField_Harga_MinumanKopi.setVisible(false);
        jButton_Pesan_MinumanKopi.setVisible(false);
        jButton_Minus_MinumanKopi.setVisible(false);
        jButton_Plus_MinumanKopi.setVisible(false);
        
        // Button yg ada di Es Teh
        jTextField_Jumlah_MinumanEsTeh.setVisible(false);
        jTextField_Harga_MinumanEsTeh.setVisible(false);
        jButton_Pesan_MinumanEsTeh.setVisible(false);
        jButton_Minus_MinumanEsTeh.setVisible(false);
        jButton_Plus_MinumanEsTeh.setVisible(false);
        
        // Button yg ada di Air Mineral
        jTextField_Jumlah_MinumanAirMineral.setVisible(false);
        jTextField_Harga_MinumanAirMineral.setVisible(false);
        jButton_Pesan_MinumanAirMineral.setVisible(false);
        jButton_Minus_MinumanAirMineral.setVisible(false);
        jButton_Plus_MinumanAirMineral.setVisible(false);
        
        // Button yg ada di Coca Cola
        jTextField_Jumlah_MinumanCocaCola.setVisible(false);
        jTextField_Harga_MinumanCocaCola.setVisible(false);
        jButton_Pesan_MinumanCocaCola.setVisible(false);
        jButton_Minus_MinumanCocaCola.setVisible(false);
        jButton_Plus_MinumanCocaCola.setVisible(false);
        
        // Button yg ada di Sprite
        jTextField_Jumlah_MinumanSprite.setVisible(false);
        jTextField_Harga_MinumanSprite.setVisible(false);
        jButton_Pesan_MinumanSprite.setVisible(false);
        jButton_Minus_MinumanSprite.setVisible(false);
        jButton_Plus_MinumanSprite.setVisible(false);
        
        // Mematikan Semua Tombol di Pembayaran Di Mie Biasa
        jButton_BackPembayaranMieBiasa.setVisible(false);
        jTextField_Pembayaran_Dana_MieBiasa.setVisible(false);
        jTextField_Pembayaran_Ovo_MieBiasa.setVisible(false);
        jTextField_Pembayaran_Gopay_MieBiasa.setVisible(false);
        jTextField_Pembayaran_Shopepay_MieBiasa.setVisible(false);
        jButton_BeliSekarangPembayaranMieBiasa.setVisible(false);
        jTextField_Pembayaran_Langsung_MieBiasa.setVisible(false);
        jCheckBox_Pembayaran_Dana_MieBiasa.setVisible(false);
        jCheckBox_Pembayaran_Ovo_Miebiasa.setVisible(false);
        jCheckBox_Pembayaran_Gopay_MieBiasa.setVisible(false);
        jCheckBox_Pembayaran_Shopepay_MieBiasa.setVisible(false);
        jCheckBox_Pembayaran_Langsung_MieBiasa.setVisible(false);
        
        // Mematikan Semua Tombol di Pembayaran Di Mie Telur
        jButton_BackPembayaranMieTelur.setVisible(false);
        jTextField_Pembayaran_Dana_MieTelur.setVisible(false);
        jTextField_Pembayaran_Ovo_MieTelur.setVisible(false);
        jTextField_Pembayaran_Gopay_MieTelur.setVisible(false);
        jTextField_Pembayaran_Shopepay_MieTelur.setVisible(false);
        jButton_BeliSekarangPembayaranMieTelur.setVisible(false);
        jTextField_Pembayaran_Langsung_MieTelur.setVisible(false);
        jCheckBox_Pembayaran_Dana_MieTelur.setVisible(false);
        jCheckBox_Pembayaran_Ovo_MieTelur.setVisible(false);
        jCheckBox_Pembayaran_Gopay_MieTelur.setVisible(false);
        jCheckBox_Pembayaran_Shopepay_MieTelur.setVisible(false);
        jCheckBox_Pembayaran_Langsung_MieTelur.setVisible(false);
        
        // Mematikan Semua Tombol di Pembayaran Di SosTeng
        jButton_BackPembayaranSosteng.setVisible(false);
        jTextField_Pembayaran_Dana_Sosteng.setVisible(false);
        jTextField_Pembayaran_Ovo_Sosteng.setVisible(false);
        jTextField_Pembayaran_Gopay_Sosteng.setVisible(false);
        jTextField_Pembayaran_Shopepay_Sosteng.setVisible(false);
        jButton_BeliSekarangPembayaranSosteng.setVisible(false);
        jTextField_Pembayaran_Langsung_Sosteng.setVisible(false);
        jCheckBox_Pembayaran_Dana_Sosteng.setVisible(false);
        jCheckBox_Pembayaran_Ovo_Sosteng.setVisible(false);
        jCheckBox_Pembayaran_Gopay_Sosteng.setVisible(false);
        jCheckBox_Pembayaran_Shopepay_Sosteng.setVisible(false);
        jCheckBox_Pembayaran_Langsung_Sosteng.setVisible(false);
        
        // Mematikan Semua Tombol di Pembayaran Di Nasi Goreng
        jButton_BackPembayaranNasiGoreng.setVisible(false);
        jTextField_Pembayaran_Dana_NasiGoreng.setVisible(false);
        jTextField_Pembayaran_Ovo_NasiGoreng.setVisible(false);
        jTextField_Pembayaran_Gopay_NasiGoreng.setVisible(false);
        jTextField_Pembayaran_Shopepay_NasiGoreng.setVisible(false);
        jButton_BeliSekarangPembayaranNasiGoreng.setVisible(false);
        jTextField_Pembayaran_Langsung_NasiGoreng.setVisible(false);
        jCheckBox_Pembayaran_Dana_NasiGoreng.setVisible(false);
        jCheckBox_Pembayaran_Ovo_NasiGoreng.setVisible(false);
        jCheckBox_Pembayaran_Gopay_NasiGoreng.setVisible(false);
        jCheckBox_Pembayaran_Shopepay_NasiGoreng.setVisible(false);
        jCheckBox_Pembayaran_Langsung_NasiGoreng.setVisible(false);
        
        // Mematikan Semua Tombol di Pembayaran Di Kwetiaw Goreng
        jButton_BackPembayaranKwetiawGoreng.setVisible(false);
        jTextField_Pembayaran_Dana_KwetiawGoreng.setVisible(false);
        jTextField_Pembayaran_Ovo_KwetiawGoreng.setVisible(false);
        jTextField_Pembayaran_Gopay_KwetiawGoreng.setVisible(false);
        jTextField_Pembayaran_Shopepay_KwetiawGoreng.setVisible(false);
        jButton_BeliSekarangPembayaranKwetiawGoreng.setVisible(false);
        jTextField_Pembayaran_Langsung_KwetiawGoreng.setVisible(false);
        jCheckBox_Pembayaran_Dana_KwetiawGoreng.setVisible(false);
        jCheckBox_Pembayaran_Ovo_KwetiawGoreng.setVisible(false);
        jCheckBox_Pembayaran_Gopay_KwetiawGoreng.setVisible(false);
        jCheckBox_Pembayaran_Shopepay_KwetiawGoreng.setVisible(false);
        jCheckBox_Pembayaran_Langsung_KwetiawGoreng.setVisible(false);
        
        // Mematikan Semua Tombol di Pembayaran Di Kopi
        jButton_BackPembayaranKopi.setVisible(false);
        jTextField_Pembayaran_Dana_Kopi.setVisible(false);
        jTextField_Pembayaran_Ovo_Kopi.setVisible(false);
        jTextField_Pembayaran_Gopay_Kopi.setVisible(false);
        jTextField_Pembayaran_Shopepay_Kopi.setVisible(false);
        jButton_BeliSekarangPembayaranKopi.setVisible(false);
        jTextField_Pembayaran_Langsung_Kopi.setVisible(false);
        jCheckBox_Pembayaran_Dana_Kopi.setVisible(false);
        jCheckBox_Pembayaran_Ovo_Kopi.setVisible(false);
        jCheckBox_Pembayaran_Gopay_Kopi.setVisible(false);
        jCheckBox_Pembayaran_Shopepay_Kopi.setVisible(false);
        jCheckBox_Pembayaran_Langsung_Kopi.setVisible(false);
        
        // Mematikan Semua Tombol di Pembayaran Di EsTeh
        jButton_BackPembayaranEsTeh.setVisible(false);
        jTextField_Pembayaran_Dana_EsTeh.setVisible(false);
        jTextField_Pembayaran_Ovo_EsTeh.setVisible(false);
        jTextField_Pembayaran_Gopay_EsTeh.setVisible(false);
        jTextField_Pembayaran_Shopepay_EsTeh.setVisible(false);
        jButton_BeliSekarangPembayaranEsTeh.setVisible(false);
        jTextField_Pembayaran_Langsung_EsTeh.setVisible(false);
        jCheckBox_Pembayaran_Dana_EsTeh.setVisible(false);
        jCheckBox_Pembayaran_Ovo_EsTeh.setVisible(false);
        jCheckBox_Pembayaran_Gopay_EsTeh.setVisible(false);
        jCheckBox_Pembayaran_Shopepay_EsTeh.setVisible(false);
        jCheckBox_Pembayaran_Langsung_EsTeh.setVisible(false);
        
        // Mematikan Semua Tombol di Pembayaran Di Air Mineral
        jButton_BackPembayaranAirMineral.setVisible(false);
        jTextField_Pembayaran_Dana_AirMineral.setVisible(false);
        jTextField_Pembayaran_Ovo_AirMineral.setVisible(false);
        jTextField_Pembayaran_Gopay_AirMineral.setVisible(false);
        jTextField_Pembayaran_Shopepay_AirMineral.setVisible(false);
        jButton_BeliSekarangPembayaranAirMineral.setVisible(false);
        jTextField_Pembayaran_Langsung_AirMineral.setVisible(false);
        jCheckBox_Pembayaran_Dana_AirMineral.setVisible(false);
        jCheckBox_Pembayaran_Ovo_AirMineral.setVisible(false);
        jCheckBox_Pembayaran_Gopay_AirMineral.setVisible(false);
        jCheckBox_Pembayaran_Shopepay_AirMineral.setVisible(false);
        jCheckBox_Pembayaran_Langsung_AirMineral.setVisible(false);
        
        // Mematikan Semua Tombol di Pembayaran Di Coca Cola
        jButton_BackPembayaranCocaCola.setVisible(false);
        jTextField_Pembayaran_Dana_CocaCola.setVisible(false);
        jTextField_Pembayaran_Ovo_CocaCola.setVisible(false);
        jTextField_Pembayaran_Gopay_CocaCola.setVisible(false);
        jTextField_Pembayaran_Shopepay_CocaCola.setVisible(false);
        jButton_BeliSekarangPembayaranCocaCola.setVisible(false);
        jTextField_Pembayaran_Langsung_CocaCola.setVisible(false);
        jCheckBox_Pembayaran_Dana_CocaCola.setVisible(false);
        jCheckBox_Pembayaran_Ovo_CocaCola.setVisible(false);
        jCheckBox_Pembayaran_Gopay_CocaCola.setVisible(false);
        jCheckBox_Pembayaran_Shopepay_CocaCola.setVisible(false);
        jCheckBox_Pembayaran_Langsung_CocaCola.setVisible(false);
        
        // Mematikan Semua Tombol di Pembayaran Di Sprite
        jButton_BackPembayaranSprite.setVisible(false);
        jTextField_Pembayaran_Dana_Sprite.setVisible(false);
        jTextField_Pembayaran_Ovo_Sprite.setVisible(false);
        jTextField_Pembayaran_Gopay_Sprite.setVisible(false);
        jTextField_Pembayaran_Shopepay_Sprite.setVisible(false);
        jButton_BeliSekarangPembayaranSprite.setVisible(false);
        jTextField_Pembayaran_Langsung_Sprite.setVisible(false);
        jCheckBox_Pembayaran_Dana_Sprite.setVisible(false);
        jCheckBox_Pembayaran_Ovo_Sprite.setVisible(false);
        jCheckBox_Pembayaran_Gopay_Sprite.setVisible(false);
        jCheckBox_Pembayaran_Shopepay_Sprite.setVisible(false);
        jCheckBox_Pembayaran_Langsung_Sprite.setVisible(false);
        
        jLabel_Tulisan_Waktu.setForeground(new Color(0,0,0));
        jLabel_Tulisan_Game.setForeground(new Color(0,0,0));
        jLabel_Tulisan_Home.setForeground(new Color(0,0,0));
        jLabel_Tulisan_Order.setForeground(new Color(0,0,0));
        jLabel_Tulisan_Logout.setForeground(new Color(0,0,0));
        
        // Scale Image
        scaleImageAllLogoGame();
        scaleImageOnlineGames();
        scaleImageOfflineGames();
        scaleAndroidGames();
        scaleImageMakananMinuman();
        scaleImageSemuaGambarMakananKalo();
        scaleImageMinumanKalo();
        scalePembayaran();
        
        // Waktu
        Tanggal();
        Mulai();
        WaktuYgTerpakai();
//        saldoWaktu(Login.username);
        Username();
        NgurangWaktu();
        tampilanNama();
        name();
    }
    
    public void close() {
        WindowEvent closeWindow = new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(closeWindow);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel_Home = new javax.swing.JPanel();
        jPanel_Header_Nickname = new javax.swing.JPanel();
        jLabel_Profile = new javax.swing.JLabel();
        jLabel_WaktuMenuAwal = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel_Username = new javax.swing.JLabel();
        jLabel_Netflix = new javax.swing.JLabel();
        jLabel_Chrome = new javax.swing.JLabel();
        jLabel_Discord = new javax.swing.JLabel();
        jLabel_GameMenu = new javax.swing.JLabel();
        jLabel_Steam = new javax.swing.JLabel();
        jLabel_Tiktok = new javax.swing.JLabel();
        jLabel_Spotify = new javax.swing.JLabel();
        jLabel_TulisanNetflix = new javax.swing.JLabel();
        jLabel_TulisanChrome = new javax.swing.JLabel();
        jLabel_TulisanDiscord = new javax.swing.JLabel();
        jLabel_TulisanGameMenu = new javax.swing.JLabel();
        jLabel_TulisanSteam = new javax.swing.JLabel();
        jLabel_TulisanTiktok = new javax.swing.JLabel();
        jLabel_TulisanSpotify = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel_TournamentInfo = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel_TulisanBantuKami = new javax.swing.JLabel();
        jLabel_TulisanBelumUpdate = new javax.swing.JLabel();
        jLabel_TulisanMenghubungi = new javax.swing.JLabel();
        jLabel_TulisanTerimaKasih = new javax.swing.JLabel();
        jLabel_SelamatDatang = new javax.swing.JLabel();
        jLabel_GambarWallpaper = new javax.swing.JLabel();
        jPanel_MenuDashboard = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel_Menu = new javax.swing.JLabel();
        jLabel_Gambar_Home = new javax.swing.JLabel();
        jLabel_Tulisan_Home = new javax.swing.JLabel();
        jLabel_Gambar_Order = new javax.swing.JLabel();
        jLabel_Tulisan_Order = new javax.swing.JLabel();
        jLabel_Gambar_Waktu = new javax.swing.JLabel();
        jLabel_Tulisan_Waktu = new javax.swing.JLabel();
        jLabel_Tulisan_Logout = new javax.swing.JLabel();
        jLabel_Gambar_Logout = new javax.swing.JLabel();
        jLabel_Gambar_Game = new javax.swing.JLabel();
        jLabel_Tulisan_Game = new javax.swing.JLabel();
        jLabel_Menu1 = new javax.swing.JLabel();
        jPanel_Game = new javax.swing.JPanel();
        jPanel_Header_Game = new javax.swing.JPanel();
        jLabel_AllGames = new javax.swing.JLabel();
        jLabel_OnlineGames = new javax.swing.JLabel();
        jLabel_OfflineGames = new javax.swing.JLabel();
        jLabel_AndroidGames = new javax.swing.JLabel();
        jTextField_Search = new javax.swing.JTextField();
        jPanel_Body_AllGames = new javax.swing.JPanel();
        jLabel_AmongUs = new javax.swing.JLabel();
        jLabel_Csgo = new javax.swing.JLabel();
        jLabel_Codm = new javax.swing.JLabel();
        jLabel_Dota2 = new javax.swing.JLabel();
        jLabel_Dc = new javax.swing.JLabel();
        jLabel_AgeOfEmpire2 = new javax.swing.JLabel();
        jLabel_Battlefield3 = new javax.swing.JLabel();
        jLabel_GtaSA = new javax.swing.JLabel();
        jLabel_Nox = new javax.swing.JLabel();
        jLabel_Warcraft = new javax.swing.JLabel();
        jLabel_LdPlayer9 = new javax.swing.JLabel();
        jLabel_ApexLegends = new javax.swing.JLabel();
        jLabel_GameLoop = new javax.swing.JLabel();
        jLabel_Fortnite = new javax.swing.JLabel();
        jLabel_EuroTruck2 = new javax.swing.JLabel();
        jLabel_Left4dead2 = new javax.swing.JLabel();
        jLabel_Netbeans = new javax.swing.JLabel();
        jLabel_lostsaga = new javax.swing.JLabel();
        jLabel_MotoGp2 = new javax.swing.JLabel();
        jLabel_MotoGp3 = new javax.swing.JLabel();
        jLabel_Lol = new javax.swing.JLabel();
        jLabel_Valorant = new javax.swing.JLabel();
        jLabel_Destiny2 = new javax.swing.JLabel();
        jLabel_NetflixAllGames = new javax.swing.JLabel();
        jLabel_GTAV = new javax.swing.JLabel();
        jLabel_VisualStudioCode = new javax.swing.JLabel();
        jLabel_Whatsapp = new javax.swing.JLabel();
        jLabel_SteamAllGames = new javax.swing.JLabel();
        jLabel_TulisanAmongUs = new javax.swing.JLabel();
        jLabel_TulisanDc = new javax.swing.JLabel();
        jLabel_TulisanAgeOfEmpire2 = new javax.swing.JLabel();
        jLabel_TulisanBattleField3 = new javax.swing.JLabel();
        jLabel_TulisanGTASanAndreas = new javax.swing.JLabel();
        jLabel_TulisanNox = new javax.swing.JLabel();
        jLabel_TulisanWarcraft = new javax.swing.JLabel();
        jLabel_TulisanCodMobile = new javax.swing.JLabel();
        jLabel_TulisanLDPlayer9 = new javax.swing.JLabel();
        jLabel_TulisanApexLegends = new javax.swing.JLabel();
        jLabel_TulisanGameLoop = new javax.swing.JLabel();
        jLabel_TulisanFortnite = new javax.swing.JLabel();
        jLabel_TulisanEuroTruck2 = new javax.swing.JLabel();
        jLabel_TulisanLeft4Dead2 = new javax.swing.JLabel();
        jLabel_TulisanCSGO = new javax.swing.JLabel();
        jLabel_TulisanNetbeans = new javax.swing.JLabel();
        jLabel_TulisanLostsaga = new javax.swing.JLabel();
        jLabel_TulisanMotoGp2 = new javax.swing.JLabel();
        jLabel_TulisanMotoGp3 = new javax.swing.JLabel();
        jLabel_TulisanLOL = new javax.swing.JLabel();
        jLabel_TulisanValorant = new javax.swing.JLabel();
        jLabel_TulisanDota2 = new javax.swing.JLabel();
        jLabel_TulisanDestiny2 = new javax.swing.JLabel();
        jLabel_TulisanAllNetflix = new javax.swing.JLabel();
        jLabel_TulisanGTAV = new javax.swing.JLabel();
        jLabel_TulisanVisualStudioCode = new javax.swing.JLabel();
        jLabel_TulisanAllWhatsApp = new javax.swing.JLabel();
        jLabel_TulisanAllSteam = new javax.swing.JLabel();
        jPanel_OnlineGames = new javax.swing.JPanel();
        jLabel_OnlineGames_AmongUs = new javax.swing.JLabel();
        jLabel_OnlineGames_CSGO = new javax.swing.JLabel();
        jLabel_OnlineGames_ApexLegends = new javax.swing.JLabel();
        jLabel_OnlineGames_CODM = new javax.swing.JLabel();
        jLabel_OnlineGames_Destiny2 = new javax.swing.JLabel();
        jLabel_OnlineGames_Dota2 = new javax.swing.JLabel();
        jLabel_OnlineGames_Fortnite = new javax.swing.JLabel();
        jLabel_OnlineGames_Left4Dead2 = new javax.swing.JLabel();
        jLabel_OnlineGames_Lostsaga = new javax.swing.JLabel();
        jLabel_OnlineGames_EuroTruck2 = new javax.swing.JLabel();
        jLabel_OnlineGames_GTAV = new javax.swing.JLabel();
        jLabel_OnlineGames_Valorant = new javax.swing.JLabel();
        jLabel_OnlineGames_LOL = new javax.swing.JLabel();
        jLabel_OnlineGames_Steam = new javax.swing.JLabel();
        jLabel_OnlineAmongUS = new javax.swing.JLabel();
        jLabel_OnlineCSGO = new javax.swing.JLabel();
        jLabel_OnlineApexLegends = new javax.swing.JLabel();
        jLabel_OnlineCODM = new javax.swing.JLabel();
        jLabel_OnlineDestiny2 = new javax.swing.JLabel();
        jLabel_OnlineDota2 = new javax.swing.JLabel();
        jLabel_OnlineFortnite = new javax.swing.JLabel();
        jLabel_OnlineLeft4Dead2 = new javax.swing.JLabel();
        jLabel_OnlineLostSaga = new javax.swing.JLabel();
        jLabel_OnlineEuroTruck2 = new javax.swing.JLabel();
        jLabel_OnlineGTAV = new javax.swing.JLabel();
        jLabel_OnlineValorant = new javax.swing.JLabel();
        jLabel_OnlineLOL = new javax.swing.JLabel();
        jLabel_OnlineSteam = new javax.swing.JLabel();
        jPanel_OfflineGames = new javax.swing.JPanel();
        jLabel_OfflineGTASA = new javax.swing.JLabel();
        jLabel_OfflineBattleField3 = new javax.swing.JLabel();
        jLabel_OfflineAgeOfEmpire2 = new javax.swing.JLabel();
        jLabel_OfflineGTAV = new javax.swing.JLabel();
        jLabel_OfflineMotoGp2 = new javax.swing.JLabel();
        jLabel_OfflineMotoGp3 = new javax.swing.JLabel();
        jLabel_TulisanOfflineGtaSA = new javax.swing.JLabel();
        jLabel_TulisanOfflineBattleField3 = new javax.swing.JLabel();
        jLabel_TulisanOfflineAgeOfEmpire2 = new javax.swing.JLabel();
        jLabel_TulisanOfflineGTAV = new javax.swing.JLabel();
        jLabel_TulisanOfflineMotoGp2 = new javax.swing.JLabel();
        jLabel_TulisanOfflineMotoGp3 = new javax.swing.JLabel();
        jPanel_AndroidGames = new javax.swing.JPanel();
        jLabel_AndroidGameLoop = new javax.swing.JLabel();
        jLabel_AndroidLdGame = new javax.swing.JLabel();
        jLabel_AndroidNox = new javax.swing.JLabel();
        jLabel_TulisanAndroidGameLoop = new javax.swing.JLabel();
        jLabel_TulisanAndroidLdPlayer9 = new javax.swing.JLabel();
        jLabel_TulisanAndroidNox = new javax.swing.JLabel();
        jPanel_Order = new javax.swing.JPanel();
        jPanel_HeaderOrder = new javax.swing.JPanel();
        jLabel_Makanan = new javax.swing.JLabel();
        jLabel_Minuman = new javax.swing.JLabel();
        jPanel_Makanan = new javax.swing.JPanel();
        jLabel_MieBiasa = new javax.swing.JLabel();
        jLabel_MieTelor = new javax.swing.JLabel();
        jLabel_SosTeng = new javax.swing.JLabel();
        jLabel_KewtiawGoreng = new javax.swing.JLabel();
        jLabel_NasiGoreng = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jPanel_Minuman = new javax.swing.JPanel();
        jLabel_Kopi = new javax.swing.JLabel();
        jLabel_IceTea = new javax.swing.JLabel();
        jLabel_AirMineral = new javax.swing.JLabel();
        jLabel_CocaCola = new javax.swing.JLabel();
        jLabel_Sprite = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jPanel_JikaPilihMakananMiebiasa = new javax.swing.JPanel();
        jLabel_MilihMieGorengBiasa = new javax.swing.JLabel();
        jButton_MieBiasa = new javax.swing.JButton();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jButton_PlusMieBiasa = new javax.swing.JButton();
        jTextField_HargaMieBiasa = new javax.swing.JTextField();
        jTextField_JumlahMieBiasa = new javax.swing.JTextField();
        jButton_MinusMieBiasa = new javax.swing.JButton();
        jButton_MilihMieBiasaBack = new javax.swing.JButton();
        jLabel24 = new javax.swing.JLabel();
        jPanel_JikaDiaMemilihMakananMieTelur = new javax.swing.JPanel();
        jLabel_MilihMieGorengTelur = new javax.swing.JLabel();
        jButton_Back = new javax.swing.JButton();
        jLabel29 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jButton_PesanMilihMieGorengTelur = new javax.swing.JButton();
        jLabel30 = new javax.swing.JLabel();
        jTextField_MilihMieGorengTelur_Jumlah = new javax.swing.JTextField();
        jTextField_MilihMieGorengTelur_Harga = new javax.swing.JTextField();
        jButton_MinusMieGorengTelur = new javax.swing.JButton();
        jButton_PlusMieGorengTelur = new javax.swing.JButton();
        jPanel_JikaMemilihMakananSosTeng = new javax.swing.JPanel();
        jButton_BackMilihSosTeng = new javax.swing.JButton();
        jLabel_JikaMilihSosTeng = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jButton_PesanMilihSosTeng = new javax.swing.JButton();
        jTextField_JumlahMilihSosTeng = new javax.swing.JTextField();
        jTextField_HargaMilihSosTeng = new javax.swing.JTextField();
        jButton_MinusMilihSosTeng = new javax.swing.JButton();
        jButton_PlusMilihSosTeng = new javax.swing.JButton();
        jPanel_JikaDiaMemilihMakananNasiGoreng = new javax.swing.JPanel();
        jLabel_JikaMilihNasiGoreng = new javax.swing.JLabel();
        jButton_BackMilihNasiGoreng = new javax.swing.JButton();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jButton_PesanMilihNasiGoreng = new javax.swing.JButton();
        jTextField_JumlahMilihNasiGoreng = new javax.swing.JTextField();
        jTextField_HargaMilihNasiGoreng = new javax.swing.JTextField();
        jButton_MinusMilihNasiGoreng = new javax.swing.JButton();
        jButton_PlusMilihNasiGoreng = new javax.swing.JButton();
        jPanel_JikaDiaMemilihMakananKwetiawGoreng = new javax.swing.JPanel();
        jButton_BackMilihKwetiawGoreng = new javax.swing.JButton();
        jLabel_JikaMilihKwetiawGoreng = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jButton_PesanMilihKwetiawGoreng = new javax.swing.JButton();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jTextField_JumlahMilihKwetiawGoreng = new javax.swing.JTextField();
        jTextField_HargaMilihKwetiawGoreng = new javax.swing.JTextField();
        jButton_MinusMilihKwetiawGoreng = new javax.swing.JButton();
        jButton_PlusMilihKwetiawGoreng = new javax.swing.JButton();
        jPanel_JikaDiaMemilihMinumanKopi = new javax.swing.JPanel();
        jLabel_JikaMilihKopi = new javax.swing.JLabel();
        jButton_Back_MinumanKopi = new javax.swing.JButton();
        jLabel34 = new javax.swing.JLabel();
        jButton_Pesan_MinumanKopi = new javax.swing.JButton();
        jLabel38 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jTextField_Jumlah_MinumanKopi = new javax.swing.JTextField();
        jTextField_Harga_MinumanKopi = new javax.swing.JTextField();
        jButton_Minus_MinumanKopi = new javax.swing.JButton();
        jButton_Plus_MinumanKopi = new javax.swing.JButton();
        jPanel_JikaDiaMemilihMinumanEsTeh = new javax.swing.JPanel();
        jLabel_JikaMilihEsTeh = new javax.swing.JLabel();
        jButton_Back_MinumanEsTeh = new javax.swing.JButton();
        jLabel43 = new javax.swing.JLabel();
        jButton_Pesan_MinumanEsTeh = new javax.swing.JButton();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jTextField_Jumlah_MinumanEsTeh = new javax.swing.JTextField();
        jButton_Minus_MinumanEsTeh = new javax.swing.JButton();
        jButton_Plus_MinumanEsTeh = new javax.swing.JButton();
        jTextField_Harga_MinumanEsTeh = new javax.swing.JTextField();
        jPanel_JikaDiaMemilihMinumanAirMineral = new javax.swing.JPanel();
        jLabel_JikaMilihAirMineral = new javax.swing.JLabel();
        jButton_Back_MinumanAirMineral = new javax.swing.JButton();
        jLabel46 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        jButton_Pesan_MinumanAirMineral = new javax.swing.JButton();
        jTextField_Jumlah_MinumanAirMineral = new javax.swing.JTextField();
        jTextField_Harga_MinumanAirMineral = new javax.swing.JTextField();
        jButton_Minus_MinumanAirMineral = new javax.swing.JButton();
        jButton_Plus_MinumanAirMineral = new javax.swing.JButton();
        jPanel_JikaDiaMemilihMinumanCocaCola = new javax.swing.JPanel();
        jLabel_JikaMilihCocaCola = new javax.swing.JLabel();
        jButton_Back_MinumanCocaCola = new javax.swing.JButton();
        jLabel49 = new javax.swing.JLabel();
        jButton_Pesan_MinumanCocaCola = new javax.swing.JButton();
        jLabel50 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        jTextField_Jumlah_MinumanCocaCola = new javax.swing.JTextField();
        jTextField_Harga_MinumanCocaCola = new javax.swing.JTextField();
        jButton_Minus_MinumanCocaCola = new javax.swing.JButton();
        jButton_Plus_MinumanCocaCola = new javax.swing.JButton();
        jPanel_JikaDiaMemilihMinumanSprite = new javax.swing.JPanel();
        jLabel_JikaMilihSprite = new javax.swing.JLabel();
        jButton_Back_MinumanSprite = new javax.swing.JButton();
        jLabel52 = new javax.swing.JLabel();
        jButton_Pesan_MinumanSprite = new javax.swing.JButton();
        jLabel53 = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        jTextField_Jumlah_MinumanSprite = new javax.swing.JTextField();
        jTextField_Harga_MinumanSprite = new javax.swing.JTextField();
        jButton_Minus_MinumanSprite = new javax.swing.JButton();
        jButton_Plus_MinumanSprite = new javax.swing.JButton();
        jPanel_JikaDiaPesanMieBiasa = new javax.swing.JPanel();
        jLabel60 = new javax.swing.JLabel();
        jButton_BackPembayaranMieBiasa = new javax.swing.JButton();
        jLabel_Pembayaran_Dana_MieBiasa = new javax.swing.JLabel();
        jTextField_Pembayaran_Dana_MieBiasa = new javax.swing.JTextField();
        jButton_BeliSekarangPembayaranMieBiasa = new javax.swing.JButton();
        jLabel_Pembayaran_ShopePay_MieBiasa = new javax.swing.JLabel();
        jLabel_Pembayaran_Ovo_MieBiasa = new javax.swing.JLabel();
        jTextField_Pembayaran_Shopepay_MieBiasa = new javax.swing.JTextField();
        jLabel_Pembayaran_Gopay_MieBiasa = new javax.swing.JLabel();
        jTextField_Pembayaran_Gopay_MieBiasa = new javax.swing.JTextField();
        jTextField_Pembayaran_Ovo_MieBiasa = new javax.swing.JTextField();
        jLabel_Pembayaran_Langsung_MieBiasa = new javax.swing.JLabel();
        jTextField_Pembayaran_Langsung_MieBiasa = new javax.swing.JTextField();
        jCheckBox_Pembayaran_Dana_MieBiasa = new javax.swing.JCheckBox();
        jCheckBox_Pembayaran_Ovo_Miebiasa = new javax.swing.JCheckBox();
        jCheckBox_Pembayaran_Gopay_MieBiasa = new javax.swing.JCheckBox();
        jCheckBox_Pembayaran_Shopepay_MieBiasa = new javax.swing.JCheckBox();
        jCheckBox_Pembayaran_Langsung_MieBiasa = new javax.swing.JCheckBox();
        jPanel_JikaDiaPesanMieTelur = new javax.swing.JPanel();
        jButton_BackPembayaranMieTelur = new javax.swing.JButton();
        jLabel61 = new javax.swing.JLabel();
        jLabel_Pembayaran_Dana_MieTelur = new javax.swing.JLabel();
        jLabel_Pembayaran_Ovo_MieTelur = new javax.swing.JLabel();
        jLabel_Pembayaran_Gopay_MieTelur = new javax.swing.JLabel();
        jLabel_Pembayaran_ShopeePay_MieTelur = new javax.swing.JLabel();
        jLabel_Pembayaran_Langsung_MieTelur = new javax.swing.JLabel();
        jButton_BeliSekarangPembayaranMieTelur = new javax.swing.JButton();
        jTextField_Pembayaran_Dana_MieTelur = new javax.swing.JTextField();
        jTextField_Pembayaran_Ovo_MieTelur = new javax.swing.JTextField();
        jTextField_Pembayaran_Gopay_MieTelur = new javax.swing.JTextField();
        jTextField_Pembayaran_Shopepay_MieTelur = new javax.swing.JTextField();
        jTextField_Pembayaran_Langsung_MieTelur = new javax.swing.JTextField();
        jCheckBox_Pembayaran_Dana_MieTelur = new javax.swing.JCheckBox();
        jCheckBox_Pembayaran_Ovo_MieTelur = new javax.swing.JCheckBox();
        jCheckBox_Pembayaran_Gopay_MieTelur = new javax.swing.JCheckBox();
        jCheckBox_Pembayaran_Shopepay_MieTelur = new javax.swing.JCheckBox();
        jCheckBox_Pembayaran_Langsung_MieTelur = new javax.swing.JCheckBox();
        jPanel_JikaDiaPesanSosTeng = new javax.swing.JPanel();
        jButton_BackPembayaranSosteng = new javax.swing.JButton();
        jLabel62 = new javax.swing.JLabel();
        jLabel_Pembayaran_Dana_Sosteng = new javax.swing.JLabel();
        jLabel_Pembayaran_Ovo_Sosteng = new javax.swing.JLabel();
        jLabel_Pembayaran_Gopay_Sosteng = new javax.swing.JLabel();
        jLabel_Pembayaran_Shopepay_Sosteng = new javax.swing.JLabel();
        jLabel_Pembayaran_Langsung_Sosteng = new javax.swing.JLabel();
        jTextField_Pembayaran_Dana_Sosteng = new javax.swing.JTextField();
        jTextField_Pembayaran_Ovo_Sosteng = new javax.swing.JTextField();
        jTextField_Pembayaran_Gopay_Sosteng = new javax.swing.JTextField();
        jTextField_Pembayaran_Shopepay_Sosteng = new javax.swing.JTextField();
        jTextField_Pembayaran_Langsung_Sosteng = new javax.swing.JTextField();
        jCheckBox_Pembayaran_Dana_Sosteng = new javax.swing.JCheckBox();
        jCheckBox_Pembayaran_Ovo_Sosteng = new javax.swing.JCheckBox();
        jCheckBox_Pembayaran_Gopay_Sosteng = new javax.swing.JCheckBox();
        jCheckBox_Pembayaran_Shopepay_Sosteng = new javax.swing.JCheckBox();
        jCheckBox_Pembayaran_Langsung_Sosteng = new javax.swing.JCheckBox();
        jButton_BeliSekarangPembayaranSosteng = new javax.swing.JButton();
        jPanel_JikaDiaPesanNasiGoreng = new javax.swing.JPanel();
        jButton_BackPembayaranNasiGoreng = new javax.swing.JButton();
        jLabel63 = new javax.swing.JLabel();
        jLabel_Pembayaran_Dana_NasiGoreng = new javax.swing.JLabel();
        jLabel_Pembayaran_Ovo_NasiGoreng = new javax.swing.JLabel();
        jLabel_Pembayaran_Gopay_NasiGoreng = new javax.swing.JLabel();
        jLabel_Pembayaran_Shopepay_NasiGoreng = new javax.swing.JLabel();
        jLabel_Pembayaran_Langsung_NasiGoreng = new javax.swing.JLabel();
        jTextField_Pembayaran_Dana_NasiGoreng = new javax.swing.JTextField();
        jTextField_Pembayaran_Ovo_NasiGoreng = new javax.swing.JTextField();
        jTextField_Pembayaran_Gopay_NasiGoreng = new javax.swing.JTextField();
        jTextField_Pembayaran_Shopepay_NasiGoreng = new javax.swing.JTextField();
        jTextField_Pembayaran_Langsung_NasiGoreng = new javax.swing.JTextField();
        jButton_BeliSekarangPembayaranNasiGoreng = new javax.swing.JButton();
        jCheckBox_Pembayaran_Dana_NasiGoreng = new javax.swing.JCheckBox();
        jCheckBox_Pembayaran_Ovo_NasiGoreng = new javax.swing.JCheckBox();
        jCheckBox_Pembayaran_Gopay_NasiGoreng = new javax.swing.JCheckBox();
        jCheckBox_Pembayaran_Shopepay_NasiGoreng = new javax.swing.JCheckBox();
        jCheckBox_Pembayaran_Langsung_NasiGoreng = new javax.swing.JCheckBox();
        jPanel_JikaDiaPesanKwetiawGoreng = new javax.swing.JPanel();
        jButton_BackPembayaranKwetiawGoreng = new javax.swing.JButton();
        jLabel64 = new javax.swing.JLabel();
        jLabel_Pembayaran_Dana_KwetiawGoreng = new javax.swing.JLabel();
        jLabel_Pembayaran_Ovo_Kwetiaw = new javax.swing.JLabel();
        jLabel_Pembayaran_Gopay_KwetiawGoreng = new javax.swing.JLabel();
        jLabel_Pembayaran_Shopepay_KwetiawGoreng = new javax.swing.JLabel();
        jLabel_Pembayaran_Langsung_KwetiawGoreng = new javax.swing.JLabel();
        jTextField_Pembayaran_Dana_KwetiawGoreng = new javax.swing.JTextField();
        jTextField_Pembayaran_Ovo_KwetiawGoreng = new javax.swing.JTextField();
        jTextField_Pembayaran_Gopay_KwetiawGoreng = new javax.swing.JTextField();
        jTextField_Pembayaran_Shopepay_KwetiawGoreng = new javax.swing.JTextField();
        jTextField_Pembayaran_Langsung_KwetiawGoreng = new javax.swing.JTextField();
        jCheckBox_Pembayaran_Dana_KwetiawGoreng = new javax.swing.JCheckBox();
        jCheckBox_Pembayaran_Ovo_KwetiawGoreng = new javax.swing.JCheckBox();
        jCheckBox_Pembayaran_Gopay_KwetiawGoreng = new javax.swing.JCheckBox();
        jCheckBox_Pembayaran_Shopepay_KwetiawGoreng = new javax.swing.JCheckBox();
        jCheckBox_Pembayaran_Langsung_KwetiawGoreng = new javax.swing.JCheckBox();
        jButton_BeliSekarangPembayaranKwetiawGoreng = new javax.swing.JButton();
        jPanel_JikaDiaPesanKopi = new javax.swing.JPanel();
        jButton_BackPembayaranKopi = new javax.swing.JButton();
        jLabel65 = new javax.swing.JLabel();
        jLabel_Pembayaran_Dana_Kopi = new javax.swing.JLabel();
        jLabel_Pembayaran_Ovo_Kopi = new javax.swing.JLabel();
        jLabel_Pembayaran_Gopay_Kopi = new javax.swing.JLabel();
        jLabel_Pembayaran_Shopepay_Kopi = new javax.swing.JLabel();
        jLabel_Pembayaran_Langsung_Kopi = new javax.swing.JLabel();
        jTextField_Pembayaran_Dana_Kopi = new javax.swing.JTextField();
        jTextField_Pembayaran_Ovo_Kopi = new javax.swing.JTextField();
        jTextField_Pembayaran_Gopay_Kopi = new javax.swing.JTextField();
        jTextField_Pembayaran_Shopepay_Kopi = new javax.swing.JTextField();
        jTextField_Pembayaran_Langsung_Kopi = new javax.swing.JTextField();
        jButton_BeliSekarangPembayaranKopi = new javax.swing.JButton();
        jCheckBox_Pembayaran_Dana_Kopi = new javax.swing.JCheckBox();
        jCheckBox_Pembayaran_Ovo_Kopi = new javax.swing.JCheckBox();
        jCheckBox_Pembayaran_Gopay_Kopi = new javax.swing.JCheckBox();
        jCheckBox_Pembayaran_Shopepay_Kopi = new javax.swing.JCheckBox();
        jCheckBox_Pembayaran_Langsung_Kopi = new javax.swing.JCheckBox();
        jPanel_JikaDiaPesanEsTeh = new javax.swing.JPanel();
        jButton_BackPembayaranEsTeh = new javax.swing.JButton();
        jLabel66 = new javax.swing.JLabel();
        jLabel_Pembayaran_Dana_EsTeh = new javax.swing.JLabel();
        jLabel_Pembayaran_Ovo_EsTeh = new javax.swing.JLabel();
        jLabel_Pembayaran_Gopay_EsTeh = new javax.swing.JLabel();
        jLabel_Pembayaran_Shopepay_EsTeh = new javax.swing.JLabel();
        jLabel_Pembayaran_Langsung_EsTeh = new javax.swing.JLabel();
        jTextField_Pembayaran_Dana_EsTeh = new javax.swing.JTextField();
        jTextField_Pembayaran_Ovo_EsTeh = new javax.swing.JTextField();
        jTextField_Pembayaran_Gopay_EsTeh = new javax.swing.JTextField();
        jTextField_Pembayaran_Shopepay_EsTeh = new javax.swing.JTextField();
        jTextField_Pembayaran_Langsung_EsTeh = new javax.swing.JTextField();
        jButton_BeliSekarangPembayaranEsTeh = new javax.swing.JButton();
        jCheckBox_Pembayaran_Dana_EsTeh = new javax.swing.JCheckBox();
        jCheckBox_Pembayaran_Ovo_EsTeh = new javax.swing.JCheckBox();
        jCheckBox_Pembayaran_Gopay_EsTeh = new javax.swing.JCheckBox();
        jCheckBox_Pembayaran_Shopepay_EsTeh = new javax.swing.JCheckBox();
        jCheckBox_Pembayaran_Langsung_EsTeh = new javax.swing.JCheckBox();
        jPanel_JikaDiaPesanAirMineral = new javax.swing.JPanel();
        jButton_BackPembayaranAirMineral = new javax.swing.JButton();
        jLabel67 = new javax.swing.JLabel();
        jLabel_Pembayaran_Dana_AirMineral = new javax.swing.JLabel();
        jLabel_Pembayaran_Ovo_AirMineral = new javax.swing.JLabel();
        jLabel_Pembayaran_Gopay_AirMineral = new javax.swing.JLabel();
        jLabel_Pembayaran_Shopepay_AirMineral = new javax.swing.JLabel();
        jLabel_Pembayaran_Langsung_AirMineral = new javax.swing.JLabel();
        jTextField_Pembayaran_Dana_AirMineral = new javax.swing.JTextField();
        jTextField_Pembayaran_Ovo_AirMineral = new javax.swing.JTextField();
        jTextField_Pembayaran_Gopay_AirMineral = new javax.swing.JTextField();
        jTextField_Pembayaran_Shopepay_AirMineral = new javax.swing.JTextField();
        jTextField_Pembayaran_Langsung_AirMineral = new javax.swing.JTextField();
        jButton_BeliSekarangPembayaranAirMineral = new javax.swing.JButton();
        jCheckBox_Pembayaran_Dana_AirMineral = new javax.swing.JCheckBox();
        jCheckBox_Pembayaran_Ovo_AirMineral = new javax.swing.JCheckBox();
        jCheckBox_Pembayaran_Gopay_AirMineral = new javax.swing.JCheckBox();
        jCheckBox_Pembayaran_Shopepay_AirMineral = new javax.swing.JCheckBox();
        jCheckBox_Pembayaran_Langsung_AirMineral = new javax.swing.JCheckBox();
        jPanel_JikaDiaPesanCocaCola = new javax.swing.JPanel();
        jButton_BackPembayaranCocaCola = new javax.swing.JButton();
        jLabel68 = new javax.swing.JLabel();
        jLabel_Pembayaran_Dana_CocaCola = new javax.swing.JLabel();
        jLabel_Pembayaran_Ovo_CocaCola = new javax.swing.JLabel();
        jLabel_Pembayaran_Gopay_CocaCola = new javax.swing.JLabel();
        jLabel_Pembayaran_Shopepay_CocaCola = new javax.swing.JLabel();
        jLabel_Pembayaran_Langsung_CocaCola = new javax.swing.JLabel();
        jTextField_Pembayaran_Dana_CocaCola = new javax.swing.JTextField();
        jTextField_Pembayaran_Ovo_CocaCola = new javax.swing.JTextField();
        jTextField_Pembayaran_Gopay_CocaCola = new javax.swing.JTextField();
        jTextField_Pembayaran_Shopepay_CocaCola = new javax.swing.JTextField();
        jTextField_Pembayaran_Langsung_CocaCola = new javax.swing.JTextField();
        jButton_BeliSekarangPembayaranCocaCola = new javax.swing.JButton();
        jCheckBox_Pembayaran_Dana_CocaCola = new javax.swing.JCheckBox();
        jCheckBox_Pembayaran_Ovo_CocaCola = new javax.swing.JCheckBox();
        jCheckBox_Pembayaran_Gopay_CocaCola = new javax.swing.JCheckBox();
        jCheckBox_Pembayaran_Shopepay_CocaCola = new javax.swing.JCheckBox();
        jCheckBox_Pembayaran_Langsung_CocaCola = new javax.swing.JCheckBox();
        jPanel_JikaDiaPesanSprite = new javax.swing.JPanel();
        jButton_BackPembayaranSprite = new javax.swing.JButton();
        jLabel69 = new javax.swing.JLabel();
        jLabel_Pembayaran_Dana_Sprite = new javax.swing.JLabel();
        jLabel_Pembayaran_Ovo_Sprite = new javax.swing.JLabel();
        jLabel_Pembayaran_Gopay_Sprite = new javax.swing.JLabel();
        jLabel_Pembayaran_Shopepay_Sprite = new javax.swing.JLabel();
        jLabel_Pembayaran_Langsung_Sprite = new javax.swing.JLabel();
        jTextField_Pembayaran_Dana_Sprite = new javax.swing.JTextField();
        jTextField_Pembayaran_Ovo_Sprite = new javax.swing.JTextField();
        jTextField_Pembayaran_Gopay_Sprite = new javax.swing.JTextField();
        jTextField_Pembayaran_Shopepay_Sprite = new javax.swing.JTextField();
        jTextField_Pembayaran_Langsung_Sprite = new javax.swing.JTextField();
        jButton_BeliSekarangPembayaranSprite = new javax.swing.JButton();
        jCheckBox_Pembayaran_Dana_Sprite = new javax.swing.JCheckBox();
        jCheckBox_Pembayaran_Ovo_Sprite = new javax.swing.JCheckBox();
        jCheckBox_Pembayaran_Gopay_Sprite = new javax.swing.JCheckBox();
        jCheckBox_Pembayaran_Shopepay_Sprite = new javax.swing.JCheckBox();
        jCheckBox_Pembayaran_Langsung_Sprite = new javax.swing.JCheckBox();
        jPanel_Waktu = new javax.swing.JPanel();
        jLabel27 = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        jLabel56 = new javax.swing.JLabel();
        jLabel57 = new javax.swing.JLabel();
        jLabel58 = new javax.swing.JLabel();
        jLabel59 = new javax.swing.JLabel();
        jLabel_NamaDiWaktu = new javax.swing.JLabel();
        jLabel_WaktuYgTerpakai = new javax.swing.JLabel();
        jLabel_Mulai = new javax.swing.JLabel();
        jLabel_SaldoWaktu = new javax.swing.JLabel();
        jLabel_Tanggal = new javax.swing.JLabel();
        jLabel_WaktuSekarang = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel_Home.setPreferredSize(new java.awt.Dimension(820, 600));
        jPanel_Home.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel_Header_Nickname.setBackground(new java.awt.Color(0, 0, 28));

        jLabel_Profile.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel_WaktuMenuAwal.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel_WaktuMenuAwal.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_WaktuMenuAwal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_WaktuMenuAwal.setToolTipText("");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Waktu Anda Tersisa");

        jLabel_Username.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel_Username.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_Username.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        javax.swing.GroupLayout jPanel_Header_NicknameLayout = new javax.swing.GroupLayout(jPanel_Header_Nickname);
        jPanel_Header_Nickname.setLayout(jPanel_Header_NicknameLayout);
        jPanel_Header_NicknameLayout.setHorizontalGroup(
            jPanel_Header_NicknameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_Header_NicknameLayout.createSequentialGroup()
                .addGroup(jPanel_Header_NicknameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel_Header_NicknameLayout.createSequentialGroup()
                        .addGap(118, 118, 118)
                        .addComponent(jLabel_WaktuMenuAwal, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_Header_NicknameLayout.createSequentialGroup()
                        .addGap(115, 115, 115)
                        .addComponent(jLabel1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 277, Short.MAX_VALUE)
                .addComponent(jLabel_Username, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel_Profile, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel_Header_NicknameLayout.setVerticalGroup(
            jPanel_Header_NicknameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_Header_NicknameLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel_WaktuMenuAwal, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel_Header_NicknameLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel_Header_NicknameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel_Username, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_Profile, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel_Home.add(jPanel_Header_Nickname, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 820, -1));

        jLabel_Netflix.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/netflix_icon_161073 (2).png"))); // NOI18N
        jLabel_Netflix.setText("jLabel2");
        jLabel_Netflix.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_Netflix.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_NetflixMouseClicked(evt);
            }
        });
        jPanel_Home.add(jLabel_Netflix, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 260, 80, 90));

        jLabel_Chrome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/brand_google_chrome_icon_157340.png"))); // NOI18N
        jLabel_Chrome.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_Chrome.setPreferredSize(new java.awt.Dimension(112, 72));
        jLabel_Chrome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_ChromeMouseClicked(evt);
            }
        });
        jPanel_Home.add(jLabel_Chrome, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 270, 70, 70));

        jLabel_Discord.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/discord_94308.png"))); // NOI18N
        jLabel_Discord.setText("jLabel2");
        jLabel_Discord.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_Discord.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_DiscordMouseClicked(evt);
            }
        });
        jPanel_Home.add(jLabel_Discord, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 270, 70, 70));

        jLabel_GameMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/gameIcon.png"))); // NOI18N
        jLabel_GameMenu.setText("jLabel3");
        jLabel_GameMenu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_GameMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_GameMenuMouseClicked(evt);
            }
        });
        jPanel_Home.add(jLabel_GameMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 270, 70, 70));

        jLabel_Steam.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/steam_icon2.png"))); // NOI18N
        jLabel_Steam.setText("jLabel2");
        jLabel_Steam.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_Steam.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_SteamMouseClicked(evt);
            }
        });
        jPanel_Home.add(jLabel_Steam, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 270, 70, 70));

        jLabel_Tiktok.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/tiktok_logo_icon_188431.png"))); // NOI18N
        jLabel_Tiktok.setText("jLabel3");
        jLabel_Tiktok.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_Tiktok.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_TiktokMouseClicked(evt);
            }
        });
        jPanel_Home.add(jLabel_Tiktok, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 260, 70, 80));

        jLabel_Spotify.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/spotify_icon_130826 (1).png"))); // NOI18N
        jLabel_Spotify.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_Spotify.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_SpotifyMouseClicked(evt);
            }
        });
        jPanel_Home.add(jLabel_Spotify, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 270, -1, 60));

        jLabel_TulisanNetflix.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel_TulisanNetflix.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_TulisanNetflix.setText("Netflix");
        jPanel_Home.add(jLabel_TulisanNetflix, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 350, 50, -1));

        jLabel_TulisanChrome.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel_TulisanChrome.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_TulisanChrome.setText("Chrome");
        jPanel_Home.add(jLabel_TulisanChrome, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 350, 60, -1));

        jLabel_TulisanDiscord.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel_TulisanDiscord.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_TulisanDiscord.setText("Discord");
        jPanel_Home.add(jLabel_TulisanDiscord, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 350, 60, -1));

        jLabel_TulisanGameMenu.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel_TulisanGameMenu.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_TulisanGameMenu.setText("Game Menu");
        jPanel_Home.add(jLabel_TulisanGameMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 350, 80, -1));

        jLabel_TulisanSteam.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel_TulisanSteam.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_TulisanSteam.setText("Steam");
        jPanel_Home.add(jLabel_TulisanSteam, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 350, 50, -1));

        jLabel_TulisanTiktok.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel_TulisanTiktok.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_TulisanTiktok.setText("Tiktok");
        jPanel_Home.add(jLabel_TulisanTiktok, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 350, 50, -1));

        jLabel_TulisanSpotify.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel_TulisanSpotify.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_TulisanSpotify.setText("Spotify");
        jPanel_Home.add(jLabel_TulisanSpotify, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 350, 50, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Game Info");
        jPanel_Home.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 410, 100, -1));

        jLabel_TournamentInfo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Event Pb.png"))); // NOI18N
        jPanel_Home.add(jLabel_TournamentInfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 460, 320, 130));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("CyberCafe Info");
        jPanel_Home.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 416, 140, 20));

        jLabel_TulisanBantuKami.setBackground(new java.awt.Color(255, 255, 255));
        jLabel_TulisanBantuKami.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel_TulisanBantuKami.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_TulisanBantuKami.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_TulisanBantuKami.setText("Bantu Kami Menjadi Terbaik");
        jPanel_Home.add(jLabel_TulisanBantuKami, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 460, 320, 30));

        jLabel_TulisanBelumUpdate.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel_TulisanBelumUpdate.setForeground(new java.awt.Color(255, 51, 51));
        jLabel_TulisanBelumUpdate.setText("Jika Ada Game Yang Belum Terupdate");
        jPanel_Home.add(jLabel_TulisanBelumUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 490, 330, 30));

        jLabel_TulisanMenghubungi.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel_TulisanMenghubungi.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_TulisanMenghubungi.setText("Mohon  Untuk Menghubungi Operator");
        jPanel_Home.add(jLabel_TulisanMenghubungi, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 520, 330, 30));

        jLabel_TulisanTerimaKasih.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel_TulisanTerimaKasih.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_TulisanTerimaKasih.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_TulisanTerimaKasih.setText("Terima Kasih !");
        jPanel_Home.add(jLabel_TulisanTerimaKasih, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 550, 330, 30));

        jLabel_SelamatDatang.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jLabel_SelamatDatang.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_SelamatDatang.setText("SELAMAT DATANG DI WARNET CITAYAM PRIDE");
        jPanel_Home.add(jLabel_SelamatDatang, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 130, 553, 61));

        jLabel_GambarWallpaper.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Pinterest_Tokyo2.jpg"))); // NOI18N
        jPanel_Home.add(jLabel_GambarWallpaper, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 1000, 660));

        jPanel1.add(jPanel_Home, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 0, 820, -1));

        jPanel_MenuDashboard.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(78, 11, 104));
        jPanel2.setPreferredSize(new java.awt.Dimension(180, 600));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel_Menu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icon_Garis_3_BlackColor.png"))); // NOI18N
        jLabel_Menu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_Menu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_MenuMouseClicked(evt);
            }
        });
        jPanel2.add(jLabel_Menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 32, 38, 37));

        jLabel_Gambar_Home.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icon_home.png"))); // NOI18N
        jLabel_Gambar_Home.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_Gambar_Home.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_Gambar_HomeMouseClicked(evt);
            }
        });
        jPanel2.add(jLabel_Gambar_Home, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 170, -1, 25));

        jLabel_Tulisan_Home.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel_Tulisan_Home.setText("Home");
        jLabel_Tulisan_Home.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_Tulisan_Home.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_Tulisan_HomeMouseClicked(evt);
            }
        });
        jPanel2.add(jLabel_Tulisan_Home, new org.netbeans.lib.awtextra.AbsoluteConstraints(62, 170, 63, -1));

        jLabel_Gambar_Order.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8-food-50.png"))); // NOI18N
        jLabel_Gambar_Order.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_Gambar_Order.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_Gambar_OrderMouseClicked(evt);
            }
        });
        jPanel2.add(jLabel_Gambar_Order, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 295, 42, 25));

        jLabel_Tulisan_Order.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel_Tulisan_Order.setText("Order");
        jLabel_Tulisan_Order.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_Tulisan_Order.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_Tulisan_OrderMouseClicked(evt);
            }
        });
        jPanel2.add(jLabel_Tulisan_Order, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 295, 63, -1));

        jLabel_Gambar_Waktu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icon_clock.png"))); // NOI18N
        jLabel_Gambar_Waktu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_Gambar_Waktu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_Gambar_WaktuMouseClicked(evt);
            }
        });
        jPanel2.add(jLabel_Gambar_Waktu, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 349, -1, 25));

        jLabel_Tulisan_Waktu.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel_Tulisan_Waktu.setText("Waktu");
        jLabel_Tulisan_Waktu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_Tulisan_Waktu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_Tulisan_WaktuMouseClicked(evt);
            }
        });
        jPanel2.add(jLabel_Tulisan_Waktu, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 349, 63, -1));

        jLabel_Tulisan_Logout.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel_Tulisan_Logout.setText("Logout");
        jLabel_Tulisan_Logout.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_Tulisan_Logout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_Tulisan_LogoutMouseClicked(evt);
            }
        });
        jPanel2.add(jLabel_Tulisan_Logout, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 403, 63, -1));

        jLabel_Gambar_Logout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8-logout-48.png"))); // NOI18N
        jLabel_Gambar_Logout.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_Gambar_Logout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_Gambar_LogoutMouseClicked(evt);
            }
        });
        jPanel2.add(jLabel_Gambar_Logout, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 403, 34, 25));

        jLabel_Gambar_Game.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8-ps-controller-50.png"))); // NOI18N
        jLabel_Gambar_Game.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_Gambar_Game.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_Gambar_GameMouseClicked(evt);
            }
        });
        jPanel2.add(jLabel_Gambar_Game, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 224, -1, 42));

        jLabel_Tulisan_Game.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel_Tulisan_Game.setText("Game");
        jLabel_Tulisan_Game.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_Tulisan_Game.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_Tulisan_GameMouseClicked(evt);
            }
        });
        jPanel2.add(jLabel_Tulisan_Game, new org.netbeans.lib.awtextra.AbsoluteConstraints(62, 224, 63, 32));

        jPanel_MenuDashboard.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 600));

        jLabel_Menu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icon_Garis_3_BlackColor.png"))); // NOI18N
        jLabel_Menu1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_Menu1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_Menu1MouseClicked(evt);
            }
        });
        jPanel_MenuDashboard.add(jLabel_Menu1, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 32, 38, 37));

        jPanel1.add(jPanel_MenuDashboard, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 180, 600));

        jPanel_Game.setBackground(new java.awt.Color(255, 255, 255));
        jPanel_Game.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel_Header_Game.setBackground(new java.awt.Color(41, 39, 41));
        jPanel_Header_Game.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel_AllGames.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel_AllGames.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_AllGames.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_AllGames.setText("All Apps & Games");
        jLabel_AllGames.setToolTipText("");
        jLabel_AllGames.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_AllGames.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_AllGamesMouseClicked(evt);
            }
        });
        jPanel_Header_Game.add(jLabel_AllGames, new org.netbeans.lib.awtextra.AbsoluteConstraints(39, 18, 130, 29));

        jLabel_OnlineGames.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel_OnlineGames.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_OnlineGames.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_OnlineGames.setText("Online Games");
        jLabel_OnlineGames.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_OnlineGames.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_OnlineGamesMouseClicked(evt);
            }
        });
        jPanel_Header_Game.add(jLabel_OnlineGames, new org.netbeans.lib.awtextra.AbsoluteConstraints(187, 18, 131, 29));

        jLabel_OfflineGames.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel_OfflineGames.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_OfflineGames.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_OfflineGames.setText("Offline Games");
        jLabel_OfflineGames.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_OfflineGames.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_OfflineGamesMouseClicked(evt);
            }
        });
        jPanel_Header_Game.add(jLabel_OfflineGames, new org.netbeans.lib.awtextra.AbsoluteConstraints(336, 18, 131, 29));

        jLabel_AndroidGames.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel_AndroidGames.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_AndroidGames.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_AndroidGames.setText("Android Games");
        jLabel_AndroidGames.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_AndroidGames.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_AndroidGamesMouseClicked(evt);
            }
        });
        jPanel_Header_Game.add(jLabel_AndroidGames, new org.netbeans.lib.awtextra.AbsoluteConstraints(485, 18, 131, 29));

        jTextField_Search.setText("Search...");
        jTextField_Search.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField_SearchFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField_SearchFocusLost(evt);
            }
        });
        jPanel_Header_Game.add(jTextField_Search, new org.netbeans.lib.awtextra.AbsoluteConstraints(634, 18, 165, 29));

        jPanel_Game.add(jPanel_Header_Game, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 820, 70));

        jPanel_Body_AllGames.setBackground(new java.awt.Color(255, 255, 255));
        jPanel_Body_AllGames.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel_AmongUs.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Among Us.jpg"))); // NOI18N
        jLabel_AmongUs.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_AmongUs.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_AmongUsMouseClicked(evt);
            }
        });
        jPanel_Body_AllGames.add(jLabel_AmongUs, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 90, 80));

        jLabel_Csgo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/CSGO.jpg"))); // NOI18N
        jLabel_Csgo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_Csgo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_CsgoMouseClicked(evt);
            }
        });
        jPanel_Body_AllGames.add(jLabel_Csgo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, 90, 80));

        jLabel_Codm.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Call Of Duty Mobile.jpg"))); // NOI18N
        jLabel_Codm.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_Codm.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_CodmMouseClicked(evt);
            }
        });
        jPanel_Body_AllGames.add(jLabel_Codm, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 90, 80));

        jLabel_Dota2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Dota 2 Logo.jpg"))); // NOI18N
        jLabel_Dota2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_Dota2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_Dota2MouseClicked(evt);
            }
        });
        jPanel_Body_AllGames.add(jLabel_Dota2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 410, 90, 80));

        jLabel_Dc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Discord.jpg"))); // NOI18N
        jLabel_Dc.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_Dc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_DcMouseClicked(evt);
            }
        });
        jPanel_Body_AllGames.add(jLabel_Dc, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 20, 90, 80));

        jLabel_AgeOfEmpire2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Age of Empire 2 The Conqueror.jpg"))); // NOI18N
        jLabel_AgeOfEmpire2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_AgeOfEmpire2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_AgeOfEmpire2MouseClicked(evt);
            }
        });
        jPanel_Body_AllGames.add(jLabel_AgeOfEmpire2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 20, 90, 80));

        jLabel_Battlefield3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Battlefield 3.jpg"))); // NOI18N
        jLabel_Battlefield3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_Battlefield3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_Battlefield3MouseClicked(evt);
            }
        });
        jPanel_Body_AllGames.add(jLabel_Battlefield3, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 20, 90, 80));

        jLabel_GtaSA.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/GTA SA.jpg"))); // NOI18N
        jLabel_GtaSA.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_GtaSA.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_GtaSAMouseClicked(evt);
            }
        });
        jPanel_Body_AllGames.add(jLabel_GtaSA, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 20, 90, 80));

        jLabel_Nox.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Nox Img.png"))); // NOI18N
        jLabel_Nox.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_Nox.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_NoxMouseClicked(evt);
            }
        });
        jPanel_Body_AllGames.add(jLabel_Nox, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 20, 90, 80));

        jLabel_Warcraft.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Warcraft.png"))); // NOI18N
        jLabel_Warcraft.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_Warcraft.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_WarcraftMouseClicked(evt);
            }
        });
        jPanel_Body_AllGames.add(jLabel_Warcraft, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 20, 90, 80));

        jLabel_LdPlayer9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Ld Player Logo.png"))); // NOI18N
        jLabel_LdPlayer9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_LdPlayer9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_LdPlayer9MouseClicked(evt);
            }
        });
        jPanel_Body_AllGames.add(jLabel_LdPlayer9, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 150, 90, 80));

        jLabel_ApexLegends.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Apex Legend.jpg"))); // NOI18N
        jLabel_ApexLegends.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_ApexLegends.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_ApexLegendsMouseClicked(evt);
            }
        });
        jPanel_Body_AllGames.add(jLabel_ApexLegends, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 150, 90, 80));

        jLabel_GameLoop.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/GameLoop.png"))); // NOI18N
        jLabel_GameLoop.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_GameLoop.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_GameLoopMouseClicked(evt);
            }
        });
        jPanel_Body_AllGames.add(jLabel_GameLoop, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 150, 90, 80));

        jLabel_Fortnite.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Fortnite.png"))); // NOI18N
        jLabel_Fortnite.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_Fortnite.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_FortniteMouseClicked(evt);
            }
        });
        jPanel_Body_AllGames.add(jLabel_Fortnite, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 150, 90, 80));

        jLabel_EuroTruck2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Euro Truck Simulator 2.jpg"))); // NOI18N
        jLabel_EuroTruck2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_EuroTruck2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_EuroTruck2MouseClicked(evt);
            }
        });
        jPanel_Body_AllGames.add(jLabel_EuroTruck2, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 150, 90, 80));

        jLabel_Left4dead2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Left 4 Dead 2.jpg"))); // NOI18N
        jLabel_Left4dead2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_Left4dead2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_Left4dead2MouseClicked(evt);
            }
        });
        jPanel_Body_AllGames.add(jLabel_Left4dead2, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 150, 90, 80));

        jLabel_Netbeans.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Netbeans Img.png"))); // NOI18N
        jLabel_Netbeans.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_Netbeans.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_NetbeansMouseClicked(evt);
            }
        });
        jPanel_Body_AllGames.add(jLabel_Netbeans, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 280, 90, 80));

        jLabel_lostsaga.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Lost Sage logo.jpg"))); // NOI18N
        jLabel_lostsaga.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_lostsaga.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_lostsagaMouseClicked(evt);
            }
        });
        jPanel_Body_AllGames.add(jLabel_lostsaga, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 280, 90, 80));

        jLabel_MotoGp2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/MotoGp.jpg"))); // NOI18N
        jLabel_MotoGp2.setText("jLabel4");
        jLabel_MotoGp2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_MotoGp2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_MotoGp2MouseClicked(evt);
            }
        });
        jPanel_Body_AllGames.add(jLabel_MotoGp2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 280, 90, 80));

        jLabel_MotoGp3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/MotoGp.jpg"))); // NOI18N
        jLabel_MotoGp3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_MotoGp3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_MotoGp3MouseClicked(evt);
            }
        });
        jPanel_Body_AllGames.add(jLabel_MotoGp3, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 280, 90, 80));

        jLabel_Lol.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/League of Legends.png"))); // NOI18N
        jLabel_Lol.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_Lol.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_LolMouseClicked(evt);
            }
        });
        jPanel_Body_AllGames.add(jLabel_Lol, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 280, 90, 80));

        jLabel_Valorant.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/VALORANT.png"))); // NOI18N
        jLabel_Valorant.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_Valorant.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_ValorantMouseClicked(evt);
            }
        });
        jPanel_Body_AllGames.add(jLabel_Valorant, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 280, 90, 80));

        jLabel_Destiny2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Destiny 2.jpg"))); // NOI18N
        jLabel_Destiny2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_Destiny2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_Destiny2MouseClicked(evt);
            }
        });
        jPanel_Body_AllGames.add(jLabel_Destiny2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 410, 90, 80));

        jLabel_NetflixAllGames.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/netflix_icon_161073.png"))); // NOI18N
        jLabel_NetflixAllGames.setText("jLabel5");
        jLabel_NetflixAllGames.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_NetflixAllGames.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_NetflixAllGamesMouseClicked(evt);
            }
        });
        jPanel_Body_AllGames.add(jLabel_NetflixAllGames, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 410, 90, 80));

        jLabel_GTAV.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/The GTA V Dilemma.jpg"))); // NOI18N
        jLabel_GTAV.setText("jLabel4");
        jLabel_GTAV.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_GTAV.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_GTAVMouseClicked(evt);
            }
        });
        jPanel_Body_AllGames.add(jLabel_GTAV, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 410, 90, 80));

        jLabel_VisualStudioCode.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Visual Studio Code Img.jpg"))); // NOI18N
        jLabel_VisualStudioCode.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_VisualStudioCode.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_VisualStudioCodeMouseClicked(evt);
            }
        });
        jPanel_Body_AllGames.add(jLabel_VisualStudioCode, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 410, 90, 80));

        jLabel_Whatsapp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Whatsapp _ Icono Gratis.png"))); // NOI18N
        jLabel_Whatsapp.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_Whatsapp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_WhatsappMouseClicked(evt);
            }
        });
        jPanel_Body_AllGames.add(jLabel_Whatsapp, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 410, 90, 80));

        jLabel_SteamAllGames.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Steam logo.png"))); // NOI18N
        jLabel_SteamAllGames.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_SteamAllGames.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_SteamAllGamesMouseClicked(evt);
            }
        });
        jPanel_Body_AllGames.add(jLabel_SteamAllGames, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 410, 90, 80));

        jLabel_TulisanAmongUs.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel_TulisanAmongUs.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_TulisanAmongUs.setText("Among Us");
        jPanel_Body_AllGames.add(jLabel_TulisanAmongUs, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 90, 30));

        jLabel_TulisanDc.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel_TulisanDc.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_TulisanDc.setText("Discord");
        jPanel_Body_AllGames.add(jLabel_TulisanDc, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 110, 90, 30));

        jLabel_TulisanAgeOfEmpire2.setText("Age Of Empire II");
        jPanel_Body_AllGames.add(jLabel_TulisanAgeOfEmpire2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 110, 90, 30));

        jLabel_TulisanBattleField3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel_TulisanBattleField3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_TulisanBattleField3.setText("Battle Field 3");
        jPanel_Body_AllGames.add(jLabel_TulisanBattleField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 110, 90, 30));

        jLabel_TulisanGTASanAndreas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_TulisanGTASanAndreas.setText("GTA San Andreas");
        jPanel_Body_AllGames.add(jLabel_TulisanGTASanAndreas, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 110, 100, 30));

        jLabel_TulisanNox.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel_TulisanNox.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_TulisanNox.setText("Nox");
        jPanel_Body_AllGames.add(jLabel_TulisanNox, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 110, 90, 30));

        jLabel_TulisanWarcraft.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel_TulisanWarcraft.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_TulisanWarcraft.setText("Warcraft");
        jPanel_Body_AllGames.add(jLabel_TulisanWarcraft, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 110, 90, 30));

        jLabel_TulisanCodMobile.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel_TulisanCodMobile.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_TulisanCodMobile.setText("Cod Mobile");
        jPanel_Body_AllGames.add(jLabel_TulisanCodMobile, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 90, 30));

        jLabel_TulisanLDPlayer9.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel_TulisanLDPlayer9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_TulisanLDPlayer9.setText("Ld Player 9");
        jPanel_Body_AllGames.add(jLabel_TulisanLDPlayer9, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 240, 90, 30));

        jLabel_TulisanApexLegends.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel_TulisanApexLegends.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_TulisanApexLegends.setText("Apex Legends");
        jPanel_Body_AllGames.add(jLabel_TulisanApexLegends, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 240, 90, 30));

        jLabel_TulisanGameLoop.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel_TulisanGameLoop.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_TulisanGameLoop.setText("GameLoop");
        jPanel_Body_AllGames.add(jLabel_TulisanGameLoop, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 240, 90, 30));

        jLabel_TulisanFortnite.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel_TulisanFortnite.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_TulisanFortnite.setText("Fortnite");
        jPanel_Body_AllGames.add(jLabel_TulisanFortnite, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 240, 90, 30));

        jLabel_TulisanEuroTruck2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel_TulisanEuroTruck2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_TulisanEuroTruck2.setText("Euro Truck 2");
        jPanel_Body_AllGames.add(jLabel_TulisanEuroTruck2, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 240, 90, 30));

        jLabel_TulisanLeft4Dead2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel_TulisanLeft4Dead2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_TulisanLeft4Dead2.setText("Left 4 Dead 2");
        jPanel_Body_AllGames.add(jLabel_TulisanLeft4Dead2, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 240, 90, 30));

        jLabel_TulisanCSGO.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel_TulisanCSGO.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_TulisanCSGO.setText("CSGO");
        jPanel_Body_AllGames.add(jLabel_TulisanCSGO, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 370, 90, 30));

        jLabel_TulisanNetbeans.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel_TulisanNetbeans.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_TulisanNetbeans.setText("Netbeans");
        jPanel_Body_AllGames.add(jLabel_TulisanNetbeans, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 370, 90, 30));

        jLabel_TulisanLostsaga.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel_TulisanLostsaga.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_TulisanLostsaga.setText("Lostsaga");
        jPanel_Body_AllGames.add(jLabel_TulisanLostsaga, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 370, 90, 30));

        jLabel_TulisanMotoGp2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel_TulisanMotoGp2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_TulisanMotoGp2.setText("MotoGp2");
        jPanel_Body_AllGames.add(jLabel_TulisanMotoGp2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 370, 90, 30));

        jLabel_TulisanMotoGp3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel_TulisanMotoGp3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_TulisanMotoGp3.setText("MotoGp3");
        jPanel_Body_AllGames.add(jLabel_TulisanMotoGp3, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 370, 90, 30));

        jLabel_TulisanLOL.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_TulisanLOL.setText("League Of Legends");
        jPanel_Body_AllGames.add(jLabel_TulisanLOL, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 370, 110, 30));

        jLabel_TulisanValorant.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel_TulisanValorant.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_TulisanValorant.setText("Valorant");
        jPanel_Body_AllGames.add(jLabel_TulisanValorant, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 370, 90, 30));

        jLabel_TulisanDota2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel_TulisanDota2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_TulisanDota2.setText("Dota 2");
        jPanel_Body_AllGames.add(jLabel_TulisanDota2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 500, 90, 20));

        jLabel_TulisanDestiny2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel_TulisanDestiny2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_TulisanDestiny2.setText("Destiny 2");
        jPanel_Body_AllGames.add(jLabel_TulisanDestiny2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 500, 90, 20));

        jLabel_TulisanAllNetflix.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel_TulisanAllNetflix.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_TulisanAllNetflix.setText("Netflix");
        jPanel_Body_AllGames.add(jLabel_TulisanAllNetflix, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 500, 90, 20));

        jLabel_TulisanGTAV.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel_TulisanGTAV.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_TulisanGTAV.setText("Gta V");
        jPanel_Body_AllGames.add(jLabel_TulisanGTAV, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 500, 90, 20));

        jLabel_TulisanVisualStudioCode.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_TulisanVisualStudioCode.setText("Visual Studio Code");
        jPanel_Body_AllGames.add(jLabel_TulisanVisualStudioCode, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 500, 110, 20));

        jLabel_TulisanAllWhatsApp.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel_TulisanAllWhatsApp.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_TulisanAllWhatsApp.setText("WhatsApp");
        jPanel_Body_AllGames.add(jLabel_TulisanAllWhatsApp, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 500, 90, 20));

        jLabel_TulisanAllSteam.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel_TulisanAllSteam.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_TulisanAllSteam.setText("Steam");
        jPanel_Body_AllGames.add(jLabel_TulisanAllSteam, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 500, 90, 20));

        jPanel_Game.add(jPanel_Body_AllGames, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 820, 530));

        jPanel_OnlineGames.setBackground(new java.awt.Color(255, 255, 255));
        jPanel_OnlineGames.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel_OnlineGames_AmongUs.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Among Us.jpg"))); // NOI18N
        jLabel_OnlineGames_AmongUs.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_OnlineGames_AmongUs.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_OnlineGames_AmongUsMouseClicked(evt);
            }
        });
        jPanel_OnlineGames.add(jLabel_OnlineGames_AmongUs, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 90, 80));

        jLabel_OnlineGames_CSGO.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/CSGO.jpg"))); // NOI18N
        jLabel_OnlineGames_CSGO.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_OnlineGames_CSGO.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_OnlineGames_CSGOMouseClicked(evt);
            }
        });
        jPanel_OnlineGames.add(jLabel_OnlineGames_CSGO, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 20, 90, 80));

        jLabel_OnlineGames_ApexLegends.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Apex Legend.jpg"))); // NOI18N
        jLabel_OnlineGames_ApexLegends.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_OnlineGames_ApexLegends.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_OnlineGames_ApexLegendsMouseClicked(evt);
            }
        });
        jPanel_OnlineGames.add(jLabel_OnlineGames_ApexLegends, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 20, 90, 80));

        jLabel_OnlineGames_CODM.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Call Of Duty Mobile.jpg"))); // NOI18N
        jLabel_OnlineGames_CODM.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_OnlineGames_CODM.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_OnlineGames_CODMMouseClicked(evt);
            }
        });
        jPanel_OnlineGames.add(jLabel_OnlineGames_CODM, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 20, 90, 80));

        jLabel_OnlineGames_Destiny2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Destiny 2.jpg"))); // NOI18N
        jLabel_OnlineGames_Destiny2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_OnlineGames_Destiny2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_OnlineGames_Destiny2MouseClicked(evt);
            }
        });
        jPanel_OnlineGames.add(jLabel_OnlineGames_Destiny2, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 20, 90, 80));

        jLabel_OnlineGames_Dota2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Dota 2 Logo.jpg"))); // NOI18N
        jLabel_OnlineGames_Dota2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_OnlineGames_Dota2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_OnlineGames_Dota2MouseClicked(evt);
            }
        });
        jPanel_OnlineGames.add(jLabel_OnlineGames_Dota2, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 20, 90, 80));

        jLabel_OnlineGames_Fortnite.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Fortnite.png"))); // NOI18N
        jLabel_OnlineGames_Fortnite.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_OnlineGames_Fortnite.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_OnlineGames_FortniteMouseClicked(evt);
            }
        });
        jPanel_OnlineGames.add(jLabel_OnlineGames_Fortnite, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 20, 90, 80));

        jLabel_OnlineGames_Left4Dead2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Left 4 Dead 2.jpg"))); // NOI18N
        jLabel_OnlineGames_Left4Dead2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_OnlineGames_Left4Dead2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_OnlineGames_Left4Dead2MouseClicked(evt);
            }
        });
        jPanel_OnlineGames.add(jLabel_OnlineGames_Left4Dead2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 90, 80));

        jLabel_OnlineGames_Lostsaga.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Lost Sage logo.jpg"))); // NOI18N
        jLabel_OnlineGames_Lostsaga.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_OnlineGames_Lostsaga.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_OnlineGames_LostsagaMouseClicked(evt);
            }
        });
        jPanel_OnlineGames.add(jLabel_OnlineGames_Lostsaga, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 150, 90, 80));

        jLabel_OnlineGames_EuroTruck2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Euro Truck Simulator 2.jpg"))); // NOI18N
        jLabel_OnlineGames_EuroTruck2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_OnlineGames_EuroTruck2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_OnlineGames_EuroTruck2MouseClicked(evt);
            }
        });
        jPanel_OnlineGames.add(jLabel_OnlineGames_EuroTruck2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 150, 90, 80));

        jLabel_OnlineGames_GTAV.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/The GTA V Dilemma.jpg"))); // NOI18N
        jLabel_OnlineGames_GTAV.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_OnlineGames_GTAV.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_OnlineGames_GTAVMouseClicked(evt);
            }
        });
        jPanel_OnlineGames.add(jLabel_OnlineGames_GTAV, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 150, 90, 80));

        jLabel_OnlineGames_Valorant.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/VALORANT.png"))); // NOI18N
        jLabel_OnlineGames_Valorant.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_OnlineGames_Valorant.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_OnlineGames_ValorantMouseClicked(evt);
            }
        });
        jPanel_OnlineGames.add(jLabel_OnlineGames_Valorant, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 150, 90, 80));

        jLabel_OnlineGames_LOL.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/League of Legends.png"))); // NOI18N
        jLabel_OnlineGames_LOL.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_OnlineGames_LOL.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_OnlineGames_LOLMouseClicked(evt);
            }
        });
        jPanel_OnlineGames.add(jLabel_OnlineGames_LOL, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 150, 90, 80));

        jLabel_OnlineGames_Steam.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Steam logo.png"))); // NOI18N
        jLabel_OnlineGames_Steam.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_OnlineGames_Steam.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_OnlineGames_SteamMouseClicked(evt);
            }
        });
        jPanel_OnlineGames.add(jLabel_OnlineGames_Steam, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 150, 90, 80));

        jLabel_OnlineAmongUS.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel_OnlineAmongUS.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_OnlineAmongUS.setText("Among Us");
        jPanel_OnlineGames.add(jLabel_OnlineAmongUS, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 90, 30));

        jLabel_OnlineCSGO.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel_OnlineCSGO.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_OnlineCSGO.setText("CSGO");
        jPanel_OnlineGames.add(jLabel_OnlineCSGO, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 110, 90, 30));

        jLabel_OnlineApexLegends.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel_OnlineApexLegends.setText("Apex Legends");
        jPanel_OnlineGames.add(jLabel_OnlineApexLegends, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 110, 90, 30));

        jLabel_OnlineCODM.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel_OnlineCODM.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_OnlineCODM.setText("COD Mobile");
        jPanel_OnlineGames.add(jLabel_OnlineCODM, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 110, 90, 30));

        jLabel_OnlineDestiny2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel_OnlineDestiny2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_OnlineDestiny2.setText("Destiny 2");
        jPanel_OnlineGames.add(jLabel_OnlineDestiny2, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 110, 90, 30));

        jLabel_OnlineDota2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel_OnlineDota2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_OnlineDota2.setText("Dota 2");
        jPanel_OnlineGames.add(jLabel_OnlineDota2, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 110, 90, 30));

        jLabel_OnlineFortnite.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel_OnlineFortnite.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_OnlineFortnite.setText("Fortnite");
        jPanel_OnlineGames.add(jLabel_OnlineFortnite, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 110, 90, 30));

        jLabel_OnlineLeft4Dead2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel_OnlineLeft4Dead2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_OnlineLeft4Dead2.setText("Left 4 Dead 2");
        jPanel_OnlineGames.add(jLabel_OnlineLeft4Dead2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 90, 30));

        jLabel_OnlineLostSaga.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel_OnlineLostSaga.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_OnlineLostSaga.setText("Lost Saga");
        jPanel_OnlineGames.add(jLabel_OnlineLostSaga, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 240, 90, 30));

        jLabel_OnlineEuroTruck2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel_OnlineEuroTruck2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_OnlineEuroTruck2.setText("Euro Truck 2");
        jPanel_OnlineGames.add(jLabel_OnlineEuroTruck2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 240, 90, 30));

        jLabel_OnlineGTAV.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel_OnlineGTAV.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_OnlineGTAV.setText("Gta V");
        jPanel_OnlineGames.add(jLabel_OnlineGTAV, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 240, 90, 30));

        jLabel_OnlineValorant.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel_OnlineValorant.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_OnlineValorant.setText("Valorant");
        jPanel_OnlineGames.add(jLabel_OnlineValorant, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 240, 90, 30));

        jLabel_OnlineLOL.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_OnlineLOL.setText("League Of Legends");
        jPanel_OnlineGames.add(jLabel_OnlineLOL, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 240, 110, 30));

        jLabel_OnlineSteam.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel_OnlineSteam.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_OnlineSteam.setText("Steam");
        jPanel_OnlineGames.add(jLabel_OnlineSteam, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 240, 90, 30));

        jPanel_Game.add(jPanel_OnlineGames, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 820, 530));

        jPanel_OfflineGames.setBackground(new java.awt.Color(255, 255, 255));
        jPanel_OfflineGames.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel_OfflineGTASA.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/GTA SA.jpg"))); // NOI18N
        jLabel_OfflineGTASA.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_OfflineGTASA.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_OfflineGTASAMouseClicked(evt);
            }
        });
        jPanel_OfflineGames.add(jLabel_OfflineGTASA, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 90, 80));

        jLabel_OfflineBattleField3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Battlefield 3.jpg"))); // NOI18N
        jLabel_OfflineBattleField3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_OfflineBattleField3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_OfflineBattleField3MouseClicked(evt);
            }
        });
        jPanel_OfflineGames.add(jLabel_OfflineBattleField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 20, 90, 80));

        jLabel_OfflineAgeOfEmpire2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Age of Empire 2 The Conqueror.jpg"))); // NOI18N
        jLabel_OfflineAgeOfEmpire2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_OfflineAgeOfEmpire2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_OfflineAgeOfEmpire2MouseClicked(evt);
            }
        });
        jPanel_OfflineGames.add(jLabel_OfflineAgeOfEmpire2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 20, 90, 80));

        jLabel_OfflineGTAV.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/The GTA V Dilemma.jpg"))); // NOI18N
        jLabel_OfflineGTAV.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_OfflineGTAV.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_OfflineGTAVMouseClicked(evt);
            }
        });
        jPanel_OfflineGames.add(jLabel_OfflineGTAV, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 20, 90, 80));

        jLabel_OfflineMotoGp2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/MotoGp.jpg"))); // NOI18N
        jLabel_OfflineMotoGp2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_OfflineMotoGp2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_OfflineMotoGp2MouseClicked(evt);
            }
        });
        jPanel_OfflineGames.add(jLabel_OfflineMotoGp2, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 20, 90, 80));

        jLabel_OfflineMotoGp3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/MotoGp.jpg"))); // NOI18N
        jLabel_OfflineMotoGp3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_OfflineMotoGp3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_OfflineMotoGp3MouseClicked(evt);
            }
        });
        jPanel_OfflineGames.add(jLabel_OfflineMotoGp3, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 20, 90, 80));

        jLabel_TulisanOfflineGtaSA.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_TulisanOfflineGtaSA.setText("GTA San Andreas");
        jPanel_OfflineGames.add(jLabel_TulisanOfflineGtaSA, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 100, 30));

        jLabel_TulisanOfflineBattleField3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel_TulisanOfflineBattleField3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_TulisanOfflineBattleField3.setText("Battle Field 3");
        jPanel_OfflineGames.add(jLabel_TulisanOfflineBattleField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 110, 90, 30));

        jLabel_TulisanOfflineAgeOfEmpire2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_TulisanOfflineAgeOfEmpire2.setText("Age Of Empire 2");
        jPanel_OfflineGames.add(jLabel_TulisanOfflineAgeOfEmpire2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 110, 90, 30));

        jLabel_TulisanOfflineGTAV.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel_TulisanOfflineGTAV.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_TulisanOfflineGTAV.setText("Gta V");
        jPanel_OfflineGames.add(jLabel_TulisanOfflineGTAV, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 110, 90, 30));

        jLabel_TulisanOfflineMotoGp2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel_TulisanOfflineMotoGp2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_TulisanOfflineMotoGp2.setText("MotoGp 2");
        jPanel_OfflineGames.add(jLabel_TulisanOfflineMotoGp2, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 110, 90, 30));

        jLabel_TulisanOfflineMotoGp3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel_TulisanOfflineMotoGp3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_TulisanOfflineMotoGp3.setText("MotoGp 3");
        jPanel_OfflineGames.add(jLabel_TulisanOfflineMotoGp3, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 110, 90, 30));

        jPanel_Game.add(jPanel_OfflineGames, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 820, 530));

        jPanel_AndroidGames.setBackground(new java.awt.Color(255, 255, 255));
        jPanel_AndroidGames.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel_AndroidGameLoop.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/GameLoop.png"))); // NOI18N
        jLabel_AndroidGameLoop.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_AndroidGameLoop.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_AndroidGameLoopMouseClicked(evt);
            }
        });
        jPanel_AndroidGames.add(jLabel_AndroidGameLoop, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 90, 80));

        jLabel_AndroidLdGame.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Ld Player Logo.png"))); // NOI18N
        jLabel_AndroidLdGame.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_AndroidLdGame.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_AndroidLdGameMouseClicked(evt);
            }
        });
        jPanel_AndroidGames.add(jLabel_AndroidLdGame, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 20, 90, 80));

        jLabel_AndroidNox.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Nox Img.png"))); // NOI18N
        jLabel_AndroidNox.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_AndroidNox.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_AndroidNoxMouseClicked(evt);
            }
        });
        jPanel_AndroidGames.add(jLabel_AndroidNox, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 20, 90, 80));

        jLabel_TulisanAndroidGameLoop.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel_TulisanAndroidGameLoop.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_TulisanAndroidGameLoop.setText("GameLoop");
        jPanel_AndroidGames.add(jLabel_TulisanAndroidGameLoop, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 90, 30));

        jLabel_TulisanAndroidLdPlayer9.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel_TulisanAndroidLdPlayer9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_TulisanAndroidLdPlayer9.setText("Ld Player 9");
        jPanel_AndroidGames.add(jLabel_TulisanAndroidLdPlayer9, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 110, 90, 30));

        jLabel_TulisanAndroidNox.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel_TulisanAndroidNox.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_TulisanAndroidNox.setText("Nox");
        jPanel_AndroidGames.add(jLabel_TulisanAndroidNox, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 110, 90, 30));

        jPanel_Game.add(jPanel_AndroidGames, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 820, 530));

        jPanel1.add(jPanel_Game, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 0, 820, 600));

        jPanel_Order.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel_HeaderOrder.setBackground(new java.awt.Color(41, 39, 41));
        jPanel_HeaderOrder.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel_Makanan.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel_Makanan.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_Makanan.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_Makanan.setText("Makanan");
        jLabel_Makanan.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_Makanan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_MakananMouseClicked(evt);
            }
        });
        jPanel_HeaderOrder.add(jLabel_Makanan, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, 320, 30));

        jLabel_Minuman.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel_Minuman.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_Minuman.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_Minuman.setText("Minuman");
        jLabel_Minuman.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_Minuman.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_MinumanMouseClicked(evt);
            }
        });
        jPanel_HeaderOrder.add(jLabel_Minuman, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 20, 330, 30));

        jPanel_Order.add(jPanel_HeaderOrder, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 820, 70));

        jPanel_Makanan.setBackground(new java.awt.Color(255, 255, 255));
        jPanel_Makanan.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel_MieBiasa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImageMakanan_Minuman/Mie Goreng Kuah Biasa.jpg"))); // NOI18N
        jLabel_MieBiasa.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_MieBiasa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_MieBiasaMouseClicked(evt);
            }
        });
        jPanel_Makanan.add(jLabel_MieBiasa, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 130, 120));

        jLabel_MieTelor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImageMakanan_Minuman/Mi Goreng Spesial.jpg"))); // NOI18N
        jLabel_MieTelor.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_MieTelor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_MieTelorMouseClicked(evt);
            }
        });
        jPanel_Makanan.add(jLabel_MieTelor, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 40, 130, 120));

        jLabel_SosTeng.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImageMakanan_Minuman/sosken.jpg"))); // NOI18N
        jLabel_SosTeng.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_SosTeng.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_SosTengMouseClicked(evt);
            }
        });
        jPanel_Makanan.add(jLabel_SosTeng, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 40, 130, 120));

        jLabel_KewtiawGoreng.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImageMakanan_Minuman/Kwetiaw Goreng.jpg"))); // NOI18N
        jLabel_KewtiawGoreng.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_KewtiawGoreng.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_KewtiawGorengMouseClicked(evt);
            }
        });
        jPanel_Makanan.add(jLabel_KewtiawGoreng, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 40, 130, 120));

        jLabel_NasiGoreng.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImageMakanan_Minuman/Nasi Goreng.jpg"))); // NOI18N
        jLabel_NasiGoreng.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_NasiGoreng.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_NasiGorengMouseClicked(evt);
            }
        });
        jPanel_Makanan.add(jLabel_NasiGoreng, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 40, 130, 120));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Mie Goreng / Kuah");
        jPanel_Makanan.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 130, 30));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel11.setText("Mie Goreng / Kuah + Telur");
        jPanel_Makanan.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 160, 170, 30));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Sos Teng");
        jPanel_Makanan.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 160, 130, 30));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("Nasi Goreng");
        jPanel_Makanan.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 160, 130, 30));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("Kwetiaw Goreng");
        jPanel_Makanan.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 160, 130, 30));

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("5K");
        jPanel_Makanan.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 130, 30));

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("12K");
        jPanel_Makanan.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 190, 130, 30));

        jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("10K");
        jPanel_Makanan.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 190, 130, 30));

        jLabel18.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText("15K");
        jPanel_Makanan.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 190, 130, 30));

        jLabel19.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setText("15K");
        jPanel_Makanan.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 190, 130, 30));

        jPanel_Order.add(jPanel_Makanan, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 820, 530));

        jPanel_Minuman.setBackground(new java.awt.Color(255, 255, 255));
        jPanel_Minuman.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel_Kopi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImageMakanan_Minuman/Kopi.jpg"))); // NOI18N
        jLabel_Kopi.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_Kopi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_KopiMouseClicked(evt);
            }
        });
        jPanel_Minuman.add(jLabel_Kopi, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 130, 120));

        jLabel_IceTea.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImageMakanan_Minuman/ice tea.jpg"))); // NOI18N
        jLabel_IceTea.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_IceTea.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_IceTeaMouseClicked(evt);
            }
        });
        jPanel_Minuman.add(jLabel_IceTea, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 40, 130, 120));

        jLabel_AirMineral.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImageMakanan_Minuman/Air Mineral.jpg"))); // NOI18N
        jLabel_AirMineral.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_AirMineral.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_AirMineralMouseClicked(evt);
            }
        });
        jPanel_Minuman.add(jLabel_AirMineral, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 40, 130, 120));

        jLabel_CocaCola.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImageMakanan_Minuman/Coca Cola.jpg"))); // NOI18N
        jLabel_CocaCola.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_CocaCola.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_CocaColaMouseClicked(evt);
            }
        });
        jPanel_Minuman.add(jLabel_CocaCola, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 40, 130, 120));

        jLabel_Sprite.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImageMakanan_Minuman/Sprite.jpg"))); // NOI18N
        jLabel_Sprite.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_Sprite.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_SpriteMouseClicked(evt);
            }
        });
        jPanel_Minuman.add(jLabel_Sprite, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 40, 130, 120));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Kopi");
        jPanel_Minuman.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 130, 30));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Es Teh");
        jPanel_Minuman.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 160, 130, 30));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Air Mineral");
        jPanel_Minuman.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 160, 130, 30));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Coca Cola");
        jPanel_Minuman.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 160, 130, 30));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Sprite");
        jPanel_Minuman.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 160, 130, 30));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("6K");
        jPanel_Minuman.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 130, 30));

        jLabel20.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.setText("5K");
        jPanel_Minuman.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 190, 130, 30));

        jLabel21.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel21.setText("5K");
        jPanel_Minuman.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 190, 130, 30));

        jLabel22.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel22.setText("8K");
        jPanel_Minuman.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 190, 130, 30));

        jLabel23.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel23.setText("8K");
        jPanel_Minuman.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 190, 130, 30));

        jPanel_Order.add(jPanel_Minuman, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 820, 530));

        jPanel_JikaPilihMakananMiebiasa.setBackground(new java.awt.Color(255, 255, 255));
        jPanel_JikaPilihMakananMiebiasa.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel_MilihMieGorengBiasa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImageMakanan_Minuman/Mie Goreng Kuah Biasa.jpg"))); // NOI18N
        jPanel_JikaPilihMakananMiebiasa.add(jLabel_MilihMieGorengBiasa, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 50, 230, 170));

        jButton_MieBiasa.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton_MieBiasa.setText("Pesan");
        jButton_MieBiasa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_MieBiasaActionPerformed(evt);
            }
        });
        jPanel_JikaPilihMakananMiebiasa.add(jButton_MieBiasa, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 380, 380, 40));

        jLabel25.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel25.setText("Jumlah");
        jPanel_JikaPilihMakananMiebiasa.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 260, 130, 30));

        jLabel26.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel26.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel26.setText("Harga");
        jPanel_JikaPilihMakananMiebiasa.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 310, 140, -1));

        jButton_PlusMieBiasa.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton_PlusMieBiasa.setText("+");
        jButton_PlusMieBiasa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_PlusMieBiasaActionPerformed(evt);
            }
        });
        jPanel_JikaPilihMakananMiebiasa.add(jButton_PlusMieBiasa, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 260, 40, 30));

        jTextField_HargaMieBiasa.setEditable(false);
        jTextField_HargaMieBiasa.setBackground(new java.awt.Color(255, 255, 255));
        jTextField_HargaMieBiasa.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel_JikaPilihMakananMiebiasa.add(jTextField_HargaMieBiasa, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 320, 180, 30));

        jTextField_JumlahMieBiasa.setEditable(false);
        jTextField_JumlahMieBiasa.setBackground(new java.awt.Color(255, 255, 255));
        jTextField_JumlahMieBiasa.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel_JikaPilihMakananMiebiasa.add(jTextField_JumlahMieBiasa, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 262, 80, 30));

        jButton_MinusMieBiasa.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton_MinusMieBiasa.setText("-");
        jButton_MinusMieBiasa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_MinusMieBiasaActionPerformed(evt);
            }
        });
        jPanel_JikaPilihMakananMiebiasa.add(jButton_MinusMieBiasa, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 260, 40, 30));

        jButton_MilihMieBiasaBack.setText("<< Back");
        jButton_MilihMieBiasaBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_MilihMieBiasaBackActionPerformed(evt);
            }
        });
        jPanel_JikaPilihMakananMiebiasa.add(jButton_MilihMieBiasaBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 80, 30));

        jLabel24.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel24.setText("Mie Goreng / Kuah Biasa");
        jPanel_JikaPilihMakananMiebiasa.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 230, 190, -1));

        jPanel_Order.add(jPanel_JikaPilihMakananMiebiasa, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 820, 600));

        jPanel_JikaDiaMemilihMakananMieTelur.setBackground(new java.awt.Color(255, 255, 255));
        jPanel_JikaDiaMemilihMakananMieTelur.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel_MilihMieGorengTelur.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImageMakanan_Minuman/Mi Goreng Spesial.jpg"))); // NOI18N
        jPanel_JikaDiaMemilihMakananMieTelur.add(jLabel_MilihMieGorengTelur, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 50, 230, 170));

        jButton_Back.setText("<< Back");
        jButton_Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_BackActionPerformed(evt);
            }
        });
        jPanel_JikaDiaMemilihMakananMieTelur.add(jButton_Back, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 80, 30));

        jLabel29.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel29.setText("Mie Goreng / Rebus + Telur");
        jPanel_JikaDiaMemilihMakananMieTelur.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 230, 190, -1));

        jLabel28.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel28.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel28.setText("Jumlah");
        jPanel_JikaDiaMemilihMakananMieTelur.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 260, 130, 30));

        jButton_PesanMilihMieGorengTelur.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton_PesanMilihMieGorengTelur.setText("Pesan");
        jButton_PesanMilihMieGorengTelur.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_PesanMilihMieGorengTelurActionPerformed(evt);
            }
        });
        jPanel_JikaDiaMemilihMakananMieTelur.add(jButton_PesanMilihMieGorengTelur, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 380, 380, 40));

        jLabel30.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel30.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel30.setText("Harga");
        jPanel_JikaDiaMemilihMakananMieTelur.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 310, 140, -1));

        jTextField_MilihMieGorengTelur_Jumlah.setEditable(false);
        jTextField_MilihMieGorengTelur_Jumlah.setBackground(new java.awt.Color(255, 255, 255));
        jTextField_MilihMieGorengTelur_Jumlah.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel_JikaDiaMemilihMakananMieTelur.add(jTextField_MilihMieGorengTelur_Jumlah, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 262, 80, 30));

        jTextField_MilihMieGorengTelur_Harga.setEditable(false);
        jTextField_MilihMieGorengTelur_Harga.setBackground(new java.awt.Color(255, 255, 255));
        jTextField_MilihMieGorengTelur_Harga.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel_JikaDiaMemilihMakananMieTelur.add(jTextField_MilihMieGorengTelur_Harga, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 310, 180, 30));

        jButton_MinusMieGorengTelur.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton_MinusMieGorengTelur.setText("-");
        jButton_MinusMieGorengTelur.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_MinusMieGorengTelurActionPerformed(evt);
            }
        });
        jPanel_JikaDiaMemilihMakananMieTelur.add(jButton_MinusMieGorengTelur, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 260, 40, 30));

        jButton_PlusMieGorengTelur.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton_PlusMieGorengTelur.setText("+");
        jButton_PlusMieGorengTelur.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_PlusMieGorengTelurActionPerformed(evt);
            }
        });
        jPanel_JikaDiaMemilihMakananMieTelur.add(jButton_PlusMieGorengTelur, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 260, 40, 30));

        jPanel_Order.add(jPanel_JikaDiaMemilihMakananMieTelur, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 820, 600));

        jPanel_JikaMemilihMakananSosTeng.setBackground(new java.awt.Color(255, 255, 255));
        jPanel_JikaMemilihMakananSosTeng.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton_BackMilihSosTeng.setText("<< Back");
        jButton_BackMilihSosTeng.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_BackMilihSosTengActionPerformed(evt);
            }
        });
        jPanel_JikaMemilihMakananSosTeng.add(jButton_BackMilihSosTeng, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 80, 30));

        jLabel_JikaMilihSosTeng.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImageMakanan_Minuman/sosken.jpg"))); // NOI18N
        jPanel_JikaMemilihMakananSosTeng.add(jLabel_JikaMilihSosTeng, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 50, 230, 170));

        jLabel31.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel31.setText("Sos Teng");
        jPanel_JikaMemilihMakananSosTeng.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 230, 190, -1));

        jLabel32.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel32.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel32.setText("Jumlah");
        jPanel_JikaMemilihMakananSosTeng.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 260, 130, 30));

        jLabel33.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel33.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel33.setText("Harga");
        jPanel_JikaMemilihMakananSosTeng.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 310, 140, -1));

        jButton_PesanMilihSosTeng.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton_PesanMilihSosTeng.setText("Pesan");
        jButton_PesanMilihSosTeng.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_PesanMilihSosTengActionPerformed(evt);
            }
        });
        jPanel_JikaMemilihMakananSosTeng.add(jButton_PesanMilihSosTeng, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 380, 380, 40));

        jTextField_JumlahMilihSosTeng.setEditable(false);
        jTextField_JumlahMilihSosTeng.setBackground(new java.awt.Color(255, 255, 255));
        jTextField_JumlahMilihSosTeng.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel_JikaMemilihMakananSosTeng.add(jTextField_JumlahMilihSosTeng, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 262, 80, 30));

        jTextField_HargaMilihSosTeng.setEditable(false);
        jTextField_HargaMilihSosTeng.setBackground(new java.awt.Color(255, 255, 255));
        jTextField_HargaMilihSosTeng.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel_JikaMemilihMakananSosTeng.add(jTextField_HargaMilihSosTeng, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 320, 180, 30));

        jButton_MinusMilihSosTeng.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton_MinusMilihSosTeng.setText("-");
        jButton_MinusMilihSosTeng.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_MinusMilihSosTengActionPerformed(evt);
            }
        });
        jPanel_JikaMemilihMakananSosTeng.add(jButton_MinusMilihSosTeng, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 260, 40, 30));

        jButton_PlusMilihSosTeng.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton_PlusMilihSosTeng.setText("+");
        jButton_PlusMilihSosTeng.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_PlusMilihSosTengActionPerformed(evt);
            }
        });
        jPanel_JikaMemilihMakananSosTeng.add(jButton_PlusMilihSosTeng, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 260, 40, 30));

        jPanel_Order.add(jPanel_JikaMemilihMakananSosTeng, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 820, 600));

        jPanel_JikaDiaMemilihMakananNasiGoreng.setBackground(new java.awt.Color(255, 255, 255));
        jPanel_JikaDiaMemilihMakananNasiGoreng.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel_JikaMilihNasiGoreng.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImageMakanan_Minuman/Nasi Goreng.jpg"))); // NOI18N
        jPanel_JikaDiaMemilihMakananNasiGoreng.add(jLabel_JikaMilihNasiGoreng, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 50, 230, 170));

        jButton_BackMilihNasiGoreng.setText("<< Back");
        jButton_BackMilihNasiGoreng.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_BackMilihNasiGorengActionPerformed(evt);
            }
        });
        jPanel_JikaDiaMemilihMakananNasiGoreng.add(jButton_BackMilihNasiGoreng, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 80, 30));

        jLabel35.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel35.setText("Nasi Goreng");
        jPanel_JikaDiaMemilihMakananNasiGoreng.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 230, 190, -1));

        jLabel36.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel36.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel36.setText("Jumlah");
        jPanel_JikaDiaMemilihMakananNasiGoreng.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 260, 130, 30));

        jLabel37.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel37.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel37.setText("Harga");
        jPanel_JikaDiaMemilihMakananNasiGoreng.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 310, 140, -1));

        jButton_PesanMilihNasiGoreng.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton_PesanMilihNasiGoreng.setText("Pesan");
        jButton_PesanMilihNasiGoreng.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_PesanMilihNasiGorengActionPerformed(evt);
            }
        });
        jPanel_JikaDiaMemilihMakananNasiGoreng.add(jButton_PesanMilihNasiGoreng, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 380, 380, 40));

        jTextField_JumlahMilihNasiGoreng.setEditable(false);
        jTextField_JumlahMilihNasiGoreng.setBackground(new java.awt.Color(255, 255, 255));
        jTextField_JumlahMilihNasiGoreng.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel_JikaDiaMemilihMakananNasiGoreng.add(jTextField_JumlahMilihNasiGoreng, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 262, 80, 30));

        jTextField_HargaMilihNasiGoreng.setEditable(false);
        jTextField_HargaMilihNasiGoreng.setBackground(new java.awt.Color(255, 255, 255));
        jTextField_HargaMilihNasiGoreng.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel_JikaDiaMemilihMakananNasiGoreng.add(jTextField_HargaMilihNasiGoreng, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 320, 180, 30));

        jButton_MinusMilihNasiGoreng.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton_MinusMilihNasiGoreng.setText("-");
        jButton_MinusMilihNasiGoreng.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_MinusMilihNasiGorengActionPerformed(evt);
            }
        });
        jPanel_JikaDiaMemilihMakananNasiGoreng.add(jButton_MinusMilihNasiGoreng, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 260, 40, 30));

        jButton_PlusMilihNasiGoreng.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton_PlusMilihNasiGoreng.setText("+");
        jButton_PlusMilihNasiGoreng.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_PlusMilihNasiGorengActionPerformed(evt);
            }
        });
        jPanel_JikaDiaMemilihMakananNasiGoreng.add(jButton_PlusMilihNasiGoreng, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 260, 40, 30));

        jPanel_Order.add(jPanel_JikaDiaMemilihMakananNasiGoreng, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 820, 600));

        jPanel_JikaDiaMemilihMakananKwetiawGoreng.setBackground(new java.awt.Color(255, 255, 255));
        jPanel_JikaDiaMemilihMakananKwetiawGoreng.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton_BackMilihKwetiawGoreng.setText("<< Back");
        jButton_BackMilihKwetiawGoreng.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_BackMilihKwetiawGorengActionPerformed(evt);
            }
        });
        jPanel_JikaDiaMemilihMakananKwetiawGoreng.add(jButton_BackMilihKwetiawGoreng, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 80, 30));

        jLabel_JikaMilihKwetiawGoreng.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImageMakanan_Minuman/Kwetiaw Goreng.jpg"))); // NOI18N
        jPanel_JikaDiaMemilihMakananKwetiawGoreng.add(jLabel_JikaMilihKwetiawGoreng, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 50, 230, 170));

        jLabel39.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel39.setText("Kwetiaw Goreng");
        jPanel_JikaDiaMemilihMakananKwetiawGoreng.add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 230, 190, -1));

        jButton_PesanMilihKwetiawGoreng.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton_PesanMilihKwetiawGoreng.setText("Pesan");
        jButton_PesanMilihKwetiawGoreng.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_PesanMilihKwetiawGorengActionPerformed(evt);
            }
        });
        jPanel_JikaDiaMemilihMakananKwetiawGoreng.add(jButton_PesanMilihKwetiawGoreng, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 380, 380, 40));

        jLabel40.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel40.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel40.setText("Jumlah");
        jPanel_JikaDiaMemilihMakananKwetiawGoreng.add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 260, 130, 30));

        jLabel41.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel41.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel41.setText("Harga");
        jPanel_JikaDiaMemilihMakananKwetiawGoreng.add(jLabel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 310, 140, -1));

        jTextField_JumlahMilihKwetiawGoreng.setEditable(false);
        jTextField_JumlahMilihKwetiawGoreng.setBackground(new java.awt.Color(255, 255, 255));
        jTextField_JumlahMilihKwetiawGoreng.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel_JikaDiaMemilihMakananKwetiawGoreng.add(jTextField_JumlahMilihKwetiawGoreng, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 262, 80, 30));

        jTextField_HargaMilihKwetiawGoreng.setEditable(false);
        jTextField_HargaMilihKwetiawGoreng.setBackground(new java.awt.Color(255, 255, 255));
        jTextField_HargaMilihKwetiawGoreng.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel_JikaDiaMemilihMakananKwetiawGoreng.add(jTextField_HargaMilihKwetiawGoreng, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 320, 180, 30));

        jButton_MinusMilihKwetiawGoreng.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton_MinusMilihKwetiawGoreng.setText("-");
        jButton_MinusMilihKwetiawGoreng.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_MinusMilihKwetiawGorengActionPerformed(evt);
            }
        });
        jPanel_JikaDiaMemilihMakananKwetiawGoreng.add(jButton_MinusMilihKwetiawGoreng, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 260, 40, 30));

        jButton_PlusMilihKwetiawGoreng.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton_PlusMilihKwetiawGoreng.setText("+");
        jButton_PlusMilihKwetiawGoreng.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_PlusMilihKwetiawGorengActionPerformed(evt);
            }
        });
        jPanel_JikaDiaMemilihMakananKwetiawGoreng.add(jButton_PlusMilihKwetiawGoreng, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 260, 40, 30));

        jPanel_Order.add(jPanel_JikaDiaMemilihMakananKwetiawGoreng, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 820, 600));

        jPanel_JikaDiaMemilihMinumanKopi.setBackground(new java.awt.Color(255, 255, 255));
        jPanel_JikaDiaMemilihMinumanKopi.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel_JikaMilihKopi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImageMakanan_Minuman/Kopi.jpg"))); // NOI18N
        jPanel_JikaDiaMemilihMinumanKopi.add(jLabel_JikaMilihKopi, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 50, 230, 170));

        jButton_Back_MinumanKopi.setText("<< Back");
        jButton_Back_MinumanKopi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Back_MinumanKopiActionPerformed(evt);
            }
        });
        jPanel_JikaDiaMemilihMinumanKopi.add(jButton_Back_MinumanKopi, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 80, 30));

        jLabel34.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel34.setText("Kopi");
        jPanel_JikaDiaMemilihMinumanKopi.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 230, 190, -1));

        jButton_Pesan_MinumanKopi.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton_Pesan_MinumanKopi.setText("Pesan");
        jButton_Pesan_MinumanKopi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Pesan_MinumanKopiActionPerformed(evt);
            }
        });
        jPanel_JikaDiaMemilihMinumanKopi.add(jButton_Pesan_MinumanKopi, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 380, 380, 40));

        jLabel38.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel38.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel38.setText("Jumlah");
        jPanel_JikaDiaMemilihMinumanKopi.add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 260, 130, 30));

        jLabel42.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel42.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel42.setText("Harga");
        jPanel_JikaDiaMemilihMinumanKopi.add(jLabel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 310, 140, -1));

        jTextField_Jumlah_MinumanKopi.setEditable(false);
        jTextField_Jumlah_MinumanKopi.setBackground(new java.awt.Color(255, 255, 255));
        jTextField_Jumlah_MinumanKopi.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel_JikaDiaMemilihMinumanKopi.add(jTextField_Jumlah_MinumanKopi, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 262, 80, 30));

        jTextField_Harga_MinumanKopi.setEditable(false);
        jTextField_Harga_MinumanKopi.setBackground(new java.awt.Color(255, 255, 255));
        jTextField_Harga_MinumanKopi.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel_JikaDiaMemilihMinumanKopi.add(jTextField_Harga_MinumanKopi, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 320, 180, 30));

        jButton_Minus_MinumanKopi.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton_Minus_MinumanKopi.setText("-");
        jButton_Minus_MinumanKopi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Minus_MinumanKopiActionPerformed(evt);
            }
        });
        jPanel_JikaDiaMemilihMinumanKopi.add(jButton_Minus_MinumanKopi, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 260, 40, 30));

        jButton_Plus_MinumanKopi.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton_Plus_MinumanKopi.setText("+");
        jButton_Plus_MinumanKopi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Plus_MinumanKopiActionPerformed(evt);
            }
        });
        jPanel_JikaDiaMemilihMinumanKopi.add(jButton_Plus_MinumanKopi, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 260, 40, 30));

        jPanel_Order.add(jPanel_JikaDiaMemilihMinumanKopi, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 820, 600));

        jPanel_JikaDiaMemilihMinumanEsTeh.setBackground(new java.awt.Color(255, 255, 255));
        jPanel_JikaDiaMemilihMinumanEsTeh.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel_JikaMilihEsTeh.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImageMakanan_Minuman/ice tea.jpg"))); // NOI18N
        jPanel_JikaDiaMemilihMinumanEsTeh.add(jLabel_JikaMilihEsTeh, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 50, 230, 170));

        jButton_Back_MinumanEsTeh.setText("<< Back");
        jButton_Back_MinumanEsTeh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Back_MinumanEsTehActionPerformed(evt);
            }
        });
        jPanel_JikaDiaMemilihMinumanEsTeh.add(jButton_Back_MinumanEsTeh, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 80, 30));

        jLabel43.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel43.setText("Es Teh");
        jPanel_JikaDiaMemilihMinumanEsTeh.add(jLabel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 230, 190, -1));

        jButton_Pesan_MinumanEsTeh.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton_Pesan_MinumanEsTeh.setText("Pesan");
        jButton_Pesan_MinumanEsTeh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Pesan_MinumanEsTehActionPerformed(evt);
            }
        });
        jPanel_JikaDiaMemilihMinumanEsTeh.add(jButton_Pesan_MinumanEsTeh, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 380, 380, 40));

        jLabel44.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel44.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel44.setText("Jumlah");
        jPanel_JikaDiaMemilihMinumanEsTeh.add(jLabel44, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 260, 130, 30));

        jLabel45.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel45.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel45.setText("Harga");
        jPanel_JikaDiaMemilihMinumanEsTeh.add(jLabel45, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 310, 140, -1));

        jTextField_Jumlah_MinumanEsTeh.setEditable(false);
        jTextField_Jumlah_MinumanEsTeh.setBackground(new java.awt.Color(255, 255, 255));
        jTextField_Jumlah_MinumanEsTeh.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel_JikaDiaMemilihMinumanEsTeh.add(jTextField_Jumlah_MinumanEsTeh, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 262, 80, 30));

        jButton_Minus_MinumanEsTeh.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton_Minus_MinumanEsTeh.setText("-");
        jButton_Minus_MinumanEsTeh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Minus_MinumanEsTehActionPerformed(evt);
            }
        });
        jPanel_JikaDiaMemilihMinumanEsTeh.add(jButton_Minus_MinumanEsTeh, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 260, 40, 30));

        jButton_Plus_MinumanEsTeh.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton_Plus_MinumanEsTeh.setText("+");
        jButton_Plus_MinumanEsTeh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Plus_MinumanEsTehActionPerformed(evt);
            }
        });
        jPanel_JikaDiaMemilihMinumanEsTeh.add(jButton_Plus_MinumanEsTeh, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 260, 40, 30));

        jTextField_Harga_MinumanEsTeh.setEditable(false);
        jTextField_Harga_MinumanEsTeh.setBackground(new java.awt.Color(255, 255, 255));
        jTextField_Harga_MinumanEsTeh.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel_JikaDiaMemilihMinumanEsTeh.add(jTextField_Harga_MinumanEsTeh, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 320, 180, 30));

        jPanel_Order.add(jPanel_JikaDiaMemilihMinumanEsTeh, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 820, 600));

        jPanel_JikaDiaMemilihMinumanAirMineral.setBackground(new java.awt.Color(255, 255, 255));
        jPanel_JikaDiaMemilihMinumanAirMineral.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel_JikaMilihAirMineral.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImageMakanan_Minuman/Air Mineral.jpg"))); // NOI18N
        jPanel_JikaDiaMemilihMinumanAirMineral.add(jLabel_JikaMilihAirMineral, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 50, 230, 170));

        jButton_Back_MinumanAirMineral.setText("<< Back");
        jButton_Back_MinumanAirMineral.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Back_MinumanAirMineralActionPerformed(evt);
            }
        });
        jPanel_JikaDiaMemilihMinumanAirMineral.add(jButton_Back_MinumanAirMineral, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 80, 30));

        jLabel46.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel46.setText("Air Mineral");
        jPanel_JikaDiaMemilihMinumanAirMineral.add(jLabel46, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 230, 190, -1));

        jLabel47.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel47.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel47.setText("Jumlah");
        jPanel_JikaDiaMemilihMinumanAirMineral.add(jLabel47, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 260, 130, 30));

        jLabel48.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel48.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel48.setText("Harga");
        jPanel_JikaDiaMemilihMinumanAirMineral.add(jLabel48, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 310, 140, -1));

        jButton_Pesan_MinumanAirMineral.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton_Pesan_MinumanAirMineral.setText("Pesan");
        jButton_Pesan_MinumanAirMineral.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Pesan_MinumanAirMineralActionPerformed(evt);
            }
        });
        jPanel_JikaDiaMemilihMinumanAirMineral.add(jButton_Pesan_MinumanAirMineral, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 380, 380, 40));

        jTextField_Jumlah_MinumanAirMineral.setEditable(false);
        jTextField_Jumlah_MinumanAirMineral.setBackground(new java.awt.Color(255, 255, 255));
        jTextField_Jumlah_MinumanAirMineral.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel_JikaDiaMemilihMinumanAirMineral.add(jTextField_Jumlah_MinumanAirMineral, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 262, 80, 30));

        jTextField_Harga_MinumanAirMineral.setEditable(false);
        jTextField_Harga_MinumanAirMineral.setBackground(new java.awt.Color(255, 255, 255));
        jTextField_Harga_MinumanAirMineral.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel_JikaDiaMemilihMinumanAirMineral.add(jTextField_Harga_MinumanAirMineral, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 320, 180, 30));

        jButton_Minus_MinumanAirMineral.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton_Minus_MinumanAirMineral.setText("-");
        jButton_Minus_MinumanAirMineral.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Minus_MinumanAirMineralActionPerformed(evt);
            }
        });
        jPanel_JikaDiaMemilihMinumanAirMineral.add(jButton_Minus_MinumanAirMineral, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 260, 40, 30));

        jButton_Plus_MinumanAirMineral.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton_Plus_MinumanAirMineral.setText("+");
        jButton_Plus_MinumanAirMineral.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Plus_MinumanAirMineralActionPerformed(evt);
            }
        });
        jPanel_JikaDiaMemilihMinumanAirMineral.add(jButton_Plus_MinumanAirMineral, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 260, 40, 30));

        jPanel_Order.add(jPanel_JikaDiaMemilihMinumanAirMineral, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 820, 600));

        jPanel_JikaDiaMemilihMinumanCocaCola.setBackground(new java.awt.Color(255, 255, 255));
        jPanel_JikaDiaMemilihMinumanCocaCola.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel_JikaMilihCocaCola.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImageMakanan_Minuman/Coca Cola.jpg"))); // NOI18N
        jPanel_JikaDiaMemilihMinumanCocaCola.add(jLabel_JikaMilihCocaCola, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 50, 230, 170));

        jButton_Back_MinumanCocaCola.setText("<< Back");
        jButton_Back_MinumanCocaCola.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Back_MinumanCocaColaActionPerformed(evt);
            }
        });
        jPanel_JikaDiaMemilihMinumanCocaCola.add(jButton_Back_MinumanCocaCola, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 80, 30));

        jLabel49.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel49.setText("Coca Cola");
        jPanel_JikaDiaMemilihMinumanCocaCola.add(jLabel49, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 230, 190, -1));

        jButton_Pesan_MinumanCocaCola.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton_Pesan_MinumanCocaCola.setText("Pesan");
        jButton_Pesan_MinumanCocaCola.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Pesan_MinumanCocaColaActionPerformed(evt);
            }
        });
        jPanel_JikaDiaMemilihMinumanCocaCola.add(jButton_Pesan_MinumanCocaCola, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 380, 380, 40));

        jLabel50.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel50.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel50.setText("Jumlah");
        jPanel_JikaDiaMemilihMinumanCocaCola.add(jLabel50, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 260, 130, 30));

        jLabel51.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel51.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel51.setText("Harga");
        jPanel_JikaDiaMemilihMinumanCocaCola.add(jLabel51, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 310, 140, -1));

        jTextField_Jumlah_MinumanCocaCola.setEditable(false);
        jTextField_Jumlah_MinumanCocaCola.setBackground(new java.awt.Color(255, 255, 255));
        jTextField_Jumlah_MinumanCocaCola.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel_JikaDiaMemilihMinumanCocaCola.add(jTextField_Jumlah_MinumanCocaCola, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 262, 80, 30));

        jTextField_Harga_MinumanCocaCola.setEditable(false);
        jTextField_Harga_MinumanCocaCola.setBackground(new java.awt.Color(255, 255, 255));
        jTextField_Harga_MinumanCocaCola.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel_JikaDiaMemilihMinumanCocaCola.add(jTextField_Harga_MinumanCocaCola, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 320, 180, 30));

        jButton_Minus_MinumanCocaCola.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton_Minus_MinumanCocaCola.setText("-");
        jButton_Minus_MinumanCocaCola.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Minus_MinumanCocaColaActionPerformed(evt);
            }
        });
        jPanel_JikaDiaMemilihMinumanCocaCola.add(jButton_Minus_MinumanCocaCola, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 260, 40, 30));

        jButton_Plus_MinumanCocaCola.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton_Plus_MinumanCocaCola.setText("+");
        jButton_Plus_MinumanCocaCola.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Plus_MinumanCocaColaActionPerformed(evt);
            }
        });
        jPanel_JikaDiaMemilihMinumanCocaCola.add(jButton_Plus_MinumanCocaCola, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 260, 40, 30));

        jPanel_Order.add(jPanel_JikaDiaMemilihMinumanCocaCola, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 820, 600));

        jPanel_JikaDiaMemilihMinumanSprite.setBackground(new java.awt.Color(255, 255, 255));
        jPanel_JikaDiaMemilihMinumanSprite.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel_JikaMilihSprite.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImageMakanan_Minuman/Sprite.jpg"))); // NOI18N
        jPanel_JikaDiaMemilihMinumanSprite.add(jLabel_JikaMilihSprite, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 50, 230, 170));

        jButton_Back_MinumanSprite.setText("<< Back");
        jButton_Back_MinumanSprite.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Back_MinumanSpriteActionPerformed(evt);
            }
        });
        jPanel_JikaDiaMemilihMinumanSprite.add(jButton_Back_MinumanSprite, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 80, 30));

        jLabel52.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel52.setText("Sprite");
        jPanel_JikaDiaMemilihMinumanSprite.add(jLabel52, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 230, 190, -1));

        jButton_Pesan_MinumanSprite.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton_Pesan_MinumanSprite.setText("Pesan");
        jButton_Pesan_MinumanSprite.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Pesan_MinumanSpriteActionPerformed(evt);
            }
        });
        jPanel_JikaDiaMemilihMinumanSprite.add(jButton_Pesan_MinumanSprite, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 380, 380, 40));

        jLabel53.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel53.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel53.setText("Jumlah");
        jPanel_JikaDiaMemilihMinumanSprite.add(jLabel53, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 260, 130, 30));

        jLabel54.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel54.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel54.setText("Harga");
        jPanel_JikaDiaMemilihMinumanSprite.add(jLabel54, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 310, 140, -1));

        jTextField_Jumlah_MinumanSprite.setEditable(false);
        jTextField_Jumlah_MinumanSprite.setBackground(new java.awt.Color(255, 255, 255));
        jTextField_Jumlah_MinumanSprite.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel_JikaDiaMemilihMinumanSprite.add(jTextField_Jumlah_MinumanSprite, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 262, 80, 30));

        jTextField_Harga_MinumanSprite.setEditable(false);
        jTextField_Harga_MinumanSprite.setBackground(new java.awt.Color(255, 255, 255));
        jTextField_Harga_MinumanSprite.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel_JikaDiaMemilihMinumanSprite.add(jTextField_Harga_MinumanSprite, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 320, 180, 30));

        jButton_Minus_MinumanSprite.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton_Minus_MinumanSprite.setText("-");
        jButton_Minus_MinumanSprite.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Minus_MinumanSpriteActionPerformed(evt);
            }
        });
        jPanel_JikaDiaMemilihMinumanSprite.add(jButton_Minus_MinumanSprite, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 260, 40, 30));

        jButton_Plus_MinumanSprite.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton_Plus_MinumanSprite.setText("+");
        jButton_Plus_MinumanSprite.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Plus_MinumanSpriteActionPerformed(evt);
            }
        });
        jPanel_JikaDiaMemilihMinumanSprite.add(jButton_Plus_MinumanSprite, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 260, 40, 30));

        jPanel_Order.add(jPanel_JikaDiaMemilihMinumanSprite, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 820, 600));

        jPanel_JikaDiaPesanMieBiasa.setBackground(new java.awt.Color(255, 255, 255));
        jPanel_JikaDiaPesanMieBiasa.setPreferredSize(new java.awt.Dimension(610, 420));
        jPanel_JikaDiaPesanMieBiasa.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel60.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel60.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel60.setText("Pembayaran");
        jPanel_JikaDiaPesanMieBiasa.add(jLabel60, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 60, -1, -1));

        jButton_BackPembayaranMieBiasa.setText("<< Back");
        jButton_BackPembayaranMieBiasa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_BackPembayaranMieBiasaActionPerformed(evt);
            }
        });
        jPanel_JikaDiaPesanMieBiasa.add(jButton_BackPembayaranMieBiasa, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 80, 30));

        jLabel_Pembayaran_Dana_MieBiasa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImageMakanan_Minuman/Dana.jpg"))); // NOI18N
        jPanel_JikaDiaPesanMieBiasa.add(jLabel_Pembayaran_Dana_MieBiasa, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 135, 60, 30));

        jTextField_Pembayaran_Dana_MieBiasa.setEditable(false);
        jTextField_Pembayaran_Dana_MieBiasa.setBackground(new java.awt.Color(255, 255, 255));
        jTextField_Pembayaran_Dana_MieBiasa.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jTextField_Pembayaran_Dana_MieBiasa.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextField_Pembayaran_Dana_MieBiasa.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        jPanel_JikaDiaPesanMieBiasa.add(jTextField_Pembayaran_Dana_MieBiasa, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 130, 540, 40));

        jButton_BeliSekarangPembayaranMieBiasa.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton_BeliSekarangPembayaranMieBiasa.setText("Beli Sekarang");
        jButton_BeliSekarangPembayaranMieBiasa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_BeliSekarangPembayaranMieBiasaActionPerformed(evt);
            }
        });
        jPanel_JikaDiaPesanMieBiasa.add(jButton_BeliSekarangPembayaranMieBiasa, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 550, 340, -1));

        jLabel_Pembayaran_ShopePay_MieBiasa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImageMakanan_Minuman/Logo ShopeePay.png"))); // NOI18N
        jPanel_JikaDiaPesanMieBiasa.add(jLabel_Pembayaran_ShopePay_MieBiasa, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 340, 60, 40));

        jLabel_Pembayaran_Ovo_MieBiasa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImageMakanan_Minuman/Ovo.png"))); // NOI18N
        jPanel_JikaDiaPesanMieBiasa.add(jLabel_Pembayaran_Ovo_MieBiasa, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 205, 60, 30));

        jTextField_Pembayaran_Shopepay_MieBiasa.setEditable(false);
        jTextField_Pembayaran_Shopepay_MieBiasa.setBackground(new java.awt.Color(255, 255, 255));
        jTextField_Pembayaran_Shopepay_MieBiasa.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jTextField_Pembayaran_Shopepay_MieBiasa.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextField_Pembayaran_Shopepay_MieBiasa.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        jPanel_JikaDiaPesanMieBiasa.add(jTextField_Pembayaran_Shopepay_MieBiasa, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 340, 540, 40));

        jLabel_Pembayaran_Gopay_MieBiasa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImageMakanan_Minuman/GoPay Logo.png"))); // NOI18N
        jPanel_JikaDiaPesanMieBiasa.add(jLabel_Pembayaran_Gopay_MieBiasa, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 270, 60, 40));

        jTextField_Pembayaran_Gopay_MieBiasa.setEditable(false);
        jTextField_Pembayaran_Gopay_MieBiasa.setBackground(new java.awt.Color(255, 255, 255));
        jTextField_Pembayaran_Gopay_MieBiasa.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jTextField_Pembayaran_Gopay_MieBiasa.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextField_Pembayaran_Gopay_MieBiasa.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        jPanel_JikaDiaPesanMieBiasa.add(jTextField_Pembayaran_Gopay_MieBiasa, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 270, 540, 40));

        jTextField_Pembayaran_Ovo_MieBiasa.setEditable(false);
        jTextField_Pembayaran_Ovo_MieBiasa.setBackground(new java.awt.Color(255, 255, 255));
        jTextField_Pembayaran_Ovo_MieBiasa.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jTextField_Pembayaran_Ovo_MieBiasa.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextField_Pembayaran_Ovo_MieBiasa.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        jPanel_JikaDiaPesanMieBiasa.add(jTextField_Pembayaran_Ovo_MieBiasa, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 200, 540, 40));

        jLabel_Pembayaran_Langsung_MieBiasa.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel_Pembayaran_Langsung_MieBiasa.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel_Pembayaran_Langsung_MieBiasa.setText("Pembayaran Langsung");
        jPanel_JikaDiaPesanMieBiasa.add(jLabel_Pembayaran_Langsung_MieBiasa, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 410, 200, 40));

        jTextField_Pembayaran_Langsung_MieBiasa.setEditable(false);
        jTextField_Pembayaran_Langsung_MieBiasa.setBackground(new java.awt.Color(255, 255, 255));
        jTextField_Pembayaran_Langsung_MieBiasa.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jTextField_Pembayaran_Langsung_MieBiasa.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextField_Pembayaran_Langsung_MieBiasa.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        jPanel_JikaDiaPesanMieBiasa.add(jTextField_Pembayaran_Langsung_MieBiasa, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 410, 540, 40));

        jCheckBox_Pembayaran_Dana_MieBiasa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox_Pembayaran_Dana_MieBiasaActionPerformed(evt);
            }
        });
        jPanel_JikaDiaPesanMieBiasa.add(jCheckBox_Pembayaran_Dana_MieBiasa, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 140, -1, -1));

        jCheckBox_Pembayaran_Ovo_Miebiasa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox_Pembayaran_Ovo_MiebiasaActionPerformed(evt);
            }
        });
        jPanel_JikaDiaPesanMieBiasa.add(jCheckBox_Pembayaran_Ovo_Miebiasa, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 210, -1, -1));

        jCheckBox_Pembayaran_Gopay_MieBiasa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox_Pembayaran_Gopay_MieBiasaActionPerformed(evt);
            }
        });
        jPanel_JikaDiaPesanMieBiasa.add(jCheckBox_Pembayaran_Gopay_MieBiasa, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 280, -1, -1));

        jCheckBox_Pembayaran_Shopepay_MieBiasa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox_Pembayaran_Shopepay_MieBiasaActionPerformed(evt);
            }
        });
        jPanel_JikaDiaPesanMieBiasa.add(jCheckBox_Pembayaran_Shopepay_MieBiasa, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 350, -1, -1));

        jCheckBox_Pembayaran_Langsung_MieBiasa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox_Pembayaran_Langsung_MieBiasaActionPerformed(evt);
            }
        });
        jPanel_JikaDiaPesanMieBiasa.add(jCheckBox_Pembayaran_Langsung_MieBiasa, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 420, -1, -1));

        jPanel_Order.add(jPanel_JikaDiaPesanMieBiasa, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 820, 600));

        jPanel_JikaDiaPesanMieTelur.setBackground(new java.awt.Color(255, 255, 255));
        jPanel_JikaDiaPesanMieTelur.setPreferredSize(new java.awt.Dimension(610, 420));
        jPanel_JikaDiaPesanMieTelur.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton_BackPembayaranMieTelur.setText("<< Back");
        jButton_BackPembayaranMieTelur.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_BackPembayaranMieTelurActionPerformed(evt);
            }
        });
        jPanel_JikaDiaPesanMieTelur.add(jButton_BackPembayaranMieTelur, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 80, 30));

        jLabel61.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel61.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel61.setText("Pembayaran");
        jPanel_JikaDiaPesanMieTelur.add(jLabel61, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 60, -1, -1));

        jLabel_Pembayaran_Dana_MieTelur.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImageMakanan_Minuman/Dana.jpg"))); // NOI18N
        jPanel_JikaDiaPesanMieTelur.add(jLabel_Pembayaran_Dana_MieTelur, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 135, 60, 30));

        jLabel_Pembayaran_Ovo_MieTelur.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImageMakanan_Minuman/Ovo.png"))); // NOI18N
        jPanel_JikaDiaPesanMieTelur.add(jLabel_Pembayaran_Ovo_MieTelur, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 205, 60, 30));

        jLabel_Pembayaran_Gopay_MieTelur.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImageMakanan_Minuman/GoPay Logo.png"))); // NOI18N
        jPanel_JikaDiaPesanMieTelur.add(jLabel_Pembayaran_Gopay_MieTelur, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 270, 60, 40));

        jLabel_Pembayaran_ShopeePay_MieTelur.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImageMakanan_Minuman/Logo ShopeePay.png"))); // NOI18N
        jPanel_JikaDiaPesanMieTelur.add(jLabel_Pembayaran_ShopeePay_MieTelur, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 340, 60, 40));

        jLabel_Pembayaran_Langsung_MieTelur.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel_Pembayaran_Langsung_MieTelur.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel_Pembayaran_Langsung_MieTelur.setText("Pembayaran Langsung");
        jPanel_JikaDiaPesanMieTelur.add(jLabel_Pembayaran_Langsung_MieTelur, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 410, 200, 40));

        jButton_BeliSekarangPembayaranMieTelur.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton_BeliSekarangPembayaranMieTelur.setText("Beli Sekarang");
        jButton_BeliSekarangPembayaranMieTelur.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_BeliSekarangPembayaranMieTelurActionPerformed(evt);
            }
        });
        jPanel_JikaDiaPesanMieTelur.add(jButton_BeliSekarangPembayaranMieTelur, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 550, 340, -1));

        jTextField_Pembayaran_Dana_MieTelur.setEditable(false);
        jTextField_Pembayaran_Dana_MieTelur.setBackground(new java.awt.Color(255, 255, 255));
        jTextField_Pembayaran_Dana_MieTelur.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jTextField_Pembayaran_Dana_MieTelur.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextField_Pembayaran_Dana_MieTelur.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        jPanel_JikaDiaPesanMieTelur.add(jTextField_Pembayaran_Dana_MieTelur, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 130, 540, 40));

        jTextField_Pembayaran_Ovo_MieTelur.setEditable(false);
        jTextField_Pembayaran_Ovo_MieTelur.setBackground(new java.awt.Color(255, 255, 255));
        jTextField_Pembayaran_Ovo_MieTelur.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jTextField_Pembayaran_Ovo_MieTelur.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextField_Pembayaran_Ovo_MieTelur.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        jPanel_JikaDiaPesanMieTelur.add(jTextField_Pembayaran_Ovo_MieTelur, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 200, 540, 40));

        jTextField_Pembayaran_Gopay_MieTelur.setEditable(false);
        jTextField_Pembayaran_Gopay_MieTelur.setBackground(new java.awt.Color(255, 255, 255));
        jTextField_Pembayaran_Gopay_MieTelur.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jTextField_Pembayaran_Gopay_MieTelur.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextField_Pembayaran_Gopay_MieTelur.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        jPanel_JikaDiaPesanMieTelur.add(jTextField_Pembayaran_Gopay_MieTelur, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 270, 540, 40));

        jTextField_Pembayaran_Shopepay_MieTelur.setEditable(false);
        jTextField_Pembayaran_Shopepay_MieTelur.setBackground(new java.awt.Color(255, 255, 255));
        jTextField_Pembayaran_Shopepay_MieTelur.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jTextField_Pembayaran_Shopepay_MieTelur.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextField_Pembayaran_Shopepay_MieTelur.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        jPanel_JikaDiaPesanMieTelur.add(jTextField_Pembayaran_Shopepay_MieTelur, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 340, 540, 40));

        jTextField_Pembayaran_Langsung_MieTelur.setEditable(false);
        jTextField_Pembayaran_Langsung_MieTelur.setBackground(new java.awt.Color(255, 255, 255));
        jTextField_Pembayaran_Langsung_MieTelur.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jTextField_Pembayaran_Langsung_MieTelur.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextField_Pembayaran_Langsung_MieTelur.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        jPanel_JikaDiaPesanMieTelur.add(jTextField_Pembayaran_Langsung_MieTelur, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 410, 540, 40));

        jCheckBox_Pembayaran_Dana_MieTelur.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jCheckBox_Pembayaran_Dana_MieTelur.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox_Pembayaran_Dana_MieTelurActionPerformed(evt);
            }
        });
        jPanel_JikaDiaPesanMieTelur.add(jCheckBox_Pembayaran_Dana_MieTelur, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 140, -1, -1));

        jCheckBox_Pembayaran_Ovo_MieTelur.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox_Pembayaran_Ovo_MieTelurActionPerformed(evt);
            }
        });
        jPanel_JikaDiaPesanMieTelur.add(jCheckBox_Pembayaran_Ovo_MieTelur, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 210, -1, -1));

        jCheckBox_Pembayaran_Gopay_MieTelur.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox_Pembayaran_Gopay_MieTelurActionPerformed(evt);
            }
        });
        jPanel_JikaDiaPesanMieTelur.add(jCheckBox_Pembayaran_Gopay_MieTelur, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 280, -1, -1));

        jCheckBox_Pembayaran_Shopepay_MieTelur.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox_Pembayaran_Shopepay_MieTelurActionPerformed(evt);
            }
        });
        jPanel_JikaDiaPesanMieTelur.add(jCheckBox_Pembayaran_Shopepay_MieTelur, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 350, -1, -1));

        jCheckBox_Pembayaran_Langsung_MieTelur.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox_Pembayaran_Langsung_MieTelurActionPerformed(evt);
            }
        });
        jPanel_JikaDiaPesanMieTelur.add(jCheckBox_Pembayaran_Langsung_MieTelur, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 420, -1, -1));

        jPanel_Order.add(jPanel_JikaDiaPesanMieTelur, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 820, 600));

        jPanel_JikaDiaPesanSosTeng.setBackground(new java.awt.Color(255, 255, 255));
        jPanel_JikaDiaPesanSosTeng.setPreferredSize(new java.awt.Dimension(610, 420));
        jPanel_JikaDiaPesanSosTeng.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton_BackPembayaranSosteng.setText("<< Back");
        jButton_BackPembayaranSosteng.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_BackPembayaranSostengActionPerformed(evt);
            }
        });
        jPanel_JikaDiaPesanSosTeng.add(jButton_BackPembayaranSosteng, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 80, 30));

        jLabel62.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel62.setText("Pembayaran");
        jPanel_JikaDiaPesanSosTeng.add(jLabel62, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 60, -1, -1));

        jLabel_Pembayaran_Dana_Sosteng.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImageMakanan_Minuman/Dana.jpg"))); // NOI18N
        jPanel_JikaDiaPesanSosTeng.add(jLabel_Pembayaran_Dana_Sosteng, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 135, 60, 30));

        jLabel_Pembayaran_Ovo_Sosteng.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImageMakanan_Minuman/Ovo.png"))); // NOI18N
        jPanel_JikaDiaPesanSosTeng.add(jLabel_Pembayaran_Ovo_Sosteng, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 205, 60, 30));

        jLabel_Pembayaran_Gopay_Sosteng.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImageMakanan_Minuman/GoPay Logo.png"))); // NOI18N
        jPanel_JikaDiaPesanSosTeng.add(jLabel_Pembayaran_Gopay_Sosteng, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 270, 60, 40));

        jLabel_Pembayaran_Shopepay_Sosteng.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImageMakanan_Minuman/Logo ShopeePay.png"))); // NOI18N
        jPanel_JikaDiaPesanSosTeng.add(jLabel_Pembayaran_Shopepay_Sosteng, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 340, 60, 40));

        jLabel_Pembayaran_Langsung_Sosteng.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel_Pembayaran_Langsung_Sosteng.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel_Pembayaran_Langsung_Sosteng.setText("Pembayaran Langsung");
        jPanel_JikaDiaPesanSosTeng.add(jLabel_Pembayaran_Langsung_Sosteng, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 410, 200, 40));

        jTextField_Pembayaran_Dana_Sosteng.setEditable(false);
        jTextField_Pembayaran_Dana_Sosteng.setBackground(new java.awt.Color(255, 255, 255));
        jTextField_Pembayaran_Dana_Sosteng.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jTextField_Pembayaran_Dana_Sosteng.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextField_Pembayaran_Dana_Sosteng.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        jPanel_JikaDiaPesanSosTeng.add(jTextField_Pembayaran_Dana_Sosteng, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 130, 540, 40));

        jTextField_Pembayaran_Ovo_Sosteng.setEditable(false);
        jTextField_Pembayaran_Ovo_Sosteng.setBackground(new java.awt.Color(255, 255, 255));
        jTextField_Pembayaran_Ovo_Sosteng.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jTextField_Pembayaran_Ovo_Sosteng.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextField_Pembayaran_Ovo_Sosteng.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        jPanel_JikaDiaPesanSosTeng.add(jTextField_Pembayaran_Ovo_Sosteng, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 200, 540, 40));

        jTextField_Pembayaran_Gopay_Sosteng.setEditable(false);
        jTextField_Pembayaran_Gopay_Sosteng.setBackground(new java.awt.Color(255, 255, 255));
        jTextField_Pembayaran_Gopay_Sosteng.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jTextField_Pembayaran_Gopay_Sosteng.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextField_Pembayaran_Gopay_Sosteng.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        jPanel_JikaDiaPesanSosTeng.add(jTextField_Pembayaran_Gopay_Sosteng, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 270, 540, 40));

        jTextField_Pembayaran_Shopepay_Sosteng.setEditable(false);
        jTextField_Pembayaran_Shopepay_Sosteng.setBackground(new java.awt.Color(255, 255, 255));
        jTextField_Pembayaran_Shopepay_Sosteng.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jTextField_Pembayaran_Shopepay_Sosteng.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextField_Pembayaran_Shopepay_Sosteng.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        jPanel_JikaDiaPesanSosTeng.add(jTextField_Pembayaran_Shopepay_Sosteng, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 340, 540, 40));

        jTextField_Pembayaran_Langsung_Sosteng.setEditable(false);
        jTextField_Pembayaran_Langsung_Sosteng.setBackground(new java.awt.Color(255, 255, 255));
        jTextField_Pembayaran_Langsung_Sosteng.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jTextField_Pembayaran_Langsung_Sosteng.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextField_Pembayaran_Langsung_Sosteng.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        jPanel_JikaDiaPesanSosTeng.add(jTextField_Pembayaran_Langsung_Sosteng, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 410, 540, 40));

        jCheckBox_Pembayaran_Dana_Sosteng.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox_Pembayaran_Dana_SostengActionPerformed(evt);
            }
        });
        jPanel_JikaDiaPesanSosTeng.add(jCheckBox_Pembayaran_Dana_Sosteng, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 140, -1, -1));

        jCheckBox_Pembayaran_Ovo_Sosteng.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox_Pembayaran_Ovo_SostengActionPerformed(evt);
            }
        });
        jPanel_JikaDiaPesanSosTeng.add(jCheckBox_Pembayaran_Ovo_Sosteng, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 210, -1, -1));

        jCheckBox_Pembayaran_Gopay_Sosteng.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox_Pembayaran_Gopay_SostengActionPerformed(evt);
            }
        });
        jPanel_JikaDiaPesanSosTeng.add(jCheckBox_Pembayaran_Gopay_Sosteng, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 280, -1, -1));

        jCheckBox_Pembayaran_Shopepay_Sosteng.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox_Pembayaran_Shopepay_SostengActionPerformed(evt);
            }
        });
        jPanel_JikaDiaPesanSosTeng.add(jCheckBox_Pembayaran_Shopepay_Sosteng, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 350, -1, -1));

        jCheckBox_Pembayaran_Langsung_Sosteng.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox_Pembayaran_Langsung_SostengActionPerformed(evt);
            }
        });
        jPanel_JikaDiaPesanSosTeng.add(jCheckBox_Pembayaran_Langsung_Sosteng, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 420, -1, -1));

        jButton_BeliSekarangPembayaranSosteng.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton_BeliSekarangPembayaranSosteng.setText("Beli Sekarang");
        jButton_BeliSekarangPembayaranSosteng.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_BeliSekarangPembayaranSostengActionPerformed(evt);
            }
        });
        jPanel_JikaDiaPesanSosTeng.add(jButton_BeliSekarangPembayaranSosteng, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 550, 340, -1));

        jPanel_Order.add(jPanel_JikaDiaPesanSosTeng, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 820, 600));

        jPanel_JikaDiaPesanNasiGoreng.setBackground(new java.awt.Color(255, 255, 255));
        jPanel_JikaDiaPesanNasiGoreng.setPreferredSize(new java.awt.Dimension(610, 420));
        jPanel_JikaDiaPesanNasiGoreng.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton_BackPembayaranNasiGoreng.setText("<< Back");
        jButton_BackPembayaranNasiGoreng.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_BackPembayaranNasiGorengActionPerformed(evt);
            }
        });
        jPanel_JikaDiaPesanNasiGoreng.add(jButton_BackPembayaranNasiGoreng, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 80, 30));

        jLabel63.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel63.setText("Pembayaran");
        jPanel_JikaDiaPesanNasiGoreng.add(jLabel63, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 60, -1, -1));

        jLabel_Pembayaran_Dana_NasiGoreng.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImageMakanan_Minuman/Dana.jpg"))); // NOI18N
        jPanel_JikaDiaPesanNasiGoreng.add(jLabel_Pembayaran_Dana_NasiGoreng, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 135, 60, 30));

        jLabel_Pembayaran_Ovo_NasiGoreng.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImageMakanan_Minuman/Ovo.png"))); // NOI18N
        jPanel_JikaDiaPesanNasiGoreng.add(jLabel_Pembayaran_Ovo_NasiGoreng, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 205, 60, 30));

        jLabel_Pembayaran_Gopay_NasiGoreng.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImageMakanan_Minuman/GoPay Logo.png"))); // NOI18N
        jPanel_JikaDiaPesanNasiGoreng.add(jLabel_Pembayaran_Gopay_NasiGoreng, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 270, 60, 40));

        jLabel_Pembayaran_Shopepay_NasiGoreng.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImageMakanan_Minuman/Logo ShopeePay.png"))); // NOI18N
        jPanel_JikaDiaPesanNasiGoreng.add(jLabel_Pembayaran_Shopepay_NasiGoreng, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 340, 60, 40));

        jLabel_Pembayaran_Langsung_NasiGoreng.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel_Pembayaran_Langsung_NasiGoreng.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel_Pembayaran_Langsung_NasiGoreng.setText("Pembayaran Langsung");
        jPanel_JikaDiaPesanNasiGoreng.add(jLabel_Pembayaran_Langsung_NasiGoreng, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 410, 200, 40));

        jTextField_Pembayaran_Dana_NasiGoreng.setEditable(false);
        jTextField_Pembayaran_Dana_NasiGoreng.setBackground(new java.awt.Color(255, 255, 255));
        jTextField_Pembayaran_Dana_NasiGoreng.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jTextField_Pembayaran_Dana_NasiGoreng.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextField_Pembayaran_Dana_NasiGoreng.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        jPanel_JikaDiaPesanNasiGoreng.add(jTextField_Pembayaran_Dana_NasiGoreng, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 130, 540, 40));

        jTextField_Pembayaran_Ovo_NasiGoreng.setEditable(false);
        jTextField_Pembayaran_Ovo_NasiGoreng.setBackground(new java.awt.Color(255, 255, 255));
        jTextField_Pembayaran_Ovo_NasiGoreng.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jTextField_Pembayaran_Ovo_NasiGoreng.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextField_Pembayaran_Ovo_NasiGoreng.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        jPanel_JikaDiaPesanNasiGoreng.add(jTextField_Pembayaran_Ovo_NasiGoreng, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 200, 540, 40));

        jTextField_Pembayaran_Gopay_NasiGoreng.setEditable(false);
        jTextField_Pembayaran_Gopay_NasiGoreng.setBackground(new java.awt.Color(255, 255, 255));
        jTextField_Pembayaran_Gopay_NasiGoreng.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jTextField_Pembayaran_Gopay_NasiGoreng.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextField_Pembayaran_Gopay_NasiGoreng.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        jPanel_JikaDiaPesanNasiGoreng.add(jTextField_Pembayaran_Gopay_NasiGoreng, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 270, 540, 40));

        jTextField_Pembayaran_Shopepay_NasiGoreng.setEditable(false);
        jTextField_Pembayaran_Shopepay_NasiGoreng.setBackground(new java.awt.Color(255, 255, 255));
        jTextField_Pembayaran_Shopepay_NasiGoreng.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jTextField_Pembayaran_Shopepay_NasiGoreng.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextField_Pembayaran_Shopepay_NasiGoreng.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        jPanel_JikaDiaPesanNasiGoreng.add(jTextField_Pembayaran_Shopepay_NasiGoreng, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 340, 540, 40));

        jTextField_Pembayaran_Langsung_NasiGoreng.setEditable(false);
        jTextField_Pembayaran_Langsung_NasiGoreng.setBackground(new java.awt.Color(255, 255, 255));
        jTextField_Pembayaran_Langsung_NasiGoreng.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jTextField_Pembayaran_Langsung_NasiGoreng.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextField_Pembayaran_Langsung_NasiGoreng.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        jPanel_JikaDiaPesanNasiGoreng.add(jTextField_Pembayaran_Langsung_NasiGoreng, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 410, 540, 40));

        jButton_BeliSekarangPembayaranNasiGoreng.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton_BeliSekarangPembayaranNasiGoreng.setText("Beli Sekarang");
        jButton_BeliSekarangPembayaranNasiGoreng.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_BeliSekarangPembayaranNasiGorengActionPerformed(evt);
            }
        });
        jPanel_JikaDiaPesanNasiGoreng.add(jButton_BeliSekarangPembayaranNasiGoreng, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 550, 340, -1));

        jCheckBox_Pembayaran_Dana_NasiGoreng.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox_Pembayaran_Dana_NasiGorengActionPerformed(evt);
            }
        });
        jPanel_JikaDiaPesanNasiGoreng.add(jCheckBox_Pembayaran_Dana_NasiGoreng, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 140, -1, -1));

        jCheckBox_Pembayaran_Ovo_NasiGoreng.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox_Pembayaran_Ovo_NasiGorengActionPerformed(evt);
            }
        });
        jPanel_JikaDiaPesanNasiGoreng.add(jCheckBox_Pembayaran_Ovo_NasiGoreng, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 210, -1, -1));

        jCheckBox_Pembayaran_Gopay_NasiGoreng.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox_Pembayaran_Gopay_NasiGorengActionPerformed(evt);
            }
        });
        jPanel_JikaDiaPesanNasiGoreng.add(jCheckBox_Pembayaran_Gopay_NasiGoreng, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 280, -1, -1));

        jCheckBox_Pembayaran_Shopepay_NasiGoreng.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox_Pembayaran_Shopepay_NasiGorengActionPerformed(evt);
            }
        });
        jPanel_JikaDiaPesanNasiGoreng.add(jCheckBox_Pembayaran_Shopepay_NasiGoreng, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 350, -1, -1));

        jCheckBox_Pembayaran_Langsung_NasiGoreng.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox_Pembayaran_Langsung_NasiGorengActionPerformed(evt);
            }
        });
        jPanel_JikaDiaPesanNasiGoreng.add(jCheckBox_Pembayaran_Langsung_NasiGoreng, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 420, -1, -1));

        jPanel_Order.add(jPanel_JikaDiaPesanNasiGoreng, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 820, 600));

        jPanel_JikaDiaPesanKwetiawGoreng.setBackground(new java.awt.Color(255, 255, 255));
        jPanel_JikaDiaPesanKwetiawGoreng.setPreferredSize(new java.awt.Dimension(610, 420));
        jPanel_JikaDiaPesanKwetiawGoreng.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton_BackPembayaranKwetiawGoreng.setText("<< Back");
        jButton_BackPembayaranKwetiawGoreng.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_BackPembayaranKwetiawGorengActionPerformed(evt);
            }
        });
        jPanel_JikaDiaPesanKwetiawGoreng.add(jButton_BackPembayaranKwetiawGoreng, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 80, 30));

        jLabel64.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel64.setText("Pembayaran");
        jPanel_JikaDiaPesanKwetiawGoreng.add(jLabel64, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 60, -1, -1));

        jLabel_Pembayaran_Dana_KwetiawGoreng.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImageMakanan_Minuman/Dana.jpg"))); // NOI18N
        jPanel_JikaDiaPesanKwetiawGoreng.add(jLabel_Pembayaran_Dana_KwetiawGoreng, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 135, 60, 30));

        jLabel_Pembayaran_Ovo_Kwetiaw.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImageMakanan_Minuman/Ovo.png"))); // NOI18N
        jPanel_JikaDiaPesanKwetiawGoreng.add(jLabel_Pembayaran_Ovo_Kwetiaw, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 205, 60, 30));

        jLabel_Pembayaran_Gopay_KwetiawGoreng.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImageMakanan_Minuman/GoPay Logo.png"))); // NOI18N
        jPanel_JikaDiaPesanKwetiawGoreng.add(jLabel_Pembayaran_Gopay_KwetiawGoreng, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 270, 60, 40));

        jLabel_Pembayaran_Shopepay_KwetiawGoreng.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImageMakanan_Minuman/Logo ShopeePay.png"))); // NOI18N
        jPanel_JikaDiaPesanKwetiawGoreng.add(jLabel_Pembayaran_Shopepay_KwetiawGoreng, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 340, 60, 40));

        jLabel_Pembayaran_Langsung_KwetiawGoreng.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel_Pembayaran_Langsung_KwetiawGoreng.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel_Pembayaran_Langsung_KwetiawGoreng.setText("Pembayaran Langsung");
        jPanel_JikaDiaPesanKwetiawGoreng.add(jLabel_Pembayaran_Langsung_KwetiawGoreng, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 410, 200, 40));

        jTextField_Pembayaran_Dana_KwetiawGoreng.setEditable(false);
        jTextField_Pembayaran_Dana_KwetiawGoreng.setBackground(new java.awt.Color(255, 255, 255));
        jTextField_Pembayaran_Dana_KwetiawGoreng.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jTextField_Pembayaran_Dana_KwetiawGoreng.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextField_Pembayaran_Dana_KwetiawGoreng.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        jPanel_JikaDiaPesanKwetiawGoreng.add(jTextField_Pembayaran_Dana_KwetiawGoreng, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 130, 540, 40));

        jTextField_Pembayaran_Ovo_KwetiawGoreng.setEditable(false);
        jTextField_Pembayaran_Ovo_KwetiawGoreng.setBackground(new java.awt.Color(255, 255, 255));
        jTextField_Pembayaran_Ovo_KwetiawGoreng.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jTextField_Pembayaran_Ovo_KwetiawGoreng.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextField_Pembayaran_Ovo_KwetiawGoreng.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        jPanel_JikaDiaPesanKwetiawGoreng.add(jTextField_Pembayaran_Ovo_KwetiawGoreng, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 200, 540, 40));

        jTextField_Pembayaran_Gopay_KwetiawGoreng.setEditable(false);
        jTextField_Pembayaran_Gopay_KwetiawGoreng.setBackground(new java.awt.Color(255, 255, 255));
        jTextField_Pembayaran_Gopay_KwetiawGoreng.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jTextField_Pembayaran_Gopay_KwetiawGoreng.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextField_Pembayaran_Gopay_KwetiawGoreng.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        jPanel_JikaDiaPesanKwetiawGoreng.add(jTextField_Pembayaran_Gopay_KwetiawGoreng, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 270, 540, 40));

        jTextField_Pembayaran_Shopepay_KwetiawGoreng.setEditable(false);
        jTextField_Pembayaran_Shopepay_KwetiawGoreng.setBackground(new java.awt.Color(255, 255, 255));
        jTextField_Pembayaran_Shopepay_KwetiawGoreng.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jTextField_Pembayaran_Shopepay_KwetiawGoreng.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextField_Pembayaran_Shopepay_KwetiawGoreng.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        jPanel_JikaDiaPesanKwetiawGoreng.add(jTextField_Pembayaran_Shopepay_KwetiawGoreng, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 340, 540, 40));

        jTextField_Pembayaran_Langsung_KwetiawGoreng.setEditable(false);
        jTextField_Pembayaran_Langsung_KwetiawGoreng.setBackground(new java.awt.Color(255, 255, 255));
        jTextField_Pembayaran_Langsung_KwetiawGoreng.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jTextField_Pembayaran_Langsung_KwetiawGoreng.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextField_Pembayaran_Langsung_KwetiawGoreng.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        jPanel_JikaDiaPesanKwetiawGoreng.add(jTextField_Pembayaran_Langsung_KwetiawGoreng, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 410, 540, 40));

        jCheckBox_Pembayaran_Dana_KwetiawGoreng.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox_Pembayaran_Dana_KwetiawGorengActionPerformed(evt);
            }
        });
        jPanel_JikaDiaPesanKwetiawGoreng.add(jCheckBox_Pembayaran_Dana_KwetiawGoreng, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 140, -1, -1));

        jCheckBox_Pembayaran_Ovo_KwetiawGoreng.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox_Pembayaran_Ovo_KwetiawGorengActionPerformed(evt);
            }
        });
        jPanel_JikaDiaPesanKwetiawGoreng.add(jCheckBox_Pembayaran_Ovo_KwetiawGoreng, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 210, -1, -1));

        jCheckBox_Pembayaran_Gopay_KwetiawGoreng.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox_Pembayaran_Gopay_KwetiawGorengActionPerformed(evt);
            }
        });
        jPanel_JikaDiaPesanKwetiawGoreng.add(jCheckBox_Pembayaran_Gopay_KwetiawGoreng, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 280, -1, -1));

        jCheckBox_Pembayaran_Shopepay_KwetiawGoreng.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox_Pembayaran_Shopepay_KwetiawGorengActionPerformed(evt);
            }
        });
        jPanel_JikaDiaPesanKwetiawGoreng.add(jCheckBox_Pembayaran_Shopepay_KwetiawGoreng, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 350, -1, -1));

        jCheckBox_Pembayaran_Langsung_KwetiawGoreng.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox_Pembayaran_Langsung_KwetiawGorengActionPerformed(evt);
            }
        });
        jPanel_JikaDiaPesanKwetiawGoreng.add(jCheckBox_Pembayaran_Langsung_KwetiawGoreng, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 420, -1, -1));

        jButton_BeliSekarangPembayaranKwetiawGoreng.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton_BeliSekarangPembayaranKwetiawGoreng.setText("Beli Sekarang");
        jButton_BeliSekarangPembayaranKwetiawGoreng.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_BeliSekarangPembayaranKwetiawGorengActionPerformed(evt);
            }
        });
        jPanel_JikaDiaPesanKwetiawGoreng.add(jButton_BeliSekarangPembayaranKwetiawGoreng, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 550, 340, -1));

        jPanel_Order.add(jPanel_JikaDiaPesanKwetiawGoreng, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 820, 600));

        jPanel_JikaDiaPesanKopi.setBackground(new java.awt.Color(255, 255, 255));
        jPanel_JikaDiaPesanKopi.setPreferredSize(new java.awt.Dimension(610, 420));
        jPanel_JikaDiaPesanKopi.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton_BackPembayaranKopi.setText("<< Back");
        jButton_BackPembayaranKopi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_BackPembayaranKopiActionPerformed(evt);
            }
        });
        jPanel_JikaDiaPesanKopi.add(jButton_BackPembayaranKopi, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 80, 30));

        jLabel65.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel65.setText("Pembayaran");
        jPanel_JikaDiaPesanKopi.add(jLabel65, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 60, -1, -1));

        jLabel_Pembayaran_Dana_Kopi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImageMakanan_Minuman/Dana.jpg"))); // NOI18N
        jPanel_JikaDiaPesanKopi.add(jLabel_Pembayaran_Dana_Kopi, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 135, 60, 30));

        jLabel_Pembayaran_Ovo_Kopi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImageMakanan_Minuman/Ovo.png"))); // NOI18N
        jPanel_JikaDiaPesanKopi.add(jLabel_Pembayaran_Ovo_Kopi, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 205, 60, 30));

        jLabel_Pembayaran_Gopay_Kopi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImageMakanan_Minuman/GoPay Logo.png"))); // NOI18N
        jPanel_JikaDiaPesanKopi.add(jLabel_Pembayaran_Gopay_Kopi, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 270, 60, 40));

        jLabel_Pembayaran_Shopepay_Kopi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImageMakanan_Minuman/Logo ShopeePay.png"))); // NOI18N
        jPanel_JikaDiaPesanKopi.add(jLabel_Pembayaran_Shopepay_Kopi, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 340, 60, 40));

        jLabel_Pembayaran_Langsung_Kopi.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel_Pembayaran_Langsung_Kopi.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel_Pembayaran_Langsung_Kopi.setText("Pembayaran Langsung");
        jPanel_JikaDiaPesanKopi.add(jLabel_Pembayaran_Langsung_Kopi, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 410, 200, 40));

        jTextField_Pembayaran_Dana_Kopi.setEditable(false);
        jTextField_Pembayaran_Dana_Kopi.setBackground(new java.awt.Color(255, 255, 255));
        jTextField_Pembayaran_Dana_Kopi.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jTextField_Pembayaran_Dana_Kopi.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextField_Pembayaran_Dana_Kopi.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        jPanel_JikaDiaPesanKopi.add(jTextField_Pembayaran_Dana_Kopi, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 130, 540, 40));

        jTextField_Pembayaran_Ovo_Kopi.setEditable(false);
        jTextField_Pembayaran_Ovo_Kopi.setBackground(new java.awt.Color(255, 255, 255));
        jTextField_Pembayaran_Ovo_Kopi.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jTextField_Pembayaran_Ovo_Kopi.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextField_Pembayaran_Ovo_Kopi.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        jPanel_JikaDiaPesanKopi.add(jTextField_Pembayaran_Ovo_Kopi, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 200, 540, 40));

        jTextField_Pembayaran_Gopay_Kopi.setEditable(false);
        jTextField_Pembayaran_Gopay_Kopi.setBackground(new java.awt.Color(255, 255, 255));
        jTextField_Pembayaran_Gopay_Kopi.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jTextField_Pembayaran_Gopay_Kopi.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextField_Pembayaran_Gopay_Kopi.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        jPanel_JikaDiaPesanKopi.add(jTextField_Pembayaran_Gopay_Kopi, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 270, 540, 40));

        jTextField_Pembayaran_Shopepay_Kopi.setEditable(false);
        jTextField_Pembayaran_Shopepay_Kopi.setBackground(new java.awt.Color(255, 255, 255));
        jTextField_Pembayaran_Shopepay_Kopi.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jTextField_Pembayaran_Shopepay_Kopi.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextField_Pembayaran_Shopepay_Kopi.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        jPanel_JikaDiaPesanKopi.add(jTextField_Pembayaran_Shopepay_Kopi, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 340, 540, 40));

        jTextField_Pembayaran_Langsung_Kopi.setEditable(false);
        jTextField_Pembayaran_Langsung_Kopi.setBackground(new java.awt.Color(255, 255, 255));
        jTextField_Pembayaran_Langsung_Kopi.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jTextField_Pembayaran_Langsung_Kopi.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextField_Pembayaran_Langsung_Kopi.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        jPanel_JikaDiaPesanKopi.add(jTextField_Pembayaran_Langsung_Kopi, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 410, 540, 40));

        jButton_BeliSekarangPembayaranKopi.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton_BeliSekarangPembayaranKopi.setText("Beli Sekarang");
        jButton_BeliSekarangPembayaranKopi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_BeliSekarangPembayaranKopiActionPerformed(evt);
            }
        });
        jPanel_JikaDiaPesanKopi.add(jButton_BeliSekarangPembayaranKopi, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 550, 340, -1));

        jCheckBox_Pembayaran_Dana_Kopi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox_Pembayaran_Dana_KopiActionPerformed(evt);
            }
        });
        jPanel_JikaDiaPesanKopi.add(jCheckBox_Pembayaran_Dana_Kopi, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 140, -1, -1));

        jCheckBox_Pembayaran_Ovo_Kopi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox_Pembayaran_Ovo_KopiActionPerformed(evt);
            }
        });
        jPanel_JikaDiaPesanKopi.add(jCheckBox_Pembayaran_Ovo_Kopi, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 210, -1, -1));

        jCheckBox_Pembayaran_Gopay_Kopi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox_Pembayaran_Gopay_KopiActionPerformed(evt);
            }
        });
        jPanel_JikaDiaPesanKopi.add(jCheckBox_Pembayaran_Gopay_Kopi, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 280, -1, -1));

        jCheckBox_Pembayaran_Shopepay_Kopi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox_Pembayaran_Shopepay_KopiActionPerformed(evt);
            }
        });
        jPanel_JikaDiaPesanKopi.add(jCheckBox_Pembayaran_Shopepay_Kopi, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 350, -1, -1));

        jCheckBox_Pembayaran_Langsung_Kopi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox_Pembayaran_Langsung_KopiActionPerformed(evt);
            }
        });
        jPanel_JikaDiaPesanKopi.add(jCheckBox_Pembayaran_Langsung_Kopi, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 420, -1, -1));

        jPanel_Order.add(jPanel_JikaDiaPesanKopi, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 820, 600));

        jPanel_JikaDiaPesanEsTeh.setBackground(new java.awt.Color(255, 255, 255));
        jPanel_JikaDiaPesanEsTeh.setPreferredSize(new java.awt.Dimension(610, 420));
        jPanel_JikaDiaPesanEsTeh.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton_BackPembayaranEsTeh.setText("<< Back");
        jButton_BackPembayaranEsTeh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_BackPembayaranEsTehActionPerformed(evt);
            }
        });
        jPanel_JikaDiaPesanEsTeh.add(jButton_BackPembayaranEsTeh, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 80, 30));

        jLabel66.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel66.setText("Pembayaran");
        jPanel_JikaDiaPesanEsTeh.add(jLabel66, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 60, -1, -1));

        jLabel_Pembayaran_Dana_EsTeh.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImageMakanan_Minuman/Dana.jpg"))); // NOI18N
        jPanel_JikaDiaPesanEsTeh.add(jLabel_Pembayaran_Dana_EsTeh, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 135, 60, 30));

        jLabel_Pembayaran_Ovo_EsTeh.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImageMakanan_Minuman/Ovo.png"))); // NOI18N
        jPanel_JikaDiaPesanEsTeh.add(jLabel_Pembayaran_Ovo_EsTeh, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 205, 60, 30));

        jLabel_Pembayaran_Gopay_EsTeh.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImageMakanan_Minuman/GoPay Logo.png"))); // NOI18N
        jPanel_JikaDiaPesanEsTeh.add(jLabel_Pembayaran_Gopay_EsTeh, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 270, 60, 40));

        jLabel_Pembayaran_Shopepay_EsTeh.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImageMakanan_Minuman/Logo ShopeePay.png"))); // NOI18N
        jPanel_JikaDiaPesanEsTeh.add(jLabel_Pembayaran_Shopepay_EsTeh, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 340, 60, 40));

        jLabel_Pembayaran_Langsung_EsTeh.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel_Pembayaran_Langsung_EsTeh.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel_Pembayaran_Langsung_EsTeh.setText("Pembayaran Langsung");
        jPanel_JikaDiaPesanEsTeh.add(jLabel_Pembayaran_Langsung_EsTeh, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 410, 200, 40));

        jTextField_Pembayaran_Dana_EsTeh.setEditable(false);
        jTextField_Pembayaran_Dana_EsTeh.setBackground(new java.awt.Color(255, 255, 255));
        jTextField_Pembayaran_Dana_EsTeh.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jTextField_Pembayaran_Dana_EsTeh.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextField_Pembayaran_Dana_EsTeh.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        jPanel_JikaDiaPesanEsTeh.add(jTextField_Pembayaran_Dana_EsTeh, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 130, 540, 40));

        jTextField_Pembayaran_Ovo_EsTeh.setEditable(false);
        jTextField_Pembayaran_Ovo_EsTeh.setBackground(new java.awt.Color(255, 255, 255));
        jTextField_Pembayaran_Ovo_EsTeh.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jTextField_Pembayaran_Ovo_EsTeh.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextField_Pembayaran_Ovo_EsTeh.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        jPanel_JikaDiaPesanEsTeh.add(jTextField_Pembayaran_Ovo_EsTeh, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 200, 540, 40));

        jTextField_Pembayaran_Gopay_EsTeh.setEditable(false);
        jTextField_Pembayaran_Gopay_EsTeh.setBackground(new java.awt.Color(255, 255, 255));
        jTextField_Pembayaran_Gopay_EsTeh.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jTextField_Pembayaran_Gopay_EsTeh.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextField_Pembayaran_Gopay_EsTeh.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        jPanel_JikaDiaPesanEsTeh.add(jTextField_Pembayaran_Gopay_EsTeh, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 270, 540, 40));

        jTextField_Pembayaran_Shopepay_EsTeh.setEditable(false);
        jTextField_Pembayaran_Shopepay_EsTeh.setBackground(new java.awt.Color(255, 255, 255));
        jTextField_Pembayaran_Shopepay_EsTeh.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jTextField_Pembayaran_Shopepay_EsTeh.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextField_Pembayaran_Shopepay_EsTeh.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        jPanel_JikaDiaPesanEsTeh.add(jTextField_Pembayaran_Shopepay_EsTeh, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 340, 540, 40));

        jTextField_Pembayaran_Langsung_EsTeh.setEditable(false);
        jTextField_Pembayaran_Langsung_EsTeh.setBackground(new java.awt.Color(255, 255, 255));
        jTextField_Pembayaran_Langsung_EsTeh.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jTextField_Pembayaran_Langsung_EsTeh.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextField_Pembayaran_Langsung_EsTeh.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        jPanel_JikaDiaPesanEsTeh.add(jTextField_Pembayaran_Langsung_EsTeh, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 410, 540, 40));

        jButton_BeliSekarangPembayaranEsTeh.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton_BeliSekarangPembayaranEsTeh.setText("Beli Sekarang");
        jButton_BeliSekarangPembayaranEsTeh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_BeliSekarangPembayaranEsTehActionPerformed(evt);
            }
        });
        jPanel_JikaDiaPesanEsTeh.add(jButton_BeliSekarangPembayaranEsTeh, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 550, 340, -1));

        jCheckBox_Pembayaran_Dana_EsTeh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox_Pembayaran_Dana_EsTehActionPerformed(evt);
            }
        });
        jPanel_JikaDiaPesanEsTeh.add(jCheckBox_Pembayaran_Dana_EsTeh, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 140, -1, -1));

        jCheckBox_Pembayaran_Ovo_EsTeh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox_Pembayaran_Ovo_EsTehActionPerformed(evt);
            }
        });
        jPanel_JikaDiaPesanEsTeh.add(jCheckBox_Pembayaran_Ovo_EsTeh, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 210, -1, -1));

        jCheckBox_Pembayaran_Gopay_EsTeh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox_Pembayaran_Gopay_EsTehActionPerformed(evt);
            }
        });
        jPanel_JikaDiaPesanEsTeh.add(jCheckBox_Pembayaran_Gopay_EsTeh, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 280, -1, -1));

        jCheckBox_Pembayaran_Shopepay_EsTeh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox_Pembayaran_Shopepay_EsTehActionPerformed(evt);
            }
        });
        jPanel_JikaDiaPesanEsTeh.add(jCheckBox_Pembayaran_Shopepay_EsTeh, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 350, -1, -1));

        jCheckBox_Pembayaran_Langsung_EsTeh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox_Pembayaran_Langsung_EsTehActionPerformed(evt);
            }
        });
        jPanel_JikaDiaPesanEsTeh.add(jCheckBox_Pembayaran_Langsung_EsTeh, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 420, -1, -1));

        jPanel_Order.add(jPanel_JikaDiaPesanEsTeh, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 820, 600));

        jPanel_JikaDiaPesanAirMineral.setBackground(new java.awt.Color(255, 255, 255));
        jPanel_JikaDiaPesanAirMineral.setPreferredSize(new java.awt.Dimension(610, 420));
        jPanel_JikaDiaPesanAirMineral.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton_BackPembayaranAirMineral.setText("<< Back");
        jButton_BackPembayaranAirMineral.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_BackPembayaranAirMineralActionPerformed(evt);
            }
        });
        jPanel_JikaDiaPesanAirMineral.add(jButton_BackPembayaranAirMineral, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 80, 30));

        jLabel67.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel67.setText("Pembayaran");
        jPanel_JikaDiaPesanAirMineral.add(jLabel67, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 60, -1, -1));

        jLabel_Pembayaran_Dana_AirMineral.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImageMakanan_Minuman/Dana.jpg"))); // NOI18N
        jPanel_JikaDiaPesanAirMineral.add(jLabel_Pembayaran_Dana_AirMineral, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 135, 60, 30));

        jLabel_Pembayaran_Ovo_AirMineral.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImageMakanan_Minuman/Ovo.png"))); // NOI18N
        jPanel_JikaDiaPesanAirMineral.add(jLabel_Pembayaran_Ovo_AirMineral, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 205, 60, 30));

        jLabel_Pembayaran_Gopay_AirMineral.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImageMakanan_Minuman/GoPay Logo.png"))); // NOI18N
        jPanel_JikaDiaPesanAirMineral.add(jLabel_Pembayaran_Gopay_AirMineral, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 270, 60, 40));

        jLabel_Pembayaran_Shopepay_AirMineral.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImageMakanan_Minuman/Logo ShopeePay.png"))); // NOI18N
        jPanel_JikaDiaPesanAirMineral.add(jLabel_Pembayaran_Shopepay_AirMineral, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 340, 60, 40));

        jLabel_Pembayaran_Langsung_AirMineral.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel_Pembayaran_Langsung_AirMineral.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel_Pembayaran_Langsung_AirMineral.setText("Pembayaran Langsung");
        jPanel_JikaDiaPesanAirMineral.add(jLabel_Pembayaran_Langsung_AirMineral, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 410, 200, 40));

        jTextField_Pembayaran_Dana_AirMineral.setEditable(false);
        jTextField_Pembayaran_Dana_AirMineral.setBackground(new java.awt.Color(255, 255, 255));
        jTextField_Pembayaran_Dana_AirMineral.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jTextField_Pembayaran_Dana_AirMineral.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextField_Pembayaran_Dana_AirMineral.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        jPanel_JikaDiaPesanAirMineral.add(jTextField_Pembayaran_Dana_AirMineral, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 130, 540, 40));

        jTextField_Pembayaran_Ovo_AirMineral.setEditable(false);
        jTextField_Pembayaran_Ovo_AirMineral.setBackground(new java.awt.Color(255, 255, 255));
        jTextField_Pembayaran_Ovo_AirMineral.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jTextField_Pembayaran_Ovo_AirMineral.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextField_Pembayaran_Ovo_AirMineral.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        jPanel_JikaDiaPesanAirMineral.add(jTextField_Pembayaran_Ovo_AirMineral, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 200, 540, 40));

        jTextField_Pembayaran_Gopay_AirMineral.setEditable(false);
        jTextField_Pembayaran_Gopay_AirMineral.setBackground(new java.awt.Color(255, 255, 255));
        jTextField_Pembayaran_Gopay_AirMineral.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jTextField_Pembayaran_Gopay_AirMineral.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextField_Pembayaran_Gopay_AirMineral.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        jPanel_JikaDiaPesanAirMineral.add(jTextField_Pembayaran_Gopay_AirMineral, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 270, 540, 40));

        jTextField_Pembayaran_Shopepay_AirMineral.setEditable(false);
        jTextField_Pembayaran_Shopepay_AirMineral.setBackground(new java.awt.Color(255, 255, 255));
        jTextField_Pembayaran_Shopepay_AirMineral.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jTextField_Pembayaran_Shopepay_AirMineral.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextField_Pembayaran_Shopepay_AirMineral.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        jPanel_JikaDiaPesanAirMineral.add(jTextField_Pembayaran_Shopepay_AirMineral, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 340, 540, 40));

        jTextField_Pembayaran_Langsung_AirMineral.setEditable(false);
        jTextField_Pembayaran_Langsung_AirMineral.setBackground(new java.awt.Color(255, 255, 255));
        jTextField_Pembayaran_Langsung_AirMineral.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jTextField_Pembayaran_Langsung_AirMineral.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextField_Pembayaran_Langsung_AirMineral.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        jPanel_JikaDiaPesanAirMineral.add(jTextField_Pembayaran_Langsung_AirMineral, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 410, 540, 40));

        jButton_BeliSekarangPembayaranAirMineral.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton_BeliSekarangPembayaranAirMineral.setText("Beli Sekarang");
        jButton_BeliSekarangPembayaranAirMineral.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_BeliSekarangPembayaranAirMineralActionPerformed(evt);
            }
        });
        jPanel_JikaDiaPesanAirMineral.add(jButton_BeliSekarangPembayaranAirMineral, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 550, 340, -1));

        jCheckBox_Pembayaran_Dana_AirMineral.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox_Pembayaran_Dana_AirMineralActionPerformed(evt);
            }
        });
        jPanel_JikaDiaPesanAirMineral.add(jCheckBox_Pembayaran_Dana_AirMineral, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 140, -1, -1));

        jCheckBox_Pembayaran_Ovo_AirMineral.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox_Pembayaran_Ovo_AirMineralActionPerformed(evt);
            }
        });
        jPanel_JikaDiaPesanAirMineral.add(jCheckBox_Pembayaran_Ovo_AirMineral, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 210, -1, -1));

        jCheckBox_Pembayaran_Gopay_AirMineral.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox_Pembayaran_Gopay_AirMineralActionPerformed(evt);
            }
        });
        jPanel_JikaDiaPesanAirMineral.add(jCheckBox_Pembayaran_Gopay_AirMineral, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 280, -1, -1));

        jCheckBox_Pembayaran_Shopepay_AirMineral.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox_Pembayaran_Shopepay_AirMineralActionPerformed(evt);
            }
        });
        jPanel_JikaDiaPesanAirMineral.add(jCheckBox_Pembayaran_Shopepay_AirMineral, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 350, -1, -1));

        jCheckBox_Pembayaran_Langsung_AirMineral.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox_Pembayaran_Langsung_AirMineralActionPerformed(evt);
            }
        });
        jPanel_JikaDiaPesanAirMineral.add(jCheckBox_Pembayaran_Langsung_AirMineral, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 420, -1, -1));

        jPanel_Order.add(jPanel_JikaDiaPesanAirMineral, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 820, 600));

        jPanel_JikaDiaPesanCocaCola.setBackground(new java.awt.Color(255, 255, 255));
        jPanel_JikaDiaPesanCocaCola.setPreferredSize(new java.awt.Dimension(610, 420));
        jPanel_JikaDiaPesanCocaCola.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton_BackPembayaranCocaCola.setText("<< Back");
        jButton_BackPembayaranCocaCola.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_BackPembayaranCocaColaActionPerformed(evt);
            }
        });
        jPanel_JikaDiaPesanCocaCola.add(jButton_BackPembayaranCocaCola, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 80, 30));

        jLabel68.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel68.setText("Pembayaran");
        jPanel_JikaDiaPesanCocaCola.add(jLabel68, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 60, -1, -1));

        jLabel_Pembayaran_Dana_CocaCola.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImageMakanan_Minuman/Dana.jpg"))); // NOI18N
        jPanel_JikaDiaPesanCocaCola.add(jLabel_Pembayaran_Dana_CocaCola, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 135, 60, 30));

        jLabel_Pembayaran_Ovo_CocaCola.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImageMakanan_Minuman/Ovo.png"))); // NOI18N
        jPanel_JikaDiaPesanCocaCola.add(jLabel_Pembayaran_Ovo_CocaCola, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 205, 60, 30));

        jLabel_Pembayaran_Gopay_CocaCola.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImageMakanan_Minuman/GoPay Logo.png"))); // NOI18N
        jPanel_JikaDiaPesanCocaCola.add(jLabel_Pembayaran_Gopay_CocaCola, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 270, 60, 40));

        jLabel_Pembayaran_Shopepay_CocaCola.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImageMakanan_Minuman/Logo ShopeePay.png"))); // NOI18N
        jPanel_JikaDiaPesanCocaCola.add(jLabel_Pembayaran_Shopepay_CocaCola, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 340, 60, 40));

        jLabel_Pembayaran_Langsung_CocaCola.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel_Pembayaran_Langsung_CocaCola.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel_Pembayaran_Langsung_CocaCola.setText("Pembayaran Langsung");
        jPanel_JikaDiaPesanCocaCola.add(jLabel_Pembayaran_Langsung_CocaCola, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 410, 200, 40));

        jTextField_Pembayaran_Dana_CocaCola.setEditable(false);
        jTextField_Pembayaran_Dana_CocaCola.setBackground(new java.awt.Color(255, 255, 255));
        jTextField_Pembayaran_Dana_CocaCola.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jTextField_Pembayaran_Dana_CocaCola.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextField_Pembayaran_Dana_CocaCola.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        jPanel_JikaDiaPesanCocaCola.add(jTextField_Pembayaran_Dana_CocaCola, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 130, 540, 40));

        jTextField_Pembayaran_Ovo_CocaCola.setEditable(false);
        jTextField_Pembayaran_Ovo_CocaCola.setBackground(new java.awt.Color(255, 255, 255));
        jTextField_Pembayaran_Ovo_CocaCola.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jTextField_Pembayaran_Ovo_CocaCola.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextField_Pembayaran_Ovo_CocaCola.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        jPanel_JikaDiaPesanCocaCola.add(jTextField_Pembayaran_Ovo_CocaCola, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 200, 540, 40));

        jTextField_Pembayaran_Gopay_CocaCola.setEditable(false);
        jTextField_Pembayaran_Gopay_CocaCola.setBackground(new java.awt.Color(255, 255, 255));
        jTextField_Pembayaran_Gopay_CocaCola.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jTextField_Pembayaran_Gopay_CocaCola.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextField_Pembayaran_Gopay_CocaCola.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        jPanel_JikaDiaPesanCocaCola.add(jTextField_Pembayaran_Gopay_CocaCola, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 270, 540, 40));

        jTextField_Pembayaran_Shopepay_CocaCola.setEditable(false);
        jTextField_Pembayaran_Shopepay_CocaCola.setBackground(new java.awt.Color(255, 255, 255));
        jTextField_Pembayaran_Shopepay_CocaCola.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jTextField_Pembayaran_Shopepay_CocaCola.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextField_Pembayaran_Shopepay_CocaCola.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        jPanel_JikaDiaPesanCocaCola.add(jTextField_Pembayaran_Shopepay_CocaCola, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 340, 540, 40));

        jTextField_Pembayaran_Langsung_CocaCola.setEditable(false);
        jTextField_Pembayaran_Langsung_CocaCola.setBackground(new java.awt.Color(255, 255, 255));
        jTextField_Pembayaran_Langsung_CocaCola.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jTextField_Pembayaran_Langsung_CocaCola.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextField_Pembayaran_Langsung_CocaCola.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        jPanel_JikaDiaPesanCocaCola.add(jTextField_Pembayaran_Langsung_CocaCola, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 410, 540, 40));

        jButton_BeliSekarangPembayaranCocaCola.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton_BeliSekarangPembayaranCocaCola.setText("Beli Sekarang");
        jButton_BeliSekarangPembayaranCocaCola.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_BeliSekarangPembayaranCocaColaActionPerformed(evt);
            }
        });
        jPanel_JikaDiaPesanCocaCola.add(jButton_BeliSekarangPembayaranCocaCola, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 550, 340, -1));

        jCheckBox_Pembayaran_Dana_CocaCola.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox_Pembayaran_Dana_CocaColaActionPerformed(evt);
            }
        });
        jPanel_JikaDiaPesanCocaCola.add(jCheckBox_Pembayaran_Dana_CocaCola, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 140, -1, -1));

        jCheckBox_Pembayaran_Ovo_CocaCola.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox_Pembayaran_Ovo_CocaColaActionPerformed(evt);
            }
        });
        jPanel_JikaDiaPesanCocaCola.add(jCheckBox_Pembayaran_Ovo_CocaCola, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 210, -1, -1));

        jCheckBox_Pembayaran_Gopay_CocaCola.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox_Pembayaran_Gopay_CocaColaActionPerformed(evt);
            }
        });
        jPanel_JikaDiaPesanCocaCola.add(jCheckBox_Pembayaran_Gopay_CocaCola, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 280, -1, -1));

        jCheckBox_Pembayaran_Shopepay_CocaCola.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox_Pembayaran_Shopepay_CocaColaActionPerformed(evt);
            }
        });
        jPanel_JikaDiaPesanCocaCola.add(jCheckBox_Pembayaran_Shopepay_CocaCola, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 350, -1, -1));

        jCheckBox_Pembayaran_Langsung_CocaCola.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox_Pembayaran_Langsung_CocaColaActionPerformed(evt);
            }
        });
        jPanel_JikaDiaPesanCocaCola.add(jCheckBox_Pembayaran_Langsung_CocaCola, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 420, -1, -1));

        jPanel_Order.add(jPanel_JikaDiaPesanCocaCola, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 820, 600));

        jPanel_JikaDiaPesanSprite.setBackground(new java.awt.Color(255, 255, 255));
        jPanel_JikaDiaPesanSprite.setPreferredSize(new java.awt.Dimension(610, 420));
        jPanel_JikaDiaPesanSprite.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton_BackPembayaranSprite.setText("<< Back");
        jButton_BackPembayaranSprite.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_BackPembayaranSpriteActionPerformed(evt);
            }
        });
        jPanel_JikaDiaPesanSprite.add(jButton_BackPembayaranSprite, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 80, 30));

        jLabel69.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel69.setText("Pembayaran");
        jPanel_JikaDiaPesanSprite.add(jLabel69, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 60, -1, -1));

        jLabel_Pembayaran_Dana_Sprite.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImageMakanan_Minuman/Dana.jpg"))); // NOI18N
        jPanel_JikaDiaPesanSprite.add(jLabel_Pembayaran_Dana_Sprite, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 135, 60, 30));

        jLabel_Pembayaran_Ovo_Sprite.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImageMakanan_Minuman/Ovo.png"))); // NOI18N
        jPanel_JikaDiaPesanSprite.add(jLabel_Pembayaran_Ovo_Sprite, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 205, 60, 30));

        jLabel_Pembayaran_Gopay_Sprite.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImageMakanan_Minuman/GoPay Logo.png"))); // NOI18N
        jPanel_JikaDiaPesanSprite.add(jLabel_Pembayaran_Gopay_Sprite, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 270, 60, 40));

        jLabel_Pembayaran_Shopepay_Sprite.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImageMakanan_Minuman/Logo ShopeePay.png"))); // NOI18N
        jPanel_JikaDiaPesanSprite.add(jLabel_Pembayaran_Shopepay_Sprite, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 340, 60, 40));

        jLabel_Pembayaran_Langsung_Sprite.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel_Pembayaran_Langsung_Sprite.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel_Pembayaran_Langsung_Sprite.setText("Pembayaran Langsung");
        jPanel_JikaDiaPesanSprite.add(jLabel_Pembayaran_Langsung_Sprite, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 410, 200, 40));

        jTextField_Pembayaran_Dana_Sprite.setEditable(false);
        jTextField_Pembayaran_Dana_Sprite.setBackground(new java.awt.Color(255, 255, 255));
        jTextField_Pembayaran_Dana_Sprite.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jTextField_Pembayaran_Dana_Sprite.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextField_Pembayaran_Dana_Sprite.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        jPanel_JikaDiaPesanSprite.add(jTextField_Pembayaran_Dana_Sprite, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 130, 540, 40));

        jTextField_Pembayaran_Ovo_Sprite.setEditable(false);
        jTextField_Pembayaran_Ovo_Sprite.setBackground(new java.awt.Color(255, 255, 255));
        jTextField_Pembayaran_Ovo_Sprite.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jTextField_Pembayaran_Ovo_Sprite.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextField_Pembayaran_Ovo_Sprite.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        jPanel_JikaDiaPesanSprite.add(jTextField_Pembayaran_Ovo_Sprite, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 200, 540, 40));

        jTextField_Pembayaran_Gopay_Sprite.setEditable(false);
        jTextField_Pembayaran_Gopay_Sprite.setBackground(new java.awt.Color(255, 255, 255));
        jTextField_Pembayaran_Gopay_Sprite.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jTextField_Pembayaran_Gopay_Sprite.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextField_Pembayaran_Gopay_Sprite.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        jPanel_JikaDiaPesanSprite.add(jTextField_Pembayaran_Gopay_Sprite, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 270, 540, 40));

        jTextField_Pembayaran_Shopepay_Sprite.setEditable(false);
        jTextField_Pembayaran_Shopepay_Sprite.setBackground(new java.awt.Color(255, 255, 255));
        jTextField_Pembayaran_Shopepay_Sprite.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jTextField_Pembayaran_Shopepay_Sprite.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextField_Pembayaran_Shopepay_Sprite.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        jPanel_JikaDiaPesanSprite.add(jTextField_Pembayaran_Shopepay_Sprite, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 340, 540, 40));

        jTextField_Pembayaran_Langsung_Sprite.setEditable(false);
        jTextField_Pembayaran_Langsung_Sprite.setBackground(new java.awt.Color(255, 255, 255));
        jTextField_Pembayaran_Langsung_Sprite.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jTextField_Pembayaran_Langsung_Sprite.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextField_Pembayaran_Langsung_Sprite.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        jPanel_JikaDiaPesanSprite.add(jTextField_Pembayaran_Langsung_Sprite, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 410, 540, 40));

        jButton_BeliSekarangPembayaranSprite.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton_BeliSekarangPembayaranSprite.setText("Beli Sekarang");
        jButton_BeliSekarangPembayaranSprite.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_BeliSekarangPembayaranSpriteActionPerformed(evt);
            }
        });
        jPanel_JikaDiaPesanSprite.add(jButton_BeliSekarangPembayaranSprite, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 550, 340, -1));

        jCheckBox_Pembayaran_Dana_Sprite.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox_Pembayaran_Dana_SpriteActionPerformed(evt);
            }
        });
        jPanel_JikaDiaPesanSprite.add(jCheckBox_Pembayaran_Dana_Sprite, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 140, -1, -1));

        jCheckBox_Pembayaran_Ovo_Sprite.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox_Pembayaran_Ovo_SpriteActionPerformed(evt);
            }
        });
        jPanel_JikaDiaPesanSprite.add(jCheckBox_Pembayaran_Ovo_Sprite, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 210, -1, -1));

        jCheckBox_Pembayaran_Gopay_Sprite.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox_Pembayaran_Gopay_SpriteActionPerformed(evt);
            }
        });
        jPanel_JikaDiaPesanSprite.add(jCheckBox_Pembayaran_Gopay_Sprite, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 280, -1, -1));

        jCheckBox_Pembayaran_Shopepay_Sprite.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox_Pembayaran_Shopepay_SpriteActionPerformed(evt);
            }
        });
        jPanel_JikaDiaPesanSprite.add(jCheckBox_Pembayaran_Shopepay_Sprite, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 350, -1, -1));

        jCheckBox_Pembayaran_Langsung_Sprite.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox_Pembayaran_Langsung_SpriteActionPerformed(evt);
            }
        });
        jPanel_JikaDiaPesanSprite.add(jCheckBox_Pembayaran_Langsung_Sprite, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 420, -1, -1));

        jPanel_Order.add(jPanel_JikaDiaPesanSprite, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 820, 600));

        jPanel1.add(jPanel_Order, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 0, 820, 600));

        jPanel_Waktu.setBackground(new java.awt.Color(255, 255, 255));
        jPanel_Waktu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel27.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel27.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel27.setText("Waktu Yang Terpakai  :");
        jPanel_Waktu.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 170, 260, -1));

        jLabel55.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel55.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel55.setText("Mulai                            :");
        jPanel_Waktu.add(jLabel55, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 210, 260, -1));

        jLabel56.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel56.setText("Nama                            :");
        jPanel_Waktu.add(jLabel56, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 130, 260, -1));

        jLabel57.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel57.setText("Saldo Waktu                :");
        jPanel_Waktu.add(jLabel57, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 250, 260, -1));

        jLabel58.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel58.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel58.setText("Tanggal                        :");
        jPanel_Waktu.add(jLabel58, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 290, -1, -1));

        jLabel59.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel59.setText("Waktu Sekarang          :");
        jPanel_Waktu.add(jLabel59, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 330, 260, -1));

        jLabel_NamaDiWaktu.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel_NamaDiWaktu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_NamaDiWaktu.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        jPanel_Waktu.add(jLabel_NamaDiWaktu, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 130, 150, 30));

        jLabel_WaktuYgTerpakai.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel_WaktuYgTerpakai.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_WaktuYgTerpakai.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        jPanel_Waktu.add(jLabel_WaktuYgTerpakai, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 170, 150, 30));

        jLabel_Mulai.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel_Mulai.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_Mulai.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        jPanel_Waktu.add(jLabel_Mulai, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 210, 150, 30));

        jLabel_SaldoWaktu.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel_SaldoWaktu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_SaldoWaktu.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        jPanel_Waktu.add(jLabel_SaldoWaktu, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 250, 150, 30));

        jLabel_Tanggal.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel_Tanggal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_Tanggal.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        jPanel_Waktu.add(jLabel_Tanggal, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 290, 150, 30));

        jLabel_WaktuSekarang.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel_WaktuSekarang.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_WaktuSekarang.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        jPanel_Waktu.add(jLabel_WaktuSekarang, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 330, 150, 30));

        jPanel1.add(jPanel_Waktu, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 0, 820, 600));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 600));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void scaleImage(){
        ImageIcon icon = new ImageIcon("../Image/Icon_Cowok1-removebg-preview.png");
        Image img = icon.getImage();
        Image imgScale = img.getScaledInstance(jLabel_Profile.getWidth(), jLabel_Profile.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon scaledIcon = new ImageIcon(imgScale);
        jLabel_Profile.setIcon(scaledIcon);    
    }
    private void scaleImageTournament(){
        ImageIcon icon = new ImageIcon("../Image/Event Pb.png");
        Image img = icon.getImage();
        Image imgScale = img.getScaledInstance(jLabel_TournamentInfo.getWidth(), jLabel_TournamentInfo.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon scaledIcon = new ImageIcon(imgScale);
        jLabel_TournamentInfo.setIcon(scaledIcon);  
    }
    private void scaleImageAllLogoGame() {
        // Ngumpulin semua file all logo game
        
        // Barisan Pertama
        // Among Us
        ImageIcon iconAmongUs = new ImageIcon("../Image/Among Us.jpg");
        Image imgAmongUs = iconAmongUs.getImage();
        Image imgScaleAmongUs = imgAmongUs.getScaledInstance(jLabel_AmongUs.getWidth(), jLabel_AmongUs.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon scaleLogoAmongUs = new ImageIcon(imgScaleAmongUs);
        jLabel_AmongUs.setIcon(scaleLogoAmongUs);
        // Discord
        ImageIcon iconDiscord = new ImageIcon("../Image/Discord.jpg");
        Image imgDiscord = iconDiscord.getImage();
        Image imgScaleDiscord = imgDiscord.getScaledInstance(jLabel_Dc.getWidth(), jLabel_Dc.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon scaleLogoDiscord = new ImageIcon(imgScaleDiscord);
        jLabel_Dc.setIcon(scaleLogoDiscord);
        // Age Of Empire 2
        ImageIcon iconAgeofEmpire = new ImageIcon("../Image/Age of Empire 2 The Conqueror.jpg");
        Image imgAgeofEmpire = iconAgeofEmpire.getImage();
        Image imgScaleAgeofEmpire = imgAgeofEmpire.getScaledInstance(jLabel_AgeOfEmpire2.getWidth(), jLabel_AgeOfEmpire2.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon scaleLogoAgeofEmpire = new ImageIcon(imgScaleAgeofEmpire);
        jLabel_AgeOfEmpire2.setIcon(scaleLogoAgeofEmpire);
        // BattleField 3
        ImageIcon iconBattlefield3 = new ImageIcon("../Image/Battlefield 3.jpg");
        Image imgBattlefield3 = iconBattlefield3.getImage();
        Image imgScaleBattlefield3 = imgBattlefield3.getScaledInstance(jLabel_Battlefield3.getWidth(), jLabel_Battlefield3.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon scaleLogoBattlefield3 = new ImageIcon(imgScaleBattlefield3);
        jLabel_Battlefield3.setIcon(scaleLogoBattlefield3);
        // GTA San Andreas
        ImageIcon iconGtaSA = new ImageIcon("../Image/GTA SA.jpg");
        Image imgGtaSA = iconGtaSA.getImage();
        Image imgScaleGtaSA = imgGtaSA.getScaledInstance(jLabel_GtaSA.getWidth(), jLabel_GtaSA.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon scaleLogoGtaSA = new ImageIcon(imgScaleGtaSA);
        jLabel_GtaSA.setIcon(scaleLogoGtaSA);
        // Nox
        ImageIcon iconNox = new ImageIcon("../Image/Nox Img.png");
        Image imgNox = iconNox.getImage();
        Image imgScaleNox = imgNox.getScaledInstance(jLabel_Nox.getWidth(), jLabel_Nox.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon scaleLogoNox = new ImageIcon(imgScaleNox);
        jLabel_Nox.setIcon(scaleLogoNox);
        // Warcraft
        ImageIcon iconWarcraft = new ImageIcon("../Image/Warcraft.png");
        Image imgWarcraft = iconWarcraft.getImage();
        Image imgScaleWarcraft = imgWarcraft.getScaledInstance(jLabel_Warcraft.getWidth(), jLabel_Warcraft.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon scaleLogoWarcraft = new ImageIcon(imgScaleWarcraft);
        jLabel_Warcraft.setIcon(scaleLogoWarcraft);
        
        // Barisan Kedua
        // Cod Mobile
        ImageIcon iconCODM = new ImageIcon("../Image/Call Of Duty Mobile.jpg");
        Image imgCODM = iconCODM.getImage();
        Image imgScaleCODM = imgCODM.getScaledInstance(jLabel_Codm.getWidth(),jLabel_Codm.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon scaleLogoCODM = new ImageIcon(imgScaleCODM);
        jLabel_Codm.setIcon(scaleLogoCODM);
        // Ld Player 9
        ImageIcon iconLdPlayer9 = new ImageIcon("../Image/Ld Player Logo.png");
        Image imgLdPlayer9 = iconLdPlayer9.getImage();
        Image imgScaleLdPlayer9 = imgLdPlayer9.getScaledInstance(jLabel_LdPlayer9.getWidth(),jLabel_LdPlayer9.getHeight(),Image.SCALE_SMOOTH);
        ImageIcon scaleLogoLdPlayer9 = new ImageIcon(imgScaleLdPlayer9);
        jLabel_LdPlayer9.setIcon(scaleLogoLdPlayer9);
        // Apex Legends
        ImageIcon iconApexLegends = new ImageIcon("../Image/Apex Legend.jpg");
        Image imgApexLegends = iconApexLegends.getImage();
        Image imgScaleApexLegends = imgApexLegends.getScaledInstance(jLabel_ApexLegends.getWidth(),jLabel_ApexLegends.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon scaleLogoApexLegends = new ImageIcon(imgScaleApexLegends);
        jLabel_ApexLegends.setIcon(scaleLogoApexLegends);
        // GameLoop
        ImageIcon iconGameLoop = new ImageIcon("../Image/GameLoop.png");
        Image imgGameLoop = iconGameLoop.getImage();
        Image imgScaleGameLoop = imgGameLoop.getScaledInstance(jLabel_GameLoop.getWidth(), jLabel_GameLoop.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon scaleLogoGameLoop = new ImageIcon(imgScaleGameLoop);
        jLabel_GameLoop.setIcon(scaleLogoGameLoop);
        // Fortnite
        ImageIcon iconFortnite = new ImageIcon("../Image/Fortnite.png");
        Image imgFortnite = iconFortnite.getImage();
        Image imgScaleFortnite = imgFortnite.getScaledInstance(jLabel_Fortnite.getWidth(), jLabel_Fortnite.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon scaleLogoFortnite = new ImageIcon(imgScaleFortnite);
        jLabel_Fortnite.setIcon(scaleLogoFortnite);
        // Euro Truck 2 Simulator
        ImageIcon iconEuroTruck2 = new ImageIcon("../Image/Euro Truck Simulator 2.jpg");
        Image imgEuroTruck2 = iconEuroTruck2.getImage();
        Image imgScaleEuroTruck2 = imgEuroTruck2.getScaledInstance(jLabel_EuroTruck2.getWidth(), jLabel_EuroTruck2.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon ScaleLogoEuroTruck2 = new ImageIcon(imgScaleEuroTruck2);
        jLabel_EuroTruck2.setIcon(ScaleLogoEuroTruck2);
        // Left 4 Dead 2
        ImageIcon iconLeft4dead2 = new ImageIcon("../Image/Left 4 Dead 2.jpg");
        Image imgLeft4dead2 = iconLeft4dead2.getImage();
        Image imgScaleLeft4dead2 = imgLeft4dead2.getScaledInstance(jLabel_Left4dead2.getWidth(), jLabel_Left4dead2.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon ScaleLogoLeft4dead2 = new ImageIcon(imgScaleLeft4dead2);
        jLabel_Left4dead2.setIcon(ScaleLogoLeft4dead2);
        
        // Barisan Ketiga
        // CSGO
        ImageIcon iconCSGO = new ImageIcon("../Image/CSGO.jpg");
        Image imgCSGO = iconCSGO.getImage();
        Image imgScaleCSGO = imgCSGO.getScaledInstance(jLabel_Csgo.getWidth(), jLabel_Csgo.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon ScaleLogoCSGO = new ImageIcon(imgScaleCSGO);
        jLabel_Csgo.setIcon(ScaleLogoCSGO);
        // Netbeans
        ImageIcon iconNetbeans = new ImageIcon("../Image/Netbeans Img.png");
        Image imgNetbeans = iconNetbeans.getImage();
        Image imgScaleNetbeans = imgNetbeans.getScaledInstance(jLabel_Netbeans.getWidth(), jLabel_Netbeans.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon ScaleLogoNetbeans = new ImageIcon(imgScaleNetbeans);
        jLabel_Netbeans.setIcon(ScaleLogoNetbeans);
        // LostSaga
        ImageIcon iconLostsaga = new ImageIcon("../Image/Lost Sage logo.jpg");
        Image imgLostsaga = iconLostsaga.getImage();
        Image imgScaleLostsaga = imgLostsaga.getScaledInstance(jLabel_lostsaga.getWidth(), jLabel_lostsaga.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon ScaleLogoLostsaga = new ImageIcon(imgScaleLostsaga);
        jLabel_lostsaga.setIcon(ScaleLogoLostsaga);
        // MotoGp2
        ImageIcon iconMotoGp2 = new ImageIcon("../Image/MotoGp.jpg");
        Image imgMotoGp2 = iconMotoGp2.getImage();
        Image imgScaleMotoGp2 = imgMotoGp2.getScaledInstance(jLabel_MotoGp2.getWidth(), jLabel_MotoGp2.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon ScaleLogoMotoGp2 = new ImageIcon(imgScaleMotoGp2);
        jLabel_MotoGp2.setIcon(ScaleLogoMotoGp2);
        // MotoGp3
        ImageIcon iconMotoGp3 = new ImageIcon("../Image/MotoGp.jpg");
        Image imgMotoGp3 = iconMotoGp3.getImage();
        Image imgScaleMotoGp3 = imgMotoGp3.getScaledInstance(jLabel_MotoGp3.getWidth(), jLabel_MotoGp3.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon ScaleLogoMotoGp3 = new ImageIcon(imgScaleMotoGp3);
        jLabel_MotoGp3.setIcon(ScaleLogoMotoGp3);
        // League of Legends
        ImageIcon iconLol = new ImageIcon("../Image/League of Legends.png");
        Image imgLol = iconLol.getImage();
        Image imgScaleLol = imgLol.getScaledInstance(jLabel_Lol.getWidth(), jLabel_Lol.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon ScaleLogoLol = new ImageIcon(imgScaleLol);
        jLabel_Lol.setIcon(ScaleLogoLol);
        // Valorant
        ImageIcon iconValorant = new ImageIcon("../Image/VALORANT.png");
        Image imgValorant = iconValorant.getImage();
        Image imgScaleValorant = imgValorant.getScaledInstance(jLabel_Valorant.getWidth(), jLabel_Valorant.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon ScaleLogoValorant = new ImageIcon(imgScaleValorant);
        jLabel_Valorant.setIcon(ScaleLogoValorant);
        
        // Barisan Keempat
        // Dota 2
        ImageIcon iconDota2 = new ImageIcon("../Image/Dota 2 Logo.jpg");
        Image imgDota2 = iconDota2.getImage();
        Image imgScaleDota2 = imgDota2.getScaledInstance(jLabel_Dota2.getWidth(), jLabel_Dota2.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon ScaleLogoDota2 = new ImageIcon(imgScaleDota2);
        jLabel_Dota2.setIcon(ScaleLogoDota2);
        // Destiny 2 
        ImageIcon iconDestiny2 = new ImageIcon("../Image/Destiny 2.jpg");
        Image imgDestiny2 = iconDestiny2.getImage();
        Image imgScaleDestiny2 = imgDestiny2.getScaledInstance(jLabel_Destiny2.getWidth(), jLabel_Destiny2.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon ScaleLogoDestiny2 = new ImageIcon(imgScaleDestiny2);
        jLabel_Destiny2.setIcon(ScaleLogoDestiny2);
        // Netflix
        ImageIcon iconNetflix = new ImageIcon("../Image/netflix_icon_161073.png");
        Image imgNetflix = iconNetflix.getImage();
        Image imgScaleNetflix = imgNetflix.getScaledInstance(jLabel_NetflixAllGames.getWidth(), jLabel_NetflixAllGames.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon ScaleLogoNetflix = new ImageIcon(imgScaleNetflix);
        jLabel_NetflixAllGames.setIcon(ScaleLogoNetflix);
        // Gta V
        ImageIcon iconGtaV = new ImageIcon("../Image/The GTA V Dilemma.jpg");
        Image imgGtaV = iconGtaV.getImage();
        Image imgScaleGtaV = imgGtaV.getScaledInstance(jLabel_GTAV.getWidth(), jLabel_GTAV.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon ScaleLogoGtaV = new ImageIcon(imgScaleGtaV);
        jLabel_GTAV.setIcon(ScaleLogoGtaV);
        // Visual Studio Code
        ImageIcon iconVisualStudioCode = new ImageIcon("../Image/Visual Studio Code Img.jpg");
        Image imgVisualStudioCode = iconVisualStudioCode.getImage();
        Image imgScaleVisualStudioCode = imgVisualStudioCode.getScaledInstance(jLabel_VisualStudioCode.getWidth(), jLabel_VisualStudioCode.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon ScaleLogoVisualStudioCode = new ImageIcon(imgScaleVisualStudioCode);
        jLabel_VisualStudioCode.setIcon(ScaleLogoVisualStudioCode);
        // WhatsApp
        ImageIcon iconWhatsApp = new ImageIcon("../Image/Whatsapp _ Icono Gratis.png");
        Image imgWhatsApp = iconWhatsApp.getImage();
        Image imgScaleWhatsApp = imgWhatsApp.getScaledInstance(jLabel_Whatsapp.getWidth(), jLabel_Whatsapp.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon ScaleLogoWhatsApp = new ImageIcon(imgScaleWhatsApp);
        jLabel_Whatsapp.setIcon(ScaleLogoWhatsApp);
        
        ImageIcon iconSteam = new ImageIcon("../Image/Steam logo.png");
        Image imgSteam = iconSteam.getImage();
        Image imgScaleSteam = imgSteam.getScaledInstance(jLabel_SteamAllGames.getWidth(), jLabel_SteamAllGames.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon ScaleLogoSteam = new ImageIcon(imgScaleSteam);
        jLabel_SteamAllGames.setIcon(ScaleLogoSteam);
    }
    
    private void scaleImageOnlineGames() {
        // Baris Pertama OnlineGames
        // Among Us
        ImageIcon onlineAmongUs = new ImageIcon("../Image/Among Us.jpg");
        Image imgAmongUs = onlineAmongUs.getImage();
        Image imgScaleAmongUs = imgAmongUs.getScaledInstance(jLabel_OnlineGames_AmongUs.getWidth(), jLabel_OnlineGames_AmongUs.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon ScaleOnlineAmongUs = new ImageIcon(imgScaleAmongUs);
        jLabel_OnlineGames_AmongUs.setIcon(ScaleOnlineAmongUs);
        // CSGO
        ImageIcon onlineCSGO = new ImageIcon("../Image/CSGO.jpg");
        Image imgCSGO = onlineCSGO.getImage();
        Image imgScaleCSGO = imgCSGO.getScaledInstance(jLabel_OnlineGames_CSGO.getWidth(), jLabel_OnlineGames_CSGO.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon ScaleOnlineCSGO = new ImageIcon(imgScaleCSGO);
        jLabel_OnlineGames_CSGO.setIcon(ScaleOnlineCSGO);
        // Apex Legends
        ImageIcon onlineApexLegends = new ImageIcon("../Image/Apex Legend.jpg");
        Image imgApexLegends = onlineApexLegends.getImage();
        Image imgScaleApexLegends = imgApexLegends.getScaledInstance(jLabel_OnlineGames_ApexLegends.getWidth(), jLabel_OnlineGames_ApexLegends.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon ScaleOnlineApexLegends = new ImageIcon(imgScaleApexLegends);
        jLabel_OnlineGames_ApexLegends.setIcon(ScaleOnlineApexLegends);
        // COD Mobile
        ImageIcon onlineCODM = new ImageIcon("../Image/Call Of Duty Mobile.jpg");
        Image imgCODM = onlineCODM.getImage();
        Image imgScaleCODM = imgCODM.getScaledInstance(jLabel_OnlineGames_CODM.getWidth(), jLabel_OnlineGames_CODM.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon ScaleOnlineCODM = new ImageIcon(imgScaleCODM);
        jLabel_OnlineGames_CODM.setIcon(ScaleOnlineCODM);
        // Destiny 2
        ImageIcon onlineDestiny2 = new ImageIcon("../Image/Destiny 2.jpg");
        Image imgDestiny2 = onlineDestiny2.getImage();
        Image imgScaleDestiny2 = imgDestiny2.getScaledInstance(jLabel_OnlineGames_Destiny2.getWidth(), jLabel_OnlineGames_Destiny2.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon ScaleOnlineDestiny2 = new ImageIcon(imgScaleDestiny2);
        jLabel_OnlineGames_Destiny2.setIcon(ScaleOnlineDestiny2);
        // Dota 2
        ImageIcon onlineDota2 = new ImageIcon("../Image/Dota 2 Logo.jpg");
        Image imgDota2 = onlineDota2.getImage();
        Image imgScaleDota2 = imgDota2.getScaledInstance(jLabel_OnlineGames_Dota2.getWidth(), jLabel_OnlineGames_Dota2.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon ScaleOnlineDota2 = new ImageIcon(imgScaleDota2);
        jLabel_OnlineGames_Dota2.setIcon(ScaleOnlineDota2);
        // Fortnite
        ImageIcon onlineFortnite = new ImageIcon("../Image/Fortnite.png");
        Image imgFortnite = onlineFortnite.getImage();
        Image imgScaleFortnite = imgFortnite.getScaledInstance(jLabel_OnlineGames_Fortnite.getWidth(), jLabel_OnlineGames_Fortnite.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon ScaleOnlineFortnite = new ImageIcon(imgScaleFortnite);
        jLabel_OnlineGames_Fortnite.setIcon(ScaleOnlineFortnite);
        
        // Baris Ke dua
        // Left 4 Dead 2
        ImageIcon onlineLeft4Dead2 = new ImageIcon("../Image/Left 4 Dead 2.jpg");
        Image imgLeft4Dead2 = onlineLeft4Dead2.getImage();
        Image imgScaleLeft4Dead2 = imgLeft4Dead2.getScaledInstance(jLabel_OnlineGames_Left4Dead2.getWidth(), jLabel_OnlineGames_Left4Dead2.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon ScaleOnlineLeft4Dead2 = new ImageIcon(imgScaleLeft4Dead2);
        jLabel_OnlineGames_Left4Dead2.setIcon(ScaleOnlineLeft4Dead2);
        // LostSaga
        ImageIcon onlineLostSaga = new ImageIcon("../Image/Lost Sage logo.jpg");
        Image imgLostSaga = onlineLostSaga.getImage();
        Image imgScaleLostSaga = imgLostSaga.getScaledInstance(jLabel_OnlineGames_Lostsaga.getWidth(), jLabel_OnlineGames_Lostsaga.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon ScaleOnlineLostSaga = new ImageIcon(imgScaleLostSaga);
        jLabel_OnlineGames_Lostsaga.setIcon(ScaleOnlineLostSaga);
        // Euro Truck 2
        ImageIcon onlineEuroTruck2 = new ImageIcon("../Image/Euro Truck Simulator 2.jpg");
        Image imgEuroTruck2 = onlineEuroTruck2.getImage();
        Image imgScaleEuroTruck2 = imgEuroTruck2.getScaledInstance(jLabel_OnlineGames_EuroTruck2.getWidth(), jLabel_OnlineGames_EuroTruck2.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon ScaleOnlineEuroTruck2 = new ImageIcon(imgScaleEuroTruck2);
        jLabel_OnlineGames_EuroTruck2.setIcon(ScaleOnlineEuroTruck2);
        // Gta V
        ImageIcon onlineGTAV = new ImageIcon("../Image/The GTA V Dilemma.jpg");
        Image imgGTAV = onlineGTAV.getImage();
        Image imgScaleGTAV = imgGTAV.getScaledInstance(jLabel_OnlineGames_GTAV.getWidth(), jLabel_OnlineGames_GTAV.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon ScaleOnlineGTAV = new ImageIcon(imgScaleGTAV);
        jLabel_OnlineGames_GTAV.setIcon(ScaleOnlineGTAV);
        // Valorant
        ImageIcon onlineValorant = new ImageIcon("../Image/VALORANT.png");
        Image imgValorant = onlineValorant.getImage();
        Image imgScaleValorant = imgValorant.getScaledInstance(jLabel_OnlineGames_Valorant.getWidth(),jLabel_OnlineGames_Valorant.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon ScaleOnlineValorant = new ImageIcon(imgScaleValorant);
        jLabel_OnlineGames_Valorant.setIcon(ScaleOnlineValorant);
        // LOL
        ImageIcon onlineLOL = new ImageIcon("../Image/League of Legends.png");
        Image imgLOL = onlineLOL.getImage();
        Image imgScaleLol = imgLOL.getScaledInstance(jLabel_OnlineGames_LOL.getWidth(), jLabel_OnlineGames_LOL.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon ScaleOnlineLOL = new ImageIcon(imgScaleLol);
        jLabel_OnlineGames_LOL.setIcon(ScaleOnlineLOL);
        // Steam
        ImageIcon onlineSteam = new ImageIcon("../Image/Steam logo.png");
        Image imgSteam = onlineSteam.getImage();
        Image imgScaleSteam = imgSteam.getScaledInstance(jLabel_OnlineGames_Steam.getWidth(), jLabel_OnlineGames_Steam.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon ScaleOnlineSteam = new ImageIcon(imgScaleSteam);
        jLabel_OnlineGames_Steam.setIcon(ScaleOnlineSteam);
    }
    
    private void scaleImageOfflineGames() {
        // Baris Pertama
        // GTA San Andreas
        ImageIcon offlineGtaSA = new ImageIcon("../Image/GTA SA.jpg");
        Image imgGtaSA = offlineGtaSA.getImage();
        Image imgScaleGtaSA = imgGtaSA.getScaledInstance(jLabel_OfflineGTASA.getWidth(), jLabel_OfflineGTASA.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon ScaleOfflineGtaSA = new ImageIcon(imgScaleGtaSA);
        jLabel_OfflineGTASA.setIcon(ScaleOfflineGtaSA);
        // Battle Field 3
        ImageIcon offlineBattleField3 = new ImageIcon("../Image/Battlefield 3.jpg");
        Image imgBattleField3 = offlineBattleField3.getImage();
        Image imgScaleBattleField3 = imgBattleField3.getScaledInstance(jLabel_OfflineBattleField3.getWidth(), jLabel_OfflineBattleField3.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon ScaleOfflineBattleField3 = new ImageIcon(imgScaleBattleField3);
        jLabel_OfflineBattleField3.setIcon(ScaleOfflineBattleField3);
        // Age of Empire 2
        ImageIcon offlineAgeOfEmpire2 = new ImageIcon("../Image/Age of Empire 2 The Conqueror.jpg");
        Image imgAgeOfEmpire2 = offlineAgeOfEmpire2.getImage();
        Image imgScaleAgeOfEmpire2 = imgAgeOfEmpire2.getScaledInstance(jLabel_OfflineAgeOfEmpire2.getWidth(), jLabel_OfflineAgeOfEmpire2.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon ScaleOfflineAgeOfEmpire2 = new ImageIcon(imgScaleAgeOfEmpire2);
        jLabel_OfflineAgeOfEmpire2.setIcon(ScaleOfflineAgeOfEmpire2);
        // Gta V
        ImageIcon offlineGTAV = new ImageIcon("../Image/The GTA V Dilemma.jpg");
        Image imgGTAV = offlineGTAV.getImage();
        Image imgScaleGTAV = imgGTAV.getScaledInstance(jLabel_OfflineGTAV.getWidth(), jLabel_OfflineGTAV.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon ScaleOfflineGTAV = new ImageIcon(imgScaleGTAV);
        jLabel_OfflineGTAV.setIcon(ScaleOfflineGTAV);
        // MotoGp 2
        ImageIcon offlineMotoGp2 = new ImageIcon("../Image/MotoGp.jpg");
        Image imgMotoGp2 = offlineMotoGp2.getImage();
        Image imgScaleMotoGp2 = imgMotoGp2.getScaledInstance(jLabel_OfflineMotoGp2.getWidth(), jLabel_OfflineMotoGp2.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon ScaleOfflineMotoGp2 = new ImageIcon(imgScaleMotoGp2);
        jLabel_OfflineMotoGp2.setIcon(ScaleOfflineMotoGp2);
        // MotoGp 3
        ImageIcon offlineMotoGp3 = new ImageIcon("../Image/MotoGp.jpg");
        Image imgMotoGp3 = offlineMotoGp3.getImage();
        Image imgScaleMotoGp3 = imgMotoGp3.getScaledInstance(jLabel_OfflineMotoGp3.getWidth(), jLabel_OfflineMotoGp3.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon ScaleOfflineMotoGp3 = new ImageIcon(imgScaleMotoGp3);
        jLabel_OfflineMotoGp3.setIcon(ScaleOfflineMotoGp3);
    }
    
    private void scaleAndroidGames() {
        // GameLoop
        ImageIcon androidGameLoop = new ImageIcon("../Image/GameLoop.png");
        Image imgGameLoop = androidGameLoop.getImage();
        Image imgScaleGameLoop = imgGameLoop.getScaledInstance(jLabel_AndroidGameLoop.getWidth(), jLabel_AndroidGameLoop.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon ScaleAndroidGameLoop = new ImageIcon(imgScaleGameLoop);
        jLabel_AndroidGameLoop.setIcon(ScaleAndroidGameLoop);
        
        // LD Game 9
        ImageIcon androidLdGame9 = new ImageIcon("../Image/Ld Player Logo.png");
        Image imgLdGame9 = androidLdGame9.getImage();
        Image imgScaleLdGame9 = imgLdGame9.getScaledInstance(jLabel_AndroidLdGame.getWidth(), jLabel_AndroidLdGame.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon ScaleAndroidLdGame9 = new ImageIcon(imgScaleLdGame9);
        jLabel_AndroidLdGame.setIcon(ScaleAndroidLdGame9);
        
        // Nox
        ImageIcon androidNox = new ImageIcon("../Image/Nox Img.png");
        Image imgNox = androidNox.getImage();
        Image imgScaleNox = imgNox.getScaledInstance(jLabel_AndroidNox.getWidth(), jLabel_AndroidNox.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon ScaleAndroidNox = new ImageIcon(imgScaleNox);
        jLabel_AndroidNox.setIcon(ScaleAndroidNox);
    }
    
    private void scaleImageMakananMinuman() {
        // Makanan
        // Mie Goreng/Kuah Biasa
        ImageIcon mieBiasa = new ImageIcon("../ImageMakanan_Minuman/Mie Goreng Kuah Biasa.jpg");
        Image imgMieBiasa = mieBiasa.getImage();
        Image imgScaleMieBiasa = imgMieBiasa.getScaledInstance(jLabel_MieBiasa.getWidth(), jLabel_MieBiasa.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon ScaleMieBiasa = new ImageIcon(imgScaleMieBiasa);
        jLabel_MieBiasa.setIcon(ScaleMieBiasa);
        // Mie Goreng Telur
        ImageIcon mieTelur = new ImageIcon("../ImageMakanan_Minuman/Mi Goreng Spesial.jpg");
        Image imgMieTelur = mieTelur.getImage();
        Image imgScaleMieTelur = imgMieTelur.getScaledInstance(jLabel_MieTelor.getWidth(), jLabel_MieTelor.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon ScaleMieTelur = new ImageIcon(imgScaleMieTelur);
        jLabel_MieTelor.setIcon(ScaleMieTelur);
        // Sos Teng
        ImageIcon sosTeng = new ImageIcon("../ImageMakanan_Minuman/sosken.jpg");
        Image imgSosTeng = sosTeng.getImage();
        Image imgScaleSosTeng = imgSosTeng.getScaledInstance(jLabel_SosTeng.getWidth(), jLabel_SosTeng.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon ScaleSosTeng = new ImageIcon(imgScaleSosTeng);
        jLabel_SosTeng.setIcon(ScaleSosTeng);
        // Nasi Goreng
        ImageIcon nasiGoreng = new ImageIcon("../ImageMakanan_Minuman/Nasi Goreng.jpg");
        Image imgNasiGoreng = nasiGoreng.getImage();
        Image imgScaleNasiGoreng = imgNasiGoreng.getScaledInstance(jLabel_NasiGoreng.getWidth(), jLabel_NasiGoreng.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon ScaleNasiGoreng = new ImageIcon(imgScaleNasiGoreng);
        jLabel_NasiGoreng.setIcon(ScaleNasiGoreng);
        // Kwetiaw Goreng
        ImageIcon kwetiawGoreng = new ImageIcon("../ImageMakanan_Minuman/Kwetiaw Goreng.jpg");
        Image imgKwetiawGoreng = kwetiawGoreng.getImage();
        Image imgScaleKwetiawGoreng = imgKwetiawGoreng.getScaledInstance(jLabel_KewtiawGoreng.getWidth(), jLabel_KewtiawGoreng.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon ScaleKewtiawGoreng = new ImageIcon(imgScaleKwetiawGoreng);
        jLabel_KewtiawGoreng.setIcon(ScaleKewtiawGoreng);
        
        // Minuman
        // Kopi
        ImageIcon kopi = new ImageIcon("../ImageMakanan_Minuman/Kopi.jpg");
        Image imgKopi = kopi.getImage();
        Image imgScaleKopi = imgKopi.getScaledInstance(jLabel_Kopi.getWidth(), jLabel_Kopi.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon ScaleKopi = new ImageIcon(imgScaleKopi);
        jLabel_Kopi.setIcon(ScaleKopi);
        // Es Teh
        ImageIcon esTeh = new ImageIcon("../ImageMakanan_Minuman/ice tea.jpg");
        Image imgEsTeh = esTeh.getImage();
        Image imgScaleEsTeh = imgEsTeh.getScaledInstance(jLabel_IceTea.getWidth(), jLabel_IceTea.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon ScaleEsTeh = new ImageIcon(imgScaleEsTeh);
        jLabel_IceTea.setIcon(ScaleEsTeh);
        // Air Mineral
        ImageIcon airMineral = new ImageIcon("../ImageMakanan_Minuman/Air Mineral.jpg");
        Image imgAirMineral = airMineral.getImage();
        Image imgScaleAirMineral = imgAirMineral.getScaledInstance(jLabel_AirMineral.getWidth(), jLabel_AirMineral.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon ScaleAirMineral = new ImageIcon(imgScaleAirMineral);
        jLabel_AirMineral.setIcon(ScaleAirMineral);
        // Coca Cola
        ImageIcon cocaCola = new ImageIcon("../ImageMakanan_Minuman/Coca Cola.jpg");
        Image imgCocaCola = cocaCola.getImage();
        Image imgScaleCocaCola = imgCocaCola.getScaledInstance(jLabel_CocaCola.getWidth(), jLabel_CocaCola.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon ScaleCocaCola = new ImageIcon(imgScaleCocaCola);
        jLabel_CocaCola.setIcon(ScaleCocaCola);
        // Sprite
        ImageIcon sprite = new ImageIcon("../ImageMakanan_Minuman/Sprite.jpg");
        Image imgSprite = sprite.getImage();
        Image imgScaleSprite = imgSprite.getScaledInstance(jLabel_Sprite.getWidth(), jLabel_Sprite.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon ScaleSprite = new ImageIcon(imgScaleSprite);
        jLabel_Sprite.setIcon(ScaleSprite);
    }
    
    private void scaleImageSemuaGambarMakananKalo() {
        // Mie Goreng Biasa
        ImageIcon mieGorengBiasa = new ImageIcon("../ImageMakanan_Minuman/Mie Goreng Kuah Biasa.jpg");
        Image imgMieGorengBiasa = mieGorengBiasa.getImage();
        Image imgScaleMieGorengBiasa = imgMieGorengBiasa.getScaledInstance(jLabel_MilihMieGorengBiasa.getWidth(), jLabel_MilihMieGorengBiasa.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon ScaleMieGorengBiasa = new ImageIcon(imgScaleMieGorengBiasa);
        jLabel_MilihMieGorengBiasa.setIcon(ScaleMieGorengBiasa);
        // Mie Goreng Telur
        ImageIcon mieGorengTelur = new ImageIcon("../ImageMakanan_Minuman/Mi Goreng Spesial.jpg");
        Image imgMieGorengTelur = mieGorengTelur.getImage();
        Image imgScaleMieGorengTelur = imgMieGorengTelur.getScaledInstance(jLabel_MilihMieGorengTelur.getWidth(), jLabel_MilihMieGorengTelur.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon ScaleMieGorengTelur = new ImageIcon(imgScaleMieGorengTelur);
        jLabel_MilihMieGorengTelur.setIcon(ScaleMieGorengTelur);
        //  Sos Teng
        ImageIcon sosTeng = new ImageIcon("../ImageMakanan_Minuman/sosken.jpg");
        Image imgSosTeng = sosTeng.getImage();
        Image imgScaleSosTeng = imgSosTeng.getScaledInstance(jLabel_JikaMilihSosTeng.getWidth(), jLabel_JikaMilihSosTeng.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon ScaleSosTeng = new ImageIcon(imgScaleSosTeng);
        jLabel_JikaMilihSosTeng.setIcon(ScaleSosTeng);
        // Nasi Goreng
        ImageIcon nasiGoreng = new ImageIcon("../ImageMakanan_Minuman/Nasi Goreng.jpg");
        Image imgNasiGoreng = nasiGoreng.getImage();
        Image imgScaleNasiGoreng = imgNasiGoreng.getScaledInstance(jLabel_JikaMilihNasiGoreng.getWidth(), jLabel_JikaMilihNasiGoreng.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon ScaleNasiGoreng = new ImageIcon(imgScaleNasiGoreng);
        jLabel_JikaMilihNasiGoreng.setIcon(ScaleNasiGoreng);
        // Kwetiaw Goreng
        ImageIcon kwetiawGoreng = new ImageIcon("../ImageMakanan_Minuman/Kwetiaw Goreng.jpg");
        Image imgKwetiawGoreng = kwetiawGoreng.getImage();
        Image imgScaleKwetiawGoreng = imgKwetiawGoreng.getScaledInstance(jLabel_JikaMilihKwetiawGoreng.getWidth(), jLabel_JikaMilihKwetiawGoreng.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon ScaleKwetiawGoreng = new ImageIcon(imgScaleKwetiawGoreng);
        jLabel_JikaMilihKwetiawGoreng.setIcon(ScaleKwetiawGoreng);
    }
    
    private void scaleImageMinumanKalo() {
        // Kopi
        ImageIcon kopi = new ImageIcon("../ImageMakanan_Minuman/Kopi.jpg");
        Image imgKopi = kopi.getImage();
        Image imgScaleKopi = imgKopi.getScaledInstance(jLabel_JikaMilihKopi.getWidth(), jLabel_JikaMilihKopi.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon ScaleKopi = new ImageIcon(imgScaleKopi);
        jLabel_JikaMilihKopi.setIcon(ScaleKopi);
        // Es Teh
        ImageIcon esTeh = new ImageIcon("../ImageMakanan_Minuman/ice tea.jpg");
        Image imgEsTeh = esTeh.getImage();
        Image imgScaleEsTeh = imgEsTeh.getScaledInstance(jLabel_JikaMilihEsTeh.getWidth(), jLabel_JikaMilihEsTeh.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon ScaleEsTeh = new ImageIcon(imgScaleEsTeh);
        jLabel_JikaMilihEsTeh.setIcon(ScaleEsTeh);
        // Air Mineral
        ImageIcon airMineral = new ImageIcon("../ImageMakanan_Minuman/Air Mineral.jpg");
        Image imgAirMineral = airMineral.getImage();
        Image imgScaleAirMineral = imgAirMineral.getScaledInstance(jLabel_JikaMilihAirMineral.getWidth(), jLabel_JikaMilihAirMineral.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon ScaleAirMineral = new ImageIcon(imgScaleAirMineral);
        jLabel_JikaMilihAirMineral.setIcon(ScaleAirMineral);
        // Coca Cola
        ImageIcon cocaCola = new ImageIcon("../ImageMakanan_Minuman/Coca Cola.jpg");
        Image imgCocaCola = cocaCola.getImage();
        Image imgScaleCocaCola = imgCocaCola.getScaledInstance(jLabel_JikaMilihCocaCola.getWidth(), jLabel_JikaMilihCocaCola.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon ScaleCocaCola = new ImageIcon(imgScaleCocaCola);
        jLabel_JikaMilihCocaCola.setIcon(ScaleCocaCola);
        // Sprite 
        ImageIcon sprite = new ImageIcon("../ImageMakanan_Minuman/Sprite.jpg");
        Image imgSprite = sprite.getImage();
        Image imgScaleSprite = imgSprite.getScaledInstance(jLabel_JikaMilihSprite.getWidth(), jLabel_JikaMilihSprite.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon ScaleSprite = new ImageIcon(imgScaleSprite);
        jLabel_JikaMilihSprite.setIcon(ScaleSprite);
    }
    
    private void scalePembayaran() {
        // Dana Mie Biasa
        ImageIcon danaMieBiasa = new ImageIcon("../ImageMakanan_Minuman/Dana.jpg");
        Image imgDanaMieBiasa = danaMieBiasa.getImage();
        Image imgScaleDanaMieBiasa = imgDanaMieBiasa.getScaledInstance(jLabel_Pembayaran_Dana_MieBiasa.getWidth(), jLabel_Pembayaran_Dana_MieBiasa.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon ScaleDanaMieBiasa = new ImageIcon(imgScaleDanaMieBiasa);
        jLabel_Pembayaran_Dana_MieBiasa.setIcon(ScaleDanaMieBiasa);
        // Ovo Mie Biasa
        ImageIcon ovoMieBiasa = new ImageIcon("../ImageMakanan_Minuman/Ovo.png");
        Image imgOvoMieBiasa = ovoMieBiasa.getImage();
        Image imgScaleOvoMieBiasa = imgOvoMieBiasa.getScaledInstance(jLabel_Pembayaran_Ovo_MieBiasa.getWidth(), jLabel_Pembayaran_Ovo_MieBiasa.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon ScaleOvoMieBiasa = new ImageIcon(imgScaleOvoMieBiasa);
        jLabel_Pembayaran_Ovo_MieBiasa.setIcon(ScaleOvoMieBiasa);
        // Gopay Mie Biasa
        ImageIcon gopayMieBiasa = new ImageIcon("../ImageMakanan_Minuman/GoPay Logo.png");
        Image imgGopayMieBiasa = gopayMieBiasa.getImage();
        Image imgScaleGopayMieBiasa = imgGopayMieBiasa.getScaledInstance(jLabel_Pembayaran_Gopay_MieBiasa.getWidth(), jLabel_Pembayaran_Gopay_MieBiasa.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon ScaleGopayMieBiasa = new ImageIcon(imgScaleGopayMieBiasa);
        jLabel_Pembayaran_Gopay_MieBiasa.setIcon(ScaleGopayMieBiasa);
        // Shopepay Mie Biasa
        ImageIcon shopepayMieBiasa = new ImageIcon("../ImageMakanan_Minuman/Logo ShopeePay.png");
        Image imgShopepayMieBiasa = shopepayMieBiasa.getImage();
        Image imgScaleShopepayMieBiasa = imgShopepayMieBiasa.getScaledInstance(jLabel_Pembayaran_ShopePay_MieBiasa.getWidth(), jLabel_Pembayaran_ShopePay_MieBiasa.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon ScaleShopepayMieBiasa = new ImageIcon(imgScaleShopepayMieBiasa);
        jLabel_Pembayaran_ShopePay_MieBiasa.setIcon(ScaleShopepayMieBiasa);
        
        // Dana Mie Telur
        ImageIcon danaMieTelur = new ImageIcon("../ImageMakanan_Minuman/Dana.jpg");
        Image imgDanaMieTelur = danaMieTelur.getImage();
        Image imgScaleDanaMieTelur = imgDanaMieTelur.getScaledInstance(jLabel_Pembayaran_Dana_MieTelur.getWidth(), jLabel_Pembayaran_Dana_MieTelur.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon ScaleDanaMieTelur = new ImageIcon(imgScaleDanaMieTelur);
        jLabel_Pembayaran_Dana_MieTelur.setIcon(ScaleDanaMieTelur);
        // Ovo Mie Telur 
        ImageIcon ovoMieTelur = new ImageIcon("../ImageMakanan_Minuman/Ovo.png");
        Image imgOvoMieTelur = ovoMieTelur.getImage();
        Image imgScaleOvoMieTelur = imgOvoMieTelur.getScaledInstance(jLabel_Pembayaran_Ovo_MieTelur.getWidth(), jLabel_Pembayaran_Ovo_MieTelur.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon ScaleOvoMieTelur = new ImageIcon(imgScaleOvoMieTelur);
        jLabel_Pembayaran_Ovo_MieTelur.setIcon(ScaleOvoMieTelur);
        // Gopay Mie Telur
        ImageIcon gopayMieTelur = new ImageIcon("../ImageMakanan_Minuman/GoPay Logo.png");
        Image imgGopayMieTelur = gopayMieTelur.getImage();
        Image imgScaleGopayMieTelur = imgGopayMieTelur.getScaledInstance(jLabel_Pembayaran_Gopay_MieTelur.getWidth(), jLabel_Pembayaran_Gopay_MieTelur.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon ScaleGopayMieTelur = new ImageIcon(imgScaleGopayMieTelur);
        jLabel_Pembayaran_Gopay_MieTelur.setIcon(ScaleGopayMieTelur);
        // Shopepay Mie Telur
        ImageIcon shopepayMieTelur = new ImageIcon("../ImageMakanan_Minuman/Logo ShopeePay.png");
        Image imgShopepayMieTelur = shopepayMieTelur.getImage();
        Image imgScaleShopepayMieTelur = imgShopepayMieTelur.getScaledInstance(jLabel_Pembayaran_ShopeePay_MieTelur.getWidth(), jLabel_Pembayaran_ShopeePay_MieTelur.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon ScaleShopepayMieTelur = new ImageIcon(imgScaleShopepayMieTelur);
        jLabel_Pembayaran_ShopeePay_MieTelur.setIcon(ScaleShopepayMieTelur);
        
        // Dana SosTeng
        ImageIcon danaSosteng = new ImageIcon("../ImageMakanan_Minuman/Dana.jpg");
        Image imgDanaSosteng = danaSosteng.getImage();
        Image imgScaleDanaSosteng = imgDanaSosteng.getScaledInstance(jLabel_Pembayaran_Dana_Sosteng.getWidth(), jLabel_Pembayaran_Dana_Sosteng.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon ScaleDanaSosteng = new ImageIcon(imgScaleDanaSosteng);
        jLabel_Pembayaran_Dana_Sosteng.setIcon(ScaleDanaSosteng);
        // Ovo SosTeng
        ImageIcon ovoSosteng = new ImageIcon("../ImageMakanan_Minuman/Ovo.png");
        Image imgOvoSosteng = ovoSosteng.getImage();
        Image imgScaleOvoSosteng = imgOvoSosteng.getScaledInstance(jLabel_Pembayaran_Ovo_Sosteng.getWidth(), jLabel_Pembayaran_Ovo_Sosteng.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon ScaleOvoSosteng = new ImageIcon(imgScaleOvoSosteng);
        jLabel_Pembayaran_Ovo_Sosteng.setIcon(ScaleOvoSosteng);
        // Gopay SosTeng
        ImageIcon gopaySosteng = new ImageIcon("../ImageMakanan_Minuman/GoPay Logo.png");
        Image imgGopaySosteng = gopaySosteng.getImage();
        Image imgScaleGopaySosteng = imgGopaySosteng.getScaledInstance(jLabel_Pembayaran_Gopay_Sosteng.getWidth(), jLabel_Pembayaran_Gopay_Sosteng.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon ScaleGopaySosteng = new ImageIcon(imgScaleGopaySosteng);
        jLabel_Pembayaran_Gopay_Sosteng.setIcon(ScaleGopaySosteng);
        // Shopepay SosTeng
        ImageIcon shopepaySosteng = new ImageIcon("../ImageMakanan_Minuman/Logo ShopeePay.png");
        Image imgShopepaySosteng = shopepaySosteng.getImage();
        Image imgScaleShopepaySosteng = imgShopepaySosteng.getScaledInstance(jLabel_Pembayaran_Shopepay_Sosteng.getWidth(), jLabel_Pembayaran_Shopepay_Sosteng.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon ScaleShopepaySosteng = new ImageIcon(imgScaleShopepaySosteng);
        jLabel_Pembayaran_Shopepay_Sosteng.setIcon(ScaleShopepaySosteng);
        
        // Dana Nasi Goreng
        ImageIcon danaNasiGoreng = new ImageIcon("../ImageMakanan_Minuman/Dana.jpg");
        Image imgDanaNasiGoreng = danaNasiGoreng.getImage();
        Image imgScaleDanaNasiGoreng = imgDanaNasiGoreng.getScaledInstance(jLabel_Pembayaran_Dana_NasiGoreng.getWidth(), jLabel_Pembayaran_Dana_NasiGoreng.getHeight(),Image.SCALE_SMOOTH);
        ImageIcon ScaleDanaNasiGoreng = new ImageIcon(imgScaleDanaNasiGoreng);
        jLabel_Pembayaran_Dana_NasiGoreng.setIcon(ScaleDanaNasiGoreng);
        // Ovo Nasi Goreng
        ImageIcon ovoNasiGoreng = new ImageIcon("../ImageMakanan_Minuman/Ovo.png");
        Image imgOvoNasiGoreng = ovoNasiGoreng.getImage();
        Image imgScaleOvoNasiGoreng = imgOvoNasiGoreng.getScaledInstance(jLabel_Pembayaran_Ovo_NasiGoreng.getWidth(), jLabel_Pembayaran_Ovo_NasiGoreng.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon ScaleOvoNasiGoreng = new ImageIcon(imgScaleOvoNasiGoreng);
        jLabel_Pembayaran_Ovo_NasiGoreng.setIcon(ScaleOvoNasiGoreng);
        // Gopay Nasi Goreng
        ImageIcon gopayNasiGoreng = new ImageIcon("../ImageMakanan_Minuman/GoPay Logo.png");
        Image imgGopayNasiGoreng = gopayNasiGoreng.getImage();
        Image imgScaleGopayNasiGoreng = imgGopayNasiGoreng.getScaledInstance(jLabel_Pembayaran_Gopay_NasiGoreng.getWidth(), jLabel_Pembayaran_Gopay_NasiGoreng.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon ScaleGopayNasiGoreng = new ImageIcon(imgScaleGopayNasiGoreng);
        jLabel_Pembayaran_Gopay_NasiGoreng.setIcon(ScaleGopayNasiGoreng);
        // Shopepay Nasi Goreng
        ImageIcon shopepayNasiGoreng = new ImageIcon("../ImageMakanan_Minuman/Logo ShopeePay.png");
        Image imgShopepayNasiGoreng = shopepayNasiGoreng.getImage();
        Image imgScaleShopepayNasiGoreng = imgShopepayNasiGoreng.getScaledInstance(jLabel_Pembayaran_Shopepay_NasiGoreng.getWidth(), jLabel_Pembayaran_Shopepay_NasiGoreng.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon ScaleShopepayNasiGoreng = new ImageIcon(imgScaleShopepayNasiGoreng);
        jLabel_Pembayaran_Shopepay_NasiGoreng.setIcon(ScaleShopepayNasiGoreng);
        
        // Dana Kwetiaw Goreng
        ImageIcon danaKwetiawGoreng = new ImageIcon("../ImageMakanan_Minuman/Dana.jpg");
        Image imgDanaKwetiawGoreng = danaKwetiawGoreng.getImage();
        Image imgScaleKwetiawGoreng = imgDanaKwetiawGoreng.getScaledInstance(jLabel_Pembayaran_Dana_KwetiawGoreng.getWidth(), jLabel_Pembayaran_Dana_KwetiawGoreng.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon ScaleDanaKwetiawGoreng = new ImageIcon(imgScaleKwetiawGoreng);
        jLabel_Pembayaran_Dana_KwetiawGoreng.setIcon(ScaleDanaKwetiawGoreng);
        // Ovo Kwetiaw Goreng
        ImageIcon ovoKwetiawGoreng = new ImageIcon("../ImageMakanan_Minuman/Ovo.png");
        Image imgOvoKwetiawGoreng = ovoKwetiawGoreng.getImage();
        Image imgScaleOvoKwetiawGoreng = imgOvoKwetiawGoreng.getScaledInstance(jLabel_Pembayaran_Ovo_Kwetiaw.getWidth(), jLabel_Pembayaran_Ovo_Kwetiaw.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon ScaleOvoKwetiawGoreng = new ImageIcon(imgScaleOvoKwetiawGoreng);
        jLabel_Pembayaran_Ovo_Kwetiaw.setIcon(ScaleOvoKwetiawGoreng);
        // Gopay Kwetiaw Goreng
        ImageIcon gopayKwetiawGoreng = new ImageIcon("../ImageMakanan_Minuman/GoPay Logo.png");
        Image imgGopayKwetiawGoreng = gopayKwetiawGoreng.getImage();
        Image imgScaleGopayKwetiawGoreng = imgGopayKwetiawGoreng.getScaledInstance(jLabel_Pembayaran_Gopay_KwetiawGoreng.getWidth(), jLabel_Pembayaran_Gopay_KwetiawGoreng.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon ScaleGopayKwetiawGoreng = new ImageIcon(imgScaleGopayKwetiawGoreng);
        jLabel_Pembayaran_Gopay_KwetiawGoreng.setIcon(ScaleGopayKwetiawGoreng);
        // Shopepay Kwetiaw Goreng
        ImageIcon shopepayKwetiawGoreng = new ImageIcon("../ImageMakanan_Minuman/Logo ShopeePay.png");
        Image imgShopepayKwetiawGoreng = shopepayKwetiawGoreng.getImage();
        Image imgScaleShopepayKwetiawGoreng = imgShopepayKwetiawGoreng.getScaledInstance(jLabel_Pembayaran_Shopepay_KwetiawGoreng.getWidth(), jLabel_Pembayaran_Shopepay_KwetiawGoreng.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon ScaleShopepayKwetiawGoreng = new ImageIcon(imgScaleShopepayKwetiawGoreng);
        jLabel_Pembayaran_Shopepay_KwetiawGoreng.setIcon(ScaleShopepayKwetiawGoreng);
        
        
        // Minuman
        // Dana Kopi
        ImageIcon danaKopi = new ImageIcon("../ImageMakanan_Minuman/Dana.jpg");
        Image imgDanaKopi = danaKopi.getImage();
        Image imgScaleDanaKopi = imgDanaKopi.getScaledInstance(jLabel_Pembayaran_Dana_Kopi.getWidth(), jLabel_Pembayaran_Dana_Kopi.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon ScaleDanaKopi = new ImageIcon(imgScaleDanaKopi);
        jLabel_Pembayaran_Dana_Kopi.setIcon(ScaleDanaKopi);
        // Ovo Kopi
        ImageIcon ovoKopi = new ImageIcon("../ImageMakanan_Minuman/Ovo.png");
        Image imgOvoKopi = ovoKopi.getImage();
        Image imgScaleOvoKopi = imgOvoKopi.getScaledInstance(jLabel_Pembayaran_Ovo_Kopi.getWidth(), jLabel_Pembayaran_Ovo_Kopi.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon ScaleOvoKopi = new ImageIcon(imgScaleOvoKopi);
        jLabel_Pembayaran_Ovo_Kopi.setIcon(ScaleOvoKopi);
        // Gopay Kopi 
        ImageIcon gopayKopi = new ImageIcon("../ImageMakanan_Minuman/GoPay Logo.png");
        Image imgGopayKopi = gopayKopi.getImage();
        Image imgScaleGopayKopi = imgGopayKopi.getScaledInstance(jLabel_Pembayaran_Gopay_Kopi.getWidth(), jLabel_Pembayaran_Gopay_Kopi.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon ScaleGopayKopi = new ImageIcon(imgScaleGopayKopi);
        jLabel_Pembayaran_Gopay_Kopi.setIcon(ScaleGopayKopi);
        // Shopepay Kopi 
        ImageIcon shopepayKopi = new ImageIcon("../ImageMakanan_Minuman/Logo ShopeePay.png");
        Image imgShopepayKopi = shopepayKopi.getImage();
        Image imgScaleShopepayKopi = imgShopepayKopi.getScaledInstance(jLabel_Pembayaran_Shopepay_Kopi.getWidth(), jLabel_Pembayaran_Shopepay_Kopi.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon ScaleShopepayKopi = new ImageIcon(imgScaleShopepayKopi);
        jLabel_Pembayaran_Shopepay_Kopi.setIcon(ScaleShopepayKopi);
        
        // Dana EsTeh
        ImageIcon danaEsTeh = new ImageIcon("../ImageMakanan_Minuman/Dana.jpg");
        Image imgDanaEsTeh = danaEsTeh.getImage();
        Image imgScaleDanaEsTeh = imgDanaEsTeh.getScaledInstance(jLabel_Pembayaran_Dana_EsTeh.getWidth(), jLabel_Pembayaran_Dana_EsTeh.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon ScaleDanaEsTeh = new ImageIcon(imgScaleDanaEsTeh);
        jLabel_Pembayaran_Dana_EsTeh.setIcon(ScaleDanaEsTeh);
        // Ovo EsTeh
        ImageIcon ovoEsTeh = new ImageIcon("../ImageMakanan_Minuman/Ovo.png");
        Image imgOvoEsTeh = ovoEsTeh.getImage();
        Image imgScaleOvoEsTeh = imgOvoEsTeh.getScaledInstance(jLabel_Pembayaran_Ovo_EsTeh.getWidth(), jLabel_Pembayaran_Ovo_EsTeh.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon ScaleOvoEsTeh = new ImageIcon(imgScaleOvoEsTeh);
        jLabel_Pembayaran_Ovo_EsTeh.setIcon(ScaleOvoEsTeh);
        // Gopay EsTeh
        ImageIcon gopayEsTeh = new ImageIcon("../ImageMakanan_Minuman/GoPay Logo.png");
        Image imgGopayEsTeh = gopayEsTeh.getImage();
        Image imgScaleGopayEsTeh = imgGopayEsTeh.getScaledInstance(jLabel_Pembayaran_Gopay_EsTeh.getWidth(), jLabel_Pembayaran_Gopay_EsTeh.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon ScaleGopayEsTeh = new ImageIcon(imgScaleGopayEsTeh);
        jLabel_Pembayaran_Gopay_EsTeh.setIcon(ScaleGopayEsTeh);
        // Shopepay EsTeh
        ImageIcon shopepayEsTeh = new ImageIcon("../ImageMakanan_Minuman/Logo ShopeePay.png");
        Image imgShopepayEsTeh = shopepayEsTeh.getImage();
        Image imgScaleShopepayEsTeh = imgShopepayEsTeh.getScaledInstance(jLabel_Pembayaran_Shopepay_EsTeh.getWidth(), jLabel_Pembayaran_Shopepay_EsTeh.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon ScaleShopepayEsTeh = new ImageIcon(imgScaleShopepayEsTeh);
        jLabel_Pembayaran_Shopepay_EsTeh.setIcon(ScaleShopepayEsTeh);
        
        // Dana AirMineral 
        ImageIcon danaAirMineral = new ImageIcon("../ImageMakanan_Minuman/Dana.jpg");
        Image imgDanaAirMineral = danaAirMineral.getImage();
        Image imgScaleDanaAirMineral = imgDanaAirMineral.getScaledInstance(jLabel_Pembayaran_Dana_AirMineral.getWidth(), jLabel_Pembayaran_Dana_AirMineral.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon ScaleDanaAirMineral = new ImageIcon(imgScaleDanaAirMineral);
        jLabel_Pembayaran_Dana_AirMineral.setIcon(ScaleDanaAirMineral);
        // Ovo AirMineral
        ImageIcon ovoAirMineral = new ImageIcon("../ImageMakanan_Minuman/Ovo.png");
        Image imgOvoAirMineral = ovoAirMineral.getImage();
        Image imgScaleOvoAirMineral = imgOvoAirMineral.getScaledInstance(jLabel_Pembayaran_Ovo_AirMineral.getWidth(), jLabel_Pembayaran_Ovo_AirMineral.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon ScaleOvoAirMineral = new ImageIcon(imgScaleOvoAirMineral);
        jLabel_Pembayaran_Ovo_AirMineral.setIcon(ScaleOvoAirMineral);
        // Gopay AirMineral
        ImageIcon gopayAirMineral = new ImageIcon("../ImageMakanan_Minuman/GoPay Logo.png");
        Image imgGopayAirMineral = gopayAirMineral.getImage();
        Image imgScaleGopayAirMineral = imgGopayAirMineral.getScaledInstance(jLabel_Pembayaran_Gopay_AirMineral.getWidth(), jLabel_Pembayaran_Gopay_AirMineral.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon ScaleGopayAirMineral = new ImageIcon(imgScaleGopayAirMineral);
        jLabel_Pembayaran_Gopay_AirMineral.setIcon(ScaleGopayAirMineral);
        // Shopepay AirMineral
        ImageIcon shopepayAirMineral = new ImageIcon("../ImageMakanan_Minuman/Logo ShopeePay.png");
        Image imgShopepayAirMineral = shopepayAirMineral.getImage();
        Image imgScaleShopepayAirMineral = imgShopepayAirMineral.getScaledInstance(jLabel_Pembayaran_Shopepay_AirMineral.getWidth(), jLabel_Pembayaran_Shopepay_AirMineral.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon ScaleShopepayAirMineral = new ImageIcon(imgScaleShopepayAirMineral);
        jLabel_Pembayaran_Shopepay_AirMineral.setIcon(ScaleShopepayAirMineral);
        
        // Dana CocaCola
        ImageIcon danaCocaCola = new ImageIcon("../ImageMakanan_Minuman/Dana.jpg");
        Image imgDanaCocaCola = danaCocaCola.getImage();
        Image imgScaleDanaCocaCola = imgDanaCocaCola.getScaledInstance(jLabel_Pembayaran_Dana_CocaCola.getWidth(), jLabel_Pembayaran_Dana_CocaCola.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon ScaleDanaCocaCola = new ImageIcon(imgScaleDanaCocaCola);
        jLabel_Pembayaran_Dana_CocaCola.setIcon(ScaleDanaCocaCola);
        // Ovo CocaCola
        ImageIcon ovoCocaCola = new ImageIcon("../ImageMakanan_Minuman/Ovo.png");
        Image imgOvoCocaCola = ovoCocaCola.getImage();
        Image imgScaleOvoCocaCola = imgOvoCocaCola.getScaledInstance(jLabel_Pembayaran_Ovo_CocaCola.getWidth(), jLabel_Pembayaran_Ovo_CocaCola.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon ScaleOvoCocaCola = new ImageIcon(imgScaleOvoCocaCola);
        jLabel_Pembayaran_Ovo_CocaCola.setIcon(ScaleOvoCocaCola);
        // Gopay CocaCola
        ImageIcon gopayCocaCola = new ImageIcon("../ImageMakanan_Minuman/GoPay Logo.png");
        Image imgGopayCocaCola = gopayCocaCola.getImage();
        Image imgScaleGopayCocaCola = imgGopayCocaCola.getScaledInstance(jLabel_Pembayaran_Gopay_CocaCola.getWidth(), jLabel_Pembayaran_Gopay_CocaCola.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon ScaleGopayCocaCola = new ImageIcon(imgScaleGopayCocaCola);
        jLabel_Pembayaran_Gopay_CocaCola.setIcon(ScaleGopayCocaCola);
        // Shopepay CocaCola
        ImageIcon shopepayCocaCola = new ImageIcon("../ImageMakanan_Minuman/Logo ShopeePay.png");
        Image imgShopepayCocaCola = shopepayCocaCola.getImage();
        Image imgScaleShopepayCocaCola = imgShopepayCocaCola.getScaledInstance(jLabel_Pembayaran_Shopepay_CocaCola.getWidth(), jLabel_Pembayaran_Shopepay_CocaCola.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon ScaleShopepayCocaCola = new ImageIcon(imgScaleShopepayCocaCola);
        jLabel_Pembayaran_Shopepay_CocaCola.setIcon(ScaleShopepayCocaCola);
        
        // Dana Sprite
        ImageIcon danaSprite = new ImageIcon("../ImageMakanan_Minuman/Dana.jpg");
        Image imgDanaSprite = danaSprite.getImage();
        Image imgScaleDanaSprite = imgDanaSprite.getScaledInstance(jLabel_Pembayaran_Dana_Sprite.getWidth(), jLabel_Pembayaran_Dana_Sprite.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon ScaleDanaSprite = new ImageIcon(imgScaleDanaSprite);
        jLabel_Pembayaran_Dana_Sprite.setIcon(ScaleDanaSprite);
        // Ovo Sprite
        ImageIcon ovoSprite = new ImageIcon("../ImageMakanan_Minuman/Ovo.png");
        Image imgOvoSprite = ovoSprite.getImage();
        Image imgScaleOvoSprite = imgOvoSprite.getScaledInstance(jLabel_Pembayaran_Ovo_Sprite.getWidth(), jLabel_Pembayaran_Ovo_Sprite.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon ScaleOvoSprite = new ImageIcon(imgScaleOvoSprite);
        jLabel_Pembayaran_Ovo_Sprite.setIcon(ScaleOvoSprite);
        // Gopay Sprite
        ImageIcon gopaySprite = new ImageIcon("../ImageMakanan_Minuman/GoPay Logo.png");
        Image imgGopaySprite = gopaySprite.getImage();
        Image imgScaleGopaySprite = imgGopaySprite.getScaledInstance(jLabel_Pembayaran_Gopay_Sprite.getWidth(), jLabel_Pembayaran_Gopay_Sprite.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon ScaleGopaySprite = new ImageIcon(imgScaleGopaySprite);
        jLabel_Pembayaran_Gopay_Sprite.setIcon(ScaleGopaySprite);
        // Shopepay Sprite
        ImageIcon shopepaySprite = new ImageIcon("../ImageMakanan_Minuman/Logo ShopeePay.png");
        Image imgShopepaySprite = shopepaySprite.getImage();
        Image imgScaleShopepaySprite = imgShopepaySprite.getScaledInstance(jLabel_Pembayaran_Shopepay_Sprite.getWidth(), jLabel_Pembayaran_Shopepay_Sprite.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon ScaleShopepaySprite =new ImageIcon(imgScaleShopepaySprite);
        jLabel_Pembayaran_Shopepay_Sprite.setIcon(ScaleShopepaySprite);
    }
    
    // Waktu
    public void Tanggal() {
        
        Date tngl = new Date();
        
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MMM-yyyy");
        
        String dd = sdf.format(tngl);
        jLabel_Tanggal.setText(dd);
    }
    
    public void Waktu(){

   
    t = new Timer(0, new ActionListener() {
        @Override
        
        public void actionPerformed(ActionEvent e) {
            //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        
            Date wt  =new Date();
            st = new SimpleDateFormat("hh:mm:ss a");
        
            String tt = st.format(wt);
            jLabel_WaktuSekarang.setText(tt);
        
            }
        });
  
        t.start();     
    }  
    
    public void Mulai() {
        
        Date waktu = new Date();
        st = new SimpleDateFormat("hh:mm:ss a");
        
        String mt = st.format(waktu);
        jLabel_Mulai.setText(mt);
    }
    
    /**
     *
     */
    private int time = 0;
    
    public void WaktuYgTerpakai() {
        
        //Timer timer;
      
        t = new Timer(1000, new ActionListener() {
        @Override
        
        public void actionPerformed(ActionEvent e) {
            //timer.setInitialDelay(0);
        
            time++;
            int jam = time/3600;
            int menit = (time % 3600) / 60;
            int detik = time % 60;
            jLabel_WaktuYgTerpakai.setText(String.format("%02d:%02d:%02d", jam, menit, detik));
            }
        });
        t.setInitialDelay(0);
        t.start();
    }
    
    public void Username() {
        
        String nama = jLabel_Username.getText();
        jLabel_NamaDiWaktu.setText(Login.username);
    }
    
    public void WaktuMenuAwal() {
        
//        String waktu = jLabel_SaldoWaktu.getText();
        String coba = jLabel_WaktuMenuAwal.getText();
        jLabel_SaldoWaktu.setText(coba);
    }
    
//    public void SaldoWaktu () {
//        
//        Timer timer = new Timer(1000, (ActionListener) {
//        
//        timer.start();
//    }
    
//    public void waktuDatabase() {
//        try {
//            String selectSql = "SELECT Waktu FROM tbl_akun WHERE Username = ? ";
//            java.sql.Connection conn = (Connection) KoneksiDataMember.configDB();
//            java.sql.PreparedStatement statement = conn.prepareStatement(selectSql);
//            
//            statement.setString(1, Login.username);
//            ResultSet rs = statement.executeQuery();
//            
//            if (rs.next()) {
//                    java.sql.Time waktuDatabase = rs.getTime("Waktu");
//                    java.util.Date waktuUtil = new java.util.Date(waktuDatabase.getTime());
//                    LocalDateTime saldo = LocalDateTime.ofInstant(waktuUtil.toInstant(), ZoneId.systemDefault());
//            }
//        } catch (Exception e) {
//            System.out.println("Data Salah");
//        }
//    }
    
//    public class MengurangiWaktu implements ActionListener {
//                
//        private final LocalDateTime saldo = LocalDateTime.now().plus(Duration.ofHours(10));
////        private LocalDateTime saldo;
//        
//        @Override
//        public void actionPerformed(ActionEvent e) {
////            waktuDatabase();
//            
//            LocalDateTime now = LocalDateTime.now();
//            Duration duration = Duration.between(now, saldo);
//
//            long hours = Math.abs(duration.toHours());
//            long minutes = Math.abs(duration.toMinutes() % 60);
//            long seconds = Math.abs(duration.getSeconds() % 60);
//
//            String saldoWaktu = String.format("%02d:%02d:%02d", hours, minutes, seconds);
//            jLabel_SaldoWaktu.setText(saldoWaktu);
//            String waktuAwalMenu = String.format("%02d:%02d:%02d", hours, minutes, seconds);
//            jLabel_WaktuMenuAwal.setText(waktuAwalMenu);
//
//            if (duration.isZero() || duration.isNegative()) {
//                JOptionPane.showMessageDialog(null, "Waktu Anda Telah Habis, Terima Kasih Telah Main Di Warnet Citayam Pride");
//                System.exit(0);
//            }
//        }
//    }
    
    public void tampilanNama() {
        try {
            String searchSql = "SELECT Username FROM tbl_akun";
            java.sql.Connection conn = (Connection) KoneksiDataMember.configDB();
            java.sql.PreparedStatement statement = conn.prepareStatement(searchSql);
            
            
            Login.username = username;
            
//            statement.setString(1, Login.username);
            ResultSet rs = statement.executeQuery();
            
            if (rs.next()) {
                jLabel_Username.setText(Login.username);
            }
            
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Tampilan Gagal");
        }
    }
    
    public void name() {
        name = jLabel_Username.getText();
    }
    
    public String decreaseTime(String timeStr) {
        // Mengubah string waktu menjadi objek LocalTime
        LocalTime time = LocalTime.parse(timeStr);
    
        // Mengurangi waktu satu detik
        LocalTime decreasedTime = time.minusSeconds(1);
    
        // Mengubah objek LocalTime menjadi string
        String decreasedTimeStr = decreasedTime.toString();

        return decreasedTimeStr;
    }
    
    public void NgurangWaktu() {
        try {
            String selectSql = "SELECT Waktu FROM tbl_akun WHERE Username = ? ";
            java.sql.Connection conn = (Connection) KoneksiDataMember.configDB();
            java.sql.PreparedStatement statement = conn.prepareStatement(selectSql);
            
            statement.setString(1, Login.username);
            ResultSet rs = statement.executeQuery();
            
            if (rs.next()) {
                 String waktu = rs.getString("Waktu");
                 String decreasedWaktu = decreaseTime(waktu);
                 jLabel_WaktuMenuAwal.setText(decreasedWaktu);
                 jLabel_SaldoWaktu.setText(decreasedWaktu);
                 saldoWaktu(decreasedWaktu);
            }
            rs.close();
            statement.close();
            conn.close();
            
        } catch (Exception e) {
            System.out.println("Data Gagal Di Koneksikan");
        }
    }
    
    public void saldoWaktu(String waktu) {
    // Mengubah string waktu awal menjadi objek LocalTime
    LocalTime time = LocalTime.parse(waktu);

    // Membuat objek Timer dengan interval 1000 ms (1 detik)
    Timer timer = new Timer(1000, new ActionListener() {
        LocalTime currentTime = time;

        @Override
        public void actionPerformed(ActionEvent e) {
            // Mengurangi waktu satu detik
            
            currentTime = currentTime.minusSeconds(1);

            // Mengubah objek LocalTime menjadi string
            String decreasedTimeStr = currentTime.toString();

            // Menetapkan waktu yang dikurangi ke jLabel_WaktuMenuAwal
            jLabel_WaktuMenuAwal.setText(decreasedTimeStr);
            jLabel_SaldoWaktu.setText(decreasedTimeStr);

            // Menghentikan timer jika waktu mencapai 00:00:00
            if (decreasedTimeStr.equals("00:00:00")) {
//                Timer timer = (Timer) e.getSource();
//                timer.stop();
                JOptionPane.showMessageDialog(null, "Waktu Anda Telah Habis, Terima Kasih Telah Main Di Warnet Citayam Pride");
                System.exit(0);
            }
        }
    });

    // Memulai timer
    timer.start();
    }
    
    private void jLabel_Gambar_LogoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_Gambar_LogoutMouseClicked
        this.dispose();
        Login log = new Login();
        log.setVisible(true);
    }//GEN-LAST:event_jLabel_Gambar_LogoutMouseClicked

    private void jLabel_Tulisan_LogoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_Tulisan_LogoutMouseClicked
        this.dispose();
        Login log = new Login();
        log.setVisible(true);
    }//GEN-LAST:event_jLabel_Tulisan_LogoutMouseClicked

    int x = 180;
    private void jLabel_MenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_MenuMouseClicked
        if (x == 180) {
	
            jPanel2.setSize(180,600);
            Thread th = new Thread() {

                @Override
                public void run() {
                    try {
                    	for (int i = 180; i >= 0; i-- ) {
                            Thread.sleep(1);
                            jPanel2.setSize(i, 600);
			}
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, e);
		}
            }
        }; th.start();
        x = 0;
    }
    }//GEN-LAST:event_jLabel_MenuMouseClicked

    private void jLabel_Menu1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_Menu1MouseClicked
        if (x == 0) {
	
            jPanel2.show();
            jPanel2.setSize(180,600);
            Thread th = new Thread() {

                @Override
                public void run() {
                    try {
                        for (int i = 0; i <= x; i++) {
                            Thread.sleep(1);
                            jPanel2.setSize(i, 600);
                        }
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, e);
                    }
                }
            }; th.start();
            x = 180;
        }
    }//GEN-LAST:event_jLabel_Menu1MouseClicked

    private void jLabel_Gambar_GameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_Gambar_GameMouseClicked
        // Jika klik icon game , maka panel game akan true (Terbuka) dan panel yg lain akan false (Tertutup)
        jPanel_Game.setVisible(true);
        jTextField_Search.setVisible(true);
        jPanel_Home.setVisible(false);
        jPanel_Order.setVisible(false);
        jPanel_Waktu.setVisible(false);
        // Jika klik game, maka label tulisan game akan berubah menjadi white(putih) sedangkan yg lain akan hitam
        jLabel_Tulisan_Game.setForeground(Color.white);
        jLabel_Tulisan_Home.setForeground(new Color(0,0,0));
        jLabel_Tulisan_Order.setForeground(new Color(0,0,0));
        jLabel_Tulisan_Waktu.setForeground(new Color(0,0,0));
    }//GEN-LAST:event_jLabel_Gambar_GameMouseClicked

    private void jLabel_Gambar_HomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_Gambar_HomeMouseClicked
        //  Jika klik icon home , maka panel home akan true (Terbuka) dan panel yg lain akan false (Tertutup)
        jPanel_Home.setVisible(true);
        jPanel_Game.setVisible(false);
        jPanel_Order.setVisible(false);
        jPanel_Waktu.setVisible(false);
        // Jika klik home, maka label tulisan home akan berubah menjadi white sedangkan yg lain akan hitam
        jLabel_Tulisan_Home.setForeground(Color.white);
        jLabel_Tulisan_Game.setForeground(new Color(0,0,0));
        jLabel_Tulisan_Order.setForeground(new Color(0,0,0));
        jLabel_Tulisan_Waktu.setForeground(new Color(0,0,0));
        jLabel_Tulisan_Logout.setForeground(new Color(0,0,0));
    }//GEN-LAST:event_jLabel_Gambar_HomeMouseClicked

    private void jLabel_Tulisan_GameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_Tulisan_GameMouseClicked
        // Jika klik tulisan game, maka panel game akan true(Terbuka) dan panel yg lain akan false (Tertutup)
        jPanel_Game.setVisible(true);
        jTextField_Search.setVisible(true);
        jPanel_Home.setVisible(false);
        jPanel_Order.setVisible(false);
        jPanel_Waktu.setVisible(false);
        // Jika klik game, maka label tulisan game akan berubah menjadi white sedangkan yg lain akan hitam
        jLabel_Tulisan_Game.setForeground(Color.white);
        jLabel_Tulisan_Home.setForeground(new Color(0,0,0));
        jLabel_Tulisan_Order.setForeground(new Color(0,0,0));
        jLabel_Tulisan_Waktu.setForeground(new Color(0,0,0));
        jLabel_Tulisan_Logout.setForeground(new Color(0,0,0));
    }//GEN-LAST:event_jLabel_Tulisan_GameMouseClicked

    private void jLabel_Tulisan_HomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_Tulisan_HomeMouseClicked
        // Jika klik tulisan home, maka panel home akan true(Terbuka) dan panel yg lain akan false(Tertutup)
        jPanel_Home.setVisible(true);
        jPanel_Game.setVisible(false);
        jPanel_Order.setVisible(false);
        jPanel_Waktu.setVisible(false);
        // Jika klik home, maka label tulisan home akan berubah menjadi white dan sedangkan yg lain akan hitam
        jLabel_Tulisan_Home.setForeground(Color.white);
        jLabel_Tulisan_Game.setForeground(new Color(0,0,0));
        jLabel_Tulisan_Order.setForeground(new Color(0,0,0));
        jLabel_Tulisan_Waktu.setForeground(new Color(0,0,0));
        jLabel_Tulisan_Logout.setForeground(new Color(0,0,0));
    }//GEN-LAST:event_jLabel_Tulisan_HomeMouseClicked

    private void jTextField_SearchFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField_SearchFocusGained
        if (jTextField_Search.getText().equals("Search...")) {
            jTextField_Search.setText("");
        }
    }//GEN-LAST:event_jTextField_SearchFocusGained

    private void jTextField_SearchFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField_SearchFocusLost
        if (jTextField_Search.getText().equals("")) {
            jTextField_Search.setText("Search...");
        }
    }//GEN-LAST:event_jTextField_SearchFocusLost

    private void jLabel_AllGamesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_AllGamesMouseClicked
        // Jika Memencet All Games , Maka All Games akan True dan yg lainnya akan false
        jPanel_Body_AllGames.setVisible(true);
        // Warna Foregroundnya juga akan berubah, jika di pencet
        jLabel_AllGames.setForeground(new Color(178,235,242));
        jLabel_OnlineGames.setForeground(new Color(255,255,255));
        jLabel_OfflineGames.setForeground(new Color(255,255,255));
        jLabel_AndroidGames.setForeground(new Color(255,255,255));
        // Ini adalah panel yang dimatikan Atau di false
        jPanel_OnlineGames.setVisible(false);
        jPanel_OfflineGames.setVisible(false);
        jPanel_AndroidGames.setVisible(false);
    }//GEN-LAST:event_jLabel_AllGamesMouseClicked

    private void jLabel_OnlineGamesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_OnlineGamesMouseClicked
        // Jika Memencet Online Games , Maka Online Games akan True dan yg lainnya akan false
        jPanel_OnlineGames.setVisible(true);
        // Warna Foregroundnya juga akan berubah, jika di pencet
        jLabel_OnlineGames.setForeground(new Color(178,235,242));
        jLabel_AllGames.setForeground(new Color(255,255,255));
        jLabel_OfflineGames.setForeground(new Color(255,255,255));
        jLabel_AndroidGames.setForeground(new Color(255,255,255));
        // Ini adalah panel yang dimatikan Atau di false
        jPanel_Body_AllGames.setVisible(false);
        jPanel_OfflineGames.setVisible(false);
        jPanel_AndroidGames.setVisible(false);
    }//GEN-LAST:event_jLabel_OnlineGamesMouseClicked

    private void jLabel_OfflineGamesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_OfflineGamesMouseClicked
        // Jika Memencet Offline Games , Maka Offline Games akan True dan yg lainnya akan false
        jPanel_OfflineGames.setVisible(true);
        // Warna Foregroundnya juga akan berubah, jika di pencet
        jLabel_OfflineGames.setForeground(new Color(178,235,242));
        jLabel_AllGames.setForeground(new Color(255,255,255));
        jLabel_OnlineGames.setForeground(new Color(255,255,255));
        jLabel_AndroidGames.setForeground(new Color(255,255,255));
        // Ini adalah panel yang dimatikan Atau di false
        jPanel_Body_AllGames.setVisible(false);
        jPanel_OnlineGames.setVisible(false);
        jPanel_AndroidGames.setVisible(false);
    }//GEN-LAST:event_jLabel_OfflineGamesMouseClicked

    private void jLabel_AndroidGamesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_AndroidGamesMouseClicked
        // Jika Memencet Offline Games , Maka Offline Games akan True dan yg lainnya akan false
        jPanel_AndroidGames.setVisible(true);
        // Warna Foregroundnya juga akan berubah, jika di pencet
        jLabel_AndroidGames.setForeground(new Color(178,235,242));
        jLabel_AllGames.setForeground(new Color(255,255,255));
        jLabel_OnlineGames.setForeground(new Color(255,255,255));
        jLabel_OfflineGames.setForeground(new Color(255,255,255));
        // Ini adalah panel yang dimatikan Atau di false
        jPanel_Body_AllGames.setVisible(false);
        jPanel_OnlineGames.setVisible(false);
        jPanel_OfflineGames.setVisible(false);
    }//GEN-LAST:event_jLabel_AndroidGamesMouseClicked

    private void jLabel_Tulisan_OrderMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_Tulisan_OrderMouseClicked
        // Jika klik tulisan order, maka panel order akan true(Terbuka) dan panel yg lain akan false(Tertutup)
        jPanel_Order.setVisible(true);
        jPanel_Home.setVisible(false);
        jPanel_Game.setVisible(false);
        jPanel_Waktu.setVisible(false);
        // Jika klik order, maka tulisan order akan berubah menjadi white dan yg lainnya akan hitam
        jLabel_Tulisan_Order.setForeground(Color.white);
        jLabel_Tulisan_Game.setForeground(new Color(0,0,0));
        jLabel_Tulisan_Home.setForeground(new Color(0,0,0));
        jLabel_Tulisan_Waktu.setForeground(new Color(0,0,0));
        jLabel_Tulisan_Logout.setForeground(new Color(0,0,0));
    }//GEN-LAST:event_jLabel_Tulisan_OrderMouseClicked

    private void jLabel_Gambar_OrderMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_Gambar_OrderMouseClicked
        // Jika klik gambar order, maka panel order akan true(Terbuka) dan panel yang lain akan false(Tertutup)
        jPanel_Order.setVisible(true);
        jPanel_Home.setVisible(false);
        jPanel_Game.setVisible(false);
        jPanel_Waktu.setVisible(false);
        // Jika klik order, maka tulisan order akan berubah menjadi white dan yg lainnya akan hitam
        jLabel_Tulisan_Order.setForeground(Color.white);
        jLabel_Tulisan_Game.setForeground(new Color(0,0,0));
        jLabel_Tulisan_Home.setForeground(new Color(0,0,0));
        jLabel_Tulisan_Waktu.setForeground(new Color(0,0,0));
        jLabel_Tulisan_Logout.setForeground(new Color(0,0,0));
    }//GEN-LAST:event_jLabel_Gambar_OrderMouseClicked

    private void jLabel_Tulisan_WaktuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_Tulisan_WaktuMouseClicked
        // Jika klik Tulisan Waktu, maka panel waktu akan true(Terbuka) dan panel yang lain akan false (Tertutup)
        Waktu();
        jPanel_Waktu.setVisible(true);
        jPanel_Order.setVisible(false);
        jPanel_Home.setVisible(false);
        jPanel_Game.setVisible(false);
        // Jika klik waktu, maka tulisan waktu akan berubah menjadi white dan yg lainnya akan hitam
        jLabel_Tulisan_Waktu.setForeground(Color.white);
        jLabel_Tulisan_Game.setForeground(new Color(0,0,0));
        jLabel_Tulisan_Home.setForeground(new Color(0,0,0));
        jLabel_Tulisan_Order.setForeground(new Color(0,0,0));
        jLabel_Tulisan_Logout.setForeground(new Color(0,0,0));
    }//GEN-LAST:event_jLabel_Tulisan_WaktuMouseClicked

    private void jLabel_Gambar_WaktuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_Gambar_WaktuMouseClicked
        // Jika klik Tulisan Waktu, maka panel waktu akan true(Terbuka) dan panel yang lain akan false (Tertutup)
        Waktu();
        jPanel_Waktu.setVisible(true);
        jPanel_Order.setVisible(false);
        jPanel_Home.setVisible(false);
        jPanel_Game.setVisible(false);
        // Jika klik waktu, maka tulisan waktu akan berubah menjadi white dan yg lainnya akan hitam
        jLabel_Tulisan_Waktu.setForeground(Color.white);
        jLabel_Tulisan_Game.setForeground(new Color(0,0,0));
        jLabel_Tulisan_Home.setForeground(new Color(0,0,0));
        jLabel_Tulisan_Order.setForeground(new Color(0,0,0));
        jLabel_Tulisan_Logout.setForeground(new Color(0,0,0));
    }//GEN-LAST:event_jLabel_Gambar_WaktuMouseClicked

    private void jLabel_MakananMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_MakananMouseClicked
        jPanel_Makanan.setVisible(true);
        jPanel_Minuman.setVisible(false);
        jLabel_Makanan.setForeground(new Color(178,235,242));
        jLabel_Minuman.setForeground(new Color(255,255,255));
    }//GEN-LAST:event_jLabel_MakananMouseClicked

    private void jLabel_MinumanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_MinumanMouseClicked
        jPanel_Minuman.setVisible(true);
        jPanel_Makanan.setVisible(false);
        jLabel_Minuman.setForeground(new Color(178,235,242));
        jLabel_Makanan.setForeground(new Color(255,255,255));
    }//GEN-LAST:event_jLabel_MinumanMouseClicked

    private void jLabel_MieBiasaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_MieBiasaMouseClicked
        jPanel_JikaPilihMakananMiebiasa.setVisible(true);
        jButton_MilihMieBiasaBack.setVisible(true);
        jTextField_JumlahMieBiasa.setVisible(true);
        jTextField_HargaMieBiasa.setVisible(true);
        jButton_MieBiasa.setVisible(true);
        jButton_MinusMieBiasa.setVisible(true);
        jButton_PlusMieBiasa.setVisible(true);
        // Mematikan Panel Selain Mie Biasa
        jPanel_JikaDiaMemilihMakananKwetiawGoreng.setVisible(false);
        jPanel_JikaDiaMemilihMakananNasiGoreng.setVisible(false);
        jPanel_JikaMemilihMakananSosTeng.setVisible(false);
        jPanel_JikaDiaMemilihMakananMieTelur.setVisible(false);
        jPanel_JikaDiaMemilihMinumanKopi.setVisible(false);
        jPanel_JikaDiaMemilihMinumanEsTeh.setVisible(false);
        jPanel_JikaDiaMemilihMinumanAirMineral.setVisible(false);
        jPanel_JikaDiaMemilihMinumanCocaCola.setVisible(false);
        jPanel_JikaDiaMemilihMinumanSprite.setVisible(false);
        jPanel_HeaderOrder.setVisible(false);
        jPanel_Makanan.setVisible(false);
        jPanel_Minuman.setVisible(false);
    }//GEN-LAST:event_jLabel_MieBiasaMouseClicked

    private void jButton_MilihMieBiasaBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_MilihMieBiasaBackActionPerformed
        jPanel_HeaderOrder.setVisible(true);
        jPanel_Makanan.setVisible(true);
        // Mematikan Semua Panel, Kecuali Header , Makanan Dan Minuman
        jPanel_JikaPilihMakananMiebiasa.setVisible(false);
        jPanel_JikaDiaMemilihMakananMieTelur.setVisible(false);
        jPanel_JikaMemilihMakananSosTeng.setVisible(false);
        jPanel_JikaDiaMemilihMakananNasiGoreng.setVisible(false);
        jPanel_JikaDiaMemilihMakananKwetiawGoreng.setVisible(false);
        jPanel_JikaDiaMemilihMinumanKopi.setVisible(false);
        jPanel_JikaDiaMemilihMinumanEsTeh.setVisible(false);
        jPanel_JikaDiaMemilihMinumanAirMineral.setVisible(false);
        jPanel_JikaDiaMemilihMinumanCocaCola.setVisible(false);
        jPanel_JikaDiaMemilihMinumanSprite.setVisible(false);
        
        count = 0;
        jTextField_JumlahMieBiasa.setText("");
        jTextField_HargaMieBiasa.setText("");
    }//GEN-LAST:event_jButton_MilihMieBiasaBackActionPerformed

    private void jLabel_MieTelorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_MieTelorMouseClicked
        jPanel_JikaDiaMemilihMakananMieTelur.setVisible(true);
        jButton_Back.setVisible(true);
        jTextField_MilihMieGorengTelur_Jumlah.setVisible(true);
        jTextField_MilihMieGorengTelur_Harga.setVisible(true);
        jButton_PesanMilihMieGorengTelur.setVisible(true);
        jButton_MinusMieGorengTelur.setVisible(true);
        jButton_PlusMieGorengTelur.setVisible(true);
        jPanel_JikaDiaMemilihMakananKwetiawGoreng.setVisible(false);
        jPanel_JikaDiaMemilihMakananNasiGoreng.setVisible(false);
        jPanel_JikaPilihMakananMiebiasa.setVisible(false);
        jPanel_JikaMemilihMakananSosTeng.setVisible(false);
        jPanel_JikaDiaMemilihMinumanKopi.setVisible(false);
        jPanel_JikaDiaMemilihMinumanEsTeh.setVisible(false);
        jPanel_JikaDiaMemilihMinumanAirMineral.setVisible(false);
        jPanel_JikaDiaMemilihMinumanCocaCola.setVisible(false);
        jPanel_JikaDiaMemilihMinumanSprite.setVisible(false);
        jPanel_HeaderOrder.setVisible(false);
        jPanel_Makanan.setVisible(false);
        jPanel_Minuman.setVisible(false);
    }//GEN-LAST:event_jLabel_MieTelorMouseClicked

    private void jLabel_SosTengMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_SosTengMouseClicked
        jPanel_JikaMemilihMakananSosTeng.setVisible(true);
        jButton_BackMilihSosTeng.setVisible(true);
        jTextField_JumlahMilihSosTeng.setVisible(true);
        jTextField_HargaMilihSosTeng.setVisible(true);
        jButton_PesanMilihSosTeng.setVisible(true);
        jButton_MinusMilihSosTeng.setVisible(true);
        jButton_PlusMilihSosTeng.setVisible(true);
        jPanel_JikaDiaMemilihMakananKwetiawGoreng.setVisible(false);
        jPanel_JikaDiaMemilihMakananNasiGoreng.setVisible(false);
        jPanel_JikaDiaMemilihMakananMieTelur.setVisible(false);
        jPanel_JikaPilihMakananMiebiasa.setVisible(false);
        jPanel_JikaDiaMemilihMinumanKopi.setVisible(false);
        jPanel_JikaDiaMemilihMinumanEsTeh.setVisible(false);
        jPanel_JikaDiaMemilihMinumanAirMineral.setVisible(false);
        jPanel_JikaDiaMemilihMinumanCocaCola.setVisible(false);
        jPanel_JikaDiaMemilihMinumanSprite.setVisible(false);
        jPanel_HeaderOrder.setVisible(false);
        jPanel_Makanan.setVisible(false);
        jPanel_Minuman.setVisible(false);
    }//GEN-LAST:event_jLabel_SosTengMouseClicked

    private void jLabel_NasiGorengMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_NasiGorengMouseClicked
        jPanel_JikaDiaMemilihMakananNasiGoreng.setVisible(true);
        jButton_BackMilihNasiGoreng.setVisible(true);
        jTextField_JumlahMilihNasiGoreng.setVisible(true);
        jTextField_HargaMilihNasiGoreng.setVisible(true);
        jButton_PesanMilihNasiGoreng.setVisible(true);
        jButton_PlusMilihNasiGoreng.setVisible(true);
        jButton_MinusMilihNasiGoreng.setVisible(true);
        jPanel_JikaDiaMemilihMakananKwetiawGoreng.setVisible(false);
        jPanel_JikaMemilihMakananSosTeng.setVisible(false);
        jPanel_JikaDiaMemilihMakananMieTelur.setVisible(false);
        jPanel_JikaPilihMakananMiebiasa.setVisible(false);
        jPanel_JikaDiaMemilihMinumanKopi.setVisible(false);
        jPanel_JikaDiaMemilihMinumanEsTeh.setVisible(false);
        jPanel_JikaDiaMemilihMinumanAirMineral.setVisible(false);
        jPanel_JikaDiaMemilihMinumanCocaCola.setVisible(false);
        jPanel_JikaDiaMemilihMinumanSprite.setVisible(false);
        jPanel_HeaderOrder.setVisible(false);
        jPanel_Makanan.setVisible(false);
        jPanel_Minuman.setVisible(false);
    }//GEN-LAST:event_jLabel_NasiGorengMouseClicked

    private void jLabel_KewtiawGorengMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_KewtiawGorengMouseClicked
        jPanel_JikaDiaMemilihMakananKwetiawGoreng.setVisible(true);
        jButton_BackMilihKwetiawGoreng.setVisible(true);
        jTextField_JumlahMilihKwetiawGoreng.setVisible(true);
        jTextField_HargaMilihKwetiawGoreng.setVisible(true);
        jButton_PesanMilihKwetiawGoreng.setVisible(true);
        jButton_MinusMilihKwetiawGoreng.setVisible(true);
        jButton_PlusMilihKwetiawGoreng.setVisible(true);
        jPanel_JikaDiaMemilihMakananNasiGoreng.setVisible(false);
        jPanel_JikaMemilihMakananSosTeng.setVisible(false);
        jPanel_JikaDiaMemilihMakananMieTelur.setVisible(false);
        jPanel_JikaPilihMakananMiebiasa.setVisible(false);
        jPanel_JikaDiaMemilihMinumanKopi.setVisible(false);
        jPanel_JikaDiaMemilihMinumanEsTeh.setVisible(false);
        jPanel_JikaDiaMemilihMinumanAirMineral.setVisible(false);
        jPanel_JikaDiaMemilihMinumanCocaCola.setVisible(false);
        jPanel_JikaDiaMemilihMinumanSprite.setVisible(false);
        jPanel_HeaderOrder.setVisible(false);
        jPanel_Makanan.setVisible(false);
        jPanel_Minuman.setVisible(false);
    }//GEN-LAST:event_jLabel_KewtiawGorengMouseClicked

    private void jButton_BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_BackActionPerformed
        jPanel_HeaderOrder.setVisible(true);
        jPanel_Makanan.setVisible(true);
        // Mematikan Semua Panel, Kecuali Header , Makanan Dan Minuman
        jPanel_JikaPilihMakananMiebiasa.setVisible(false);
        jPanel_JikaDiaMemilihMakananMieTelur.setVisible(false);
        jPanel_JikaMemilihMakananSosTeng.setVisible(false);
        jPanel_JikaDiaMemilihMakananNasiGoreng.setVisible(false);
        jPanel_JikaDiaMemilihMakananKwetiawGoreng.setVisible(false);
        jPanel_JikaDiaMemilihMinumanKopi.setVisible(false);
        jPanel_JikaDiaMemilihMinumanEsTeh.setVisible(false);
        jPanel_JikaDiaMemilihMinumanAirMineral.setVisible(false);
        jPanel_JikaDiaMemilihMinumanCocaCola.setVisible(false);
        jPanel_JikaDiaMemilihMinumanSprite.setVisible(false);
        
        
        ngitungMieTelur = 0;
        jTextField_MilihMieGorengTelur_Jumlah.setText("");
        jTextField_MilihMieGorengTelur_Harga.setText("");
    }//GEN-LAST:event_jButton_BackActionPerformed

    private void jButton_BackMilihSosTengActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_BackMilihSosTengActionPerformed
        jPanel_HeaderOrder.setVisible(true);
        jPanel_Makanan.setVisible(true);
        // Mematikan Semua Panel, Kecuali Header , Makanan Dan Minuman
        jPanel_JikaPilihMakananMiebiasa.setVisible(false);
        jPanel_JikaDiaMemilihMakananMieTelur.setVisible(false);
        jPanel_JikaMemilihMakananSosTeng.setVisible(false);
        jPanel_JikaDiaMemilihMakananNasiGoreng.setVisible(false);
        jPanel_JikaDiaMemilihMakananKwetiawGoreng.setVisible(false);
        jPanel_JikaDiaMemilihMinumanKopi.setVisible(false);
        jPanel_JikaDiaMemilihMinumanEsTeh.setVisible(false);
        jPanel_JikaDiaMemilihMinumanAirMineral.setVisible(false);
        jPanel_JikaDiaMemilihMinumanCocaCola.setVisible(false);
        jPanel_JikaDiaMemilihMinumanSprite.setVisible(false);
        
        ngitungSosTeng = 0;
        jTextField_JumlahMilihSosTeng.setText("");
        jTextField_HargaMilihSosTeng.setText("");
    }//GEN-LAST:event_jButton_BackMilihSosTengActionPerformed

    private void jButton_BackMilihNasiGorengActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_BackMilihNasiGorengActionPerformed
        jPanel_HeaderOrder.setVisible(true);
        jPanel_Makanan.setVisible(true);
        // Mematikan Semua Panel, Kecuali Header , Makanan Dan Minuman
        jPanel_JikaPilihMakananMiebiasa.setVisible(false);
        jPanel_JikaDiaMemilihMakananMieTelur.setVisible(false);
        jPanel_JikaMemilihMakananSosTeng.setVisible(false);
        jPanel_JikaDiaMemilihMakananNasiGoreng.setVisible(false);
        jPanel_JikaDiaMemilihMakananKwetiawGoreng.setVisible(false);
        jPanel_JikaDiaMemilihMinumanKopi.setVisible(false);
        jPanel_JikaDiaMemilihMinumanEsTeh.setVisible(false);
        jPanel_JikaDiaMemilihMinumanAirMineral.setVisible(false);
        jPanel_JikaDiaMemilihMinumanCocaCola.setVisible(false);
        jPanel_JikaDiaMemilihMinumanSprite.setVisible(false);
        
        ngitungNasiGoreng = 0;
        jTextField_JumlahMilihNasiGoreng.setText("");
        jTextField_HargaMilihNasiGoreng.setText("");
    }//GEN-LAST:event_jButton_BackMilihNasiGorengActionPerformed

    private void jButton_BackMilihKwetiawGorengActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_BackMilihKwetiawGorengActionPerformed
        jPanel_HeaderOrder.setVisible(true);
        jPanel_Makanan.setVisible(true);
        // Mematikan Semua Panel, Kecuali Header , Makanan Dan Minuman
        jPanel_JikaPilihMakananMiebiasa.setVisible(false);
        jPanel_JikaDiaMemilihMakananMieTelur.setVisible(false);
        jPanel_JikaMemilihMakananSosTeng.setVisible(false);
        jPanel_JikaDiaMemilihMakananNasiGoreng.setVisible(false);
        jPanel_JikaDiaMemilihMakananKwetiawGoreng.setVisible(false);
        jPanel_JikaDiaMemilihMinumanKopi.setVisible(false);
        jPanel_JikaDiaMemilihMinumanEsTeh.setVisible(false);
        jPanel_JikaDiaMemilihMinumanAirMineral.setVisible(false);
        jPanel_JikaDiaMemilihMinumanCocaCola.setVisible(false);
        jPanel_JikaDiaMemilihMinumanSprite.setVisible(false);
        
        ngitungKwetiawGoreng = 0;
        jTextField_JumlahMilihKwetiawGoreng.setText("");
        jTextField_HargaMilihKwetiawGoreng.setText("");
    }//GEN-LAST:event_jButton_BackMilihKwetiawGorengActionPerformed
    int ngitungMieTelur = 0;
    private void jButton_PlusMieGorengTelurActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_PlusMieGorengTelurActionPerformed
        ngitungMieTelur++;
        jTextField_MilihMieGorengTelur_Jumlah.setText(""+ngitungMieTelur);
        
        double jum = ngitungMieTelur*12000;
        
        jTextField_MilihMieGorengTelur_Harga.getText();
        jTextField_MilihMieGorengTelur_Harga.setText("Rp. "+jum);
    }//GEN-LAST:event_jButton_PlusMieGorengTelurActionPerformed

    private void jButton_MinusMieGorengTelurActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_MinusMieGorengTelurActionPerformed
        ngitungMieTelur--;
        jTextField_MilihMieGorengTelur_Jumlah.setText(""+ngitungMieTelur);
        
        double jum = ngitungMieTelur*12000;
        
        jTextField_MilihMieGorengTelur_Harga.getText();
        jTextField_MilihMieGorengTelur_Harga.setText("Rp. "+jum);
    }//GEN-LAST:event_jButton_MinusMieGorengTelurActionPerformed
    int count = 0;
    private void jButton_PlusMieBiasaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_PlusMieBiasaActionPerformed
        count++;
        jTextField_JumlahMieBiasa.setText(""+count);
        
        double jum = count*5000;
        
        jTextField_HargaMieBiasa.getText();
        jTextField_HargaMieBiasa.setText("Rp. "+jum);
    }//GEN-LAST:event_jButton_PlusMieBiasaActionPerformed

    private void jButton_MinusMieBiasaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_MinusMieBiasaActionPerformed
        count--;
        jTextField_JumlahMieBiasa.setText(""+count);
        
        double jum = count*5000;
        
        jTextField_HargaMieBiasa.getText();
        jTextField_HargaMieBiasa.setText("Rp. "+jum);
    }//GEN-LAST:event_jButton_MinusMieBiasaActionPerformed
    int ngitungSosTeng = 0;
    private void jButton_PlusMilihSosTengActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_PlusMilihSosTengActionPerformed
        ngitungSosTeng++;
        
        jTextField_JumlahMilihSosTeng.setText(""+ngitungSosTeng);
        
        double jum = ngitungSosTeng*10000;
        
        jTextField_HargaMilihSosTeng.getText();
        jTextField_HargaMilihSosTeng.setText("Rp. "+jum);
    }//GEN-LAST:event_jButton_PlusMilihSosTengActionPerformed

    private void jButton_MinusMilihSosTengActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_MinusMilihSosTengActionPerformed
        ngitungSosTeng--;
        
        jTextField_JumlahMilihSosTeng.setText(""+ngitungSosTeng);
        
        double jum = ngitungSosTeng*10000;
        
        jTextField_HargaMilihSosTeng.getText();
        jTextField_HargaMilihSosTeng.setText("Rp. "+jum);
    }//GEN-LAST:event_jButton_MinusMilihSosTengActionPerformed
    int ngitungNasiGoreng = 0;
    private void jButton_PlusMilihNasiGorengActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_PlusMilihNasiGorengActionPerformed
        ngitungNasiGoreng++;
        
        jTextField_JumlahMilihNasiGoreng.setText(""+ngitungNasiGoreng);
        
        double jum = ngitungNasiGoreng*15000;
        
        jTextField_HargaMilihNasiGoreng.getText();
        jTextField_HargaMilihNasiGoreng.setText("Rp. "+jum);
    }//GEN-LAST:event_jButton_PlusMilihNasiGorengActionPerformed

    private void jButton_MinusMilihNasiGorengActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_MinusMilihNasiGorengActionPerformed
        ngitungNasiGoreng--;
        
        jTextField_JumlahMilihNasiGoreng.setText(""+ngitungNasiGoreng);
        
        double jum = ngitungNasiGoreng*15000;
        
        jTextField_HargaMilihNasiGoreng.getText();
        jTextField_HargaMilihNasiGoreng.setText("Rp. "+jum);
    }//GEN-LAST:event_jButton_MinusMilihNasiGorengActionPerformed
    int ngitungKwetiawGoreng = 0;
    private void jButton_PlusMilihKwetiawGorengActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_PlusMilihKwetiawGorengActionPerformed
        ngitungKwetiawGoreng++;
        
        jTextField_JumlahMilihKwetiawGoreng.setText(""+ngitungKwetiawGoreng);
        
        double jum = ngitungKwetiawGoreng*15000;
        
        jTextField_HargaMilihKwetiawGoreng.getText();
        jTextField_HargaMilihKwetiawGoreng.setText("Rp. "+jum);
    }//GEN-LAST:event_jButton_PlusMilihKwetiawGorengActionPerformed

    private void jButton_MinusMilihKwetiawGorengActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_MinusMilihKwetiawGorengActionPerformed
        ngitungKwetiawGoreng--;
        
        jTextField_JumlahMilihKwetiawGoreng.setText(""+ngitungKwetiawGoreng);
        
        double jum = ngitungKwetiawGoreng*15000;
        
        jTextField_HargaMilihKwetiawGoreng.getText();
        jTextField_HargaMilihKwetiawGoreng.setText("Rp. "+jum);
    }//GEN-LAST:event_jButton_MinusMilihKwetiawGorengActionPerformed

    private void jLabel_KopiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_KopiMouseClicked
        jPanel_JikaDiaMemilihMinumanKopi.setVisible(true);
        jButton_Back_MinumanKopi.setVisible(true);
        jTextField_Jumlah_MinumanKopi.setVisible(true);
        jTextField_Harga_MinumanKopi.setVisible(true);
        jButton_Pesan_MinumanKopi.setVisible(true);
        jButton_Minus_MinumanKopi.setVisible(true);
        jButton_Plus_MinumanKopi.setVisible(true);
        // Mematikan Panel Selain Kopi
        jPanel_JikaPilihMakananMiebiasa.setVisible(false);
        jPanel_JikaDiaMemilihMakananMieTelur.setVisible(false);
        jPanel_JikaMemilihMakananSosTeng.setVisible(false);
        jPanel_JikaDiaMemilihMakananNasiGoreng.setVisible(false);
        jPanel_JikaDiaMemilihMakananKwetiawGoreng.setVisible(false);
        jPanel_JikaDiaMemilihMinumanEsTeh.setVisible(false);
        jPanel_JikaDiaMemilihMinumanAirMineral.setVisible(false);
        jPanel_JikaDiaMemilihMinumanCocaCola.setVisible(false);
        jPanel_JikaDiaMemilihMinumanSprite.setVisible(false);
        // Mematikan Panel Header, Minuman Dan Makanan
        jPanel_HeaderOrder.setVisible(false);
        jPanel_Makanan.setVisible(false);
        jPanel_Minuman.setVisible(false);
    }//GEN-LAST:event_jLabel_KopiMouseClicked

    private void jLabel_IceTeaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_IceTeaMouseClicked
        jPanel_JikaDiaMemilihMinumanEsTeh.setVisible(true);
        jButton_Back_MinumanEsTeh.setVisible(true);
        jTextField_Jumlah_MinumanEsTeh.setVisible(true);
        jTextField_Harga_MinumanEsTeh.setVisible(true);
        jButton_Pesan_MinumanEsTeh.setVisible(true);
        jButton_Minus_MinumanEsTeh.setVisible(true);
        jButton_Plus_MinumanEsTeh.setVisible(true);
        // Mematikan Panel Selain Es Teh
        jPanel_JikaPilihMakananMiebiasa.setVisible(false);
        jPanel_JikaDiaMemilihMakananMieTelur.setVisible(false);
        jPanel_JikaMemilihMakananSosTeng.setVisible(false);
        jPanel_JikaDiaMemilihMakananNasiGoreng.setVisible(false);
        jPanel_JikaDiaMemilihMakananKwetiawGoreng.setVisible(false);
        jPanel_JikaDiaMemilihMinumanKopi.setVisible(false);
        jPanel_JikaDiaMemilihMinumanAirMineral.setVisible(false);
        jPanel_JikaDiaMemilihMinumanCocaCola.setVisible(false);
        jPanel_JikaDiaMemilihMinumanSprite.setVisible(false);
        // Mematikan Panel Header, Minuman dan Makanan
        jPanel_HeaderOrder.setVisible(false);
        jPanel_Makanan.setVisible(false);
        jPanel_Minuman.setVisible(false);
    }//GEN-LAST:event_jLabel_IceTeaMouseClicked

    private void jLabel_AirMineralMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_AirMineralMouseClicked
        jPanel_JikaDiaMemilihMinumanAirMineral.setVisible(true);
        jButton_Back_MinumanAirMineral.setVisible(true);
        jTextField_Jumlah_MinumanAirMineral.setVisible(true);
        jTextField_Harga_MinumanAirMineral.setVisible(true);
        jButton_Pesan_MinumanAirMineral.setVisible(true);
        jButton_Minus_MinumanAirMineral.setVisible(true);
        jButton_Plus_MinumanAirMineral.setVisible(true);
        // Mematikan Panel Selain Air Mineral
        jPanel_JikaPilihMakananMiebiasa.setVisible(false);
        jPanel_JikaDiaMemilihMakananMieTelur.setVisible(false);
        jPanel_JikaMemilihMakananSosTeng.setVisible(false);
        jPanel_JikaDiaMemilihMakananNasiGoreng.setVisible(false);
        jPanel_JikaDiaMemilihMakananKwetiawGoreng.setVisible(false);
        jPanel_JikaDiaMemilihMinumanKopi.setVisible(false);
        jPanel_JikaDiaMemilihMinumanEsTeh.setVisible(false);
        jPanel_JikaDiaMemilihMinumanCocaCola.setVisible(false);
        jPanel_JikaDiaMemilihMinumanSprite.setVisible(false);
        // Mematikan Panel Header, Minuman dan Makanan
        jPanel_HeaderOrder.setVisible(false);
        jPanel_Makanan.setVisible(false);
        jPanel_Minuman.setVisible(false);
    }//GEN-LAST:event_jLabel_AirMineralMouseClicked

    private void jLabel_CocaColaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_CocaColaMouseClicked
        jPanel_JikaDiaMemilihMinumanCocaCola.setVisible(true);
        jButton_Back_MinumanCocaCola.setVisible(true);
        jTextField_Jumlah_MinumanCocaCola.setVisible(true);
        jTextField_Harga_MinumanCocaCola.setVisible(true);
        jButton_Pesan_MinumanCocaCola.setVisible(true);
        jButton_Minus_MinumanCocaCola.setVisible(true);
        jButton_Plus_MinumanCocaCola.setVisible(true);
        // Mematikan Panel Selain Coca Cola
        jPanel_JikaPilihMakananMiebiasa.setVisible(false);
        jPanel_JikaDiaMemilihMakananMieTelur.setVisible(false);
        jPanel_JikaMemilihMakananSosTeng.setVisible(false);
        jPanel_JikaDiaMemilihMakananNasiGoreng.setVisible(false);
        jPanel_JikaDiaMemilihMakananKwetiawGoreng.setVisible(false);
        jPanel_JikaDiaMemilihMinumanKopi.setVisible(false);
        jPanel_JikaDiaMemilihMinumanEsTeh.setVisible(false);
        jPanel_JikaDiaMemilihMinumanAirMineral.setVisible(false);
        jPanel_JikaDiaMemilihMinumanSprite.setVisible(false);
        // Mematikan Panel Header, Minuman dan Makanan
        jPanel_HeaderOrder.setVisible(false);
        jPanel_Makanan.setVisible(false);
        jPanel_Minuman.setVisible(false);
    }//GEN-LAST:event_jLabel_CocaColaMouseClicked

    private void jLabel_SpriteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_SpriteMouseClicked
        jPanel_JikaDiaMemilihMinumanSprite.setVisible(true);
        jButton_Back_MinumanSprite.setVisible(true);
        jTextField_Jumlah_MinumanSprite.setVisible(true);
        jTextField_Harga_MinumanSprite.setVisible(true);
        jButton_Pesan_MinumanSprite.setVisible(true);
        jButton_Minus_MinumanSprite.setVisible(true);
        jButton_Plus_MinumanSprite.setVisible(true);
        // Mematikan Panel Selain Sprite
        jPanel_JikaPilihMakananMiebiasa.setVisible(false);
        jPanel_JikaDiaMemilihMakananMieTelur.setVisible(false);
        jPanel_JikaMemilihMakananSosTeng.setVisible(false);
        jPanel_JikaDiaMemilihMakananNasiGoreng.setVisible(false);
        jPanel_JikaDiaMemilihMakananKwetiawGoreng.setVisible(false);
        jPanel_JikaDiaMemilihMinumanKopi.setVisible(false);
        jPanel_JikaDiaMemilihMinumanEsTeh.setVisible(false);
        jPanel_JikaDiaMemilihMinumanAirMineral.setVisible(false);
        jPanel_JikaDiaMemilihMinumanCocaCola.setVisible(false);
        // Mematikan Panel Header, Minuman Dan Makanan
        jPanel_HeaderOrder.setVisible(false);
        jPanel_Makanan.setVisible(false);
        jPanel_Minuman.setVisible(false);
    }//GEN-LAST:event_jLabel_SpriteMouseClicked

    private void jButton_Back_MinumanKopiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Back_MinumanKopiActionPerformed
        jPanel_HeaderOrder.setVisible(true);
        jPanel_Minuman.setVisible(true);
        // Mematikan Semua Panel, Kecuali Header , Makanan Dan Minuman
        jPanel_JikaPilihMakananMiebiasa.setVisible(false);
        jPanel_JikaDiaMemilihMakananMieTelur.setVisible(false);
        jPanel_JikaMemilihMakananSosTeng.setVisible(false);
        jPanel_JikaDiaMemilihMakananNasiGoreng.setVisible(false);
        jPanel_JikaDiaMemilihMakananKwetiawGoreng.setVisible(false);
        jPanel_JikaDiaMemilihMinumanKopi.setVisible(false);
        jPanel_JikaDiaMemilihMinumanEsTeh.setVisible(false);
        jPanel_JikaDiaMemilihMinumanAirMineral.setVisible(false);
        jPanel_JikaDiaMemilihMinumanCocaCola.setVisible(false);
        jPanel_JikaDiaMemilihMinumanSprite.setVisible(false);
        
        ngitungMinumanKopi = 0;
        jTextField_Jumlah_MinumanKopi.setText("");
        jTextField_Harga_MinumanKopi.setText("");
    }//GEN-LAST:event_jButton_Back_MinumanKopiActionPerformed

    private void jButton_Back_MinumanEsTehActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Back_MinumanEsTehActionPerformed
        jPanel_HeaderOrder.setVisible(true);
        jPanel_Minuman.setVisible(true);
        // Mematikan Semua Panel, Kecuali Header , Makanan Dan Minuman
        jPanel_JikaPilihMakananMiebiasa.setVisible(false);
        jPanel_JikaDiaMemilihMakananMieTelur.setVisible(false);
        jPanel_JikaMemilihMakananSosTeng.setVisible(false);
        jPanel_JikaDiaMemilihMakananNasiGoreng.setVisible(false);
        jPanel_JikaDiaMemilihMakananKwetiawGoreng.setVisible(false);
        jPanel_JikaDiaMemilihMinumanKopi.setVisible(false);
        jPanel_JikaDiaMemilihMinumanEsTeh.setVisible(false);
        jPanel_JikaDiaMemilihMinumanAirMineral.setVisible(false);
        jPanel_JikaDiaMemilihMinumanCocaCola.setVisible(false);
        jPanel_JikaDiaMemilihMinumanSprite.setVisible(false);
        
        ngitungMinumanEsTeh = 0;
        jTextField_Jumlah_MinumanEsTeh.setText("");
        jTextField_Harga_MinumanEsTeh.setText("");
    }//GEN-LAST:event_jButton_Back_MinumanEsTehActionPerformed

    private void jButton_Back_MinumanAirMineralActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Back_MinumanAirMineralActionPerformed
        jPanel_HeaderOrder.setVisible(true);
        jPanel_Minuman.setVisible(true);
        // Mematikan Semua Panel, Kecuali Header , Makanan Dan Minuman
        jPanel_JikaPilihMakananMiebiasa.setVisible(false);
        jPanel_JikaDiaMemilihMakananMieTelur.setVisible(false);
        jPanel_JikaMemilihMakananSosTeng.setVisible(false);
        jPanel_JikaDiaMemilihMakananNasiGoreng.setVisible(false);
        jPanel_JikaDiaMemilihMakananKwetiawGoreng.setVisible(false);
        jPanel_JikaDiaMemilihMinumanKopi.setVisible(false);
        jPanel_JikaDiaMemilihMinumanEsTeh.setVisible(false);
        jPanel_JikaDiaMemilihMinumanAirMineral.setVisible(false);
        jPanel_JikaDiaMemilihMinumanCocaCola.setVisible(false);
        jPanel_JikaDiaMemilihMinumanSprite.setVisible(false);
        
        ngitungMinumanAirMineral = 0;
        jTextField_Jumlah_MinumanAirMineral.setText("");
        jTextField_Harga_MinumanAirMineral.setText("");
    }//GEN-LAST:event_jButton_Back_MinumanAirMineralActionPerformed

    private void jButton_Back_MinumanCocaColaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Back_MinumanCocaColaActionPerformed
        jPanel_HeaderOrder.setVisible(true);
        jPanel_Minuman.setVisible(true);
        // Mematikan Semua Panel, Kecuali Header , Makanan Dan Minuman
        jPanel_JikaPilihMakananMiebiasa.setVisible(false);
        jPanel_JikaDiaMemilihMakananMieTelur.setVisible(false);
        jPanel_JikaMemilihMakananSosTeng.setVisible(false);
        jPanel_JikaDiaMemilihMakananNasiGoreng.setVisible(false);
        jPanel_JikaDiaMemilihMakananKwetiawGoreng.setVisible(false);
        jPanel_JikaDiaMemilihMinumanKopi.setVisible(false);
        jPanel_JikaDiaMemilihMinumanEsTeh.setVisible(false);
        jPanel_JikaDiaMemilihMinumanAirMineral.setVisible(false);
        jPanel_JikaDiaMemilihMinumanCocaCola.setVisible(false);
        jPanel_JikaDiaMemilihMinumanSprite.setVisible(false);
        
        ngitungMinumanCocaCola = 0;
        jTextField_Jumlah_MinumanCocaCola.setText("");
        jTextField_Harga_MinumanCocaCola.setText("");
    }//GEN-LAST:event_jButton_Back_MinumanCocaColaActionPerformed

    private void jButton_Back_MinumanSpriteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Back_MinumanSpriteActionPerformed
        jPanel_HeaderOrder.setVisible(true);
        jPanel_Minuman.setVisible(true);
        // Mematikan Semua Panel, Kecuali Header , Makanan Dan Minuman
        jPanel_JikaPilihMakananMiebiasa.setVisible(false);
        jPanel_JikaDiaMemilihMakananMieTelur.setVisible(false);
        jPanel_JikaMemilihMakananSosTeng.setVisible(false);
        jPanel_JikaDiaMemilihMakananNasiGoreng.setVisible(false);
        jPanel_JikaDiaMemilihMakananKwetiawGoreng.setVisible(false);
        jPanel_JikaDiaMemilihMinumanKopi.setVisible(false);
        jPanel_JikaDiaMemilihMinumanEsTeh.setVisible(false);
        jPanel_JikaDiaMemilihMinumanAirMineral.setVisible(false);
        jPanel_JikaDiaMemilihMinumanCocaCola.setVisible(false);
        jPanel_JikaDiaMemilihMinumanSprite.setVisible(false);
        
        ngitungMinumanSprite = 0;
        jTextField_Jumlah_MinumanSprite.setText("");
        jTextField_Harga_MinumanSprite.setText("");
    }//GEN-LAST:event_jButton_Back_MinumanSpriteActionPerformed
    int ngitungMinumanKopi = 0;
    private void jButton_Plus_MinumanKopiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Plus_MinumanKopiActionPerformed
        ngitungMinumanKopi++;
        jTextField_Jumlah_MinumanKopi.setText(""+ngitungMinumanKopi);
        
        double jum = ngitungMinumanKopi*6000;
        
        jTextField_Harga_MinumanKopi.getText();
        jTextField_Harga_MinumanKopi.setText("Rp. "+jum);
    }//GEN-LAST:event_jButton_Plus_MinumanKopiActionPerformed

    private void jButton_Minus_MinumanKopiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Minus_MinumanKopiActionPerformed
        ngitungMinumanKopi--;
        jTextField_Jumlah_MinumanKopi.setText(""+ngitungMinumanKopi);
        
        double jum = ngitungMinumanKopi*6000;
        
        jTextField_Harga_MinumanKopi.getText();
        jTextField_Harga_MinumanKopi.setText("Rp. "+jum);
    }//GEN-LAST:event_jButton_Minus_MinumanKopiActionPerformed
    int ngitungMinumanEsTeh = 0;
    private void jButton_Plus_MinumanEsTehActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Plus_MinumanEsTehActionPerformed
        ngitungMinumanEsTeh++;
        jTextField_Jumlah_MinumanEsTeh.setText(""+ngitungMinumanEsTeh);
        
        double jum = ngitungMinumanEsTeh*5000;
        
        jTextField_Harga_MinumanEsTeh.getText();
        jTextField_Harga_MinumanEsTeh.setText("Rp. "+jum);
    }//GEN-LAST:event_jButton_Plus_MinumanEsTehActionPerformed

    private void jButton_Minus_MinumanEsTehActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Minus_MinumanEsTehActionPerformed
        ngitungMinumanEsTeh--;
        jTextField_Jumlah_MinumanEsTeh.setText(""+ngitungMinumanEsTeh);
        
        double jum = ngitungMinumanEsTeh*5000;
        
        jTextField_Harga_MinumanEsTeh.getText();
        jTextField_Harga_MinumanEsTeh.setText("Rp. "+jum);  
    }//GEN-LAST:event_jButton_Minus_MinumanEsTehActionPerformed
    int ngitungMinumanAirMineral = 0;
    private void jButton_Plus_MinumanAirMineralActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Plus_MinumanAirMineralActionPerformed
        ngitungMinumanAirMineral++;
        jTextField_Jumlah_MinumanAirMineral.setText(""+ngitungMinumanAirMineral);
        
        double jum = ngitungMinumanAirMineral*5000;
        
        jTextField_Harga_MinumanAirMineral.getText();
        jTextField_Harga_MinumanAirMineral.setText("Rp. "+jum);
    }//GEN-LAST:event_jButton_Plus_MinumanAirMineralActionPerformed

    private void jButton_Minus_MinumanAirMineralActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Minus_MinumanAirMineralActionPerformed
        ngitungMinumanAirMineral--;
        jTextField_Jumlah_MinumanAirMineral.setText(""+ngitungMinumanAirMineral);
        
        double jum = ngitungMinumanAirMineral*5000;
        
        jTextField_Harga_MinumanAirMineral.getText();
        jTextField_Harga_MinumanAirMineral.setText("Rp. "+jum);
    }//GEN-LAST:event_jButton_Minus_MinumanAirMineralActionPerformed
    int ngitungMinumanCocaCola = 0;
    private void jButton_Plus_MinumanCocaColaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Plus_MinumanCocaColaActionPerformed
        ngitungMinumanCocaCola++;
        jTextField_Jumlah_MinumanCocaCola.setText(""+ngitungMinumanCocaCola);
        
        double jum = ngitungMinumanCocaCola*8000;
        
        jTextField_Harga_MinumanCocaCola.getText();
        jTextField_Harga_MinumanCocaCola.setText("Rp. "+jum); 
    }//GEN-LAST:event_jButton_Plus_MinumanCocaColaActionPerformed

    private void jButton_Minus_MinumanCocaColaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Minus_MinumanCocaColaActionPerformed
        ngitungMinumanCocaCola--;
        jTextField_Jumlah_MinumanCocaCola.setText(""+ngitungMinumanCocaCola);
        
        double jum = ngitungMinumanCocaCola*8000;
        
        jTextField_Harga_MinumanCocaCola.getText();
        jTextField_Harga_MinumanCocaCola.setText("Rp. "+jum); 
    }//GEN-LAST:event_jButton_Minus_MinumanCocaColaActionPerformed
    int ngitungMinumanSprite = 0;
    private void jButton_Plus_MinumanSpriteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Plus_MinumanSpriteActionPerformed
        ngitungMinumanSprite++;
        jTextField_Jumlah_MinumanSprite.setText(""+ngitungMinumanSprite);
        
        double jum = ngitungMinumanSprite*8000;
        
        jTextField_Harga_MinumanSprite.getText();
        jTextField_Harga_MinumanSprite.setText("Rp. "+jum); 
    }//GEN-LAST:event_jButton_Plus_MinumanSpriteActionPerformed

    private void jButton_Minus_MinumanSpriteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Minus_MinumanSpriteActionPerformed
        ngitungMinumanSprite--;
        jTextField_Jumlah_MinumanSprite.setText(""+ngitungMinumanSprite);
        
        double jum = ngitungMinumanSprite*8000;
        
        jTextField_Harga_MinumanSprite.getText();
        jTextField_Harga_MinumanSprite.setText("Rp. "+jum);
    }//GEN-LAST:event_jButton_Minus_MinumanSpriteActionPerformed

    private void jButton_MieBiasaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_MieBiasaActionPerformed
//        JOptionPane.showMessageDialog(this, "Pesanan Anda Sedang Dibuat, Mohon Untuk Membayar Di Kasir. \n\n\n                                       Terima Kasih");
        jPanel_JikaDiaPesanMieBiasa.setVisible(true);
        jButton_BackPembayaranMieBiasa.setVisible(true);
        jButton_BeliSekarangPembayaranMieBiasa.setVisible(true);
        jCheckBox_Pembayaran_Dana_MieBiasa.setVisible(true);
        jCheckBox_Pembayaran_Ovo_Miebiasa.setVisible(true);
        jCheckBox_Pembayaran_Gopay_MieBiasa.setVisible(true);
        jCheckBox_Pembayaran_Shopepay_MieBiasa.setVisible(true);
        jCheckBox_Pembayaran_Langsung_MieBiasa.setVisible(true);
        // Mematikan 
        jButton_MieBiasa.setVisible(false);
        jPanel_JikaPilihMakananMiebiasa.setVisible(false);
        // Mematikan Semua Panel
        jPanel_JikaDiaMemilihMakananMieTelur.setVisible(false);
        jPanel_JikaMemilihMakananSosTeng.setVisible(false);
        jPanel_JikaDiaMemilihMakananNasiGoreng.setVisible(false);
        jPanel_JikaDiaMemilihMakananKwetiawGoreng.setVisible(false);
        jPanel_JikaDiaMemilihMinumanKopi.setVisible(false);
        jPanel_JikaDiaMemilihMinumanEsTeh.setVisible(false);
        jPanel_JikaDiaMemilihMinumanAirMineral.setVisible(false);
        jPanel_JikaDiaMemilihMinumanCocaCola.setVisible(false);
        jPanel_JikaDiaMemilihMinumanSprite.setVisible(false);
    }//GEN-LAST:event_jButton_MieBiasaActionPerformed

    private void jButton_PesanMilihMieGorengTelurActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_PesanMilihMieGorengTelurActionPerformed
//        JOptionPane.showMessageDialog(this, "Pesanan Anda Sedang Dibuat, Mohon Untuk Membayar Di Kasir. \n\n\n                                       Terima Kasih");
        jPanel_JikaDiaPesanMieTelur.setVisible(true);
        jButton_BackPembayaranMieTelur.setVisible(true);
        jButton_BeliSekarangPembayaranMieTelur.setVisible(true);
        jCheckBox_Pembayaran_Dana_MieTelur.setVisible(true);
        jCheckBox_Pembayaran_Ovo_MieTelur.setVisible(true);
        jCheckBox_Pembayaran_Gopay_MieTelur.setVisible(true);
        jCheckBox_Pembayaran_Shopepay_MieTelur.setVisible(true);
        jCheckBox_Pembayaran_Langsung_MieTelur.setVisible(true);
        // Mematikan 
        jButton_Back.setVisible(false);
        jPanel_JikaPilihMakananMiebiasa.setVisible(false);
        // Mematikan Semua Panel
        jPanel_JikaDiaMemilihMakananMieTelur.setVisible(false);
        jPanel_JikaMemilihMakananSosTeng.setVisible(false);
        jPanel_JikaDiaMemilihMakananNasiGoreng.setVisible(false);
        jPanel_JikaDiaMemilihMakananKwetiawGoreng.setVisible(false);
        jPanel_JikaDiaMemilihMinumanKopi.setVisible(false);
        jPanel_JikaDiaMemilihMinumanEsTeh.setVisible(false);
        jPanel_JikaDiaMemilihMinumanAirMineral.setVisible(false);
        jPanel_JikaDiaMemilihMinumanCocaCola.setVisible(false);
        jPanel_JikaDiaMemilihMinumanSprite.setVisible(false);
    }//GEN-LAST:event_jButton_PesanMilihMieGorengTelurActionPerformed

    private void jButton_PesanMilihSosTengActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_PesanMilihSosTengActionPerformed
//        JOptionPane.showMessageDialog(this, "Pesanan Anda Sedang Dibuat, Mohon Untuk Membayar Di Kasir. \n\n\n                                       Terima Kasih");
        jPanel_JikaDiaPesanSosTeng.setVisible(true);
        jButton_BackPembayaranSosteng.setVisible(true);
        jButton_BeliSekarangPembayaranSosteng.setVisible(true);
        jCheckBox_Pembayaran_Dana_Sosteng.setVisible(true);
        jCheckBox_Pembayaran_Ovo_Sosteng.setVisible(true);
        jCheckBox_Pembayaran_Gopay_Sosteng.setVisible(true);
        jCheckBox_Pembayaran_Shopepay_Sosteng.setVisible(true);
        jCheckBox_Pembayaran_Langsung_Sosteng.setVisible(true);
        // Mematikan 
        jButton_BackMilihSosTeng.setVisible(false);
        jPanel_JikaPilihMakananMiebiasa.setVisible(false);
        // Mematikan Semua Panel
        jPanel_JikaDiaMemilihMakananMieTelur.setVisible(false);
        jPanel_JikaMemilihMakananSosTeng.setVisible(false);
        jPanel_JikaDiaMemilihMakananNasiGoreng.setVisible(false);
        jPanel_JikaDiaMemilihMakananKwetiawGoreng.setVisible(false);
        jPanel_JikaDiaMemilihMinumanKopi.setVisible(false);
        jPanel_JikaDiaMemilihMinumanEsTeh.setVisible(false);
        jPanel_JikaDiaMemilihMinumanAirMineral.setVisible(false);
        jPanel_JikaDiaMemilihMinumanCocaCola.setVisible(false);
        jPanel_JikaDiaMemilihMinumanSprite.setVisible(false);
    }//GEN-LAST:event_jButton_PesanMilihSosTengActionPerformed

    private void jButton_PesanMilihNasiGorengActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_PesanMilihNasiGorengActionPerformed
//        JOptionPane.showMessageDialog(this, "Pesanan Anda Sedang Dibuat, Mohon Untuk Membayar Di Kasir. \n\n\n                                       Terima Kasih");
        jPanel_JikaDiaPesanNasiGoreng.setVisible(true);
        jButton_BackPembayaranNasiGoreng.setVisible(true);
        jButton_BeliSekarangPembayaranNasiGoreng.setVisible(true);
        jCheckBox_Pembayaran_Dana_NasiGoreng.setVisible(true);
        jCheckBox_Pembayaran_Ovo_NasiGoreng.setVisible(true);
        jCheckBox_Pembayaran_Gopay_NasiGoreng.setVisible(true);
        jCheckBox_Pembayaran_Shopepay_NasiGoreng.setVisible(true);
        jCheckBox_Pembayaran_Langsung_NasiGoreng.setVisible(true);
        // Mematikan 
        jButton_BackMilihNasiGoreng.setVisible(false);
        jPanel_JikaPilihMakananMiebiasa.setVisible(false);
        // Mematikan Semua Panel
        jPanel_JikaDiaMemilihMakananMieTelur.setVisible(false);
        jPanel_JikaMemilihMakananSosTeng.setVisible(false);
        jPanel_JikaDiaMemilihMakananNasiGoreng.setVisible(false);
        jPanel_JikaDiaMemilihMakananKwetiawGoreng.setVisible(false);
        jPanel_JikaDiaMemilihMinumanKopi.setVisible(false);
        jPanel_JikaDiaMemilihMinumanEsTeh.setVisible(false);
        jPanel_JikaDiaMemilihMinumanAirMineral.setVisible(false);
        jPanel_JikaDiaMemilihMinumanCocaCola.setVisible(false);
        jPanel_JikaDiaMemilihMinumanSprite.setVisible(false);
    }//GEN-LAST:event_jButton_PesanMilihNasiGorengActionPerformed

    private void jButton_PesanMilihKwetiawGorengActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_PesanMilihKwetiawGorengActionPerformed
//        JOptionPane.showMessageDialog(this, "Pesanan Anda Sedang Dibuat, Mohon Untuk Membayar Di Kasir. \n\n\n                                       Terima Kasih");
        jPanel_JikaDiaPesanKwetiawGoreng.setVisible(true);
        jButton_BackPembayaranKwetiawGoreng.setVisible(true);
        jButton_BeliSekarangPembayaranKwetiawGoreng.setVisible(true);
        jCheckBox_Pembayaran_Dana_KwetiawGoreng.setVisible(true);
        jCheckBox_Pembayaran_Ovo_KwetiawGoreng.setVisible(true);
        jCheckBox_Pembayaran_Gopay_KwetiawGoreng.setVisible(true);
        jCheckBox_Pembayaran_Shopepay_KwetiawGoreng.setVisible(true);
        jCheckBox_Pembayaran_Langsung_KwetiawGoreng.setVisible(true);
        // Mematikan 
        jButton_BackMilihKwetiawGoreng.setVisible(false);
        jPanel_JikaPilihMakananMiebiasa.setVisible(false);
        // Mematikan Semua Panel
        jPanel_JikaDiaMemilihMakananMieTelur.setVisible(false);
        jPanel_JikaMemilihMakananSosTeng.setVisible(false);
        jPanel_JikaDiaMemilihMakananNasiGoreng.setVisible(false);
        jPanel_JikaDiaMemilihMakananKwetiawGoreng.setVisible(false);
        jPanel_JikaDiaMemilihMinumanKopi.setVisible(false);
        jPanel_JikaDiaMemilihMinumanEsTeh.setVisible(false);
        jPanel_JikaDiaMemilihMinumanAirMineral.setVisible(false);
        jPanel_JikaDiaMemilihMinumanCocaCola.setVisible(false);
        jPanel_JikaDiaMemilihMinumanSprite.setVisible(false);
    }//GEN-LAST:event_jButton_PesanMilihKwetiawGorengActionPerformed

    private void jButton_Pesan_MinumanKopiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Pesan_MinumanKopiActionPerformed
//        JOptionPane.showMessageDialog(this, "Pesanan Anda Sedang Dibuat, Mohon Untuk Membayar Di Kasir. \n\n\n                                       Terima Kasih");
        jPanel_JikaDiaPesanKopi.setVisible(true);
        jButton_BackPembayaranKopi.setVisible(true);
        jButton_BeliSekarangPembayaranKopi.setVisible(true);
        jCheckBox_Pembayaran_Dana_Kopi.setVisible(true);
        jCheckBox_Pembayaran_Ovo_Kopi.setVisible(true);
        jCheckBox_Pembayaran_Gopay_Kopi.setVisible(true);
        jCheckBox_Pembayaran_Shopepay_Kopi.setVisible(true);
        jCheckBox_Pembayaran_Langsung_Kopi.setVisible(true);
        // Mematikan 
        jButton_Back_MinumanKopi.setVisible(false);
        jPanel_JikaPilihMakananMiebiasa.setVisible(false);
        // Mematikan Semua Panel
        jPanel_JikaDiaMemilihMakananMieTelur.setVisible(false);
        jPanel_JikaMemilihMakananSosTeng.setVisible(false);
        jPanel_JikaDiaMemilihMakananNasiGoreng.setVisible(false);
        jPanel_JikaDiaMemilihMakananKwetiawGoreng.setVisible(false);
        jPanel_JikaDiaMemilihMinumanKopi.setVisible(false);
        jPanel_JikaDiaMemilihMinumanEsTeh.setVisible(false);
        jPanel_JikaDiaMemilihMinumanAirMineral.setVisible(false);
        jPanel_JikaDiaMemilihMinumanCocaCola.setVisible(false);
        jPanel_JikaDiaMemilihMinumanSprite.setVisible(false);
    }//GEN-LAST:event_jButton_Pesan_MinumanKopiActionPerformed

    private void jButton_Pesan_MinumanEsTehActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Pesan_MinumanEsTehActionPerformed
//        JOptionPane.showMessageDialog(this, "Pesanan Anda Sedang Dibuat, Mohon Untuk Membayar Di Kasir. \n\n\n                                       Terima Kasih");
        jPanel_JikaDiaPesanEsTeh.setVisible(true);
        jButton_BackPembayaranEsTeh.setVisible(true);
        jButton_BeliSekarangPembayaranEsTeh.setVisible(true);
        jCheckBox_Pembayaran_Dana_EsTeh.setVisible(true);
        jCheckBox_Pembayaran_Ovo_EsTeh.setVisible(true);
        jCheckBox_Pembayaran_Gopay_EsTeh.setVisible(true);
        jCheckBox_Pembayaran_Shopepay_EsTeh.setVisible(true);
        jCheckBox_Pembayaran_Langsung_EsTeh.setVisible(true);
        // Mematikan 
        jButton_Back_MinumanEsTeh.setVisible(false);
        jPanel_JikaPilihMakananMiebiasa.setVisible(false);
        // Mematikan Semua Panel
        jPanel_JikaDiaMemilihMakananMieTelur.setVisible(false);
        jPanel_JikaMemilihMakananSosTeng.setVisible(false);
        jPanel_JikaDiaMemilihMakananNasiGoreng.setVisible(false);
        jPanel_JikaDiaMemilihMakananKwetiawGoreng.setVisible(false);
        jPanel_JikaDiaMemilihMinumanKopi.setVisible(false);
        jPanel_JikaDiaMemilihMinumanEsTeh.setVisible(false);
        jPanel_JikaDiaMemilihMinumanAirMineral.setVisible(false);
        jPanel_JikaDiaMemilihMinumanCocaCola.setVisible(false);
        jPanel_JikaDiaMemilihMinumanSprite.setVisible(false);
    }//GEN-LAST:event_jButton_Pesan_MinumanEsTehActionPerformed

    private void jButton_Pesan_MinumanAirMineralActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Pesan_MinumanAirMineralActionPerformed
//        JOptionPane.showMessageDialog(this, "Pesanan Anda Sedang Dibuat, Mohon Untuk Membayar Di Kasir. \n\n\n                                       Terima Kasih");
        jPanel_JikaDiaPesanAirMineral.setVisible(true);
        jButton_BackPembayaranAirMineral.setVisible(true);
        jButton_BeliSekarangPembayaranAirMineral.setVisible(true);
        jCheckBox_Pembayaran_Dana_AirMineral.setVisible(true);
        jCheckBox_Pembayaran_Ovo_AirMineral.setVisible(true);
        jCheckBox_Pembayaran_Gopay_AirMineral.setVisible(true);
        jCheckBox_Pembayaran_Shopepay_AirMineral.setVisible(true);
        jCheckBox_Pembayaran_Langsung_AirMineral.setVisible(true);
        // Mematikan 
        jButton_Back_MinumanAirMineral.setVisible(false);
        jPanel_JikaPilihMakananMiebiasa.setVisible(false);
        // Mematikan Semua Panel
        jPanel_JikaDiaMemilihMakananMieTelur.setVisible(false);
        jPanel_JikaMemilihMakananSosTeng.setVisible(false);
        jPanel_JikaDiaMemilihMakananNasiGoreng.setVisible(false);
        jPanel_JikaDiaMemilihMakananKwetiawGoreng.setVisible(false);
        jPanel_JikaDiaMemilihMinumanKopi.setVisible(false);
        jPanel_JikaDiaMemilihMinumanEsTeh.setVisible(false);
        jPanel_JikaDiaMemilihMinumanAirMineral.setVisible(false);
        jPanel_JikaDiaMemilihMinumanCocaCola.setVisible(false);
        jPanel_JikaDiaMemilihMinumanSprite.setVisible(false);
    }//GEN-LAST:event_jButton_Pesan_MinumanAirMineralActionPerformed

    private void jButton_Pesan_MinumanCocaColaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Pesan_MinumanCocaColaActionPerformed
//        JOptionPane.showMessageDialog(this, "Pesanan Anda Sedang Dibuat, Mohon Untuk Membayar Di Kasir. \n\n\n                                       Terima Kasih");
        jPanel_JikaDiaPesanCocaCola.setVisible(true);
        jButton_BackPembayaranCocaCola.setVisible(true);
        jButton_BeliSekarangPembayaranCocaCola.setVisible(true);
        jCheckBox_Pembayaran_Dana_CocaCola.setVisible(true);
        jCheckBox_Pembayaran_Ovo_CocaCola.setVisible(true);
        jCheckBox_Pembayaran_Gopay_CocaCola.setVisible(true);
        jCheckBox_Pembayaran_Shopepay_CocaCola.setVisible(true);
        jCheckBox_Pembayaran_Langsung_CocaCola.setVisible(true);
        // Mematikan 
        jButton_Back_MinumanCocaCola.setVisible(false);
        jPanel_JikaPilihMakananMiebiasa.setVisible(false);
        // Mematikan Semua Panel
        jPanel_JikaDiaMemilihMakananMieTelur.setVisible(false);
        jPanel_JikaMemilihMakananSosTeng.setVisible(false);
        jPanel_JikaDiaMemilihMakananNasiGoreng.setVisible(false);
        jPanel_JikaDiaMemilihMakananKwetiawGoreng.setVisible(false);
        jPanel_JikaDiaMemilihMinumanKopi.setVisible(false);
        jPanel_JikaDiaMemilihMinumanEsTeh.setVisible(false);
        jPanel_JikaDiaMemilihMinumanAirMineral.setVisible(false);
        jPanel_JikaDiaMemilihMinumanCocaCola.setVisible(false);
        jPanel_JikaDiaMemilihMinumanSprite.setVisible(false);
    }//GEN-LAST:event_jButton_Pesan_MinumanCocaColaActionPerformed

    private void jButton_Pesan_MinumanSpriteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Pesan_MinumanSpriteActionPerformed
//        JOptionPane.showMessageDialog(this, "Pesanan Anda Sedang Dibuat, Mohon Untuk Membayar Di Kasir. \n\n\n                                       Terima Kasih");
        jPanel_JikaDiaPesanSprite.setVisible(true);
        jButton_BackPembayaranSprite.setVisible(true);
        jButton_BeliSekarangPembayaranSprite.setVisible(true);
        jCheckBox_Pembayaran_Dana_Sprite.setVisible(true);
        jCheckBox_Pembayaran_Ovo_Sprite.setVisible(true);
        jCheckBox_Pembayaran_Gopay_Sprite.setVisible(true);
        jCheckBox_Pembayaran_Shopepay_Sprite.setVisible(true);
        jCheckBox_Pembayaran_Langsung_Sprite.setVisible(true);
        // Mematikan 
        jButton_Back_MinumanSprite.setVisible(false);
        jPanel_JikaPilihMakananMiebiasa.setVisible(false);
        // Mematikan Semua Panel
        jPanel_JikaDiaMemilihMakananMieTelur.setVisible(false);
        jPanel_JikaMemilihMakananSosTeng.setVisible(false);
        jPanel_JikaDiaMemilihMakananNasiGoreng.setVisible(false);
        jPanel_JikaDiaMemilihMakananKwetiawGoreng.setVisible(false);
        jPanel_JikaDiaMemilihMinumanKopi.setVisible(false);
        jPanel_JikaDiaMemilihMinumanEsTeh.setVisible(false);
        jPanel_JikaDiaMemilihMinumanAirMineral.setVisible(false);
        jPanel_JikaDiaMemilihMinumanCocaCola.setVisible(false);
        jPanel_JikaDiaMemilihMinumanSprite.setVisible(false);
    }//GEN-LAST:event_jButton_Pesan_MinumanSpriteActionPerformed

    private void jLabel_GameMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_GameMenuMouseClicked
        jPanel_Game.setVisible(true);
        jPanel_Home.setVisible(false);
        jPanel_Order.setVisible(false);
        jPanel_Waktu.setVisible(false);
        // Mengubah tulisan Game menjadi warna putih
        jLabel_Tulisan_Game.setForeground(Color.white);
        jLabel_Tulisan_Home.setForeground(new Color(0,0,0));
        jLabel_Tulisan_Order.setForeground(new Color(0,0,0));
        jLabel_Tulisan_Waktu.setForeground(new Color(0,0,0));
    }//GEN-LAST:event_jLabel_GameMenuMouseClicked

    private void jLabel_NetflixMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_NetflixMouseClicked
        Desktop browser_Netflix = Desktop.getDesktop();
        try {
            browser_Netflix.browse(new URI("https://www.netflix.com/browse"));
            
        } catch (IOException err) {
        
        } catch (URISyntaxException err) {
            
        }
    }//GEN-LAST:event_jLabel_NetflixMouseClicked

    private void jLabel_ChromeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_ChromeMouseClicked
        Desktop browser_Chrome = Desktop.getDesktop();
        try {
            browser_Chrome.open(new File("C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe"));
            
        } catch (IOException err) {
            
        }
    }//GEN-LAST:event_jLabel_ChromeMouseClicked

    private void jLabel_DiscordMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_DiscordMouseClicked
        Desktop browser_Discord = Desktop.getDesktop();
        try {
            browser_Discord.open(new File("C:\\Users\\Reyhan Al Farel\\AppData\\Local\\Discord\\app-1.0.9013\\Discord.exe"));
            
        } catch(IOException err) {
            
        }
    }//GEN-LAST:event_jLabel_DiscordMouseClicked

    private void jLabel_SteamMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_SteamMouseClicked
        Desktop browser_Steam = Desktop.getDesktop();
        try {
            browser_Steam.open(new File("C:\\Program Files (x86)\\Steam\\steam.exe"));
            
        } catch (IOException err) {
            
        }
    }//GEN-LAST:event_jLabel_SteamMouseClicked

    private void jLabel_TiktokMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_TiktokMouseClicked
        Desktop browser_Tiktok = Desktop.getDesktop();
        try {
            browser_Tiktok.browse(new URI("https://www.tiktok.com/foryou"));
            
        } catch (IOException err) {
            
        } catch (URISyntaxException err) {
            
        }
    }//GEN-LAST:event_jLabel_TiktokMouseClicked

    private void jLabel_SpotifyMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_SpotifyMouseClicked
        Desktop browser_Spotify = Desktop.getDesktop();
        try {
            browser_Spotify.browse(new URI("https://open.spotify.com/"));
            
        } catch (IOException err) {
            
        } catch (URISyntaxException err) {
            
        }
    }//GEN-LAST:event_jLabel_SpotifyMouseClicked

    private void jLabel_AmongUsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_AmongUsMouseClicked
        Desktop  browser_AmongUs = Desktop.getDesktop();
        try {
            browser_AmongUs.browse(new URI("https://store.steampowered.com/app/945360/Among_Us/"));
            
        } catch (IOException err) {
            
        } catch (URISyntaxException err) {
            
        }
    }//GEN-LAST:event_jLabel_AmongUsMouseClicked

    private void jLabel_DcMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_DcMouseClicked
        jLabel_DiscordMouseClicked(evt);
    }//GEN-LAST:event_jLabel_DcMouseClicked

    private void jLabel_AgeOfEmpire2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_AgeOfEmpire2MouseClicked
        Desktop browser_AgeOfEmpire = Desktop.getDesktop();
        try {
            browser_AgeOfEmpire.browse(new URI("https://store.steampowered.com/app/813780/Age_of_Empires_II_Definitive_Edition/"));
            
        } catch (IOException err) {
            
        } catch (URISyntaxException err) {
            
        }
    }//GEN-LAST:event_jLabel_AgeOfEmpire2MouseClicked

    private void jLabel_Battlefield3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_Battlefield3MouseClicked
        Desktop browser_BattleField3 = Desktop.getDesktop();
        try {
            browser_BattleField3.browse(new URI("https://store.steampowered.com/app/1238820/Battlefield_3/"));
            
        } catch (IOException err) {
            
        } catch (URISyntaxException err) {
            
        }
    }//GEN-LAST:event_jLabel_Battlefield3MouseClicked

    private void jLabel_GtaSAMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_GtaSAMouseClicked
        Desktop browser_GtaSanAndreas = Desktop.getDesktop();
        try {
            browser_GtaSanAndreas.browse(new URI("https://www.rockstargames.com/games/sanandreas"));
            
        } catch (IOException err) {
            
        } catch (URISyntaxException err) {
            
        }
    }//GEN-LAST:event_jLabel_GtaSAMouseClicked

    private void jLabel_NoxMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_NoxMouseClicked
        Desktop browser_Nox = Desktop.getDesktop();
        try {
            browser_Nox.browse(new URI("https://www.bignox.com/"));
            
        } catch (IOException err) {
            
        } catch (URISyntaxException err) {
            
        }
    }//GEN-LAST:event_jLabel_NoxMouseClicked

    private void jLabel_WarcraftMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_WarcraftMouseClicked
        Desktop browser_Warcraft = Desktop.getDesktop();
        try {
            browser_Warcraft.browse(new URI("https://warcraft-3-the-frozen-throne.en.softonic.com/?ex=DINS-635.3"));
            
        } catch (IOException err) {
            
        } catch (URISyntaxException err) {
            
        }
    }//GEN-LAST:event_jLabel_WarcraftMouseClicked

    private void jLabel_CodmMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_CodmMouseClicked
        Desktop browser_CodM = Desktop.getDesktop();
        try {
            browser_CodM.browse(new URI("https://play.google.com/store/apps/details?id=com.garena.game.codm&hl=id&gl=US"));
            
        } catch (IOException err) {
            
        } catch (URISyntaxException err) {
            
        }
    }//GEN-LAST:event_jLabel_CodmMouseClicked

    private void jLabel_LdPlayer9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_LdPlayer9MouseClicked
        Desktop browser_LdPlayer9 = Desktop.getDesktop();
        try {
            browser_LdPlayer9.browse(new URI("https://id.ldplayer.net/"));
            
        } catch (IOException err) {
            
        } catch (URISyntaxException err) {
            
        }
    }//GEN-LAST:event_jLabel_LdPlayer9MouseClicked

    private void jLabel_ApexLegendsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_ApexLegendsMouseClicked
        Desktop browser_ApexLegends = Desktop.getDesktop();
        try {
            browser_ApexLegends.browse(new URI("https://store.steampowered.com/app/1172470/Apex_Legends/"));
            
        } catch (IOException err) {
            
        } catch (URISyntaxException err) {
            
        }
    }//GEN-LAST:event_jLabel_ApexLegendsMouseClicked

    private void jLabel_GameLoopMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_GameLoopMouseClicked
        Desktop browser_GameLoop = Desktop.getDesktop();
        try {
            browser_GameLoop.browse(new URI("https://www.gameloop.com/"));
            
        } catch (IOException err) {
            
        } catch (URISyntaxException err) {
            
        }
    }//GEN-LAST:event_jLabel_GameLoopMouseClicked

    private void jLabel_FortniteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_FortniteMouseClicked
        Desktop browser_Fortnite = Desktop.getDesktop();
        try {
            browser_Fortnite.browse(new URI("https://store.epicgames.com/en-US/p/fortnite"));
            
        } catch (IOException err) {
            
        } catch (URISyntaxException err) {
            
        }
    }//GEN-LAST:event_jLabel_FortniteMouseClicked

    private void jLabel_EuroTruck2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_EuroTruck2MouseClicked
        Desktop browser_EuroTruck2 = Desktop.getDesktop();
        try {
            browser_EuroTruck2.browse(new URI("https://store.steampowered.com/app/227300/Euro_Truck_Simulator_2/"));
            
        } catch (IOException err) {
            
        } catch (URISyntaxException err) {
            
        }
    }//GEN-LAST:event_jLabel_EuroTruck2MouseClicked

    private void jLabel_Left4dead2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_Left4dead2MouseClicked
        Desktop browser_Left4Dead2 = Desktop.getDesktop();
        try {
            browser_Left4Dead2.browse(new URI("https://store.steampowered.com/app/550/Left_4_Dead_2/"));
            
        } catch (IOException err) {
            
        } catch (URISyntaxException err) {
            
        }
    }//GEN-LAST:event_jLabel_Left4dead2MouseClicked

    private void jLabel_CsgoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_CsgoMouseClicked
        Desktop browser_Csgo = Desktop.getDesktop();
        try {
            browser_Csgo.browse(new URI("https://store.steampowered.com/app/730/CounterStrike_Global_Offensive/"));
            
        } catch (IOException err) {
            
        } catch (URISyntaxException err) {
            
        }
    }//GEN-LAST:event_jLabel_CsgoMouseClicked

    private void jLabel_NetbeansMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_NetbeansMouseClicked
        Desktop browser_Netbeans =  Desktop.getDesktop();
        try {
            browser_Netbeans.open(new File("C:\\Program Files\\NetBeans-17\\netbeans\\bin\\netbeans.exe"));
            
        } catch (IOException err) {
            
        }
    }//GEN-LAST:event_jLabel_NetbeansMouseClicked

    private void jLabel_lostsagaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_lostsagaMouseClicked
        Desktop browser_LostSaga = Desktop.getDesktop();
        try {
            browser_LostSaga.browse(new URI("https://lostsaga.gnjoy.id/"));
            
        } catch (IOException err) {
            
        } catch (URISyntaxException err) {
            
        }
    }//GEN-LAST:event_jLabel_lostsagaMouseClicked

    private void jLabel_MotoGp2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_MotoGp2MouseClicked
        Desktop browser_MotoGp2 = Desktop.getDesktop();
        try {
            browser_MotoGp2.browse(new URI("https://www.nesabamedia.com/download-motogp-2/"));
            
        } catch (IOException err) {
            
        } catch (URISyntaxException err) {
            
        }
    }//GEN-LAST:event_jLabel_MotoGp2MouseClicked

    private void jLabel_MotoGp3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_MotoGp3MouseClicked
        Desktop browser_MotoGp3 = Desktop.getDesktop();
        try {
            browser_MotoGp3.browse(new URI("https://www.apunkagames.biz/2013/12/motogp-3-urt-game.html"));
            
        } catch (IOException err) {
            
        } catch (URISyntaxException err) {
            
        }
    }//GEN-LAST:event_jLabel_MotoGp3MouseClicked

    private void jLabel_LolMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_LolMouseClicked
        Desktop browser_Lol = Desktop.getDesktop();
        try {
            browser_Lol.browse(new URI("https://www.leagueoflegends.com/en-sg/"));
            
        } catch (IOException err) {
            
        } catch (URISyntaxException err) {
            
        }
    }//GEN-LAST:event_jLabel_LolMouseClicked

    private void jLabel_ValorantMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_ValorantMouseClicked
        Desktop browser_Valorant = Desktop.getDesktop();
        try {
            browser_Valorant.open(new File("C:\\Riot Games\\Riot Client\\RiotClientServices.exe"));
            
        } catch (IOException err) {
            
        }
    }//GEN-LAST:event_jLabel_ValorantMouseClicked

    private void jLabel_Dota2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_Dota2MouseClicked
        jLabel_SteamMouseClicked(evt);
    }//GEN-LAST:event_jLabel_Dota2MouseClicked

    private void jLabel_Destiny2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_Destiny2MouseClicked
        Desktop browser_Destiny2 = Desktop.getDesktop();
        try {
            browser_Destiny2.browse(new URI("https://store.steampowered.com/app/1085660/Destiny_2/"));
            
        } catch (IOException err) {
            
        } catch (URISyntaxException err) {
            
        }
    }//GEN-LAST:event_jLabel_Destiny2MouseClicked

    private void jLabel_NetflixAllGamesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_NetflixAllGamesMouseClicked
        jLabel_NetflixMouseClicked(evt);
    }//GEN-LAST:event_jLabel_NetflixAllGamesMouseClicked

    private void jLabel_GTAVMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_GTAVMouseClicked
        Desktop browser_GtaV = Desktop.getDesktop();
        try {
            browser_GtaV.browse(new URI("https://store.steampowered.com/app/271590/Grand_Theft_Auto_V/"));
            
        } catch (IOException err) {
            
        } catch (URISyntaxException err) {
            
        }
    }//GEN-LAST:event_jLabel_GTAVMouseClicked

    private void jLabel_VisualStudioCodeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_VisualStudioCodeMouseClicked
        Desktop browser_VisualStudioCode = Desktop.getDesktop();
        try {
            browser_VisualStudioCode.open(new File("C:\\Users\\Reyhan Al Farel\\AppData\\Local\\Programs\\Microsoft VS Code\\Code.exe"));
            
        } catch (IOException err) {
            
        } 
    }//GEN-LAST:event_jLabel_VisualStudioCodeMouseClicked

    private void jLabel_WhatsappMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_WhatsappMouseClicked
        Desktop browser_WhatsApp = Desktop.getDesktop();
        try {
            browser_WhatsApp.browse(new URI("https://web.whatsapp.com/"));
            
        } catch (IOException err) {
            
        } catch (URISyntaxException err) {
            
        }
    }//GEN-LAST:event_jLabel_WhatsappMouseClicked

    private void jLabel_SteamAllGamesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_SteamAllGamesMouseClicked
        jLabel_SteamMouseClicked(evt);
    }//GEN-LAST:event_jLabel_SteamAllGamesMouseClicked

    private void jLabel_OnlineGames_AmongUsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_OnlineGames_AmongUsMouseClicked
        jLabel_AmongUsMouseClicked(evt);
    }//GEN-LAST:event_jLabel_OnlineGames_AmongUsMouseClicked

    private void jLabel_OnlineGames_CSGOMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_OnlineGames_CSGOMouseClicked
        jLabel_CsgoMouseClicked(evt);
    }//GEN-LAST:event_jLabel_OnlineGames_CSGOMouseClicked

    private void jLabel_OnlineGames_ApexLegendsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_OnlineGames_ApexLegendsMouseClicked
        jLabel_ApexLegendsMouseClicked(evt);
    }//GEN-LAST:event_jLabel_OnlineGames_ApexLegendsMouseClicked

    private void jLabel_OnlineGames_CODMMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_OnlineGames_CODMMouseClicked
        jLabel_CodmMouseClicked(evt);
    }//GEN-LAST:event_jLabel_OnlineGames_CODMMouseClicked

    private void jLabel_OnlineGames_Destiny2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_OnlineGames_Destiny2MouseClicked
        jLabel_Destiny2MouseClicked(evt);
    }//GEN-LAST:event_jLabel_OnlineGames_Destiny2MouseClicked

    private void jLabel_OnlineGames_Dota2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_OnlineGames_Dota2MouseClicked
        jLabel_Dota2MouseClicked(evt);
    }//GEN-LAST:event_jLabel_OnlineGames_Dota2MouseClicked

    private void jLabel_OnlineGames_FortniteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_OnlineGames_FortniteMouseClicked
        jLabel_FortniteMouseClicked(evt);
    }//GEN-LAST:event_jLabel_OnlineGames_FortniteMouseClicked

    private void jLabel_OnlineGames_Left4Dead2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_OnlineGames_Left4Dead2MouseClicked
        jLabel_Left4dead2MouseClicked(evt);
    }//GEN-LAST:event_jLabel_OnlineGames_Left4Dead2MouseClicked

    private void jLabel_OnlineGames_LostsagaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_OnlineGames_LostsagaMouseClicked
        jLabel_lostsagaMouseClicked(evt);
    }//GEN-LAST:event_jLabel_OnlineGames_LostsagaMouseClicked

    private void jLabel_OnlineGames_EuroTruck2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_OnlineGames_EuroTruck2MouseClicked
        jLabel_EuroTruck2MouseClicked(evt);
    }//GEN-LAST:event_jLabel_OnlineGames_EuroTruck2MouseClicked

    private void jLabel_OnlineGames_GTAVMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_OnlineGames_GTAVMouseClicked
        jLabel_GTAVMouseClicked(evt);
    }//GEN-LAST:event_jLabel_OnlineGames_GTAVMouseClicked

    private void jLabel_OnlineGames_ValorantMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_OnlineGames_ValorantMouseClicked
        jLabel_ValorantMouseClicked(evt);
    }//GEN-LAST:event_jLabel_OnlineGames_ValorantMouseClicked

    private void jLabel_OnlineGames_LOLMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_OnlineGames_LOLMouseClicked
        jLabel_LolMouseClicked(evt);
    }//GEN-LAST:event_jLabel_OnlineGames_LOLMouseClicked

    private void jLabel_OnlineGames_SteamMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_OnlineGames_SteamMouseClicked
        jLabel_SteamMouseClicked(evt);
    }//GEN-LAST:event_jLabel_OnlineGames_SteamMouseClicked

    private void jLabel_OfflineGTASAMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_OfflineGTASAMouseClicked
        jLabel_GtaSAMouseClicked(evt);
    }//GEN-LAST:event_jLabel_OfflineGTASAMouseClicked

    private void jLabel_OfflineBattleField3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_OfflineBattleField3MouseClicked
        jLabel_Battlefield3MouseClicked(evt);
    }//GEN-LAST:event_jLabel_OfflineBattleField3MouseClicked

    private void jLabel_OfflineAgeOfEmpire2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_OfflineAgeOfEmpire2MouseClicked
        jLabel_AgeOfEmpire2MouseClicked(evt);
    }//GEN-LAST:event_jLabel_OfflineAgeOfEmpire2MouseClicked

    private void jLabel_OfflineGTAVMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_OfflineGTAVMouseClicked
        jLabel_GTAVMouseClicked(evt);
    }//GEN-LAST:event_jLabel_OfflineGTAVMouseClicked

    private void jLabel_OfflineMotoGp2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_OfflineMotoGp2MouseClicked
        jLabel_MotoGp2MouseClicked(evt);
    }//GEN-LAST:event_jLabel_OfflineMotoGp2MouseClicked

    private void jLabel_OfflineMotoGp3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_OfflineMotoGp3MouseClicked
        jLabel_MotoGp3MouseClicked(evt);
    }//GEN-LAST:event_jLabel_OfflineMotoGp3MouseClicked

    private void jLabel_AndroidGameLoopMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_AndroidGameLoopMouseClicked
        jLabel_GameLoopMouseClicked(evt);
    }//GEN-LAST:event_jLabel_AndroidGameLoopMouseClicked

    private void jLabel_AndroidLdGameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_AndroidLdGameMouseClicked
        jLabel_LdPlayer9MouseClicked(evt);
    }//GEN-LAST:event_jLabel_AndroidLdGameMouseClicked

    private void jLabel_AndroidNoxMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_AndroidNoxMouseClicked
        jLabel_NoxMouseClicked(evt);
    }//GEN-LAST:event_jLabel_AndroidNoxMouseClicked

    private void jButton_BackPembayaranMieBiasaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_BackPembayaranMieBiasaActionPerformed
        jPanel_JikaPilihMakananMiebiasa.setVisible(true);
        jButton_MieBiasa.setVisible(true);
        // Mematikan Semua Panel, Kecuali Header , Makanan Dan Minuman
        jPanel_JikaDiaMemilihMakananMieTelur.setVisible(false);
        jPanel_JikaMemilihMakananSosTeng.setVisible(false);
        jPanel_JikaDiaMemilihMakananNasiGoreng.setVisible(false);
        jPanel_JikaDiaMemilihMakananKwetiawGoreng.setVisible(false);
        jPanel_JikaDiaMemilihMinumanKopi.setVisible(false);
        jPanel_JikaDiaMemilihMinumanEsTeh.setVisible(false);
        jPanel_JikaDiaMemilihMinumanAirMineral.setVisible(false);
        jPanel_JikaDiaMemilihMinumanCocaCola.setVisible(false);
        jPanel_JikaDiaMemilihMinumanSprite.setVisible(false);
        jPanel_HeaderOrder.setVisible(false);
        jPanel_Minuman.setVisible(false);
        jPanel_Makanan.setVisible(false);
        //
        jPanel_JikaDiaPesanMieBiasa.setVisible(false);
        jButton_BackPembayaranMieBiasa.setVisible(false);
        jTextField_Pembayaran_Dana_MieBiasa.setVisible(false);
        jTextField_Pembayaran_Ovo_MieBiasa.setVisible(false);
        jTextField_Pembayaran_Gopay_MieBiasa.setVisible(false);
        jTextField_Pembayaran_Shopepay_MieBiasa.setVisible(false);
        jButton_BeliSekarangPembayaranMieBiasa.setVisible(false);
        jTextField_Pembayaran_Langsung_MieBiasa.setVisible(false);
        
        // Mematikan Checkbox bila sudah memencet back
        jCheckBox_Pembayaran_Dana_MieBiasa.setSelected(false);
        jCheckBox_Pembayaran_Ovo_Miebiasa.setSelected(false);
        jCheckBox_Pembayaran_Gopay_MieBiasa.setSelected(false);
        jCheckBox_Pembayaran_Shopepay_MieBiasa.setSelected(false);
        jCheckBox_Pembayaran_Langsung_MieBiasa.setSelected(false);
    }//GEN-LAST:event_jButton_BackPembayaranMieBiasaActionPerformed

    private void jCheckBox_Pembayaran_Dana_MieBiasaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox_Pembayaran_Dana_MieBiasaActionPerformed
        jTextField_Pembayaran_Dana_MieBiasa.setVisible(false);
        
        String harga_Dana_MieBiasa = jTextField_HargaMieBiasa.getText();
        jTextField_Pembayaran_Dana_MieBiasa.setText(harga_Dana_MieBiasa);
        
        if (jCheckBox_Pembayaran_Dana_MieBiasa.isSelected()) {
            jTextField_Pembayaran_Dana_MieBiasa.setVisible(true);
        }
    }//GEN-LAST:event_jCheckBox_Pembayaran_Dana_MieBiasaActionPerformed

    private void jCheckBox_Pembayaran_Ovo_MiebiasaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox_Pembayaran_Ovo_MiebiasaActionPerformed
        jTextField_Pembayaran_Ovo_MieBiasa.setVisible(false);
        
        String harga_Ovo_MieBiasa = jTextField_HargaMieBiasa.getText();
        jTextField_Pembayaran_Ovo_MieBiasa.setText(harga_Ovo_MieBiasa);
        
        if (jCheckBox_Pembayaran_Ovo_Miebiasa.isSelected()) {
            jTextField_Pembayaran_Ovo_MieBiasa.setVisible(true);
        }
    }//GEN-LAST:event_jCheckBox_Pembayaran_Ovo_MiebiasaActionPerformed

    private void jCheckBox_Pembayaran_Gopay_MieBiasaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox_Pembayaran_Gopay_MieBiasaActionPerformed
        jTextField_Pembayaran_Gopay_MieBiasa.setVisible(false);
        
        String harga_Gopay_MieBiasa = jTextField_HargaMieBiasa.getText();
        jTextField_Pembayaran_Gopay_MieBiasa.setText(harga_Gopay_MieBiasa);
        
        if (jCheckBox_Pembayaran_Gopay_MieBiasa.isSelected()) {
            jTextField_Pembayaran_Gopay_MieBiasa.setVisible(true);
        }
    }//GEN-LAST:event_jCheckBox_Pembayaran_Gopay_MieBiasaActionPerformed

    private void jCheckBox_Pembayaran_Shopepay_MieBiasaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox_Pembayaran_Shopepay_MieBiasaActionPerformed
        jTextField_Pembayaran_Shopepay_MieBiasa.setVisible(false);
        
        String harga_Shopepay_MieBiasa = jTextField_HargaMieBiasa.getText();
        jTextField_Pembayaran_Shopepay_MieBiasa.setText(harga_Shopepay_MieBiasa);
        
        if (jCheckBox_Pembayaran_Shopepay_MieBiasa.isSelected()) {
            jTextField_Pembayaran_Shopepay_MieBiasa.setVisible(true);
        }
    }//GEN-LAST:event_jCheckBox_Pembayaran_Shopepay_MieBiasaActionPerformed

    private void jCheckBox_Pembayaran_Langsung_MieBiasaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox_Pembayaran_Langsung_MieBiasaActionPerformed
        jTextField_Pembayaran_Langsung_MieBiasa.setVisible(false);
        
        String harga_Langsung_MieBiasa = jTextField_HargaMieBiasa.getText();
        jTextField_Pembayaran_Langsung_MieBiasa.setText(harga_Langsung_MieBiasa);
        
        if (jCheckBox_Pembayaran_Langsung_MieBiasa.isSelected()) {
            jTextField_Pembayaran_Langsung_MieBiasa.setVisible(true);
        }
    }//GEN-LAST:event_jCheckBox_Pembayaran_Langsung_MieBiasaActionPerformed

    private void jButton_BeliSekarangPembayaranMieBiasaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_BeliSekarangPembayaranMieBiasaActionPerformed
        String Harga_MieBiasa = jTextField_HargaMieBiasa.getText();
        String nama_User = jLabel_Username.getText();
        
        if (jCheckBox_Pembayaran_Dana_MieBiasa.isSelected()) {
            int notif_Dana_MieBiasa = JOptionPane.showConfirmDialog(this, "Silahkan Konfirmasi Pembayaran Anda , Total : "+Harga_MieBiasa);
            switch (notif_Dana_MieBiasa) {
                case JOptionPane.YES_OPTION -> {
                    Desktop dana = Desktop.getDesktop();
                    try {
                        dana.browse(new URI("https://www.dana.id/"));
                        System.out.println("Pembayaran "+nama_User+" Berhasil");
                        JOptionPane.showMessageDialog(this, "Terima Kasih Sudah Membayar, Pesanan Anda Akan Diantar");
                    } catch (IOException err) {
            
                    } catch (URISyntaxException err) {
            
                    }
                }
                case JOptionPane.NO_OPTION -> {
                    ;
                    JOptionPane.showMessageDialog(this, "Jadi Beli Gk Nih?");
                }
            }
        } else if (jCheckBox_Pembayaran_Ovo_Miebiasa.isSelected()){
            int notif_Ovo_MieBiasa = JOptionPane.showConfirmDialog(this, "Silahkan Konfirmasi Pembayaran Anda , Total : "+Harga_MieBiasa);
            switch (notif_Ovo_MieBiasa) {
                case JOptionPane.YES_OPTION -> {
                    Desktop ovo = Desktop.getDesktop();
                    try {
                        ovo.browse(new URI("https://www.ovo.id/"));
                        System.out.println("Pembayaran "+nama_User+" Berhasil");
                        JOptionPane.showMessageDialog(this, "Terima Kasih Sudah Membayar, Pesanan Anda Akan Diantar");
                    } catch (IOException err) {
            
                    } catch (URISyntaxException err) {
            
                    }
                }
                case JOptionPane.NO_OPTION -> {
                    ;
                    JOptionPane.showMessageDialog(this, "Jadi Beli Gk Nih?");
                }
            }
        } else if (jCheckBox_Pembayaran_Gopay_MieBiasa.isSelected()) {
            int notif_Gopay_MieBiasa = JOptionPane.showConfirmDialog(this, "Silahkan Konfirmasi Pembayaran Anda , Total : "+Harga_MieBiasa);
            switch (notif_Gopay_MieBiasa) {
                case JOptionPane.YES_OPTION -> {
                    Desktop gopay = Desktop.getDesktop();
                    try {
                        gopay.browse(new URI("https://gopay.co.id/"));
                        System.out.println("Pembayaran "+nama_User+" Berhasil");
                        JOptionPane.showMessageDialog(this, "Terima Kasih Sudah Membayar, Pesanan Anda Akan Diantar");
                    } catch (IOException err) {
            
                    } catch (URISyntaxException err) {
            
                    }
                }
                case JOptionPane.NO_OPTION -> {
                    ;
                    JOptionPane.showMessageDialog(this, "Jadi Beli Gk Nih?");
                }
            }      
        } else if (jCheckBox_Pembayaran_Shopepay_MieBiasa.isSelected()) {
            int notif_Shopepay_MieBiasa = JOptionPane.showConfirmDialog(this, "Silahkan Konfirmasi Pembayaran Anda , Total : "+Harga_MieBiasa);
            switch (notif_Shopepay_MieBiasa) {
                case JOptionPane.YES_OPTION -> {
                    Desktop shopepay = Desktop.getDesktop();
                    try {
                        shopepay.browse(new URI("https://shopeepay.co.id/"));
                        System.out.println("Pembayaran "+nama_User+" Berhasil");
                        JOptionPane.showMessageDialog(this, "Terima Kasih Sudah Membayar, Pesanan Anda Akan Diantar");
                    } catch (IOException err) {
            
                    } catch (URISyntaxException err) {
            
                    }
                }
                case JOptionPane.NO_OPTION -> {
                    ;
                    JOptionPane.showMessageDialog(this, "Jadi Beli Gk Nih?");
                }
            }
        } else if (jCheckBox_Pembayaran_Langsung_MieBiasa.isSelected()) {            
            JOptionPane.showMessageDialog(this, "Silahkan Untuk Membayar Di Kasir Dengan Total : "+Harga_MieBiasa);
        } else {
            JOptionPane.showMessageDialog(this, "Anda Harus Memilih Salah Satu");
        }
    }//GEN-LAST:event_jButton_BeliSekarangPembayaranMieBiasaActionPerformed

    private void jButton_BackPembayaranMieTelurActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_BackPembayaranMieTelurActionPerformed
        jPanel_JikaDiaMemilihMakananMieTelur.setVisible(true);
        jButton_Back.setVisible(true);
        // Mematikan Semua Panel, Kecuali Header , Makanan Dan Minuman
        jPanel_JikaPilihMakananMiebiasa.setVisible(false);
        jPanel_JikaMemilihMakananSosTeng.setVisible(false);
        jPanel_JikaDiaMemilihMakananNasiGoreng.setVisible(false);
        jPanel_JikaDiaMemilihMakananKwetiawGoreng.setVisible(false);
        jPanel_JikaDiaMemilihMinumanKopi.setVisible(false);
        jPanel_JikaDiaMemilihMinumanEsTeh.setVisible(false);
        jPanel_JikaDiaMemilihMinumanAirMineral.setVisible(false);
        jPanel_JikaDiaMemilihMinumanCocaCola.setVisible(false);
        jPanel_JikaDiaMemilihMinumanSprite.setVisible(false);
        jPanel_HeaderOrder.setVisible(false);
        jPanel_Minuman.setVisible(false);
        jPanel_Makanan.setVisible(false);
        //
        jPanel_JikaDiaPesanMieTelur.setVisible(false);
        jButton_BackPembayaranMieTelur.setVisible(false);
        jTextField_Pembayaran_Dana_MieTelur.setVisible(false);
        jTextField_Pembayaran_Ovo_MieTelur.setVisible(false);
        jTextField_Pembayaran_Gopay_MieTelur.setVisible(false);
        jTextField_Pembayaran_Shopepay_MieTelur.setVisible(false);
        jButton_BeliSekarangPembayaranMieTelur.setVisible(false);
        jTextField_Pembayaran_Langsung_MieTelur.setVisible(false);
        
        // Mematikan Checkbox bila mencet back
        jCheckBox_Pembayaran_Dana_MieTelur.setSelected(false);
        jCheckBox_Pembayaran_Ovo_MieTelur.setSelected(false);
        jCheckBox_Pembayaran_Gopay_MieTelur.setSelected(false);
        jCheckBox_Pembayaran_Shopepay_MieTelur.setSelected(false);
        jCheckBox_Pembayaran_Langsung_MieTelur.setSelected(false);
    }//GEN-LAST:event_jButton_BackPembayaranMieTelurActionPerformed

    private void jCheckBox_Pembayaran_Dana_MieTelurActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox_Pembayaran_Dana_MieTelurActionPerformed
        jTextField_Pembayaran_Dana_MieTelur.setVisible(false);
        
        String harga_Dana_MieTelur = jTextField_MilihMieGorengTelur_Harga.getText();
        jTextField_Pembayaran_Dana_MieTelur.setText(harga_Dana_MieTelur);
        
        if (jCheckBox_Pembayaran_Dana_MieTelur.isSelected()) {
            jTextField_Pembayaran_Dana_MieTelur.setVisible(true);
        }
    }//GEN-LAST:event_jCheckBox_Pembayaran_Dana_MieTelurActionPerformed

    private void jCheckBox_Pembayaran_Ovo_MieTelurActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox_Pembayaran_Ovo_MieTelurActionPerformed
        jTextField_Pembayaran_Ovo_MieTelur.setVisible(false);
        
        String harga_Ovo_MieTelur = jTextField_MilihMieGorengTelur_Harga.getText();
        jTextField_Pembayaran_Ovo_MieTelur.setText(harga_Ovo_MieTelur);
        
        if (jCheckBox_Pembayaran_Ovo_MieTelur.isSelected()) {
            jTextField_Pembayaran_Ovo_MieTelur.setVisible(true);
        }
    }//GEN-LAST:event_jCheckBox_Pembayaran_Ovo_MieTelurActionPerformed

    private void jCheckBox_Pembayaran_Gopay_MieTelurActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox_Pembayaran_Gopay_MieTelurActionPerformed
        jTextField_Pembayaran_Gopay_MieTelur.setVisible(false);
        
        String harga_Gopay_MieTelur = jTextField_MilihMieGorengTelur_Harga.getText();
        jTextField_Pembayaran_Gopay_MieTelur.setText(harga_Gopay_MieTelur);
        
        if (jCheckBox_Pembayaran_Gopay_MieTelur.isSelected()) {
            jTextField_Pembayaran_Gopay_MieTelur.setVisible(true);
        }
    }//GEN-LAST:event_jCheckBox_Pembayaran_Gopay_MieTelurActionPerformed

    private void jCheckBox_Pembayaran_Shopepay_MieTelurActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox_Pembayaran_Shopepay_MieTelurActionPerformed
        jTextField_Pembayaran_Shopepay_MieTelur.setVisible(false);
        
        String harga_Shopepay_MieTelur = jTextField_MilihMieGorengTelur_Harga.getText();
        jTextField_Pembayaran_Shopepay_MieTelur.setText(harga_Shopepay_MieTelur);
        
        if (jCheckBox_Pembayaran_Shopepay_MieTelur.isSelected()) {
            jTextField_Pembayaran_Shopepay_MieTelur.setVisible(true);
        }
    }//GEN-LAST:event_jCheckBox_Pembayaran_Shopepay_MieTelurActionPerformed

    private void jCheckBox_Pembayaran_Langsung_MieTelurActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox_Pembayaran_Langsung_MieTelurActionPerformed
        jTextField_Pembayaran_Langsung_MieTelur.setVisible(false);
        
        String harga_Langsung_MieTelur = jTextField_MilihMieGorengTelur_Harga.getText();
        jTextField_Pembayaran_Langsung_MieTelur.setText(harga_Langsung_MieTelur);
        
        if (jCheckBox_Pembayaran_Langsung_MieTelur.isSelected()) {
            jTextField_Pembayaran_Langsung_MieTelur.setVisible(true);
        }
    }//GEN-LAST:event_jCheckBox_Pembayaran_Langsung_MieTelurActionPerformed

    private void jButton_BeliSekarangPembayaranMieTelurActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_BeliSekarangPembayaranMieTelurActionPerformed
        String Harga_MieTelur = jTextField_MilihMieGorengTelur_Harga.getText();
        String nama_User = jLabel_Username.getText();
        
        if (jCheckBox_Pembayaran_Dana_MieTelur.isSelected()) {
            int notif_Dana_MieTelur = JOptionPane.showConfirmDialog(this, "Silahkan Konfirmasi Pembayaran Anda , Total : "+Harga_MieTelur);
            switch (notif_Dana_MieTelur) {
                case JOptionPane.YES_OPTION -> {
                    Desktop dana = Desktop.getDesktop();
                    try {
                        dana.browse(new URI("https://www.dana.id/"));
                        System.out.println("Pembayaran "+nama_User+" Berhasil");
                        JOptionPane.showMessageDialog(this, "Terima Kasih Sudah Membayar, Pesanan Anda Akan Diantar");
                    } catch (IOException err) {
            
                    } catch (URISyntaxException err) {
            
                    }
                }
                case JOptionPane.NO_OPTION -> {
                    ;
                    JOptionPane.showMessageDialog(this, "Jadi Beli Gk Nih?");
                }
            }
        } else if (jCheckBox_Pembayaran_Ovo_MieTelur.isSelected()){
            int notif_Ovo_MieTelur = JOptionPane.showConfirmDialog(this, "Silahkan Konfirmasi Pembayaran Anda , Total : "+Harga_MieTelur);
            switch (notif_Ovo_MieTelur) {
                case JOptionPane.YES_OPTION -> {
                    Desktop ovo = Desktop.getDesktop();
                    try {
                        ovo.browse(new URI("https://www.ovo.id/"));
                        System.out.println("Pembayaran "+nama_User+" Berhasil");
                        JOptionPane.showMessageDialog(this, "Terima Kasih Sudah Membayar, Pesanan Anda Akan Diantar");
                    } catch (IOException err) {
            
                    } catch (URISyntaxException err) {
            
                    }
                }
                case JOptionPane.NO_OPTION -> {
                    ;
                    JOptionPane.showMessageDialog(this, "Jadi Beli Gk Nih?");
                }
            }
        } else if (jCheckBox_Pembayaran_Gopay_MieTelur.isSelected()) {
            int notif_Gopay_MieTelur = JOptionPane.showConfirmDialog(this, "Silahkan Konfirmasi Pembayaran Anda , Total : "+Harga_MieTelur);
            switch (notif_Gopay_MieTelur) {
                case JOptionPane.YES_OPTION -> {
                    Desktop gopay = Desktop.getDesktop();
                    try {
                        gopay.browse(new URI("https://gopay.co.id/"));
                        System.out.println("Pembayaran "+nama_User+" Berhasil");
                        JOptionPane.showMessageDialog(this, "Terima Kasih Sudah Membayar, Pesanan Anda Akan Diantar");
                    } catch (IOException err) {
            
                    } catch (URISyntaxException err) {
            
                    }
                }
                case JOptionPane.NO_OPTION -> {
                    ;
                    JOptionPane.showMessageDialog(this, "Jadi Beli Gk Nih?");
                }
            }      
        } else if (jCheckBox_Pembayaran_Shopepay_MieTelur.isSelected()) {
            int notif_Shopepay_MieTelur = JOptionPane.showConfirmDialog(this, "Silahkan Konfirmasi Pembayaran Anda , Total : "+Harga_MieTelur);
            switch (notif_Shopepay_MieTelur) {
                case JOptionPane.YES_OPTION -> {
                    Desktop shopepay = Desktop.getDesktop();
                    try {
                        shopepay.browse(new URI("https://shopeepay.co.id/"));
                        System.out.println("Pembayaran "+nama_User+" Berhasil");
                        JOptionPane.showMessageDialog(this, "Terima Kasih Sudah Membayar, Pesanan Anda Akan Diantar");
                    } catch (IOException err) {
            
                    } catch (URISyntaxException err) {
            
                    }
                }
                case JOptionPane.NO_OPTION -> {
                    ;
                    JOptionPane.showMessageDialog(this, "Jadi Beli Gk Nih?");
                }
            }
        } else if (jCheckBox_Pembayaran_Langsung_MieTelur.isSelected()) {            
            JOptionPane.showMessageDialog(this, "Silahkan Untuk Membayar Di Kasir Dengan Total : "+Harga_MieTelur);
        } else {
            JOptionPane.showMessageDialog(this, "Anda Harus Memilih Salah Satu");
        }
    }//GEN-LAST:event_jButton_BeliSekarangPembayaranMieTelurActionPerformed

    private void jButton_BackPembayaranSostengActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_BackPembayaranSostengActionPerformed
        jPanel_JikaMemilihMakananSosTeng.setVisible(true);
        jButton_BackMilihSosTeng.setVisible(true);
        // Mematikan Semua Panel, Kecuali Header , Makanan Dan Minuman
        jPanel_JikaPilihMakananMiebiasa.setVisible(false);
        jPanel_JikaDiaMemilihMakananMieTelur.setVisible(false);
        jPanel_JikaDiaMemilihMakananNasiGoreng.setVisible(false);
        jPanel_JikaDiaMemilihMakananKwetiawGoreng.setVisible(false);
        jPanel_JikaDiaMemilihMinumanKopi.setVisible(false);
        jPanel_JikaDiaMemilihMinumanEsTeh.setVisible(false);
        jPanel_JikaDiaMemilihMinumanAirMineral.setVisible(false);
        jPanel_JikaDiaMemilihMinumanCocaCola.setVisible(false);
        jPanel_JikaDiaMemilihMinumanSprite.setVisible(false);
        jPanel_HeaderOrder.setVisible(false);
        jPanel_Minuman.setVisible(false);
        jPanel_Makanan.setVisible(false);
        //
        jPanel_JikaDiaPesanSosTeng.setVisible(false);
        jButton_BackPembayaranSosteng.setVisible(false);
        jTextField_Pembayaran_Dana_Sosteng.setVisible(false);
        jTextField_Pembayaran_Ovo_Sosteng.setVisible(false);
        jTextField_Pembayaran_Gopay_Sosteng.setVisible(false);
        jTextField_Pembayaran_Shopepay_Sosteng.setVisible(false);
        jButton_BeliSekarangPembayaranSosteng.setVisible(false);
        jTextField_Pembayaran_Langsung_Sosteng.setVisible(false);
        
        // Mematikan checkBox bila sudah pencet back
        jCheckBox_Pembayaran_Dana_Sosteng.setSelected(false);
        jCheckBox_Pembayaran_Ovo_Sosteng.setSelected(false);
        jCheckBox_Pembayaran_Gopay_Sosteng.setSelected(false);
        jCheckBox_Pembayaran_Shopepay_Sosteng.setSelected(false);
        jCheckBox_Pembayaran_Langsung_Sosteng.setSelected(false);
    }//GEN-LAST:event_jButton_BackPembayaranSostengActionPerformed

    private void jCheckBox_Pembayaran_Dana_SostengActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox_Pembayaran_Dana_SostengActionPerformed
        jTextField_Pembayaran_Dana_Sosteng.setVisible(false);
        
        String harga_Dana_Sosteng = jTextField_HargaMilihSosTeng.getText();
        jTextField_Pembayaran_Dana_Sosteng.setText(harga_Dana_Sosteng);
        
        if (jCheckBox_Pembayaran_Dana_Sosteng.isSelected()) {
            jTextField_Pembayaran_Dana_Sosteng.setVisible(true);
        }
    }//GEN-LAST:event_jCheckBox_Pembayaran_Dana_SostengActionPerformed

    private void jCheckBox_Pembayaran_Ovo_SostengActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox_Pembayaran_Ovo_SostengActionPerformed
        jTextField_Pembayaran_Ovo_Sosteng.setVisible(false);
        
        String harga_Ovo_Sosteng = jTextField_HargaMilihSosTeng.getText();
        jTextField_Pembayaran_Ovo_Sosteng.setText(harga_Ovo_Sosteng);
        
        if (jCheckBox_Pembayaran_Ovo_Sosteng.isSelected()) {
            jTextField_Pembayaran_Ovo_Sosteng.setVisible(true);
        }
    }//GEN-LAST:event_jCheckBox_Pembayaran_Ovo_SostengActionPerformed

    private void jCheckBox_Pembayaran_Gopay_SostengActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox_Pembayaran_Gopay_SostengActionPerformed
        jTextField_Pembayaran_Gopay_Sosteng.setVisible(false);
        
        String harga_Gopay_Sosteng = jTextField_HargaMilihSosTeng.getText();
        jTextField_Pembayaran_Gopay_Sosteng.setText(harga_Gopay_Sosteng);
        
        if (jCheckBox_Pembayaran_Gopay_Sosteng.isSelected()) {
            jTextField_Pembayaran_Gopay_Sosteng.setVisible(true);
        }
    }//GEN-LAST:event_jCheckBox_Pembayaran_Gopay_SostengActionPerformed

    private void jCheckBox_Pembayaran_Shopepay_SostengActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox_Pembayaran_Shopepay_SostengActionPerformed
        jTextField_Pembayaran_Shopepay_Sosteng.setVisible(false);
        
        String harga_Shopepay_Sosteng = jTextField_HargaMilihSosTeng.getText();
        jTextField_Pembayaran_Shopepay_Sosteng.setText(harga_Shopepay_Sosteng);
        
        if (jCheckBox_Pembayaran_Shopepay_Sosteng.isSelected()) {
            jTextField_Pembayaran_Shopepay_Sosteng.setVisible(true);
        }
    }//GEN-LAST:event_jCheckBox_Pembayaran_Shopepay_SostengActionPerformed

    private void jCheckBox_Pembayaran_Langsung_SostengActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox_Pembayaran_Langsung_SostengActionPerformed
        jTextField_Pembayaran_Langsung_Sosteng.setVisible(false);
        
        String harga_Langsung_Sosteng = jTextField_HargaMilihSosTeng.getText();
        jTextField_Pembayaran_Langsung_Sosteng.setText(harga_Langsung_Sosteng);
        
        if (jCheckBox_Pembayaran_Langsung_Sosteng.isSelected()) {
            jTextField_Pembayaran_Langsung_Sosteng.setVisible(true);
        }
    }//GEN-LAST:event_jCheckBox_Pembayaran_Langsung_SostengActionPerformed

    private void jButton_BeliSekarangPembayaranSostengActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_BeliSekarangPembayaranSostengActionPerformed
        String Harga_Sosteng = jTextField_HargaMilihSosTeng.getText();
        String nama_User = jLabel_Username.getText();
        
        if (jCheckBox_Pembayaran_Dana_Sosteng.isSelected()) {
            int notif_Dana_Sosteng = JOptionPane.showConfirmDialog(this, "Silahkan Konfirmasi Pembayaran Anda , Total : "+Harga_Sosteng);
            switch (notif_Dana_Sosteng) {
                case JOptionPane.YES_OPTION -> {
                    Desktop dana = Desktop.getDesktop();
                    try {
                        dana.browse(new URI("https://www.dana.id/"));
                        System.out.println("Pembayaran "+nama_User+" Berhasil");
                        JOptionPane.showMessageDialog(this, "Terima Kasih Sudah Membayar, Pesanan Anda Akan Diantar");
                    } catch (IOException err) {
            
                    } catch (URISyntaxException err) {
            
                    }
                }
                case JOptionPane.NO_OPTION -> {
                    ;
                    JOptionPane.showMessageDialog(this, "Jadi Beli Gk Nih?");
                }
            }
        } else if (jCheckBox_Pembayaran_Ovo_Sosteng.isSelected()){
            int notif_Ovo_Sosteng = JOptionPane.showConfirmDialog(this, "Silahkan Konfirmasi Pembayaran Anda , Total : "+Harga_Sosteng);
            switch (notif_Ovo_Sosteng) {
                case JOptionPane.YES_OPTION -> {
                    Desktop ovo = Desktop.getDesktop();
                    try {
                        ovo.browse(new URI("https://www.ovo.id/"));
                        System.out.println("Pembayaran "+nama_User+" Berhasil");
                        JOptionPane.showMessageDialog(this, "Terima Kasih Sudah Membayar, Pesanan Anda Akan Diantar");
                    } catch (IOException err) {
            
                    } catch (URISyntaxException err) {
            
                    }
                }
                case JOptionPane.NO_OPTION -> {
                    ;
                    JOptionPane.showMessageDialog(this, "Jadi Beli Gk Nih?");
                }
            }
        } else if (jCheckBox_Pembayaran_Gopay_Sosteng.isSelected()) {
            int notif_Gopay_Sosteng = JOptionPane.showConfirmDialog(this, "Silahkan Konfirmasi Pembayaran Anda , Total : "+Harga_Sosteng);
            switch (notif_Gopay_Sosteng) {
                case JOptionPane.YES_OPTION -> {
                    Desktop gopay = Desktop.getDesktop();
                    try {
                        gopay.browse(new URI("https://gopay.co.id/"));
                        System.out.println("Pembayaran "+nama_User+" Berhasil");
                        JOptionPane.showMessageDialog(this, "Terima Kasih Sudah Membayar, Pesanan Anda Akan Diantar");
                    } catch (IOException err) {
            
                    } catch (URISyntaxException err) {
            
                    }
                }
                case JOptionPane.NO_OPTION -> {
                    ;
                    JOptionPane.showMessageDialog(this, "Jadi Beli Gk Nih?");
                }
            }      
        } else if (jCheckBox_Pembayaran_Shopepay_Sosteng.isSelected()) {
            int notif_Shopepay_Sosteng = JOptionPane.showConfirmDialog(this, "Silahkan Konfirmasi Pembayaran Anda , Total : "+Harga_Sosteng);
            switch (notif_Shopepay_Sosteng) {
                case JOptionPane.YES_OPTION -> {
                    Desktop shopepay = Desktop.getDesktop();
                    try {
                        shopepay.browse(new URI("https://shopeepay.co.id/"));
                        System.out.println("Pembayaran "+nama_User+" Berhasil");
                        JOptionPane.showMessageDialog(this, "Terima Kasih Sudah Membayar, Pesanan Anda Akan Diantar");
                    } catch (IOException err) {
            
                    } catch (URISyntaxException err) {
            
                    }
                }
                case JOptionPane.NO_OPTION -> {
                    ;
                    JOptionPane.showMessageDialog(this, "Jadi Beli Gk Nih?");
                }
            }
        } else if (jCheckBox_Pembayaran_Langsung_Sosteng.isSelected()) {            
            JOptionPane.showMessageDialog(this, "Silahkan Untuk Membayar Di Kasir Dengan Total : "+Harga_Sosteng);
        } else {
            JOptionPane.showMessageDialog(this, "Anda Harus Memilih Salah Satu");
        }
    }//GEN-LAST:event_jButton_BeliSekarangPembayaranSostengActionPerformed

    private void jButton_BackPembayaranNasiGorengActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_BackPembayaranNasiGorengActionPerformed
        jPanel_JikaDiaMemilihMakananNasiGoreng.setVisible(true);
        jButton_BackMilihNasiGoreng.setVisible(true);
        // Mematikan Semua Panel, Kecuali Header , Makanan Dan Minuman
        jPanel_JikaPilihMakananMiebiasa.setVisible(false);
        jPanel_JikaDiaMemilihMakananMieTelur.setVisible(false);
        jPanel_JikaMemilihMakananSosTeng.setVisible(false);
        jPanel_JikaDiaMemilihMakananKwetiawGoreng.setVisible(false);
        jPanel_JikaDiaMemilihMinumanKopi.setVisible(false);
        jPanel_JikaDiaMemilihMinumanEsTeh.setVisible(false);
        jPanel_JikaDiaMemilihMinumanAirMineral.setVisible(false);
        jPanel_JikaDiaMemilihMinumanCocaCola.setVisible(false);
        jPanel_JikaDiaMemilihMinumanSprite.setVisible(false);
        jPanel_HeaderOrder.setVisible(false);
        jPanel_Minuman.setVisible(false);
        jPanel_Makanan.setVisible(false);
        //
        jPanel_JikaDiaPesanNasiGoreng.setVisible(false);
        jButton_BackPembayaranNasiGoreng.setVisible(false);
        jTextField_Pembayaran_Dana_NasiGoreng.setVisible(false);
        jTextField_Pembayaran_Ovo_NasiGoreng.setVisible(false);
        jTextField_Pembayaran_Gopay_NasiGoreng.setVisible(false);
        jTextField_Pembayaran_Shopepay_NasiGoreng.setVisible(false);
        jButton_BeliSekarangPembayaranNasiGoreng.setVisible(false);
        jTextField_Pembayaran_Langsung_NasiGoreng.setVisible(false);
        
        // Mematikan checkBox bila sudah pencet back
        jCheckBox_Pembayaran_Dana_NasiGoreng.setSelected(false);
        jCheckBox_Pembayaran_Ovo_NasiGoreng.setSelected(false);
        jCheckBox_Pembayaran_Gopay_NasiGoreng.setSelected(false);
        jCheckBox_Pembayaran_Shopepay_NasiGoreng.setSelected(false);
        jCheckBox_Pembayaran_Langsung_NasiGoreng.setSelected(false);
    }//GEN-LAST:event_jButton_BackPembayaranNasiGorengActionPerformed

    private void jCheckBox_Pembayaran_Dana_NasiGorengActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox_Pembayaran_Dana_NasiGorengActionPerformed
        jTextField_Pembayaran_Dana_NasiGoreng.setVisible(false);
        
        String harga_Dana_NasiGoreng = jTextField_HargaMilihNasiGoreng.getText();
        jTextField_Pembayaran_Dana_NasiGoreng.setText(harga_Dana_NasiGoreng);
        
        if (jCheckBox_Pembayaran_Dana_NasiGoreng.isSelected()) {
            jTextField_Pembayaran_Dana_NasiGoreng.setVisible(true);
        }
    }//GEN-LAST:event_jCheckBox_Pembayaran_Dana_NasiGorengActionPerformed

    private void jCheckBox_Pembayaran_Ovo_NasiGorengActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox_Pembayaran_Ovo_NasiGorengActionPerformed
        jTextField_Pembayaran_Ovo_NasiGoreng.setVisible(false);
        
        String harga_Ovo_NasiGoreng = jTextField_HargaMilihNasiGoreng.getText();
        jTextField_Pembayaran_Ovo_NasiGoreng.setText(harga_Ovo_NasiGoreng);
        
        if (jCheckBox_Pembayaran_Ovo_NasiGoreng.isSelected()) {
            jTextField_Pembayaran_Ovo_NasiGoreng.setVisible(true);
        }
    }//GEN-LAST:event_jCheckBox_Pembayaran_Ovo_NasiGorengActionPerformed

    private void jCheckBox_Pembayaran_Gopay_NasiGorengActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox_Pembayaran_Gopay_NasiGorengActionPerformed
        jTextField_Pembayaran_Gopay_NasiGoreng.setVisible(false);
        
        String harga_Gopay_NasiGoreng = jTextField_HargaMilihNasiGoreng.getText();
        jTextField_Pembayaran_Gopay_NasiGoreng.setText(harga_Gopay_NasiGoreng);
        
        if (jCheckBox_Pembayaran_Gopay_NasiGoreng.isSelected()) {
            jTextField_Pembayaran_Gopay_NasiGoreng.setVisible(true);
        }
    }//GEN-LAST:event_jCheckBox_Pembayaran_Gopay_NasiGorengActionPerformed

    private void jCheckBox_Pembayaran_Shopepay_NasiGorengActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox_Pembayaran_Shopepay_NasiGorengActionPerformed
        jTextField_Pembayaran_Shopepay_NasiGoreng.setVisible(false);
        
        String harga_Shopepay_NasiGoreng = jTextField_HargaMilihNasiGoreng.getText();
        jTextField_Pembayaran_Shopepay_NasiGoreng.setText(harga_Shopepay_NasiGoreng);
        
        if (jCheckBox_Pembayaran_Shopepay_NasiGoreng.isSelected()) {
            jTextField_Pembayaran_Shopepay_NasiGoreng.setVisible(true);
        }
    }//GEN-LAST:event_jCheckBox_Pembayaran_Shopepay_NasiGorengActionPerformed

    private void jCheckBox_Pembayaran_Langsung_NasiGorengActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox_Pembayaran_Langsung_NasiGorengActionPerformed
        jTextField_Pembayaran_Langsung_NasiGoreng.setVisible(false);
        
        String harga_Langsung_NasiGoreng = jTextField_HargaMilihNasiGoreng.getText();
        jTextField_Pembayaran_Langsung_NasiGoreng.setText(harga_Langsung_NasiGoreng);
        
        if (jCheckBox_Pembayaran_Langsung_NasiGoreng.isSelected()) {
            jTextField_Pembayaran_Langsung_NasiGoreng.setVisible(true);
        }
    }//GEN-LAST:event_jCheckBox_Pembayaran_Langsung_NasiGorengActionPerformed

    private void jButton_BeliSekarangPembayaranNasiGorengActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_BeliSekarangPembayaranNasiGorengActionPerformed
        String Harga_NasiGoreng = jTextField_HargaMilihNasiGoreng.getText();
        String nama_User = jLabel_Username.getText();
        
        if (jCheckBox_Pembayaran_Dana_NasiGoreng.isSelected()) {
            int notif_Dana_NasiGoreng = JOptionPane.showConfirmDialog(this, "Silahkan Konfirmasi Pembayaran Anda , Total : "+Harga_NasiGoreng);
            switch (notif_Dana_NasiGoreng) {
                case JOptionPane.YES_OPTION -> {
                    Desktop dana = Desktop.getDesktop();
                    try {
                        dana.browse(new URI("https://www.dana.id/"));
                        System.out.println("Pembayaran "+nama_User+" Berhasil");
                        JOptionPane.showMessageDialog(this, "Terima Kasih Sudah Membayar, Pesanan Anda Akan Diantar");
                    } catch (IOException err) {
            
                    } catch (URISyntaxException err) {
            
                    }
                }
                case JOptionPane.NO_OPTION -> {
                    ;
                    JOptionPane.showMessageDialog(this, "Jadi Beli Gk Nih?");
                }
            }
        } else if (jCheckBox_Pembayaran_Ovo_NasiGoreng.isSelected()){
            int notif_Ovo_NasiGoreng = JOptionPane.showConfirmDialog(this, "Silahkan Konfirmasi Pembayaran Anda , Total : "+Harga_NasiGoreng);
            switch (notif_Ovo_NasiGoreng) {
                case JOptionPane.YES_OPTION -> {
                    Desktop ovo = Desktop.getDesktop();
                    try {
                        ovo.browse(new URI("https://www.ovo.id/"));
                        System.out.println("Pembayaran "+nama_User+" Berhasil");
                        JOptionPane.showMessageDialog(this, "Terima Kasih Sudah Membayar, Pesanan Anda Akan Diantar");
                    } catch (IOException err) {
            
                    } catch (URISyntaxException err) {
            
                    }
                }
                case JOptionPane.NO_OPTION -> {
                    ;
                    JOptionPane.showMessageDialog(this, "Jadi Beli Gk Nih?");
                }
            }
        } else if (jCheckBox_Pembayaran_Gopay_NasiGoreng.isSelected()) {
            int notif_Gopay_NasiGoreng = JOptionPane.showConfirmDialog(this, "Silahkan Konfirmasi Pembayaran Anda , Total : "+Harga_NasiGoreng);
            switch (notif_Gopay_NasiGoreng) {
                case JOptionPane.YES_OPTION -> {
                    Desktop gopay = Desktop.getDesktop();
                    try {
                        gopay.browse(new URI("https://gopay.co.id/"));
                        System.out.println("Pembayaran "+nama_User+" Berhasil");
                        JOptionPane.showMessageDialog(this, "Terima Kasih Sudah Membayar, Pesanan Anda Akan Diantar");
                    } catch (IOException err) {
            
                    } catch (URISyntaxException err) {
            
                    }
                }
                case JOptionPane.NO_OPTION -> {
                    ;
                    JOptionPane.showMessageDialog(this, "Jadi Beli Gk Nih?");
                }
            }      
        } else if (jCheckBox_Pembayaran_Shopepay_NasiGoreng.isSelected()) {
            int notif_Shopepay_NasiGoreng = JOptionPane.showConfirmDialog(this, "Silahkan Konfirmasi Pembayaran Anda , Total : "+Harga_NasiGoreng);
            switch (notif_Shopepay_NasiGoreng) {
                case JOptionPane.YES_OPTION -> {
                    Desktop shopepay = Desktop.getDesktop();
                    try {
                        shopepay.browse(new URI("https://shopeepay.co.id/"));
                        System.out.println("Pembayaran "+nama_User+" Berhasil");
                        JOptionPane.showMessageDialog(this, "Terima Kasih Sudah Membayar, Pesanan Anda Akan Diantar");
                    } catch (IOException err) {
            
                    } catch (URISyntaxException err) {
            
                    }
                }
                case JOptionPane.NO_OPTION -> {
                    ;
                    JOptionPane.showMessageDialog(this, "Jadi Beli Gk Nih?");
                }
            }
        } else if (jCheckBox_Pembayaran_Langsung_NasiGoreng.isSelected()) {            
            JOptionPane.showMessageDialog(this, "Silahkan Untuk Membayar Di Kasir Dengan Total : "+Harga_NasiGoreng);
        } else {
            JOptionPane.showMessageDialog(this, "Anda Harus Memilih Salah Satu");
        }
    }//GEN-LAST:event_jButton_BeliSekarangPembayaranNasiGorengActionPerformed

    private void jButton_BackPembayaranKwetiawGorengActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_BackPembayaranKwetiawGorengActionPerformed
        jPanel_JikaDiaMemilihMakananKwetiawGoreng.setVisible(true);
        jButton_BackMilihKwetiawGoreng.setVisible(true);
        // Mematikan Semua Panel, Kecuali Header , Makanan Dan Minuman
        jPanel_JikaPilihMakananMiebiasa.setVisible(false);
        jPanel_JikaDiaMemilihMakananMieTelur.setVisible(false);
        jPanel_JikaMemilihMakananSosTeng.setVisible(false);
        jPanel_JikaDiaMemilihMakananNasiGoreng.setVisible(false);
        jPanel_JikaDiaMemilihMinumanKopi.setVisible(false);
        jPanel_JikaDiaMemilihMinumanEsTeh.setVisible(false);
        jPanel_JikaDiaMemilihMinumanAirMineral.setVisible(false);
        jPanel_JikaDiaMemilihMinumanCocaCola.setVisible(false);
        jPanel_JikaDiaMemilihMinumanSprite.setVisible(false);
        jPanel_HeaderOrder.setVisible(false);
        jPanel_Minuman.setVisible(false);
        jPanel_Makanan.setVisible(false);
        //
        jPanel_JikaDiaPesanKwetiawGoreng.setVisible(false);
        jButton_BackPembayaranKwetiawGoreng.setVisible(false);
        jTextField_Pembayaran_Dana_KwetiawGoreng.setVisible(false);
        jTextField_Pembayaran_Ovo_KwetiawGoreng.setVisible(false);
        jTextField_Pembayaran_Gopay_KwetiawGoreng.setVisible(false);
        jTextField_Pembayaran_Shopepay_KwetiawGoreng.setVisible(false);
        jButton_BeliSekarangPembayaranKwetiawGoreng.setVisible(false);
        jTextField_Pembayaran_Langsung_KwetiawGoreng.setVisible(false);
        
        // Mematikan checkBox bila sudah pencet back
        jCheckBox_Pembayaran_Dana_KwetiawGoreng.setSelected(false);
        jCheckBox_Pembayaran_Ovo_KwetiawGoreng.setSelected(false);
        jCheckBox_Pembayaran_Gopay_KwetiawGoreng.setSelected(false);
        jCheckBox_Pembayaran_Shopepay_KwetiawGoreng.setSelected(false);
        jCheckBox_Pembayaran_Langsung_KwetiawGoreng.setSelected(false);
    }//GEN-LAST:event_jButton_BackPembayaranKwetiawGorengActionPerformed

    private void jCheckBox_Pembayaran_Dana_KwetiawGorengActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox_Pembayaran_Dana_KwetiawGorengActionPerformed
        jTextField_Pembayaran_Dana_KwetiawGoreng.setVisible(false);
        
        String harga_Dana_KwetiawGoreng = jTextField_HargaMilihKwetiawGoreng.getText();
        jTextField_Pembayaran_Dana_KwetiawGoreng.setText(harga_Dana_KwetiawGoreng);
        
        if (jCheckBox_Pembayaran_Dana_KwetiawGoreng.isSelected()) {
            jTextField_Pembayaran_Dana_KwetiawGoreng.setVisible(true);
        }
    }//GEN-LAST:event_jCheckBox_Pembayaran_Dana_KwetiawGorengActionPerformed

    private void jCheckBox_Pembayaran_Ovo_KwetiawGorengActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox_Pembayaran_Ovo_KwetiawGorengActionPerformed
        jTextField_Pembayaran_Ovo_KwetiawGoreng.setVisible(false);
        
        String harga_Ovo_KwetiawGoreng = jTextField_HargaMilihKwetiawGoreng.getText();
        jTextField_Pembayaran_Ovo_KwetiawGoreng.setText(harga_Ovo_KwetiawGoreng);
        
        if (jCheckBox_Pembayaran_Ovo_KwetiawGoreng.isSelected()) {
            jTextField_Pembayaran_Ovo_KwetiawGoreng.setVisible(true);
        }
    }//GEN-LAST:event_jCheckBox_Pembayaran_Ovo_KwetiawGorengActionPerformed

    private void jCheckBox_Pembayaran_Gopay_KwetiawGorengActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox_Pembayaran_Gopay_KwetiawGorengActionPerformed
        jTextField_Pembayaran_Gopay_KwetiawGoreng.setVisible(false);
        
        String harga_Gopay_KwetiawGoreng = jTextField_HargaMilihKwetiawGoreng.getText();
        jTextField_Pembayaran_Gopay_KwetiawGoreng.setText(harga_Gopay_KwetiawGoreng);
        
        if (jCheckBox_Pembayaran_Gopay_KwetiawGoreng.isSelected()) {
            jTextField_Pembayaran_Gopay_KwetiawGoreng.setVisible(true);
        }
    }//GEN-LAST:event_jCheckBox_Pembayaran_Gopay_KwetiawGorengActionPerformed

    private void jCheckBox_Pembayaran_Shopepay_KwetiawGorengActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox_Pembayaran_Shopepay_KwetiawGorengActionPerformed
        jTextField_Pembayaran_Shopepay_KwetiawGoreng.setVisible(false);
        
        String harga_Shopepay_KwetiawGoreng = jTextField_HargaMilihKwetiawGoreng.getText();
        jTextField_Pembayaran_Shopepay_KwetiawGoreng.setText(harga_Shopepay_KwetiawGoreng);
        
        if (jCheckBox_Pembayaran_Shopepay_KwetiawGoreng.isSelected()) {
            jTextField_Pembayaran_Shopepay_KwetiawGoreng.setVisible(true);
        }
    }//GEN-LAST:event_jCheckBox_Pembayaran_Shopepay_KwetiawGorengActionPerformed

    private void jCheckBox_Pembayaran_Langsung_KwetiawGorengActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox_Pembayaran_Langsung_KwetiawGorengActionPerformed
        jTextField_Pembayaran_Langsung_KwetiawGoreng.setVisible(false);
        
        String harga_Langsung_KwetiawGoreng = jTextField_HargaMilihKwetiawGoreng.getText();
        jTextField_Pembayaran_Langsung_KwetiawGoreng.setText(harga_Langsung_KwetiawGoreng);
        
        if (jCheckBox_Pembayaran_Langsung_KwetiawGoreng.isSelected()) {
            jTextField_Pembayaran_Langsung_KwetiawGoreng.setVisible(true);
        }
    }//GEN-LAST:event_jCheckBox_Pembayaran_Langsung_KwetiawGorengActionPerformed

    private void jButton_BeliSekarangPembayaranKwetiawGorengActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_BeliSekarangPembayaranKwetiawGorengActionPerformed
        String Harga_KwetiawGoreng = jTextField_HargaMilihKwetiawGoreng.getText();
        String nama_User = jLabel_Username.getText();
        
        if (jCheckBox_Pembayaran_Dana_KwetiawGoreng.isSelected()) {
            int notif_Dana_KwetiawGoreng = JOptionPane.showConfirmDialog(this, "Silahkan Konfirmasi Pembayaran Anda , Total : "+Harga_KwetiawGoreng);
            switch (notif_Dana_KwetiawGoreng) {
                case JOptionPane.YES_OPTION -> {
                    Desktop dana = Desktop.getDesktop();
                    try {
                        dana.browse(new URI("https://www.dana.id/"));
                        System.out.println("Pembayaran "+nama_User+" Berhasil");
                        JOptionPane.showMessageDialog(this, "Terima Kasih Sudah Membayar, Pesanan Anda Akan Diantar");
                    } catch (IOException err) {
            
                    } catch (URISyntaxException err) {
            
                    }
                }
                case JOptionPane.NO_OPTION -> {
                    ;
                    JOptionPane.showMessageDialog(this, "Jadi Beli Gk Nih?");
                }
            }
        } else if (jCheckBox_Pembayaran_Ovo_KwetiawGoreng.isSelected()){
            int notif_Ovo_KwetiawGoreng = JOptionPane.showConfirmDialog(this, "Silahkan Konfirmasi Pembayaran Anda , Total : "+Harga_KwetiawGoreng);
            switch (notif_Ovo_KwetiawGoreng) {
                case JOptionPane.YES_OPTION -> {
                    Desktop ovo = Desktop.getDesktop();
                    try {
                        ovo.browse(new URI("https://www.ovo.id/"));
                        System.out.println("Pembayaran "+nama_User+" Berhasil");
                        JOptionPane.showMessageDialog(this, "Terima Kasih Sudah Membayar, Pesanan Anda Akan Diantar");
                    } catch (IOException err) {
            
                    } catch (URISyntaxException err) {
            
                    }
                }
                case JOptionPane.NO_OPTION -> {
                    ;
                    JOptionPane.showMessageDialog(this, "Jadi Beli Gk Nih?");
                }
            }
        } else if (jCheckBox_Pembayaran_Gopay_KwetiawGoreng.isSelected()) {
            int notif_Gopay_KwetiawGoreng = JOptionPane.showConfirmDialog(this, "Silahkan Konfirmasi Pembayaran Anda , Total : "+Harga_KwetiawGoreng);
            switch (notif_Gopay_KwetiawGoreng) {
                case JOptionPane.YES_OPTION -> {
                    Desktop gopay = Desktop.getDesktop();
                    try {
                        gopay.browse(new URI("https://gopay.co.id/"));
                        System.out.println("Pembayaran "+nama_User+" Berhasil");
                        JOptionPane.showMessageDialog(this, "Terima Kasih Sudah Membayar, Pesanan Anda Akan Diantar");
                    } catch (IOException err) {
            
                    } catch (URISyntaxException err) {
            
                    }
                }
                case JOptionPane.NO_OPTION -> {
                    ;
                    JOptionPane.showMessageDialog(this, "Jadi Beli Gk Nih?");
                }
            }      
        } else if (jCheckBox_Pembayaran_Shopepay_KwetiawGoreng.isSelected()) {
            int notif_Shopepay_KwetiawGoreng = JOptionPane.showConfirmDialog(this, "Silahkan Konfirmasi Pembayaran Anda , Total : "+Harga_KwetiawGoreng);
            switch (notif_Shopepay_KwetiawGoreng) {
                case JOptionPane.YES_OPTION -> {
                    Desktop shopepay = Desktop.getDesktop();
                    try {
                        shopepay.browse(new URI("https://shopeepay.co.id/"));
                        System.out.println("Pembayaran "+nama_User+" Berhasil");
                        JOptionPane.showMessageDialog(this, "Terima Kasih Sudah Membayar, Pesanan Anda Akan Diantar");
                    } catch (IOException err) {
            
                    } catch (URISyntaxException err) {
            
                    }
                }
                case JOptionPane.NO_OPTION -> {
                    ;
                    JOptionPane.showMessageDialog(this, "Jadi Beli Gk Nih?");
                }
            }
        } else if (jCheckBox_Pembayaran_Langsung_KwetiawGoreng.isSelected()) {            
            JOptionPane.showMessageDialog(this, "Silahkan Untuk Membayar Di Kasir Dengan Total : "+Harga_KwetiawGoreng);
        } else {
            JOptionPane.showMessageDialog(this, "Anda Harus Memilih Salah Satu");
        }
    }//GEN-LAST:event_jButton_BeliSekarangPembayaranKwetiawGorengActionPerformed

    private void jButton_BackPembayaranKopiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_BackPembayaranKopiActionPerformed
        jPanel_JikaDiaMemilihMinumanKopi.setVisible(true);
        jButton_Back_MinumanKopi.setVisible(true);
        // Mematikan Semua Panel, Kecuali Header , Makanan Dan Minuman
        jPanel_JikaPilihMakananMiebiasa.setVisible(false);
        jPanel_JikaDiaMemilihMakananMieTelur.setVisible(false);
        jPanel_JikaMemilihMakananSosTeng.setVisible(false);
        jPanel_JikaDiaMemilihMakananNasiGoreng.setVisible(false);
        jPanel_JikaDiaMemilihMakananKwetiawGoreng.setVisible(false);
        jPanel_JikaDiaMemilihMinumanEsTeh.setVisible(false);
        jPanel_JikaDiaMemilihMinumanAirMineral.setVisible(false);
        jPanel_JikaDiaMemilihMinumanCocaCola.setVisible(false);
        jPanel_JikaDiaMemilihMinumanSprite.setVisible(false);
        jPanel_HeaderOrder.setVisible(false);
        jPanel_Minuman.setVisible(false);
        jPanel_Makanan.setVisible(false);
        //
        jPanel_JikaDiaPesanKopi.setVisible(false);
        jButton_BackPembayaranKopi.setVisible(false);
        jTextField_Pembayaran_Dana_Kopi.setVisible(false);
        jTextField_Pembayaran_Ovo_Kopi.setVisible(false);
        jTextField_Pembayaran_Gopay_Kopi.setVisible(false);
        jTextField_Pembayaran_Shopepay_Kopi.setVisible(false);
        jButton_BeliSekarangPembayaranKopi.setVisible(false);
        jTextField_Pembayaran_Langsung_Kopi.setVisible(false);
        
        // Mematikan checkBox bila sudah pencet back
        jCheckBox_Pembayaran_Dana_Kopi.setSelected(false);
        jCheckBox_Pembayaran_Ovo_Kopi.setSelected(false);
        jCheckBox_Pembayaran_Gopay_Kopi.setSelected(false);
        jCheckBox_Pembayaran_Shopepay_Kopi.setSelected(false);
        jCheckBox_Pembayaran_Langsung_Kopi.setSelected(false);
    }//GEN-LAST:event_jButton_BackPembayaranKopiActionPerformed

    private void jCheckBox_Pembayaran_Dana_KopiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox_Pembayaran_Dana_KopiActionPerformed
        jTextField_Pembayaran_Dana_Kopi.setVisible(false);
        
        String harga_Dana_Kopi = jTextField_Harga_MinumanKopi.getText();
        jTextField_Pembayaran_Dana_Kopi.setText(harga_Dana_Kopi);
        
        if (jCheckBox_Pembayaran_Dana_Kopi.isSelected()) {
            jTextField_Pembayaran_Dana_Kopi.setVisible(true);
        }
    }//GEN-LAST:event_jCheckBox_Pembayaran_Dana_KopiActionPerformed

    private void jCheckBox_Pembayaran_Ovo_KopiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox_Pembayaran_Ovo_KopiActionPerformed
        jTextField_Pembayaran_Ovo_Kopi.setVisible(false);
        
        String harga_Ovo_Kopi = jTextField_Harga_MinumanKopi.getText();
        jTextField_Pembayaran_Ovo_Kopi.setText(harga_Ovo_Kopi);
        
        if (jCheckBox_Pembayaran_Ovo_Kopi.isSelected()) {
            jTextField_Pembayaran_Ovo_Kopi.setVisible(true);
        }
    }//GEN-LAST:event_jCheckBox_Pembayaran_Ovo_KopiActionPerformed

    private void jCheckBox_Pembayaran_Gopay_KopiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox_Pembayaran_Gopay_KopiActionPerformed
        jTextField_Pembayaran_Gopay_Kopi.setVisible(false);
        
        String harga_Gopay_Kopi = jTextField_Harga_MinumanKopi.getText();
        jTextField_Pembayaran_Gopay_Kopi.setText(harga_Gopay_Kopi);
        
        if (jCheckBox_Pembayaran_Gopay_Kopi.isSelected()) {
            jTextField_Pembayaran_Gopay_Kopi.setVisible(true);
        }
    }//GEN-LAST:event_jCheckBox_Pembayaran_Gopay_KopiActionPerformed

    private void jCheckBox_Pembayaran_Shopepay_KopiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox_Pembayaran_Shopepay_KopiActionPerformed
        jTextField_Pembayaran_Shopepay_Kopi.setVisible(false);
        
        String harga_Shopepay_Kopi = jTextField_Harga_MinumanKopi.getText();
        jTextField_Pembayaran_Shopepay_Kopi.setText(harga_Shopepay_Kopi);
        
        if (jCheckBox_Pembayaran_Shopepay_Kopi.isSelected()) {
            jTextField_Pembayaran_Shopepay_Kopi.setVisible(true);
        }
    }//GEN-LAST:event_jCheckBox_Pembayaran_Shopepay_KopiActionPerformed

    private void jCheckBox_Pembayaran_Langsung_KopiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox_Pembayaran_Langsung_KopiActionPerformed
        jTextField_Pembayaran_Langsung_Kopi.setVisible(false);
        
        String harga_Langsung_Kopi = jTextField_Harga_MinumanKopi.getText();
        jTextField_Pembayaran_Langsung_Kopi.setText(harga_Langsung_Kopi);
        
        if (jCheckBox_Pembayaran_Langsung_Kopi.isSelected()) {
            jTextField_Pembayaran_Langsung_Kopi.setVisible(true);
        }
    }//GEN-LAST:event_jCheckBox_Pembayaran_Langsung_KopiActionPerformed

    private void jButton_BeliSekarangPembayaranKopiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_BeliSekarangPembayaranKopiActionPerformed
        String Harga_Kopi = jTextField_Harga_MinumanKopi.getText();
        String nama_User = jLabel_Username.getText();
        
        if (jCheckBox_Pembayaran_Dana_Kopi.isSelected()) {
            int notif_Dana_Kopi = JOptionPane.showConfirmDialog(this, "Silahkan Konfirmasi Pembayaran Anda , Total : "+Harga_Kopi);
            switch (notif_Dana_Kopi) {
                case JOptionPane.YES_OPTION -> {
                    Desktop dana = Desktop.getDesktop();
                    try {
                        dana.browse(new URI("https://www.dana.id/"));
                        System.out.println("Pembayaran "+nama_User+" Berhasil");
                        JOptionPane.showMessageDialog(this, "Terima Kasih Sudah Membayar, Pesanan Anda Akan Diantar");
                    } catch (IOException err) {
            
                    } catch (URISyntaxException err) {
            
                    }
                }
                case JOptionPane.NO_OPTION -> {
                    ;
                    JOptionPane.showMessageDialog(this, "Jadi Beli Gk Nih?");
                }
            }
        } else if (jCheckBox_Pembayaran_Ovo_Kopi.isSelected()){
            int notif_Ovo_Kopi = JOptionPane.showConfirmDialog(this, "Silahkan Konfirmasi Pembayaran Anda , Total : "+Harga_Kopi);
            switch (notif_Ovo_Kopi) {
                case JOptionPane.YES_OPTION -> {
                    Desktop ovo = Desktop.getDesktop();
                    try {
                        ovo.browse(new URI("https://www.ovo.id/"));
                        System.out.println("Pembayaran "+nama_User+" Berhasil");
                        JOptionPane.showMessageDialog(this, "Terima Kasih Sudah Membayar, Pesanan Anda Akan Diantar");
                    } catch (IOException err) {
            
                    } catch (URISyntaxException err) {
            
                    }
                }
                case JOptionPane.NO_OPTION -> {
                    ;
                    JOptionPane.showMessageDialog(this, "Jadi Beli Gk Nih?");
                }
            }
        } else if (jCheckBox_Pembayaran_Gopay_Kopi.isSelected()) {
            int notif_Gopay_Kopi = JOptionPane.showConfirmDialog(this, "Silahkan Konfirmasi Pembayaran Anda , Total : "+Harga_Kopi);
            switch (notif_Gopay_Kopi) {
                case JOptionPane.YES_OPTION -> {
                    Desktop gopay = Desktop.getDesktop();
                    try {
                        gopay.browse(new URI("https://gopay.co.id/"));
                        System.out.println("Pembayaran "+nama_User+" Berhasil");
                        JOptionPane.showMessageDialog(this, "Terima Kasih Sudah Membayar, Pesanan Anda Akan Diantar");
                    } catch (IOException err) {
            
                    } catch (URISyntaxException err) {
            
                    }
                }
                case JOptionPane.NO_OPTION -> {
                    ;
                    JOptionPane.showMessageDialog(this, "Jadi Beli Gk Nih?");
                }
            }      
        } else if (jCheckBox_Pembayaran_Shopepay_Kopi.isSelected()) {
            int notif_Shopepay_Kopi = JOptionPane.showConfirmDialog(this, "Silahkan Konfirmasi Pembayaran Anda , Total : "+Harga_Kopi);
            switch (notif_Shopepay_Kopi) {
                case JOptionPane.YES_OPTION -> {
                    Desktop shopepay = Desktop.getDesktop();
                    try {
                        shopepay.browse(new URI("https://shopeepay.co.id/"));
                        System.out.println("Pembayaran "+nama_User+" Berhasil");
                        JOptionPane.showMessageDialog(this, "Terima Kasih Sudah Membayar, Pesanan Anda Akan Diantar");
                    } catch (IOException err) {
            
                    } catch (URISyntaxException err) {
            
                    }
                }
                case JOptionPane.NO_OPTION -> {
                    ;
                    JOptionPane.showMessageDialog(this, "Jadi Beli Gk Nih?");
                }
            }
        } else if (jCheckBox_Pembayaran_Langsung_Kopi.isSelected()) {            
            JOptionPane.showMessageDialog(this, "Silahkan Untuk Membayar Di Kasir Dengan Total : "+Harga_Kopi);
        } else {
            JOptionPane.showMessageDialog(this, "Anda Harus Memilih Salah Satu");
        }
    }//GEN-LAST:event_jButton_BeliSekarangPembayaranKopiActionPerformed

    private void jButton_BackPembayaranEsTehActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_BackPembayaranEsTehActionPerformed
        jPanel_JikaDiaMemilihMinumanEsTeh.setVisible(true);
        jButton_Back_MinumanEsTeh.setVisible(true);
        // Mematikan Semua Panel, Kecuali Header , Makanan Dan Minuman
        jPanel_JikaPilihMakananMiebiasa.setVisible(false);
        jPanel_JikaDiaMemilihMakananMieTelur.setVisible(false);
        jPanel_JikaMemilihMakananSosTeng.setVisible(false);
        jPanel_JikaDiaMemilihMakananNasiGoreng.setVisible(false);
        jPanel_JikaDiaMemilihMakananKwetiawGoreng.setVisible(false);
        jPanel_JikaDiaMemilihMinumanKopi.setVisible(false);
        jPanel_JikaDiaMemilihMinumanAirMineral.setVisible(false);
        jPanel_JikaDiaMemilihMinumanCocaCola.setVisible(false);
        jPanel_JikaDiaMemilihMinumanSprite.setVisible(false);
        jPanel_HeaderOrder.setVisible(false);
        jPanel_Minuman.setVisible(false);
        jPanel_Makanan.setVisible(false);
        //
        jPanel_JikaDiaPesanEsTeh.setVisible(false);
        jButton_BackPembayaranEsTeh.setVisible(false);
        jTextField_Pembayaran_Dana_EsTeh.setVisible(false);
        jTextField_Pembayaran_Ovo_EsTeh.setVisible(false);
        jTextField_Pembayaran_Gopay_EsTeh.setVisible(false);
        jTextField_Pembayaran_Shopepay_EsTeh.setVisible(false);
        jButton_BeliSekarangPembayaranEsTeh.setVisible(false);
        jTextField_Pembayaran_Langsung_EsTeh.setVisible(false);
        
        // Mematikan checkBox bila sudah pencet back
        jCheckBox_Pembayaran_Dana_EsTeh.setSelected(false);
        jCheckBox_Pembayaran_Ovo_EsTeh.setSelected(false);
        jCheckBox_Pembayaran_Gopay_EsTeh.setSelected(false);
        jCheckBox_Pembayaran_Shopepay_EsTeh.setSelected(false);
        jCheckBox_Pembayaran_Langsung_EsTeh.setSelected(false);
    }//GEN-LAST:event_jButton_BackPembayaranEsTehActionPerformed

    private void jCheckBox_Pembayaran_Dana_EsTehActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox_Pembayaran_Dana_EsTehActionPerformed
        jTextField_Pembayaran_Dana_EsTeh.setVisible(false);
        
        String harga_Dana_EsTeh = jTextField_Harga_MinumanEsTeh.getText();
        jTextField_Pembayaran_Dana_EsTeh.setText(harga_Dana_EsTeh);
        
        if (jCheckBox_Pembayaran_Dana_EsTeh.isSelected()) {
            jTextField_Pembayaran_Dana_EsTeh.setVisible(true);
        }
    }//GEN-LAST:event_jCheckBox_Pembayaran_Dana_EsTehActionPerformed

    private void jCheckBox_Pembayaran_Ovo_EsTehActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox_Pembayaran_Ovo_EsTehActionPerformed
        jTextField_Pembayaran_Ovo_EsTeh.setVisible(false);
        
        String harga_Ovo_EsTeh = jTextField_Harga_MinumanEsTeh.getText();
        jTextField_Pembayaran_Ovo_EsTeh.setText(harga_Ovo_EsTeh);
        
        if (jCheckBox_Pembayaran_Ovo_EsTeh.isSelected()) {
            jTextField_Pembayaran_Ovo_EsTeh.setVisible(true);
        }
    }//GEN-LAST:event_jCheckBox_Pembayaran_Ovo_EsTehActionPerformed

    private void jCheckBox_Pembayaran_Gopay_EsTehActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox_Pembayaran_Gopay_EsTehActionPerformed
        jTextField_Pembayaran_Gopay_EsTeh.setVisible(false);
        
        String harga_Gopay_EsTeh = jTextField_Harga_MinumanEsTeh.getText();
        jTextField_Pembayaran_Gopay_EsTeh.setText(harga_Gopay_EsTeh);
        
        if (jCheckBox_Pembayaran_Gopay_EsTeh.isSelected()) {
            jTextField_Pembayaran_Gopay_EsTeh.setVisible(true);
        }
    }//GEN-LAST:event_jCheckBox_Pembayaran_Gopay_EsTehActionPerformed

    private void jCheckBox_Pembayaran_Shopepay_EsTehActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox_Pembayaran_Shopepay_EsTehActionPerformed
        jTextField_Pembayaran_Shopepay_EsTeh.setVisible(false);
        
        String harga_Shopepay_EsTeh = jTextField_Harga_MinumanEsTeh.getText();
        jTextField_Pembayaran_Shopepay_EsTeh.setText(harga_Shopepay_EsTeh);
        
        if (jCheckBox_Pembayaran_Shopepay_EsTeh.isSelected()) {
            jTextField_Pembayaran_Shopepay_EsTeh.setVisible(true);
        }
    }//GEN-LAST:event_jCheckBox_Pembayaran_Shopepay_EsTehActionPerformed

    private void jCheckBox_Pembayaran_Langsung_EsTehActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox_Pembayaran_Langsung_EsTehActionPerformed
        jTextField_Pembayaran_Langsung_EsTeh.setVisible(false);
        
        String harga_Langsung_EsTeh = jTextField_Harga_MinumanEsTeh.getText();
        jTextField_Pembayaran_Langsung_EsTeh.setText(harga_Langsung_EsTeh);
        
        if (jCheckBox_Pembayaran_Langsung_EsTeh.isSelected()) {
            jTextField_Pembayaran_Langsung_EsTeh.setVisible(true);
        }
    }//GEN-LAST:event_jCheckBox_Pembayaran_Langsung_EsTehActionPerformed

    private void jButton_BeliSekarangPembayaranEsTehActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_BeliSekarangPembayaranEsTehActionPerformed
        String Harga_EsTeh = jTextField_Harga_MinumanEsTeh.getText();
        String nama_User = jLabel_Username.getText();
        
        if (jCheckBox_Pembayaran_Dana_EsTeh.isSelected()) {
            int notif_Dana_EsTeh = JOptionPane.showConfirmDialog(this, "Silahkan Konfirmasi Pembayaran Anda , Total : "+Harga_EsTeh);
            switch (notif_Dana_EsTeh) {
                case JOptionPane.YES_OPTION -> {
                    Desktop dana = Desktop.getDesktop();
                    try {
                        dana.browse(new URI("https://www.dana.id/"));
                        System.out.println("Pembayaran "+nama_User+" Berhasil");
                        JOptionPane.showMessageDialog(this, "Terima Kasih Sudah Membayar, Pesanan Anda Akan Diantar");
                    } catch (IOException err) {
            
                    } catch (URISyntaxException err) {
            
                    }
                }
                case JOptionPane.NO_OPTION -> {
                    ;
                    JOptionPane.showMessageDialog(this, "Jadi Beli Gk Nih?");
                }
            }
        } else if (jCheckBox_Pembayaran_Ovo_EsTeh.isSelected()){
            int notif_Ovo_EsTeh = JOptionPane.showConfirmDialog(this, "Silahkan Konfirmasi Pembayaran Anda , Total : "+Harga_EsTeh);
            switch (notif_Ovo_EsTeh) {
                case JOptionPane.YES_OPTION -> {
                    Desktop ovo = Desktop.getDesktop();
                    try {
                        ovo.browse(new URI("https://www.ovo.id/"));
                        System.out.println("Pembayaran "+nama_User+" Berhasil");
                        JOptionPane.showMessageDialog(this, "Terima Kasih Sudah Membayar, Pesanan Anda Akan Diantar");
                    } catch (IOException err) {
            
                    } catch (URISyntaxException err) {
            
                    }
                }
                case JOptionPane.NO_OPTION -> {
                    ;
                    JOptionPane.showMessageDialog(this, "Jadi Beli Gk Nih?");
                }
            }
        } else if (jCheckBox_Pembayaran_Gopay_EsTeh.isSelected()) {
            int notif_Gopay_EsTeh = JOptionPane.showConfirmDialog(this, "Silahkan Konfirmasi Pembayaran Anda , Total : "+Harga_EsTeh);
            switch (notif_Gopay_EsTeh) {
                case JOptionPane.YES_OPTION -> {
                    Desktop gopay = Desktop.getDesktop();
                    try {
                        gopay.browse(new URI("https://gopay.co.id/"));
                        System.out.println("Pembayaran "+nama_User+" Berhasil");
                        JOptionPane.showMessageDialog(this, "Terima Kasih Sudah Membayar, Pesanan Anda Akan Diantar");
                    } catch (IOException err) {
            
                    } catch (URISyntaxException err) {
            
                    }
                }
                case JOptionPane.NO_OPTION -> {
                    ;
                    JOptionPane.showMessageDialog(this, "Jadi Beli Gk Nih?");
                }
            }      
        } else if (jCheckBox_Pembayaran_Shopepay_EsTeh.isSelected()) {
            int notif_Shopepay_EsTeh = JOptionPane.showConfirmDialog(this, "Silahkan Konfirmasi Pembayaran Anda , Total : "+Harga_EsTeh);
            switch (notif_Shopepay_EsTeh) {
                case JOptionPane.YES_OPTION -> {
                    Desktop shopepay = Desktop.getDesktop();
                    try {
                        shopepay.browse(new URI("https://shopeepay.co.id/"));
                        System.out.println("Pembayaran "+nama_User+" Berhasil");
                        JOptionPane.showMessageDialog(this, "Terima Kasih Sudah Membayar, Pesanan Anda Akan Diantar");
                    } catch (IOException err) {
            
                    } catch (URISyntaxException err) {
            
                    }
                }
                case JOptionPane.NO_OPTION -> {
                    ;
                    JOptionPane.showMessageDialog(this, "Jadi Beli Gk Nih?");
                }
            }
        } else if (jCheckBox_Pembayaran_Langsung_EsTeh.isSelected()) {            
            JOptionPane.showMessageDialog(this, "Silahkan Untuk Membayar Di Kasir Dengan Total : "+Harga_EsTeh);
        } else {
            JOptionPane.showMessageDialog(this, "Anda Harus Memilih Salah Satu");
        }
    }//GEN-LAST:event_jButton_BeliSekarangPembayaranEsTehActionPerformed

    private void jButton_BackPembayaranAirMineralActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_BackPembayaranAirMineralActionPerformed
        jPanel_JikaDiaMemilihMinumanAirMineral.setVisible(true);
        jButton_Back_MinumanAirMineral.setVisible(true);
        // Mematikan Semua Panel, Kecuali Header , Makanan Dan Minuman
        jPanel_JikaPilihMakananMiebiasa.setVisible(false);
        jPanel_JikaDiaMemilihMakananMieTelur.setVisible(false);
        jPanel_JikaMemilihMakananSosTeng.setVisible(false);
        jPanel_JikaDiaMemilihMakananNasiGoreng.setVisible(false);
        jPanel_JikaDiaMemilihMakananKwetiawGoreng.setVisible(false);
        jPanel_JikaDiaMemilihMinumanKopi.setVisible(false);
        jPanel_JikaDiaMemilihMinumanEsTeh.setVisible(false);
        jPanel_JikaDiaMemilihMinumanCocaCola.setVisible(false);
        jPanel_JikaDiaMemilihMinumanSprite.setVisible(false);
        jPanel_HeaderOrder.setVisible(false);
        jPanel_Minuman.setVisible(false);
        jPanel_Makanan.setVisible(false);
        //
        jPanel_JikaDiaPesanAirMineral.setVisible(false);
        jButton_BackPembayaranAirMineral.setVisible(false);
        jTextField_Pembayaran_Dana_AirMineral.setVisible(false);
        jTextField_Pembayaran_Ovo_AirMineral.setVisible(false);
        jTextField_Pembayaran_Gopay_AirMineral.setVisible(false);
        jTextField_Pembayaran_Shopepay_AirMineral.setVisible(false);
        jButton_BeliSekarangPembayaranAirMineral.setVisible(false);
        jTextField_Pembayaran_Langsung_AirMineral.setVisible(false);
        
        // Mematikan checkBox bila sudah pencet back
        jCheckBox_Pembayaran_Dana_AirMineral.setSelected(false);
        jCheckBox_Pembayaran_Ovo_AirMineral.setSelected(false);
        jCheckBox_Pembayaran_Gopay_AirMineral.setSelected(false);
        jCheckBox_Pembayaran_Shopepay_AirMineral.setSelected(false);
        jCheckBox_Pembayaran_Langsung_AirMineral.setSelected(false);
    }//GEN-LAST:event_jButton_BackPembayaranAirMineralActionPerformed

    private void jCheckBox_Pembayaran_Dana_AirMineralActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox_Pembayaran_Dana_AirMineralActionPerformed
        jTextField_Pembayaran_Dana_AirMineral.setVisible(false);
        
        String harga_Dana_AirMineral = jTextField_Harga_MinumanAirMineral.getText();
        jTextField_Pembayaran_Dana_AirMineral.setText(harga_Dana_AirMineral);
        
        if (jCheckBox_Pembayaran_Dana_AirMineral.isSelected()) {
            jTextField_Pembayaran_Dana_AirMineral.setVisible(true);
        }
    }//GEN-LAST:event_jCheckBox_Pembayaran_Dana_AirMineralActionPerformed

    private void jCheckBox_Pembayaran_Ovo_AirMineralActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox_Pembayaran_Ovo_AirMineralActionPerformed
        jTextField_Pembayaran_Ovo_AirMineral.setVisible(false);
        
        String harga_Ovo_AirMineral = jTextField_Harga_MinumanAirMineral.getText();
        jTextField_Pembayaran_Ovo_AirMineral.setText(harga_Ovo_AirMineral);
        
        if (jCheckBox_Pembayaran_Ovo_AirMineral.isSelected()) {
            jTextField_Pembayaran_Ovo_AirMineral.setVisible(true);
        }
    }//GEN-LAST:event_jCheckBox_Pembayaran_Ovo_AirMineralActionPerformed

    private void jCheckBox_Pembayaran_Gopay_AirMineralActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox_Pembayaran_Gopay_AirMineralActionPerformed
        jTextField_Pembayaran_Gopay_AirMineral.setVisible(false);
        
        String harga_Gopay_AirMineral = jTextField_Harga_MinumanAirMineral.getText();
        jTextField_Pembayaran_Gopay_AirMineral.setText(harga_Gopay_AirMineral);
        
        if (jCheckBox_Pembayaran_Gopay_AirMineral.isSelected()) {
            jTextField_Pembayaran_Gopay_AirMineral.setVisible(true);
        }
    }//GEN-LAST:event_jCheckBox_Pembayaran_Gopay_AirMineralActionPerformed

    private void jCheckBox_Pembayaran_Shopepay_AirMineralActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox_Pembayaran_Shopepay_AirMineralActionPerformed
        jTextField_Pembayaran_Shopepay_AirMineral.setVisible(false);
        
        String harga_Shopepay_AirMineral = jTextField_Harga_MinumanAirMineral.getText();
        jTextField_Pembayaran_Shopepay_AirMineral.setText(harga_Shopepay_AirMineral);
        
        if (jCheckBox_Pembayaran_Shopepay_AirMineral.isSelected()) {
            jTextField_Pembayaran_Shopepay_AirMineral.setVisible(true);
        }
    }//GEN-LAST:event_jCheckBox_Pembayaran_Shopepay_AirMineralActionPerformed

    private void jCheckBox_Pembayaran_Langsung_AirMineralActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox_Pembayaran_Langsung_AirMineralActionPerformed
        jTextField_Pembayaran_Langsung_AirMineral.setVisible(false);
        
        String harga_Langsung_AirMineral = jTextField_Harga_MinumanAirMineral.getText();
        jTextField_Pembayaran_Langsung_AirMineral.setText(harga_Langsung_AirMineral);
        
        if (jCheckBox_Pembayaran_Langsung_AirMineral.isSelected()) {
            jTextField_Pembayaran_Langsung_AirMineral.setVisible(true);
        }
    }//GEN-LAST:event_jCheckBox_Pembayaran_Langsung_AirMineralActionPerformed

    private void jButton_BeliSekarangPembayaranAirMineralActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_BeliSekarangPembayaranAirMineralActionPerformed
        String Harga_AirMineral = jTextField_Harga_MinumanAirMineral.getText();
        String nama_User = jLabel_Username.getText();
        
        if (jCheckBox_Pembayaran_Dana_AirMineral.isSelected()) {
            int notif_Dana_AirMineral = JOptionPane.showConfirmDialog(this, "Silahkan Konfirmasi Pembayaran Anda , Total : "+Harga_AirMineral);
            switch (notif_Dana_AirMineral) {
                case JOptionPane.YES_OPTION -> {
                    Desktop dana = Desktop.getDesktop();
                    try {
                        dana.browse(new URI("https://www.dana.id/"));
                        System.out.println("Pembayaran "+nama_User+" Berhasil");
                        JOptionPane.showMessageDialog(this, "Terima Kasih Sudah Membayar, Pesanan Anda Akan Diantar");
                    } catch (IOException err) {
            
                    } catch (URISyntaxException err) {
            
                    }
                }
                case JOptionPane.NO_OPTION -> {
                    ;
                    JOptionPane.showMessageDialog(this, "Jadi Beli Gk Nih?");
                }
            }
        } else if (jCheckBox_Pembayaran_Ovo_AirMineral.isSelected()){
            int notif_Ovo_AirMineral = JOptionPane.showConfirmDialog(this, "Silahkan Konfirmasi Pembayaran Anda , Total : "+Harga_AirMineral);
            switch (notif_Ovo_AirMineral) {
                case JOptionPane.YES_OPTION -> {
                    Desktop ovo = Desktop.getDesktop();
                    try {
                        ovo.browse(new URI("https://www.ovo.id/"));
                        System.out.println("Pembayaran "+nama_User+" Berhasil");
                        JOptionPane.showMessageDialog(this, "Terima Kasih Sudah Membayar, Pesanan Anda Akan Diantar");
                    } catch (IOException err) {
            
                    } catch (URISyntaxException err) {
            
                    }
                }
                case JOptionPane.NO_OPTION -> {
                    ;
                    JOptionPane.showMessageDialog(this, "Jadi Beli Gk Nih?");
                }
            }
        } else if (jCheckBox_Pembayaran_Gopay_AirMineral.isSelected()) {
            int notif_Gopay_AirMineral = JOptionPane.showConfirmDialog(this, "Silahkan Konfirmasi Pembayaran Anda , Total : "+Harga_AirMineral);
            switch (notif_Gopay_AirMineral) {
                case JOptionPane.YES_OPTION -> {
                    Desktop gopay = Desktop.getDesktop();
                    try {
                        gopay.browse(new URI("https://gopay.co.id/"));
                        System.out.println("Pembayaran "+nama_User+" Berhasil");
                        JOptionPane.showMessageDialog(this, "Terima Kasih Sudah Membayar, Pesanan Anda Akan Diantar");
                    } catch (IOException err) {
            
                    } catch (URISyntaxException err) {
            
                    }
                }
                case JOptionPane.NO_OPTION -> {
                    ;
                    JOptionPane.showMessageDialog(this, "Jadi Beli Gk Nih?");
                }
            }      
        } else if (jCheckBox_Pembayaran_Shopepay_AirMineral.isSelected()) {
            int notif_Shopepay_AirMineral = JOptionPane.showConfirmDialog(this, "Silahkan Konfirmasi Pembayaran Anda , Total : "+Harga_AirMineral);
            switch (notif_Shopepay_AirMineral) {
                case JOptionPane.YES_OPTION -> {
                    Desktop shopepay = Desktop.getDesktop();
                    try {
                        shopepay.browse(new URI("https://shopeepay.co.id/"));
                        System.out.println("Pembayaran "+nama_User+" Berhasil");
                        JOptionPane.showMessageDialog(this, "Terima Kasih Sudah Membayar, Pesanan Anda Akan Diantar");
                    } catch (IOException err) {
            
                    } catch (URISyntaxException err) {
            
                    }
                }
                case JOptionPane.NO_OPTION -> {
                    ;
                    JOptionPane.showMessageDialog(this, "Jadi Beli Gk Nih?");
                }
            }
        } else if (jCheckBox_Pembayaran_Langsung_AirMineral.isSelected()) {            
            JOptionPane.showMessageDialog(this, "Silahkan Untuk Membayar Di Kasir Dengan Total : "+Harga_AirMineral);
        } else {
            JOptionPane.showMessageDialog(this, "Anda Harus Memilih Salah Satu");
        }
    }//GEN-LAST:event_jButton_BeliSekarangPembayaranAirMineralActionPerformed

    private void jButton_BackPembayaranCocaColaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_BackPembayaranCocaColaActionPerformed
        jPanel_JikaDiaMemilihMinumanCocaCola.setVisible(true);
        jButton_Back_MinumanCocaCola.setVisible(true);
        // Mematikan Semua Panel, Kecuali Header , Makanan Dan Minuman
        jPanel_JikaPilihMakananMiebiasa.setVisible(false);
        jPanel_JikaDiaMemilihMakananMieTelur.setVisible(false);
        jPanel_JikaMemilihMakananSosTeng.setVisible(false);
        jPanel_JikaDiaMemilihMakananNasiGoreng.setVisible(false);
        jPanel_JikaDiaMemilihMakananKwetiawGoreng.setVisible(false);
        jPanel_JikaDiaMemilihMinumanKopi.setVisible(false);
        jPanel_JikaDiaMemilihMinumanEsTeh.setVisible(false);
        jPanel_JikaDiaMemilihMinumanAirMineral.setVisible(false);
        jPanel_JikaDiaMemilihMinumanSprite.setVisible(false);
        jPanel_HeaderOrder.setVisible(false);
        jPanel_Minuman.setVisible(false);
        jPanel_Makanan.setVisible(false);
        //
        jPanel_JikaDiaPesanCocaCola.setVisible(false);
        jButton_BackPembayaranCocaCola.setVisible(false);
        jTextField_Pembayaran_Dana_CocaCola.setVisible(false);
        jTextField_Pembayaran_Ovo_CocaCola.setVisible(false);
        jTextField_Pembayaran_Gopay_CocaCola.setVisible(false);
        jTextField_Pembayaran_Shopepay_CocaCola.setVisible(false);
        jButton_BeliSekarangPembayaranCocaCola.setVisible(false);
        jTextField_Pembayaran_Langsung_CocaCola.setVisible(false);
        
        // Mematikan checkBox bila sudah pencet back
        jCheckBox_Pembayaran_Dana_CocaCola.setSelected(false);
        jCheckBox_Pembayaran_Ovo_CocaCola.setSelected(false);
        jCheckBox_Pembayaran_Gopay_CocaCola.setSelected(false);
        jCheckBox_Pembayaran_Shopepay_CocaCola.setSelected(false);
        jCheckBox_Pembayaran_Langsung_CocaCola.setSelected(false);
    }//GEN-LAST:event_jButton_BackPembayaranCocaColaActionPerformed

    private void jCheckBox_Pembayaran_Dana_CocaColaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox_Pembayaran_Dana_CocaColaActionPerformed
        jTextField_Pembayaran_Dana_CocaCola.setVisible(false);
        
        String harga_Dana_CocaCola = jTextField_Harga_MinumanCocaCola.getText();
        jTextField_Pembayaran_Dana_CocaCola.setText(harga_Dana_CocaCola);
        
        if (jCheckBox_Pembayaran_Dana_CocaCola.isSelected()) {
            jTextField_Pembayaran_Dana_CocaCola.setVisible(true);
        }
    }//GEN-LAST:event_jCheckBox_Pembayaran_Dana_CocaColaActionPerformed

    private void jCheckBox_Pembayaran_Ovo_CocaColaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox_Pembayaran_Ovo_CocaColaActionPerformed
        jTextField_Pembayaran_Ovo_CocaCola.setVisible(false);
        
        String harga_Ovo_CocaCola = jTextField_Harga_MinumanCocaCola.getText();
        jTextField_Pembayaran_Ovo_CocaCola.setText(harga_Ovo_CocaCola);
        
        if (jCheckBox_Pembayaran_Ovo_CocaCola.isSelected()) {
            jTextField_Pembayaran_Ovo_CocaCola.setVisible(true);
        }
    }//GEN-LAST:event_jCheckBox_Pembayaran_Ovo_CocaColaActionPerformed

    private void jCheckBox_Pembayaran_Gopay_CocaColaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox_Pembayaran_Gopay_CocaColaActionPerformed
        jTextField_Pembayaran_Gopay_CocaCola.setVisible(false);
        
        String harga_Gopay_CocaCola = jTextField_Harga_MinumanCocaCola.getText();
        jTextField_Pembayaran_Gopay_CocaCola.setText(harga_Gopay_CocaCola);
        
        if (jCheckBox_Pembayaran_Gopay_CocaCola.isSelected()) {
            jTextField_Pembayaran_Gopay_CocaCola.setVisible(true);
        }
    }//GEN-LAST:event_jCheckBox_Pembayaran_Gopay_CocaColaActionPerformed

    private void jCheckBox_Pembayaran_Shopepay_CocaColaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox_Pembayaran_Shopepay_CocaColaActionPerformed
        jTextField_Pembayaran_Shopepay_CocaCola.setVisible(false);
        
        String harga_Shopepay_CocaCola = jTextField_Harga_MinumanCocaCola.getText();
        jTextField_Pembayaran_Shopepay_CocaCola.setText(harga_Shopepay_CocaCola);
        
        if (jCheckBox_Pembayaran_Shopepay_CocaCola.isSelected()) {
            jTextField_Pembayaran_Shopepay_CocaCola.setVisible(true);
        }
    }//GEN-LAST:event_jCheckBox_Pembayaran_Shopepay_CocaColaActionPerformed

    private void jCheckBox_Pembayaran_Langsung_CocaColaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox_Pembayaran_Langsung_CocaColaActionPerformed
        jTextField_Pembayaran_Langsung_CocaCola.setVisible(false);
        
        String harga_Langsung_CocaCola = jTextField_Harga_MinumanCocaCola.getText();
        jTextField_Pembayaran_Langsung_CocaCola.setText(harga_Langsung_CocaCola);
        
        if (jCheckBox_Pembayaran_Langsung_CocaCola.isSelected()) {
            jTextField_Pembayaran_Langsung_CocaCola.setVisible(true);
        }
    }//GEN-LAST:event_jCheckBox_Pembayaran_Langsung_CocaColaActionPerformed

    private void jButton_BeliSekarangPembayaranCocaColaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_BeliSekarangPembayaranCocaColaActionPerformed
        String Harga_CocaCola = jTextField_Harga_MinumanCocaCola.getText();
        String nama_User = jLabel_Username.getText();
        
        if (jCheckBox_Pembayaran_Dana_CocaCola.isSelected()) {
            int notif_Dana_CocaCola = JOptionPane.showConfirmDialog(this, "Silahkan Konfirmasi Pembayaran Anda , Total : "+Harga_CocaCola);
            switch (notif_Dana_CocaCola) {
                case JOptionPane.YES_OPTION -> {
                    Desktop dana = Desktop.getDesktop();
                    try {
                        dana.browse(new URI("https://www.dana.id/"));
                        System.out.println("Pembayaran "+nama_User+" Berhasil");
                        JOptionPane.showMessageDialog(this, "Terima Kasih Sudah Membayar, Pesanan Anda Akan Diantar");
                    } catch (IOException err) {
            
                    } catch (URISyntaxException err) {
            
                    }
                }
                case JOptionPane.NO_OPTION -> {
                    ;
                    JOptionPane.showMessageDialog(this, "Jadi Beli Gk Nih?");
                }
            }
        } else if (jCheckBox_Pembayaran_Ovo_CocaCola.isSelected()){
            int notif_Ovo_CocaCola = JOptionPane.showConfirmDialog(this, "Silahkan Konfirmasi Pembayaran Anda , Total : "+Harga_CocaCola);
            switch (notif_Ovo_CocaCola) {
                case JOptionPane.YES_OPTION -> {
                    Desktop ovo = Desktop.getDesktop();
                    try {
                        ovo.browse(new URI("https://www.ovo.id/"));
                        System.out.println("Pembayaran "+nama_User+" Berhasil");
                        JOptionPane.showMessageDialog(this, "Terima Kasih Sudah Membayar, Pesanan Anda Akan Diantar");
                    } catch (IOException err) {
            
                    } catch (URISyntaxException err) {
            
                    }
                }
                case JOptionPane.NO_OPTION -> {
                    ;
                    JOptionPane.showMessageDialog(this, "Jadi Beli Gk Nih?");
                }
            }
        } else if (jCheckBox_Pembayaran_Gopay_CocaCola.isSelected()) {
            int notif_Gopay_CocaCola = JOptionPane.showConfirmDialog(this, "Silahkan Konfirmasi Pembayaran Anda , Total : "+Harga_CocaCola);
            switch (notif_Gopay_CocaCola) {
                case JOptionPane.YES_OPTION -> {
                    Desktop gopay = Desktop.getDesktop();
                    try {
                        gopay.browse(new URI("https://gopay.co.id/"));
                        System.out.println("Pembayaran "+nama_User+" Berhasil");
                        JOptionPane.showMessageDialog(this, "Terima Kasih Sudah Membayar, Pesanan Anda Akan Diantar");
                    } catch (IOException err) {
            
                    } catch (URISyntaxException err) {
            
                    }
                }
                case JOptionPane.NO_OPTION -> {
                    ;
                    JOptionPane.showMessageDialog(this, "Jadi Beli Gk Nih?");
                }
            }      
        } else if (jCheckBox_Pembayaran_Shopepay_CocaCola.isSelected()) {
            int notif_Shopepay_CocaCola = JOptionPane.showConfirmDialog(this, "Silahkan Konfirmasi Pembayaran Anda , Total : "+Harga_CocaCola);
            switch (notif_Shopepay_CocaCola) {
                case JOptionPane.YES_OPTION -> {
                    Desktop shopepay = Desktop.getDesktop();
                    try {
                        shopepay.browse(new URI("https://shopeepay.co.id/"));
                        System.out.println("Pembayaran "+nama_User+" Berhasil");
                        JOptionPane.showMessageDialog(this, "Terima Kasih Sudah Membayar, Pesanan Anda Akan Diantar");
                    } catch (IOException err) {
            
                    } catch (URISyntaxException err) {
            
                    }
                }
                case JOptionPane.NO_OPTION -> {
                    ;
                    JOptionPane.showMessageDialog(this, "Jadi Beli Gk Nih?");
                }
            }
        } else if (jCheckBox_Pembayaran_Langsung_CocaCola.isSelected()) {            
            JOptionPane.showMessageDialog(this, "Silahkan Untuk Membayar Di Kasir Dengan Total : "+Harga_CocaCola);
        } else {
            JOptionPane.showMessageDialog(this, "Anda Harus Memilih Salah Satu");
        }
    }//GEN-LAST:event_jButton_BeliSekarangPembayaranCocaColaActionPerformed

    private void jButton_BackPembayaranSpriteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_BackPembayaranSpriteActionPerformed
        jPanel_JikaDiaMemilihMinumanSprite.setVisible(true);
        jButton_Back_MinumanSprite.setVisible(true);
        // Mematikan Semua Panel, Kecuali Header , Makanan Dan Minuman
        jPanel_JikaPilihMakananMiebiasa.setVisible(false);
        jPanel_JikaDiaMemilihMakananMieTelur.setVisible(false);
        jPanel_JikaMemilihMakananSosTeng.setVisible(false);
        jPanel_JikaDiaMemilihMakananNasiGoreng.setVisible(false);
        jPanel_JikaDiaMemilihMakananKwetiawGoreng.setVisible(false);
        jPanel_JikaDiaMemilihMinumanKopi.setVisible(false);
        jPanel_JikaDiaMemilihMinumanEsTeh.setVisible(false);
        jPanel_JikaDiaMemilihMinumanAirMineral.setVisible(false);
        jPanel_JikaDiaMemilihMinumanCocaCola.setVisible(false);
        jPanel_HeaderOrder.setVisible(false);
        jPanel_Minuman.setVisible(false);
        jPanel_Makanan.setVisible(false);
        //
        jPanel_JikaDiaPesanSprite.setVisible(false);
        jButton_BackPembayaranSprite.setVisible(false);
        jTextField_Pembayaran_Dana_Sprite.setVisible(false);
        jTextField_Pembayaran_Ovo_Sprite.setVisible(false);
        jTextField_Pembayaran_Gopay_Sprite.setVisible(false);
        jTextField_Pembayaran_Shopepay_Sprite.setVisible(false);
        jButton_BeliSekarangPembayaranSprite.setVisible(false);
        jTextField_Pembayaran_Langsung_Sprite.setVisible(false);
        
        // Mematikan checkBox bila sudah pencet back
        jCheckBox_Pembayaran_Dana_Sprite.setSelected(false);
        jCheckBox_Pembayaran_Ovo_Sprite.setSelected(false);
        jCheckBox_Pembayaran_Gopay_Sprite.setSelected(false);
        jCheckBox_Pembayaran_Shopepay_Sprite.setSelected(false);
        jCheckBox_Pembayaran_Langsung_Sprite.setSelected(false);
    }//GEN-LAST:event_jButton_BackPembayaranSpriteActionPerformed

    private void jCheckBox_Pembayaran_Dana_SpriteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox_Pembayaran_Dana_SpriteActionPerformed
        jTextField_Pembayaran_Dana_Sprite.setVisible(false);
        
        String harga_Dana_Sprite = jTextField_Harga_MinumanSprite.getText();
        jTextField_Pembayaran_Dana_Sprite.setText(harga_Dana_Sprite);
        
        if (jCheckBox_Pembayaran_Dana_Sprite.isSelected()) {
            jTextField_Pembayaran_Dana_Sprite.setVisible(true);
        }
    }//GEN-LAST:event_jCheckBox_Pembayaran_Dana_SpriteActionPerformed

    private void jCheckBox_Pembayaran_Ovo_SpriteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox_Pembayaran_Ovo_SpriteActionPerformed
        jTextField_Pembayaran_Ovo_Sprite.setVisible(false);
        
        String harga_Ovo_Sprite = jTextField_Harga_MinumanSprite.getText();
        jTextField_Pembayaran_Ovo_Sprite.setText(harga_Ovo_Sprite);
        
        if (jCheckBox_Pembayaran_Ovo_Sprite.isSelected()) {
            jTextField_Pembayaran_Ovo_Sprite.setVisible(true);
        }
    }//GEN-LAST:event_jCheckBox_Pembayaran_Ovo_SpriteActionPerformed

    private void jCheckBox_Pembayaran_Gopay_SpriteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox_Pembayaran_Gopay_SpriteActionPerformed
        jTextField_Pembayaran_Gopay_Sprite.setVisible(false);
        
        String harga_Gopay_Sprite = jTextField_Harga_MinumanSprite.getText();
        jTextField_Pembayaran_Gopay_Sprite.setText(harga_Gopay_Sprite);
        
        if (jCheckBox_Pembayaran_Gopay_Sprite.isSelected()) {
            jTextField_Pembayaran_Gopay_Sprite.setVisible(true);
        }
    }//GEN-LAST:event_jCheckBox_Pembayaran_Gopay_SpriteActionPerformed

    private void jCheckBox_Pembayaran_Shopepay_SpriteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox_Pembayaran_Shopepay_SpriteActionPerformed
        jTextField_Pembayaran_Shopepay_Sprite.setVisible(false);
        
        String harga_Shopepay_Sprite = jTextField_Harga_MinumanSprite.getText();
        jTextField_Pembayaran_Shopepay_Sprite.setText(harga_Shopepay_Sprite);
        
        if (jCheckBox_Pembayaran_Shopepay_Sprite.isSelected()) {
            jTextField_Pembayaran_Shopepay_Sprite.setVisible(true);
        }
    }//GEN-LAST:event_jCheckBox_Pembayaran_Shopepay_SpriteActionPerformed

    private void jCheckBox_Pembayaran_Langsung_SpriteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox_Pembayaran_Langsung_SpriteActionPerformed
        jTextField_Pembayaran_Langsung_Sprite.setVisible(false);
        
        String harga_Langsung_Sprite = jTextField_Harga_MinumanSprite.getText();
        jTextField_Pembayaran_Langsung_Sprite.setText(harga_Langsung_Sprite);
        
        if (jCheckBox_Pembayaran_Langsung_Sprite.isSelected()) {
            jTextField_Pembayaran_Langsung_Sprite.setVisible(true);
        }
    }//GEN-LAST:event_jCheckBox_Pembayaran_Langsung_SpriteActionPerformed

    private void jButton_BeliSekarangPembayaranSpriteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_BeliSekarangPembayaranSpriteActionPerformed
        String Harga_Sprite = jTextField_Harga_MinumanSprite.getText();
        String nama_User = jLabel_Username.getText();
        
        if (jCheckBox_Pembayaran_Dana_Sprite.isSelected()) {
            int notif_Dana_Sprite = JOptionPane.showConfirmDialog(this, "Silahkan Konfirmasi Pembayaran Anda , Total : "+Harga_Sprite);
            switch (notif_Dana_Sprite) {
                case JOptionPane.YES_OPTION -> {
                    Desktop dana = Desktop.getDesktop();
                    try {
                        dana.browse(new URI("https://www.dana.id/"));
                        System.out.println("Pembayaran "+nama_User+" Berhasil");
                        JOptionPane.showMessageDialog(this, "Terima Kasih Sudah Membayar, Pesanan Anda Akan Diantar");
                    } catch (IOException err) {
            
                    } catch (URISyntaxException err) {
            
                    }
                }
                case JOptionPane.NO_OPTION -> {
                    ;
                    JOptionPane.showMessageDialog(this, "Jadi Beli Gk Nih?");
                }
            }
        } else if (jCheckBox_Pembayaran_Ovo_Sprite.isSelected()){
            int notif_Ovo_Sprite = JOptionPane.showConfirmDialog(this, "Silahkan Konfirmasi Pembayaran Anda , Total : "+Harga_Sprite);
            switch (notif_Ovo_Sprite) {
                case JOptionPane.YES_OPTION -> {
                    Desktop ovo = Desktop.getDesktop();
                    try {
                        ovo.browse(new URI("https://www.ovo.id/"));
                        System.out.println("Pembayaran "+nama_User+" Berhasil");
                        JOptionPane.showMessageDialog(this, "Terima Kasih Sudah Membayar, Pesanan Anda Akan Diantar");
                    } catch (IOException err) {
            
                    } catch (URISyntaxException err) {
            
                    }
                }
                case JOptionPane.NO_OPTION -> {
                    ;
                    JOptionPane.showMessageDialog(this, "Jadi Beli Gk Nih?");
                }
            }
        } else if (jCheckBox_Pembayaran_Gopay_Sprite.isSelected()) {
            int notif_Gopay_Sprite = JOptionPane.showConfirmDialog(this, "Silahkan Konfirmasi Pembayaran Anda , Total : "+Harga_Sprite);
            switch (notif_Gopay_Sprite) {
                case JOptionPane.YES_OPTION -> {
                    Desktop gopay = Desktop.getDesktop();
                    try {
                        gopay.browse(new URI("https://gopay.co.id/"));
                        System.out.println("Pembayaran "+nama_User+" Berhasil");
                        JOptionPane.showMessageDialog(this, "Terima Kasih Sudah Membayar, Pesanan Anda Akan Diantar");
                    } catch (IOException err) {
            
                    } catch (URISyntaxException err) {
            
                    }
                }
                case JOptionPane.NO_OPTION -> {
                    ;
                    JOptionPane.showMessageDialog(this, "Jadi Beli Gk Nih?");
                }
            }      
        } else if (jCheckBox_Pembayaran_Shopepay_Sprite.isSelected()) {
            int notif_Shopepay_Sprite = JOptionPane.showConfirmDialog(this, "Silahkan Konfirmasi Pembayaran Anda , Total : "+Harga_Sprite);
            switch (notif_Shopepay_Sprite) {
                case JOptionPane.YES_OPTION -> {
                    Desktop shopepay = Desktop.getDesktop();
                    try {
                        shopepay.browse(new URI("https://shopeepay.co.id/"));
                        System.out.println("Pembayaran "+nama_User+" Berhasil");
                        JOptionPane.showMessageDialog(this, "Terima Kasih Sudah Membayar, Pesanan Anda Akan Diantar");
                    } catch (IOException err) {
            
                    } catch (URISyntaxException err) {
            
                    }
                }
                case JOptionPane.NO_OPTION -> {
                    ;
                    JOptionPane.showMessageDialog(this, "Jadi Beli Gk Nih?");
                }
            }
        } else if (jCheckBox_Pembayaran_Langsung_Sprite.isSelected()) {            
            JOptionPane.showMessageDialog(this, "Silahkan Untuk Membayar Di Kasir Dengan Total : "+Harga_Sprite);
        } else {
            JOptionPane.showMessageDialog(this, "Anda Harus Memilih Salah Satu");
        }
    }//GEN-LAST:event_jButton_BeliSekarangPembayaranSpriteActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ProgramWarnet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ProgramWarnet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ProgramWarnet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ProgramWarnet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new ProgramWarnet().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_Back;
    private javax.swing.JButton jButton_BackMilihKwetiawGoreng;
    private javax.swing.JButton jButton_BackMilihNasiGoreng;
    private javax.swing.JButton jButton_BackMilihSosTeng;
    private javax.swing.JButton jButton_BackPembayaranAirMineral;
    private javax.swing.JButton jButton_BackPembayaranCocaCola;
    private javax.swing.JButton jButton_BackPembayaranEsTeh;
    private javax.swing.JButton jButton_BackPembayaranKopi;
    private javax.swing.JButton jButton_BackPembayaranKwetiawGoreng;
    private javax.swing.JButton jButton_BackPembayaranMieBiasa;
    private javax.swing.JButton jButton_BackPembayaranMieTelur;
    private javax.swing.JButton jButton_BackPembayaranNasiGoreng;
    private javax.swing.JButton jButton_BackPembayaranSosteng;
    private javax.swing.JButton jButton_BackPembayaranSprite;
    private javax.swing.JButton jButton_Back_MinumanAirMineral;
    private javax.swing.JButton jButton_Back_MinumanCocaCola;
    private javax.swing.JButton jButton_Back_MinumanEsTeh;
    private javax.swing.JButton jButton_Back_MinumanKopi;
    private javax.swing.JButton jButton_Back_MinumanSprite;
    private javax.swing.JButton jButton_BeliSekarangPembayaranAirMineral;
    private javax.swing.JButton jButton_BeliSekarangPembayaranCocaCola;
    private javax.swing.JButton jButton_BeliSekarangPembayaranEsTeh;
    private javax.swing.JButton jButton_BeliSekarangPembayaranKopi;
    private javax.swing.JButton jButton_BeliSekarangPembayaranKwetiawGoreng;
    private javax.swing.JButton jButton_BeliSekarangPembayaranMieBiasa;
    private javax.swing.JButton jButton_BeliSekarangPembayaranMieTelur;
    private javax.swing.JButton jButton_BeliSekarangPembayaranNasiGoreng;
    private javax.swing.JButton jButton_BeliSekarangPembayaranSosteng;
    private javax.swing.JButton jButton_BeliSekarangPembayaranSprite;
    private javax.swing.JButton jButton_MieBiasa;
    private javax.swing.JButton jButton_MilihMieBiasaBack;
    private javax.swing.JButton jButton_MinusMieBiasa;
    private javax.swing.JButton jButton_MinusMieGorengTelur;
    private javax.swing.JButton jButton_MinusMilihKwetiawGoreng;
    private javax.swing.JButton jButton_MinusMilihNasiGoreng;
    private javax.swing.JButton jButton_MinusMilihSosTeng;
    private javax.swing.JButton jButton_Minus_MinumanAirMineral;
    private javax.swing.JButton jButton_Minus_MinumanCocaCola;
    private javax.swing.JButton jButton_Minus_MinumanEsTeh;
    private javax.swing.JButton jButton_Minus_MinumanKopi;
    private javax.swing.JButton jButton_Minus_MinumanSprite;
    private javax.swing.JButton jButton_PesanMilihKwetiawGoreng;
    private javax.swing.JButton jButton_PesanMilihMieGorengTelur;
    private javax.swing.JButton jButton_PesanMilihNasiGoreng;
    private javax.swing.JButton jButton_PesanMilihSosTeng;
    private javax.swing.JButton jButton_Pesan_MinumanAirMineral;
    private javax.swing.JButton jButton_Pesan_MinumanCocaCola;
    private javax.swing.JButton jButton_Pesan_MinumanEsTeh;
    private javax.swing.JButton jButton_Pesan_MinumanKopi;
    private javax.swing.JButton jButton_Pesan_MinumanSprite;
    private javax.swing.JButton jButton_PlusMieBiasa;
    private javax.swing.JButton jButton_PlusMieGorengTelur;
    private javax.swing.JButton jButton_PlusMilihKwetiawGoreng;
    private javax.swing.JButton jButton_PlusMilihNasiGoreng;
    private javax.swing.JButton jButton_PlusMilihSosTeng;
    private javax.swing.JButton jButton_Plus_MinumanAirMineral;
    private javax.swing.JButton jButton_Plus_MinumanCocaCola;
    private javax.swing.JButton jButton_Plus_MinumanEsTeh;
    private javax.swing.JButton jButton_Plus_MinumanKopi;
    private javax.swing.JButton jButton_Plus_MinumanSprite;
    private javax.swing.JCheckBox jCheckBox_Pembayaran_Dana_AirMineral;
    private javax.swing.JCheckBox jCheckBox_Pembayaran_Dana_CocaCola;
    private javax.swing.JCheckBox jCheckBox_Pembayaran_Dana_EsTeh;
    private javax.swing.JCheckBox jCheckBox_Pembayaran_Dana_Kopi;
    private javax.swing.JCheckBox jCheckBox_Pembayaran_Dana_KwetiawGoreng;
    private javax.swing.JCheckBox jCheckBox_Pembayaran_Dana_MieBiasa;
    private javax.swing.JCheckBox jCheckBox_Pembayaran_Dana_MieTelur;
    private javax.swing.JCheckBox jCheckBox_Pembayaran_Dana_NasiGoreng;
    private javax.swing.JCheckBox jCheckBox_Pembayaran_Dana_Sosteng;
    private javax.swing.JCheckBox jCheckBox_Pembayaran_Dana_Sprite;
    private javax.swing.JCheckBox jCheckBox_Pembayaran_Gopay_AirMineral;
    private javax.swing.JCheckBox jCheckBox_Pembayaran_Gopay_CocaCola;
    private javax.swing.JCheckBox jCheckBox_Pembayaran_Gopay_EsTeh;
    private javax.swing.JCheckBox jCheckBox_Pembayaran_Gopay_Kopi;
    private javax.swing.JCheckBox jCheckBox_Pembayaran_Gopay_KwetiawGoreng;
    private javax.swing.JCheckBox jCheckBox_Pembayaran_Gopay_MieBiasa;
    private javax.swing.JCheckBox jCheckBox_Pembayaran_Gopay_MieTelur;
    private javax.swing.JCheckBox jCheckBox_Pembayaran_Gopay_NasiGoreng;
    private javax.swing.JCheckBox jCheckBox_Pembayaran_Gopay_Sosteng;
    private javax.swing.JCheckBox jCheckBox_Pembayaran_Gopay_Sprite;
    private javax.swing.JCheckBox jCheckBox_Pembayaran_Langsung_AirMineral;
    private javax.swing.JCheckBox jCheckBox_Pembayaran_Langsung_CocaCola;
    private javax.swing.JCheckBox jCheckBox_Pembayaran_Langsung_EsTeh;
    private javax.swing.JCheckBox jCheckBox_Pembayaran_Langsung_Kopi;
    private javax.swing.JCheckBox jCheckBox_Pembayaran_Langsung_KwetiawGoreng;
    private javax.swing.JCheckBox jCheckBox_Pembayaran_Langsung_MieBiasa;
    private javax.swing.JCheckBox jCheckBox_Pembayaran_Langsung_MieTelur;
    private javax.swing.JCheckBox jCheckBox_Pembayaran_Langsung_NasiGoreng;
    private javax.swing.JCheckBox jCheckBox_Pembayaran_Langsung_Sosteng;
    private javax.swing.JCheckBox jCheckBox_Pembayaran_Langsung_Sprite;
    private javax.swing.JCheckBox jCheckBox_Pembayaran_Ovo_AirMineral;
    private javax.swing.JCheckBox jCheckBox_Pembayaran_Ovo_CocaCola;
    private javax.swing.JCheckBox jCheckBox_Pembayaran_Ovo_EsTeh;
    private javax.swing.JCheckBox jCheckBox_Pembayaran_Ovo_Kopi;
    private javax.swing.JCheckBox jCheckBox_Pembayaran_Ovo_KwetiawGoreng;
    private javax.swing.JCheckBox jCheckBox_Pembayaran_Ovo_MieTelur;
    private javax.swing.JCheckBox jCheckBox_Pembayaran_Ovo_Miebiasa;
    private javax.swing.JCheckBox jCheckBox_Pembayaran_Ovo_NasiGoreng;
    private javax.swing.JCheckBox jCheckBox_Pembayaran_Ovo_Sosteng;
    private javax.swing.JCheckBox jCheckBox_Pembayaran_Ovo_Sprite;
    private javax.swing.JCheckBox jCheckBox_Pembayaran_Shopepay_AirMineral;
    private javax.swing.JCheckBox jCheckBox_Pembayaran_Shopepay_CocaCola;
    private javax.swing.JCheckBox jCheckBox_Pembayaran_Shopepay_EsTeh;
    private javax.swing.JCheckBox jCheckBox_Pembayaran_Shopepay_Kopi;
    private javax.swing.JCheckBox jCheckBox_Pembayaran_Shopepay_KwetiawGoreng;
    private javax.swing.JCheckBox jCheckBox_Pembayaran_Shopepay_MieBiasa;
    private javax.swing.JCheckBox jCheckBox_Pembayaran_Shopepay_MieTelur;
    private javax.swing.JCheckBox jCheckBox_Pembayaran_Shopepay_NasiGoreng;
    private javax.swing.JCheckBox jCheckBox_Pembayaran_Shopepay_Sosteng;
    private javax.swing.JCheckBox jCheckBox_Pembayaran_Shopepay_Sprite;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel_AgeOfEmpire2;
    private javax.swing.JLabel jLabel_AirMineral;
    private javax.swing.JLabel jLabel_AllGames;
    private javax.swing.JLabel jLabel_AmongUs;
    private javax.swing.JLabel jLabel_AndroidGameLoop;
    private javax.swing.JLabel jLabel_AndroidGames;
    private javax.swing.JLabel jLabel_AndroidLdGame;
    private javax.swing.JLabel jLabel_AndroidNox;
    private javax.swing.JLabel jLabel_ApexLegends;
    private javax.swing.JLabel jLabel_Battlefield3;
    private javax.swing.JLabel jLabel_Chrome;
    private javax.swing.JLabel jLabel_CocaCola;
    private javax.swing.JLabel jLabel_Codm;
    private javax.swing.JLabel jLabel_Csgo;
    private javax.swing.JLabel jLabel_Dc;
    private javax.swing.JLabel jLabel_Destiny2;
    private javax.swing.JLabel jLabel_Discord;
    private javax.swing.JLabel jLabel_Dota2;
    private javax.swing.JLabel jLabel_EuroTruck2;
    private javax.swing.JLabel jLabel_Fortnite;
    private javax.swing.JLabel jLabel_GTAV;
    private javax.swing.JLabel jLabel_GambarWallpaper;
    private javax.swing.JLabel jLabel_Gambar_Game;
    private javax.swing.JLabel jLabel_Gambar_Home;
    private javax.swing.JLabel jLabel_Gambar_Logout;
    private javax.swing.JLabel jLabel_Gambar_Order;
    private javax.swing.JLabel jLabel_Gambar_Waktu;
    private javax.swing.JLabel jLabel_GameLoop;
    private javax.swing.JLabel jLabel_GameMenu;
    private javax.swing.JLabel jLabel_GtaSA;
    private javax.swing.JLabel jLabel_IceTea;
    private javax.swing.JLabel jLabel_JikaMilihAirMineral;
    private javax.swing.JLabel jLabel_JikaMilihCocaCola;
    private javax.swing.JLabel jLabel_JikaMilihEsTeh;
    private javax.swing.JLabel jLabel_JikaMilihKopi;
    private javax.swing.JLabel jLabel_JikaMilihKwetiawGoreng;
    private javax.swing.JLabel jLabel_JikaMilihNasiGoreng;
    private javax.swing.JLabel jLabel_JikaMilihSosTeng;
    private javax.swing.JLabel jLabel_JikaMilihSprite;
    private javax.swing.JLabel jLabel_KewtiawGoreng;
    private javax.swing.JLabel jLabel_Kopi;
    private javax.swing.JLabel jLabel_LdPlayer9;
    private javax.swing.JLabel jLabel_Left4dead2;
    private javax.swing.JLabel jLabel_Lol;
    private javax.swing.JLabel jLabel_Makanan;
    private javax.swing.JLabel jLabel_Menu;
    private javax.swing.JLabel jLabel_Menu1;
    private javax.swing.JLabel jLabel_MieBiasa;
    private javax.swing.JLabel jLabel_MieTelor;
    private javax.swing.JLabel jLabel_MilihMieGorengBiasa;
    private javax.swing.JLabel jLabel_MilihMieGorengTelur;
    private javax.swing.JLabel jLabel_Minuman;
    private javax.swing.JLabel jLabel_MotoGp2;
    private javax.swing.JLabel jLabel_MotoGp3;
    private javax.swing.JLabel jLabel_Mulai;
    private javax.swing.JLabel jLabel_NamaDiWaktu;
    private javax.swing.JLabel jLabel_NasiGoreng;
    private javax.swing.JLabel jLabel_Netbeans;
    private javax.swing.JLabel jLabel_Netflix;
    private javax.swing.JLabel jLabel_NetflixAllGames;
    private javax.swing.JLabel jLabel_Nox;
    private javax.swing.JLabel jLabel_OfflineAgeOfEmpire2;
    private javax.swing.JLabel jLabel_OfflineBattleField3;
    private javax.swing.JLabel jLabel_OfflineGTASA;
    private javax.swing.JLabel jLabel_OfflineGTAV;
    private javax.swing.JLabel jLabel_OfflineGames;
    private javax.swing.JLabel jLabel_OfflineMotoGp2;
    private javax.swing.JLabel jLabel_OfflineMotoGp3;
    private javax.swing.JLabel jLabel_OnlineAmongUS;
    private javax.swing.JLabel jLabel_OnlineApexLegends;
    private javax.swing.JLabel jLabel_OnlineCODM;
    private javax.swing.JLabel jLabel_OnlineCSGO;
    private javax.swing.JLabel jLabel_OnlineDestiny2;
    private javax.swing.JLabel jLabel_OnlineDota2;
    private javax.swing.JLabel jLabel_OnlineEuroTruck2;
    private javax.swing.JLabel jLabel_OnlineFortnite;
    private javax.swing.JLabel jLabel_OnlineGTAV;
    private javax.swing.JLabel jLabel_OnlineGames;
    private javax.swing.JLabel jLabel_OnlineGames_AmongUs;
    private javax.swing.JLabel jLabel_OnlineGames_ApexLegends;
    private javax.swing.JLabel jLabel_OnlineGames_CODM;
    private javax.swing.JLabel jLabel_OnlineGames_CSGO;
    private javax.swing.JLabel jLabel_OnlineGames_Destiny2;
    private javax.swing.JLabel jLabel_OnlineGames_Dota2;
    private javax.swing.JLabel jLabel_OnlineGames_EuroTruck2;
    private javax.swing.JLabel jLabel_OnlineGames_Fortnite;
    private javax.swing.JLabel jLabel_OnlineGames_GTAV;
    private javax.swing.JLabel jLabel_OnlineGames_LOL;
    private javax.swing.JLabel jLabel_OnlineGames_Left4Dead2;
    private javax.swing.JLabel jLabel_OnlineGames_Lostsaga;
    private javax.swing.JLabel jLabel_OnlineGames_Steam;
    private javax.swing.JLabel jLabel_OnlineGames_Valorant;
    private javax.swing.JLabel jLabel_OnlineLOL;
    private javax.swing.JLabel jLabel_OnlineLeft4Dead2;
    private javax.swing.JLabel jLabel_OnlineLostSaga;
    private javax.swing.JLabel jLabel_OnlineSteam;
    private javax.swing.JLabel jLabel_OnlineValorant;
    private javax.swing.JLabel jLabel_Pembayaran_Dana_AirMineral;
    private javax.swing.JLabel jLabel_Pembayaran_Dana_CocaCola;
    private javax.swing.JLabel jLabel_Pembayaran_Dana_EsTeh;
    private javax.swing.JLabel jLabel_Pembayaran_Dana_Kopi;
    private javax.swing.JLabel jLabel_Pembayaran_Dana_KwetiawGoreng;
    private javax.swing.JLabel jLabel_Pembayaran_Dana_MieBiasa;
    private javax.swing.JLabel jLabel_Pembayaran_Dana_MieTelur;
    private javax.swing.JLabel jLabel_Pembayaran_Dana_NasiGoreng;
    private javax.swing.JLabel jLabel_Pembayaran_Dana_Sosteng;
    private javax.swing.JLabel jLabel_Pembayaran_Dana_Sprite;
    private javax.swing.JLabel jLabel_Pembayaran_Gopay_AirMineral;
    private javax.swing.JLabel jLabel_Pembayaran_Gopay_CocaCola;
    private javax.swing.JLabel jLabel_Pembayaran_Gopay_EsTeh;
    private javax.swing.JLabel jLabel_Pembayaran_Gopay_Kopi;
    private javax.swing.JLabel jLabel_Pembayaran_Gopay_KwetiawGoreng;
    private javax.swing.JLabel jLabel_Pembayaran_Gopay_MieBiasa;
    private javax.swing.JLabel jLabel_Pembayaran_Gopay_MieTelur;
    private javax.swing.JLabel jLabel_Pembayaran_Gopay_NasiGoreng;
    private javax.swing.JLabel jLabel_Pembayaran_Gopay_Sosteng;
    private javax.swing.JLabel jLabel_Pembayaran_Gopay_Sprite;
    private javax.swing.JLabel jLabel_Pembayaran_Langsung_AirMineral;
    private javax.swing.JLabel jLabel_Pembayaran_Langsung_CocaCola;
    private javax.swing.JLabel jLabel_Pembayaran_Langsung_EsTeh;
    private javax.swing.JLabel jLabel_Pembayaran_Langsung_Kopi;
    private javax.swing.JLabel jLabel_Pembayaran_Langsung_KwetiawGoreng;
    private javax.swing.JLabel jLabel_Pembayaran_Langsung_MieBiasa;
    private javax.swing.JLabel jLabel_Pembayaran_Langsung_MieTelur;
    private javax.swing.JLabel jLabel_Pembayaran_Langsung_NasiGoreng;
    private javax.swing.JLabel jLabel_Pembayaran_Langsung_Sosteng;
    private javax.swing.JLabel jLabel_Pembayaran_Langsung_Sprite;
    private javax.swing.JLabel jLabel_Pembayaran_Ovo_AirMineral;
    private javax.swing.JLabel jLabel_Pembayaran_Ovo_CocaCola;
    private javax.swing.JLabel jLabel_Pembayaran_Ovo_EsTeh;
    private javax.swing.JLabel jLabel_Pembayaran_Ovo_Kopi;
    private javax.swing.JLabel jLabel_Pembayaran_Ovo_Kwetiaw;
    private javax.swing.JLabel jLabel_Pembayaran_Ovo_MieBiasa;
    private javax.swing.JLabel jLabel_Pembayaran_Ovo_MieTelur;
    private javax.swing.JLabel jLabel_Pembayaran_Ovo_NasiGoreng;
    private javax.swing.JLabel jLabel_Pembayaran_Ovo_Sosteng;
    private javax.swing.JLabel jLabel_Pembayaran_Ovo_Sprite;
    private javax.swing.JLabel jLabel_Pembayaran_ShopePay_MieBiasa;
    private javax.swing.JLabel jLabel_Pembayaran_ShopeePay_MieTelur;
    private javax.swing.JLabel jLabel_Pembayaran_Shopepay_AirMineral;
    private javax.swing.JLabel jLabel_Pembayaran_Shopepay_CocaCola;
    private javax.swing.JLabel jLabel_Pembayaran_Shopepay_EsTeh;
    private javax.swing.JLabel jLabel_Pembayaran_Shopepay_Kopi;
    private javax.swing.JLabel jLabel_Pembayaran_Shopepay_KwetiawGoreng;
    private javax.swing.JLabel jLabel_Pembayaran_Shopepay_NasiGoreng;
    private javax.swing.JLabel jLabel_Pembayaran_Shopepay_Sosteng;
    private javax.swing.JLabel jLabel_Pembayaran_Shopepay_Sprite;
    private javax.swing.JLabel jLabel_Profile;
    private javax.swing.JLabel jLabel_SaldoWaktu;
    private javax.swing.JLabel jLabel_SelamatDatang;
    private javax.swing.JLabel jLabel_SosTeng;
    private javax.swing.JLabel jLabel_Spotify;
    private javax.swing.JLabel jLabel_Sprite;
    private javax.swing.JLabel jLabel_Steam;
    private javax.swing.JLabel jLabel_SteamAllGames;
    private javax.swing.JLabel jLabel_Tanggal;
    private javax.swing.JLabel jLabel_Tiktok;
    private javax.swing.JLabel jLabel_TournamentInfo;
    private javax.swing.JLabel jLabel_TulisanAgeOfEmpire2;
    private javax.swing.JLabel jLabel_TulisanAllNetflix;
    private javax.swing.JLabel jLabel_TulisanAllSteam;
    private javax.swing.JLabel jLabel_TulisanAllWhatsApp;
    private javax.swing.JLabel jLabel_TulisanAmongUs;
    private javax.swing.JLabel jLabel_TulisanAndroidGameLoop;
    private javax.swing.JLabel jLabel_TulisanAndroidLdPlayer9;
    private javax.swing.JLabel jLabel_TulisanAndroidNox;
    private javax.swing.JLabel jLabel_TulisanApexLegends;
    private javax.swing.JLabel jLabel_TulisanBantuKami;
    private javax.swing.JLabel jLabel_TulisanBattleField3;
    private javax.swing.JLabel jLabel_TulisanBelumUpdate;
    private javax.swing.JLabel jLabel_TulisanCSGO;
    private javax.swing.JLabel jLabel_TulisanChrome;
    private javax.swing.JLabel jLabel_TulisanCodMobile;
    private javax.swing.JLabel jLabel_TulisanDc;
    private javax.swing.JLabel jLabel_TulisanDestiny2;
    private javax.swing.JLabel jLabel_TulisanDiscord;
    private javax.swing.JLabel jLabel_TulisanDota2;
    private javax.swing.JLabel jLabel_TulisanEuroTruck2;
    private javax.swing.JLabel jLabel_TulisanFortnite;
    private javax.swing.JLabel jLabel_TulisanGTASanAndreas;
    private javax.swing.JLabel jLabel_TulisanGTAV;
    private javax.swing.JLabel jLabel_TulisanGameLoop;
    private javax.swing.JLabel jLabel_TulisanGameMenu;
    private javax.swing.JLabel jLabel_TulisanLDPlayer9;
    private javax.swing.JLabel jLabel_TulisanLOL;
    private javax.swing.JLabel jLabel_TulisanLeft4Dead2;
    private javax.swing.JLabel jLabel_TulisanLostsaga;
    private javax.swing.JLabel jLabel_TulisanMenghubungi;
    private javax.swing.JLabel jLabel_TulisanMotoGp2;
    private javax.swing.JLabel jLabel_TulisanMotoGp3;
    private javax.swing.JLabel jLabel_TulisanNetbeans;
    private javax.swing.JLabel jLabel_TulisanNetflix;
    private javax.swing.JLabel jLabel_TulisanNox;
    private javax.swing.JLabel jLabel_TulisanOfflineAgeOfEmpire2;
    private javax.swing.JLabel jLabel_TulisanOfflineBattleField3;
    private javax.swing.JLabel jLabel_TulisanOfflineGTAV;
    private javax.swing.JLabel jLabel_TulisanOfflineGtaSA;
    private javax.swing.JLabel jLabel_TulisanOfflineMotoGp2;
    private javax.swing.JLabel jLabel_TulisanOfflineMotoGp3;
    private javax.swing.JLabel jLabel_TulisanSpotify;
    private javax.swing.JLabel jLabel_TulisanSteam;
    private javax.swing.JLabel jLabel_TulisanTerimaKasih;
    private javax.swing.JLabel jLabel_TulisanTiktok;
    private javax.swing.JLabel jLabel_TulisanValorant;
    private javax.swing.JLabel jLabel_TulisanVisualStudioCode;
    private javax.swing.JLabel jLabel_TulisanWarcraft;
    private javax.swing.JLabel jLabel_Tulisan_Game;
    private javax.swing.JLabel jLabel_Tulisan_Home;
    private javax.swing.JLabel jLabel_Tulisan_Logout;
    private javax.swing.JLabel jLabel_Tulisan_Order;
    private javax.swing.JLabel jLabel_Tulisan_Waktu;
    private javax.swing.JLabel jLabel_Username;
    private javax.swing.JLabel jLabel_Valorant;
    private javax.swing.JLabel jLabel_VisualStudioCode;
    private javax.swing.JLabel jLabel_WaktuMenuAwal;
    private javax.swing.JLabel jLabel_WaktuSekarang;
    private javax.swing.JLabel jLabel_WaktuYgTerpakai;
    private javax.swing.JLabel jLabel_Warcraft;
    private javax.swing.JLabel jLabel_Whatsapp;
    private javax.swing.JLabel jLabel_lostsaga;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel_AndroidGames;
    private javax.swing.JPanel jPanel_Body_AllGames;
    private javax.swing.JPanel jPanel_Game;
    private javax.swing.JPanel jPanel_HeaderOrder;
    private javax.swing.JPanel jPanel_Header_Game;
    private javax.swing.JPanel jPanel_Header_Nickname;
    private javax.swing.JPanel jPanel_Home;
    private javax.swing.JPanel jPanel_JikaDiaMemilihMakananKwetiawGoreng;
    private javax.swing.JPanel jPanel_JikaDiaMemilihMakananMieTelur;
    private javax.swing.JPanel jPanel_JikaDiaMemilihMakananNasiGoreng;
    private javax.swing.JPanel jPanel_JikaDiaMemilihMinumanAirMineral;
    private javax.swing.JPanel jPanel_JikaDiaMemilihMinumanCocaCola;
    private javax.swing.JPanel jPanel_JikaDiaMemilihMinumanEsTeh;
    private javax.swing.JPanel jPanel_JikaDiaMemilihMinumanKopi;
    private javax.swing.JPanel jPanel_JikaDiaMemilihMinumanSprite;
    private javax.swing.JPanel jPanel_JikaDiaPesanAirMineral;
    private javax.swing.JPanel jPanel_JikaDiaPesanCocaCola;
    private javax.swing.JPanel jPanel_JikaDiaPesanEsTeh;
    private javax.swing.JPanel jPanel_JikaDiaPesanKopi;
    private javax.swing.JPanel jPanel_JikaDiaPesanKwetiawGoreng;
    private javax.swing.JPanel jPanel_JikaDiaPesanMieBiasa;
    private javax.swing.JPanel jPanel_JikaDiaPesanMieTelur;
    private javax.swing.JPanel jPanel_JikaDiaPesanNasiGoreng;
    private javax.swing.JPanel jPanel_JikaDiaPesanSosTeng;
    private javax.swing.JPanel jPanel_JikaDiaPesanSprite;
    private javax.swing.JPanel jPanel_JikaMemilihMakananSosTeng;
    private javax.swing.JPanel jPanel_JikaPilihMakananMiebiasa;
    private javax.swing.JPanel jPanel_Makanan;
    private javax.swing.JPanel jPanel_MenuDashboard;
    private javax.swing.JPanel jPanel_Minuman;
    private javax.swing.JPanel jPanel_OfflineGames;
    private javax.swing.JPanel jPanel_OnlineGames;
    private javax.swing.JPanel jPanel_Order;
    private javax.swing.JPanel jPanel_Waktu;
    private javax.swing.JTextField jTextField_HargaMieBiasa;
    private javax.swing.JTextField jTextField_HargaMilihKwetiawGoreng;
    private javax.swing.JTextField jTextField_HargaMilihNasiGoreng;
    private javax.swing.JTextField jTextField_HargaMilihSosTeng;
    private javax.swing.JTextField jTextField_Harga_MinumanAirMineral;
    private javax.swing.JTextField jTextField_Harga_MinumanCocaCola;
    private javax.swing.JTextField jTextField_Harga_MinumanEsTeh;
    private javax.swing.JTextField jTextField_Harga_MinumanKopi;
    private javax.swing.JTextField jTextField_Harga_MinumanSprite;
    private javax.swing.JTextField jTextField_JumlahMieBiasa;
    private javax.swing.JTextField jTextField_JumlahMilihKwetiawGoreng;
    private javax.swing.JTextField jTextField_JumlahMilihNasiGoreng;
    private javax.swing.JTextField jTextField_JumlahMilihSosTeng;
    private javax.swing.JTextField jTextField_Jumlah_MinumanAirMineral;
    private javax.swing.JTextField jTextField_Jumlah_MinumanCocaCola;
    private javax.swing.JTextField jTextField_Jumlah_MinumanEsTeh;
    private javax.swing.JTextField jTextField_Jumlah_MinumanKopi;
    private javax.swing.JTextField jTextField_Jumlah_MinumanSprite;
    private javax.swing.JTextField jTextField_MilihMieGorengTelur_Harga;
    private javax.swing.JTextField jTextField_MilihMieGorengTelur_Jumlah;
    private javax.swing.JTextField jTextField_Pembayaran_Dana_AirMineral;
    private javax.swing.JTextField jTextField_Pembayaran_Dana_CocaCola;
    private javax.swing.JTextField jTextField_Pembayaran_Dana_EsTeh;
    private javax.swing.JTextField jTextField_Pembayaran_Dana_Kopi;
    private javax.swing.JTextField jTextField_Pembayaran_Dana_KwetiawGoreng;
    private javax.swing.JTextField jTextField_Pembayaran_Dana_MieBiasa;
    private javax.swing.JTextField jTextField_Pembayaran_Dana_MieTelur;
    private javax.swing.JTextField jTextField_Pembayaran_Dana_NasiGoreng;
    private javax.swing.JTextField jTextField_Pembayaran_Dana_Sosteng;
    private javax.swing.JTextField jTextField_Pembayaran_Dana_Sprite;
    private javax.swing.JTextField jTextField_Pembayaran_Gopay_AirMineral;
    private javax.swing.JTextField jTextField_Pembayaran_Gopay_CocaCola;
    private javax.swing.JTextField jTextField_Pembayaran_Gopay_EsTeh;
    private javax.swing.JTextField jTextField_Pembayaran_Gopay_Kopi;
    private javax.swing.JTextField jTextField_Pembayaran_Gopay_KwetiawGoreng;
    private javax.swing.JTextField jTextField_Pembayaran_Gopay_MieBiasa;
    private javax.swing.JTextField jTextField_Pembayaran_Gopay_MieTelur;
    private javax.swing.JTextField jTextField_Pembayaran_Gopay_NasiGoreng;
    private javax.swing.JTextField jTextField_Pembayaran_Gopay_Sosteng;
    private javax.swing.JTextField jTextField_Pembayaran_Gopay_Sprite;
    private javax.swing.JTextField jTextField_Pembayaran_Langsung_AirMineral;
    private javax.swing.JTextField jTextField_Pembayaran_Langsung_CocaCola;
    private javax.swing.JTextField jTextField_Pembayaran_Langsung_EsTeh;
    private javax.swing.JTextField jTextField_Pembayaran_Langsung_Kopi;
    private javax.swing.JTextField jTextField_Pembayaran_Langsung_KwetiawGoreng;
    private javax.swing.JTextField jTextField_Pembayaran_Langsung_MieBiasa;
    private javax.swing.JTextField jTextField_Pembayaran_Langsung_MieTelur;
    private javax.swing.JTextField jTextField_Pembayaran_Langsung_NasiGoreng;
    private javax.swing.JTextField jTextField_Pembayaran_Langsung_Sosteng;
    private javax.swing.JTextField jTextField_Pembayaran_Langsung_Sprite;
    private javax.swing.JTextField jTextField_Pembayaran_Ovo_AirMineral;
    private javax.swing.JTextField jTextField_Pembayaran_Ovo_CocaCola;
    private javax.swing.JTextField jTextField_Pembayaran_Ovo_EsTeh;
    private javax.swing.JTextField jTextField_Pembayaran_Ovo_Kopi;
    private javax.swing.JTextField jTextField_Pembayaran_Ovo_KwetiawGoreng;
    private javax.swing.JTextField jTextField_Pembayaran_Ovo_MieBiasa;
    private javax.swing.JTextField jTextField_Pembayaran_Ovo_MieTelur;
    private javax.swing.JTextField jTextField_Pembayaran_Ovo_NasiGoreng;
    private javax.swing.JTextField jTextField_Pembayaran_Ovo_Sosteng;
    private javax.swing.JTextField jTextField_Pembayaran_Ovo_Sprite;
    private javax.swing.JTextField jTextField_Pembayaran_Shopepay_AirMineral;
    private javax.swing.JTextField jTextField_Pembayaran_Shopepay_CocaCola;
    private javax.swing.JTextField jTextField_Pembayaran_Shopepay_EsTeh;
    private javax.swing.JTextField jTextField_Pembayaran_Shopepay_Kopi;
    private javax.swing.JTextField jTextField_Pembayaran_Shopepay_KwetiawGoreng;
    private javax.swing.JTextField jTextField_Pembayaran_Shopepay_MieBiasa;
    private javax.swing.JTextField jTextField_Pembayaran_Shopepay_MieTelur;
    private javax.swing.JTextField jTextField_Pembayaran_Shopepay_NasiGoreng;
    private javax.swing.JTextField jTextField_Pembayaran_Shopepay_Sosteng;
    private javax.swing.JTextField jTextField_Pembayaran_Shopepay_Sprite;
    private javax.swing.JTextField jTextField_Search;
    // End of variables declaration//GEN-END:variables
}
