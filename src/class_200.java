import java.io.DataInputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.LinkedList;
import java.util.Queue;

// $FF: renamed from: do
public class class_200 implements Runnable {

   // $FF: renamed from: v java.lang.Thread
   final Thread field_2348;
   // $FF: renamed from: n boolean
   volatile boolean field_2349;
   // $FF: renamed from: e int[][][]
   static int[][][] field_2350;
   // $FF: renamed from: f java.util.Queue
   Queue field_2351;


   // $FF: renamed from: f (java.net.URL) df
   public class_194 method_4036(URL var1) {
      class_194 var10000 = new class_194(var1);
      class_194 var2 = var10000;
      synchronized(this) {
         this.field_2351.add(var2);
         this.notify();
         return var2;
      }
   }

   // $FF: renamed from: j (java.net.URL) df
   public class_194 method_4037(URL var1) {
      class_194 var10000 = new class_194(var1);
      class_194 var2 = var10000;
      synchronized(this) {
         this.field_2351.add(var2);
         this.notify();
         return var2;
      }
   }

   // $FF: renamed from: v (java.net.URL, int) df
   public class_194 method_4038(URL var1, int var2) {
      try {
         class_194 var10000 = new class_194(var1);
         class_194 var3 = var10000;
         synchronized(this) {
            this.field_2351.add(var3);
            this.notify();
            return var3;
         }
      } catch (RuntimeException var7) {
         throw class_223.method_4281(var7, "do.v(" + ')');
      }
   }

   // $FF: renamed from: n (int) void
   public void method_4039(int var1) {
      try {
         this.field_2349 = true;

         try {
            synchronized(this) {
               this.notify();
            }

            this.field_2348.join();
         } catch (InterruptedException var5) {
            ;
         }

      } catch (RuntimeException var6) {
         throw class_223.method_4281(var6, "do.n(" + ')');
      }
   }

   // $FF: renamed from: by () void
   public void method_4040() {
      while(!this.field_2349) {
         try {
            class_194 var1;
            synchronized(this) {
               var1 = (class_194)this.field_2351.poll();
               if(null == var1) {
                  try {
                     this.wait();
                  } catch (InterruptedException var12) {
                     ;
                  }
                  continue;
               }
            }

            DataInputStream var2 = null;
            URLConnection var3 = null;

            try {
               var3 = var1.field_2306.openConnection();
               var3.setConnectTimeout(1498990057);
               var3.setReadTimeout(12624274);
               var3.setUseCaches(false);
               var3.setRequestProperty("Connection", "close");
               int var4 = var3.getContentLength();
               if(var4 >= 0) {
                  byte[] var5 = new byte[var4];
                  var2 = new DataInputStream(var3.getInputStream());
                  var2.readFully(var5);
                  var1.field_2304 = var5;
               }

               var1.field_2303 = true;
            } catch (IOException var13) {
               var1.field_2303 = true;
            } finally {
               if(null != var2) {
                  var2.close();
               }

               if(var3 != null && var3 instanceof HttpURLConnection) {
                  ((HttpURLConnection)var3).disconnect();
               }

            }
         } catch (Exception var16) {
            class_308.method_5523((String)null, var16, 1928285241);
         }
      }

   }

   // $FF: renamed from: bc () void
   public void method_4041() {
      while(!this.field_2349) {
         try {
            class_194 var1;
            synchronized(this) {
               var1 = (class_194)this.field_2351.poll();
               if(null == var1) {
                  try {
                     this.wait();
                  } catch (InterruptedException var12) {
                     ;
                  }
                  continue;
               }
            }

            DataInputStream var2 = null;
            URLConnection var3 = null;

            try {
               var3 = var1.field_2306.openConnection();
               var3.setConnectTimeout(5000);
               var3.setReadTimeout(-1770600986);
               var3.setUseCaches(false);
               var3.setRequestProperty("Connection", "close");
               int var4 = var3.getContentLength();
               if(var4 >= 0) {
                  byte[] var5 = new byte[var4];
                  var2 = new DataInputStream(var3.getInputStream());
                  var2.readFully(var5);
                  var1.field_2304 = var5;
               }

               var1.field_2303 = true;
            } catch (IOException var13) {
               var1.field_2303 = true;
            } finally {
               if(null != var2) {
                  var2.close();
               }

               if(var3 != null && var3 instanceof HttpURLConnection) {
                  ((HttpURLConnection)var3).disconnect();
               }

            }
         } catch (Exception var16) {
            class_308.method_5523((String)null, var16, 1935810998);
         }
      }

   }

