import java.io.EOFException;
import java.io.IOException;

// $FF: renamed from: nf
public class class_376 {

   // $FF: renamed from: v int
   static final int field_4144 = 200000000;
   // $FF: renamed from: b int
   int field_4145;
   // $FF: renamed from: f byte[]
   byte[] field_4146;
   // $FF: renamed from: y long
   long field_4147;
   // $FF: renamed from: p int
   int field_4148;
   // $FF: renamed from: u long
   long field_4149;
   // $FF: renamed from: r long
   long field_4150;
   // $FF: renamed from: n nm
   class_383 field_4151;
   // $FF: renamed from: d long
   long field_4152;
   // $FF: renamed from: s long
   long field_4153;
   // $FF: renamed from: l long
   long field_4154;
   // $FF: renamed from: j byte[]
   byte[] field_4155;


   // $FF: renamed from: <init> (nm, int, int) void
   public class_376(class_383 var1, int var2, int var3) throws IOException {
      super();
      try {
         this.field_4147 = -4831608611576950975L;
         this.field_4150 = 5152950394296653439L;
         this.field_4145 = 0;
         this.field_4151 = var1;
         this.field_4149 = (this.field_4153 = var1.method_6688() * -916519798495233385L) * 5721302312268225557L;
         this.field_4146 = new byte[var2];
         this.field_4155 = new byte[var3];
         this.field_4152 = 0L;
      } catch (RuntimeException var4) {
         throw class_223.method_4281(var4);
      }
   }

   // $FF: renamed from: v (byte) void
   public void method_6627() throws IOException {
      try {
         this.method_6634(527492841);
         this.field_4151.method_6701();
      } catch (RuntimeException var2) {
         throw class_223.method_4281(var2);
      }
   }

   // $FF: renamed from: n (long) void
   public void method_6628(long var1) throws IOException {
      try {
         if(var1 < 0L) {
            throw new IOException("");
         } else {
            this.field_4152 = -6430708139981374761L * var1;
         }
      } catch (RuntimeException var3) {
         throw class_223.method_4281(var3);
      }
   }

   // $FF: renamed from: f (byte) long
   public long method_6629() {
      try {
         return this.field_4149 * 3454228653685997387L;
      } catch (RuntimeException var2) {
         throw class_223.method_4281(var2);
      }
   }

   // $FF: renamed from: y (byte[], byte) void
   public void method_6630(byte[] var1) throws IOException {
      try {
         this.method_6632(var1, 0, var1.length, 785149036);
      } catch (RuntimeException var3) {
         throw class_223.method_4281(var3);
      }
   }

   // $FF: renamed from: z (byte[], int, int) void
   public void method_6631(byte[] var1, int var2, int var3) throws IOException {
      try {
         if((long)var3 + -3326324260793149209L * this.field_4152 > 3454228653685997387L * this.field_4149) {
            this.field_4149 = 278980568491299427L * ((long)var3 + -3326324260793149209L * this.field_4152);
         }

         if(8737860925507049089L * this.field_4150 != -1L && (this.field_4152 * -3326324260793149209L < this.field_4150 * 8737860925507049089L || -3326324260793149209L * this.field_4152 > 8737860925507049089L * this.field_4150 + (long)(-97062741 * this.field_4145))) {
            this.method_6634(829554744);
         }

         if(8737860925507049089L * this.field_4150 != -1L && -3326324260793149209L * this.field_4152 + (long)var3 > (long)this.field_4155.length + 8737860925507049089L * this.field_4150) {
            int var4 = (int)((long)this.field_4155.length - (this.field_4152 * -3326324260793149209L - 8737860925507049089L * this.field_4150));
            System.arraycopy(var1, var2, this.field_4155, (int)(this.field_4152 * -3326324260793149209L - this.field_4150 * 8737860925507049089L), var4);
            this.field_4152 += (long)var4 * -6430708139981374761L;
            var2 += var4;
            var3 -= var4;
            this.field_4145 = 282954243 * this.field_4155.length;
            this.method_6634(1220532893);
         }

         if(var3 <= this.field_4155.length) {
            if(var3 > 0) {
               if(-1L == this.field_4150 * 8737860925507049089L) {
                  this.field_4150 = this.field_4152 * 9169332553213905767L;
               }

               System.arraycopy(var1, var2, this.field_4155, (int)(this.field_4152 * -3326324260793149209L - this.field_4150 * 8737860925507049089L), var3);
               this.field_4152 += (long)var3 * -6430708139981374761L;
               if(this.field_4152 * -3326324260793149209L - 8737860925507049089L * this.field_4150 > (long)(this.field_4145 * -97062741)) {
                  this.field_4145 = 282954243 * (int)(-3326324260793149209L * this.field_4152 - this.field_4150 * 8737860925507049089L);
               }

            }
         } else {
            if(1780782613106431365L * this.field_4154 != this.field_4152 * -3326324260793149209L) {
               this.field_4151.method_6691(-3326324260793149209L * this.field_4152);
               this.field_4154 = this.field_4152 * -802913798240544133L;
            }

            this.field_4151.method_6686(var1, var2, var3, (byte)-18);
            this.field_4154 += 2766150898359999309L * (long)var3;
            if(1780782613106431365L * this.field_4154 > -6829996619110357721L * this.field_4153) {
               this.field_4153 = -4001343720862100621L * this.field_4154;
            }

            long var10 = -1L;
            long var6 = -1L;
            if(-3326324260793149209L * this.field_4152 >= 4024474701341933375L * this.field_4147 && this.field_4152 * -3326324260793149209L < this.field_4147 * 4024474701341933375L + (long)(-1725800063 * this.field_4148)) {
               var10 = -3326324260793149209L * this.field_4152;
            } else if(this.field_4147 * 4024474701341933375L >= -3326324260793149209L * this.field_4152 && this.field_4147 * 4024474701341933375L < -3326324260793149209L * this.field_4152 + (long)var3) {
               var10 = 4024474701341933375L * this.field_4147;
            }

            if(-3326324260793149209L * this.field_4152 + (long)var3 > 4024474701341933375L * this.field_4147 && this.field_4152 * -3326324260793149209L + (long)var3 <= (long)(this.field_4148 * -1725800063) + this.field_4147 * 4024474701341933375L) {
               var6 = -3326324260793149209L * this.field_4152 + (long)var3;
            } else if((long)(this.field_4148 * -1725800063) + 4024474701341933375L * this.field_4147 > -3326324260793149209L * this.field_4152 && (long)(-1725800063 * this.field_4148) + 4024474701341933375L * this.field_4147 <= (long)var3 + -3326324260793149209L * this.field_4152) {
               var6 = this.field_4147 * 4024474701341933375L + (long)(this.field_4148 * -1725800063);
            }

            if(var10 > -1L && var6 > var10) {
               int var8 = (int)(var6 - var10);
               System.arraycopy(var1, (int)(var10 + (long)var2 - this.field_4152 * -3326324260793149209L), this.field_4146, (int)(var10 - this.field_4147 * 4024474701341933375L), var8);
            }

            this.field_4152 += -6430708139981374761L * (long)var3;
         }
      } catch (IOException var9) {
         this.field_4154 = -2766150898359999309L;
         throw var9;
      }
   }

