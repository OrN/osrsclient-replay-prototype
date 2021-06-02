import java.io.IOException;
import java.io.OutputStream;

// $FF: renamed from: le
public class NetworkOutput implements Runnable {

   // $FF: renamed from: n java.io.OutputStream
   OutputStream outputStream;
   // $FF: renamed from: j int
   int field_3928;
   // $FF: renamed from: f int
   int field_3929;
   // $FF: renamed from: y byte[]
   byte[] data;
   // $FF: renamed from: v java.lang.Thread
   Thread thread;
   // $FF: renamed from: p int
   int offset;
   // $FF: renamed from: r java.io.IOException
   IOException field_3933;
   // $FF: renamed from: b boolean
   boolean field_3934;

   // $FF: renamed from: v (byte) boolean
   boolean method_6187(byte var1) {
      try {
         if(this.field_3934) {
            try {
               this.outputStream.close();
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
            this.thread.join();
         } catch (InterruptedException var4) {
            ;
         }

      } catch (RuntimeException var6) {
         throw class_223.method_4281(var6);
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
                     if(this.offset * -1232062539 <= this.field_3928 * 956656333) {
                        if(var4 <= -208274515) {
                           throw new IllegalStateException();
                        }

                        var6 = this.offset * -1232062539 + (255745785 * this.field_3929 - this.field_3928 * 956656333) - 1;
                     } else {
                        var6 = -1232062539 * this.offset - 956656333 * this.field_3928 - 1;
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

                        System.arraycopy(var1, var2, this.data, 956656333 * this.field_3928, var3);
                     } else {
                        int var7 = this.field_3929 * 255745785 - 956656333 * this.field_3928;
                        System.arraycopy(var1, var2, this.data, this.field_3928 * 956656333, var7);
                        System.arraycopy(var1, var2 + var7, this.data, 0, var3 - var7);
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

   // $FF: renamed from: <init> (java.io.OutputStream, int) void
   NetworkOutput(OutputStream var1, int var2) {
      super();
      try {
         this.offset = 0;
         this.field_3928 = 0;
         this.outputStream = var1;
         this.field_3929 = (1 + var2) * -1586887863;
         this.data = new byte[this.field_3929 * 255745785];
         this.thread = new Thread(this);
         this.thread.setDaemon(true);
         this.thread.start();
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

                  if(-1232062539 * this.offset <= this.field_3928 * 956656333) {
                     var1 = 956656333 * this.field_3928 - -1232062539 * this.offset;
                  } else {
                     var1 = this.field_3928 * 956656333 + (255745785 * this.field_3929 - this.offset * -1232062539);
                  }

                  if(var1 > 0) {
                     break;
                  }

                  try {
                     this.outputStream.flush();
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
               if(var1 + this.offset * -1232062539 <= this.field_3929 * 255745785) {
                  this.outputStream.write(this.data, -1232062539 * this.offset, var1);
                  if (Settings.ENABLE_REPLAY_SUPPORT)
                     Replay.saveOutput(this.data, -1232062539 * this.offset, var1);
               } else {
                  int var14 = 255745785 * this.field_3929 - this.offset * -1232062539;
                  this.outputStream.write(this.data, -1232062539 * this.offset, var14);
                  this.outputStream.write(this.data, 0, var1 - var14);
                  if (Settings.ENABLE_REPLAY_SUPPORT) {
                     Replay.saveOutput(this.data, -1232062539 * this.offset, var14);
                     Replay.saveOutput(this.data, 0, var1 - var14);
                  }
               }
            } catch (IOException var9) {
               IOException var2 = var9;
               synchronized(this) {
                  this.field_3933 = var2;
                  return;
               }
            }

            synchronized(this) {
               this.offset = (this.offset * -1232062539 + var1) % (this.field_3929 * 255745785) * 365969053;
            }
         } while(!this.method_6187((byte)1));

      } catch (RuntimeException var13) {
         throw class_223.method_4281(var13);
      }
   }
}
