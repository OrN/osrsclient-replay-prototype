import java.applet.Applet;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Container;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Insets;
import java.awt.LayoutManager;
import java.awt.Rectangle;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.StringSelection;
import java.awt.event.ActionEvent;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.awt.image.ImageObserver;
import java.lang.management.GarbageCollectorMXBean;
import java.lang.management.ManagementFactory;
import java.net.URL;
import java.util.Iterator;

// $FF: renamed from: af
public abstract class GameApplet extends Applet implements Runnable, FocusListener, WindowListener {

   // $FF: renamed from: t int
   int field_1374;
   // $FF: renamed from: n af
   static GameApplet field_1375;
   // $FF: renamed from: am boolean
   volatile boolean field_1376;
   // $FF: renamed from: p long
   static long field_1377;
   // $FF: renamed from: j boolean
   static boolean field_1378;
   // $FF: renamed from: ak long
   static long field_1379;
   // $FF: renamed from: d int
   static int field_1380;
   // $FF: renamed from: r boolean
   boolean field_1381;
   // $FF: renamed from: u int
   protected static int field_1382;
   // $FF: renamed from: l ez
   protected static class_191 field_1383;
   // $FF: renamed from: ab int
   int field_1384;
   // $FF: renamed from: e int
   static int field_1385;
   // $FF: renamed from: g long[]
   protected static long[] field_1386;
   // $FF: renamed from: a int
   static int field_1387;
   // $FF: renamed from: s int
   static int field_1388;
   // $FF: renamed from: m int
   protected int field_1389;
   // $FF: renamed from: z int
   int field_1390;
   // $FF: renamed from: aq boolean
   static volatile boolean field_1391;
   // $FF: renamed from: v dp
   protected static Connection connection;
   // $FF: renamed from: ae int
   int field_1393;
   // $FF: renamed from: ap int
   int field_1394;
   // $FF: renamed from: i int
   int field_1395;
   // $FF: renamed from: ai java.awt.Frame
   Frame field_1396;
   // $FF: renamed from: ar java.awt.Canvas
   Canvas field_1397;
   // $FF: renamed from: f int
   static int field_1398;
   // $FF: renamed from: ax java.awt.Image
   static Image field_1399;
   // $FF: renamed from: as int
   static int field_1400;
   // $FF: renamed from: aj boolean
   boolean field_1401;
   // $FF: renamed from: ao java.awt.EventQueue
   final EventQueue field_1402;
   // $FF: renamed from: ay long
   static long field_1403;
   // $FF: renamed from: k int
   protected int field_1404;
   // $FF: renamed from: ah java.awt.datatransfer.Clipboard
   Clipboard field_1405;
   // $FF: renamed from: h int
   static final int field_1406 = 7;
   // $FF: renamed from: c long[]
   protected static long[] field_1407;
   // $FF: renamed from: az long
   volatile long field_1408;
   // $FF: renamed from: ag boolean
   volatile boolean field_1409;
   // $FF: renamed from: qg oh
   static class_67 field_1410;
   // $FF: renamed from: at am
   class_133 field_1411;


   // $FF: renamed from: bj () void
   void method_2293() {
      int var1 = -1437613301 * this.field_1390;
      int var2 = -179382835 * this.field_1374;
      int var3 = this.field_1404 * -1091351445 - 646214551 * class_137.field_1766 - var1;
      int var4 = -2128033235 * this.field_1389 - -1538307343 * class_58.field_460 - var2;
      if(var1 > 0 || var3 > 0 || var2 > 0 || var4 > 0) {
         try {
            Container var5 = this.method_2325(1142166715);
            int var6 = 0;
            int var7 = 0;
            if(this.field_1396 == var5) {
               Insets var8 = this.field_1396.getInsets();
               var6 = var8.left;
               var7 = var8.top;
            }

            Graphics var10 = var5.getGraphics();
            var10.setColor(Color.black);
            if(var1 > 0) {
               var10.fillRect(var6, var7, var1, this.field_1389 * -2128033235);
            }

            if(var2 > 0) {
               var10.fillRect(var6, var7, this.field_1404 * -1091351445, var2);
            }

            if(var3 > 0) {
               var10.fillRect(this.field_1404 * -1091351445 + var6 - var3, var7, var3, -2128033235 * this.field_1389);
            }

            if(var4 > 0) {
               var10.fillRect(var6, -2128033235 * this.field_1389 + var7 - var4, this.field_1404 * -1091351445, var4);
            }
         } catch (Exception var9) {
            ;
         }
      }

   }

   // $FF: renamed from: p (int, int, int) void
   protected final void method_2294(int var1, int var2, int var3) {
      try {
         label22: {
            if(this.field_1394 * 59571423 == var1) {
               if(var3 <= -1253227524) {
                  throw new IllegalStateException();
               }

               if(this.field_1384 * -45318295 == var2) {
                  break label22;
               }

               if(var3 <= -1253227524) {
                  throw new IllegalStateException();
               }
            }

            this.method_2312();
         }

         this.field_1394 = var1 * -1004683489;
         this.field_1384 = var2 * -605552423;
      } catch (RuntimeException var4) {
         throw class_223.method_4281(var4);
      }
   }

   // $FF: renamed from: j (java.lang.Object, byte) void
   final void method_2295(Object var1, byte var2) {
      try {
         if(this.field_1402 == null) {
            if(var2 <= 0) {
               throw new IllegalStateException();
            }
         } else {
            for(int var3 = 0; var3 < 50 && this.field_1402.peekEvent() != null; ++var3) {
               if(var2 <= 0) {
                  throw new IllegalStateException();
               }

               try {
                  Thread.sleep(1L);
               } catch (InterruptedException var5) {
                  ;
               }
            }

            if(null != var1) {
               if(var2 <= 0) {
                  throw new IllegalStateException();
               }

               this.field_1402.postEvent(new ActionEvent(var1, 1001, "dummy"));
            }

         }
      } catch (RuntimeException var6) {
         throw class_223.method_4281(var6);
      }
   }

   // $FF: renamed from: r (byte) dw
   protected class_5 method_2296(byte var1) {
      try {
         if(null == this.field_1411) {
            if(var1 >= 2) {
               throw new IllegalStateException();
            }

            class_133 var10001 = new class_133();
            this.field_1411 = var10001;
            this.field_1411.method_2911(this.field_1397);
         }

         return this.field_1411;
      } catch (RuntimeException var2) {
         throw class_223.method_4281(var2);
      }
   }

   // $FF: renamed from: dm (int, java.lang.String, boolean) void
   protected final void method_2297(int var1, String var2, boolean var3) {
      try {
         Graphics var4 = this.field_1397.getGraphics();
         if(class_83.field_780 == null) {
            class_83.field_780 = new Font("Helvetica", 1, 13);
            class_349.field_3938 = this.field_1397.getFontMetrics(class_83.field_780);
         }

         if(var3) {
            var4.setColor(Color.black);
            var4.fillRect(0, 0, 874334713 * class_137.field_1766, class_58.field_460 * 845542975);
         }

         Color var5 = new Color(140, 17, 17);

         try {
            if(field_1399 == null) {
               field_1399 = this.field_1397.createImage(1147168512, 100147886);
            }

            Graphics var6 = field_1399.getGraphics();
            var6.setColor(var5);
            var6.drawRect(0, 0, 303, 33);
            var6.fillRect(2, 2, var1 * 3, 30);
            var6.setColor(Color.black);
            var6.drawRect(1, 1, -2115428706, -113468306);
            var6.fillRect(2 + var1 * 3, 2, 300 - var1 * 3, 30);
            var6.setFont(class_83.field_780);
            var6.setColor(Color.white);
            var6.drawString(var2, (1214741657 - class_349.field_3938.stringWidth(var2)) / 2, 22);
            var4.drawImage(field_1399, 646214551 * class_137.field_1766 / 2 - -1745828144, class_58.field_460 * 1391694112 / 2 - 18, (ImageObserver)null);
         } catch (Exception var9) {
            int var7 = class_137.field_1766 * 1767230358 / 2 - 152;
            int var8 = class_58.field_460 * 406694549 / 2 - 18;
            var4.setColor(var5);
            var4.drawRect(var7, var8, 303, 56034678);
            var4.fillRect(var7 + 2, var8 + 2, var1 * 3, 30);
            var4.setColor(Color.black);
            var4.drawRect(var7 + 1, var8 + 1, 301, 1791565584);
            var4.fillRect(var7 + 2 + 3 * var1, var8 + 2, 300 - 3 * var1, 30);
            var4.setFont(class_83.field_780);
            var4.setColor(Color.white);
            var4.drawString(var2, var7 + (304 - class_349.field_3938.stringWidth(var2)) / 2, var8 + 22);
         }
      } catch (Exception var10) {
         this.field_1397.repaint();
      }

   }

   // $FF: renamed from: cm () void
   void method_2298() {
      long var1 = class_87.method_1516((byte)1);
      long var3 = field_1386[1202015039 * field_1387];
      field_1386[1202015039 * field_1387] = var1;
      field_1387 = -454548289 * (1 + 1202015039 * field_1387 & 31);
      if(var3 != 0L && var1 > var3) {
         ;
      }

      synchronized(this) {
         class_244.field_2708 = field_1391;
      }

      this.method_2413((byte)81);
   }

   // $FF: renamed from: s (int) void
   protected final void method_2299() {
      try {
         class_287.method_5276(754026835);
         class_162.method_3417(this.field_1397);
      } catch (RuntimeException var2) {
         throw class_223.method_4281(var2);
      }
   }

   // $FF: renamed from: da () void
   protected abstract void method_2300();

   // $FF: renamed from: ep () java.awt.Container
   Container method_2301() {
      return (Container)(null != this.field_1396?this.field_1396:this);
   }

   // $FF: renamed from: o (byte) void
   protected abstract void method_2302(byte var1);

   // $FF: renamed from: c (int) void
   void method_2303(int var1) {
      try {
         int var2 = -1437613301 * this.field_1390;
         int var3 = -179382835 * this.field_1374;
         int var4 = this.field_1404 * -1091351445 - 646214551 * class_137.field_1766 - var2;
         int var5 = -2128033235 * this.field_1389 - -1538307343 * class_58.field_460 - var3;
         if(var2 <= 0) {
            if(var1 != 2101906226) {
               return;
            }

            if(var4 <= 0) {
               if(var1 != 2101906226) {
                  throw new IllegalStateException();
               }

               if(var3 <= 0) {
                  if(var1 != 2101906226) {
                     throw new IllegalStateException();
                  }

                  if(var5 <= 0) {
                     return;
                  }
               }
            }
         }

         try {
            Container var6 = this.method_2325(1142166715);
            int var7 = 0;
            int var8 = 0;
            if(this.field_1396 == var6) {
               if(var1 != 2101906226) {
                  throw new IllegalStateException();
               }

               Insets var9 = this.field_1396.getInsets();
               var7 = var9.left;
               var8 = var9.top;
            }

            Graphics var12 = var6.getGraphics();
            var12.setColor(Color.black);
            if(var2 > 0) {
               if(var1 != 2101906226) {
                  throw new IllegalStateException();
               }

               var12.fillRect(var7, var8, var2, this.field_1389 * -2128033235);
            }

            if(var3 > 0) {
               if(var1 != 2101906226) {
                  return;
               }

               var12.fillRect(var7, var8, this.field_1404 * -1091351445, var3);
            }

            if(var4 > 0) {
               if(var1 != 2101906226) {
                  return;
               }

               var12.fillRect(this.field_1404 * -1091351445 + var7 - var4, var8, var4, -2128033235 * this.field_1389);
            }

            if(var5 > 0) {
               var12.fillRect(var7, -2128033235 * this.field_1389 + var8 - var5, this.field_1404 * -1091351445, var5);
            }
         } catch (Exception var10) {
            ;
         }

      } catch (RuntimeException var11) {
         throw class_223.method_4281(var11);
      }
   }

