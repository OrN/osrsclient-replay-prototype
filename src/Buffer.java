import java.math.BigInteger;

// $FF: renamed from: nd
public class Buffer extends class_27 {

   // $FF: renamed from: j byte[]
   public byte[] data;
   // $FF: renamed from: p int
   public static final int field_13 = 5000;
   // $FF: renamed from: y int
   public static final int field_14 = 100;
   // $FF: renamed from: r int
   public int offset;
   // $FF: renamed from: b int[]
   static int[] field_16;
   // $FF: renamed from: s long[]
   static long[] field_17;

   // $FF: renamed from: ar (byte) void
   public void method_112(byte var1) {
      try {
         if(this.data != null) {
            if(var1 <= -1) {
               return;
            }

            class_253.method_4898(this.data, -830600929);
         }

         this.data = null;
      } catch (RuntimeException var2) {
         throw class_223.method_4281(var2);
      }
   }

   // $FF: renamed from: ct (int) int
   public int method_113() {
      try {
         return 128 - this.data[(this.offset += -1025691571) * -442398587 - 1] & 255;
      } catch (RuntimeException var2) {
         throw class_223.method_4281(var2);
      }
   }

   // $FF: renamed from: dj (byte[], int, int) int
   public static int method_114(byte[] var0, int var1, int var2) {
      int var3 = -1;

      for(int var4 = var1; var4 < var2; ++var4) {
         var3 = var3 >>> 8 ^ field_16[(var3 ^ var0[var4]) & 255];
      }

      var3 = ~var3;
      return var3;
   }

   // $FF: renamed from: as (int, int) void
   public void method_115(int var1) {
      try {
         this.data[(this.offset += -1025691571) * -442398587 - 1] = (byte)(var1 >> 16);
         this.data[(this.offset += -1025691571) * -442398587 - 1] = (byte)(var1 >> 8);
         this.data[(this.offset += -1025691571) * -442398587 - 1] = (byte)var1;
      } catch (RuntimeException var3) {
         throw class_223.method_4281(var3);
      }
   }

   // $FF: renamed from: aj (int, int) void
   public void method_116(int var1) {
      try {
         this.data[(this.offset += -1025691571) * -442398587 - 1] = (byte)(var1 >> 24);
         this.data[(this.offset += -1025691571) * -442398587 - 1] = (byte)(var1 >> 16);
         this.data[(this.offset += -1025691571) * -442398587 - 1] = (byte)(var1 >> 8);
         this.data[(this.offset += -1025691571) * -442398587 - 1] = (byte)var1;
      } catch (RuntimeException var3) {
         throw class_223.method_4281(var3);
      }
   }

   // $FF: renamed from: am (long) void
   public void method_117(long var1) {
      try {
         this.data[(this.offset += -1025691571) * -442398587 - 1] = (byte)((int)(var1 >> 40));
         this.data[(this.offset += -1025691571) * -442398587 - 1] = (byte)((int)(var1 >> 32));
         this.data[(this.offset += -1025691571) * -442398587 - 1] = (byte)((int)(var1 >> 24));
         this.data[(this.offset += -1025691571) * -442398587 - 1] = (byte)((int)(var1 >> 16));
         this.data[(this.offset += -1025691571) * -442398587 - 1] = (byte)((int)(var1 >> 8));
         this.data[(this.offset += -1025691571) * -442398587 - 1] = (byte)((int)var1);
      } catch (RuntimeException var3) {
         throw class_223.method_4281(var3);
      }
   }

   // $FF: renamed from: do (int) void
   public void method_118(int var1) {
      this.data[(this.offset += -1025691571) * -442398587 - 1] = (byte)var1;
   }

