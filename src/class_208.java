import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

// $FF: renamed from: ea
public final class class_208 extends class_206 implements Runnable {

   // $FF: renamed from: j eu
   class_214 field_2405;
   // $FF: renamed from: n java.io.OutputStream
   OutputStream field_2406;
   // $FF: renamed from: f java.net.Socket
   Socket field_2407;
   // $FF: renamed from: v java.io.InputStream
   InputStream field_2408;
   // $FF: renamed from: p dp
   class_201 field_2409;
   // $FF: renamed from: y boolean
   boolean field_2410;
   // $FF: renamed from: r byte[]
   byte[] field_2411;
   // $FF: renamed from: b int
   int field_2412;
   // $FF: renamed from: se by
   public static class_160 field_2413;
   // $FF: renamed from: s boolean
   boolean field_2414;
   // $FF: renamed from: u int
   final int field_2415;
   // $FF: renamed from: l int
   final int field_2416;
   // $FF: renamed from: z int
   public static final int field_2417 = 16777216;
   // $FF: renamed from: d int
   int field_2418;
   // $FF: renamed from: bl int
   static final int field_2419 = 1005;


   // $FF: renamed from: <init> (java.net.Socket, dp, int) void
   public class_208(Socket var1, class_201 var2, int var3) throws IOException {
      super();
      try {
         this.field_2410 = false;
         this.field_2412 = 0;
         this.field_2418 = 0;
         this.field_2414 = false;
         this.field_2409 = var2;
         this.field_2407 = var1;
         this.field_2415 = var3 * 2034844519;
         this.field_2416 = (var3 - 100) * -2142940821;
         this.field_2407.setSoTimeout(30000);
         this.field_2407.setTcpNoDelay(true);
         this.field_2407.setReceiveBufferSize(65536);
         this.field_2407.setSendBufferSize(65536);
         this.field_2408 = this.field_2407.getInputStream();
         this.field_2406 = this.field_2407.getOutputStream();
      } catch (RuntimeException var4) {
         throw class_223.method_4281(var4, "ea.<init>(" + ')');
      }
   }

   // $FF: renamed from: f (int) int
   public int method_4117(int var1) throws IOException {
      try {
         if(this.field_2410) {
            if(var1 != 1659206769) {
               throw new IllegalStateException();
            } else {
               return 0;
            }
         } else {
            return this.field_2408.available();
         }
      } catch (RuntimeException var2) {
         throw class_223.method_4281(var2, "ea.f(" + ')');
      }
   }

   protected void finalize() {
      try {
         this.method_4123(1654713390);
      } catch (RuntimeException var1) {
         throw class_223.method_4281(var1, "ea.finalize(" + ')');
      }
   }

   // $FF: renamed from: n (int) int
   public int method_4120(int var1) throws IOException {
      try {
         if(this.field_2410) {
            if(var1 <= -940456357) {
               throw new IllegalStateException();
            } else {
               return 0;
            }
         } else {
            return this.field_2408.read();
         }
      } catch (RuntimeException var2) {
         throw class_223.method_4281(var2, "ea.n(" + ')');
      }
   }