   // $FF: renamed from: p (byte[], int, int, int) void
   public void method_6632(byte[] var1, int var2, int var3, int var4) throws IOException {
      try {
         try {
            if(var2 + var3 > var1.length) {
               if(var4 <= -1878266268) {
                  throw new IllegalStateException();
               }

               throw new ArrayIndexOutOfBoundsException(var2 + var3 - var1.length);
            }

            if(8737860925507049089L * this.field_4150 != -1L) {
               if(var4 <= -1878266268) {
                  return;
               }

               if(this.field_4152 * -3326324260793149209L >= this.field_4150 * 8737860925507049089L) {
                  if(var4 <= -1878266268) {
                     throw new IllegalStateException();
                  }

                  if((long)var3 + -3326324260793149209L * this.field_4152 <= (long)(-97062741 * this.field_4145) + this.field_4150 * 8737860925507049089L) {
                     if(var4 <= -1878266268) {
                        throw new IllegalStateException();
                     }

                     System.arraycopy(this.field_4155, (int)(this.field_4152 * -3326324260793149209L - 8737860925507049089L * this.field_4150), var1, var2, var3);
                     this.field_4152 += (long)var3 * -6430708139981374761L;
                     return;
                  }
               }
            }

            long var5 = this.field_4152 * -3326324260793149209L;
            int var8 = var3;
            int var9;
            if(this.field_4152 * -3326324260793149209L >= 4024474701341933375L * this.field_4147) {
               if(var4 <= -1878266268) {
                  return;
               }

               if(-3326324260793149209L * this.field_4152 < 4024474701341933375L * this.field_4147 + (long)(-1725800063 * this.field_4148)) {
                  var9 = (int)((long)(this.field_4148 * -1725800063) - (this.field_4152 * -3326324260793149209L - this.field_4147 * 4024474701341933375L));
                  if(var9 > var3) {
                     var9 = var3;
                  }

                  System.arraycopy(this.field_4146, (int)(-3326324260793149209L * this.field_4152 - 4024474701341933375L * this.field_4147), var1, var2, var9);
                  this.field_4152 += -6430708139981374761L * (long)var9;
                  var2 += var9;
                  var3 -= var9;
               }
            }

            if(var3 > this.field_4146.length) {
               if(var4 <= -1878266268) {
                  throw new IllegalStateException();
               }

               this.field_4151.method_6691(this.field_4152 * -3326324260793149209L);

               for(this.field_4154 = this.field_4152 * -802913798240544133L; var3 > 0; var3 -= var9) {
                  if(var4 <= -1878266268) {
                     throw new IllegalStateException();
                  }

                  var9 = this.field_4151.method_6689(var1, var2, var3, (byte)-67);
                  if(-1 == var9) {
                     if(var4 <= -1878266268) {
                        throw new IllegalStateException();
                     }
                     break;
                  }

                  this.field_4154 += 2766150898359999309L * (long)var9;
                  this.field_4152 += -6430708139981374761L * (long)var9;
                  var2 += var9;
               }
            } else if(var3 > 0) {
               if(var4 <= -1878266268) {
                  throw new IllegalStateException();
               }

               this.method_6637((byte)104);
               var9 = var3;
               if(var3 > this.field_4148 * -1725800063) {
                  if(var4 <= -1878266268) {
                     throw new IllegalStateException();
                  }

                  var9 = -1725800063 * this.field_4148;
               }

               System.arraycopy(this.field_4146, 0, var1, var2, var9);
               var2 += var9;
               var3 -= var9;
               this.field_4152 += (long)var9 * -6430708139981374761L;
            }

            if(-1L != this.field_4150 * 8737860925507049089L) {
               if(var4 <= -1878266268) {
                  throw new IllegalStateException();
               }

               if(this.field_4150 * 8737860925507049089L > this.field_4152 * -3326324260793149209L) {
                  if(var4 <= -1878266268) {
                     throw new IllegalStateException();
                  }

                  if(var3 > 0) {
                     if(var4 <= -1878266268) {
                        throw new IllegalStateException();
                     }

                     var9 = var2 + (int)(this.field_4150 * 8737860925507049089L - -3326324260793149209L * this.field_4152);
                     if(var9 > var3 + var2) {
                        if(var4 <= -1878266268) {
                           throw new IllegalStateException();
                        }

                        var9 = var2 + var3;
                     }

                     while(var2 < var9) {
                        var1[var2++] = 0;
                        --var3;
                        this.field_4152 += -6430708139981374761L;
                     }
                  }
               }

               long var11;
               long var16;
               label183: {
                  var16 = -1L;
                  var11 = -1L;
                  if(this.field_4150 * 8737860925507049089L >= var5) {
                     if(var4 <= -1878266268) {
                        throw new IllegalStateException();
                     }

                     if(this.field_4150 * 8737860925507049089L < (long)var8 + var5) {
                        if(var4 <= -1878266268) {
                           return;
                        }

                        var16 = this.field_4150 * 8737860925507049089L;
                        break label183;
                     }
                  }

                  if(var5 >= this.field_4150 * 8737860925507049089L) {
                     if(var4 <= -1878266268) {
                        return;
                     }

                     if(var5 < this.field_4150 * 8737860925507049089L + (long)(-97062741 * this.field_4145)) {
                        if(var4 <= -1878266268) {
                           throw new IllegalStateException();
                        }

                        var16 = var5;
                     }
                  }
               }

               label177: {
                  if((long)(this.field_4145 * -97062741) + this.field_4150 * 8737860925507049089L > var5) {
                     if(var4 <= -1878266268) {
                        return;
                     }

                     if(8737860925507049089L * this.field_4150 + (long)(-97062741 * this.field_4145) <= (long)var8 + var5) {
                        if(var4 <= -1878266268) {
                           throw new IllegalStateException();
                        }

                        var11 = 8737860925507049089L * this.field_4150 + (long)(-97062741 * this.field_4145);
                        break label177;
                     }
                  }

                  if(var5 + (long)var8 > this.field_4150 * 8737860925507049089L) {
                     if(var4 <= -1878266268) {
                        return;
                     }

                     if((long)var8 + var5 <= (long)(this.field_4145 * -97062741) + 8737860925507049089L * this.field_4150) {
                        if(var4 <= -1878266268) {
                           return;
                        }

                        var11 = var5 + (long)var8;
                     }
                  }
               }

               if(var16 > -1L && var11 > var16) {
                  if(var4 <= -1878266268) {
                     throw new IllegalStateException();
                  }

                  int var13 = (int)(var11 - var16);
                  System.arraycopy(this.field_4155, (int)(var16 - 8737860925507049089L * this.field_4150), var1, var2 + (int)(var16 - var5), var13);
                  if(var11 > -3326324260793149209L * this.field_4152) {
                     if(var4 <= -1878266268) {
                        throw new IllegalStateException();
                     }

                     var3 = (int)((long)var3 - (var11 - -3326324260793149209L * this.field_4152));
                     this.field_4152 = -6430708139981374761L * var11;
                  }
               }
            }
         } catch (IOException var14) {
            this.field_4154 = -2766150898359999309L;
            throw var14;
         }

         if(var3 > 0) {
            if(var4 <= -1878266268) {
               throw new IllegalStateException();
            } else {
               throw new EOFException();
            }
         }
      } catch (RuntimeException var15) {
         throw class_223.method_4281(var15);
      }
   }