   public void run() {
      try {
         while(!this.field_2349) {
            try {
               class_194 var1;
               synchronized(this) {
                  var1 = (class_194)this.field_2351.poll();
                  if(null == var1) {
                     try {
                        this.wait();
                     } catch (InterruptedException var13) {
                        ;
                     }
                     continue;
                  }
               }

               DataInputStream var2 = null;
               URLConnection var3 = null;

               try {
                  var3 = var1.field_2306.openConnection();
                  var3.setConnectTimeout(5000);
                  var3.setReadTimeout(5000);
                  var3.setUseCaches(false);
                  var3.setRequestProperty("Connection", "close");
                  int var4 = var3.getContentLength();
                  if(var4 >= 0) {
                     byte[] var5 = new byte[var4];
                     var2 = new DataInputStream(var3.getInputStream());
                     var2.readFully(var5);
                     var1.field_2304 = var5;
                  }

                  var1.field_2303 = true;
               } catch (IOException var14) {
                  var1.field_2303 = true;
               } finally {
                  if(null != var2) {
                     var2.close();
                  }

                  if(var3 != null && var3 instanceof HttpURLConnection) {
                     ((HttpURLConnection)var3).disconnect();
                  }

               }
            } catch (Exception var17) {
               class_308.method_5523((String)null, var17, 2074948823);
            }
         }

      } catch (RuntimeException var18) {
         throw class_223.method_4281(var18, "do.run(" + ')');
      }
   }

   // $FF: renamed from: gu (int, int, int, int, boolean, int) void
   static final void method_4042(int var0, int var1, int var2, int var3, boolean var4, int var5) {
      try {
         if(var2 < 1) {
            if(var5 == 421421542) {
               throw new IllegalStateException();
            }

            var2 = 1;
         }

         if(var3 < 1) {
            if(var5 == 421421542) {
               throw new IllegalStateException();
            }

            var3 = 1;
         }

         int var6 = var3 - 334;
         int var7;
         if(var6 < 0) {
            if(var5 == 421421542) {
               throw new IllegalStateException();
            }

            var7 = client.field_1670;
         } else if(var6 >= 100) {
            var7 = client.field_1671;
         } else {
            var7 = client.field_1670 + (client.field_1671 - client.field_1670) * var6 / 100;
         }

         int var8 = 512 * var7 * var3 / (334 * var2);
         int var9;
         int var10;
         short var12;
         if(var8 < client.field_1676) {
            var12 = client.field_1676;
            var7 = var12 * var2 * 334 / (512 * var3);
            if(var7 > client.field_1604) {
               if(var5 == 421421542) {
                  throw new IllegalStateException();
               }

               var7 = client.field_1604;
               var9 = 512 * var3 * var7 / (334 * var12);
               var10 = (var2 - var9) / 2;
               if(var4) {
                  class_65.method_657();
                  class_65.method_681(var0, var1, var10, var3, -16777216);
                  class_65.method_681(var2 + var0 - var10, var1, var10, var3, -16777216);
               }

               var0 += var10;
               var2 -= 2 * var10;
            }
         } else if(var8 > client.field_1677) {
            if(var5 == 421421542) {
               throw new IllegalStateException();
            }

            var12 = client.field_1677;
            var7 = 334 * var12 * var2 / (var3 * 512);
            if(var7 < client.field_1685) {
               if(var5 == 421421542) {
                  throw new IllegalStateException();
               }

               var7 = client.field_1685;
               var9 = var12 * var2 * 334 / (var7 * 512);
               var10 = (var3 - var9) / 2;
               if(var4) {
                  if(var5 == 421421542) {
                     return;
                  }

                  class_65.method_657();
                  class_65.method_681(var0, var1, var2, var10, -16777216);
                  class_65.method_681(var0, var3 + var1 - var10, var2, var10, -16777216);
               }

               var1 += var10;
               var3 -= 2 * var10;
            }
         }

         label98: {
            client.field_1682 = var7 * var3 / 334 * -1335012267;
            if(var2 == -592780465 * client.field_1680) {
               if(var5 == 421421542) {
                  throw new IllegalStateException();
               }

               if(1806233111 * client.field_1681 == var3) {
                  break label98;
               }

               if(var5 == 421421542) {
                  throw new IllegalStateException();
               }
            }

            class_120.method_2265(var2, var3, (byte)12);
         }

         client.field_1678 = 1559123305 * var0;
         client.field_1679 = var1 * -1227994717;
         client.field_1680 = 432296879 * var2;
         client.field_1681 = -1936905817 * var3;
      } catch (RuntimeException var11) {
         throw class_223.method_4281(var11, "do.gu(" + ')');
      }
   }

