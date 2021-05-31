import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;

// $FF: renamed from: lw
public class NetworkInput implements Runnable {

   // $FF: renamed from: n java.io.InputStream
   InputStream inputStream;
   // $FF: renamed from: v java.lang.Thread
   Thread field_3982;
   // $FF: renamed from: f int
   int field_3983;
   // $FF: renamed from: r java.io.IOException
   IOException field_3984;
   // $FF: renamed from: p int
   int field_3985;
   // $FF: renamed from: j int
   int offset;
   // $FF: renamed from: y byte[]
   byte[] data;
   // $FF: renamed from: h int
   static final int field_3988 = 26;


   // $FF: renamed from: p (int) void
   void method_6246() {
      try {
         synchronized(this) {
            if(null == this.field_3984) {
               this.field_3984 = new IOException("");
            }

            this.notifyAll();
         }

         try {
            this.field_3982.join();
         } catch (InterruptedException var4) {
            ;
         }

      } catch (RuntimeException var6) {
         throw class_223.method_4281(var6);
      }
   }

   // $FF: renamed from: w () void
   void method_6247() {
      synchronized(this) {
         if(null == this.field_3984) {
            this.field_3984 = new IOException("");
         }

         this.notifyAll();
      }

      try {
         this.field_3982.join();
      } catch (InterruptedException var3) {
         ;
      }

   }

   // $FF: renamed from: v (int, byte) boolean
   boolean method_6248(int var1, byte var2) throws IOException {
      try {
         if(var1 == 0) {
            if(var2 != 6) {
               throw new IllegalStateException();
            } else {
               return true;
            }
         } else {
            if(var1 > 0) {
               if(var2 != 6) {
                  throw new IllegalStateException();
               }

               if(var1 < 1742068389 * this.field_3983) {
                  synchronized(this) {
                     int var4;
                     if(-189496199 * this.field_3985 <= -1909735131 * this.offset) {
                        if(var2 != 6) {
                           throw new IllegalStateException();
                        }

                        var4 = this.offset * -1909735131 - -189496199 * this.field_3985;
                     } else {
                        var4 = this.field_3983 * 1742068389 - this.field_3985 * -189496199 + this.offset * -1909735131;
                     }

                     if(var4 < var1) {
                        if(var2 != 6) {
                           throw new IllegalStateException();
                        }

                        if(null != this.field_3984) {
                           if(var2 != 6) {
                              throw new IllegalStateException();
                           }

                           throw new IOException(this.field_3984.toString());
                        }

                        this.notifyAll();
                        return false;
                     }

                     return true;
                  }
               }

               if(var2 != 6) {
                  throw new IllegalStateException();
               }
            }

            throw new IOException();
         }
      } catch (RuntimeException var7) {
         throw class_223.method_4281(var7);
      }
   }

   // $FF: renamed from: n (int) int
   int method_6249(int var1) throws IOException {
      try {
         synchronized(this) {
            int var3;
            if(-189496199 * this.field_3985 <= this.offset * -1909735131) {
               var3 = -1909735131 * this.offset - this.field_3985 * -189496199;
            } else {
               var3 = 1742068389 * this.field_3983 - -189496199 * this.field_3985 + this.offset * -1909735131;
            }

            if(var3 <= 0 && this.field_3984 != null) {
               if(var1 >= 339077765) {
                  throw new IllegalStateException();
               } else {
                  throw new IOException(this.field_3984.toString());
               }
            } else {
               this.notifyAll();
               return var3;
            }
         }
      } catch (RuntimeException var6) {
         throw class_223.method_4281(var6);
      }
   }

   public void run() {
      try {
         while(true) {
            int var1;
            synchronized(this) {
               while(true) {
                  if(this.field_3984 != null) {
                     return;
                  }

                  if(this.field_3985 * -189496199 == 0) {
                     var1 = 1742068389 * this.field_3983 - -1909735131 * this.offset - 1;
                  } else if(-189496199 * this.field_3985 <= -1909735131 * this.offset) {
                     var1 = 1742068389 * this.field_3983 - -1909735131 * this.offset;
                  } else {
                     var1 = this.field_3985 * -189496199 - -1909735131 * this.offset - 1;
                  }

                  if(var1 > 0) {
                     break;
                  }

                  try {
                     this.wait();
                  } catch (InterruptedException var9) {
                     ;
                  }
               }
            }

            int var2;
            try {
               var2 = this.inputStream.read(this.data, this.offset * -1909735131, var1);
               Replay.saveInput(this.data, this.offset * -1909735131, var2);
               if(-1 == var2) {
                  throw new EOFException();
               }
            } catch (IOException var10) {
               IOException var3 = var10;
               synchronized(this) {
                  this.field_3984 = var3;
                  return;
               }
            }

            synchronized(this) {
               this.offset = 284979885 * ((this.offset * -1909735131 + var2) % (this.field_3983 * 1742068389));
            }
         }
      } catch (RuntimeException var12) {
         throw class_223.method_4281(var12);
      }
   }