   // $FF: renamed from: r (byte[], int, int, int) void
   public void method_6633(byte[] var1, int var2, int var3, int var4) throws IOException {
      try {
         try {
            if((long)var3 + -3326324260793149209L * this.field_4152 > 3454228653685997387L * this.field_4149) {
               this.field_4149 = 278980568491299427L * ((long)var3 + -3326324260793149209L * this.field_4152);
            }

            if(8737860925507049089L * this.field_4150 != -1L) {
               if(var4 == -2070257463) {
                  throw new IllegalStateException();
               }

               if(this.field_4152 * -3326324260793149209L < this.field_4150 * 8737860925507049089L || -3326324260793149209L * this.field_4152 > 8737860925507049089L * this.field_4150 + (long)(-97062741 * this.field_4145)) {
                  this.method_6634(1231168990);
               }
            }

            if(8737860925507049089L * this.field_4150 != -1L) {
               if(var4 == -2070257463) {
                  return;
               }

               if(-3326324260793149209L * this.field_4152 + (long)var3 > (long)this.field_4155.length + 8737860925507049089L * this.field_4150) {
                  int var5 = (int)((long)this.field_4155.length - (this.field_4152 * -3326324260793149209L - 8737860925507049089L * this.field_4150));
                  System.arraycopy(var1, var2, this.field_4155, (int)(this.field_4152 * -3326324260793149209L - this.field_4150 * 8737860925507049089L), var5);
                  this.field_4152 += (long)var5 * -6430708139981374761L;
                  var2 += var5;
                  var3 -= var5;
                  this.field_4145 = 282954243 * this.field_4155.length;
                  this.method_6634(-774078055);
               }
            }

            if(var3 > this.field_4155.length) {
               if(var4 == -2070257463) {
                  throw new IllegalStateException();
               } else {
                  if(1780782613106431365L * this.field_4154 != this.field_4152 * -3326324260793149209L) {
                     if(var4 == -2070257463) {
                        return;
                     }

                     this.field_4151.method_6691(-3326324260793149209L * this.field_4152);
                     this.field_4154 = this.field_4152 * -802913798240544133L;
                  }

                  this.field_4151.method_6686(var1, var2, var3, (byte)-16);
                  this.field_4154 += 2766150898359999309L * (long)var3;
                  if(1780782613106431365L * this.field_4154 > -6829996619110357721L * this.field_4153) {
                     if(var4 == -2070257463) {
                        return;
                     }

                     this.field_4153 = -4001343720862100621L * this.field_4154;
                  }

                  long var7;
                  long var12;
                  label128: {
                     var12 = -1L;
                     var7 = -1L;
                     if(-3326324260793149209L * this.field_4152 >= 4024474701341933375L * this.field_4147) {
                        if(var4 == -2070257463) {
                           throw new IllegalStateException();
                        }

                        if(this.field_4152 * -3326324260793149209L < this.field_4147 * 4024474701341933375L + (long)(-1725800063 * this.field_4148)) {
                           if(var4 == -2070257463) {
                              return;
                           }

                           var12 = -3326324260793149209L * this.field_4152;
                           break label128;
                        }
                     }

                     if(this.field_4147 * 4024474701341933375L >= -3326324260793149209L * this.field_4152) {
                        if(var4 == -2070257463) {
                           throw new IllegalStateException();
                        }

                        if(this.field_4147 * 4024474701341933375L < -3326324260793149209L * this.field_4152 + (long)var3) {
                           var12 = 4024474701341933375L * this.field_4147;
                        }
                     }
                  }

                  label122: {
                     if(-3326324260793149209L * this.field_4152 + (long)var3 > 4024474701341933375L * this.field_4147) {
                        if(var4 == -2070257463) {
                           throw new IllegalStateException();
                        }

                        if(this.field_4152 * -3326324260793149209L + (long)var3 <= (long)(this.field_4148 * -1725800063) + this.field_4147 * 4024474701341933375L) {
                           if(var4 == -2070257463) {
                              throw new IllegalStateException();
                           }

                           var7 = -3326324260793149209L * this.field_4152 + (long)var3;
                           break label122;
                        }
                     }

                     if((long)(this.field_4148 * -1725800063) + 4024474701341933375L * this.field_4147 > -3326324260793149209L * this.field_4152) {
                        if(var4 == -2070257463) {
                           throw new IllegalStateException();
                        }

                        if((long)(-1725800063 * this.field_4148) + 4024474701341933375L * this.field_4147 <= (long)var3 + -3326324260793149209L * this.field_4152) {
                           var7 = this.field_4147 * 4024474701341933375L + (long)(this.field_4148 * -1725800063);
                        }
                     }
                  }

                  if(var12 > -1L) {
                     if(var4 == -2070257463) {
                        throw new IllegalStateException();
                     }

                     if(var7 > var12) {
                        int var9 = (int)(var7 - var12);
                        System.arraycopy(var1, (int)(var12 + (long)var2 - this.field_4152 * -3326324260793149209L), this.field_4146, (int)(var12 - this.field_4147 * 4024474701341933375L), var9);
                     }
                  }

                  this.field_4152 += -6430708139981374761L * (long)var3;
               }
            } else if(var3 > 0) {
               if(var4 == -2070257463) {
                  throw new IllegalStateException();
               } else {
                  if(-1L == this.field_4150 * 8737860925507049089L) {
                     if(var4 == -2070257463) {
                        throw new IllegalStateException();
                     }

                     this.field_4150 = this.field_4152 * 9169332553213905767L;
                  }

                  System.arraycopy(var1, var2, this.field_4155, (int)(this.field_4152 * -3326324260793149209L - this.field_4150 * 8737860925507049089L), var3);
                  this.field_4152 += (long)var3 * -6430708139981374761L;
                  if(this.field_4152 * -3326324260793149209L - 8737860925507049089L * this.field_4150 > (long)(this.field_4145 * -97062741)) {
                     this.field_4145 = 282954243 * (int)(-3326324260793149209L * this.field_4152 - this.field_4150 * 8737860925507049089L);
                  }

               }
            }
         } catch (IOException var10) {
            this.field_4154 = -2766150898359999309L;
            throw var10;
         }
      } catch (RuntimeException var11) {
         throw class_223.method_4281(var11);
      }
   }