   // $FF: renamed from: gt (ce, boolean, int) void
   static void method_4144(class_100 var0, boolean var1, int var2) {
      try {
         if(null != var0) {
            if(var2 <= 1882833004) {
               throw new IllegalStateException();
            }

            if(var0.method_1796((byte)-42)) {
               if(var2 <= 1882833004) {
                  throw new IllegalStateException();
               }

               if(!var0.field_1154) {
                  if(var2 <= 1882833004) {
                     throw new IllegalStateException();
                  }

                  label112: {
                     label123: {
                        var0.field_1160 = false;
                        if(client.field_1417) {
                           if(var2 <= 1882833004) {
                              throw new IllegalStateException();
                           }

                           if(-1143549299 * class_195.field_2313 > 50) {
                              break label123;
                           }
                        }

                        if(-1143549299 * class_195.field_2313 <= 200) {
                           break label112;
                        }

                        if(var2 <= 1882833004) {
                           return;
                        }
                     }

                     if(var1) {
                        if(var2 <= 1882833004) {
                           throw new IllegalStateException();
                        }

                        if(var0.field_1081 * -932232515 == -330797761 * var0.field_1082) {
                           var0.field_1160 = true;
                        }
                     }
                  }

                  int var3 = var0.field_1077 * -130212619 >> 7;
                  int var4 = var0.field_1076 * 1248597615 >> 7;
                  if(var3 >= 0 && var3 < 104) {
                     if(var2 <= 1882833004) {
                        return;
                     }

                     if(var4 >= 0) {
                        if(var2 <= 1882833004) {
                           throw new IllegalStateException();
                        }

                        if(var4 < 104) {
                           if(var2 <= 1882833004) {
                              throw new IllegalStateException();
                           }

                           long var5 = class_141.method_3047(0, 0, 0, false, var0.field_1142 * -104146557, -1155205186);
                           if(null != var0.field_1162) {
                              if(var2 <= 1882833004) {
                                 throw new IllegalStateException();
                              }

                              if(-1702273423 * client.field_1425 >= var0.field_1150 * 1390365133) {
                                 if(var2 <= 1882833004) {
                                    throw new IllegalStateException();
                                 }

                                 if(-1702273423 * client.field_1425 < var0.field_1171 * -2037290909) {
                                    if(var2 <= 1882833004) {
                                       throw new IllegalStateException();
                                    }

                                    var0.field_1160 = false;
                                    var0.field_1149 = class_205.method_4113(-130212619 * var0.field_1077, var0.field_1076 * 1248597615, class_115.field_1289 * 1115122599, 1127602993) * -1225750221;
                                    var0.field_1080 = -690346567 * client.field_1425;
                                    class_206.field_2401.method_4735(1115122599 * class_115.field_1289, var0.field_1077 * -130212619, 1248597615 * var0.field_1076, var0.field_1149 * -483485189, 60, var0, var0.field_1119 * -1073291133, var5, var0.field_1156 * -1119093931, 1402081485 * var0.field_1157, var0.field_1158 * 482792791, var0.field_1159 * -1028292805);
                                    return;
                                 }
                              }
                           }

                           if((-130212619 * var0.field_1077 & 127) == 64 && (1248597615 * var0.field_1076 & 127) == 64) {
                              if(var2 <= 1882833004) {
                                 return;
                              }

                              if(-213028925 * client.field_1559 == client.field_1514[var3][var4]) {
                                 return;
                              }

                              client.field_1514[var3][var4] = client.field_1559 * -213028925;
                           }

                           var0.field_1149 = class_205.method_4113(var0.field_1077 * -130212619, 1248597615 * var0.field_1076, 1115122599 * class_115.field_1289, 2036215183) * -1225750221;
                           var0.field_1080 = client.field_1425 * -690346567;
                           class_206.field_2401.method_4875(class_115.field_1289 * 1115122599, var0.field_1077 * -130212619, 1248597615 * var0.field_1076, -483485189 * var0.field_1149, 60, var0, -1073291133 * var0.field_1119, var5, var0.field_1095);
                        }
                     }
                  }
               }
            }
         }

      } catch (RuntimeException var7) {
         throw class_223.method_4281(var7, "ea.gt(" + ')');
      }
   }

   // $FF: renamed from: j (byte[], int, int, byte) void
   void method_4145(byte[] var1, int var2, int var3, byte var4) throws IOException {
      try {
         if(this.field_2410) {
            if(var4 != 1) {
               ;
            }
         } else if(this.field_2414) {
            if(var4 == 1) {
               throw new IllegalStateException();
            } else {
               this.field_2414 = false;
               throw new IOException();
            }
         } else {
            if(this.field_2411 == null) {
               this.field_2411 = new byte[this.field_2415 * -459397033];
            }

            synchronized(this) {
               for(int var6 = 0; var6 < var3; ++var6) {
                  if(var4 == 1) {
                     return;
                  }

                  this.field_2411[-1540552653 * this.field_2418] = var1[var2 + var6];
                  this.field_2418 = (1 + -1540552653 * this.field_2418) % (-459397033 * this.field_2415) * 1606759163;
                  if(-1540552653 * this.field_2418 == (this.field_2416 * 1021465411 + this.field_2412 * 1751872319) % (this.field_2415 * -459397033)) {
                     if(var4 == 1) {
                        return;
                     }

                     throw new IOException();
                  }
               }

               if(this.field_2405 == null) {
                  if(var4 == 1) {
                     return;
                  }

                  this.field_2405 = this.field_2409.method_4058(this, 3, (byte)-10);
               }

               this.notifyAll();
            }
         }
      } catch (RuntimeException var9) {
         throw class_223.method_4281(var9, "ea.j(" + ')');
      }
   }