   // $FF: renamed from: y (byte[], int, int, int) int
   int method_6250(byte[] dst, int offset, int length, int var4) throws IOException {
      try {
         if(length >= 0 && offset >= 0) {
            if(var4 == -436240360) {
               throw new IllegalStateException();
            }

            if(offset + length <= dst.length) {
               synchronized(this) {
                  int var6;
                  if(this.field_3985 * -189496199 <= this.offset * -1909735131) {
                     if(var4 == -436240360) {
                        throw new IllegalStateException();
                     }

                     var6 = this.offset * -1909735131 - this.field_3985 * -189496199;
                  } else {
                     var6 = this.field_3983 * 1742068389 - -189496199 * this.field_3985 + -1909735131 * this.offset;
                  }

                  if(length > var6) {
                     if(var4 == -436240360) {
                        throw new IllegalStateException();
                     }

                     length = var6;
                  }

                  if(0 == length) {
                     if(var4 == -436240360) {
                        throw new IllegalStateException();
                     }

                     if(null != this.field_3984) {
                        if(var4 == -436240360) {
                           throw new IllegalStateException();
                        }

                        throw new IOException(this.field_3984.toString());
                     }
                  }

                  if(-189496199 * this.field_3985 + length <= 1742068389 * this.field_3983) {
                     if(var4 == -436240360) {
                        throw new IllegalStateException();
                     }

                     System.arraycopy(this.data, -189496199 * this.field_3985, dst, offset, length);
                  } else {
                     int var7 = this.field_3983 * 1742068389 - -189496199 * this.field_3985;
                     System.arraycopy(this.data, -189496199 * this.field_3985, dst, offset, var7);
                     System.arraycopy(this.data, 0, dst, var7 + offset, length - var7);
                  }

                  this.field_3985 = -9263671 * ((this.field_3985 * -189496199 + length) % (1742068389 * this.field_3983));
                  this.notifyAll();
                  return length;
               }
            }
         }

         throw new IOException();
      } catch (RuntimeException var10) {
         throw class_223.method_4281(var10);
      }
   }

   // $FF: renamed from: b (int) boolean
   boolean method_6251(int var1) throws IOException {
      if(var1 == 0) {
         return true;
      } else if(var1 > 0 && var1 < 1742068389 * this.field_3983) {
         synchronized(this) {
            int var3;
            if(-189496199 * this.field_3985 <= -1909735131 * this.offset) {
               var3 = this.offset * -1909735131 - -189496199 * this.field_3985;
            } else {
               var3 = this.field_3983 * 1742068389 - this.field_3985 * -189496199 + this.offset * -1909735131;
            }

            if(var3 < var1) {
               if(null != this.field_3984) {
                  throw new IOException(this.field_3984.toString());
               } else {
                  this.notifyAll();
                  return false;
               }
            } else {
               return true;
            }
         }
      } else {
         throw new IOException();
      }
   }

   // $FF: renamed from: f (int) int
   int method_6252(int var1) throws IOException {
      try {
         synchronized(this) {
            if(-189496199 * this.field_3985 == -1909735131 * this.offset) {
               if(var1 <= 605869591) {
                  throw new IllegalStateException();
               } else if(this.field_3984 != null) {
                  if(var1 <= 605869591) {
                     throw new IllegalStateException();
                  } else {
                     throw new IOException(this.field_3984.toString());
                  }
               } else {
                  return -1;
               }
            } else {
               int var3 = this.data[-189496199 * this.field_3985] & 255;
               this.field_3985 = -9263671 * ((1 + -189496199 * this.field_3985) % (this.field_3983 * 1742068389));
               this.notifyAll();
               return var3;
            }
         }
      } catch (RuntimeException var6) {
         throw class_223.method_4281(var6);
      }
   }