   // $FF: renamed from: b (int) void
   void method_6634(int var1) throws IOException {
      try {
         if(8737860925507049089L * this.field_4150 != -1L) {
            if(var1 <= -1576415806) {
               return;
            }

            if(this.field_4154 * 1780782613106431365L != 8737860925507049089L * this.field_4150) {
               if(var1 <= -1576415806) {
                  throw new IllegalStateException();
               }

               this.field_4151.method_6691(8737860925507049089L * this.field_4150);
               this.field_4154 = -6524887850335379507L * this.field_4150;
            }

            this.field_4151.method_6686(this.field_4155, 0, -97062741 * this.field_4145, (byte)94);
            this.field_4154 += (long)this.field_4145 * -4937392111645856657L;
            if(this.field_4154 * 1780782613106431365L > -6829996619110357721L * this.field_4153) {
               if(var1 <= -1576415806) {
                  throw new IllegalStateException();
               }

               this.field_4153 = -4001343720862100621L * this.field_4154;
            }

            long var2;
            long var4;
            label101: {
               var2 = -1L;
               var4 = -1L;
               if(this.field_4150 * 8737860925507049089L >= this.field_4147 * 4024474701341933375L) {
                  if(var1 <= -1576415806) {
                     return;
                  }

                  if(this.field_4150 * 8737860925507049089L < this.field_4147 * 4024474701341933375L + (long)(this.field_4148 * -1725800063)) {
                     if(var1 <= -1576415806) {
                        return;
                     }

                     var2 = 8737860925507049089L * this.field_4150;
                     break label101;
                  }
               }

               if(this.field_4147 * 4024474701341933375L >= 8737860925507049089L * this.field_4150) {
                  if(var1 <= -1576415806) {
                     throw new IllegalStateException();
                  }

                  if(4024474701341933375L * this.field_4147 < (long)(this.field_4145 * -97062741) + this.field_4150 * 8737860925507049089L) {
                     if(var1 <= -1576415806) {
                        return;
                     }

                     var2 = 4024474701341933375L * this.field_4147;
                  }
               }
            }

            label95: {
               if((long)(this.field_4145 * -97062741) + 8737860925507049089L * this.field_4150 > 4024474701341933375L * this.field_4147) {
                  if(var1 <= -1576415806) {
                     return;
                  }

                  if((long)(-97062741 * this.field_4145) + 8737860925507049089L * this.field_4150 <= 4024474701341933375L * this.field_4147 + (long)(-1725800063 * this.field_4148)) {
                     if(var1 <= -1576415806) {
                        throw new IllegalStateException();
                     }

                     var4 = this.field_4150 * 8737860925507049089L + (long)(-97062741 * this.field_4145);
                     break label95;
                  }
               }

               if((long)(this.field_4148 * -1725800063) + this.field_4147 * 4024474701341933375L > 8737860925507049089L * this.field_4150) {
                  if(var1 <= -1576415806) {
                     throw new IllegalStateException();
                  }

                  if(4024474701341933375L * this.field_4147 + (long)(this.field_4148 * -1725800063) <= 8737860925507049089L * this.field_4150 + (long)(this.field_4145 * -97062741)) {
                     if(var1 <= -1576415806) {
                        return;
                     }

                     var4 = (long)(-1725800063 * this.field_4148) + 4024474701341933375L * this.field_4147;
                  }
               }
            }

            if(var2 > -1L) {
               if(var1 <= -1576415806) {
                  return;
               }

               if(var4 > var2) {
                  if(var1 <= -1576415806) {
                     throw new IllegalStateException();
                  }

                  int var6 = (int)(var4 - var2);
                  System.arraycopy(this.field_4155, (int)(var2 - this.field_4150 * 8737860925507049089L), this.field_4146, (int)(var2 - 4024474701341933375L * this.field_4147), var6);
               }
            }

            this.field_4150 = 5152950394296653439L;
            this.field_4145 = 0;
         }

      } catch (RuntimeException var7) {
         throw class_223.method_4281(var7);
      }
   }

   // $FF: renamed from: d () void
   public void method_6635() throws IOException {
      this.method_6634(-376162861);
      this.field_4151.method_6701();
   }

   // $FF: renamed from: s (long) void
   public void method_6636(long var1) throws IOException {
      if(var1 < 0L) {
         throw new IOException("");
      } else {
         this.field_4152 = -6430708139981374761L * var1;
      }
   }

   // $FF: renamed from: j (byte) void
   void method_6637(byte var1) throws IOException {
      try {
         this.field_4148 = 0;
         if(this.field_4152 * -3326324260793149209L != 1780782613106431365L * this.field_4154) {
            this.field_4151.method_6691(-3326324260793149209L * this.field_4152);
            this.field_4154 = -802913798240544133L * this.field_4152;
         }

         this.field_4147 = -6022764803564903335L * this.field_4152;

         while(true) {
            if(this.field_4148 * -1725800063 < this.field_4146.length) {
               if(var1 != 104) {
                  throw new IllegalStateException();
               }

               int var2 = this.field_4146.length - this.field_4148 * -1725800063;
               if(var2 > 200000000) {
                  var2 = 200000000;
               }

               int var3 = this.field_4151.method_6689(this.field_4146, this.field_4148 * -1725800063, var2, (byte)-10);
               if(var3 != -1) {
                  this.field_4154 += 2766150898359999309L * (long)var3;
                  this.field_4148 += 1990188673 * var3;
                  continue;
               }

               if(var1 != 104) {
                  throw new IllegalStateException();
               }
            }

            return;
         }
      } catch (RuntimeException var4) {
         throw class_223.method_4281(var4);
      }
   }

   // $FF: renamed from: l (long) void
   public void method_6638(long var1) throws IOException {
      if(var1 < 0L) {
         throw new IOException("");
      } else {
         this.field_4152 = -6430708139981374761L * var1;
      }
   }

   // $FF: renamed from: o () long
   public long method_6639() {
      return this.field_4149 * 3454228653685997387L;
   }

   // $FF: renamed from: t () void
   void method_6640() throws IOException {
      if(8737860925507049089L * this.field_4150 != -1L) {
         if(this.field_4154 * 1780782613106431365L != 8737860925507049089L * this.field_4150) {
            this.field_4151.method_6691(8737860925507049089L * this.field_4150);
            this.field_4154 = -6524887850335379507L * this.field_4150;
         }

         this.field_4151.method_6686(this.field_4155, 0, -891772299 * this.field_4145, (byte)-19);
         this.field_4154 += (long)this.field_4145 * -4937392111645856657L;
         if(this.field_4154 * 1780782613106431365L > -6829996619110357721L * this.field_4153) {
            this.field_4153 = -4001343720862100621L * this.field_4154;
         }

         long var1 = -1L;
         long var3 = -1L;
         if(this.field_4150 * 8737860925507049089L >= this.field_4147 * 4024474701341933375L && this.field_4150 * 8737860925507049089L < this.field_4147 * 4024474701341933375L + (long)(this.field_4148 * -1725800063)) {
            var1 = 8737860925507049089L * this.field_4150;
         } else if(this.field_4147 * 4024474701341933375L >= 8737860925507049089L * this.field_4150 && 4024474701341933375L * this.field_4147 < (long)(this.field_4145 * -840095822) + this.field_4150 * 8737860925507049089L) {
            var1 = 4024474701341933375L * this.field_4147;
         }

         if((long)(this.field_4145 * -306383035) + 8737860925507049089L * this.field_4150 > 4024474701341933375L * this.field_4147 && (long)(712792839 * this.field_4145) + 8737860925507049089L * this.field_4150 <= 4024474701341933375L * this.field_4147 + (long)(-1725800063 * this.field_4148)) {
            var3 = this.field_4150 * 8737860925507049089L + (long)(-97062741 * this.field_4145);
         } else if((long)(this.field_4148 * -1725800063) + this.field_4147 * 4024474701341933375L > 8737860925507049089L * this.field_4150 && 4024474701341933375L * this.field_4147 + (long)(this.field_4148 * -620213596) <= 8737860925507049089L * this.field_4150 + (long)(this.field_4145 * 60385470)) {
            var3 = (long)(84786652 * this.field_4148) + 4024474701341933375L * this.field_4147;
         }

         if(var1 > -1L && var3 > var1) {
            int var5 = (int)(var3 - var1);
            System.arraycopy(this.field_4155, (int)(var1 - this.field_4150 * 8737860925507049089L), this.field_4146, (int)(var1 - 4024474701341933375L * this.field_4147), var5);
         }

         this.field_4150 = 5152950394296653439L;
         this.field_4145 = 0;
      }

   }