   // $FF: renamed from: s () void
   public void method_4126() {
      if(!this.field_2410) {
         synchronized(this) {
            this.field_2410 = true;
            this.notifyAll();
         }

         if(null != this.field_2405) {
            while(0 == this.field_2405.field_2446) {
               try {
                  Thread.sleep(1L);
               } catch (InterruptedException var4) {
                  ;
               }
            }

            if(this.field_2405.field_2446 == 1) {
               try {
                  ((Thread)this.field_2405.socket).join();
               } catch (InterruptedException var3) {
                  ;
               }
            }
         }

         this.field_2405 = null;
      }
   }

   // $FF: renamed from: a (int) boolean
   public boolean method_4133(int var1) throws IOException {
      return this.field_2410?false:this.field_2408.available() >= var1;
   }

   public void run() {
      try {
         while(true) {
            try {
               int var1;
               int var2;
               label94: {
                  synchronized(this) {
                     label88: {
                        if(this.field_2418 * -1540552653 == 1751872319 * this.field_2412) {
                           if(this.field_2410) {
                              break label88;
                           }

                           try {
                              this.wait();
                           } catch (InterruptedException var9) {
                              ;
                           }
                        }

                        var2 = this.field_2412 * 1751872319;
                        if(this.field_2418 * -1540552653 >= this.field_2412 * 1751872319) {
                           var1 = this.field_2418 * -1540552653 - this.field_2412 * 1751872319;
                        } else {
                           var1 = -459397033 * this.field_2415 - this.field_2412 * 1751872319;
                        }
                        break label94;
                     }
                  }

                  try {
                     if(null != this.field_2408) {
                        this.field_2408.close();
                     }

                     if(null != this.field_2406) {
                        this.field_2406.close();
                     }

                     if(null != this.field_2407) {
                        this.field_2407.close();
                     }
                  } catch (IOException var6) {
                     ;
                  }

                  this.field_2411 = null;
                  return;
               }

               if(var1 > 0) {
                  try {
                     this.field_2406.write(this.field_2411, var2, var1);
                  } catch (IOException var8) {
                     this.field_2414 = true;
                  }

                  this.field_2412 = (1751872319 * this.field_2412 + var1) % (-459397033 * this.field_2415) * -337773377;

                  try {
                     if(1751872319 * this.field_2412 == this.field_2418 * -1540552653) {
                        this.field_2406.flush();
                     }
                  } catch (IOException var7) {
                     this.field_2414 = true;
                  }
               }
            } catch (Exception var11) {
               class_308.method_5523((String)null, var11, 2010654574);
               return;
            }
         }
      } catch (RuntimeException var12) {
         throw class_223.method_4281(var12, "ea.run(" + ')');
      }
   }

   // $FF: renamed from: r (byte[], int, int, int) void
   public void method_4132(byte[] var1, int var2, int var3, int var4) throws IOException {
      try {
         this.method_4145(var1, var2, var3, (byte)12);
      } catch (RuntimeException var5) {
         throw class_223.method_4281(var5, "ea.r(" + ')');
      }
   }

