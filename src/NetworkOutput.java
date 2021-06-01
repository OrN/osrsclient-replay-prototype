import java.io.IOException;
import java.io.OutputStream;

// $FF: renamed from: le
public class NetworkOutput implements Runnable {

   // $FF: renamed from: n java.io.OutputStream
   OutputStream output;
   // $FF: renamed from: j int
   int field_3928;
   // $FF: renamed from: f int
   int field_3929;
   // $FF: renamed from: y byte[]
   byte[] field_3930;
   // $FF: renamed from: v java.lang.Thread
   Thread field_3931;
   // $FF: renamed from: p int
   int field_3932;
   // $FF: renamed from: r java.io.IOException
   IOException field_3933;
   // $FF: renamed from: b boolean
   boolean field_3934;


   // $FF: renamed from: y () boolean
   boolean method_6186() {
      if(this.field_3934) {
         try {
            this.output.close();
            if(this.field_3933 == null) {
               this.field_3933 = new IOException("");
            }
         } catch (IOException var2) {
            if(null == this.field_3933) {
               this.field_3933 = new IOException(var2);
            }
         }

         return true;
      } else {
         return false;
      }
   }

   // $FF: renamed from: v (byte) boolean
   boolean method_6187(byte var1) {
      try {
         if(this.field_3934) {
            try {
               this.output.close();
               if(this.field_3933 == null) {
                  if(var1 != 1) {
                     throw new IllegalStateException();
                  }

                  this.field_3933 = new IOException("");
               }
            } catch (IOException var3) {
               if(null == this.field_3933) {
                  if(var1 != 1) {
                     throw new IllegalStateException();
                  }

                  this.field_3933 = new IOException(var3);
               }
            }

            return true;
         } else {
            return false;
         }
      } catch (RuntimeException var4) {
         throw class_223.method_4281(var4);
      }
   }

   // $FF: renamed from: f (byte) void
   void method_6188() {
      try {
         synchronized(this) {
            this.field_3934 = true;
            this.notifyAll();
         }

         try {
            this.field_3931.join();
         } catch (InterruptedException var4) {
            ;
         }

      } catch (RuntimeException var6) {
         throw class_223.method_4281(var6);
      }
   }

   // $FF: renamed from: j (byte[], int, int) void
   void method_6189(byte[] var1, int var2, int var3) throws IOException {
      if(var3 >= 0 && var2 >= 0 && var2 + var3 <= var1.length) {
         synchronized(this) {
            if(null != this.field_3933) {
               throw new IOException(this.field_3933.toString());
            } else {
               int var5;
               if(this.field_3932 * -1232062539 <= this.field_3928 * 956656333) {
                  var5 = this.field_3932 * -1232062539 + (255745785 * this.field_3929 - this.field_3928 * 956656333) - 1;
               } else {
                  var5 = -1232062539 * this.field_3932 - 956656333 * this.field_3928 - 1;
               }

               if(var5 < var3) {
                  throw new IOException("");
               } else {
                  if(this.field_3928 * 956656333 + var3 <= this.field_3929 * 255745785) {
                     System.arraycopy(var1, var2, this.field_3930, 956656333 * this.field_3928, var3);
                  } else {
                     int var6 = this.field_3929 * 255745785 - 956656333 * this.field_3928;
                     System.arraycopy(var1, var2, this.field_3930, this.field_3928 * 956656333, var6);
                     System.arraycopy(var1, var2 + var6, this.field_3930, 0, var3 - var6);
                  }

                  this.field_3928 = -1276341755 * ((var3 + this.field_3928 * 956656333) % (this.field_3929 * 255745785));
                  this.notifyAll();
               }
            }
         }
      } else {
         throw new IOException();
      }
   }