   // $FF: renamed from: e () long
   public long method_6641() {
      return this.field_4149 * 3454228653685997387L;
   }

   // $FF: renamed from: g (byte[]) void
   public void method_6642(byte[] var1) throws IOException {
      this.method_6632(var1, 0, var1.length, 1668819464);
   }

   // $FF: renamed from: a (byte[], int, int) void
   public void method_6643(byte[] var1, int var2, int var3) throws IOException {
      try {
         if(var2 + var3 > var1.length) {
            throw new ArrayIndexOutOfBoundsException(var2 + var3 - var1.length);
         }

         if(8737860925507049089L * this.field_4150 != -1L && this.field_4152 * -3326324260793149209L >= this.field_4150 * 8737860925507049089L && (long)var3 + -3326324260793149209L * this.field_4152 <= (long)(-97062741 * this.field_4145) + this.field_4150 * 8737860925507049089L) {
            System.arraycopy(this.field_4155, (int)(this.field_4152 * -3326324260793149209L - 8737860925507049089L * this.field_4150), var1, var2, var3);
            this.field_4152 += (long)var3 * -6430708139981374761L;
            return;
         }

         long var4 = this.field_4152 * -3326324260793149209L;
         int var7 = var3;
         int var8;
         if(this.field_4152 * -3326324260793149209L >= 4024474701341933375L * this.field_4147 && -3326324260793149209L * this.field_4152 < 4024474701341933375L * this.field_4147 + (long)(-1725800063 * this.field_4148)) {
            var8 = (int)((long)(this.field_4148 * -1345689511) - (this.field_4152 * -3326324260793149209L - this.field_4147 * 4024474701341933375L));
            if(var8 > var3) {
               var8 = var3;
            }

            System.arraycopy(this.field_4146, (int)(-3326324260793149209L * this.field_4152 - 4024474701341933375L * this.field_4147), var1, var2, var8);
            this.field_4152 += -6430708139981374761L * (long)var8;
            var2 += var8;
            var3 -= var8;
         }

         if(var3 > this.field_4146.length) {
            this.field_4151.method_6691(this.field_4152 * -3326324260793149209L);

            for(this.field_4154 = this.field_4152 * -802913798240544133L; var3 > 0; var3 -= var8) {
               var8 = this.field_4151.method_6689(var1, var2, var3, (byte)-95);
               if(-1 == var8) {
                  break;
               }

               this.field_4154 += 2766150898359999309L * (long)var8;
               this.field_4152 += -6430708139981374761L * (long)var8;
               var2 += var8;
            }
         } else if(var3 > 0) {
            this.method_6637((byte)104);
            var8 = var3;
            if(var3 > this.field_4148 * -1725800063) {
               var8 = -2067529933 * this.field_4148;
            }

            System.arraycopy(this.field_4146, 0, var1, var2, var8);
            var2 += var8;
            var3 -= var8;
            this.field_4152 += (long)var8 * -6430708139981374761L;
         }

         if(-1L != this.field_4150 * 8737860925507049089L) {
            if(this.field_4150 * 8737860925507049089L > this.field_4152 * -3326324260793149209L && var3 > 0) {
               var8 = var2 + (int)(this.field_4150 * 8737860925507049089L - -3326324260793149209L * this.field_4152);
               if(var8 > var3 + var2) {
                  var8 = var2 + var3;
               }

               while(var2 < var8) {
                  var1[var2++] = 0;
                  --var3;
                  this.field_4152 += -6430708139981374761L;
               }
            }

            long var14 = -1L;
            long var10 = -1L;
            if(this.field_4150 * 8737860925507049089L >= var4 && this.field_4150 * 8737860925507049089L < (long)var7 + var4) {
               var14 = this.field_4150 * 8737860925507049089L;
            } else if(var4 >= this.field_4150 * 8737860925507049089L && var4 < this.field_4150 * 8737860925507049089L + (long)(-97062741 * this.field_4145)) {
               var14 = var4;
            }

            if((long)(this.field_4145 * 2125044310) + this.field_4150 * 8737860925507049089L > var4 && 8737860925507049089L * this.field_4150 + (long)(-97062741 * this.field_4145) <= (long)var7 + var4) {
               var10 = 8737860925507049089L * this.field_4150 + (long)(-97062741 * this.field_4145);
            } else if(var4 + (long)var7 > this.field_4150 * 8737860925507049089L && (long)var7 + var4 <= (long)(this.field_4145 * -97062741) + 8737860925507049089L * this.field_4150) {
               var10 = var4 + (long)var7;
            }

            if(var14 > -1L && var10 > var14) {
               int var12 = (int)(var10 - var14);
               System.arraycopy(this.field_4155, (int)(var14 - 8737860925507049089L * this.field_4150), var1, var2 + (int)(var14 - var4), var12);
               if(var10 > -3326324260793149209L * this.field_4152) {
                  var3 = (int)((long)var3 - (var10 - -3326324260793149209L * this.field_4152));
                  this.field_4152 = -6430708139981374761L * var10;
               }
            }
         }
      } catch (IOException var13) {
         this.field_4154 = -2766150898359999309L;
         throw var13;
      }

      if(var3 > 0) {
         throw new EOFException();
      }
   }