   // $FF: renamed from: p (java.net.URL) df
   public class_194 method_4043(URL var1) {
      class_194 var10000 = new class_194(var1);
      class_194 var2 = var10000;
      synchronized(this) {
         this.field_2351.add(var2);
         this.notify();
         return var2;
      }
   }

   // $FF: renamed from: b () void
   public void method_4044() {
      this.field_2349 = true;

      try {
         synchronized(this) {
            this.notify();
         }

         this.field_2348.join();
      } catch (InterruptedException var4) {
         ;
      }

   }

   // $FF: renamed from: r (java.net.URL) df
   public class_194 method_4045(URL var1) {
      class_194 var10000 = new class_194(var1);
      class_194 var2 = var10000;
      synchronized(this) {
         this.field_2351.add(var2);
         this.notify();
         return var2;
      }
   }

   // $FF: renamed from: l () void
   public void method_4046() {
      this.field_2349 = true;

      try {
         synchronized(this) {
            this.notify();
         }

         this.field_2348.join();
      } catch (InterruptedException var4) {
         ;
      }

   }

   // $FF: renamed from: d () void
   public void method_4047() {
      this.field_2349 = true;

      try {
         synchronized(this) {
            this.notify();
         }

         this.field_2348.join();
      } catch (InterruptedException var4) {
         ;
      }

   }

   // $FF: renamed from: s () void
   public void method_4048() {
      this.field_2349 = true;

      try {
         synchronized(this) {
            this.notify();
         }

         this.field_2348.join();
      } catch (InterruptedException var4) {
         ;
      }

   }

   // $FF: renamed from: u () void
   public void method_4049() {
      this.field_2349 = true;

      try {
         synchronized(this) {
            this.notify();
         }

         this.field_2348.join();
      } catch (InterruptedException var4) {
         ;
      }

   }

   // $FF: renamed from: y (java.net.URL) df
   public class_194 method_4050(URL var1) {
      class_194 var10000 = new class_194(var1);
      class_194 var2 = var10000;
      synchronized(this) {
         this.field_2351.add(var2);
         this.notify();
         return var2;
      }
   }

   // $FF: renamed from: <init> () void
   public class_200() {
      super();
      try {
         this.field_2351 = new LinkedList();
         this.field_2348 = new Thread(this);
         this.field_2348.setPriority(1);
         this.field_2348.start();
      } catch (RuntimeException var1) {
         throw class_223.method_4281(var1, "do.<init>(" + ')');
      }
   }