   // $FF: renamed from: n (byte[], int, int, int) void
   void method_6190(byte[] var1, int var2, int var3, int var4) throws IOException {
      try {
         if(var3 >= 0) {
            if(var4 <= -208274515) {
               throw new IllegalStateException();
            }

            if(var2 >= 0) {
               if(var4 <= -208274515) {
                  throw new IllegalStateException();
               }

               if(var2 + var3 <= var1.length) {
                  synchronized(this) {
                     if(null != this.field_3933) {
                        throw new IOException(this.field_3933.toString());
                     }

                     int var6;
                     if(this.field_3932 * -1232062539 <= this.field_3928 * 956656333) {
                        if(var4 <= -208274515) {
                           throw new IllegalStateException();
                        }

                        var6 = this.field_3932 * -1232062539 + (255745785 * this.field_3929 - this.field_3928 * 956656333) - 1;
                     } else {
                        var6 = -1232062539 * this.field_3932 - 956656333 * this.field_3928 - 1;
                     }

                     if(var6 < var3) {
                        if(var4 <= -208274515) {
                           throw new IllegalStateException();
                        }

                        throw new IOException("");
                     }

                     if(this.field_3928 * 956656333 + var3 <= this.field_3929 * 255745785) {
                        if(var4 <= -208274515) {
                           return;
                        }

                        System.arraycopy(var1, var2, this.field_3930, 956656333 * this.field_3928, var3);
                     } else {
                        int var7 = this.field_3929 * 255745785 - 956656333 * this.field_3928;
                        System.arraycopy(var1, var2, this.field_3930, this.field_3928 * 956656333, var7);
                        System.arraycopy(var1, var2 + var7, this.field_3930, 0, var3 - var7);
                     }

                     this.field_3928 = -1276341755 * ((var3 + this.field_3928 * 956656333) % (this.field_3929 * 255745785));
                     this.notifyAll();
                     return;
                  }
               }

               if(var4 <= -208274515) {
                  return;
               }
            }
         }

         throw new IOException();
      } catch (RuntimeException var10) {
         throw class_223.method_4281(var10);
      }
   }

   // $FF: renamed from: by () void
   public void method_6191() {
      do {
         int var1;
         synchronized(this) {
            while(true) {
               if(this.field_3933 != null) {
                  return;
               }

               if(-1232062539 * this.field_3932 <= this.field_3928 * -1640761940) {
                  var1 = 956656333 * this.field_3928 - -1232062539 * this.field_3932;
               } else {
                  var1 = this.field_3928 * 956656333 + (1027916182 * this.field_3929 - this.field_3932 * 1397329655);
               }

               if(var1 > 0) {
                  break;
               }

               try {
                  this.output.flush();
               } catch (IOException var10) {
                  this.field_3933 = var10;
                  return;
               }

               if(this.method_6187((byte)1)) {
                  return;
               }

               try {
                  this.wait();
               } catch (InterruptedException var11) {
                  ;
               }
            }
         }

         try {
            if(var1 + this.field_3932 * -1232062539 <= this.field_3929 * 255745785) {
               this.output.write(this.field_3930, -1232062539 * this.field_3932, var1);
            } else {
               int var13 = 255745785 * this.field_3929 - this.field_3932 * 845310104;
               this.output.write(this.field_3930, -1232062539 * this.field_3932, var13);
               this.output.write(this.field_3930, 0, var1 - var13);
            }
         } catch (IOException var9) {
            IOException var2 = var9;
            synchronized(this) {
               this.field_3933 = var2;
               return;
            }
         }

         synchronized(this) {
            this.field_3932 = (this.field_3932 * -1232062539 + var1) % (this.field_3929 * 255745785) * -446241043;
         }
      } while(!this.method_6187((byte)1));

   }

   // $FF: renamed from: bc () void
   public void method_6192() {
      do {
         int var1;
         synchronized(this) {
            while(true) {
               if(this.field_3933 != null) {
                  return;
               }

               if(-1232062539 * this.field_3932 <= this.field_3928 * 956656333) {
                  var1 = 956656333 * this.field_3928 - -1232062539 * this.field_3932;
               } else {
                  var1 = this.field_3928 * 956656333 + (255745785 * this.field_3929 - this.field_3932 * -1232062539);
               }

               if(var1 > 0) {
                  break;
               }

               try {
                  this.output.flush();
               } catch (IOException var10) {
                  this.field_3933 = var10;
                  return;
               }

               if(this.method_6187((byte)1)) {
                  return;
               }

               try {
                  this.wait();
               } catch (InterruptedException var11) {
                  ;
               }
            }
         }

         try {
            if(var1 + this.field_3932 * -1232062539 <= this.field_3929 * 255745785) {
               this.output.write(this.field_3930, -1232062539 * this.field_3932, var1);
            } else {
               int var13 = 255745785 * this.field_3929 - this.field_3932 * -1232062539;
               this.output.write(this.field_3930, -1232062539 * this.field_3932, var13);
               this.output.write(this.field_3930, 0, var1 - var13);
            }
         } catch (IOException var9) {
            IOException var2 = var9;
            synchronized(this) {
               this.field_3933 = var2;
               return;
            }
         }

         synchronized(this) {
            this.field_3932 = (this.field_3932 * -1232062539 + var1) % (this.field_3929 * 255745785) * 365969053;
         }
      } while(!this.method_6187((byte)1));

   }