   // $FF: renamed from: k (byte[], int, int) void
   public void method_6644(byte[] var1, int var2, int var3) throws IOException {
      try {
         if(var2 + var3 > var1.length) {
            throw new ArrayIndexOutOfBoundsException(var2 + var3 - var1.length);
         }

         if(8737860925507049089L * this.field_4150 != -1L && this.field_4152 * -3326324260793149209L >= this.field_4150 * 8737860925507049089L && (long)var3 + -3326324260793149209L * this.field_4152 <= (long)(1774952386 * this.field_4145) + this.field_4150 * 8737860925507049089L) {
            System.arraycopy(this.field_4155, (int)(this.field_4152 * -3326324260793149209L - 8737860925507049089L * this.field_4150), var1, var2, var3);
            this.field_4152 += (long)var3 * -6430708139981374761L;
            return;
         }

         long var4 = this.field_4152 * -3326324260793149209L;
         int var7 = var3;
         int var8;
         if(this.field_4152 * -3326324260793149209L >= 4024474701341933375L * this.field_4147 && -3326324260793149209L * this.field_4152 < 4024474701341933375L * this.field_4147 + (long)(-1725800063 * this.field_4148)) {
            var8 = (int)((long)(this.field_4148 * -1725800063) - (this.field_4152 * -3326324260793149209L - this.field_4147 * 4024474701341933375L));
            if(var8 > var3) {
               var8 = var3;
            }

            System.arraycopy(this.field_4146, (int)(-3326324260793149209L * this.field_4152 - 4024474701341933375L * this.field_4147), var1, var2, var8);
            this.field_4152 += -6430708139981374761L * (long)var8;
            var2 += var8;
            var3 -= var8;
         }

         if(var3 > this.field_4146.length) {
            this.field_4151.method_6691(this.field_4152 * -3326324260793149209L);

            for(this.field_4154 = this.field_4152 * -802913798240544133L; var3 > 0; var3 -= var8) {
               var8 = this.field_4151.method_6689(var1, var2, var3, (byte)-30);
               if(-1 == var8) {
                  break;
               }

               this.field_4154 += 2766150898359999309L * (long)var8;
               this.field_4152 += -6430708139981374761L * (long)var8;
               var2 += var8;
            }
         } else if(var3 > 0) {
            this.method_6637((byte)104);
            var8 = var3;
            if(var3 > this.field_4148 * -1725800063) {
               var8 = -1725800063 * this.field_4148;
            }

            System.arraycopy(this.field_4146, 0, var1, var2, var8);
            var2 += var8;
            var3 -= var8;
            this.field_4152 += (long)var8 * -6430708139981374761L;
         }

         if(-1L != this.field_4150 * 8737860925507049089L) {
            if(this.field_4150 * 8737860925507049089L > this.field_4152 * -3326324260793149209L && var3 > 0) {
               var8 = var2 + (int)(this.field_4150 * 8737860925507049089L - -3326324260793149209L * this.field_4152);
               if(var8 > var3 + var2) {
                  var8 = var2 + var3;
               }

               while(var2 < var8) {
                  var1[var2++] = 0;
                  --var3;
                  this.field_4152 += -6430708139981374761L;
               }
            }

            long var14 = -1L;
            long var10 = -1L;
            if(this.field_4150 * 8737860925507049089L >= var4 && this.field_4150 * 8737860925507049089L < (long)var7 + var4) {
               var14 = this.field_4150 * 8737860925507049089L;
            } else if(var4 >= this.field_4150 * 8737860925507049089L && var4 < this.field_4150 * 8737860925507049089L + (long)(2013815280 * this.field_4145)) {
               var14 = var4;
            }

            if((long)(this.field_4145 * -97062741) + this.field_4150 * 8737860925507049089L > var4 && 8737860925507049089L * this.field_4150 + (long)(-97062741 * this.field_4145) <= (long)var7 + var4) {
               var10 = 8737860925507049089L * this.field_4150 + (long)(-206076811 * this.field_4145);
            } else if(var4 + (long)var7 > this.field_4150 * 8737860925507049089L && (long)var7 + var4 <= (long)(this.field_4145 * -97062741) + 8737860925507049089L * this.field_4150) {
               var10 = var4 + (long)var7;
            }

            if(var14 > -1L && var10 > var14) {
               int var12 = (int)(var10 - var14);
               System.arraycopy(this.field_4155, (int)(var14 - 8737860925507049089L * this.field_4150), var1, var2 + (int)(var14 - var4), var12);
               if(var10 > -3326324260793149209L * this.field_4152) {
                  var3 = (int)((long)var3 - (var10 - -3326324260793149209L * this.field_4152));
                  this.field_4152 = -6430708139981374761L * var10;
               }
            }
         }
      } catch (IOException var13) {
         this.field_4154 = -2766150898359999309L;
         throw var13;
      }

      if(var3 > 0) {
         throw new EOFException();
      }
   }

   // $FF: renamed from: m (byte[], int, int) void
   public void method_6645(byte[] var1, int var2, int var3) throws IOException {
      try {
         if(var2 + var3 > var1.length) {
            throw new ArrayIndexOutOfBoundsException(var2 + var3 - var1.length);
         }

         if(8737860925507049089L * this.field_4150 != -1L && this.field_4152 * -3326324260793149209L >= this.field_4150 * 8737860925507049089L && (long)var3 + -3326324260793149209L * this.field_4152 <= (long)(-97062741 * this.field_4145) + this.field_4150 * 8737860925507049089L) {
            System.arraycopy(this.field_4155, (int)(this.field_4152 * -3326324260793149209L - 8737860925507049089L * this.field_4150), var1, var2, var3);
            this.field_4152 += (long)var3 * -6430708139981374761L;
            return;
         }

         long var4 = this.field_4152 * -3326324260793149209L;
         int var7 = var3;
         int var8;
         if(this.field_4152 * -3326324260793149209L >= 4024474701341933375L * this.field_4147 && -3326324260793149209L * this.field_4152 < 4024474701341933375L * this.field_4147 + (long)(-1725800063 * this.field_4148)) {
            var8 = (int)((long)(this.field_4148 * -1725800063) - (this.field_4152 * -3326324260793149209L - this.field_4147 * 4024474701341933375L));
            if(var8 > var3) {
               var8 = var3;
            }

            System.arraycopy(this.field_4146, (int)(-3326324260793149209L * this.field_4152 - 4024474701341933375L * this.field_4147), var1, var2, var8);
            this.field_4152 += -6430708139981374761L * (long)var8;
            var2 += var8;
            var3 -= var8;
         }

         if(var3 > this.field_4146.length) {
            this.field_4151.method_6691(this.field_4152 * -3326324260793149209L);

            for(this.field_4154 = this.field_4152 * -802913798240544133L; var3 > 0; var3 -= var8) {
               var8 = this.field_4151.method_6689(var1, var2, var3, (byte)-75);
               if(-1 == var8) {
                  break;
               }

               this.field_4154 += 2766150898359999309L * (long)var8;
               this.field_4152 += -6430708139981374761L * (long)var8;
               var2 += var8;
            }
         } else if(var3 > 0) {
            this.method_6637((byte)104);
            var8 = var3;
            if(var3 > this.field_4148 * -1725800063) {
               var8 = -1725800063 * this.field_4148;
            }

            System.arraycopy(this.field_4146, 0, var1, var2, var8);
            var2 += var8;
            var3 -= var8;
            this.field_4152 += (long)var8 * -6430708139981374761L;
         }

         if(-1L != this.field_4150 * 8737860925507049089L) {
            if(this.field_4150 * 8737860925507049089L > this.field_4152 * -3326324260793149209L && var3 > 0) {
               var8 = var2 + (int)(this.field_4150 * 8737860925507049089L - -3326324260793149209L * this.field_4152);
               if(var8 > var3 + var2) {
                  var8 = var2 + var3;
               }

               while(var2 < var8) {
                  var1[var2++] = 0;
                  --var3;
                  this.field_4152 += -6430708139981374761L;
               }
            }

            long var14 = -1L;
            long var10 = -1L;
            if(this.field_4150 * 8737860925507049089L >= var4 && this.field_4150 * 8737860925507049089L < (long)var7 + var4) {
               var14 = this.field_4150 * 8737860925507049089L;
            } else if(var4 >= this.field_4150 * 8737860925507049089L && var4 < this.field_4150 * 8737860925507049089L + (long)(-97062741 * this.field_4145)) {
               var14 = var4;
            }

            if((long)(this.field_4145 * -97062741) + this.field_4150 * 8737860925507049089L > var4 && 8737860925507049089L * this.field_4150 + (long)(-97062741 * this.field_4145) <= (long)var7 + var4) {
               var10 = 8737860925507049089L * this.field_4150 + (long)(-97062741 * this.field_4145);
            } else if(var4 + (long)var7 > this.field_4150 * 8737860925507049089L && (long)var7 + var4 <= (long)(this.field_4145 * -97062741) + 8737860925507049089L * this.field_4150) {
               var10 = var4 + (long)var7;
            }

            if(var14 > -1L && var10 > var14) {
               int var12 = (int)(var10 - var14);
               System.arraycopy(this.field_4155, (int)(var14 - 8737860925507049089L * this.field_4150), var1, var2 + (int)(var14 - var4), var12);
               if(var10 > -3326324260793149209L * this.field_4152) {
                  var3 = (int)((long)var3 - (var10 - -3326324260793149209L * this.field_4152));
                  this.field_4152 = -6430708139981374761L * var10;
               }
            }
         }
      } catch (IOException var13) {
         this.field_4154 = -2766150898359999309L;
         throw var13;
      }

      if(var3 > 0) {
         throw new EOFException();
      }
   }