   // $FF: renamed from: az (int, cf, boolean, int) int
   static int method_4052(int var0, class_90 var1, boolean var2, int var3) {
      try {
         if(var0 == 6200) {
            if(var3 != 1175355119) {
               throw new IllegalStateException();
            } else {
               class_136.field_1752 -= 2119512838;
               client.field_1670 = (short)class_135.method_2945(class_165.field_2052[-26460885 * class_136.field_1752], (short)323);
               if(client.field_1670 <= 0) {
                  if(var3 != 1175355119) {
                     throw new IllegalStateException();
                  }

                  client.field_1670 = 256;
               }

               client.field_1671 = (short)class_135.method_2945(class_165.field_2052[class_136.field_1752 * -26460885 + 1], (short)7571);
               if(client.field_1671 <= 0) {
                  if(var3 != 1175355119) {
                     throw new IllegalStateException();
                  }

                  client.field_1671 = 256;
               }

               return 1;
            }
         } else if(var0 == 6201) {
            if(var3 != 1175355119) {
               throw new IllegalStateException();
            } else {
               class_136.field_1752 -= 2119512838;
               client.field_1672 = (short)class_165.field_2052[-26460885 * class_136.field_1752];
               if(client.field_1672 <= 0) {
                  if(var3 != 1175355119) {
                     throw new IllegalStateException();
                  }

                  client.field_1672 = 256;
               }

               client.field_1673 = (short)class_165.field_2052[1 + -26460885 * class_136.field_1752];
               if(client.field_1673 <= 0) {
                  client.field_1673 = 320;
               }

               return 1;
            }
         } else if(var0 == 6202) {
            if(var3 != 1175355119) {
               throw new IllegalStateException();
            } else {
               class_136.field_1752 -= -55941620;
               client.field_1685 = (short)class_165.field_2052[class_136.field_1752 * -26460885];
               if(client.field_1685 <= 0) {
                  if(var3 != 1175355119) {
                     throw new IllegalStateException();
                  }

                  client.field_1685 = 1;
               }

               client.field_1604 = (short)class_165.field_2052[-26460885 * class_136.field_1752 + 1];
               if(client.field_1604 <= 0) {
                  if(var3 != 1175355119) {
                     throw new IllegalStateException();
                  }

                  client.field_1604 = 32767;
               } else if(client.field_1604 < client.field_1685) {
                  if(var3 != 1175355119) {
                     throw new IllegalStateException();
                  }

                  client.field_1604 = client.field_1685;
               }

               client.field_1676 = (short)class_165.field_2052[2 + class_136.field_1752 * -26460885];
               if(client.field_1676 <= 0) {
                  if(var3 != 1175355119) {
                     throw new IllegalStateException();
                  }

                  client.field_1676 = 1;
               }

               client.field_1677 = (short)class_165.field_2052[3 + class_136.field_1752 * -26460885];
               if(client.field_1677 <= 0) {
                  if(var3 != 1175355119) {
                     throw new IllegalStateException();
                  }

                  client.field_1677 = 32767;
               } else if(client.field_1677 < client.field_1676) {
                  client.field_1677 = client.field_1676;
               }

               return 1;
            }
         } else if(var0 == 6203) {
            if(var3 != 1175355119) {
               throw new IllegalStateException();
            } else {
               if(null != client.field_1614) {
                  method_4042(0, 0, client.field_1614.field_104 * 1163271639, client.field_1614.field_117 * -571887853, false, 52259784);
                  class_165.field_2052[(class_136.field_1752 += -1087727229) * -26460885 - 1] = -592780465 * client.field_1680;
                  class_165.field_2052[(class_136.field_1752 += -1087727229) * -26460885 - 1] = 1806233111 * client.field_1681;
               } else {
                  class_165.field_2052[(class_136.field_1752 += -1087727229) * -26460885 - 1] = -1;
                  class_165.field_2052[(class_136.field_1752 += -1087727229) * -26460885 - 1] = -1;
               }

               return 1;
            }
         } else if(6204 == var0) {
            if(var3 != 1175355119) {
               throw new IllegalStateException();
            } else {
               class_165.field_2052[(class_136.field_1752 += -1087727229) * -26460885 - 1] = client.field_1672;
               class_165.field_2052[(class_136.field_1752 += -1087727229) * -26460885 - 1] = client.field_1673;
               return 1;
            }
         } else if(var0 == 6205) {
            class_165.field_2052[(class_136.field_1752 += -1087727229) * -26460885 - 1] = class_187.method_3886(client.field_1670, 70996791);
            class_165.field_2052[(class_136.field_1752 += -1087727229) * -26460885 - 1] = class_187.method_3886(client.field_1671, 600371185);
            return 1;
         } else if(var0 == 6220) {
            class_165.field_2052[(class_136.field_1752 += -1087727229) * -26460885 - 1] = 0;
            return 1;
         } else if(6221 == var0) {
            if(var3 != 1175355119) {
               throw new IllegalStateException();
            } else {
               class_165.field_2052[(class_136.field_1752 += -1087727229) * -26460885 - 1] = 0;
               return 1;
            }
         } else if(var0 == 6222) {
            if(var3 != 1175355119) {
               throw new IllegalStateException();
            } else {
               class_165.field_2052[(class_136.field_1752 += -1087727229) * -26460885 - 1] = 646214551 * class_137.field_1766;
               return 1;
            }
         } else if(var0 == 6223) {
            if(var3 != 1175355119) {
               throw new IllegalStateException();
            } else {
               class_165.field_2052[(class_136.field_1752 += -1087727229) * -26460885 - 1] = -1538307343 * class_58.field_460;
               return 1;
            }
         } else {
            return 2;
         }
      } catch (RuntimeException var4) {
         throw class_223.method_4281(var4, "do.az(" + ')');
      }
   }
}