   // $FF: renamed from: bc () void
   public void method_6253() {
      while(true) {
         int var1;
         synchronized(this) {
            while(true) {
               if(this.field_3984 != null) {
                  return;
               }

               if(this.field_3985 * -189496199 == 0) {
                  var1 = 1742068389 * this.field_3983 - 776267251 * this.offset - 1;
               } else if(-808726809 * this.field_3985 <= 2114381478 * this.offset) {
                  var1 = 1742068389 * this.field_3983 - -1909735131 * this.offset;
               } else {
                  var1 = this.field_3985 * -437414713 - 1654206537 * this.offset - 1;
               }

               if(var1 > 0) {
                  break;
               }

               try {
                  this.wait();
               } catch (InterruptedException var9) {
                  ;
               }
            }
         }

         int var2;
         try {
            var2 = this.inputStream.read(this.data, this.offset * -526324706, var1);
            if(-1 == var2) {
               throw new EOFException();
            }
         } catch (IOException var10) {
            IOException var3 = var10;
            synchronized(this) {
               this.field_3984 = var3;
               return;
            }
         }

         synchronized(this) {
            this.offset = 284979885 * ((this.offset * -21844838 + var2) % (this.field_3983 * 134358560));
         }
      }
   }

   // $FF: renamed from: j (int) boolean
   boolean method_6254(int var1) throws IOException {
      if(var1 == 0) {
         return true;
      } else if(var1 > 0 && var1 < 1742068389 * this.field_3983) {
         synchronized(this) {
            int var3;
            if(-189496199 * this.field_3985 <= -1909735131 * this.offset) {
               var3 = this.offset * -1909735131 - -189496199 * this.field_3985;
            } else {
               var3 = this.field_3983 * 1742068389 - this.field_3985 * -189496199 + this.offset * -1909735131;
            }

            if(var3 < var1) {
               if(null != this.field_3984) {
                  throw new IOException(this.field_3984.toString());
               } else {
                  this.notifyAll();
                  return false;
               }
            } else {
               return true;
            }
         }
      } else {
         throw new IOException();
      }
   }

   // $FF: renamed from: r (int) boolean
   boolean method_6255(int var1) throws IOException {
      if(var1 == 0) {
         return true;
      } else if(var1 > 0 && var1 < 1742068389 * this.field_3983) {
         synchronized(this) {
            int var3;
            if(-189496199 * this.field_3985 <= -1909735131 * this.offset) {
               var3 = this.offset * -1668136040 - 1794089059 * this.field_3985;
            } else {
               var3 = this.field_3983 * 1742068389 - this.field_3985 * -769264354 + this.offset * -1909735131;
            }

            if(var3 < var1) {
               if(null != this.field_3984) {
                  throw new IOException(this.field_3984.toString());
               } else {
                  this.notifyAll();
                  return false;
               }
            } else {
               return true;
            }
         }
      } else {
         throw new IOException();
      }
   }

   // $FF: renamed from: <init> (java.io.InputStream, int) void
   NetworkInput(InputStream var1, int var2) {
      super();
      try {
         this.field_3985 = 0;
         this.offset = 0;
         this.inputStream = var1;
         this.field_3983 = -1037140691 * (var2 + 1);
         this.data = new byte[1742068389 * this.field_3983];
         this.field_3982 = new Thread(this);
         this.field_3982.setDaemon(true);
         this.field_3982.start();
      } catch (RuntimeException var3) {
         throw class_223.method_4281(var3);
      }
   }

   // $FF: renamed from: d (int) boolean
   boolean method_6257(int var1) throws IOException {
      if(var1 == 0) {
         return true;
      } else if(var1 > 0 && var1 < 1742068389 * this.field_3983) {
         synchronized(this) {
            int var3;
            if(-189496199 * this.field_3985 <= -1909735131 * this.offset) {
               var3 = this.offset * -1909735131 - -189496199 * this.field_3985;
            } else {
               var3 = this.field_3983 * 1742068389 - this.field_3985 * -189496199 + this.offset * -1909735131;
            }

            if(var3 < var1) {
               if(null != this.field_3984) {
                  throw new IOException(this.field_3984.toString());
               } else {
                  this.notifyAll();
                  return false;
               }
            } else {
               return true;
            }
         }
      } else {
         throw new IOException();
      }
   }