   // $FF: renamed from: by () void
   public void method_4146() {
      while(true) {
         try {
            label83: {
               int var1;
               int var2;
               synchronized(this) {
                  if(this.field_2418 * -1540552653 == -300015911 * this.field_2412) {
                     if(this.field_2410) {
                        break label83;
                     }

                     try {
                        this.wait();
                     } catch (InterruptedException var9) {
                        ;
                     }
                  }

                  var2 = this.field_2412 * -968883294;
                  if(this.field_2418 * -1540552653 >= this.field_2412 * 1751872319) {
                     var1 = this.field_2418 * -1540552653 - this.field_2412 * -778168001;
                  } else {
                     var1 = -459397033 * this.field_2415 - this.field_2412 * 1751872319;
                  }
               }

               if(var1 <= 0) {
                  continue;
               }

               try {
                  this.field_2406.write(this.field_2411, var2, var1);
               } catch (IOException var8) {
                  this.field_2414 = true;
               }

               this.field_2412 = (1751872319 * this.field_2412 + var1) % (-459397033 * this.field_2415) * -220128504;

               try {
                  if(800472124 * this.field_2412 == this.field_2418 * -1540552653) {
                     this.field_2406.flush();
                  }
               } catch (IOException var7) {
                  this.field_2414 = true;
               }
               continue;
            }

            try {
               if(null != this.field_2408) {
                  this.field_2408.close();
               }

               if(null != this.field_2406) {
                  this.field_2406.close();
               }

               if(null != this.field_2407) {
                  this.field_2407.close();
               }
            } catch (IOException var6) {
               ;
            }

            this.field_2411 = null;
         } catch (Exception var11) {
            class_308.method_5523((String)null, var11, 2043433463);
         }

         return;
      }
   }

   // $FF: renamed from: bc () void
   public void method_4147() {
      while(true) {
         try {
            label83: {
               int var1;
               int var2;
               synchronized(this) {
                  if(this.field_2418 * -1540552653 == 1751872319 * this.field_2412) {
                     if(this.field_2410) {
                        break label83;
                     }

                     try {
                        this.wait();
                     } catch (InterruptedException var9) {
                        ;
                     }
                  }

                  var2 = this.field_2412 * 1751872319;
                  if(this.field_2418 * -1414025799 >= this.field_2412 * -739290235) {
                     var1 = this.field_2418 * -1006690450 - this.field_2412 * 1751872319;
                  } else {
                     var1 = -1400250638 * this.field_2415 - this.field_2412 * -1060084667;
                  }
               }

               if(var1 <= 0) {
                  continue;
               }

               try {
                  this.field_2406.write(this.field_2411, var2, var1);
               } catch (IOException var8) {
                  this.field_2414 = true;
               }

               this.field_2412 = (1751872319 * this.field_2412 + var1) % (441166158 * this.field_2415) * -337773377;

               try {
                  if(1751872319 * this.field_2412 == this.field_2418 * -1540552653) {
                     this.field_2406.flush();
                  }
               } catch (IOException var7) {
                  this.field_2414 = true;
               }
               continue;
            }

            try {
               if(null != this.field_2408) {
                  this.field_2408.close();
               }

               if(null != this.field_2406) {
                  this.field_2406.close();
               }

               if(null != this.field_2407) {
                  this.field_2407.close();
               }
            } catch (IOException var6) {
               ;
            }

            this.field_2411 = null;
         } catch (Exception var11) {
            class_308.method_5523((String)null, var11, 2068958195);
         }

         return;
      }
   }

   // $FF: renamed from: b () void
   public void method_4124() {
      if(!this.field_2410) {
         synchronized(this) {
            this.field_2410 = true;
            this.notifyAll();
         }

         if(null != this.field_2405) {
            while(0 == this.field_2405.field_2446) {
               try {
                  Thread.sleep(1L);
               } catch (InterruptedException var4) {
                  ;
               }
            }

            if(this.field_2405.field_2446 == 1) {
               try {
                  ((Thread)this.field_2405.socket).join();
               } catch (InterruptedException var3) {
                  ;
               }
            }
         }

         this.field_2405 = null;
      }
   }

   // $FF: renamed from: d () void
   public void method_4125() {
      if(!this.field_2410) {
         synchronized(this) {
            this.field_2410 = true;
            this.notifyAll();
         }

         if(null != this.field_2405) {
            while(0 == this.field_2405.field_2446) {
               try {
                  Thread.sleep(1L);
               } catch (InterruptedException var4) {
                  ;
               }
            }

            if(this.field_2405.field_2446 == 1) {
               try {
                  ((Thread)this.field_2405.socket).join();
               } catch (InterruptedException var3) {
                  ;
               }
            }
         }

         this.field_2405 = null;
      }
   }