   // $FF: renamed from: e (byte) void
   final void method_2304(byte var1) {
      try {
         class_154.method_3245(this.field_1397);
         Canvas var2 = this.field_1397;
         var2.removeMouseListener(GameMouseListener.instance);
         var2.removeMouseMotionListener(GameMouseListener.instance);
         var2.removeFocusListener(GameMouseListener.instance);
         GameMouseListener.buttonsPressed = 0;
         if(this.field_1411 != null) {
            this.field_1411.method_2908(this.field_1397);
         }

         this.method_2306(-1567592382);
         class_162.method_3417(this.field_1397);
         Canvas var3 = this.field_1397;
         var3.addMouseListener(GameMouseListener.instance);
         var3.addMouseMotionListener(GameMouseListener.instance);
         var3.addFocusListener(GameMouseListener.instance);
         if(this.field_1411 != null) {
            if(var1 != 6) {
               throw new IllegalStateException();
            }

            this.field_1411.method_2911(this.field_1397);
         }

         this.method_2312();
      } catch (RuntimeException var4) {
         throw class_223.method_4281(var4);
      }
   }

   // $FF: renamed from: g (int, int, int, int) void
   protected final void method_2305(int var1, int var2, int var3, int var4) {
      try {
         try {
            if(null != field_1375) {
               field_1398 += 192447753;
               if(field_1398 * 661166393 >= 3) {
                  if(var4 == -1351365437) {
                     throw new IllegalStateException();
                  }

                  this.method_2324("alreadyloaded", (byte)-1);
                  return;
               }

               this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
               return;
            }

            field_1375 = this;
            class_137.field_1766 = var1 * 1249721383;
            class_58.field_460 = var2 * -1394579951;
            class_405.field_4295 = 582907681 * var3;
            class_405.field_4296 = this;
            if(null == connection) {
               if(var4 == -1351365437) {
                  throw new IllegalStateException();
               }

               Connection var10000 = new Connection();
               connection = var10000;
            }

            connection.method_4058(this, 1);
         } catch (Exception var6) {
            class_308.method_5523((String)null, var6, 1876892877);
            this.method_2324("crash", (byte)-1);
         }

      } catch (RuntimeException var7) {
         throw class_223.method_4281(var7);
      }
   }

   // $FF: renamed from: a (int) void
   final synchronized void method_2306(int var1) {
      try {
         Container var2 = this.method_2325(1142166715);
         if(this.field_1397 != null) {
            if(var1 == -1073188219) {
               throw new IllegalStateException();
            }

            this.field_1397.removeFocusListener(this);
            var2.remove(this.field_1397);
         }

         class_137.field_1766 = Math.max(var2.getWidth(), -1558391463 * this.field_1395) * 1249721383;
         class_58.field_460 = Math.max(var2.getHeight(), this.field_1393 * -422930921) * -1394579951;
         Insets var3;
         if(this.field_1396 != null) {
            if(var1 == -1073188219) {
               throw new IllegalStateException();
            }

            var3 = this.field_1396.getInsets();
            class_137.field_1766 -= 1249721383 * (var3.right + var3.left);
            class_58.field_460 -= (var3.bottom + var3.top) * -1394579951;
         }

         class_26 var10001 = new class_26(this);
         this.field_1397 = var10001;
         var2.setBackground(Color.BLACK);
         var2.setLayout((LayoutManager)null);
         var2.add(this.field_1397);
         this.field_1397.setSize(class_137.field_1766 * 646214551, class_58.field_460 * -1538307343);
         this.field_1397.setVisible(true);
         this.field_1397.setBackground(Color.BLACK);
         if(this.field_1396 == var2) {
            if(var1 == -1073188219) {
               return;
            }

            var3 = this.field_1396.getInsets();
            this.field_1397.setLocation(var3.left + -1437613301 * this.field_1390, this.field_1374 * -179382835 + var3.top);
         } else {
            this.field_1397.setLocation(this.field_1390 * -1437613301, this.field_1374 * -179382835);
         }

         label64: {
            this.field_1397.addFocusListener(this);
            this.field_1397.requestFocus();
            this.field_1409 = true;
            if(class_126.field_1370 != null) {
               if(var1 == -1073188219) {
                  throw new IllegalStateException();
               }

               if(-740510445 * class_126.field_1370.field_1816 == class_137.field_1766 * 646214551) {
                  if(var1 == -1073188219) {
                     throw new IllegalStateException();
                  }

                  if(-1538307343 * class_58.field_460 == class_126.field_1370.field_1818 * 460788765) {
                     if(var1 == -1073188219) {
                        return;
                     }

                     ((class_143)class_126.field_1370).method_3066(this.field_1397);
                     class_126.field_1370.method_3059(0, 0);
                     break label64;
                  }
               }
            }

            class_143 var10000 = new class_143(646214551 * class_137.field_1766, class_58.field_460 * -1538307343, this.field_1397);
            class_126.field_1370 = var10000;
         }

         this.field_1376 = false;
         this.field_1408 = class_87.method_1516((byte)1) * 1457858577470444969L;
      } catch (RuntimeException var4) {
         throw class_223.method_4281(var4);
      }
   }

   // $FF: renamed from: k (int) boolean
   protected final boolean method_2307(int var1) {
      try {
         String hostname = this.getDocumentBase().getHost().toLowerCase();
         if(!hostname.equals("jagex.com")) {
            if(var1 >= -774112648) {
               throw new IllegalStateException();
            }

            if(!hostname.endsWith(".jagex.com")) {
               if(!hostname.equals("runescape.com")) {
                  if(!hostname.endsWith(".runescape.com")) {
                     if(hostname.endsWith("127.0.0.1")) {
                        if(var1 >= -774112648) {
                           throw new IllegalStateException();
                        }

                        return true;
                     }

                     while(hostname.length() > 0) {
                        if(var1 >= -774112648) {
                           throw new IllegalStateException();
                        }

                        if(hostname.charAt(hostname.length() - 1) < 48) {
                           break;
                        }

                        if(var1 >= -774112648) {
                           throw new IllegalStateException();
                        }

                        if(hostname.charAt(hostname.length() - 1) > 57) {
                           break;
                        }

                        if(var1 >= -774112648) {
                           throw new IllegalStateException();
                        }

                        hostname = hostname.substring(0, hostname.length() - 1);
                     }

                     if(hostname.endsWith("192.168.1.")) {
                        if(var1 >= -774112648) {
                           throw new IllegalStateException();
                        }

                        return true;
                     }

                     this.method_2324("invalidhost", (byte)-1);
                     return false;
                  }

                  if(var1 >= -774112648) {
                     throw new IllegalStateException();
                  }
               }

               return true;
            }

            if(var1 >= -774112648) {
               throw new IllegalStateException();
            }
         }

         return true;
      } catch (RuntimeException var3) {
         throw class_223.method_4281(var3);
      }
   }

   // $FF: renamed from: cd () void
   void method_2308() {
      long var1 = class_87.method_1516((byte)1);
      long var3 = field_1386[1202015039 * field_1387];
      field_1386[-2145720596 * field_1387] = var1;
      field_1387 = -454548289 * (1 + -1255058768 * field_1387 & -103537667);
      if(var3 != 0L && var1 > var3) {
         ;
      }

      synchronized(this) {
         class_244.field_2708 = field_1391;
      }

      this.method_2413((byte)118);
   }

   // $FF: renamed from: m (int) void
   void method_2309(int var1) {
      try {
         long var2 = class_87.method_1516((byte)1);
         long var4 = field_1386[1202015039 * field_1387];
         field_1386[1202015039 * field_1387] = var2;
         field_1387 = -454548289 * (1 + 1202015039 * field_1387 & 31);
         if(var4 != 0L) {
            if(var1 == -1037963256) {
               throw new IllegalStateException();
            }

            if(var2 > var4) {
               ;
            }
         }

         synchronized(this) {
            class_244.field_2708 = field_1391;
         }

         this.method_2413((byte)68);
      } catch (RuntimeException var9) {
         throw class_223.method_4281(var9);
      }
   }

   // $FF: renamed from: x (byte) void
   void method_2310(byte var1) {
      try {
         Container var2 = this.method_2325(1142166715);
         long var3 = class_87.method_1516((byte)1);
         long var5 = field_1407[-1807936759 * field_1385];
         field_1407[-1807936759 * field_1385] = var3;
         field_1385 = (1 + -1807936759 * field_1385 & 31) * 1046637369;
         if(0L != var5) {
            if(var1 == 1) {
               throw new IllegalStateException();
            }

            if(var3 > var5) {
               if(var1 == 1) {
                  throw new IllegalStateException();
               }

               int var7 = (int)(var3 - var5);
               field_1382 = 1257878151 * (((var7 >> 1) + 32000) / var7);
            }
         }

         if((field_1400 += -943892141) * 116937435 - 1 > 50) {
            if(var1 == 1) {
               throw new IllegalStateException();
            }

            field_1400 -= 50033206;
            this.field_1409 = true;
            this.field_1397.setSize(class_137.field_1766 * 646214551, class_58.field_460 * -1538307343);
            this.field_1397.setVisible(true);
            if(this.field_1396 == var2) {
               if(var1 == 1) {
                  throw new IllegalStateException();
               }

               Insets var9 = this.field_1396.getInsets();
               this.field_1397.setLocation(this.field_1390 * -1437613301 + var9.left, var9.top + -179382835 * this.field_1374);
            } else {
               this.field_1397.setLocation(-1437613301 * this.field_1390, this.field_1374 * -179382835);
            }
         }

         if(this.field_1376) {
            this.method_2304((byte)6);
         }

         this.method_2315((byte)45);
         this.method_2320(this.field_1409, (short)9311);
         if(this.field_1409) {
            if(var1 == 1) {
               throw new IllegalStateException();
            }

            this.method_2303(2101906226);
         }

         this.field_1409 = false;
      } catch (RuntimeException var8) {
         throw class_223.method_4281(var8);
      }
   }

   // $FF: renamed from: bw () void
   final synchronized void method_2311() {
      Container var1 = this.method_2325(1142166715);
      if(this.field_1397 != null) {
         this.field_1397.removeFocusListener(this);
         var1.remove(this.field_1397);
      }

      class_137.field_1766 = Math.max(var1.getWidth(), -1558391463 * this.field_1395) * 1249721383;
      class_58.field_460 = Math.max(var1.getHeight(), this.field_1393 * -422930921) * -1394579951;
      Insets var2;
      if(this.field_1396 != null) {
         var2 = this.field_1396.getInsets();
         class_137.field_1766 -= 1249721383 * (var2.right + var2.left);
         class_58.field_460 -= (var2.bottom + var2.top) * -1394579951;
      }

      class_26 var10001 = new class_26(this);
      this.field_1397 = var10001;
      var1.setBackground(Color.BLACK);
      var1.setLayout((LayoutManager)null);
      var1.add(this.field_1397);
      this.field_1397.setSize(class_137.field_1766 * 646214551, class_58.field_460 * -1538307343);
      this.field_1397.setVisible(true);
      this.field_1397.setBackground(Color.BLACK);
      if(this.field_1396 == var1) {
         var2 = this.field_1396.getInsets();
         this.field_1397.setLocation(var2.left + -1437613301 * this.field_1390, this.field_1374 * -179382835 + var2.top);
      } else {
         this.field_1397.setLocation(this.field_1390 * -1437613301, this.field_1374 * -179382835);
      }

      this.field_1397.addFocusListener(this);
      this.field_1397.requestFocus();
      this.field_1409 = true;
      if(class_126.field_1370 != null && -740510445 * class_126.field_1370.field_1816 == class_137.field_1766 * 646214551 && -1538307343 * class_58.field_460 == class_126.field_1370.field_1818 * 460788765) {
         ((class_143)class_126.field_1370).method_3066(this.field_1397);
         class_126.field_1370.method_3059(0, 0);
      } else {
         class_143 var10000 = new class_143(646214551 * class_137.field_1766, class_58.field_460 * -1538307343, this.field_1397);
         class_126.field_1370 = var10000;
      }

      this.field_1376 = false;
      this.field_1408 = class_87.method_1516((byte)1) * 1457858577470444969L;
   }