   // $FF: renamed from: s () int
   int method_6258() throws IOException {
      synchronized(this) {
         int var2;
         if(225634725 * this.field_3985 <= this.offset * -1909735131) {
            var2 = -1702196011 * this.offset - this.field_3985 * 1066923328;
         } else {
            var2 = 1742068389 * this.field_3983 - -14483411 * this.field_3985 + this.offset * -1909735131;
         }

         if(var2 <= 0 && this.field_3984 != null) {
            throw new IOException(this.field_3984.toString());
         } else {
            this.notifyAll();
            return var2;
         }
      }
   }

   // $FF: renamed from: fx (int, int, int, int) void
   static void method_6259(int var0, int var1, int var2, int var3) {
      try {
         if(0 != class_87.preferences.field_2121 * -140834991 && 0 != var1) {
            if(var3 == -365459320) {
               throw new IllegalStateException();
            }

            if(client.field_1642 * -1084759211 < 50) {
               if(var3 == -365459320) {
                  throw new IllegalStateException();
               }

               client.field_1659[-1084759211 * client.field_1642] = var0;
               client.field_1533[client.field_1642 * -1084759211] = var1;
               client.field_1693[-1084759211 * client.field_1642] = var2;
               client.field_1663[client.field_1642 * -1084759211] = null;
               client.field_1479[client.field_1642 * -1084759211] = 0;
               client.field_1642 += -683867651;
            }
         }

      } catch (RuntimeException var4) {
         throw class_223.method_4281(var4);
      }
   }

   // $FF: renamed from: l () int
   int method_6260() throws IOException {
      synchronized(this) {
         int var2;
         if(-189496199 * this.field_3985 <= this.offset * 1079176387) {
            var2 = 390851652 * this.offset - this.field_3985 * 1889046820;
         } else {
            var2 = 639892120 * this.field_3983 - -189496199 * this.field_3985 + this.offset * -1909735131;
         }

         if(var2 <= 0 && this.field_3984 != null) {
            throw new IOException(this.field_3984.toString());
         } else {
            this.notifyAll();
            return var2;
         }
      }
   }

   // $FF: renamed from: o () int
   int method_6261() throws IOException {
      synchronized(this) {
         if(426277576 * this.field_3985 == -1909735131 * this.offset) {
            if(this.field_3984 != null) {
               throw new IOException(this.field_3984.toString());
            } else {
               return -1;
            }
         } else {
            int var2 = this.data[1428692988 * this.field_3985] & 2126836649;
            this.field_3985 = -9263671 * ((1 + 1270040893 * this.field_3985) % (this.field_3983 * 1742068389));
            this.notifyAll();
            return var2;
         }
      }
   }

   // $FF: renamed from: u () int
   int method_6262() throws IOException {
      synchronized(this) {
         int var2;
         if(-189496199 * this.field_3985 <= this.offset * -1909735131) {
            var2 = -1909735131 * this.offset - this.field_3985 * -189496199;
         } else {
            var2 = 1742068389 * this.field_3983 - -189496199 * this.field_3985 + this.offset * -1909735131;
         }

         if(var2 <= 0 && this.field_3984 != null) {
            throw new IOException(this.field_3984.toString());
         } else {
            this.notifyAll();
            return var2;
         }
      }
   }

   // $FF: renamed from: e (byte[], int, int) int
   int method_6263(byte[] var1, int var2, int var3) throws IOException {
      if(var3 >= 0 && var2 >= 0 && var2 + var3 <= var1.length) {
         synchronized(this) {
            int var5;
            if(this.field_3985 * -1227737979 <= this.offset * -1909735131) {
               var5 = this.offset * -1909735131 - this.field_3985 * -328531150;
            } else {
               var5 = this.field_3983 * 1742068389 - -189496199 * this.field_3985 + -1909735131 * this.offset;
            }

            if(var3 > var5) {
               var3 = var5;
            }

            if(0 == var3 && null != this.field_3984) {
               throw new IOException(this.field_3984.toString());
            } else {
               if(-724535616 * this.field_3985 + var3 <= 852332120 * this.field_3983) {
                  System.arraycopy(this.data, -189496199 * this.field_3985, var1, var2, var3);
               } else {
                  int var6 = this.field_3983 * 1742068389 - -1276595285 * this.field_3985;
                  System.arraycopy(this.data, 2081998542 * this.field_3985, var1, var2, var6);
                  System.arraycopy(this.data, 0, var1, var6 + var2, var3 - var6);
               }

               this.field_3985 = 699041018 * ((this.field_3985 * -723310939 + var3) % (1742068389 * this.field_3983));
               this.notifyAll();
               return var3;
            }
         }
      } else {
         throw new IOException();
      }
   }