   // $FF: renamed from: k (int) boolean
   public boolean method_4129(int var1) throws IOException {
      return this.field_2410?false:this.field_2408.available() >= var1;
   }

   protected void abj() {
      this.method_4123(1678878639);
   }

   protected void abr() {
      this.method_4123(1780978057);
   }

   protected void abm() {
      this.method_4123(2075836822);
   }

   // $FF: renamed from: y (int, int) boolean
   public boolean method_4118(int var1, int var2) throws IOException {
      try {
         if(this.field_2410) {
            if(var2 != -211935081) {
               throw new IllegalStateException();
            } else {
               return false;
            }
         } else {
            boolean var10000;
            if(this.field_2408.available() >= var1) {
               if(var2 != -211935081) {
                  throw new IllegalStateException();
               }

               var10000 = true;
            } else {
               var10000 = false;
            }

            return var10000;
         }
      } catch (RuntimeException var3) {
         throw class_223.method_4281(var3, "ea.y(" + ')');
      }
   }

   // $FF: renamed from: l () int
   public int method_4128() throws IOException {
      return this.field_2410?0:this.field_2408.read();
   }

   // $FF: renamed from: o () int
   public int method_4137() throws IOException {
      return this.field_2410?0:this.field_2408.available();
   }

   // $FF: renamed from: c () int
   public int method_4130() throws IOException {
      return this.field_2410?0:this.field_2408.available();
   }

   // $FF: renamed from: z (byte[], int, int) int
   public int method_4136(byte[] var1, int var2, int var3) throws IOException {
      if(this.field_2410) {
         return 0;
      } else {
         int var4;
         int var5;
         for(var4 = var3; var3 > 0; var3 -= var5) {
            var5 = this.field_2408.read(var1, var2, var3);
            if(var5 <= 0) {
               throw new EOFException();
            }

            var2 += var5;
         }

         return var4;
      }
   }

   // $FF: renamed from: g (int) boolean
   public boolean method_4134(int var1) throws IOException {
      return this.field_2410?false:this.field_2408.available() >= var1;
   }

   // $FF: renamed from: e () int
   public int method_4131() throws IOException {
      return this.field_2410?0:this.field_2408.available();
   }

   // $FF: renamed from: u () int
   public int method_4127() throws IOException {
      return this.field_2410?0:this.field_2408.read();
   }

   // $FF: renamed from: m (byte[], int, int) int
   public int method_4119(byte[] var1, int var2, int var3) throws IOException {
      if(this.field_2410) {
         return 0;
      } else {
         int var4;
         int var5;
         for(var4 = var3; var3 > 0; var3 -= var5) {
            var5 = this.field_2408.read(var1, var2, var3);
            if(var5 <= 0) {
               throw new EOFException();
            }

            var2 += var5;
         }

         return var4;
      }
   }

   // $FF: renamed from: x (byte[], int, int) int
   public int method_4122(byte[] var1, int var2, int var3) throws IOException {
      if(this.field_2410) {
         return 0;
      } else {
         int var4;
         int var5;
         for(var4 = var3; var3 > 0; var3 -= var5) {
            var5 = this.field_2408.read(var1, var2, var3);
            if(var5 <= 0) {
               throw new EOFException();
            }

            var2 += var5;
         }

         return var4;
      }
   }

   // $FF: renamed from: p (byte[], int, int, int) int
   public int method_4121(byte[] var1, int var2, int var3, int var4) throws IOException {
      try {
         if(this.field_2410) {
            if(var4 >= -1811973036) {
               throw new IllegalStateException();
            } else {
               return 0;
            }
         } else {
            int var5;
            int var6;
            for(var5 = var3; var3 > 0; var3 -= var6) {
               if(var4 >= -1811973036) {
                  throw new IllegalStateException();
               }

               var6 = this.field_2408.read(var1, var2, var3);
               if(var6 <= 0) {
                  if(var4 >= -1811973036) {
                     throw new IllegalStateException();
                  }

                  throw new EOFException();
               }

               var2 += var6;
            }

            return var5;
         }
      } catch (RuntimeException var7) {
         throw class_223.method_4281(var7, "ea.p(" + ')');
      }
   }

