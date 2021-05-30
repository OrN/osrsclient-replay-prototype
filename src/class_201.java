import java.io.DataInputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;

// $FF: renamed from: dp
public class class_201 implements Runnable {

   // $FF: renamed from: r int
   static final int field_2352 = 1;
   // $FF: renamed from: n java.lang.String
   public static String javaVersion;
   // $FF: renamed from: f eu
   class_214 field_2354;
   // $FF: renamed from: d int
   static final int field_2355 = 4;
   // $FF: renamed from: p java.lang.Thread
   Thread field_2356;
   // $FF: renamed from: y eu
   class_214 field_2357;
   // $FF: renamed from: j boolean
   boolean field_2358;
   // $FF: renamed from: v java.lang.String
   public static String javaVendor;
   // $FF: renamed from: ex lz
   static class_360 field_2360;
   // $FF: renamed from: i int
   static final int field_2361 = 127;


   // $FF: renamed from: bc () void
   public final void method_4053() {
      while(true) {
         class_214 var1;
         synchronized(this) {
            while(true) {
               if(this.field_2358) {
                  return;
               }

               if(this.field_2354 != null) {
                  var1 = this.field_2354;
                  this.field_2354 = this.field_2354.field_2453;
                  if(this.field_2354 == null) {
                     this.field_2357 = null;
                  }
                  break;
               }

               try {
                  this.wait();
               } catch (InterruptedException var7) {
                  ;
               }
            }
         }

         try {
            int var2 = var1.field_2450 * -308758867;
            if(var2 == 1) {
               var1.socket = new Socket(InetAddress.getByName((String)var1.host), var1.port);
            } else if(var2 == 2) {
               Thread thread = new Thread((Runnable)var1.host);
               thread.setDaemon(true);
               thread.start();
               thread.setPriority(var1.port);
               var1.socket = thread;
            } else if(4 == var2) {
               var1.socket = new DataInputStream(((URL)var1.host).openStream());
            }

            var1.field_2446 = 1;
         } catch (ThreadDeath var5) {
            throw var5;
         } catch (Throwable var6) {
            var1.field_2446 = 2;
         }
      }
   }

   // $FF: renamed from: p () void
   public final void method_4054() {
      synchronized(this) {
         this.field_2358 = true;
         this.notifyAll();
      }

      try {
         this.field_2356.join();
      } catch (InterruptedException var3) {
         ;
      }

   }

   // $FF: renamed from: d (java.lang.String, int) eu
   public final class_214 method_4055(String var1, int var2) {
      return this.method_4056(1, var2, 0, var1, 943820878);
   }

   // $FF: renamed from: n (int, int, int, java.lang.Object, int) eu
   final class_214 method_4056(int var1, int var2, int var3, Object var4, int var5) {
      try {
         class_214 var10000 = new class_214();
         class_214 var6 = var10000;
         var6.field_2450 = 548150565 * var1;
         var6.port = var2;
         var6.host = var4;
         synchronized(this) {
            if(this.field_2357 != null) {
               if(var5 == 259457722) {
                  throw new IllegalStateException();
               }

               this.field_2357.field_2453 = var6;
               this.field_2357 = var6;
            } else {
               this.field_2357 = this.field_2354 = var6;
            }

            this.notify();
            return var6;
         }
      } catch (RuntimeException var10) {
         throw class_223.method_4281(var10, "dp.n(" + ')');
      }
   }

   // $FF: renamed from: f (java.lang.String, int, byte) eu
   public final class_214 method_4057(String var1, int var2, byte var3) {
      try {
         return this.method_4056(1, var2, 0, var1, 2094219759);
      } catch (RuntimeException var4) {
         throw class_223.method_4281(var4, "dp.f(" + ')');
      }
   }

   // $FF: renamed from: y (java.lang.Runnable, int, byte) eu
   public final class_214 method_4058(Runnable var1, int var2, byte var3) {
      try {
         return this.method_4056(2, var2, 0, var1, -46619903);
      } catch (RuntimeException var4) {
         throw class_223.method_4281(var4, "dp.y(" + ')');
      }
   }