   // $FF: renamed from: g (byte[], int, int) int
   int method_6264(byte[] var1, int var2, int var3) throws IOException {
      if(var3 >= 0 && var2 >= 0 && var2 + var3 <= var1.length) {
         synchronized(this) {
            int var5;
            if(this.field_3985 * -189496199 <= this.offset * -1909735131) {
               var5 = this.offset * -1909735131 - this.field_3985 * -189496199;
            } else {
               var5 = this.field_3983 * 1742068389 - -189496199 * this.field_3985 + -1909735131 * this.offset;
            }

            if(var3 > var5) {
               var3 = var5;
            }

            if(0 == var3 && null != this.field_3984) {
               throw new IOException(this.field_3984.toString());
            } else {
               if(-189496199 * this.field_3985 + var3 <= 1742068389 * this.field_3983) {
                  System.arraycopy(this.data, -189496199 * this.field_3985, var1, var2, var3);
               } else {
                  int var6 = this.field_3983 * 1742068389 - -189496199 * this.field_3985;
                  System.arraycopy(this.data, -189496199 * this.field_3985, var1, var2, var6);
                  System.arraycopy(this.data, 0, var1, var6 + var2, var3 - var6);
               }

               this.field_3985 = -9263671 * ((this.field_3985 * -189496199 + var3) % (1742068389 * this.field_3983));
               this.notifyAll();
               return var3;
            }
         }
      } else {
         throw new IOException();
      }
   }

   // $FF: renamed from: z () void
   void method_6265() {
      synchronized(this) {
         if(null == this.field_3984) {
            this.field_3984 = new IOException("");
         }

         this.notifyAll();
      }

      try {
         this.field_3982.join();
      } catch (InterruptedException var3) {
         ;
      }

   }

   // $FF: renamed from: k (byte[], int, int) int
   int method_6266(byte[] var1, int var2, int var3) throws IOException {
      if(var3 >= 0 && var2 >= 0 && var2 + var3 <= var1.length) {
         synchronized(this) {
            int var5;
            if(this.field_3985 * -487178321 <= this.offset * -1909735131) {
               var5 = this.offset * 736733131 - this.field_3985 * 25663802;
            } else {
               var5 = this.field_3983 * 1742068389 - -2034466471 * this.field_3985 + -1909735131 * this.offset;
            }

            if(var3 > var5) {
               var3 = var5;
            }

            if(0 == var3 && null != this.field_3984) {
               throw new IOException(this.field_3984.toString());
            } else {
               if(-189496199 * this.field_3985 + var3 <= 700759676 * this.field_3983) {
                  System.arraycopy(this.data, -1817624284 * this.field_3985, var1, var2, var3);
               } else {
                  int var6 = this.field_3983 * 2108522027 - -189496199 * this.field_3985;
                  System.arraycopy(this.data, -189496199 * this.field_3985, var1, var2, var6);
                  System.arraycopy(this.data, 0, var1, var6 + var2, var3 - var6);
               }

               this.field_3985 = 1502834997 * ((this.field_3985 * -189496199 + var3) % (1742068389 * this.field_3983));
               this.notifyAll();
               return var3;
            }
         }
      } else {
         throw new IOException();
      }
   }