   // $FF: renamed from: x (byte[], int, int) void
   public void method_6646(byte[] var1, int var2, int var3) throws IOException {
      try {
         if(var2 + var3 > var1.length) {
            throw new ArrayIndexOutOfBoundsException(var2 + var3 - var1.length);
         }

         if(8737860925507049089L * this.field_4150 != -1L && this.field_4152 * -3326324260793149209L >= this.field_4150 * 8737860925507049089L && (long)var3 + -3326324260793149209L * this.field_4152 <= (long)(-97062741 * this.field_4145) + this.field_4150 * 8737860925507049089L) {
            System.arraycopy(this.field_4155, (int)(this.field_4152 * -3326324260793149209L - 8737860925507049089L * this.field_4150), var1, var2, var3);
            this.field_4152 += (long)var3 * -6430708139981374761L;
            return;
         }

         long var4 = this.field_4152 * -3326324260793149209L;
         int var7 = var3;
         int var8;
         if(this.field_4152 * -3326324260793149209L >= 4024474701341933375L * this.field_4147 && -3326324260793149209L * this.field_4152 < 4024474701341933375L * this.field_4147 + (long)(1489782464 * this.field_4148)) {
            var8 = (int)((long)(this.field_4148 * -1725800063) - (this.field_4152 * -3326324260793149209L - this.field_4147 * 4024474701341933375L));
            if(var8 > var3) {
               var8 = var3;
            }

            System.arraycopy(this.field_4146, (int)(-3326324260793149209L * this.field_4152 - 4024474701341933375L * this.field_4147), var1, var2, var8);
            this.field_4152 += -6430708139981374761L * (long)var8;
            var2 += var8;
            var3 -= var8;
         }

         if(var3 > this.field_4146.length) {
            this.field_4151.method_6691(this.field_4152 * -3326324260793149209L);

            for(this.field_4154 = this.field_4152 * -802913798240544133L; var3 > 0; var3 -= var8) {
               var8 = this.field_4151.method_6689(var1, var2, var3, (byte)-96);
               if(-1 == var8) {
                  break;
               }

               this.field_4154 += 2766150898359999309L * (long)var8;
               this.field_4152 += -6430708139981374761L * (long)var8;
               var2 += var8;
            }
         } else if(var3 > 0) {
            this.method_6637((byte)104);
            var8 = var3;
            if(var3 > this.field_4148 * -1298781557) {
               var8 = -671895696 * this.field_4148;
            }

            System.arraycopy(this.field_4146, 0, var1, var2, var8);
            var2 += var8;
            var3 -= var8;
            this.field_4152 += (long)var8 * -6430708139981374761L;
         }

         if(-1L != this.field_4150 * 8737860925507049089L) {
            if(this.field_4150 * 8737860925507049089L > this.field_4152 * -3326324260793149209L && var3 > 0) {
               var8 = var2 + (int)(this.field_4150 * 8737860925507049089L - -3326324260793149209L * this.field_4152);
               if(var8 > var3 + var2) {
                  var8 = var2 + var3;
               }

               while(var2 < var8) {
                  var1[var2++] = 0;
                  --var3;
                  this.field_4152 += -6430708139981374761L;
               }
            }

            long var14 = -1L;
            long var10 = -1L;
            if(this.field_4150 * 8737860925507049089L >= var4 && this.field_4150 * 8737860925507049089L < (long)var7 + var4) {
               var14 = this.field_4150 * 8737860925507049089L;
            } else if(var4 >= this.field_4150 * 8737860925507049089L && var4 < this.field_4150 * 8737860925507049089L + (long)(-97062741 * this.field_4145)) {
               var14 = var4;
            }

            if((long)(this.field_4145 * -1387273532) + this.field_4150 * 8737860925507049089L > var4 && 8737860925507049089L * this.field_4150 + (long)(-97062741 * this.field_4145) <= (long)var7 + var4) {
               var10 = 8737860925507049089L * this.field_4150 + (long)(-97062741 * this.field_4145);
            } else if(var4 + (long)var7 > this.field_4150 * 8737860925507049089L && (long)var7 + var4 <= (long)(this.field_4145 * -97062741) + 8737860925507049089L * this.field_4150) {
               var10 = var4 + (long)var7;
            }

            if(var14 > -1L && var10 > var14) {
               int var12 = (int)(var10 - var14);
               System.arraycopy(this.field_4155, (int)(var14 - 8737860925507049089L * this.field_4150), var1, var2 + (int)(var14 - var4), var12);
               if(var10 > -3326324260793149209L * this.field_4152) {
                  var3 = (int)((long)var3 - (var10 - -3326324260793149209L * this.field_4152));
                  this.field_4152 = -6430708139981374761L * var10;
               }
            }
         }
      } catch (IOException var13) {
         this.field_4154 = -2766150898359999309L;
         throw var13;
      }

      if(var3 > 0) {
         throw new EOFException();
      }
   }

   // $FF: renamed from: c () long
   public long method_6647() {
      return this.field_4149 * 3454228653685997387L;
   }