   // $FF: renamed from: by () void
   public final void method_4059() {
      while(true) {
         class_214 var1;
         synchronized(this) {
            while(true) {
               if(this.field_2358) {
                  return;
               }

               if(this.field_2354 != null) {
                  var1 = this.field_2354;
                  this.field_2354 = this.field_2354.field_2453;
                  if(this.field_2354 == null) {
                     this.field_2357 = null;
                  }
                  break;
               }

               try {
                  this.wait();
               } catch (InterruptedException var7) {
                  ;
               }
            }
         }

         try {
            int var2 = var1.field_2450 * 1269022157;
            if(var2 == 1) {
               var1.socket = new Socket(InetAddress.getByName((String)var1.host), var1.port);
            } else if(var2 == 2) {
               Thread var3 = new Thread((Runnable)var1.host);
               var3.setDaemon(true);
               var3.start();
               var3.setPriority(var1.port);
               var1.socket = var3;
            } else if(4 == var2) {
               var1.socket = new DataInputStream(((URL)var1.host).openStream());
            }

            var1.field_2446 = 1;
         } catch (ThreadDeath var5) {
            throw var5;
         } catch (Throwable var6) {
            var1.field_2446 = 2;
         }
      }
   }

   public final void run() {
      try {
         while(true) {
            class_214 var1;
            synchronized(this) {
               while(true) {
                  if(this.field_2358) {
                     return;
                  }

                  if(this.field_2354 != null) {
                     var1 = this.field_2354;
                     this.field_2354 = this.field_2354.field_2453;
                     if(this.field_2354 == null) {
                        this.field_2357 = null;
                     }
                     break;
                  }

                  try {
                     this.wait();
                  } catch (InterruptedException var7) {
                     ;
                  }
               }
            }

            try {
               int var2 = var1.field_2450 * -308758867;
               if(var2 == 1) {
                  var1.socket = new Socket(InetAddress.getByName((String)var1.host), var1.port);
               } else if(var2 == 2) {
                  Thread var3 = new Thread((Runnable)var1.host);
                  var3.setDaemon(true);
                  var3.start();
                  var3.setPriority(var1.port);
                  var1.socket = var3;
               } else if(4 == var2) {
                  var1.socket = new DataInputStream(((URL)var1.host).openStream());
               }

               var1.field_2446 = 1;
            } catch (ThreadDeath var5) {
               throw var5;
            } catch (Throwable var6) {
               var1.field_2446 = 2;
            }
         }
      } catch (RuntimeException var9) {
         throw class_223.method_4281(var9, "dp.run(" + ')');
      }
   }

   // $FF: renamed from: f (java.lang.String[], int[], int, int, byte) void
   static void method_4060(String[] var0, int[] var1, int var2, int var3, byte var4) {
      try {
         if(var2 < var3) {
            if(var4 <= 98) {
               throw new IllegalStateException();
            }

            int var5 = (var3 + var2) / 2;
            int var6 = var2;
            String var7 = var0[var5];
            var0[var5] = var0[var3];
            var0[var3] = var7;
            int var8 = var1[var5];
            var1[var5] = var1[var3];
            var1[var3] = var8;

            for(int var9 = var2; var9 < var3; ++var9) {
               if(var4 <= 98) {
                  throw new IllegalStateException();
               }

               if(null != var7) {
                  if(var4 <= 98) {
                     throw new IllegalStateException();
                  }

                  if(null == var0[var9] || var0[var9].compareTo(var7) >= (var9 & 1)) {
                     continue;
                  }

                  if(var4 <= 98) {
                     return;
                  }
               }

               String var10 = var0[var9];
               var0[var9] = var0[var6];
               var0[var6] = var10;
               int var11 = var1[var9];
               var1[var9] = var1[var6];
               var1[var6++] = var11;
            }

            var0[var3] = var0[var6];
            var0[var6] = var7;
            var1[var3] = var1[var6];
            var1[var6] = var8;
            method_4060(var0, var1, var2, var6 - 1, (byte)100);
            method_4060(var0, var1, 1 + var6, var3, (byte)122);
         }

      } catch (RuntimeException var12) {
         throw class_223.method_4281(var12, "dp.f(" + ')');
      }
   }