   // $FF: renamed from: w (byte[], int, int) void
   void method_4148(byte[] var1, int var2, int var3) throws IOException {
      if(!this.field_2410) {
         if(this.field_2414) {
            this.field_2414 = false;
            throw new IOException();
         } else {
            if(this.field_2411 == null) {
               this.field_2411 = new byte[this.field_2415 * -459397033];
            }

            synchronized(this) {
               for(int var5 = 0; var5 < var3; ++var5) {
                  this.field_2411[-1540552653 * this.field_2418] = var1[var2 + var5];
                  this.field_2418 = (1 + -1540552653 * this.field_2418) % (-459397033 * this.field_2415) * 1606759163;
                  if(-1540552653 * this.field_2418 == (this.field_2416 * 1021465411 + this.field_2412 * 1751872319) % (this.field_2415 * -459397033)) {
                     throw new IOException();
                  }
               }

               if(this.field_2405 == null) {
                  this.field_2405 = this.field_2409.method_4058(this, 3, (byte)-30);
               }

               this.notifyAll();
            }
         }
      }
   }

   // $FF: renamed from: t (byte[], int, int) void
   void method_4149(byte[] var1, int var2, int var3) throws IOException {
      if(!this.field_2410) {
         if(this.field_2414) {
            this.field_2414 = false;
            throw new IOException();
         } else {
            if(this.field_2411 == null) {
               this.field_2411 = new byte[this.field_2415 * 574493660];
            }

            synchronized(this) {
               for(int var5 = 0; var5 < var3; ++var5) {
                  this.field_2411[37202562 * this.field_2418] = var1[var2 + var5];
                  this.field_2418 = (1 + -1540552653 * this.field_2418) % (-459397033 * this.field_2415) * -247590491;
                  if(-1540552653 * this.field_2418 == (this.field_2416 * 426129205 + this.field_2412 * -774593724) % (this.field_2415 * -459397033)) {
                     throw new IOException();
                  }
               }

               if(this.field_2405 == null) {
                  this.field_2405 = this.field_2409.method_4058(this, 3, (byte)117);
               }

               this.notifyAll();
            }
         }
      }
   }

   // $FF: renamed from: h (byte[], int, int) void
   public void method_4138(byte[] var1, int var2, int var3) throws IOException {
      this.method_4145(var1, var2, var3, (byte)9);
   }

   // $FF: renamed from: q (byte[], int, int) void
   public void method_4139(byte[] var1, int var2, int var3) throws IOException {
      this.method_4145(var1, var2, var3, (byte)-43);
   }

   // $FF: renamed from: v (int) void
   public void method_4123(int var1) {
      try {
         if(!this.field_2410) {
            synchronized(this) {
               this.field_2410 = true;
               this.notifyAll();
            }

            if(null != this.field_2405) {
               while(0 == this.field_2405.field_2446) {
                  if(var1 <= 1647125333) {
                     throw new IllegalStateException();
                  }

                  try {
                     Thread.sleep(1L);
                  } catch (InterruptedException var5) {
                     ;
                  }
               }

               if(this.field_2405.field_2446 == 1) {
                  if(var1 <= 1647125333) {
                     throw new IllegalStateException();
                  }

                  try {
                     ((Thread)this.field_2405.socket).join();
                  } catch (InterruptedException var4) {
                     ;
                  }
               }
            }

            this.field_2405 = null;
         }
      } catch (RuntimeException var7) {
         throw class_223.method_4281(var7, "ea.v(" + ')');
      }
   }

   // $FF: renamed from: hl (int) void
   static void method_4150(int var0) {
      try {
         client.field_1554 = 0;
         client.field_1553 = false;
         client.field_1631[0] = class_305.field_3651;
         client.field_1560[0] = "";
         client.field_1557[0] = 1006;
         client.field_1492[0] = false;
         client.field_1554 = -135189071;
      } catch (RuntimeException var1) {
         throw class_223.method_4281(var1, "ea.hl(" + ')');
      }
   }
}