   // $FF: renamed from: w (byte[], int, int) void
   public void method_6648(byte[] var1, int var2, int var3) throws IOException {
      try {
         if((long)var3 + -3326324260793149209L * this.field_4152 > 3454228653685997387L * this.field_4149) {
            this.field_4149 = 278980568491299427L * ((long)var3 + -3326324260793149209L * this.field_4152);
         }

         if(8737860925507049089L * this.field_4150 != -1L && (this.field_4152 * -3326324260793149209L < this.field_4150 * 8737860925507049089L || -3326324260793149209L * this.field_4152 > 8737860925507049089L * this.field_4150 + (long)(-97062741 * this.field_4145))) {
            this.method_6634(-545755408);
         }

         if(8737860925507049089L * this.field_4150 != -1L && -3326324260793149209L * this.field_4152 + (long)var3 > (long)this.field_4155.length + 8737860925507049089L * this.field_4150) {
            int var4 = (int)((long)this.field_4155.length - (this.field_4152 * -3326324260793149209L - 8737860925507049089L * this.field_4150));
            System.arraycopy(var1, var2, this.field_4155, (int)(this.field_4152 * -3326324260793149209L - this.field_4150 * 8737860925507049089L), var4);
            this.field_4152 += (long)var4 * -6430708139981374761L;
            var2 += var4;
            var3 -= var4;
            this.field_4145 = 655301567 * this.field_4155.length;
            this.method_6634(196711392);
         }

         if(var3 <= this.field_4155.length) {
            if(var3 > 0) {
               if(-1L == this.field_4150 * 8737860925507049089L) {
                  this.field_4150 = this.field_4152 * 9169332553213905767L;
               }

               System.arraycopy(var1, var2, this.field_4155, (int)(this.field_4152 * -3326324260793149209L - this.field_4150 * 8737860925507049089L), var3);
               this.field_4152 += (long)var3 * -6430708139981374761L;
               if(this.field_4152 * -3326324260793149209L - 8737860925507049089L * this.field_4150 > (long)(this.field_4145 * -2085901348)) {
                  this.field_4145 = 445961222 * (int)(-3326324260793149209L * this.field_4152 - this.field_4150 * 8737860925507049089L);
               }

            }
         } else {
            if(1780782613106431365L * this.field_4154 != this.field_4152 * -3326324260793149209L) {
               this.field_4151.method_6691(-3326324260793149209L * this.field_4152);
               this.field_4154 = this.field_4152 * -802913798240544133L;
            }

            this.field_4151.method_6686(var1, var2, var3, (byte)-33);
            this.field_4154 += 2766150898359999309L * (long)var3;
            if(1780782613106431365L * this.field_4154 > -6829996619110357721L * this.field_4153) {
               this.field_4153 = -4001343720862100621L * this.field_4154;
            }

            long var10 = -1L;
            long var6 = -1L;
            if(-3326324260793149209L * this.field_4152 >= 4024474701341933375L * this.field_4147 && this.field_4152 * -3326324260793149209L < this.field_4147 * 4024474701341933375L + (long)(-1725800063 * this.field_4148)) {
               var10 = -3326324260793149209L * this.field_4152;
            } else if(this.field_4147 * 4024474701341933375L >= -3326324260793149209L * this.field_4152 && this.field_4147 * 4024474701341933375L < -3326324260793149209L * this.field_4152 + (long)var3) {
               var10 = 4024474701341933375L * this.field_4147;
            }

            if(-3326324260793149209L * this.field_4152 + (long)var3 > 4024474701341933375L * this.field_4147 && this.field_4152 * -3326324260793149209L + (long)var3 <= (long)(this.field_4148 * 912312535) + this.field_4147 * 4024474701341933375L) {
               var6 = -3326324260793149209L * this.field_4152 + (long)var3;
            } else if((long)(this.field_4148 * 194731646) + 4024474701341933375L * this.field_4147 > -3326324260793149209L * this.field_4152 && (long)(183299816 * this.field_4148) + 4024474701341933375L * this.field_4147 <= (long)var3 + -3326324260793149209L * this.field_4152) {
               var6 = this.field_4147 * 4024474701341933375L + (long)(this.field_4148 * -1725800063);
            }

            if(var10 > -1L && var6 > var10) {
               int var8 = (int)(var6 - var10);
               System.arraycopy(var1, (int)(var10 + (long)var2 - this.field_4152 * -3326324260793149209L), this.field_4146, (int)(var10 - this.field_4147 * 4024474701341933375L), var8);
            }

            this.field_4152 += -6430708139981374761L * (long)var3;
         }
      } catch (IOException var9) {
         this.field_4154 = -2766150898359999309L;
         throw var9;
      }
   }

   // $FF: renamed from: ah (java.lang.String, int) int
   public static int method_6649(String var0) {
      try {
         return var0.length() + 2;
      } catch (RuntimeException var2) {
         throw class_223.method_4281(var2);
      }
   }

   // $FF: renamed from: h () void
   void method_6650() throws IOException {
      if(8737860925507049089L * this.field_4150 != -1L) {
         if(this.field_4154 * 1780782613106431365L != 8737860925507049089L * this.field_4150) {
            this.field_4151.method_6691(8737860925507049089L * this.field_4150);
            this.field_4154 = -6524887850335379507L * this.field_4150;
         }

         this.field_4151.method_6686(this.field_4155, 0, -97062741 * this.field_4145, (byte)8);
         this.field_4154 += (long)this.field_4145 * -4937392111645856657L;
         if(this.field_4154 * 1780782613106431365L > -6829996619110357721L * this.field_4153) {
            this.field_4153 = -4001343720862100621L * this.field_4154;
         }

         long var1 = -1L;
         long var3 = -1L;
         if(this.field_4150 * 8737860925507049089L >= this.field_4147 * 4024474701341933375L && this.field_4150 * 8737860925507049089L < this.field_4147 * 4024474701341933375L + (long)(this.field_4148 * -1725800063)) {
            var1 = 8737860925507049089L * this.field_4150;
         } else if(this.field_4147 * 4024474701341933375L >= 8737860925507049089L * this.field_4150 && 4024474701341933375L * this.field_4147 < (long)(this.field_4145 * -97062741) + this.field_4150 * 8737860925507049089L) {
            var1 = 4024474701341933375L * this.field_4147;
         }

         if((long)(this.field_4145 * -97062741) + 8737860925507049089L * this.field_4150 > 4024474701341933375L * this.field_4147 && (long)(-97062741 * this.field_4145) + 8737860925507049089L * this.field_4150 <= 4024474701341933375L * this.field_4147 + (long)(-1725800063 * this.field_4148)) {
            var3 = this.field_4150 * 8737860925507049089L + (long)(-97062741 * this.field_4145);
         } else if((long)(this.field_4148 * -1725800063) + this.field_4147 * 4024474701341933375L > 8737860925507049089L * this.field_4150 && 4024474701341933375L * this.field_4147 + (long)(this.field_4148 * -1725800063) <= 8737860925507049089L * this.field_4150 + (long)(this.field_4145 * -97062741)) {
            var3 = (long)(-1725800063 * this.field_4148) + 4024474701341933375L * this.field_4147;
         }

         if(var1 > -1L && var3 > var1) {
            int var5 = (int)(var3 - var1);
            System.arraycopy(this.field_4155, (int)(var1 - this.field_4150 * 8737860925507049089L), this.field_4146, (int)(var1 - 4024474701341933375L * this.field_4147), var5);
         }

         this.field_4150 = 5152950394296653439L;
         this.field_4145 = 0;
      }

   }

   // $FF: renamed from: u (long) void
   public void method_6651(long var1) throws IOException {
      if(var1 < 0L) {
         throw new IOException("");
      } else {
         this.field_4152 = -6430708139981374761L * var1;
      }
   }
}