   // $FF: renamed from: p (byte[], int, int) void
   void method_6193(byte[] var1, int var2, int var3) throws IOException {
      if(var3 >= 0 && var2 >= 0 && var2 + var3 <= var1.length) {
         synchronized(this) {
            if(null != this.field_3933) {
               throw new IOException(this.field_3933.toString());
            } else {
               int var5;
               if(this.field_3932 * -1232062539 <= this.field_3928 * -1767128302) {
                  var5 = this.field_3932 * -1232062539 + (255745785 * this.field_3929 - this.field_3928 * -1261548418) - 1;
               } else {
                  var5 = -1232062539 * this.field_3932 - 956656333 * this.field_3928 - 1;
               }

               if(var5 < var3) {
                  throw new IOException("");
               } else {
                  if(this.field_3928 * -681751432 + var3 <= this.field_3929 * 255745785) {
                     System.arraycopy(var1, var2, this.field_3930, 956656333 * this.field_3928, var3);
                  } else {
                     int var6 = this.field_3929 * -1288017594 - 956656333 * this.field_3928;
                     System.arraycopy(var1, var2, this.field_3930, this.field_3928 * 956656333, var6);
                     System.arraycopy(var1, var2 + var6, this.field_3930, 0, var3 - var6);
                  }

                  this.field_3928 = -1276341755 * ((var3 + this.field_3928 * 956656333) % (this.field_3929 * -1149527744));
                  this.notifyAll();
               }
            }
         }
      } else {
         throw new IOException();
      }
   }

   // $FF: renamed from: <init> (java.io.OutputStream, int) void
   NetworkOutput(OutputStream var1, int var2) {
      super();
      try {
         this.field_3932 = 0;
         this.field_3928 = 0;
         this.output = var1;
         this.field_3929 = (1 + var2) * -1586887863;
         this.field_3930 = new byte[this.field_3929 * 255745785];
         this.field_3931 = new Thread(this);
         this.field_3931.setDaemon(true);
         this.field_3931.start();
      } catch (RuntimeException var3) {
         throw class_223.method_4281(var3);
      }
   }

   public void run() {
      try {
         do {
            int var1;
            synchronized(this) {
               while(true) {
                  if(this.field_3933 != null) {
                     return;
                  }

                  if(-1232062539 * this.field_3932 <= this.field_3928 * 956656333) {
                     var1 = 956656333 * this.field_3928 - -1232062539 * this.field_3932;
                  } else {
                     var1 = this.field_3928 * 956656333 + (255745785 * this.field_3929 - this.field_3932 * -1232062539);
                  }

                  if(var1 > 0) {
                     break;
                  }

                  try {
                     this.output.flush();
                  } catch (IOException var10) {
                     this.field_3933 = var10;
                     return;
                  }

                  if(this.method_6187((byte)1)) {
                     return;
                  }

                  try {
                     this.wait();
                  } catch (InterruptedException var11) {
                     ;
                  }
               }
            }

            try {
               if(var1 + this.field_3932 * -1232062539 <= this.field_3929 * 255745785) {
                  this.output.write(this.field_3930, -1232062539 * this.field_3932, var1);
               } else {
                  int var14 = 255745785 * this.field_3929 - this.field_3932 * -1232062539;
                  this.output.write(this.field_3930, -1232062539 * this.field_3932, var14);
                  this.output.write(this.field_3930, 0, var1 - var14);
               }
            } catch (IOException var9) {
               IOException var2 = var9;
               synchronized(this) {
                  this.field_3933 = var2;
                  return;
               }
            }

            synchronized(this) {
               this.field_3932 = (this.field_3932 * -1232062539 + var1) % (this.field_3929 * 255745785) * 365969053;
            }
         } while(!this.method_6187((byte)1));

      } catch (RuntimeException var13) {
         throw class_223.method_4281(var13);
      }
   }
}