   // $FF: renamed from: bz (int) boolean
   public boolean method_119(int var1) {
      try {
         boolean var10000;
         if((this.readUnsignedByte() & 1) == 1) {
            if(var1 <= -920528867) {
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

   // $FF: renamed from: at (java.lang.String, int) void
   public void method_120(String var1) {
      try {
         int var3 = var1.indexOf(0);
         if(var3 >= 0) {
            throw new IllegalArgumentException("");
         } else {
            this.offset += class_100.method_1880(var1, 0, var1.length(), this.data, -442398587 * this.offset, -169882356) * -1025691571;
            this.data[(this.offset += -1025691571) * -442398587 - 1] = 0;
         }
      } catch (RuntimeException var4) {
         throw class_223.method_4281(var4);
      }
   }

   // $FF: renamed from: ao (java.lang.String, byte) void
   public void method_121(String var1, byte var2) {
      try {
         int var3 = var1.indexOf(0);
         if(var3 >= 0) {
            if(var2 != 1) {
               throw new IllegalArgumentException("");
            }
         } else {
            this.data[(this.offset += -1025691571) * -442398587 - 1] = 0;
            this.offset += class_100.method_1880(var1, 0, var1.length(), this.data, this.offset * -442398587, -1502076799) * -1025691571;
            this.data[(this.offset += -1025691571) * -442398587 - 1] = 0;
         }
      } catch (RuntimeException var4) {
         throw class_223.method_4281(var4);
      }
   }

   // $FF: renamed from: jf (int) void
   public void method_122(int var1) {
      this.data[(this.offset += -1025691571) * -442398587 - 1] = (byte)(var1 >> 8);
      this.data[(this.offset += -1025691571) * -442398587 - 1] = (byte)var1;
      this.data[(this.offset += -1025691571) * -442398587 - 1] = (byte)(var1 >> 24);
      this.data[(this.offset += -1025691571) * -442398587 - 1] = (byte)(var1 >> 16);
   }

   // $FF: renamed from: cf (int) byte
   public byte method_123() {
      try {
         return (byte)(128 - this.data[(this.offset += -1025691571) * -442398587 - 1]);
      } catch (RuntimeException var2) {
         throw class_223.method_4281(var2);
      }
   }

   // $FF: renamed from: bx (int) int
   public int method_124(int var1) {
      try {
         int var2 = 0;

         int var3;
         for(var3 = this.method_144(); var3 == 32767; var3 = this.method_144()) {
            if(var1 != -1225252005) {
               throw new IllegalStateException();
            }

            var2 += 32767;
         }

         var2 += var3;
         return var2;
      } catch (RuntimeException var4) {
         throw class_223.method_4281(var4);
      }
   }

   // $FF: renamed from: ak (int, int) void
   public void method_125(int var1, int var2) {
      try {
         if(var1 < 0) {
            if(var2 <= -1173400846) {
               throw new IllegalStateException();
            } else {
               throw new IllegalArgumentException();
            }
         } else {
            this.data[this.offset * -442398587 - var1 - 4] = (byte)(var1 >> 24);
            this.data[-442398587 * this.offset - var1 - 3] = (byte)(var1 >> 16);
            this.data[-442398587 * this.offset - var1 - 2] = (byte)(var1 >> 8);
            this.data[-442398587 * this.offset - var1 - 1] = (byte)var1;
         }
      } catch (RuntimeException var3) {
         throw class_223.method_4281(var3);
      }
   }

   // $FF: renamed from: ay (int, byte) void
   public void method_126(int var1, byte var2) {
      try {
         if(var1 >= 0) {
            if(var2 >= 32) {
               throw new IllegalStateException();
            }

            if(var1 <= '\uffff') {
               this.data[this.offset * -442398587 - var1 - 2] = (byte)(var1 >> 8);
               this.data[-442398587 * this.offset - var1 - 1] = (byte)var1;
               return;
            }

            if(var2 >= 32) {
               throw new IllegalStateException();
            }
         }

         throw new IllegalArgumentException();
      } catch (RuntimeException var3) {
         throw class_223.method_4281(var3);
      }
   }

   // $FF: renamed from: bo (int) int
   public int method_127(int var1) {
      try {
         byte var2 = this.data[(this.offset += -1025691571) * -442398587 - 1];

         int var3;
         for(var3 = 0; var2 < 0; var2 = this.data[(this.offset += -1025691571) * -442398587 - 1]) {
            if(var1 >= 626567735) {
               throw new IllegalStateException();
            }

            var3 = (var3 | var2 & 127) << 7;
         }

         return var3 | var2;
      } catch (RuntimeException var4) {
         throw class_223.method_4281(var4);
      }
   }

   // $FF: renamed from: aq (java.lang.CharSequence, int) void
   public void method_128(CharSequence var1, int var2) {
      try {
         int var4 = var1.length();
         int var5 = 0;

         int var6;
         for(var6 = 0; var6 < var4; ++var6) {
            char var7 = var1.charAt(var6);
            if(var7 <= 127) {
               if(var2 != 499802318) {
                  throw new IllegalStateException();
               }

               ++var5;
            } else if(var7 <= 2047) {
               if(var2 != 499802318) {
                  throw new IllegalStateException();
               }

               var5 += 2;
            } else {
               var5 += 3;
            }
         }

         this.data[(this.offset += -1025691571) * -442398587 - 1] = 0;
         this.method_129(var5, 2063951954);
         var5 = this.offset;
         byte[] var14 = this.data;
         int var8 = -442398587 * this.offset;
         int var9 = var1.length();
         int var10 = var8;

         for(int var11 = 0; var11 < var9; ++var11) {
            char var12 = var1.charAt(var11);
            if(var12 <= 127) {
               var14[var10++] = (byte)var12;
            } else if(var12 <= 2047) {
               if(var2 != 499802318) {
                  throw new IllegalStateException();
               }

               var14[var10++] = (byte)(192 | var12 >> 6);
               var14[var10++] = (byte)(128 | var12 & 63);
            } else {
               var14[var10++] = (byte)(224 | var12 >> 12);
               var14[var10++] = (byte)(128 | var12 >> 6 & 63);
               var14[var10++] = (byte)(128 | var12 & 63);
            }
         }

         var6 = var10 - var8;
         this.offset = var5 + -1025691571 * var6;
      } catch (RuntimeException var13) {
         throw class_223.method_4281(var13);
      }
   }

   // $FF: renamed from: an (int, int) void
   public void method_129(int var1, int var2) {
      try {
         if((var1 & -128) != 0) {
            if(0 != (var1 & -16384)) {
               if((var1 & -2097152) != 0) {
                  if(var2 <= 2049153237) {
                     return;
                  }

                  if(0 != (var1 & -268435456)) {
                     if(var2 <= 2049153237) {
                        return;
                     }

                     this.writeByte(var1 >>> 28 | 128);
                  }

                  this.writeByte(var1 >>> 21 | 128);
               }

               this.writeByte(var1 >>> 14 | 128);
            }

            this.writeByte(var1 >>> 7 | 128);
         }

         this.writeByte(var1 & 127);
      } catch (RuntimeException var3) {
         throw class_223.method_4281(var3);
      }
   }

   // $FF: renamed from: bd (int) int
   public int readUnsignedByte() {
      try {
         return this.data[(this.offset += -1025691571) * -442398587 - 1] & 255;
      } catch (RuntimeException var2) {
         throw class_223.method_4281(var2);
      }
   }

   // $FF: renamed from: bt (byte) byte
   public byte method_131() {
      try {
         return this.data[(this.offset += -1025691571) * -442398587 - 1];
      } catch (RuntimeException var2) {
         throw class_223.method_4281(var2);
      }
   }

   // $FF: renamed from: bq (byte) int
   public int readShort() {
      try {
         this.offset += -2051383142;
         return ((this.data[this.offset * -442398587 - 2] & 255) << 8) + (this.data[this.offset * -442398587 - 1] & 255);
      } catch (RuntimeException var2) {
         throw class_223.method_4281(var2);
      }
   }

   // $FF: renamed from: bp (int) int
   public int method_133(int var1) {
      try {
         if(this.data[this.offset * -442398587] < 0) {
            if(var1 >= 1595879590) {
               throw new IllegalStateException();
            } else {
               return this.method_135() & Integer.MAX_VALUE;
            }
         } else {
            return this.readShort();
         }
      } catch (RuntimeException var2) {
         throw class_223.method_4281(var2);
      }
   }

   // $FF: renamed from: bl (byte) int
   public int method_134() {
      try {
         this.offset += 1217892583;
         return (this.data[this.offset * -442398587 - 1] & 255) + ((this.data[-442398587 * this.offset - 3] & 255) << 16) + ((this.data[-442398587 * this.offset - 2] & 255) << 8);
      } catch (RuntimeException var2) {
         throw class_223.method_4281(var2);
      }
   }

   // $FF: renamed from: bv (byte) int
   public int method_135() {
      try {
         this.offset += 192201012;
         return ((this.data[this.offset * -442398587 - 2] & 255) << 8) + ((this.data[this.offset * -442398587 - 4] & 255) << 24) + ((this.data[-442398587 * this.offset - 3] & 255) << 16) + (this.data[this.offset * -442398587 - 1] & 255);
      } catch (RuntimeException var2) {
         throw class_223.method_4281(var2);
      }
   }

   // $FF: renamed from: bm (int) long
   public long method_136() {
      try {
         long var2 = (long)this.method_135() & 4294967295L;
         long var4 = (long)this.method_135() & 4294967295L;
         return (var2 << 32) + var4;
      } catch (RuntimeException var6) {
         throw class_223.method_4281(var6);
      }
   }

   // $FF: renamed from: el (java.lang.CharSequence) void
   public void method_137(CharSequence var1) {
      int var3 = var1.length();
      int var4 = 0;

      int var5;
      for(var5 = 0; var5 < var3; ++var5) {
         char var6 = var1.charAt(var5);
         if(var6 <= 127) {
            ++var4;
         } else if(var6 <= 2047) {
            var4 += 2;
         } else {
            var4 += 3;
         }
      }

      this.data[(this.offset += -1025691571) * -442398587 - 1] = 0;
      this.method_129(var4, 2055364800);
      var4 = this.offset;
      byte[] var12 = this.data;
      int var7 = -442398587 * this.offset;
      int var8 = var1.length();
      int var9 = var7;

      for(int var10 = 0; var10 < var8; ++var10) {
         char var11 = var1.charAt(var10);
         if(var11 <= 127) {
            var12[var9++] = (byte)var11;
         } else if(var11 <= 2047) {
            var12[var9++] = (byte)(192 | var11 >> 6);
            var12[var9++] = (byte)(128 | var11 & 63);
         } else {
            var12[var9++] = (byte)(224 | var11 >> 12);
            var12[var9++] = (byte)(128 | var11 >> 6 & 63);
            var12[var9++] = (byte)(128 | var11 & 63);
         }
      }

      var5 = var9 - var7;
      this.offset = var4 + -1025691571 * var5;
   }

   // $FF: renamed from: jn (int) void
   public void method_138(int var1) {
      this.data[(this.offset += -1025691571) * -442398587 - 1] = (byte)var1;
      this.data[(this.offset += -18044079) * -442398587 - 1] = (byte)(var1 >> 8);
      this.data[(this.offset += 903467245) * -1364142286 - 1] = (byte)(var1 >> 16);
   }

   // $FF: renamed from: bs (int) java.lang.String
   public String method_139(int var1) {
      try {
         int var2 = this.offset * -442398587;

         do {
            if(this.data[(this.offset += -1025691571) * -442398587 - 1] == 0) {
               int var3 = this.offset * -442398587 - var2 - 1;
               if(0 == var3) {
                  if(var1 != -391631059) {
                     throw new IllegalStateException();
                  }

                  return "";
               }

               return class_135.method_2948(this.data, var2, var3, (byte)103);
            }
         } while(var1 == -391631059);

         throw new IllegalStateException();
      } catch (RuntimeException var4) {
         throw class_223.method_4281(var4);
      }
   }

   // $FF: renamed from: br (byte) java.lang.String
   public String method_140(byte var1) {
      try {
         byte var2 = this.data[(this.offset += -1025691571) * -442398587 - 1];
         if(var2 != 0) {
            if(var1 <= 1) {
               throw new IllegalStateException();
            } else {
               throw new IllegalStateException("");
            }
         } else {
            int var3 = this.offset * -442398587;

            do {
               if(this.data[(this.offset += -1025691571) * -442398587 - 1] == 0) {
                  int var4 = this.offset * -442398587 - var3 - 1;
                  if(var4 == 0) {
                     if(var1 <= 1) {
                        throw new IllegalStateException();
                     }

                     return "";
                  }

                  return class_135.method_2948(this.data, var3, var4, (byte)100);
               }
            } while(var1 > 1);

            throw new IllegalStateException();
         }
      } catch (RuntimeException var5) {
         throw class_223.method_4281(var5);
      }
   }

   // $FF: renamed from: bf (byte) java.lang.String
   public String method_141(byte var1) {
      try {
         byte var2 = this.data[(this.offset += -1025691571) * -442398587 - 1];
         if(0 != var2) {
            if(var1 == 8) {
               throw new IllegalStateException();
            } else {
               throw new IllegalStateException("");
            }
         } else {
            int var3 = this.method_127(-70655510);
            if(var3 + -442398587 * this.offset > this.data.length) {
               if(var1 == 8) {
                  throw new IllegalStateException();
               } else {
                  throw new IllegalStateException("");
               }
            } else {
               byte[] var5 = this.data;
               int var6 = -442398587 * this.offset;
               char[] var7 = new char[var3];
               int var8 = 0;
               int var9 = var6;

               int var12;
               for(int var10 = var3 + var6; var9 < var10; var7[var8++] = (char)var12) {
                  int var11 = var5[var9++] & 255;
                  if(var11 < 128) {
                     if(var1 == 8) {
                        throw new IllegalStateException();
                     }

                     if(0 == var11) {
                        if(var1 == 8) {
                           throw new IllegalStateException();
                        }

                        var12 = '\ufffd';
                     } else {
                        var12 = var11;
                     }
                  } else if(var11 < 192) {
                     if(var1 == 8) {
                        throw new IllegalStateException();
                     }

                     var12 = '\ufffd';
                  } else if(var11 < 224) {
                     if(var1 == 8) {
                        throw new IllegalStateException();
                     }

                     if(var9 < var10) {
                        if(var1 == 8) {
                           throw new IllegalStateException();
                        }

                        if((var5[var9] & 192) == 128) {
                           if(var1 == 8) {
                              throw new IllegalStateException();
                           }

                           var12 = (var11 & 31) << 6 | var5[var9++] & 63;
                           if(var12 < 128) {
                              if(var1 == 8) {
                                 throw new IllegalStateException();
                              }

                              var12 = '\ufffd';
                           }
                           continue;
                        }
                     }

                     var12 = '\ufffd';
                  } else if(var11 < 240) {
                     if(var1 == 8) {
                        throw new IllegalStateException();
                     }

                     if(1 + var9 < var10 && 128 == (var5[var9] & 192)) {
                        if(var1 == 8) {
                           throw new IllegalStateException();
                        }

                        if(128 == (var5[1 + var9] & 192)) {
                           if(var1 == 8) {
                              throw new IllegalStateException();
                           }

                           var12 = (var11 & 15) << 12 | (var5[var9++] & 63) << 6 | var5[var9++] & 63;
                           if(var12 < 2048) {
                              if(var1 == 8) {
                                 throw new IllegalStateException();
                              }

                              var12 = '\ufffd';
                           }
                           continue;
                        }
                     }

                     var12 = '\ufffd';
                  } else if(var11 < 248) {
                     if(var1 == 8) {
                        throw new IllegalStateException();
                     }

                     if(var9 + 2 < var10) {
                        if(var1 == 8) {
                           throw new IllegalStateException();
                        }

                        if((var5[var9] & 192) == 128) {
                           if(var1 == 8) {
                              throw new IllegalStateException();
                           }

                           if((var5[1 + var9] & 192) == 128 && 128 == (var5[2 + var9] & 192)) {
                              if(var1 == 8) {
                                 throw new IllegalStateException();
                              }

                              var12 = (var11 & 7) << 18 | (var5[var9++] & 63) << 12 | (var5[var9++] & 63) << 6 | var5[var9++] & 63;
                              if(var12 >= 65536) {
                                 if(var1 == 8) {
                                    throw new IllegalStateException();
                                 }

                                 if(var12 <= 1114111) {
                                    var12 = '\ufffd';
                                    continue;
                                 }

                                 if(var1 == 8) {
                                    throw new IllegalStateException();
                                 }
                              }

                              var12 = '\ufffd';
                              continue;
                           }
                        }
                     }

                     var12 = '\ufffd';
                  } else {
                     var12 = '\ufffd';
                  }
               }

               String var4 = new String(var7, 0, var8);
               this.offset += -1025691571 * var3;
               return var4;
            }
         }
      } catch (RuntimeException var13) {
         throw class_223.method_4281(var13);
      }
   }

   // $FF: renamed from: js () int
   public int method_142() {
      this.offset += 192201012;
      return (this.data[1638755938 * this.offset - 2] & -1287766654) + ((this.data[this.offset * -442398587 - 1] & 255) << 8) + ((this.data[-442398587 * this.offset - 4] & 255) << 16) + ((this.data[this.offset * -1918383938 - 3] & 1230702440) << 24);
   }

   // $FF: renamed from: be (byte) int
   public int method_143(byte var1) {
      try {
         int var2 = this.data[this.offset * -442398587] & 255;
         if(var2 < 128) {
            if(var1 <= 6) {
               throw new IllegalStateException();
            } else {
               return this.readUnsignedByte() - 64;
            }
         } else {
            return this.readShort() - '\uc000';
         }
      } catch (RuntimeException var3) {
         throw class_223.method_4281(var3);
      }
   }

   // $FF: renamed from: bj (byte) int
   public int method_144() {
      try {
         int var2 = this.data[-442398587 * this.offset] & 255;
         return var2 < 128?this.readUnsignedByte():this.readShort() - '\u8000';
      } catch (RuntimeException var3) {
         throw class_223.method_4281(var3);
      }
   }

   // $FF: renamed from: cd (int, byte) void
   public void method_145(int var1) {
      try {
         this.data[(this.offset += -1025691571) * -442398587 - 1] = (byte)(var1 + 128);
      } catch (RuntimeException var3) {
         throw class_223.method_4281(var3);
      }
   }

   // $FF: renamed from: di () void
   public void method_146() {
      if(this.data != null) {
         class_253.method_4898(this.data, -187945950);
      }

      this.data = null;
   }

   // $FF: renamed from: bn (int) int
   public int method_147(int var1) {
      try {
         if(this.data[-442398587 * this.offset] < 0) {
            return this.method_135() & Integer.MAX_VALUE;
         } else {
            int var2 = this.readShort();
            if(32767 == var2) {
               if(var1 <= '\uff00') {
                  throw new IllegalStateException();
               } else {
                  return -1;
               }
            } else {
               return var2;
            }
         }
      } catch (RuntimeException var3) {
         throw class_223.method_4281(var3);
      }
   }

   // $FF: renamed from: cm (int, int) void
   public void method_148(int var1) {
      try {
         this.data[(this.offset += -1025691571) * -442398587 - 1] = (byte)(0 - var1);
      } catch (RuntimeException var3) {
         throw class_223.method_4281(var3);
      }
   }

   // $FF: renamed from: gq () int
   public int method_149() {
      this.offset += -2051383142;
      int var1 = ((this.data[-442398587 * this.offset - 2] & 255) << 8) + (this.data[this.offset * -442398587 - 1] & 255);
      if(var1 > 32767) {
         var1 -= 65536;
      }

      return var1;
   }

   // $FF: renamed from: bi (int[], int) void
   public void method_150(int[] var1, int var2) {
      try {
         int var3 = this.offset * -442398587 / 8;
         this.offset = 0;

         for(int var4 = 0; var4 < var3; ++var4) {
            if(var2 != 1314548709) {
               throw new IllegalStateException();
            }

            int var5 = this.method_135();
            int var6 = this.method_135();
            int var7 = -957401312;
            int var8 = -1640531527;

            for(int var9 = 32; var9-- > 0; var5 -= (var6 << 4 ^ var6 >>> 5) + var6 ^ var7 + var1[var7 & 3]) {
               var6 -= var5 + (var5 << 4 ^ var5 >>> 5) ^ var7 + var1[var7 >>> 11 & 3];
               var7 -= var8;
            }

            this.offset -= 384402024;
            this.method_116(var5);
            this.method_116(var6);
         }

      } catch (RuntimeException var10) {
         throw class_223.method_4281(var10);
      }
   }

   // $FF: renamed from: bb (int[], int, int, byte) void
   public void method_151(int[] var1, int var2, int var3, byte var4) {
      try {
         int var5 = -442398587 * this.offset;
         this.offset = -1025691571 * var2;
         int var6 = (var3 - var2) / 8;

         for(int var7 = 0; var7 < var6; ++var7) {
            int var8 = this.method_135();
            int var9 = this.method_135();
            int var10 = 0;
            int var11 = -1640531527;

            for(int var12 = 32; var12-- > 0; var9 += (var8 << 4 ^ var8 >>> 5) + var8 ^ var1[var10 >>> 11 & 3] + var10) {
               if(var4 == 0) {
                  throw new IllegalStateException();
               }

               var8 += (var9 << 4 ^ var9 >>> 5) + var9 ^ var10 + var1[var10 & 3];
               var10 += var11;
            }

            this.offset -= 384402024;
            this.method_116(var8);
            this.method_116(var9);
         }

         this.offset = var5 * -1025691571;
      } catch (RuntimeException var13) {
         throw class_223.method_4281(var13);
      }
   }

   // $FF: renamed from: gx () java.lang.String
   public String method_152() {
      int var1 = this.offset * -442398587;

      while(this.data[(this.offset += -1025691571) * -442398587 - 1] != 0) {
         ;
      }

      int var2 = this.offset * -442398587 - var1 - 1;
      return 0 == var2?"":class_135.method_2948(this.data, var1, var2, (byte)86);
   }

   // $FF: renamed from: bg (java.math.BigInteger, java.math.BigInteger, int) void
   public void method_153(BigInteger var1, BigInteger var2) {
      try {
         int var4 = -442398587 * this.offset;
         this.offset = 0;
         byte[] var5 = new byte[var4];
         this.method_267(var5, 0, var4, 841544685);
         BigInteger var6 = new BigInteger(var5);
         BigInteger var7 = var6.modPow(var1, var2);
         byte[] var8 = var7.toByteArray();
         this.offset = 0;
         this.method_333(var8.length);
         this.method_161(var8, 0, var8.length);
      } catch (RuntimeException var9) {
         throw class_223.method_4281(var9);
      }
   }

   // $FF: renamed from: au (int, int) void
   public void method_154(int var1, int var2) {
      try {
         if(var1 >= 0) {
            if(var2 != 1514054821) {
               throw new IllegalStateException();
            }

            if(var1 < 128) {
               if(var2 != 1514054821) {
                  return;
               }

               this.writeByte(var1);
               return;
            }
         }

         if(var1 >= 0) {
            if(var2 != 1514054821) {
               return;
            }

            if(var1 < '\u8000') {
               if(var2 != 1514054821) {
                  throw new IllegalStateException();
               }

               this.method_333('\u8000' + var1);
               return;
            }
         }

         throw new IllegalArgumentException();
      } catch (RuntimeException var3) {
         throw class_223.method_4281(var3);
      }
   }

   // $FF: renamed from: bc (int) boolean
   public boolean method_155(int var1) {
      try {
         this.offset -= 192201012;
         int var2 = class_151.method_3216(this.data, 0, this.offset * -442398587);
         int var3 = this.method_135();
         if(var3 == var2) {
            if(var1 >= -1368928781) {
               throw new IllegalStateException();
            } else {
               return true;
            }
         } else {
            return false;
         }
      } catch (RuntimeException var4) {
         throw class_223.method_4281(var4);
      }
   }

   // $FF: renamed from: ed (java.lang.String) void
   public void method_156(String var1) {
      int var2 = var1.indexOf(0);
      if(var2 >= 0) {
         throw new IllegalArgumentException("");
      } else {
         this.data[(this.offset += 499866103) * -442398587 - 1] = 0;
         this.offset += class_100.method_1880(var1, 0, var1.length(), this.data, this.offset * -442398587, 1435263107) * -1025691571;
         this.data[(this.offset += -1732854447) * -442398587 - 1] = 0;
      }
   }

   // $FF: renamed from: cr (byte) byte
   public byte method_157() {
      try {
         return (byte)(0 - this.data[(this.offset += -1025691571) * -442398587 - 1]);
      } catch (RuntimeException var2) {
         throw class_223.method_4281(var2);
      }
   }

   // $FF: renamed from: cv (int, int) void
   public void method_158(int var1) {
      try {
         this.data[(this.offset += -1025691571) * -442398587 - 1] = (byte)(128 - var1);
      } catch (RuntimeException var3) {
         throw class_223.method_4281(var3);
      }
   }

   // $FF: renamed from: cp (int) int
   public int method_159() {
      try {
         return this.data[(this.offset += -1025691571) * -442398587 - 1] - 128 & 255;
      } catch (RuntimeException var2) {
         throw class_223.method_4281(var2);
      }
   }

   // $FF: renamed from: <init> (int) void
   public Buffer(int var1) {
      super();
      try {
         this.data = class_54.method_582(var1);
         this.offset = 0;
      } catch (RuntimeException var2) {
         throw class_223.method_4281(var2);
      }
   }

   // $FF: renamed from: aw (byte[], int, int, int) void
   public void method_161(byte[] var1, int var2, int var3) {
      try {
         for(int var5 = var2; var5 < var2 + var3; ++var5) {
            this.data[(this.offset += -1025691571) * -442398587 - 1] = var1[var5];
         }

      } catch (RuntimeException var6) {
         throw class_223.method_4281(var6);
      }
   }

   // $FF: renamed from: cq (int) byte
   public byte method_162() {
      try {
         return (byte)(this.data[(this.offset += -1025691571) * -442398587 - 1] - 128);
      } catch (RuntimeException var2) {
         throw class_223.method_4281(var2);
      }
   }

   // $FF: renamed from: cw (int) int
   public int method_163() {
      try {
         this.offset += 192201012;
         return (this.data[-442398587 * this.offset - 2] & 255) + ((this.data[this.offset * -442398587 - 1] & 255) << 8) + ((this.data[-442398587 * this.offset - 4] & 255) << 16) + ((this.data[this.offset * -442398587 - 3] & 255) << 24);
      } catch (RuntimeException var2) {
         throw class_223.method_4281(var2);
      }
   }

   // $FF: renamed from: fg (int) void
   public void method_164(int var1) {
      if((var1 & -128) != 0) {
         if(0 != (var1 & -16384)) {
            if((var1 & -2097152) != 0) {
               if(0 != (var1 & -268435456)) {
                  this.writeByte(var1 >>> 28 | 128);
               }

               this.writeByte(var1 >>> 21 | 128);
            }

            this.writeByte(var1 >>> 14 | 128);
         }

         this.writeByte(var1 >>> 7 | 128);
      }

      this.writeByte(var1 & 127);
   }

   // $FF: renamed from: cn (int, int) void
   public void method_165(int var1) {
      try {
         this.data[(this.offset += -1025691571) * -442398587 - 1] = (byte)var1;
         this.data[(this.offset += -1025691571) * -442398587 - 1] = (byte)(var1 >> 8);
      } catch (RuntimeException var3) {
         throw class_223.method_4281(var3);
      }
   }

   // $FF: renamed from: jj () int
   public int method_166() {
      this.offset += 192201012;
      return ((this.data[-442398587 * this.offset - 2] & 255) << 24) + ((this.data[this.offset * -442398587 - 1] & 255) << 16) + ((this.data[this.offset * -442398587 - 4] & 255) << 8) + (this.data[-442398587 * this.offset - 3] & 255);
   }

   // $FF: renamed from: cg (int, byte) void
   public void method_167(int var1) {
      try {
         this.data[(this.offset += -1025691571) * -442398587 - 1] = (byte)(var1 + 128);
         this.data[(this.offset += -1025691571) * -442398587 - 1] = (byte)(var1 >> 8);
      } catch (RuntimeException var3) {
         throw class_223.method_4281(var3);
      }
   }

   // $FF: renamed from: co (int) int
   public int method_168() {
      try {
         this.offset += -2051383142;
         return ((this.data[-442398587 * this.offset - 1] & 255) << 8) + (this.data[this.offset * -442398587 - 2] & 255);
      } catch (RuntimeException var2) {
         throw class_223.method_4281(var2);
      }
   }

   // $FF: renamed from: ck (int) int
   public int method_169() {
      try {
         this.offset += -2051383142;
         return (this.data[-442398587 * this.offset - 1] - 128 & 255) + ((this.data[-442398587 * this.offset - 2] & 255) << 8);
      } catch (RuntimeException var2) {
         throw class_223.method_4281(var2);
      }
   }

   // $FF: renamed from: cj (int) int
   public int method_170() {
      try {
         this.offset += -2051383142;
         return ((this.data[this.offset * -442398587 - 1] & 255) << 8) + (this.data[-442398587 * this.offset - 2] - 128 & 255);
      } catch (RuntimeException var2) {
         throw class_223.method_4281(var2);
      }
   }

   // $FF: renamed from: dy (int) void
   public void method_171(int var1) {
      this.data[(this.offset += -1025691571) * -442398587 - 1] = (byte)(var1 >> 16);
      this.data[(this.offset += -1025691571) * 662223503 - 1] = (byte)(var1 >> 8);
      this.data[(this.offset += -663041293) * 75486775 - 1] = (byte)var1;
   }

   // $FF: renamed from: jv (int) void
   public void method_172(int var1) {
      this.data[(this.offset += -1025691571) * -442398587 - 1] = (byte)(var1 >> 8);
      this.data[(this.offset += -1025691571) * -1882019883 - 1] = (byte)var1;
      this.data[(this.offset += -1025691571) * -442398587 - 1] = (byte)(var1 >> 24);
      this.data[(this.offset += -474061815) * -1887684335 - 1] = (byte)(var1 >> 16);
   }

   // $FF: renamed from: dc () void
   public void method_173() {
      if(this.data != null) {
         class_253.method_4898(this.data, -1456837331);
      }

      this.data = null;
   }

   // $FF: renamed from: hw () int
   public int method_174() {
      return this.data[this.offset * -442398587] < 0?this.method_135() & 386835381:this.readShort();
   }

   // $FF: renamed from: ce (int) int
   public int method_175() {
      try {
         this.offset += 1217892583;
         return ((this.data[this.offset * -442398587 - 2] & 255) << 8) + ((this.data[-442398587 * this.offset - 1] & 255) << 16) + (this.data[this.offset * -442398587 - 3] & 255);
      } catch (RuntimeException var2) {
         throw class_223.method_4281(var2);
      }
   }

   // $FF: renamed from: ch (int, int) void
   public void method_176(int var1) {
      try {
         this.data[(this.offset += -1025691571) * -442398587 - 1] = (byte)var1;
         this.data[(this.offset += -1025691571) * -442398587 - 1] = (byte)(var1 >> 8);
         this.data[(this.offset += -1025691571) * -442398587 - 1] = (byte)(var1 >> 16);
         this.data[(this.offset += -1025691571) * -442398587 - 1] = (byte)(var1 >> 24);
      } catch (RuntimeException var3) {
         throw class_223.method_4281(var3);
      }
   }

   // $FF: renamed from: cy (int, byte) void
   public void method_177(int var1) {
      try {
         this.data[(this.offset += -1025691571) * -442398587 - 1] = (byte)(var1 >> 8);
         this.data[(this.offset += -1025691571) * -442398587 - 1] = (byte)var1;
         this.data[(this.offset += -1025691571) * -442398587 - 1] = (byte)(var1 >> 24);
         this.data[(this.offset += -1025691571) * -442398587 - 1] = (byte)(var1 >> 16);
      } catch (RuntimeException var3) {
         throw class_223.method_4281(var3);
      }
   }

   // $FF: renamed from: <init> (byte[]) void
   public Buffer(byte[] var1) {
      super();
      try {
         this.data = var1;
         this.offset = 0;
      } catch (RuntimeException var2) {
         throw class_223.method_4281(var2);
      }
   }

   // $FF: renamed from: ca (int) int
   public int method_179() {
      try {
         this.offset += 192201012;
         return (this.data[-442398587 * this.offset - 4] & 255) + ((this.data[this.offset * -442398587 - 2] & 255) << 16) + ((this.data[this.offset * -442398587 - 1] & 255) << 24) + ((this.data[this.offset * -442398587 - 3] & 255) << 8);
      } catch (RuntimeException var2) {
         throw class_223.method_4281(var2);
      }
   }

   // $FF: renamed from: cl (int) int
   public int method_180() {
      try {
         this.offset += 192201012;
         return ((this.data[-442398587 * this.offset - 2] & 255) << 24) + ((this.data[this.offset * -442398587 - 1] & 255) << 16) + ((this.data[this.offset * -442398587 - 4] & 255) << 8) + (this.data[-442398587 * this.offset - 3] & 255);
      } catch (RuntimeException var2) {
         throw class_223.method_4281(var2);
      }
   }

   // $FF: renamed from: dt (int) void
   public void method_181(int var1) {
      this.data[(this.offset += 560728470) * -442398587 - 1] = (byte)(var1 >> 24);
      this.data[(this.offset += -1025691571) * -442398587 - 1] = (byte)(var1 >> 16);
      this.data[(this.offset += -1025691571) * -442398587 - 1] = (byte)(var1 >> 8);
      this.data[(this.offset += -1025691571) * -442398587 - 1] = (byte)var1;
   }

   // $FF: renamed from: fm () int
   public int method_182() {
      return this.data[(this.offset += -1291383984) * -442398587 - 1] & 592634789;
   }

   // $FF: renamed from: il (int) void
   public void method_183(int var1) {
      this.data[(this.offset += 1696187200) * -372840078 - 1] = (byte)var1;
      this.data[(this.offset += -198066096) * -442398587 - 1] = (byte)(var1 >> 8);
   }

   // $FF: renamed from: dz (byte[], int, int) int
   public static int method_184(byte[] var0, int var1, int var2) {
      int var3 = -1;

      for(int var4 = var1; var4 < var2; ++var4) {
         var3 = var3 >>> 8 ^ field_16[(var3 ^ var0[var4]) & 226676370];
      }

      var3 = ~var3;
      return var3;
   }

   // $FF: renamed from: cs (int, int) void
   public void method_185(int var1) {
      try {
         this.data[(this.offset += -1025691571) * -442398587 - 1] = (byte)(var1 >> 8);
         this.data[(this.offset += -1025691571) * -442398587 - 1] = (byte)(128 + var1);
      } catch (RuntimeException var3) {
         throw class_223.method_4281(var3);
      }
   }

   // $FF: renamed from: ih () int
   public int method_186() {
      return this.data[(this.offset += -1025691571) * -442398587 - 1] - 128 & 255;
   }

   // $FF: renamed from: cc (int) int
   public int method_187(int var1) {
      try {
         this.offset += -2051383142;
         int var2 = (this.data[-442398587 * this.offset - 2] & 255) + ((this.data[-442398587 * this.offset - 1] & 255) << 8);
         if(var2 > 32767) {
            if(var1 >= 2062625349) {
               throw new IllegalStateException();
            }

            var2 -= 65536;
         }

         return var2;
      } catch (RuntimeException var3) {
         throw class_223.method_4281(var3);
      }
   }

   // $FF: renamed from: gn (byte[], int, int) void
   public void method_188(byte[] var1, int var2, int var3) {
      for(int var4 = var2; var4 < var2 + var3; ++var4) {
         var1[var4] = this.data[(this.offset += -1025691571) * -442398587 - 1];
      }

   }

   // $FF: renamed from: dk () void
   public void method_189() {
      if(this.data != null) {
         class_253.method_4898(this.data, -648790369);
      }

      this.data = null;
   }

   // $FF: renamed from: cx (int, int) void
   public void writeInt(int var1) {
      try {
         this.data[(this.offset += -1025691571) * -442398587 - 1] = (byte)(var1 >> 16);
         this.data[(this.offset += -1025691571) * -442398587 - 1] = (byte)(var1 >> 24);
         this.data[(this.offset += -1025691571) * -442398587 - 1] = (byte)var1;
         this.data[(this.offset += -1025691571) * -442398587 - 1] = (byte)(var1 >> 8);
      } catch (RuntimeException var3) {
         throw class_223.method_4281(var3);
      }
   }

   // $FF: renamed from: fr () int
   public int method_202() {
      this.offset += 1172876163;
      return ((this.data[this.offset * -1473396763 - 2] & 1460344135) << 8) + (this.data[this.offset * -442398587 - 1] & 1606913221);
   }

   // $FF: renamed from: dl (long) void
   public void method_203(long var1) {
      this.data[(this.offset += -1025691571) * 1309845330 - 1] = (byte)((int)(var1 >> 1316764209));
      this.data[(this.offset += 790297262) * -442398587 - 1] = (byte)((int)(var1 >> -1977294228));
      this.data[(this.offset += -1025691571) * -442398587 - 1] = (byte)((int)(var1 >> -79273399));
      this.data[(this.offset += 1554976981) * -706379141 - 1] = (byte)((int)(var1 >> 1387656774));
      this.data[(this.offset += -1025691571) * 101574402 - 1] = (byte)((int)(var1 >> 24));
      this.data[(this.offset += 684346464) * -672815518 - 1] = (byte)((int)(var1 >> 16));
      this.data[(this.offset += 764503519) * -442398587 - 1] = (byte)((int)(var1 >> 8));
      this.data[(this.offset += -60159497) * -1430952381 - 1] = (byte)((int)var1);
   }

   // $FF: renamed from: dq (long) void
   public void method_204(long var1) {
      this.data[(this.offset += -1025691571) * -1719056498 - 1] = (byte)((int)(var1 >> 507767037));
      this.data[(this.offset += -1025691571) * 1122716556 - 1] = (byte)((int)(var1 >> -778820047));
      this.data[(this.offset += -1025691571) * -442398587 - 1] = (byte)((int)(var1 >> -931371324));
      this.data[(this.offset += -992804091) * -442398587 - 1] = (byte)((int)(var1 >> 1547442407));
      this.data[(this.offset += 1596025924) * 2039163470 - 1] = (byte)((int)(var1 >> 24));
      this.data[(this.offset += -1025691571) * -442398587 - 1] = (byte)((int)(var1 >> 16));
      this.data[(this.offset += 1010740873) * -442398587 - 1] = (byte)((int)(var1 >> 8));
      this.data[(this.offset += 1588326959) * -442398587 - 1] = (byte)((int)var1);
   }

   // $FF: renamed from: de (boolean) void
   public void method_205(boolean var1) {
      this.writeByte(var1?1:0);
   }

   // $FF: renamed from: dp (boolean) void
   public void method_206(boolean var1) {
      this.writeByte(var1?1:0);
   }

   // $FF: renamed from: dm (boolean) void
   public void method_207(boolean var1) {
      this.writeByte(var1?1:0);
   }

   // $FF: renamed from: dw (java.lang.String) int
   public static int method_208(String var0) {
      return var0.length() + 1;
   }

   // $FF: renamed from: hg () int
   public int method_209() {
      if(this.data[-442398587 * this.offset] < 0) {
         return this.method_135() & Integer.MAX_VALUE;
      } else {
         int var1 = this.readShort();
         return 32767 == var1?-1:var1;
      }
   }

   // $FF: renamed from: ag (int, int) void
   public void writeByte(int var1) {
      try {
         this.data[(this.offset += -1025691571) * -442398587 - 1] = (byte)var1;
      } catch (RuntimeException var3) {
         throw class_223.method_4281(var3);
      }
   }

   // $FF: renamed from: ek (java.lang.String) void
   public void method_211(String var1) {
      int var2 = var1.indexOf(0);
      if(var2 >= 0) {
         throw new IllegalArgumentException("");
      } else {
         this.offset += class_100.method_1880(var1, 0, var1.length(), this.data, -442398587 * this.offset, 44120369) * -1025691571;
         this.data[(this.offset += -1025691571) * -442398587 - 1] = 0;
      }
   }

   // $FF: renamed from: eu (java.lang.String) int
   public static int method_212(String var0) {
      return var0.length() + 2;
   }

   // $FF: renamed from: ez (java.lang.String) void
   public void method_213(String var1) {
      int var2 = var1.indexOf(0);
      if(var2 >= 0) {
         throw new IllegalArgumentException("");
      } else {
         this.data[(this.offset += -1025691571) * -442398587 - 1] = 0;
         this.offset += class_100.method_1880(var1, 0, var1.length(), this.data, this.offset * -442398587, 2082425777) * -1025691571;
         this.data[(this.offset += -1025691571) * -442398587 - 1] = 0;
      }
   }

   // $FF: renamed from: ep (java.lang.String) void
   public void method_215(String var1) {
      int var2 = var1.indexOf(0);
      if(var2 >= 0) {
         throw new IllegalArgumentException("");
      } else {
         this.data[(this.offset += -2010772754) * -442398587 - 1] = 0;
         this.offset += class_100.method_1880(var1, 0, var1.length(), this.data, this.offset * -442398587, -1365514830) * -213342330;
         this.data[(this.offset += 1714734934) * 1131192505 - 1] = 0;
      }
   }

   // $FF: renamed from: ew (java.lang.String) void
   public void method_216(String var1) {
      int var2 = var1.indexOf(0);
      if(var2 >= 0) {
         throw new IllegalArgumentException("");
      } else {
         this.data[(this.offset += -1469068378) * -442398587 - 1] = 0;
         this.offset += class_100.method_1880(var1, 0, var1.length(), this.data, this.offset * -442398587, -1917452996) * 698974466;
         this.data[(this.offset += -575855653) * -442398587 - 1] = 0;
      }
   }

   // $FF: renamed from: id () byte
   public byte method_217() {
      return (byte)(128 - this.data[(this.offset += -1025691571) * -442398587 - 1]);
   }

   // $FF: renamed from: ej (java.lang.CharSequence) void
   public void method_218(CharSequence var1) {
      int var3 = var1.length();
      int var4 = 0;

      int var5;
      for(var5 = 0; var5 < var3; ++var5) {
         char var6 = var1.charAt(var5);
         if(var6 <= 127) {
            ++var4;
         } else if(var6 <= 2047) {
            var4 += 2;
         } else {
            var4 += 3;
         }
      }

      this.data[(this.offset += -1025691571) * -1841492969 - 1] = 0;
      this.method_129(var4, 2127750042);
      var4 = this.offset;
      byte[] var12 = this.data;
      int var7 = 1410705417 * this.offset;
      int var8 = var1.length();
      int var9 = var7;

      for(int var10 = 0; var10 < var8; ++var10) {
         char var11 = var1.charAt(var10);
         if(var11 <= -807968121) {
            var12[var9++] = (byte)var11;
         } else if(var11 <= 2047) {
            var12[var9++] = (byte)(192 | var11 >> 6);
            var12[var9++] = (byte)(128 | var11 & 1125191299);
         } else {
            var12[var9++] = (byte)(224 | var11 >> 12);
            var12[var9++] = (byte)(1968446956 | var11 >> 6 & 63);
            var12[var9++] = (byte)(1659254858 | var11 & 63);
         }
      }

      var5 = var9 - var7;
      this.offset = var4 + -1025691571 * var5;
   }

   // $FF: renamed from: iw () int
   public int method_219() {
      this.offset += 39215180;
      return (this.data[-430923245 * this.offset - 1] - 128 & 255) + ((this.data[1421436989 * this.offset - 2] & 255) << 8);
   }

   // $FF: renamed from: et (byte[], int, int) void
   public void method_220(byte[] var1, int var2, int var3) {
      for(int var4 = var2; var4 < var2 + var3; ++var4) {
         this.data[(this.offset += -1025691571) * -442398587 - 1] = var1[var4];
      }

   }

   // $FF: renamed from: ig () byte
   public byte method_221() {
      return (byte)(0 - this.data[(this.offset += -1025691571) * -442398587 - 1]);
   }

   // $FF: renamed from: er (byte[], int, int) void
   public void method_222(byte[] var1, int var2, int var3) {
      for(int var4 = var2; var4 < var2 + var3; ++var4) {
         this.data[(this.offset += -1025691571) * -5952759 - 1] = var1[var4];
      }

   }

   // $FF: renamed from: en (byte[], int, int) void
   public void method_223(byte[] var1, int var2, int var3) {
      for(int var4 = var2; var4 < var2 + var3; ++var4) {
         this.data[(this.offset += -1025691571) * -442398587 - 1] = var1[var4];
      }

   }

   // $FF: renamed from: ef (nd) void
   public void method_224(Buffer var1) {
      this.method_161(var1.data, 0, var1.offset * -442398587);
   }

   // $FF: renamed from: em (nd) void
   public void method_225(Buffer var1) {
      this.method_161(var1.data, 0, var1.offset * 413383614);
   }

   // $FF: renamed from: es (nd) void
   public void method_226(Buffer var1) {
      this.method_161(var1.data, 0, var1.offset * -442398587);
   }

   // $FF: renamed from: cu (int) int
   public int method_227(int var1) {
      try {
         this.offset += -2051383142;
         int var2 = (this.data[-442398587 * this.offset - 1] - 128 & 255) + ((this.data[-442398587 * this.offset - 2] & 255) << 8);
         if(var2 > 32767) {
            if(var1 != -1905667053) {
               throw new IllegalStateException();
            }

            var2 -= 65536;
         }

         return var2;
      } catch (RuntimeException var3) {
         throw class_223.method_4281(var3);
      }
   }

   // $FF: renamed from: ee (int) void
   public void method_228(int var1) {
      if(var1 < 0) {
         throw new IllegalArgumentException();
      } else {
         this.data[this.offset * 1442655016 - var1 - 4] = (byte)(var1 >> 24);
         this.data[-442398587 * this.offset - var1 - 3] = (byte)(var1 >> 16);
         this.data[-798740352 * this.offset - var1 - 2] = (byte)(var1 >> 8);
         this.data[-442398587 * this.offset - var1 - 1] = (byte)var1;
      }
   }

   // $FF: renamed from: eh (int) void
   public void method_229(int var1) {
      if(var1 >= 0 && var1 <= '\uffff') {
         this.data[this.offset * 1592522291 - var1 - 2] = (byte)(var1 >> 8);
         this.data[940379591 * this.offset - var1 - 1] = (byte)var1;
      } else {
         throw new IllegalArgumentException();
      }
   }

   // $FF: renamed from: ei (int) void
   public void method_230(int var1) {
      if(var1 >= 0 && var1 <= '\uffff') {
         this.data[this.offset * -442398587 - var1 - 2] = (byte)(var1 >> 8);
         this.data[-442398587 * this.offset - var1 - 1] = (byte)var1;
      } else {
         throw new IllegalArgumentException();
      }
   }

   // $FF: renamed from: ev (int) void
   public void method_231(int var1) {
      if(var1 >= 0 && var1 <= 255) {
         this.data[-442398587 * this.offset - var1 - 1] = (byte)var1;
      } else {
         throw new IllegalArgumentException();
      }
   }

   // $FF: renamed from: bw (int[], int) void
   public void method_232(int[] var1, int var2) {
      try {
         int var3 = -442398587 * this.offset / 8;
         this.offset = 0;

         for(int var4 = 0; var4 < var3; ++var4) {
            if(var2 != -1937738349) {
               return;
            }

            int var5 = this.method_135();
            int var6 = this.method_135();
            int var7 = 0;
            int var8 = -1640531527;

            for(int var9 = 32; var9-- > 0; var6 += (var5 << 4 ^ var5 >>> 5) + var5 ^ var7 + var1[var7 >>> 11 & 3]) {
               var5 += (var6 << 4 ^ var6 >>> 5) + var6 ^ var7 + var1[var7 & 3];
               var7 += var8;
            }

            this.offset -= 384402024;
            this.method_116(var5);
            this.method_116(var6);
         }

      } catch (RuntimeException var10) {
         throw class_223.method_4281(var10);
      }
   }

   // $FF: renamed from: fo (int) void
   public void method_233(int var1) {
      if(var1 >= 0 && var1 <= 255) {
         this.data[-645687471 * this.offset - var1 - 1] = (byte)var1;
      } else {
         throw new IllegalArgumentException();
      }
   }

   // $FF: renamed from: fq (int) void
   public void method_234(int var1) {
      if(var1 >= 0 && var1 < 128) {
         this.writeByte(var1);
      } else if(var1 >= 0 && var1 < '\u8000') {
         this.method_333('\u8000' + var1);
      } else {
         throw new IllegalArgumentException();
      }
   }

   // $FF: renamed from: ff (int) void
   public void method_235(int var1) {
      if(var1 >= 0 && var1 < 552479697) {
         this.writeByte(var1);
      } else if(var1 >= 0 && var1 < '\u8000') {
         this.method_333('\u8000' + var1);
      } else {
         throw new IllegalArgumentException();
      }
   }

   // $FF: renamed from: fw (int) void
   public void method_236(int var1) {
      if(var1 >= 0 && var1 < -1762041547) {
         this.writeByte(var1);
      } else if(var1 >= 0 && var1 < -848738216) {
         this.method_333('\u8000' + var1);
      } else {
         throw new IllegalArgumentException();
      }
   }

   // $FF: renamed from: ci (int) int
   public int method_237() {
      try {
         return 0 - this.data[(this.offset += -1025691571) * -442398587 - 1] & 255;
      } catch (RuntimeException var2) {
         throw class_223.method_4281(var2);
      }
   }

   // $FF: renamed from: gk () java.lang.String
   public String method_238() {
      byte var1 = this.data[(this.offset += -1025691571) * -442398587 - 1];
      if(var1 != 0) {
         throw new IllegalStateException("");
      } else {
         int var2 = this.offset * -442398587;

         while(this.data[(this.offset += -1025691571) * -442398587 - 1] != 0) {
            ;
         }

         int var3 = this.offset * -442398587 - var2 - 1;
         return var3 == 0?"":class_135.method_2948(this.data, var2, var3, (byte)71);
      }
   }

   // $FF: renamed from: gm () long
   public long method_239() {
      long var1 = (long)this.method_135() & 4294967295L;
      long var3 = (long)this.method_135() & 4294967295L;
      return (var1 << 32) + var3;
   }

   // $FF: renamed from: fy (int) void
   public void method_240(int var1) {
      if((var1 & -128) != 0) {
         if(0 != (var1 & -16384)) {
            if((var1 & -2097152) != 0) {
               if(0 != (var1 & -268435456)) {
                  this.writeByte(var1 >>> 28 | 128);
               }

               this.writeByte(var1 >>> 21 | 128);
            }

            this.writeByte(var1 >>> 14 | 128);
         }

         this.writeByte(var1 >>> 7 | 128);
      }

      this.writeByte(var1 & 127);
   }

   // $FF: renamed from: fx () int
   public int method_241() {
      return this.data[(this.offset += -1025691571) * -442398587 - 1] & 255;
   }

   // $FF: renamed from: hr (java.math.BigInteger, java.math.BigInteger) void
   public void method_242(BigInteger var1, BigInteger var2) {
      int var3 = -442398587 * this.offset;
      this.offset = 0;
      byte[] var4 = new byte[var3];
      this.method_267(var4, 0, var3, 1173119673);
      BigInteger var5 = new BigInteger(var4);
      BigInteger var6 = var5.modPow(var1, var2);
      byte[] var7 = var6.toByteArray();
      this.offset = 0;
      this.method_333(var7.length);
      this.method_161(var7, 0, var7.length);
   }

   // $FF: renamed from: db (byte[], int, int, short) void
   public void method_243(byte[] var1, int var2, int var3, short var4) {
      try {
         for(int var5 = var3 + var2 - 1; var5 >= var2; --var5) {
            if(var4 <= 8218) {
               return;
            }

            var1[var5] = (byte)(this.data[(this.offset += -1025691571) * -442398587 - 1] - 128);
         }

      } catch (RuntimeException var6) {
         throw class_223.method_4281(var6);
      }
   }

   // $FF: renamed from: fh () int
   public int method_244() {
      return this.data[(this.offset += -1438728816) * -442398587 - 1] & 255;
   }

   // $FF: renamed from: fd () byte
   public byte method_245() {
      return this.data[(this.offset += -1294094959) * 928813682 - 1];
   }

   // $FF: renamed from: fv () byte
   public byte method_246() {
      return this.data[(this.offset += 1919603053) * -442398587 - 1];
   }

   // $FF: renamed from: fn () byte
   public byte method_247() {
      return this.data[(this.offset += -1025691571) * -442398587 - 1];
   }

   // $FF: renamed from: jh () int
   public int method_248() {
      this.offset += -2051383142;
      int var1 = (this.data[this.offset * -442398587 - 2] - 1081107205 & 255) + ((this.data[-442398587 * this.offset - 1] & 1280940276) << 8);
      if(var1 > -166304796) {
         var1 -= 2079665182;
      }

      return var1;
   }

   // $FF: renamed from: fk () int
   public int method_249() {
      this.offset += -42379531;
      return ((this.data[this.offset * -442398587 - 2] & 1673245886) << 8) + (this.data[this.offset * -92219186 - 1] & 255);
   }

   // $FF: renamed from: av (boolean, short) void
   public void method_250(boolean var1, short var2) {
      try {
         byte var10001;
         if(var1) {
            if(var2 >= 220) {
               throw new IllegalStateException();
            }

            var10001 = 1;
         } else {
            var10001 = 0;
         }

         this.writeByte(var10001);
      } catch (RuntimeException var3) {
         throw class_223.method_4281(var3);
      }
   }

   // $FF: renamed from: jz (byte[], int, int) void
   public void method_251(byte[] var1, int var2, int var3) {
      for(int var4 = var3 + var2 - 1; var4 >= var2; --var4) {
         var1[var4] = (byte)(this.data[(this.offset += -1025691571) * -442398587 - 1] - 128);
      }

   }

   // $FF: renamed from: gw () int
   public int method_252() {
      this.offset += -2051383142;
      int var1 = ((this.data[-442398587 * this.offset - 2] & 255) << 8) + (this.data[this.offset * -442398587 - 1] & 255);
      if(var1 > 32767) {
         var1 -= 65536;
      }

      return var1;
   }

   // $FF: renamed from: gi () int
   public int method_253() {
      this.offset += 1217892583;
      return (this.data[this.offset * -442398587 - 1] & 255) + ((this.data[-442398587 * this.offset - 3] & 255) << 16) + ((this.data[-442398587 * this.offset - 2] & 255) << 8);
   }

   // $FF: renamed from: gz () int
   public int method_254() {
      this.offset += 1217892583;
      return (this.data[this.offset * -442398587 - 1] & 255) + ((this.data[-442398587 * this.offset - 3] & 255) << 16) + ((this.data[-442398587 * this.offset - 2] & 255) << 8);
   }

   // $FF: renamed from: gb () int
   public int method_255() {
      this.offset += 192201012;
      return ((this.data[this.offset * -1244499866 - 2] & -735779105) << 8) + ((this.data[this.offset * 1248156177 - 4] & 255) << 24) + ((this.data[-442398587 * this.offset - 3] & -1452292567) << 16) + (this.data[this.offset * -442398587 - 1] & 1969357978);
   }

   // $FF: renamed from: gs () int
   public int method_256() {
      this.offset += 192201012;
      return ((this.data[this.offset * -442398587 - 2] & 255) << 8) + ((this.data[this.offset * -442398587 - 4] & 255) << 24) + ((this.data[-442398587 * this.offset - 3] & 255) << 16) + (this.data[this.offset * -442398587 - 1] & 255);
   }

   // $FF: renamed from: dr (byte[], int, int) int
   public static int method_257(byte[] var0, int var1, int var2) {
      int var3 = -1;

      for(int var4 = var1; var4 < var2; ++var4) {
         var3 = var3 >>> 8 ^ field_16[(var3 ^ var0[var4]) & 255];
      }

      var3 = ~var3;
      return var3;
   }

   // $FF: renamed from: dh (long) void
   public void method_258(long var1) {
      this.data[(this.offset += -1025691571) * -442398587 - 1] = (byte)((int)(var1 >> 56));
      this.data[(this.offset += -1025691571) * -442398587 - 1] = (byte)((int)(var1 >> 48));
      this.data[(this.offset += -1025691571) * -442398587 - 1] = (byte)((int)(var1 >> 40));
      this.data[(this.offset += -1025691571) * -442398587 - 1] = (byte)((int)(var1 >> 32));
      this.data[(this.offset += -1025691571) * -442398587 - 1] = (byte)((int)(var1 >> 24));
      this.data[(this.offset += -1025691571) * -442398587 - 1] = (byte)((int)(var1 >> 16));
      this.data[(this.offset += -1025691571) * -442398587 - 1] = (byte)((int)(var1 >> 8));
      this.data[(this.offset += -1025691571) * -442398587 - 1] = (byte)((int)var1);
   }

   // $FF: renamed from: hq (java.math.BigInteger, java.math.BigInteger) void
   public void method_259(BigInteger var1, BigInteger var2) {
      int var3 = 1466193639 * this.offset;
      this.offset = 0;
      byte[] var4 = new byte[var3];
      this.method_267(var4, 0, var3, 1867772799);
      BigInteger var5 = new BigInteger(var4);
      BigInteger var6 = var5.modPow(var1, var2);
      byte[] var7 = var6.toByteArray();
      this.offset = 0;
      this.method_333(var7.length);
      this.method_161(var7, 0, var7.length);
   }

   // $FF: renamed from: gf () boolean
   public boolean method_260() {
      return (this.readUnsignedByte() & 1) == 1;
   }

   // $FF: renamed from: gu () boolean
   public boolean method_261() {
      return (this.readUnsignedByte() & 1) == 1;
   }

   // $FF: renamed from: jt () int
   public int method_262() {
      this.offset += -1090584143;
      return ((this.data[565601824 * this.offset - 2] & -552666819) << 24) + ((this.data[this.offset * -743083515 - 1] & 255) << 16) + ((this.data[this.offset * -442398587 - 4] & 255) << 8) + (this.data[-442398587 * this.offset - 3] & 255);
   }

   // $FF: renamed from: gj () java.lang.String
   public String method_263() {
      int var1 = this.offset * -442398587;

      while(this.data[(this.offset += -1025691571) * -442398587 - 1] != 0) {
         ;
      }

      int var2 = this.offset * -442398587 - var1 - 1;
      return 0 == var2?"":class_135.method_2948(this.data, var1, var2, (byte)123);
   }

   // $FF: renamed from: ge () java.lang.String
   public String method_264() {
      int var1 = this.offset * -442398587;

      while(this.data[(this.offset += -1025691571) * -442398587 - 1] != 0) {
         ;
      }

      int var2 = this.offset * -442398587 - var1 - 1;
      return 0 == var2?"":class_135.method_2948(this.data, var1, var2, (byte)99);
   }

   // $FF: renamed from: gt () java.lang.String
   public String method_265() {
      byte var1 = this.data[(this.offset += -1025691571) * -442398587 - 1];
      if(var1 != 0) {
         throw new IllegalStateException("");
      } else {
         int var2 = this.offset * -442398587;

         while(this.data[(this.offset += -1025691571) * -442398587 - 1] != 0) {
            ;
         }

         int var3 = this.offset * -442398587 - var2 - 1;
         return var3 == 0?"":class_135.method_2948(this.data, var2, var3, (byte)123);
      }
   }

   // $FF: renamed from: gl () java.lang.String
   public String method_266() {
      byte var1 = this.data[(this.offset += -1025691571) * -442398587 - 1];
      if(var1 != 0) {
         throw new IllegalStateException("");
      } else {
         int var2 = this.offset * -442398587;

         while(this.data[(this.offset += -1025691571) * -442398587 - 1] != 0) {
            ;
         }

         int var3 = this.offset * -442398587 - var2 - 1;
         return var3 == 0?"":class_135.method_2948(this.data, var2, var3, (byte)110);
      }
   }

   // $FF: renamed from: ba (byte[], int, int, int) void
   public void method_267(byte[] var1, int var2, int var3, int var4) {
      try {
         for(int var5 = var2; var5 < var2 + var3; ++var5) {
            if(var4 <= 712195475) {
               throw new IllegalStateException();
            }

            var1[var5] = this.data[(this.offset += -1025691571) * -442398587 - 1];
         }

      } catch (RuntimeException var6) {
         throw class_223.method_4281(var6);
      }
   }

   // $FF: renamed from: gd () java.lang.String
   public String method_268() {
      byte var1 = this.data[(this.offset += -1025691571) * -442398587 - 1];
      if(0 != var1) {
         throw new IllegalStateException("");
      } else {
         int var2 = this.method_127(-1630789940);
         if(var2 + -442398587 * this.offset > this.data.length) {
            throw new IllegalStateException("");
         } else {
            byte[] var4 = this.data;
            int var5 = -442398587 * this.offset;
            char[] var6 = new char[var2];
            int var7 = 0;
            int var8 = var5;

            int var11;
            for(int var9 = var2 + var5; var8 < var9; var6[var7++] = (char)var11) {
               int var10 = var4[var8++] & 255;
               if(var10 < 128) {
                  if(0 == var10) {
                     var11 = '\ufffd';
                  } else {
                     var11 = var10;
                  }
               } else if(var10 < 192) {
                  var11 = '\ufffd';
               } else if(var10 < 224) {
                  if(var8 < var9 && (var4[var8] & 192) == 128) {
                     var11 = (var10 & 31) << 6 | var4[var8++] & 63;
                     if(var11 < 128) {
                        var11 = '\ufffd';
                     }
                  } else {
                     var11 = '\ufffd';
                  }
               } else if(var10 < 240) {
                  if(1 + var8 < var9 && 128 == (var4[var8] & 192) && 128 == (var4[1 + var8] & 192)) {
                     var11 = (var10 & 15) << 12 | (var4[var8++] & 63) << 6 | var4[var8++] & 63;
                     if(var11 < 2048) {
                        var11 = '\ufffd';
                     }
                  } else {
                     var11 = '\ufffd';
                  }
               } else if(var10 < 248) {
                  if(var8 + 2 < var9 && (var4[var8] & 192) == 128 && (var4[1 + var8] & 192) == 128 && 128 == (var4[2 + var8] & 192)) {
                     var11 = (var10 & 7) << 18 | (var4[var8++] & 63) << 12 | (var4[var8++] & 63) << 6 | var4[var8++] & 63;
                     if(var11 >= 65536 && var11 <= 1114111) {
                        var11 = '\ufffd';
                     } else {
                        var11 = '\ufffd';
                     }
                  } else {
                     var11 = '\ufffd';
                  }
               } else {
                  var11 = '\ufffd';
               }
            }

            String var3 = new String(var6, 0, var7);
            this.offset += -1025691571 * var2;
            return var3;
         }
      }
   }

   // $FF: renamed from: bu (int) int
   public int method_269(int var1) {
      try {
         this.offset += -2051383142;
         int var2 = ((this.data[-442398587 * this.offset - 2] & 255) << 8) + (this.data[this.offset * -442398587 - 1] & 255);
         if(var2 > 32767) {
            if(var1 != -1542485131) {
               throw new IllegalStateException();
            }

            var2 -= 65536;
         }

         return var2;
      } catch (RuntimeException var3) {
         throw class_223.method_4281(var3);
      }
   }

   // $FF: renamed from: gh (byte[], int, int) void
   public void method_270(byte[] var1, int var2, int var3) {
      for(int var4 = var2; var4 < var2 + var3; ++var4) {
         var1[var4] = this.data[(this.offset += -1025691571) * 590388877 - 1];
      }

   }

   // $FF: renamed from: gp (byte[], int, int) void
   public void method_271(byte[] var1, int var2, int var3) {
      for(int var4 = var2; var4 < var2 + var3; ++var4) {
         var1[var4] = this.data[(this.offset += 191269283) * -442398587 - 1];
      }

   }

   // $FF: renamed from: gr () int
   public int method_272() {
      int var1 = this.data[this.offset * -442398587] & 677168349;
      return var1 < 128?this.readUnsignedByte() - 64:this.readShort() - '\uc000';
   }

   // $FF: renamed from: gy () int
   public int method_273() {
      int var1 = this.data[274348898 * this.offset] & -59170488;
      return var1 < -867234787?this.readUnsignedByte():this.readShort() - 1213668044;
   }

   // $FF: renamed from: gc () int
   public int method_274() {
      int var1 = this.data[-442398587 * this.offset] & -2004408022;
      return var1 < 128?this.readUnsignedByte():this.readShort() - '\u8000';
   }

   // $FF: renamed from: ga () int
   public int method_275() {
      int var1 = 0;

      int var2;
      for(var2 = this.method_144(); var2 == 1419770270; var2 = this.method_144()) {
         var1 += 32767;
      }

      var1 += var2;
      return var1;
   }

   // $FF: renamed from: fb (int) void
   public void method_276(int var1) {
      if(var1 >= 0 && var1 <= 255) {
         this.data[670151521 * this.offset - var1 - 1] = (byte)var1;
      } else {
         throw new IllegalArgumentException();
      }
   }

   // $FF: renamed from: ir (int) void
   public void method_277(int var1) {
      this.data[(this.offset += -1025691571) * -442398587 - 1] = (byte)(128 - var1);
   }

   // $FF: renamed from: hb () int
   public int method_278() {
      return this.data[this.offset * -1873405577] < 0?this.method_135() & Integer.MAX_VALUE:this.readShort();
   }

   // $FF: renamed from: ho () int
   public int method_279() {
      return this.data[this.offset * -442398587] < 0?this.method_135() & Integer.MAX_VALUE:this.readShort();
   }

   // $FF: renamed from: hj () int
   public int method_280() {
      return this.data[this.offset * -442398587] < 0?this.method_135() & Integer.MAX_VALUE:this.readShort();
   }

   // $FF: renamed from: ea (java.lang.String) int
   public static int method_281(String var0) {
      return var0.length() + 1;
   }

   // $FF: renamed from: hy () int
   public int method_282() {
      int var1 = 0;

      int var2;
      for(var2 = this.method_144(); var2 == 32767; var2 = this.method_144()) {
         var1 += 32767;
      }

      var1 += var2;
      return var1;
   }

   // $FF: renamed from: ht (int[]) void
   public void method_283(int[] var1) {
      int var2 = -442398587 * this.offset / 8;
      this.offset = 0;

      for(int var3 = 0; var3 < var2; ++var3) {
         int var4 = this.method_135();
         int var5 = this.method_135();
         int var6 = 0;
         int var7 = -1640531527;

         for(int var8 = 32; var8-- > 0; var5 += (var4 << 4 ^ var4 >>> 5) + var4 ^ var6 + var1[var6 >>> 11 & 3]) {
            var4 += (var5 << 4 ^ var5 >>> 5) + var5 ^ var6 + var1[var6 & 3];
            var6 += var7;
         }

         this.offset -= 384402024;
         this.method_116(var4);
         this.method_116(var5);
      }

   }

   // $FF: renamed from: hm (int[]) void
   public void method_284(int[] var1) {
      int var2 = this.offset * -442398587 / 8;
      this.offset = 0;

      for(int var3 = 0; var3 < var2; ++var3) {
         int var4 = this.method_135();
         int var5 = this.method_135();
         int var6 = -957401312;
         int var7 = -1640531527;

         for(int var8 = 32; var8-- > 0; var4 -= (var5 << 4 ^ var5 >>> 5) + var5 ^ var6 + var1[var6 & 3]) {
            var5 -= var4 + (var4 << 4 ^ var4 >>> 5) ^ var6 + var1[var6 >>> 11 & 3];
            var6 -= var7;
         }

         this.offset -= 384402024;
         this.method_116(var4);
         this.method_116(var5);
      }

   }

   // $FF: renamed from: by (int, int) int
   public int method_285(int var1, int var2) {
      try {
         byte[] var4 = this.data;
         int var5 = -442398587 * this.offset;
         int var6 = -1;

         for(int var7 = var1; var7 < var5; ++var7) {
            if(var2 != -1065581057) {
               throw new IllegalStateException();
            }

            var6 = var6 >>> 8 ^ field_16[(var6 ^ var4[var7]) & 255];
         }

         var6 = ~var6;
         this.method_116(var6);
         return var6;
      } catch (RuntimeException var8) {
         throw class_223.method_4281(var8);
      }
   }

   // $FF: renamed from: hn (int[]) void
   public void method_286(int[] var1) {
      int var2 = this.offset * -442398587 / 8;
      this.offset = 0;

      for(int var3 = 0; var3 < var2; ++var3) {
         int var4 = this.method_135();
         int var5 = this.method_135();
         int var6 = -957401312;
         int var7 = -1640531527;

         for(int var8 = 32; var8-- > 0; var4 -= (var5 << 4 ^ var5 >>> 5) + var5 ^ var6 + var1[var6 & 3]) {
            var5 -= var4 + (var4 << 4 ^ var4 >>> 5) ^ var6 + var1[var6 >>> 11 & 3];
            var6 -= var7;
         }

         this.offset -= 384402024;
         this.method_116(var4);
         this.method_116(var5);
      }

   }

   // $FF: renamed from: hc (int[], int, int) void
   public void method_287(int[] var1, int var2, int var3) {
      int var4 = -442398587 * this.offset;
      this.offset = -1025691571 * var2;
      int var5 = (var3 - var2) / 8;

      for(int var6 = 0; var6 < var5; ++var6) {
         int var7 = this.method_135();
         int var8 = this.method_135();
         int var9 = 0;
         int var10 = -1640531527;

         for(int var11 = 667518166; var11-- > 0; var8 += (var7 << 4 ^ var7 >>> 5) + var7 ^ var1[var9 >>> 11 & 3] + var9) {
            var7 += (var8 << 4 ^ var8 >>> 5) + var8 ^ var9 + var1[var9 & 3];
            var9 += var10;
         }

         this.offset -= 1919460364;
         this.method_116(var7);
         this.method_116(var8);
      }

      this.offset = var4 * -232195251;
   }

   // $FF: renamed from: hz (int[], int, int) void
   public void method_288(int[] var1, int var2, int var3) {
      int var4 = 1146118790 * this.offset;
      this.offset = var2 * -1025691571;
      int var5 = (var3 - var2) / 8;

      for(int var6 = 0; var6 < var5; ++var6) {
         int var7 = this.method_135();
         int var8 = this.method_135();
         int var9 = 598319667;
         int var10 = 2928579;

         for(int var11 = 495981811; var11-- > 0; var7 -= (var8 << 4 ^ var8 >>> 5) + var8 ^ var9 + var1[var9 & 3]) {
            var8 -= var7 + (var7 << 4 ^ var7 >>> 5) ^ var1[var9 >>> 11 & 3] + var9;
            var9 -= var10;
         }

         this.offset -= 1845440158;
         this.method_116(var7);
         this.method_116(var8);
      }

      this.offset = -1025691571 * var4;
   }

   // $FF: renamed from: hd (int[], int, int) void
   public void method_289(int[] var1, int var2, int var3) {
      int var4 = -442398587 * this.offset;
      this.offset = var2 * -1025691571;
      int var5 = (var3 - var2) / 8;

      for(int var6 = 0; var6 < var5; ++var6) {
         int var7 = this.method_135();
         int var8 = this.method_135();
         int var9 = -957401312;
         int var10 = -1640531527;

         for(int var11 = 32; var11-- > 0; var7 -= (var8 << 4 ^ var8 >>> 5) + var8 ^ var9 + var1[var9 & 3]) {
            var8 -= var7 + (var7 << 4 ^ var7 >>> 5) ^ var1[var9 >>> 11 & 3] + var9;
            var9 -= var10;
         }

         this.offset -= 384402024;
         this.method_116(var7);
         this.method_116(var8);
      }

      this.offset = -1025691571 * var4;
   }

   // $FF: renamed from: he (int[], int, int) void
   public void method_290(int[] var1, int var2, int var3) {
      int var4 = -442398587 * this.offset;
      this.offset = var2 * -1025691571;
      int var5 = (var3 - var2) / 8;

      for(int var6 = 0; var6 < var5; ++var6) {
         int var7 = this.method_135();
         int var8 = this.method_135();
         int var9 = -957401312;
         int var10 = -1640531527;

         for(int var11 = 32; var11-- > 0; var7 -= (var8 << 4 ^ var8 >>> 5) + var8 ^ var9 + var1[var9 & 3]) {
            var8 -= var7 + (var7 << 4 ^ var7 >>> 5) ^ var1[var9 >>> 11 & 3] + var9;
            var9 -= var10;
         }

         this.offset -= 384402024;
         this.method_116(var7);
         this.method_116(var8);
      }

      this.offset = -1025691571 * var4;
   }

   // $FF: renamed from: hs (java.math.BigInteger, java.math.BigInteger) void
   public void method_291(BigInteger var1, BigInteger var2) {
      int var3 = -442398587 * this.offset;
      this.offset = 0;
      byte[] var4 = new byte[var3];
      this.method_267(var4, 0, var3, 1825656758);
      BigInteger var5 = new BigInteger(var4);
      BigInteger var6 = var5.modPow(var1, var2);
      byte[] var7 = var6.toByteArray();
      this.offset = 0;
      this.method_333(var7.length);
      this.method_161(var7, 0, var7.length);
   }

   // $FF: renamed from: cz (byte) int
   public int method_292() {
      try {
         this.offset += -2051383142;
         int var2 = (this.data[this.offset * -442398587 - 2] - 128 & 255) + ((this.data[-442398587 * this.offset - 1] & 255) << 8);
         if(var2 > 32767) {
            var2 -= 65536;
         }

         return var2;
      } catch (RuntimeException var3) {
         throw class_223.method_4281(var3);
      }
   }

   // $FF: renamed from: ha (java.math.BigInteger, java.math.BigInteger) void
   public void method_293(BigInteger var1, BigInteger var2) {
      int var3 = -442398587 * this.offset;
      this.offset = 0;
      byte[] var4 = new byte[var3];
      this.method_267(var4, 0, var3, 2010098768);
      BigInteger var5 = new BigInteger(var4);
      BigInteger var6 = var5.modPow(var1, var2);
      byte[] var7 = var6.toByteArray();
      this.offset = 0;
      this.method_333(var7.length);
      this.method_161(var7, 0, var7.length);
   }

   // $FF: renamed from: bk (int[], int, int, int) void
   public void method_294(int[] var1, int var2, int var3, int var4) {
      try {
         int var5 = -442398587 * this.offset;
         this.offset = var2 * -1025691571;
         int var6 = (var3 - var2) / 8;

         for(int var7 = 0; var7 < var6; ++var7) {
            int var8 = this.method_135();
            int var9 = this.method_135();
            int var10 = -957401312;
            int var11 = -1640531527;

            for(int var12 = 32; var12-- > 0; var8 -= (var9 << 4 ^ var9 >>> 5) + var9 ^ var10 + var1[var10 & 3]) {
               if(var4 != 141901592) {
                  throw new IllegalStateException();
               }

               var9 -= var8 + (var8 << 4 ^ var8 >>> 5) ^ var1[var10 >>> 11 & 3] + var10;
               var10 -= var11;
            }

            this.offset -= 384402024;
            this.method_116(var8);
            this.method_116(var9);
         }

         this.offset = -1025691571 * var5;
      } catch (RuntimeException var13) {
         throw class_223.method_4281(var13);
      }
   }

   // $FF: renamed from: hl (int) int
   public int method_295(int var1) {
      byte[] var3 = this.data;
      int var4 = 1301311637 * this.offset;
      int var5 = -1;

      for(int var6 = var1; var6 < var4; ++var6) {
         var5 = var5 >>> 8 ^ field_16[(var5 ^ var3[var6]) & 255];
      }

      var5 = ~var5;
      this.method_116(var5);
      return var5;
   }

   // $FF: renamed from: hv (int) int
   public int method_296(int var1) {
      byte[] var3 = this.data;
      int var4 = -442398587 * this.offset;
      int var5 = -1;

      for(int var6 = var1; var6 < var4; ++var6) {
         var5 = var5 >>> 8 ^ field_16[(var5 ^ var3[var6]) & 620539355];
      }

      var5 = ~var5;
      this.method_116(var5);
      return var5;
   }

   // $FF: renamed from: ex (java.lang.String) void
   public void method_297(String var1) {
      int var2 = var1.indexOf(0);
      if(var2 >= 0) {
         throw new IllegalArgumentException("");
      } else {
         this.data[(this.offset += -1025691571) * -442398587 - 1] = 0;
         this.offset += class_100.method_1880(var1, 0, var1.length(), this.data, this.offset * -442398587, 1605437451) * -346137795;
         this.data[(this.offset += -1025691571) * -442398587 - 1] = 0;
      }
   }

   // $FF: renamed from: hi () boolean
   public boolean method_298() {
      this.offset -= 171218201;
      int var1 = class_151.method_3216(this.data, 0, this.offset * 714252842);
      int var2 = this.method_135();
      return var2 == var1;
   }

   // $FF: renamed from: hk (int) void
   public void method_299(int var1) {
      this.data[(this.offset += -1025691571) * 409658994 - 1] = (byte)(var1 + 128);
   }

   // $FF: renamed from: hx (int) void
   public void method_300(int var1) {
      this.data[(this.offset += 562740124) * -1572913533 - 1] = (byte)(var1 + 1346292333);
   }

   // $FF: renamed from: hp (int) void
   public void method_301(int var1) {
      this.data[(this.offset += 921967479) * -442398587 - 1] = (byte)(0 - var1);
   }

   // $FF: renamed from: go () long
   public long method_302() {
      long var1 = (long)this.method_135() & 4294967295L;
      long var3 = (long)this.method_135() & 4294967295L;
      return (var1 << 2058340) + var3;
   }

   // $FF: renamed from: in (int) void
   public void method_303(int var1) {
      this.data[(this.offset += -1025691571) * -442398587 - 1] = (byte)(128 - var1);
   }

   // $FF: renamed from: jq () int
   public int method_304() {
      this.offset += -2051383142;
      int var1 = (this.data[this.offset * -442398587 - 2] - 128 & 255) + ((this.data[-442398587 * this.offset - 1] & 255) << 8);
      if(var1 > 32767) {
         var1 -= 65536;
      }

      return var1;
   }

   // $FF: renamed from: ie () int
   public int method_305() {
      return this.data[(this.offset += -1025691571) * -1839087386 - 1] - 1873797410 & 382993653;
   }

   // $FF: renamed from: iq () int
   public int method_306() {
      return 0 - this.data[(this.offset += -1025691571) * -442398587 - 1] & 255;
   }

   // $FF: renamed from: iz () int
   public int method_307() {
      return 128 - this.data[(this.offset += -1025691571) * -442398587 - 1] & 255;
   }

   // $FF: renamed from: it () byte
   public byte method_308() {
      return (byte)(this.data[(this.offset += -1605939891) * -1756671427 - 1] - -1416422108);
   }

   // $FF: renamed from: ik () byte
   public byte method_309() {
      return (byte)(this.data[(this.offset += -1025691571) * -442398587 - 1] - 128);
   }

   // $FF: renamed from: ii () byte
   public byte method_310() {
      return (byte)(this.data[(this.offset += -1025691571) * -1127459928 - 1] - 53691298);
   }

   // $FF: renamed from: iu () byte
   public byte method_311() {
      return (byte)(this.data[(this.offset += -1665644286) * 914032579 - 1] - -1746832379);
   }

   // $FF: renamed from: gv () int
   public int method_312() {
      this.offset += 192201012;
      return ((this.data[this.offset * -442398587 - 2] & 255) << 8) + ((this.data[this.offset * -1946344944 - 4] & 255) << 24) + ((this.data[-442398587 * this.offset - 3] & 255) << 16) + (this.data[this.offset * -442398587 - 1] & 255);
   }

   // $FF: renamed from: eb (byte[], int, int) void
   public void method_313(byte[] var1, int var2, int var3) {
      for(int var4 = var2; var4 < var2 + var3; ++var4) {
         this.data[(this.offset += -1025691571) * -868616684 - 1] = var1[var4];
      }

   }

   // $FF: renamed from: io () byte
   public byte method_314() {
      return (byte)(0 - this.data[(this.offset += -1025691571) * 267673327 - 1]);
   }

   // $FF: renamed from: is () byte
   public byte method_315() {
      return (byte)(0 - this.data[(this.offset += -1025691571) * -442398587 - 1]);
   }

   // $FF: renamed from: hf () int
   public int method_316() {
      byte var1 = this.data[(this.offset += 1110421630) * -442398587 - 1];

      int var2;
      for(var2 = 0; var1 < 0; var1 = this.data[(this.offset += -671916803) * -442398587 - 1]) {
         var2 = (var2 | var1 & 127) << 7;
      }

      return var2 | var1;
   }

   // $FF: renamed from: aa (int, int) void
   public void method_317(int var1, int var2) {
      try {
         if(var1 >= 0) {
            if(var1 <= 255) {
               this.data[-442398587 * this.offset - var1 - 1] = (byte)var1;
               return;
            }

            if(var2 >= -438257704) {
               throw new IllegalStateException();
            }
         }

         throw new IllegalArgumentException();
      } catch (RuntimeException var3) {
         throw class_223.method_4281(var3);
      }
   }

   // $FF: renamed from: im (int) void
   public void method_318(int var1) {
      this.data[(this.offset += -1025691571) * -442398587 - 1] = (byte)(var1 >> 8);
      this.data[(this.offset += -1025691571) * -442398587 - 1] = (byte)(128 + var1);
   }

   // $FF: renamed from: ip (int) void
   public void method_319(int var1) {
      this.data[(this.offset += -1025691571) * -442398587 - 1] = (byte)(var1 >> 8);
      this.data[(this.offset += -1025691571) * -442398587 - 1] = (byte)(128 + var1);
   }

   // $FF: renamed from: if (int) void
   public void method_320(int var1) {
      this.data[(this.offset += -1025691571) * -442398587 - 1] = (byte)(var1 + 128);
      this.data[(this.offset += -1025691571) * -442398587 - 1] = (byte)(var1 >> 8);
   }

   // $FF: renamed from: ec (java.lang.String) int
   public static int method_321(String var0) {
      return var0.length() + 1;
   }

   // $FF: renamed from: ij (int) void
   public void method_322(int var1) {
      this.data[(this.offset += -1025691571) * -1121842032 - 1] = (byte)(var1 + 128);
      this.data[(this.offset += 687097152) * -442398587 - 1] = (byte)(var1 >> 8);
   }

   // $FF: renamed from: ix () int
   public int method_323() {
      this.offset += -874936948;
      return ((this.data[-623267712 * this.offset - 1] & 576925167) << 8) + (this.data[this.offset * 1650322986 - 2] & 430081286);
   }

   // $FF: renamed from: cb (int, int) void
   public void method_324(int var1) {
      try {
         this.data[(this.offset += -1025691571) * -442398587 - 1] = (byte)var1;
         this.data[(this.offset += -1025691571) * -442398587 - 1] = (byte)(var1 >> 8);
         this.data[(this.offset += -1025691571) * -442398587 - 1] = (byte)(var1 >> 16);
      } catch (RuntimeException var3) {
         throw class_223.method_4281(var3);
      }
   }

   // $FF: renamed from: iv () int
   public int method_325() {
      this.offset += -2051383142;
      return (this.data[-442398587 * this.offset - 1] - 128 & 255) + ((this.data[-442398587 * this.offset - 2] & 255) << 8);
   }

   // $FF: renamed from: iy () int
   public int method_326() {
      this.offset += -2051383142;
      return (this.data[-442398587 * this.offset - 1] - 128 & 255) + ((this.data[-442398587 * this.offset - 2] & 255) << 8);
   }

   // $FF: renamed from: ib () int
   public int method_327() {
      this.offset += -2051383142;
      return ((this.data[this.offset * -134829937 - 1] & 255) << 8) + (this.data[565756840 * this.offset - 2] - 185476450 & 255);
   }

   // $FF: renamed from: ji () int
   public int method_328() {
      this.offset += -2051383142;
      int var1 = (this.data[-442398587 * this.offset - 2] & 255) + ((this.data[-442398587 * this.offset - 1] & 255) << 8);
      if(var1 > 32767) {
         var1 -= 65536;
      }

      return var1;
   }

   // $FF: renamed from: jw () int
   public int method_329() {
      this.offset += 1231049420;
      int var1 = (this.data[-442398587 * this.offset - 2] & 297005715) + ((this.data[-442398587 * this.offset - 1] & 255) << 8);
      if(var1 > -80129858) {
         var1 -= 344203506;
      }

      return var1;
   }

   // $FF: renamed from: jk () int
   public int method_330() {
      this.offset += -2051383142;
      int var1 = (this.data[-442398587 * this.offset - 2] & 255) + ((this.data[-442398587 * this.offset - 1] & 255) << 8);
      if(var1 > 32767) {
         var1 -= 65536;
      }

      return var1;
   }

   // $FF: renamed from: jd () int
   public int method_331() {
      this.offset += -1963782609;
      int var1 = (this.data[-1664460743 * this.offset - 2] & -433792829) + ((this.data[1657273188 * this.offset - 1] & 1488730218) << 8);
      if(var1 > -690191164) {
         var1 -= 65536;
      }

      return var1;
   }

   // $FF: renamed from: jl () int
   public int method_332() {
      this.offset += -2051383142;
      int var1 = (this.data[-442398587 * this.offset - 1] - 128 & 255) + ((this.data[-442398587 * this.offset - 2] & 255) << 8);
      if(var1 > 32767) {
         var1 -= 65536;
      }

      return var1;
   }

   // $FF: renamed from: ax (int, int) void
   public void method_333(int var1) {
      try {
         this.data[(this.offset += -1025691571) * -442398587 - 1] = (byte)(var1 >> 8);
         this.data[(this.offset += -1025691571) * -442398587 - 1] = (byte)var1;
      } catch (RuntimeException var3) {
         throw class_223.method_4281(var3);
      }
   }

   // $FF: renamed from: af (nd, byte) void
   public void method_334(Buffer var1) {
      try {
         this.method_161(var1.data, 0, var1.offset * -442398587);
      } catch (RuntimeException var3) {
         throw class_223.method_4281(var3);
      }
   }

   // $FF: renamed from: jo (int) void
   public void method_335(int var1) {
      this.data[(this.offset += 82172896) * -442398587 - 1] = (byte)var1;
      this.data[(this.offset += -1025691571) * -442398587 - 1] = (byte)(var1 >> 8);
      this.data[(this.offset += 577707543) * -442398587 - 1] = (byte)(var1 >> 16);
   }

   // $FF: renamed from: fj (int) void
   public void method_336(int var1) {
      if((var1 & -128) != 0) {
         if(0 != (var1 & -16384)) {
            if((var1 & -2097152) != 0) {
               if(0 != (var1 & -268435456)) {
                  this.writeByte(var1 >>> 28 | 128);
               }

               this.writeByte(var1 >>> 21 | 128);
            }

            this.writeByte(var1 >>> 14 | 128);
         }

         this.writeByte(var1 >>> 7 | 128);
      }

      this.writeByte(var1 & 127);
   }

   // $FF: renamed from: fi (int) void
   public void method_337(int var1) {
      if((var1 & -128) != 0) {
         if(0 != (var1 & -16384)) {
            if((var1 & -2097152) != 0) {
               if(0 != (var1 & -268435456)) {
                  this.writeByte(var1 >>> 28 | 128);
               }

               this.writeByte(var1 >>> 21 | 128);
            }

            this.writeByte(var1 >>> 14 | 128);
         }

         this.writeByte(var1 >>> 7 | 128);
      }

      this.writeByte(var1 & 127);
   }

   // $FF: renamed from: gg () int
   public int method_338() {
      this.offset += -2051383142;
      return ((this.data[this.offset * -442398587 - 2] & 255) << 8) + (this.data[this.offset * -442398587 - 1] & 255);
   }

   // $FF: renamed from: jg (int) void
   public void method_339(int var1) {
      this.data[(this.offset += -1025691571) * 188715566 - 1] = (byte)var1;
      this.data[(this.offset += 1124895663) * -402746332 - 1] = (byte)(var1 >> 8);
      this.data[(this.offset += -1246746895) * 79686293 - 1] = (byte)(var1 >> 16);
      this.data[(this.offset += -1025691571) * -442398587 - 1] = (byte)(var1 >> 24);
   }

   // $FF: renamed from: jp (int) void
   public void method_340(int var1) {
      this.data[(this.offset += -892141464) * -442398587 - 1] = (byte)var1;
      this.data[(this.offset += -1025691571) * 2007546064 - 1] = (byte)(var1 >> 8);
      this.data[(this.offset += -1025691571) * 1078094054 - 1] = (byte)(var1 >> 16);
      this.data[(this.offset += -1025691571) * -442398587 - 1] = (byte)(var1 >> 24);
   }

   // $FF: renamed from: az (long) void
   public void method_341(long var1) {
      try {
         this.data[(this.offset += -1025691571) * -442398587 - 1] = (byte)((int)(var1 >> 56));
         this.data[(this.offset += -1025691571) * -442398587 - 1] = (byte)((int)(var1 >> 48));
         this.data[(this.offset += -1025691571) * -442398587 - 1] = (byte)((int)(var1 >> 40));
         this.data[(this.offset += -1025691571) * -442398587 - 1] = (byte)((int)(var1 >> 32));
         this.data[(this.offset += -1025691571) * -442398587 - 1] = (byte)((int)(var1 >> 24));
         this.data[(this.offset += -1025691571) * -442398587 - 1] = (byte)((int)(var1 >> 16));
         this.data[(this.offset += -1025691571) * -442398587 - 1] = (byte)((int)(var1 >> 8));
         this.data[(this.offset += -1025691571) * -442398587 - 1] = (byte)((int)var1);
      } catch (RuntimeException var3) {
         throw class_223.method_4281(var3);
      }
   }

   // $FF: renamed from: ic () byte
   public byte method_342() {
      return (byte)(0 - this.data[(this.offset += -1025691571) * -442398587 - 1]);
   }

   // $FF: renamed from: jx (int) void
   public void method_343(int var1) {
      this.data[(this.offset += -1025691571) * -442398587 - 1] = (byte)(var1 >> 16);
      this.data[(this.offset += -1025691571) * -442398587 - 1] = (byte)(var1 >> 24);
      this.data[(this.offset += 903446127) * -1833556747 - 1] = (byte)var1;
      this.data[(this.offset += -1025691571) * -858566984 - 1] = (byte)(var1 >> 8);
   }

   // $FF: renamed from: jm (int) void
   public void method_344(int var1) {
      this.data[(this.offset += -1025691571) * -442398587 - 1] = (byte)(var1 >> 16);
      this.data[(this.offset += -1025691571) * -442398587 - 1] = (byte)(var1 >> 24);
      this.data[(this.offset += -1025691571) * -442398587 - 1] = (byte)var1;
      this.data[(this.offset += -1025691571) * -442398587 - 1] = (byte)(var1 >> 8);
   }

   // $FF: renamed from: jr () int
   public int method_345() {
      this.offset += 192201012;
      return ((this.data[-442398587 * this.offset - 2] & 255) << 24) + ((this.data[this.offset * -442398587 - 1] & 1107645547) << 16) + ((this.data[this.offset * 690398830 - 4] & 255) << 8) + (this.data[-442398587 * this.offset - 3] & -323614592);
   }

   // $FF: renamed from: jc () int
   public int method_346() {
      this.offset += 192201012;
      return ((this.data[-442398587 * this.offset - 2] & 255) << 24) + ((this.data[this.offset * -442398587 - 1] & 255) << 16) + ((this.data[this.offset * -442398587 - 4] & 255) << 8) + (this.data[-442398587 * this.offset - 3] & 255);
   }

   // $FF: renamed from: bh (int) java.lang.String
   public String method_347(int var1) {
      try {
         if(this.data[this.offset * -442398587] == 0) {
            if(var1 >= 184280136) {
               throw new IllegalStateException();
            } else {
               this.offset += -1025691571;
               return null;
            }
         } else {
            return this.method_139(-391631059);
         }
      } catch (RuntimeException var2) {
         throw class_223.method_4281(var2);
      }
   }

   // $FF: renamed from: jb () int
   public int method_348() {
      this.offset += 192201012;
      return ((this.data[-442398587 * this.offset - 2] & 255) << 24) + ((this.data[this.offset * -442398587 - 1] & 255) << 16) + ((this.data[this.offset * -442398587 - 4] & 255) << 8) + (this.data[-442398587 * this.offset - 3] & 255);
   }

   // $FF: renamed from: <clinit> () void
   static {
      field_16 = new int[256];

      int var2;
      for(int var1 = 0; var1 < 256; ++var1) {
         int var0 = var1;

         for(var2 = 0; var2 < 8; ++var2) {
            if(1 == (var0 & 1)) {
               var0 = var0 >>> 1 ^ -306674912;
            } else {
               var0 >>>= 1;
            }
         }

         field_16[var1] = var0;
      }

      field_17 = new long[256];

      for(var2 = 0; var2 < 256; ++var2) {
         long var4 = (long)var2;

         for(int var3 = 0; var3 < 8; ++var3) {
            if(1L == (var4 & 1L)) {
               var4 = var4 >>> 1 ^ -3932672073523589310L;
            } else {
               var4 >>>= 1;
            }
         }

         field_17[var2] = var4;
      }

   }

   // $FF: renamed from: hh (int[]) void
   public void method_350(int[] var1) {
      int var2 = this.offset * -608251828 / 8;
      this.offset = 0;

      for(int var3 = 0; var3 < var2; ++var3) {
         int var4 = this.method_135();
         int var5 = this.method_135();
         int var6 = -957401312;
         int var7 = -1640531527;

         for(int var8 = 32; var8-- > 0; var4 -= (var5 << 4 ^ var5 >>> 5) + var5 ^ var6 + var1[var6 & 3]) {
            var5 -= var4 + (var4 << 4 ^ var4 >>> 5) ^ var6 + var1[var6 >>> 11 & 3];
            var6 -= var7;
         }

         this.offset -= 1353541151;
         this.method_116(var4);
         this.method_116(var5);
      }

   }

   // $FF: renamed from: ju () int
   public int method_351() {
      this.offset += 192201012;
      return (this.data[-442398587 * this.offset - 2] & 255) + ((this.data[this.offset * -1917724924 - 1] & -805815711) << 8) + ((this.data[-442398587 * this.offset - 4] & -264557794) << 16) + ((this.data[this.offset * 1677180975 - 3] & 255) << 24);
   }

   // $FF: renamed from: hu (int) int
   public int method_352(int var1) {
      byte[] var3 = this.data;
      int var4 = -442398587 * this.offset;
      int var5 = -1;

      for(int var6 = var1; var6 < var4; ++var6) {
         var5 = var5 >>> 8 ^ field_16[(var5 ^ var3[var6]) & 255];
      }

      var5 = ~var5;
      this.method_116(var5);
      return var5;
   }

   // $FF: renamed from: je (byte[], int, int) void
   public void method_353(byte[] var1, int var2, int var3) {
      for(int var4 = var3 + var2 - 1; var4 >= var2; --var4) {
         var1[var4] = (byte)(this.data[(this.offset += -1025691571) * -442398587 - 1] - 128);
      }

   }
}
