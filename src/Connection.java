import java.io.DataInputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;

// $FF: renamed from: dp
public class Connection implements Runnable {

   // $FF: renamed from: n java.lang.String
   public static String javaVersion;
   // $FF: renamed from: f eu
   HostData hostData;
   // $FF: renamed from: p java.lang.Thread
   Thread thread;
   // $FF: renamed from: y eu
   HostData field_2357;
   // $FF: renamed from: j boolean
   boolean field_2358;
   // $FF: renamed from: v java.lang.String
   public static String javaVendor;
   // $FF: renamed from: ex lz
   static class_360 field_2360;

   // $FF: renamed from: d (java.lang.String, int) eu
   public final HostData method_4055(String var1, int var2) {
      return this.setRunnable(1, var2, var1, 943820878);
   }

   // $FF: renamed from: n (int, int, int, java.lang.Object, int) eu
   final HostData setRunnable(int var1, int port, Object runnable, int var5) {
      try {
         HostData var10000 = new HostData();
         HostData var6 = var10000;
         var6.field_2450 = 548150565 * var1;
         var6.port = port;
         var6.host = runnable;
         synchronized(this) {
            if(this.field_2357 != null) {
               if(var5 == 259457722) {
                  throw new IllegalStateException();
               }

               this.field_2357.field_2453 = var6;
               this.field_2357 = var6;
            } else {
               this.field_2357 = this.hostData = var6;
            }

            this.notify();
            return var6;
         }
      } catch (RuntimeException var10) {
         throw class_223.method_4281(var10);
      }
   }

   // $FF: renamed from: f (java.lang.String, int, byte) eu
   public final HostData connect(String var1, int var2) {
      try {
         return this.setRunnable(1, var2, var1, 2094219759);
      } catch (RuntimeException var4) {
         throw class_223.method_4281(var4);
      }
   }

   // $FF: renamed from: y (java.lang.Runnable, int, byte) eu
   public final HostData method_4058(Runnable var1, int var2) {
      try {
         return this.setRunnable(2, var2, var1, -46619903);
      } catch (RuntimeException var4) {
         throw class_223.method_4281(var4);
      }
   }

   public final void run() {
      try {
         while(true) {
            HostData var1;
            synchronized(this) {
               while(true) {
                  if(this.field_2358) {
                     return;
                  }

                  if(this.hostData != null) {
                     var1 = this.hostData;
                     this.hostData = this.hostData.field_2453;
                     if(this.hostData == null) {
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
                  String host = ReplayServer.getHost((String)var1.host);
                  var1.socket = new Socket(InetAddress.getByName(host), var1.port);
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
         throw class_223.method_4281(var9);
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
         throw class_223.method_4281(var12);
      }
   }

   // $FF: renamed from: l (java.lang.String, int) eu
   public final HostData method_4064(String var1, int var2) {
      return this.setRunnable(1, var2, var1, 1664192045);
   }

   // $FF: renamed from: s (java.lang.String, int) eu
   public final HostData method_4065(String var1, int var2) {
      return this.setRunnable(1, var2, var1, 1591396315);
   }

   // $FF: renamed from: <init> () void
   public Connection() {
      super();
      try {
         this.hostData = null;
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
         this.thread = new Thread(this);
         this.thread.setPriority(10);
         this.thread.setDaemon(true);
         this.thread.start();
      } catch (RuntimeException var3) {
         throw class_223.method_4281(var3);
      }
   }

   // $FF: renamed from: v (byte) void
   public final void close() {
      try {
         synchronized(this) {
            this.field_2358 = true;
            this.notifyAll();
         }

         try {
            this.thread.join();
         } catch (InterruptedException var4) {
            ;
         }

      } catch (RuntimeException var6) {
         throw class_223.method_4281(var6);
      }
   }

   // $FF: renamed from: o (java.lang.Runnable, int) eu
   public final HostData method_4068(Runnable var1, int var2) {
      return this.setRunnable(2, var2, var1, 621516851);
   }

   // $FF: renamed from: c (java.lang.Runnable, int) eu
   public final HostData method_4069(Runnable var1, int var2) {
      return this.setRunnable(2, var2, var1, -1981665603);
   }

   // $FF: renamed from: u (java.lang.String, int) eu
   public final HostData method_4070(String var1, int var2) {
      return this.setRunnable(1, var2, var1, -925684790);
   }
}