   // $FF: renamed from: j (int, int, int, java.lang.Object) eu
   final class_214 method_4061(int var1, int var2, int var3, Object var4) {
      class_214 var10000 = new class_214();
      class_214 var5 = var10000;
      var5.field_2450 = -1398399643 * var1;
      var5.port = var2;
      var5.host = var4;
      synchronized(this) {
         if(this.field_2357 != null) {
            this.field_2357.field_2453 = var5;
            this.field_2357 = var5;
         } else {
            this.field_2357 = this.field_2354 = var5;
         }

         this.notify();
         return var5;
      }
   }

   // $FF: renamed from: r (int, int, int, java.lang.Object) eu
   final class_214 method_4062(int var1, int var2, int var3, Object var4) {
      class_214 var10000 = new class_214();
      class_214 var5 = var10000;
      var5.field_2450 = 548150565 * var1;
      var5.port = var2;
      var5.host = var4;
      synchronized(this) {
         if(this.field_2357 != null) {
            this.field_2357.field_2453 = var5;
            this.field_2357 = var5;
         } else {
            this.field_2357 = this.field_2354 = var5;
         }

         this.notify();
         return var5;
      }
   }

   // $FF: renamed from: b (int, int, int, java.lang.Object) eu
   final class_214 method_4063(int var1, int var2, int var3, Object var4) {
      class_214 var10000 = new class_214();
      class_214 var5 = var10000;
      var5.field_2450 = 548150565 * var1;
      var5.port = var2;
      var5.host = var4;
      synchronized(this) {
         if(this.field_2357 != null) {
            this.field_2357.field_2453 = var5;
            this.field_2357 = var5;
         } else {
            this.field_2357 = this.field_2354 = var5;
         }

         this.notify();
         return var5;
      }
   }

   // $FF: renamed from: l (java.lang.String, int) eu
   public final class_214 method_4064(String var1, int var2) {
      return this.method_4056(1, var2, 0, var1, 1664192045);
   }

   // $FF: renamed from: s (java.lang.String, int) eu
   public final class_214 method_4065(String var1, int var2) {
      return this.method_4056(1, var2, 0, var1, 1591396315);
   }

   // $FF: renamed from: <init> () void
   public class_201() {
      super();
      try {
         this.field_2354 = null;
         this.field_2357 = null;
         this.field_2358 = false;
         javaVendor = "Unknown";
         javaVersion = "1.6";

         try {
            javaVendor = System.getProperty("java.vendor");
            javaVersion = System.getProperty("java.version");
         } catch (Exception var2) {
            ;
         }

         this.field_2358 = false;
         this.field_2356 = new Thread(this);
         this.field_2356.setPriority(10);
         this.field_2356.setDaemon(true);
         this.field_2356.start();
      } catch (RuntimeException var3) {
         throw class_223.method_4281(var3, "dp.<init>(" + ')');
      }
   }

   // $FF: renamed from: v (byte) void
   public final void method_4067(byte var1) {
      try {
         synchronized(this) {
            this.field_2358 = true;
            this.notifyAll();
         }

         try {
            this.field_2356.join();
         } catch (InterruptedException var4) {
            ;
         }

      } catch (RuntimeException var6) {
         throw class_223.method_4281(var6, "dp.v(" + ')');
      }
   }

   // $FF: renamed from: o (java.lang.Runnable, int) eu
   public final class_214 method_4068(Runnable var1, int var2) {
      return this.method_4056(2, var2, 0, var1, 621516851);
   }

   // $FF: renamed from: c (java.lang.Runnable, int) eu
   public final class_214 method_4069(Runnable var1, int var2) {
      return this.method_4056(2, var2, 0, var1, -1981665603);
   }

   // $FF: renamed from: u (java.lang.String, int) eu
   public final class_214 method_4070(String var1, int var2) {
      return this.method_4056(1, var2, 0, var1, -925684790);
   }
}