   // $FF: renamed from: ae (int) void
   final void method_2312() {
      try {
         this.field_1401 = true;
      } catch (RuntimeException var2) {
         throw class_223.method_4281(var2);
      }
   }

   // $FF: renamed from: ap (int) void
   final synchronized void method_2313(int var1) {
      try {
         if(!field_1378) {
            field_1378 = true;

            try {
               this.field_1397.removeFocusListener(this);
            } catch (Exception var6) {
               ;
            }

            try {
               this.method_2321(561275520);
            } catch (Exception var5) {
               ;
            }

            if(null != this.field_1396) {
               if(var1 <= 209035984) {
                  throw new IllegalStateException();
               }

               try {
                  System.exit(0);
               } catch (Throwable var4) {
                  ;
               }
            }

            if(null != connection) {
               if(var1 <= 209035984) {
                  throw new IllegalStateException();
               }

               try {
                  connection.close();
               } catch (Exception var3) {
                  ;
               }
            }

            this.method_2328();
         }
      } catch (RuntimeException var7) {
         throw class_223.method_4281(var7);
      }
   }

   public final void start() {
      try {
         if(this == field_1375 && !field_1378) {
            field_1377 = 0L;
         }
      } catch (RuntimeException var1) {
         throw class_223.method_4281(var1);
      }
   }

   public final void stop() {
      try {
         if(this == field_1375 && !field_1378) {
            field_1377 = (class_87.method_1516((byte)1) + 4000L) * -8724334031026931673L;
         }
      } catch (RuntimeException var1) {
         throw class_223.method_4281(var1);
      }
   }

   public final void destroy() {
      try {
         if(field_1375 == this && !field_1378) {
            field_1377 = class_87.method_1516((byte)1) * -8724334031026931673L;
            long var1 = 4999L;

            try {
               Thread.sleep(var1);
            } catch (InterruptedException var5) {
               ;
            }

            try {
               Thread.sleep(1L);
            } catch (InterruptedException var4) {
               ;
            }

            this.method_2313(928825308);
         }
      } catch (RuntimeException var6) {
         throw class_223.method_4281(var6);
      }
   }

   public final void update(Graphics var1) {
      try {
         this.paint(var1);
      } catch (RuntimeException var2) {
         throw class_223.method_4281(var2);
      }
   }

   public final synchronized void paint(Graphics var1) {
      try {
         if(field_1375 == this && !field_1378) {
            this.field_1409 = true;
            if(class_87.method_1516((byte)1) - 8555805370222747289L * this.field_1408 > 1000L) {
               Rectangle var2 = var1.getClipBounds();
               if(var2 == null || var2.width >= 646214551 * class_137.field_1766 && var2.height >= -1538307343 * class_58.field_460) {
                  this.field_1376 = true;
               }
            }

         }
      } catch (RuntimeException var3) {
         throw class_223.method_4281(var3);
      }
   }

   public final void focusGained(FocusEvent var1) {
      try {
         field_1391 = true;
         this.field_1409 = true;
      } catch (RuntimeException var2) {
         throw class_223.method_4281(var2);
      }
   }

   public final void focusLost(FocusEvent var1) {
      try {
         field_1391 = false;
      } catch (RuntimeException var2) {
         throw class_223.method_4281(var2);
      }
   }

   // $FF: renamed from: dn (boolean) void
   protected abstract void method_2314(boolean var1);

   public void run() {
      try {
         try {
            if(null != Connection.javaVendor) {
               String var1 = Connection.javaVendor.toLowerCase();
               if(var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
                  String var2 = Connection.javaVersion;
                  if(var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.") || var2.equals("1.3") || var2.startsWith("1.3.") || var2.equals("1.4") || var2.startsWith("1.4.") || var2.equals("1.5") || var2.startsWith("1.5.") || var2.equals("1.6.0")) {
                     this.method_2324("wrongjava", (byte)-1);
                     return;
                  }

                  if(var2.startsWith("1.6.0_")) {
                     int var3;
                     for(var3 = 6; var3 < var2.length() && class_184.method_3852(var2.charAt(var3), (byte)-13); ++var3) {
                        ;
                     }

                     String var4 = var2.substring(6, var3);
                     if(class_52.method_575(var4) && class_168.method_3609(var4) < 10) {
                        this.method_2324("wrongjava", (byte)-1);
                        return;
                     }
                  }

                  field_1388 = 627746699;
               }
            }

            this.setFocusCycleRoot(true);
            this.method_2306(1032083147);
            this.method_2318(-232069568);

            Object var8;
            try {
               class_193 var10 = new class_193();
               var8 = var10;
            } catch (Throwable var5) {
               class_192 var10000 = new class_192();
               var8 = var10000;
            }

            field_1383 = (class_191)var8;

            while(0L == 3801980113368397719L * field_1377 || class_87.method_1516((byte)1) < 3801980113368397719L * field_1377) {
               class_299.field_3366 = field_1383.method_3951(field_1380 * 849049895, 1089824943 * field_1388, -1841090229) * -1802161781;

               for(int var9 = 0; var9 < class_299.field_3366 * -1644040669; ++var9) {
                  this.method_2309(996629970);
               }

               this.method_2310((byte)-49);
               this.method_2295(this.field_1397, (byte)104);
            }
         } catch (Exception var6) {
            class_308.method_5523((String)null, var6, 2070444539);
            this.method_2324("crash", (byte)-1);
         }

         this.method_2313(1052097273);
      } catch (RuntimeException var7) {
         throw class_223.method_4281(var7);
      }
   }

   // $FF: renamed from: i (byte) void
   final void method_2315(byte var1) {
      try {
         class_351 var2 = this.method_2326(1389693294);
         if(-1091351445 * this.field_1404 == var2.field_3947 * -250215195 && -2128033235 * this.field_1389 == 1839374135 * var2.field_3948) {
            if(!this.field_1401) {
               return;
            }

            if(var1 <= 0) {
               throw new IllegalStateException();
            }
         }

         this.method_2342(1759538265);
         this.field_1401 = false;
      } catch (RuntimeException var3) {
         throw class_223.method_4281(var3);
      }
   }

   public final void windowDeactivated(WindowEvent var1) {
      try {
         ;
      } catch (RuntimeException var2) {
         throw class_223.method_4281(var2);
      }
   }

   // $FF: renamed from: dj (java.awt.event.WindowEvent) void
   public final void method_2316() {}

   public final void windowIconified(WindowEvent var1) {
      try {
         ;
      } catch (RuntimeException var2) {
         throw class_223.method_4281(var2);
      }
   }

   public final void windowClosed(WindowEvent var1) {
      try {
         ;
      } catch (RuntimeException var2) {
         throw class_223.method_4281(var2);
      }
   }

   // $FF: renamed from: u (byte) void
   protected final void method_2317() {
      try {
         Canvas var2 = this.field_1397;
         var2.addMouseListener(GameMouseListener.instance);
         var2.addMouseMotionListener(GameMouseListener.instance);
         var2.addFocusListener(GameMouseListener.instance);
      } catch (RuntimeException var3) {
         throw class_223.method_4281(var3);
      }
   }

   // $FF: renamed from: ab (int) void
   protected abstract void method_2318(int var1);

   // $FF: renamed from: ad (boolean, short) void
   protected abstract void method_2320(boolean var1, short var2);

   // $FF: renamed from: ai (int) void
   protected abstract void method_2321(int var1);

   // $FF: renamed from: ar (int, java.lang.String, boolean, int) void
   protected final void method_2322(int var1, String var2, boolean var3, int var4) {
      try {
         try {
            Graphics var5 = this.field_1397.getGraphics();
            if(class_83.field_780 == null) {
               if(var4 != 91092739) {
                  throw new IllegalStateException();
               }

               class_83.field_780 = new Font("Helvetica", 1, 13);
               class_349.field_3938 = this.field_1397.getFontMetrics(class_83.field_780);
            }

            if(var3) {
               if(var4 != 91092739) {
                  throw new IllegalStateException();
               }

               var5.setColor(Color.black);
               var5.fillRect(0, 0, 646214551 * class_137.field_1766, class_58.field_460 * -1538307343);
            }

            Color var6 = new Color(140, 17, 17);

            try {
               if(field_1399 == null) {
                  field_1399 = this.field_1397.createImage(304, 34);
               }

               Graphics var7 = field_1399.getGraphics();
               var7.setColor(var6);
               var7.drawRect(0, 0, 303, 33);
               var7.fillRect(2, 2, var1 * 3, 30);
               var7.setColor(Color.black);
               var7.drawRect(1, 1, 301, 31);
               var7.fillRect(2 + var1 * 3, 2, 300 - var1 * 3, 30);
               var7.setFont(class_83.field_780);
               var7.setColor(Color.white);
               var7.drawString(var2, (304 - class_349.field_3938.stringWidth(var2)) / 2, 22);
               var5.drawImage(field_1399, 646214551 * class_137.field_1766 / 2 - 152, class_58.field_460 * -1538307343 / 2 - 18, (ImageObserver)null);
            } catch (Exception var10) {
               int var8 = class_137.field_1766 * 646214551 / 2 - 152;
               int var9 = class_58.field_460 * -1538307343 / 2 - 18;
               var5.setColor(var6);
               var5.drawRect(var8, var9, 303, 33);
               var5.fillRect(var8 + 2, var9 + 2, var1 * 3, 30);
               var5.setColor(Color.black);
               var5.drawRect(var8 + 1, var9 + 1, 301, 31);
               var5.fillRect(var8 + 2 + 3 * var1, var9 + 2, 300 - 3 * var1, 30);
               var5.setFont(class_83.field_780);
               var5.setColor(Color.white);
               var5.drawString(var2, var8 + (304 - class_349.field_3938.stringWidth(var2)) / 2, var9 + 22);
            }
         } catch (Exception var11) {
            this.field_1397.repaint();
         }

      } catch (RuntimeException var12) {
         throw class_223.method_4281(var12);
      }
   }

   // $FF: renamed from: ag (byte) void
   protected final void method_2323() {
      try {
         field_1399 = null;
         class_83.field_780 = null;
         class_349.field_3938 = null;
      } catch (RuntimeException var2) {
         throw class_223.method_4281(var2);
      }
   }