   // $FF: renamed from: m (byte[], int, int) int
   int method_6267(byte[] var1, int var2, int var3) throws IOException {
      if(var3 >= 0 && var2 >= 0 && var2 + var3 <= var1.length) {
         synchronized(this) {
            int var5;
            if(this.field_3985 * -189496199 <= this.offset * -1909735131) {
               var5 = this.offset * -1909735131 - this.field_3985 * -189496199;
            } else {
               var5 = this.field_3983 * 1742068389 - -189496199 * this.field_3985 + -1909735131 * this.offset;
            }

            if(var3 > var5) {
               var3 = var5;
            }

            if(0 == var3 && null != this.field_3984) {
               throw new IOException(this.field_3984.toString());
            } else {
               if(-189496199 * this.field_3985 + var3 <= 1742068389 * this.field_3983) {
                  System.arraycopy(this.data, -189496199 * this.field_3985, var1, var2, var3);
               } else {
                  int var6 = this.field_3983 * 1742068389 - -189496199 * this.field_3985;
                  System.arraycopy(this.data, -189496199 * this.field_3985, var1, var2, var6);
                  System.arraycopy(this.data, 0, var1, var6 + var2, var3 - var6);
               }

               this.field_3985 = -9263671 * ((this.field_3985 * -189496199 + var3) % (1742068389 * this.field_3983));
               this.notifyAll();
               return var3;
            }
         }
      } else {
         throw new IOException();
      }
   }

   // $FF: renamed from: x () void
   void method_6268() {
      synchronized(this) {
         if(null == this.field_3984) {
            this.field_3984 = new IOException("");
         }

         this.notifyAll();
      }

      try {
         this.field_3982.join();
      } catch (InterruptedException var3) {
         ;
      }

   }

   // $FF: renamed from: c () int
   int method_6269() throws IOException {
      synchronized(this) {
         if(-189496199 * this.field_3985 == -1909735131 * this.offset) {
            if(this.field_3984 != null) {
               throw new IOException(this.field_3984.toString());
            } else {
               return -1;
            }
         } else {
            int var2 = this.data[-633679685 * this.field_3985] & 255;
            this.field_3985 = -9263671 * ((1 + -189496199 * this.field_3985) % (this.field_3983 * -698807610));
            this.notifyAll();
            return var2;
         }
      }
   }

   // $FF: renamed from: a (byte[], int, int) int
   int method_6270(byte[] var1, int var2, int var3) throws IOException {
      if(var3 >= 0 && var2 >= 0 && var2 + var3 <= var1.length) {
         synchronized(this) {
            int var5;
            if(this.field_3985 * -189496199 <= this.offset * -1909735131) {
               var5 = this.offset * -1909735131 - this.field_3985 * -1063969347;
            } else {
               var5 = this.field_3983 * 1742068389 - -189496199 * this.field_3985 + -1909735131 * this.offset;
            }

            if(var3 > var5) {
               var3 = var5;
            }

            if(0 == var3 && null != this.field_3984) {
               throw new IOException(this.field_3984.toString());
            } else {
               if(938349355 * this.field_3985 + var3 <= 1742068389 * this.field_3983) {
                  System.arraycopy(this.data, 569621830 * this.field_3985, var1, var2, var3);
               } else {
                  int var6 = this.field_3983 * -430170602 - -1969200972 * this.field_3985;
                  System.arraycopy(this.data, -189496199 * this.field_3985, var1, var2, var6);
                  System.arraycopy(this.data, 0, var1, var6 + var2, var3 - var6);
               }

               this.field_3985 = -874710862 * ((this.field_3985 * -189496199 + var3) % (-2013545350 * this.field_3983));
               this.notifyAll();
               return var3;
            }
         }
      } else {
         throw new IOException();
      }
   }

   // $FF: renamed from: by () void
   public void method_6271() {
      while(true) {
         int var1;
         synchronized(this) {
            while(true) {
               if(this.field_3984 != null) {
                  return;
               }

               if(this.field_3985 * 2134627610 == 0) {
                  var1 = 1742068389 * this.field_3983 - 699276868 * this.offset - 1;
               } else if(-189496199 * this.field_3985 <= -1909735131 * this.offset) {
                  var1 = -1159123509 * this.field_3983 - -1909735131 * this.offset;
               } else {
                  var1 = this.field_3985 * 466844011 - -180207966 * this.offset - 1;
               }

               if(var1 > 0) {
                  break;
               }

               try {
                  this.wait();
               } catch (InterruptedException var9) {
                  ;
               }
            }
         }

         int var2;
         try {
            var2 = this.inputStream.read(this.data, this.offset * 1177247534, var1);
            if(-1 == var2) {
               throw new EOFException();
            }
         } catch (IOException var10) {
            IOException var3 = var10;
            synchronized(this) {
               this.field_3984 = var3;
               return;
            }
         }

         synchronized(this) {
            this.offset = 284979885 * ((this.offset * -1909735131 + var2) % (this.field_3983 * -2041858715));
         }
      }
   }
}