   // $FF: renamed from: ax (java.lang.String, byte) void
   protected void method_2324(String var1, byte var2) {
      try {
         if(this.field_1381) {
            if(var2 != -1) {
               throw new IllegalStateException();
            }
         } else {
            this.field_1381 = true;
            System.out.println("error_game_" + var1);

            try {
               this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + var1 + ".ws"), "_self");
            } catch (Exception var4) {
               ;
            }

         }
      } catch (RuntimeException var5) {
         throw class_223.method_4281(var5);
      }
   }

   // $FF: renamed from: as (int) java.awt.Container
   Container method_2325(int var1) {
      try {
         if(null != this.field_1396) {
            if(var1 != 1142166715) {
               throw new IllegalStateException();
            } else {
               return this.field_1396;
            }
         } else {
            return this;
         }
      } catch (RuntimeException var2) {
         throw class_223.method_4281(var2);
      }
   }

   // $FF: renamed from: aj (int) li
   class_351 method_2326(int var1) {
      try {
         Container var2 = this.method_2325(1142166715);
         int var3 = Math.max(var2.getWidth(), -1558391463 * this.field_1395);
         int var4 = Math.max(var2.getHeight(), this.field_1393 * -422930921);
         if(this.field_1396 != null) {
            if(var1 == -625008173) {
               throw new IllegalStateException();
            }

            Insets var5 = this.field_1396.getInsets();
            var3 -= var5.right + var5.left;
            var4 -= var5.bottom + var5.top;
         }

         class_351 var10000 = new class_351(var3, var4);
         return var10000;
      } catch (RuntimeException var6) {
         throw class_223.method_4281(var6);
      }
   }

   // $FF: renamed from: bd (java.lang.String) void
   protected void method_2327(String var1) {
      this.field_1405.setContents(new StringSelection(var1), (ClipboardOwner)null);
   }

   // $FF: renamed from: av (int) void
   protected abstract void method_2328();

   // $FF: renamed from: <clinit> () void
   static {
      field_1375 = null;
      field_1398 = 0;
      field_1377 = 0L;
      field_1378 = false;
      field_1380 = -2033187892;
      field_1388 = 984542799;
      field_1382 = 0;
      field_1407 = new long[32];
      field_1386 = new long[32];
      field_1400 = 500332060;
      field_1391 = true;
      field_1379 = 7975047348458726733L;
      field_1403 = 4302826277310093293L;
   }

   // $FF: renamed from: z (java.awt.event.FocusEvent) void
   public final void method_2330() {
      field_1391 = true;
      this.field_1409 = true;
   }

   // $FF: renamed from: ca (java.awt.event.WindowEvent) void
   public final void method_2331() {}

   // $FF: renamed from: cu () void
   public final void method_2332() {
      if(this == field_1375 && !field_1378) {
         field_1377 = 0L;
      }
   }

   // $FF: renamed from: h (java.awt.event.FocusEvent) void
   public final void method_2333() {
      field_1391 = false;
   }

   // $FF: renamed from: cx (java.awt.event.WindowEvent) void
   public final void method_2334() {}

   // $FF: renamed from: bh () void
   final void method_2335() {
      Container var1 = this.method_2325(1142166715);
      if(null != var1) {
         class_351 var2 = this.method_2326(1715763326);
         this.field_1404 = Math.max(var2.field_3947 * 1830242578, this.field_1395 * -1926188671) * -1481047997;
         this.field_1389 = Math.max(var2.field_3948 * 1179582434, this.field_1393 * -422930921) * 94020700;
         if(-1091351445 * this.field_1404 <= 0) {
            this.field_1404 = -709975783;
         }

         if(490425242 * this.field_1389 <= 0) {
            this.field_1389 = -1130359387;
         }

         class_137.field_1766 = Math.min(this.field_1404 * -1091351445, this.field_1394 * 59571423) * -1736652606;
         class_58.field_460 = Math.min(this.field_1389 * 975696603, this.field_1384 * -45318295) * 1042785380;
         this.field_1390 = (this.field_1404 * 634137331 - class_137.field_1766 * -1320700608) / 2 * 182874275;
         this.field_1374 = 0;
         this.field_1397.setSize(-1597247435 * class_137.field_1766, class_58.field_460 * -1538307343);
         class_143 var10000 = new class_143(class_137.field_1766 * -734029269, -1037294039 * class_58.field_460, this.field_1397);
         class_126.field_1370 = var10000;
         if(this.field_1396 == var1) {
            Insets var3 = this.field_1396.getInsets();
            this.field_1397.setLocation(var3.left + 1945507136 * this.field_1390, this.field_1374 * 1710890974 + var3.top);
         } else {
            this.field_1397.setLocation(-1974672071 * this.field_1390, this.field_1374 * -179382835);
         }

         this.field_1409 = true;
         this.method_2302((byte)52);
      }
   }

   // $FF: renamed from: n (java.awt.Graphics) void
   public final synchronized void method_2336(Graphics var1) {
      if(field_1375 == this && !field_1378) {
         this.field_1409 = true;
         if(class_87.method_1516((byte)1) - 8555805370222747289L * this.field_1408 > 1000L) {
            Rectangle var2 = var1.getClipBounds();
            if(var2 == null || var2.width >= 646214551 * class_137.field_1766 && var2.height >= -1538307343 * class_58.field_460) {
               this.field_1376 = true;
            }
         }

      }
   }

   // $FF: renamed from: w (java.awt.event.FocusEvent) void
   public final void method_2337() {
      field_1391 = true;
      this.field_1409 = true;
   }

   // $FF: renamed from: y (java.awt.Graphics) void
   public final synchronized void method_2338(Graphics var1) {
      if(field_1375 == this && !field_1378) {
         this.field_1409 = true;
         if(class_87.method_1516((byte)1) - 8555805370222747289L * this.field_1408 > 1000L) {
            Rectangle var2 = var1.getClipBounds();
            if(var2 == null || var2.width >= 646214551 * class_137.field_1766 && var2.height >= -1538307343 * class_58.field_460) {
               this.field_1376 = true;
            }
         }

      }
   }

   // $FF: renamed from: ac (int, int) void
   protected final void method_2339(int var1, int var2) {
      if(this.field_1394 * -995873918 != var1 || this.field_1384 * -45318295 != var2) {
         this.method_2312();
      }

      this.field_1394 = var1 * -1119817117;
      this.field_1384 = var2 * -149312601;
   }

   // $FF: renamed from: at (int, int) void
   protected final void method_2340(int var1, int var2) {
      if(this.field_1394 * 59571423 != var1 || this.field_1384 * -45318295 != var2) {
         this.method_2312();
      }

      this.field_1394 = var1 * -1004683489;
      this.field_1384 = var2 * -605552423;
   }

   // $FF: renamed from: ah (int, int) void
   protected final void method_2341(int var1, int var2) {
      if(this.field_1394 * 59571423 != var1 || this.field_1384 * -45318295 != var2) {
         this.method_2312();
      }

      this.field_1394 = var1 * -1004683489;
      this.field_1384 = var2 * -605552423;
   }

   // $FF: renamed from: l (int) void
   final void method_2342(int var1) {
      try {
         Container var2 = this.method_2325(1142166715);
         if(null == var2) {
            if(var1 <= 1280746041) {
               throw new IllegalStateException();
            }
         } else {
            class_351 var3 = this.method_2326(33917431);
            this.field_1404 = Math.max(var3.field_3947 * -250215195, this.field_1395 * -1558391463) * -1481047997;
            this.field_1389 = Math.max(var3.field_3948 * 1839374135, this.field_1393 * -422930921) * -1130359387;
            if(-1091351445 * this.field_1404 <= 0) {
               if(var1 <= 1280746041) {
                  throw new IllegalStateException();
               }

               this.field_1404 = -1481047997;
            }

            if(-2128033235 * this.field_1389 <= 0) {
               if(var1 <= 1280746041) {
                  throw new IllegalStateException();
               }

               this.field_1389 = -1130359387;
            }

            class_137.field_1766 = Math.min(this.field_1404 * -1091351445, this.field_1394 * 59571423) * 1249721383;
            class_58.field_460 = Math.min(this.field_1389 * -2128033235, this.field_1384 * -45318295) * -1394579951;
            this.field_1390 = (this.field_1404 * -1091351445 - class_137.field_1766 * 646214551) / 2 * 182874275;
            this.field_1374 = 0;
            this.field_1397.setSize(646214551 * class_137.field_1766, class_58.field_460 * -1538307343);
            class_143 var10000 = new class_143(class_137.field_1766 * 646214551, -1538307343 * class_58.field_460, this.field_1397);
            class_126.field_1370 = var10000;
            if(this.field_1396 == var2) {
               Insets var4 = this.field_1396.getInsets();
               this.field_1397.setLocation(var4.left + -1437613301 * this.field_1390, this.field_1374 * -179382835 + var4.top);
            } else {
               this.field_1397.setLocation(-1437613301 * this.field_1390, this.field_1374 * -179382835);
            }

            this.field_1409 = true;
            this.method_2302((byte)50);
         }
      } catch (RuntimeException var5) {
         throw class_223.method_4281(var5);
      }
   }

   // $FF: renamed from: bt (java.lang.String) void
   protected void method_2343(String var1) {
      this.field_1405.setContents(new StringSelection(var1), (ClipboardOwner)null);
   }

   // $FF: renamed from: aw (java.lang.Object) void
   final void method_2344(Object var1) {
      if(this.field_1402 != null) {
         for(int var2 = 0; var2 < 50 && this.field_1402.peekEvent() != null; ++var2) {
            try {
               Thread.sleep(1L);
            } catch (InterruptedException var4) {
               ;
            }
         }

         if(null != var1) {
            this.field_1402.postEvent(new ActionEvent(var1, 1001, "dummy"));
         }

      }
   }

   // $FF: renamed from: af () dw
   protected class_5 method_2345() {
      if(null == this.field_1411) {
         class_133 var10001 = new class_133();
         this.field_1411 = var10001;
         this.field_1411.method_2911(this.field_1397);
      }

      return this.field_1411;
   }

   // $FF: renamed from: ak () void
   protected void method_2346() {
      this.field_1405 = this.getToolkit().getSystemClipboard();
   }

   // $FF: renamed from: ay () void
   protected void method_2347() {
      this.field_1405 = this.getToolkit().getSystemClipboard();
   }

   // $FF: renamed from: aa () void
   protected void method_2348() {
      this.field_1405 = this.getToolkit().getSystemClipboard();
   }

   // $FF: renamed from: dq () void
   protected abstract void method_2349();

   // $FF: renamed from: ez (java.lang.String) void
   protected void method_2350(String var1) {
      if(!this.field_1381) {
         this.field_1381 = true;
         System.out.println("error_game_" + var1);

         try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + var1 + ".ws"), "_self");
         } catch (Exception var3) {
            ;
         }

      }
   }

   // $FF: renamed from: dk (java.awt.event.WindowEvent) void
   public final void method_2351() {}

   // $FF: renamed from: bv () void
   protected final void method_2352() {
      Canvas var1 = this.field_1397;
      var1.addMouseListener(GameMouseListener.instance);
      var1.addMouseMotionListener(GameMouseListener.instance);
      var1.addFocusListener(GameMouseListener.instance);
   }

   // $FF: renamed from: bq (java.lang.String) void
   protected void method_2353(String var1) {
      this.field_1405.setContents(new StringSelection(var1), (ClipboardOwner)null);
   }

   // $FF: renamed from: bg () boolean
   protected final boolean method_2354() {
      String var1 = this.getDocumentBase().getHost().toLowerCase();
      if(!var1.equals("jagex.com") && !var1.endsWith(".jagex.com")) {
         if(!var1.equals("runescape.com") && !var1.endsWith(".runescape.com")) {
            if(var1.endsWith("127.0.0.1")) {
               return true;
            } else {
               while(var1.length() > 0 && var1.charAt(var1.length() - 1) >= 48 && var1.charAt(var1.length() - 1) <= 57) {
                  var1 = var1.substring(0, var1.length() - 1);
               }

               if(var1.endsWith("192.168.1.")) {
                  return true;
               } else {
                  this.method_2324("invalidhost", (byte)-1);
                  return false;
               }
            }
         } else {
            return true;
         }
      } else {
         return true;
      }
   }

   // $FF: renamed from: en () int
   protected static int method_2355() {
      int var0 = 0;
      if(null == class_198.field_2340 || !class_198.field_2340.isValid()) {
         try {
            Iterator var1 = ManagementFactory.getGarbageCollectorMXBeans().iterator();

            while(var1.hasNext()) {
               GarbageCollectorMXBean var2 = (GarbageCollectorMXBean)var1.next();
               if(var2.isValid()) {
                  class_198.field_2340 = var2;
                  field_1403 = 4302826277310093293L;
                  field_1379 = 7975047348458726733L;
               }
            }
         } catch (Throwable var9) {
            ;
         }
      }

      if(class_198.field_2340 != null) {
         long var10 = class_87.method_1516((byte)1);
         long var3 = class_198.field_2340.getCollectionTime();
         if(-1L != 6246927008582722683L * field_1379) {
            long var5 = var3 - field_1379 * 6246927008582722683L;
            long var7 = var10 - -7805304911218154981L * field_1403;
            if(0L != var7) {
               var0 = (int)(100L * var5 / var7);
            }
         }

         field_1379 = -7975047348458726733L * var3;
         field_1403 = -4302826277310093293L * var10;
      }

      return var0;
   }

   // $FF: renamed from: em () void
   protected abstract void method_2356();

   public final void windowClosing(WindowEvent var1) {
      try {
         this.destroy();
      } catch (RuntimeException var2) {
         throw class_223.method_4281(var2);
      }
   }

   // $FF: renamed from: bz () void
   protected final void method_2357() {
      Canvas var1 = this.field_1397;
      var1.addMouseListener(GameMouseListener.instance);
      var1.addMouseMotionListener(GameMouseListener.instance);
      var1.addFocusListener(GameMouseListener.instance);
   }

   // $FF: renamed from: ch () void
   public final void method_2358() {
      if(field_1375 == this && !field_1378) {
         field_1377 = class_87.method_1516((byte)1) * -8724334031026931673L;
         long var1 = 4999L;

         try {
            Thread.sleep(var1);
         } catch (InterruptedException var5) {
            ;
         }

         try {
            Thread.sleep(1L);
         } catch (InterruptedException var4) {
            ;
         }

         this.method_2313(743364323);
      }
   }

   // $FF: renamed from: bs () void
   final void method_2359() {
      Container var1 = this.method_2325(1142166715);
      if(null != var1) {
         class_351 var2 = this.method_2326(136601040);
         this.field_1404 = Math.max(var2.field_3947 * -250215195, this.field_1395 * -1558391463) * -1481047997;
         this.field_1389 = Math.max(var2.field_3948 * 1822815678, this.field_1393 * -717875048) * -1130359387;
         if(-1091351445 * this.field_1404 <= 0) {
            this.field_1404 = -1622186926;
         }

         if(-2128033235 * this.field_1389 <= 0) {
            this.field_1389 = -1130359387;
         }

         class_137.field_1766 = Math.min(this.field_1404 * -1091351445, this.field_1394 * -1452339372) * -1681032011;
         class_58.field_460 = Math.min(this.field_1389 * 1348387333, this.field_1384 * -715252648) * -879615098;
         this.field_1390 = (this.field_1404 * -1091351445 - class_137.field_1766 * -978954037) / 2 * 182874275;
         this.field_1374 = 0;
         this.field_1397.setSize(646214551 * class_137.field_1766, class_58.field_460 * -1207012468);
         class_143 var10000 = new class_143(class_137.field_1766 * -1015788710, -514790564 * class_58.field_460, this.field_1397);
         class_126.field_1370 = var10000;
         if(this.field_1396 == var1) {
            Insets var3 = this.field_1396.getInsets();
            this.field_1397.setLocation(var3.left + -1437613301 * this.field_1390, this.field_1374 * -1043059929 + var3.top);
         } else {
            this.field_1397.setLocation(806893732 * this.field_1390, this.field_1374 * -179382835);
         }

         this.field_1409 = true;
         this.method_2302((byte)39);
      }
   }

   // $FF: renamed from: br () void
   final void method_2360() {
      Container var1 = this.method_2325(1142166715);
      if(null != var1) {
         class_351 var2 = this.method_2326(-260221787);
         this.field_1404 = Math.max(var2.field_3947 * -250215195, this.field_1395 * -1558391463) * -1481047997;
         this.field_1389 = Math.max(var2.field_3948 * 1839374135, this.field_1393 * -422930921) * -1130359387;
         if(-1091351445 * this.field_1404 <= 0) {
            this.field_1404 = -1481047997;
         }

         if(-2128033235 * this.field_1389 <= 0) {
            this.field_1389 = -1130359387;
         }

         class_137.field_1766 = Math.min(this.field_1404 * -1091351445, this.field_1394 * 59571423) * 1249721383;
         class_58.field_460 = Math.min(this.field_1389 * -2128033235, this.field_1384 * -45318295) * -1394579951;
         this.field_1390 = (this.field_1404 * -1091351445 - class_137.field_1766 * 646214551) / 2 * 182874275;
         this.field_1374 = 0;
         this.field_1397.setSize(646214551 * class_137.field_1766, class_58.field_460 * -1538307343);
         class_143 var10000 = new class_143(class_137.field_1766 * 646214551, -1538307343 * class_58.field_460, this.field_1397);
         class_126.field_1370 = var10000;
         if(this.field_1396 == var1) {
            Insets var3 = this.field_1396.getInsets();
            this.field_1397.setLocation(var3.left + -1437613301 * this.field_1390, this.field_1374 * -179382835 + var3.top);
         } else {
            this.field_1397.setLocation(-1437613301 * this.field_1390, this.field_1374 * -179382835);
         }

         this.field_1409 = true;
         this.method_2302((byte)65);
      }
   }

   // $FF: renamed from: v (int, int, int) int
   static int method_2361(int var0, int var1, int var2) {
      try {
         class_49 var3 = (class_49)class_49.field_361.method_6523((long)var0);
         if(var3 == null) {
            if(var2 != -1726985857) {
               throw new IllegalStateException();
            } else {
               return -1;
            }
         } else {
            if(var1 >= 0) {
               if(var2 != -1726985857) {
                  throw new IllegalStateException();
               }

               if(var1 < var3.field_360.length) {
                  return var3.field_360[var1];
               }

               if(var2 != -1726985857) {
                  throw new IllegalStateException();
               }
            }

            return -1;
         }
      } catch (RuntimeException var4) {
         throw class_223.method_4281(var4);
      }
   }

   // $FF: renamed from: ba () void
   protected abstract void method_2362();

   // $FF: renamed from: be () void
   protected abstract void method_2363();

   // $FF: renamed from: cr () void
   final void method_2364() {
      class_351 var1 = this.method_2326(-1874992658);
      if(-1091351445 * this.field_1404 != var1.field_3947 * -250215195 || -2128033235 * this.field_1389 != -672664137 * var1.field_3948 || this.field_1401) {
         this.method_2342(1849489814);
         this.field_1401 = false;
      }

   }

   // $FF: renamed from: bx () void
   void method_2365() {
      int var1 = -1437613301 * this.field_1390;
      int var2 = -179382835 * this.field_1374;
      int var3 = this.field_1404 * -1091351445 - 646214551 * class_137.field_1766 - var1;
      int var4 = -2128033235 * this.field_1389 - -1538307343 * class_58.field_460 - var2;
      if(var1 > 0 || var3 > 0 || var2 > 0 || var4 > 0) {
         try {
            Container var5 = this.method_2325(1142166715);
            int var6 = 0;
            int var7 = 0;
            if(this.field_1396 == var5) {
               Insets var8 = this.field_1396.getInsets();
               var6 = var8.left;
               var7 = var8.top;
            }

            Graphics var10 = var5.getGraphics();
            var10.setColor(Color.black);
            if(var1 > 0) {
               var10.fillRect(var6, var7, var1, this.field_1389 * -2128033235);
            }

            if(var2 > 0) {
               var10.fillRect(var6, var7, this.field_1404 * -1091351445, var2);
            }

            if(var3 > 0) {
               var10.fillRect(this.field_1404 * -1091351445 + var6 - var3, var7, var3, -2128033235 * this.field_1389);
            }

            if(var4 > 0) {
               var10.fillRect(var6, -2128033235 * this.field_1389 + var7 - var4, this.field_1404 * -1091351445, var4);
            }
         } catch (Exception var9) {
            ;
         }
      }

   }

   // $FF: renamed from: bp () void
   void method_2366() {
      int var1 = -455119970 * this.field_1390;
      int var2 = -1464452260 * this.field_1374;
      int var3 = this.field_1404 * 960591519 - 697497548 * class_137.field_1766 - var1;
      int var4 = -2128033235 * this.field_1389 - -1312097346 * class_58.field_460 - var2;
      if(var1 > 0 || var3 > 0 || var2 > 0 || var4 > 0) {
         try {
            Container var5 = this.method_2325(1142166715);
            int var6 = 0;
            int var7 = 0;
            if(this.field_1396 == var5) {
               Insets var8 = this.field_1396.getInsets();
               var6 = var8.left;
               var7 = var8.top;
            }

            Graphics var10 = var5.getGraphics();
            var10.setColor(Color.black);
            if(var1 > 0) {
               var10.fillRect(var6, var7, var1, this.field_1389 * -2128033235);
            }

            if(var2 > 0) {
               var10.fillRect(var6, var7, this.field_1404 * 581217945, var2);
            }

            if(var3 > 0) {
               var10.fillRect(this.field_1404 * -1091351445 + var6 - var3, var7, var3, -2128033235 * this.field_1389);
            }

            if(var4 > 0) {
               var10.fillRect(var6, -1235408978 * this.field_1389 + var7 - var4, this.field_1404 * 1913102678, var4);
            }
         } catch (Exception var9) {
            ;
         }
      }

   }

   // $FF: renamed from: bn () void
   final void method_2367() {
      class_154.method_3245(this.field_1397);
      Canvas var1 = this.field_1397;
      var1.removeMouseListener(GameMouseListener.instance);
      var1.removeMouseMotionListener(GameMouseListener.instance);
      var1.removeFocusListener(GameMouseListener.instance);
      GameMouseListener.buttonsPressed = 0;
      if(this.field_1411 != null) {
         this.field_1411.method_2908(this.field_1397);
      }

      this.method_2306(-270674896);
      class_162.method_3417(this.field_1397);
      Canvas var2 = this.field_1397;
      var2.addMouseListener(GameMouseListener.instance);
      var2.addMouseMotionListener(GameMouseListener.instance);
      var2.addFocusListener(GameMouseListener.instance);
      if(this.field_1411 != null) {
         this.field_1411.method_2911(this.field_1397);
      }

      this.method_2312();
   }

   // $FF: renamed from: <init> () void
   protected GameApplet() {
      super();
      try {
         this.field_1381 = false;
         this.field_1390 = 0;
         this.field_1374 = 0;
         this.field_1409 = true;
         this.field_1401 = false;
         this.field_1376 = false;
         this.field_1408 = 0L;
         EventQueue var1 = null;

         try {
            var1 = Toolkit.getDefaultToolkit().getSystemEventQueue();
         } catch (Throwable var3) {
            ;
         }

         this.field_1402 = var1;
         class_141 var10000 = new class_141();
         class_180.method_3820(var10000);
      } catch (RuntimeException var4) {
         throw class_223.method_4281(var4);
      }
   }

   // $FF: renamed from: aq (java.lang.Object) void
   final void method_2369(Object var1) {
      if(this.field_1402 != null) {
         for(int var2 = 0; var2 < 50 && this.field_1402.peekEvent() != null; ++var2) {
            try {
               Thread.sleep(1L);
            } catch (InterruptedException var4) {
               ;
            }
         }

         if(null != var1) {
            this.field_1402.postEvent(new ActionEvent(var1, 1001, "dummy"));
         }

      }
   }

   // $FF: renamed from: bi () void
   final synchronized void method_2370() {
      Container var1 = this.method_2325(1142166715);
      if(this.field_1397 != null) {
         this.field_1397.removeFocusListener(this);
         var1.remove(this.field_1397);
      }

      class_137.field_1766 = Math.max(var1.getWidth(), -405973523 * this.field_1395) * 1249721383;
      class_58.field_460 = Math.max(var1.getHeight(), this.field_1393 * 707764166) * 1372046042;
      Insets var2;
      if(this.field_1396 != null) {
         var2 = this.field_1396.getInsets();
         class_137.field_1766 -= -774967732 * (var2.right + var2.left);
         class_58.field_460 -= (var2.bottom + var2.top) * 9233454;
      }

      class_26 var10001 = new class_26(this);
      this.field_1397 = var10001;
      var1.setBackground(Color.BLACK);
      var1.setLayout((LayoutManager)null);
      var1.add(this.field_1397);
      this.field_1397.setSize(class_137.field_1766 * 646214551, class_58.field_460 * -1538307343);
      this.field_1397.setVisible(true);
      this.field_1397.setBackground(Color.BLACK);
      if(this.field_1396 == var1) {
         var2 = this.field_1396.getInsets();
         this.field_1397.setLocation(var2.left + -1437613301 * this.field_1390, this.field_1374 * -964863954 + var2.top);
      } else {
         this.field_1397.setLocation(this.field_1390 * -1437613301, this.field_1374 * 936848177);
      }

      this.field_1397.addFocusListener(this);
      this.field_1397.requestFocus();
      this.field_1409 = true;
      if(class_126.field_1370 != null && -38164928 * class_126.field_1370.field_1816 == class_137.field_1766 * 646214551 && -1538307343 * class_58.field_460 == class_126.field_1370.field_1818 * -317262549) {
         ((class_143)class_126.field_1370).method_3066(this.field_1397);
         class_126.field_1370.method_3059(0, 0);
      } else {
         class_143 var10000 = new class_143(1120109090 * class_137.field_1766, class_58.field_460 * -587809659, this.field_1397);
         class_126.field_1370 = var10000;
      }

      this.field_1376 = false;
      this.field_1408 = class_87.method_1516((byte)1) * 1457858577470444969L;
   }

   // $FF: renamed from: bb () boolean
   protected final boolean method_2371() {
      String var1 = this.getDocumentBase().getHost().toLowerCase();
      if(!var1.equals("jagex.com") && !var1.endsWith(".jagex.com")) {
         if(!var1.equals("runescape.com") && !var1.endsWith(".runescape.com")) {
            if(var1.endsWith("127.0.0.1")) {
               return true;
            } else {
               while(var1.length() > 0 && var1.charAt(var1.length() - 1) >= 48 && var1.charAt(var1.length() - 1) <= 57) {
                  var1 = var1.substring(0, var1.length() - 1);
               }

               if(var1.endsWith("192.168.1.")) {
                  return true;
               } else {
                  this.method_2324("invalidhost", (byte)-1);
                  return false;
               }
            }
         } else {
            return true;
         }
      } else {
         return true;
      }
   }

   // $FF: renamed from: bk () boolean
   protected final boolean method_2372() {
      String var1 = this.getDocumentBase().getHost().toLowerCase();
      if(!var1.equals("jagex.com") && !var1.endsWith(".jagex.com")) {
         if(!var1.equals("runescape.com") && !var1.endsWith(".runescape.com")) {
            if(var1.endsWith("127.0.0.1")) {
               return true;
            } else {
               while(var1.length() > 0 && var1.charAt(var1.length() - 1) >= 48 && var1.charAt(var1.length() - 1) <= 57) {
                  var1 = var1.substring(0, var1.length() - 1);
               }

               if(var1.endsWith("192.168.1.")) {
                  return true;
               } else {
                  this.method_2324("invalidhost", (byte)-1);
                  return false;
               }
            }
         } else {
            return true;
         }
      } else {
         return true;
      }
   }

   public final void windowActivated(WindowEvent var1) {
      try {
         ;
      } catch (RuntimeException var2) {
         throw class_223.method_4281(var2);
      }
   }

   // $FF: renamed from: by () void
   public void method_2373() {
      try {
         if(null != Connection.javaVendor) {
            String var1 = Connection.javaVendor.toLowerCase();
            if(var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
               String var2 = Connection.javaVersion;
               if(var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.") || var2.equals("1.3") || var2.startsWith("1.3.") || var2.equals("1.4") || var2.startsWith("1.4.") || var2.equals("1.5") || var2.startsWith("1.5.") || var2.equals("1.6.0")) {
                  this.method_2324("wrongjava", (byte)-1);
                  return;
               }

               if(var2.startsWith("1.6.0_")) {
                  int var3;
                  for(var3 = 6; var3 < var2.length() && class_184.method_3852(var2.charAt(var3), (byte)-128); ++var3) {
                     ;
                  }

                  String var4 = var2.substring(6, var3);
                  if(class_52.method_575(var4) && class_168.method_3609(var4) < 10) {
                     this.method_2324("wrongjava", (byte)-1);
                     return;
                  }
               }

               field_1388 = 1525954742;
            }
         }

         this.setFocusCycleRoot(true);
         this.method_2306(-862310966);
         this.method_2318(-232069568);

         Object var7;
         try {
            class_193 var9 = new class_193();
            var7 = var9;
         } catch (Throwable var5) {
            class_192 var10000 = new class_192();
            var7 = var10000;
         }

         field_1383 = (class_191)var7;

         while(0L == 3801980113368397719L * field_1377 || class_87.method_1516((byte)1) < 3801980113368397719L * field_1377) {
            class_299.field_3366 = field_1383.method_3951(field_1380 * -796842912, -292863000 * field_1388, -1754240577) * -1805106898;

            for(int var8 = 0; var8 < class_299.field_3366 * -422571580; ++var8) {
               this.method_2309(-286617613);
            }

            this.method_2310((byte)-15);
            this.method_2295(this.field_1397, (byte)115);
         }
      } catch (Exception var6) {
         class_308.method_5523((String)null, var6, 1942525812);
         this.method_2324("crash", (byte)-1);
      }

      this.method_2313(764127006);
   }

   // $FF: renamed from: bc () void
   public void method_2374() {
      try {
         if(null != Connection.javaVendor) {
            String var1 = Connection.javaVendor.toLowerCase();
            if(var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
               String var2 = Connection.javaVersion;
               if(var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.") || var2.equals("1.3") || var2.startsWith("1.3.") || var2.equals("1.4") || var2.startsWith("1.4.") || var2.equals("1.5") || var2.startsWith("1.5.") || var2.equals("1.6.0")) {
                  this.method_2324("wrongjava", (byte)-1);
                  return;
               }

               if(var2.startsWith("1.6.0_")) {
                  int var3;
                  for(var3 = 6; var3 < var2.length() && class_184.method_3852(var2.charAt(var3), (byte)-124); ++var3) {
                     ;
                  }

                  String var4 = var2.substring(6, var3);
                  if(class_52.method_575(var4) && class_168.method_3609(var4) < 10) {
                     this.method_2324("wrongjava", (byte)-1);
                     return;
                  }
               }

               field_1388 = -163629844;
            }
         }

         this.setFocusCycleRoot(true);
         this.method_2306(1100738628);
         this.method_2318(-232069568);

         Object var7;
         try {
            class_193 var9 = new class_193();
            var7 = var9;
         } catch (Throwable var5) {
            class_192 var10000 = new class_192();
            var7 = var10000;
         }

         field_1383 = (class_191)var7;

         while(0L == 3801980113368397719L * field_1377 || class_87.method_1516((byte)1) < 3801980113368397719L * field_1377) {
            class_299.field_3366 = field_1383.method_3951(field_1380 * -2072672768, 1903655292 * field_1388, -1763456044) * 1998234513;

            for(int var8 = 0; var8 < class_299.field_3366 * -756752096; ++var8) {
               this.method_2309(819398600);
            }

            this.method_2310((byte)-6);
            this.method_2295(this.field_1397, (byte)72);
         }
      } catch (Exception var6) {
         class_308.method_5523((String)null, var6, 1872071416);
         this.method_2324("crash", (byte)-1);
      }

      this.method_2313(745755149);
   }

   public final void windowOpened(WindowEvent var1) {
      try {
         ;
      } catch (RuntimeException var2) {
         throw class_223.method_4281(var2);
      }
   }

   // $FF: renamed from: ct () void
   void method_2375() {
      Container var1 = this.method_2325(1142166715);
      long var2 = class_87.method_1516((byte)1);
      long var4 = field_1407[72233229 * field_1385];
      field_1407[-1807936759 * field_1385] = var2;
      field_1385 = (1 + -67861338 * field_1385 & 31) * 1046637369;
      if(0L != var4 && var2 > var4) {
         int var6 = (int)(var2 - var4);
         field_1382 = -1567256310 * (((var6 >> 1) + 32000) / var6);
      }

      if((field_1400 += -2109411912) * -680869274 - 1 > -1316753874) {
         field_1400 -= 50033206;
         this.field_1409 = true;
         this.field_1397.setSize(class_137.field_1766 * 1905675324, class_58.field_460 * -1538307343);
         this.field_1397.setVisible(true);
         if(this.field_1396 == var1) {
            Insets var7 = this.field_1396.getInsets();
            this.field_1397.setLocation(this.field_1390 * 1413610636 + var7.left, var7.top + -1641390218 * this.field_1374);
         } else {
            this.field_1397.setLocation(-1437613301 * this.field_1390, this.field_1374 * -2126659940);
         }
      }

      if(this.field_1376) {
         this.method_2304((byte)6);
      }

      this.method_2315((byte)86);
      this.method_2320(this.field_1409, (short)26751);
      if(this.field_1409) {
         this.method_2303(2101906226);
      }

      this.field_1409 = false;
   }

   // $FF: renamed from: cv () void
   void method_2376() {
      Container var1 = this.method_2325(1142166715);
      long var2 = class_87.method_1516((byte)1);
      long var4 = field_1407[-1807936759 * field_1385];
      field_1407[-1807936759 * field_1385] = var2;
      field_1385 = (1 + 2053552593 * field_1385 & 31) * 1046637369;
      if(0L != var4 && var2 > var4) {
         int var6 = (int)(var2 - var4);
         field_1382 = 1160095196 * (((var6 >> 1) + 329183881) / var6);
      }

      if((field_1400 += -943892141) * 53993890 - 1 > 50) {
         field_1400 -= 50033206;
         this.field_1409 = true;
         this.field_1397.setSize(class_137.field_1766 * 646214551, class_58.field_460 * -1538307343);
         this.field_1397.setVisible(true);
         if(this.field_1396 == var1) {
            Insets var7 = this.field_1396.getInsets();
            this.field_1397.setLocation(this.field_1390 * 382422707 + var7.left, var7.top + 1759435648 * this.field_1374);
         } else {
            this.field_1397.setLocation(-144953211 * this.field_1390, this.field_1374 * -179382835);
         }
      }

      if(this.field_1376) {
         this.method_2304((byte)6);
      }

      this.method_2315((byte)22);
      this.method_2320(this.field_1409, (short)10049);
      if(this.field_1409) {
         this.method_2303(2101906226);
      }

      this.field_1409 = false;
   }

   // $FF: renamed from: cp () void
   void method_2377() {
      Container var1 = this.method_2325(1142166715);
      long var2 = class_87.method_1516((byte)1);
      long var4 = field_1407[-1807936759 * field_1385];
      field_1407[-1807936759 * field_1385] = var2;
      field_1385 = (1 + -1807936759 * field_1385 & 31) * 1046637369;
      if(0L != var4 && var2 > var4) {
         int var6 = (int)(var2 - var4);
         field_1382 = 1257878151 * (((var6 >> 1) + 32000) / var6);
      }

      if((field_1400 += -943892141) * 116937435 - 1 > 50) {
         field_1400 -= 50033206;
         this.field_1409 = true;
         this.field_1397.setSize(class_137.field_1766 * 646214551, class_58.field_460 * -1538307343);
         this.field_1397.setVisible(true);
         if(this.field_1396 == var1) {
            Insets var7 = this.field_1396.getInsets();
            this.field_1397.setLocation(this.field_1390 * -1437613301 + var7.left, var7.top + -179382835 * this.field_1374);
         } else {
            this.field_1397.setLocation(-1437613301 * this.field_1390, this.field_1374 * -179382835);
         }
      }

      if(this.field_1376) {
         this.method_2304((byte)6);
      }

      this.method_2315((byte)49);
      this.method_2320(this.field_1409, (short)13120);
      if(this.field_1409) {
         this.method_2303(2101906226);
      }

      this.field_1409 = false;
   }

   // $FF: renamed from: bf () void
   final void method_2378() {
      Container var1 = this.method_2325(1142166715);
      if(null != var1) {
         class_351 var2 = this.method_2326(136598383);
         this.field_1404 = Math.max(var2.field_3947 * -250215195, this.field_1395 * -1558391463) * -1481047997;
         this.field_1389 = Math.max(var2.field_3948 * 1839374135, this.field_1393 * -226975151) * -1130359387;
         if(384969340 * this.field_1404 <= 0) {
            this.field_1404 = 226747524;
         }

         if(-2128033235 * this.field_1389 <= 0) {
            this.field_1389 = -1130359387;
         }

         class_137.field_1766 = Math.min(this.field_1404 * -1091351445, this.field_1394 * -1734241603) * 432020363;
         class_58.field_460 = Math.min(this.field_1389 * -2128033235, this.field_1384 * -45318295) * -1394579951;
         this.field_1390 = (this.field_1404 * -1091351445 - class_137.field_1766 * 2036421293) / 2 * -1942847044;
         this.field_1374 = 0;
         this.field_1397.setSize(910962566 * class_137.field_1766, class_58.field_460 * -1538307343);
         class_143 var10000 = new class_143(class_137.field_1766 * 1590030796, -1538307343 * class_58.field_460, this.field_1397);
         class_126.field_1370 = var10000;
         if(this.field_1396 == var1) {
            Insets var3 = this.field_1396.getInsets();
            this.field_1397.setLocation(var3.left + -1437613301 * this.field_1390, this.field_1374 * -179382835 + var3.top);
         } else {
            this.field_1397.setLocation(-220133251 * this.field_1390, this.field_1374 * -179382835);
         }

         this.field_1409 = true;
         this.method_2302((byte)63);
      }
   }

   // $FF: renamed from: dc (java.awt.event.WindowEvent) void
   public final void method_2379() {}

   // $FF: renamed from: cq () void
   final void method_2380() {
      class_351 var1 = this.method_2326(125670745);
      if(193535580 * this.field_1404 != var1.field_3947 * -990584707 || -2128033235 * this.field_1389 != 493846870 * var1.field_3948 || this.field_1401) {
         this.method_2342(1516932660);
         this.field_1401 = false;
      }

   }

   // $FF: renamed from: ek (java.lang.String) void
   protected void method_2381(String var1) {
      if(!this.field_1381) {
         this.field_1381 = true;
         System.out.println("error_game_" + var1);

         try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + var1 + ".ws"), "_self");
         } catch (Exception var3) {
            ;
         }

      }
   }

   // $FF: renamed from: cf () void
   final void method_2382() {
      this.field_1401 = true;
   }

   // $FF: renamed from: cn () void
   final synchronized void method_2383() {
      if(!field_1378) {
         field_1378 = true;

         try {
            this.field_1397.removeFocusListener(this);
         } catch (Exception var5) {
            ;
         }

         try {
            this.method_2321(-570795386);
         } catch (Exception var4) {
            ;
         }

         if(null != this.field_1396) {
            try {
               System.exit(0);
            } catch (Throwable var3) {
               ;
            }
         }

         if(null != connection) {
            try {
               connection.close();
            } catch (Exception var2) {
               ;
            }
         }

         this.method_2328();
      }
   }

   // $FF: renamed from: cs () void
   final synchronized void method_2384() {
      if(!field_1378) {
         field_1378 = true;

         try {
            this.field_1397.removeFocusListener(this);
         } catch (Exception var5) {
            ;
         }

         try {
            this.method_2321(853771403);
         } catch (Exception var4) {
            ;
         }

         if(null != this.field_1396) {
            try {
               System.exit(0);
            } catch (Throwable var3) {
               ;
            }
         }

         if(null != connection) {
            try {
               connection.close();
            } catch (Exception var2) {
               ;
            }
         }

         this.method_2328();
      }
   }

   // $FF: renamed from: cg () void
   final synchronized void method_2385() {
      if(!field_1378) {
         field_1378 = true;

         try {
            this.field_1397.removeFocusListener(this);
         } catch (Exception var5) {
            ;
         }

         try {
            this.method_2321(-758562952);
         } catch (Exception var4) {
            ;
         }

         if(null != this.field_1396) {
            try {
               System.exit(0);
            } catch (Throwable var3) {
               ;
            }
         }

         if(null != connection) {
            try {
               connection.close();
            } catch (Exception var2) {
               ;
            }
         }

         this.method_2328();
      }
   }

   // $FF: renamed from: bm () void
   protected final void method_2386() {
      Canvas var1 = this.field_1397;
      var1.addMouseListener(GameMouseListener.instance);
      var1.addMouseMotionListener(GameMouseListener.instance);
      var1.addFocusListener(GameMouseListener.instance);
   }

   // $FF: renamed from: ck () void
   public final void method_2387() {
      if(this == field_1375 && !field_1378) {
         field_1377 = 0L;
      }
   }

   // $FF: renamed from: et () boolean
   protected final boolean method_2388() {
      return null != this.field_1396;
   }

   // $FF: renamed from: cc () void
   public final void method_2389() {
      if(this == field_1375 && !field_1378) {
         field_1377 = 0L;
      }
   }

   // $FF: renamed from: d (java.lang.String, int) void
   protected void method_2390(String var1) {
      try {
         this.field_1405.setContents(new StringSelection(var1), (ClipboardOwner)null);
      } catch (RuntimeException var3) {
         throw class_223.method_4281(var3);
      }
   }

   // $FF: renamed from: cz () void
   public final void method_2391() {
      if(this == field_1375 && !field_1378) {
         field_1377 = (class_87.method_1516((byte)1) + 4000L) * -8724334031026931673L;
      }
   }

   // $FF: renamed from: cb () void
   public final void method_2392() {
      if(field_1375 == this && !field_1378) {
         field_1377 = class_87.method_1516((byte)1) * -8724334031026931673L;
         long var1 = 4999L;

         try {
            Thread.sleep(var1);
         } catch (InterruptedException var5) {
            ;
         }

         try {
            Thread.sleep(1L);
         } catch (InterruptedException var4) {
            ;
         }

         this.method_2313(1491344008);
      }
   }

   // $FF: renamed from: ce () void
   public final void method_2393() {
      if(field_1375 == this && !field_1378) {
         field_1377 = class_87.method_1516((byte)1) * -8724334031026931673L;
         long var1 = 4999L;

         try {
            Thread.sleep(var1);
         } catch (InterruptedException var5) {
            ;
         }

         try {
            Thread.sleep(1L);
         } catch (InterruptedException var4) {
            ;
         }

         this.method_2313(1035886347);
      }
   }

   // $FF: renamed from: an (java.lang.String) void
   protected void method_2394(String var1) {
      this.field_1405.setContents(new StringSelection(var1), (ClipboardOwner)null);
   }

   // $FF: renamed from: cy (java.awt.event.WindowEvent) void
   public final void method_2395() {}

   // $FF: renamed from: c (int, int) void
   static void method_2396(int var0) {
      try {
         class_177.loginMenuStage = -824225436;
         class_177.field_2192 = -174778505 * var0;
      } catch (RuntimeException var2) {
         throw class_223.method_4281(var2);
      }
   }

   // $FF: renamed from: el () boolean
   protected final boolean method_2397() {
      return null != this.field_1396;
   }

   // $FF: renamed from: cl (java.awt.event.WindowEvent) void
   public final void method_2398() {}

   // $FF: renamed from: df (java.awt.event.WindowEvent) void
   public final void method_2399() {}

   // $FF: renamed from: db (java.awt.event.WindowEvent) void
   public final void method_2400() {
      this.destroy();
   }

   // $FF: renamed from: dz (java.awt.event.WindowEvent) void
   public final void method_2401() {
      this.destroy();
   }

   // $FF: renamed from: ci () void
   void method_2402() {
      Container var1 = this.method_2325(1142166715);
      long var2 = class_87.method_1516((byte)1);
      long var4 = field_1407[-1807936759 * field_1385];
      field_1407[-1807936759 * field_1385] = var2;
      field_1385 = (1 + -1807936759 * field_1385 & 31) * 1046637369;
      if(0L != var4 && var2 > var4) {
         int var6 = (int)(var2 - var4);
         field_1382 = 1257878151 * (((var6 >> 1) + 32000) / var6);
      }

      if((field_1400 += -943892141) * 116937435 - 1 > 50) {
         field_1400 -= 50033206;
         this.field_1409 = true;
         this.field_1397.setSize(class_137.field_1766 * 646214551, class_58.field_460 * -1538307343);
         this.field_1397.setVisible(true);
         if(this.field_1396 == var1) {
            Insets var7 = this.field_1396.getInsets();
            this.field_1397.setLocation(this.field_1390 * -1437613301 + var7.left, var7.top + -179382835 * this.field_1374);
         } else {
            this.field_1397.setLocation(-1437613301 * this.field_1390, this.field_1374 * -179382835);
         }
      }

      if(this.field_1376) {
         this.method_2304((byte)6);
      }

      this.method_2315((byte)92);
      this.method_2320(this.field_1409, (short)25458);
      if(this.field_1409) {
         this.method_2303(2101906226);
      }

      this.field_1409 = false;
   }

   // $FF: renamed from: dr (java.awt.event.WindowEvent) void
   public final void method_2403() {}

   // $FF: renamed from: di (java.awt.event.WindowEvent) void
   public final void method_2404() {}

   // $FF: renamed from: eb () boolean
   protected final boolean method_2405() {
      return null != this.field_1396;
   }

   // $FF: renamed from: f (java.awt.Graphics) void
   public final synchronized void method_2406(Graphics var1) {
      if(field_1375 == this && !field_1378) {
         this.field_1409 = true;
         if(class_87.method_1516((byte)1) - 8555805370222747289L * this.field_1408 > 1000L) {
            Rectangle var2 = var1.getClipBounds();
            if(var2 == null || var2.width >= 646214551 * class_137.field_1766 && var2.height >= -1538307343 * class_58.field_460) {
               this.field_1376 = true;
            }
         }

      }
   }

   // $FF: renamed from: ds (java.awt.event.WindowEvent) void
   public final void method_2407() {}

   // $FF: renamed from: do (java.awt.event.WindowEvent) void
   public final void method_2408() {}

   // $FF: renamed from: q (java.awt.event.FocusEvent) void
   public final void method_2409() {
      field_1391 = false;
   }

   // $FF: renamed from: dv () void
   public abstract void method_2410();

   // $FF: renamed from: al (byte) void
   protected abstract void method_2413(byte var1);

   // $FF: renamed from: dx () void
   protected abstract void method_2414();

   // $FF: renamed from: dg (boolean) void
   protected abstract void method_2415(boolean var1);

   // $FF: renamed from: cj () void
   public final void method_2416() {
      if(this == field_1375 && !field_1378) {
         field_1377 = 0L;
      }
   }

   // $FF: renamed from: ef () int
   protected static int method_2418() {
      int var0 = 0;
      if(null == class_198.field_2340 || !class_198.field_2340.isValid()) {
         try {
            Iterator var1 = ManagementFactory.getGarbageCollectorMXBeans().iterator();

            while(var1.hasNext()) {
               GarbageCollectorMXBean var2 = (GarbageCollectorMXBean)var1.next();
               if(var2.isValid()) {
                  class_198.field_2340 = var2;
                  field_1403 = 4302826277310093293L;
                  field_1379 = 7975047348458726733L;
               }
            }
         } catch (Throwable var9) {
            ;
         }
      }

      if(class_198.field_2340 != null) {
         long var10 = class_87.method_1516((byte)1);
         long var3 = class_198.field_2340.getCollectionTime();
         if(-1L != 6246927008582722683L * field_1379) {
            long var5 = var3 - field_1379 * 6246927008582722683L;
            long var7 = var10 - -7805304911218154981L * field_1403;
            if(0L != var7) {
               var0 = (int)(100L * var5 / var7);
            }
         }

         field_1379 = -7975047348458726733L * var3;
         field_1403 = -4302826277310093293L * var10;
      }

      return var0;
   }

   // $FF: renamed from: dh (boolean) void
   protected abstract void method_2419(boolean var1);

   // $FF: renamed from: dl () void
   protected abstract void method_2420();

   // $FF: renamed from: t (java.awt.event.FocusEvent) void
   public final void method_2421() {
      field_1391 = true;
      this.field_1409 = true;
   }

   // $FF: renamed from: de (int, java.lang.String, boolean) void
   protected final void method_2422(int var1, String var2, boolean var3) {
      try {
         Graphics var4 = this.field_1397.getGraphics();
         if(class_83.field_780 == null) {
            class_83.field_780 = new Font("Helvetica", 1, 13);
            class_349.field_3938 = this.field_1397.getFontMetrics(class_83.field_780);
         }

         if(var3) {
            var4.setColor(Color.black);
            var4.fillRect(0, 0, 646214551 * class_137.field_1766, class_58.field_460 * -675589112);
         }

         Color var5 = new Color(140, 17, 17);

         try {
            if(field_1399 == null) {
               field_1399 = this.field_1397.createImage(304, 34);
            }

            Graphics var6 = field_1399.getGraphics();
            var6.setColor(var5);
            var6.drawRect(0, 0, 1597764645, 33);
            var6.fillRect(2, 2, var1 * 3, 30);
            var6.setColor(Color.black);
            var6.drawRect(1, 1, 1484970193, 31);
            var6.fillRect(2 + var1 * 3, 2, 300 - var1 * 3, 30);
            var6.setFont(class_83.field_780);
            var6.setColor(Color.white);
            var6.drawString(var2, (-1787750115 - class_349.field_3938.stringWidth(var2)) / 2, 22);
            var4.drawImage(field_1399, 646214551 * class_137.field_1766 / 2 - 152, class_58.field_460 * -1538307343 / 2 - 18, (ImageObserver)null);
         } catch (Exception var9) {
            int var7 = class_137.field_1766 * 646214551 / 2 - 1954650480;
            int var8 = class_58.field_460 * -1538307343 / 2 - 18;
            var4.setColor(var5);
            var4.drawRect(var7, var8, -1782561951, -1323140454);
            var4.fillRect(var7 + 2, var8 + 2, var1 * 3, 30);
            var4.setColor(Color.black);
            var4.drawRect(var7 + 1, var8 + 1, 301, 31);
            var4.fillRect(var7 + 2 + 3 * var1, var8 + 2, 300 - 3 * var1, 30);
            var4.setFont(class_83.field_780);
            var4.setColor(Color.white);
            var4.drawString(var2, var7 + (304 - class_349.field_3938.stringWidth(var2)) / 2, var8 + 22);
         }
      } catch (Exception var10) {
         this.field_1397.repaint();
      }

   }

   // $FF: renamed from: au (java.lang.String) void
   protected void method_2423(String var1) {
      this.field_1405.setContents(new StringSelection(var1), (ClipboardOwner)null);
   }

   public abstract void init();

   // $FF: renamed from: dw () void
   protected final void method_2424() {
      field_1399 = null;
      class_83.field_780 = null;
      class_349.field_3938 = null;
   }

   // $FF: renamed from: ec () void
   protected final void method_2425() {
      field_1399 = null;
      class_83.field_780 = null;
      class_349.field_3938 = null;
   }

   // $FF: renamed from: ea () void
   protected final void method_2426() {
      field_1399 = null;
      class_83.field_780 = null;
      class_349.field_3938 = null;
   }

   // $FF: renamed from: ej () boolean
   protected final boolean method_2427() {
      return null != this.field_1396;
   }

   // $FF: renamed from: eu (java.lang.String) void
   protected void method_2428(String var1) {
      if(!this.field_1381) {
         this.field_1381 = true;
         System.out.println("error_game_" + var1);

         try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + var1 + ".ws"), "_self");
         } catch (Exception var3) {
            ;
         }

      }
   }

   // $FF: renamed from: dp (int, java.lang.String, boolean) void
   protected final void method_2429(int var1, String var2, boolean var3) {
      try {
         Graphics var4 = this.field_1397.getGraphics();
         if(class_83.field_780 == null) {
            class_83.field_780 = new Font("Helvetica", 1, 13);
            class_349.field_3938 = this.field_1397.getFontMetrics(class_83.field_780);
         }

         if(var3) {
            var4.setColor(Color.black);
            var4.fillRect(0, 0, 646214551 * class_137.field_1766, class_58.field_460 * -1665738637);
         }

         Color var5 = new Color(140, 17, 17);

         try {
            if(field_1399 == null) {
               field_1399 = this.field_1397.createImage(-1398851682, 1673405168);
            }

            Graphics var6 = field_1399.getGraphics();
            var6.setColor(var5);
            var6.drawRect(0, 0, 1955395235, 33);
            var6.fillRect(2, 2, var1 * 3, 30);
            var6.setColor(Color.black);
            var6.drawRect(1, 1, -1392996457, 999346010);
            var6.fillRect(2 + var1 * 3, 2, -822108925 - var1 * 3, 30);
            var6.setFont(class_83.field_780);
            var6.setColor(Color.white);
            var6.drawString(var2, (304 - class_349.field_3938.stringWidth(var2)) / 2, 22);
            var4.drawImage(field_1399, 719180240 * class_137.field_1766 / 2 - 152, class_58.field_460 * 2105862257 / 2 - 18, (ImageObserver)null);
         } catch (Exception var9) {
            int var7 = class_137.field_1766 * -463745456 / 2 - 152;
            int var8 = class_58.field_460 * -1538307343 / 2 - 18;
            var4.setColor(var5);
            var4.drawRect(var7, var8, -336471142, 33);
            var4.fillRect(var7 + 2, var8 + 2, var1 * 3, 30);
            var4.setColor(Color.black);
            var4.drawRect(var7 + 1, var8 + 1, 186790292, -1825801393);
            var4.fillRect(var7 + 2 + 3 * var1, var8 + 2, 276031078 - 3 * var1, 30);
            var4.setFont(class_83.field_780);
            var4.setColor(Color.white);
            var4.drawString(var2, var7 + (-822245966 - class_349.field_3938.stringWidth(var2)) / 2, var8 + 22);
         }
      } catch (Exception var10) {
         this.field_1397.repaint();
      }

   }

   // $FF: renamed from: ed (java.lang.String) void
   protected void method_2430(String var1) {
      if(!this.field_1381) {
         this.field_1381 = true;
         System.out.println("error_game_" + var1);

         try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + var1 + ".ws"), "_self");
         } catch (Exception var3) {
            ;
         }

      }
   }

   // $FF: renamed from: bl () void
   protected final void method_2431() {
      class_287.method_5276(754026835);
      class_162.method_3417(this.field_1397);
   }

   // $FF: renamed from: ex () li
   class_351 method_2432() {
      Container var1 = this.method_2325(1142166715);
      int var2 = Math.max(var1.getWidth(), -1558391463 * this.field_1395);
      int var3 = Math.max(var1.getHeight(), this.field_1393 * -422930921);
      if(this.field_1396 != null) {
         Insets var4 = this.field_1396.getInsets();
         var2 -= var4.right + var4.left;
         var3 -= var4.bottom + var4.top;
      }

      class_351 var10000 = new class_351(var2, var3);
      return var10000;
   }

   // $FF: renamed from: ew () li
   class_351 method_2433() {
      Container var1 = this.method_2325(1142166715);
      int var2 = Math.max(var1.getWidth(), -1558391463 * this.field_1395);
      int var3 = Math.max(var1.getHeight(), this.field_1393 * -422930921);
      if(this.field_1396 != null) {
         Insets var4 = this.field_1396.getInsets();
         var2 -= var4.right + var4.left;
         var3 -= var4.bottom + var4.top;
      }

      class_351 var10000 = new class_351(var2, var3);
      return var10000;
   }

   // $FF: renamed from: ao (int, int) void
   protected final void method_2434(int var1, int var2) {
      if(this.field_1394 * 59571423 != var1 || this.field_1384 * -45318295 != var2) {
         this.method_2312();
      }

      this.field_1394 = var1 * -1004683489;
      this.field_1384 = var2 * -605552423;
   }

   // $FF: renamed from: du (boolean) void
   protected abstract void method_2435(boolean var1);

   public final void windowDeiconified(WindowEvent var1) {
      try {
         ;
      } catch (RuntimeException var2) {
         throw class_223.method_4281(var2);
      }
   }

   // $FF: renamed from: cw (java.awt.event.WindowEvent) void
   public final void method_2436() {}

   // $FF: renamed from: er () int
   protected static int method_2437() {
      int var0 = 0;
      if(null == class_198.field_2340 || !class_198.field_2340.isValid()) {
         try {
            Iterator var1 = ManagementFactory.getGarbageCollectorMXBeans().iterator();

            while(var1.hasNext()) {
               GarbageCollectorMXBean var2 = (GarbageCollectorMXBean)var1.next();
               if(var2.isValid()) {
                  class_198.field_2340 = var2;
                  field_1403 = 4302826277310093293L;
                  field_1379 = 7975047348458726733L;
               }
            }
         } catch (Throwable var9) {
            ;
         }
      }

      if(class_198.field_2340 != null) {
         long var10 = class_87.method_1516((byte)1);
         long var3 = class_198.field_2340.getCollectionTime();
         if(-1L != 6246927008582722683L * field_1379) {
            long var5 = var3 - field_1379 * 6246927008582722683L;
            long var7 = var10 - -7805304911218154981L * field_1403;
            if(0L != var7) {
               var0 = (int)(100L * var5 / var7);
            }
         }

         field_1379 = -7975047348458726733L * var3;
         field_1403 = -4302826277310093293L * var10;
      }

      return var0;
   }

   // $FF: renamed from: b (int) void
   protected void method_2438() {
      try {
         this.field_1405 = this.getToolkit().getSystemClipboard();
      } catch (RuntimeException var2) {
         throw class_223.method_4281(var2);
      }
   }

   // $FF: renamed from: am (byte) boolean
   protected final boolean method_2439(byte var1) {
      try {
         boolean var10000;
         if(null != this.field_1396) {
            if(var1 == 2) {
               throw new IllegalStateException();
            }

            var10000 = true;
         } else {
            var10000 = false;
         }

         return var10000;
      } catch (RuntimeException var2) {
         throw class_223.method_4281(var2);
      }
   }

   // $FF: renamed from: co () void
   public final void method_2440() {
      if(this == field_1375 && !field_1378) {
         field_1377 = 0L;
      }
   }

   // $FF: renamed from: es () void
   protected abstract void method_2441();

   // $FF: renamed from: bu () void
   protected final void method_2442() {
      class_287.method_5276(754026835);
      class_162.method_3417(this.field_1397);
   }

   // $FF: renamed from: v (java.awt.Graphics) void
   public final void method_2443(Graphics var1) {
      this.paint(var1);
   }
}
