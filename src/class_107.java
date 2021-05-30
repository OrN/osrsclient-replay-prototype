
// $FF: renamed from: bv
public class class_107 extends class_104 {

   // $FF: renamed from: y int
   int field_1242;
   // $FF: renamed from: n int
   int field_1243;
   // $FF: renamed from: v int
   int field_1244;
   // $FF: renamed from: f int
   int field_1245;
   // $FF: renamed from: u boolean
   boolean field_1246;
   // $FF: renamed from: j int
   int field_1247;
   // $FF: renamed from: r int
   int field_1248;
   // $FF: renamed from: b int
   int field_1249;
   // $FF: renamed from: d int
   int field_1250;
   // $FF: renamed from: s int
   int field_1251;
   // $FF: renamed from: p int
   int field_1252;
   // $FF: renamed from: l int
   int field_1253;
   // $FF: renamed from: o int
   int field_1254;
   // $FF: renamed from: c int
   int field_1255;
   // $FF: renamed from: e int
   int field_1256;


   // $FF: renamed from: ay (int, int, byte[], int[], int, int, int, int, int, int, bv, int, int) int
   static int method_2069(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, class_107 var10, int var11, int var12) {
      if(var11 == 0 || (var7 = var5 + (var9 + 256 - var4 + var11) / var11) > var8) {
         var7 = var8;
      }

      int var10001;
      while(var5 < var7) {
         var1 = var4 >> 8;
         byte var13 = var2[var1 - 1];
         var10001 = var5++;
         var3[var10001] += ((var13 << 8) + (var2[var1] - var13) * (var4 & 255)) * var6 >> 6;
         var4 += var11;
      }

      if(var11 == 0 || (var7 = var5 + (var9 - var4 + var11) / var11) > var8) {
         var7 = var8;
      }

      var0 = var12;

      for(var1 = var11; var5 < var7; var4 += var1) {
         var10001 = var5++;
         var3[var10001] += ((var0 << 8) + (var2[var4 >> 8] - var0) * (var4 & 255)) * var6 >> 6;
      }

      var10.field_1244 = var4;
      return var5;
   }

   // $FF: renamed from: <init> (au, int, int, int) void
   class_107(class_110 var1, int var2, int var3, int var4) {
      super();
      this.field_1205 = var1;
      this.field_1250 = var1.field_1264;
      this.field_1251 = var1.field_1265;
      this.field_1246 = var1.field_1263;
      this.field_1243 = var2;
      this.field_1245 = var3;
      this.field_1242 = var4;
      this.field_1244 = 0;
      this.method_2073();
   }

   // $FF: renamed from: f (au, int, int) bv
   public static class_107 method_2071(class_110 var0, int var1, int var2) {
      if(var0.field_1266 != null && var0.field_1266.length != 0) {
         class_107 var10000 = new class_107(var0, (int)((long)var0.field_1262 * 256L * (long)var1 / (long)(class_139.field_1793 * -92703148)), var2 << 6);
         return var10000;
      } else {
         return null;
      }
   }

   // $FF: renamed from: y (au, int, int, int) bv
   public static class_107 method_2072(class_110 var0, int var1, int var2, int var3) {
      if(var0.field_1266 != null && var0.field_1266.length != 0) {
         class_107 var10000 = new class_107(var0, var1, var2, var3);
         return var10000;
      } else {
         return null;
      }
   }

   // $FF: renamed from: p () void
   void method_2073() {
      this.field_1252 = this.field_1245;
      this.field_1247 = method_2108(this.field_1245, this.field_1242);
      this.field_1248 = method_2161(this.field_1245, this.field_1242);
   }

   // $FF: renamed from: s (int) void
   public synchronized void method_2074(int var1) {
      this.field_1249 = var1;
   }

   // $FF: renamed from: l (int) void
   public synchronized void method_2075(int var1) {
      this.method_2077(var1 << 6, this.method_2183());
   }

   // $FF: renamed from: o (int) void
   synchronized void method_2076(int var1) {
      this.method_2077(var1, this.method_2183());
   }

   // $FF: renamed from: c (int, int) void
   synchronized void method_2077(int var1, int var2) {
      this.field_1245 = var1;
      this.field_1242 = var2;
      this.field_1253 = 0;
      this.method_2073();
   }

   // $FF: renamed from: ag () boolean
   public boolean method_2078() {
      return this.field_1244 < 0 || this.field_1244 >= ((class_110)this.field_1205).field_1266.length << 8;
   }

   // $FF: renamed from: q () bm
   protected class_104 method_1938() {
      return null;
   }

   // $FF: renamed from: dy (int, byte[], int[], int, int, int, int, int, int, int, bv) int
   static int method_2080(byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, class_107 var10) {
      var3 >>= 8;
      var9 >>= 8;
      var5 <<= 2;
      var6 <<= 2;
      if((var7 = var4 + var3 - (var9 - 1)) > var8) {
         var7 = var8;
      }

      var4 <<= 1;
      var7 <<= 1;

      int var10001;
      byte var11;
      for(var7 -= 6; var4 < var7; var2[var10001] += var11 * var6) {
         var11 = var1[var3--];
         var10001 = var4++;
         var2[var10001] += var11 * var5;
         var10001 = var4++;
         var2[var10001] += var11 * var6;
         var11 = var1[var3--];
         var10001 = var4++;
         var2[var10001] += var11 * var5;
         var10001 = var4++;
         var2[var10001] += var11 * var6;
         var11 = var1[var3--];
         var10001 = var4++;
         var2[var10001] += var11 * var5;
         var10001 = var4++;
         var2[var10001] += var11 * var6;
         var11 = var1[var3--];
         var10001 = var4++;
         var2[var10001] += var11 * var5;
         var10001 = var4++;
      }

      for(var7 += 6; var4 < var7; var2[var10001] += var11 * var6) {
         var11 = var1[var3--];
         var10001 = var4++;
         var2[var10001] += var11 * var5;
         var10001 = var4++;
      }

      var10.field_1244 = var3 << 8;
      return var4 >> 1;
   }

   // $FF: renamed from: m () void
   void method_2081() {
      if(this.field_1253 != 0) {
         if(this.field_1245 == Integer.MIN_VALUE) {
            this.field_1245 = 0;
         }

         this.field_1253 = 0;
         this.method_2073();
      }

   }

   // $FF: renamed from: x (int, int) void
   public synchronized void method_2082(int var1, int var2) {
      this.method_2195(var1, var2, this.method_2183());
   }

   // $FF: renamed from: i () bm
   protected class_104 method_1937() {
      return null;
   }

   // $FF: renamed from: w (int) void
   public synchronized void method_2083(int var1) {
      if(var1 == 0) {
         this.method_2076(0);
         this.method_108();
      } else if(this.field_1247 == 0 && this.field_1248 == 0) {
         this.field_1253 = 0;
         this.field_1245 = 0;
         this.field_1252 = 0;
         this.method_108();
      } else {
         int var2 = -this.field_1252;
         if(this.field_1252 > var2) {
            var2 = this.field_1252;
         }

         if(-this.field_1247 > var2) {
            var2 = -this.field_1247;
         }

         if(this.field_1247 > var2) {
            var2 = this.field_1247;
         }

         if(-this.field_1248 > var2) {
            var2 = -this.field_1248;
         }

         if(this.field_1248 > var2) {
            var2 = this.field_1248;
         }

         if(var1 > var2) {
            var1 = var2;
         }

         this.field_1253 = var1;
         this.field_1245 = Integer.MIN_VALUE;
         this.field_1254 = -this.field_1252 / var1;
         this.field_1255 = -this.field_1247 / var1;
         this.field_1256 = -this.field_1248 / var1;
      }
   }

   // $FF: renamed from: bl (int, int, byte[], int[], int, int, int, int, int, int, int, bv, int, int) int
   static int method_2084(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, class_107 var11, int var12, int var13) {
      var11.field_1247 -= var11.field_1255 * var5;
      var11.field_1248 -= var11.field_1256 * var5;
      if(var12 == 0 || (var8 = var5 + (var10 + 256 - var4 + var12) / var12) > var9) {
         var8 = var9;
      }

      int var10001;
      while(var5 < var8) {
         var1 = var4 >> 8;
         byte var14 = var2[var1 - 1];
         var10001 = var5++;
         var3[var10001] += ((var14 << 8) + (var2[var1] - var14) * (var4 & 255)) * var6 >> 6;
         var6 += var7;
         var4 += var12;
      }

      if(var12 == 0 || (var8 = var5 + (var10 - var4 + var12) / var12) > var9) {
         var8 = var9;
      }

      var0 = var13;

      for(var1 = var12; var5 < var8; var4 += var1) {
         var10001 = var5++;
         var3[var10001] += ((var0 << 8) + (var2[var4 >> 8] - var0) * (var4 & 255)) * var6 >> 6;
         var6 += var7;
      }

      var11.field_1247 += var11.field_1255 * var5;
      var11.field_1248 += var11.field_1256 * var5;
      var11.field_1252 = var6;
      var11.field_1244 = var4;
      return var5;
   }

   // $FF: renamed from: h () int
   public synchronized int method_2085() {
      return this.field_1243 < 0?-this.field_1243:this.field_1243;
   }

   // $FF: renamed from: ax () boolean
   public boolean method_2087() {
      return this.field_1253 != 0;
   }

   // $FF: renamed from: j () bm
   protected class_104 method_1931() {
      return null;
   }

   // $FF: renamed from: ab () int
   protected int method_1942() {
      return this.field_1245 == 0 && this.field_1253 == 0?0:1;
   }

   // $FF: renamed from: b () int
   protected int method_1935() {
      return this.field_1245 == 0 && this.field_1253 == 0?0:1;
   }

   // $FF: renamed from: d (int[], int, int) void
   public synchronized void method_1943(int[] var1, int var2, int var3) {
      if(this.field_1245 == 0 && this.field_1253 == 0) {
         this.method_1933(var3);
      } else {
         class_110 var4 = (class_110)this.field_1205;
         int var5 = this.field_1250 << 8;
         int var6 = this.field_1251 << 8;
         int var7 = var4.field_1266.length << 8;
         int var8 = var6 - var5;
         if(var8 <= 0) {
            this.field_1249 = 0;
         }

         int var9 = var2;
         var3 += var2;
         if(this.field_1244 < 0) {
            if(this.field_1243 <= 0) {
               this.method_2081();
               this.method_108();
               return;
            }

            this.field_1244 = 0;
         }

         if(this.field_1244 >= var7) {
            if(this.field_1243 >= 0) {
               this.method_2081();
               this.method_108();
               return;
            }

            this.field_1244 = var7 - 1;
         }

         if(this.field_1249 < 0) {
            if(this.field_1246) {
               if(this.field_1243 < 0) {
                  var9 = this.method_2089(var1, var2, var5, var3, var4.field_1266[this.field_1250]);
                  if(this.field_1244 >= var5) {
                     return;
                  }

                  this.field_1244 = var5 + var5 - 1 - this.field_1244;
                  this.field_1243 = -this.field_1243;
               }

               while(true) {
                  var9 = this.method_2088(var1, var9, var6, var3, var4.field_1266[this.field_1251 - 1]);
                  if(this.field_1244 < var6) {
                     return;
                  }

                  this.field_1244 = var6 + var6 - 1 - this.field_1244;
                  this.field_1243 = -this.field_1243;
                  var9 = this.method_2089(var1, var9, var5, var3, var4.field_1266[this.field_1250]);
                  if(this.field_1244 >= var5) {
                     return;
                  }

                  this.field_1244 = var5 + var5 - 1 - this.field_1244;
                  this.field_1243 = -this.field_1243;
               }
            } else if(this.field_1243 < 0) {
               while(true) {
                  var9 = this.method_2089(var1, var9, var5, var3, var4.field_1266[this.field_1251 - 1]);
                  if(this.field_1244 >= var5) {
                     return;
                  }

                  this.field_1244 = var6 - 1 - (var6 - 1 - this.field_1244) % var8;
               }
            } else {
               while(true) {
                  var9 = this.method_2088(var1, var9, var6, var3, var4.field_1266[this.field_1250]);
                  if(this.field_1244 < var6) {
                     return;
                  }

                  this.field_1244 = var5 + (this.field_1244 - var5) % var8;
               }
            }
         } else {
            if(this.field_1249 > 0) {
               if(this.field_1246) {
                  label177: {
                     if(this.field_1243 < 0) {
                        var9 = this.method_2089(var1, var2, var5, var3, var4.field_1266[this.field_1250]);
                        if(this.field_1244 >= var5) {
                           return;
                        }

                        this.field_1244 = var5 + var5 - 1 - this.field_1244;
                        this.field_1243 = -this.field_1243;
                        if(--this.field_1249 == 0) {
                           break label177;
                        }
                     }

                     do {
                        var9 = this.method_2088(var1, var9, var6, var3, var4.field_1266[this.field_1251 - 1]);
                        if(this.field_1244 < var6) {
                           return;
                        }

                        this.field_1244 = var6 + var6 - 1 - this.field_1244;
                        this.field_1243 = -this.field_1243;
                        if(--this.field_1249 == 0) {
                           break;
                        }

                        var9 = this.method_2089(var1, var9, var5, var3, var4.field_1266[this.field_1250]);
                        if(this.field_1244 >= var5) {
                           return;
                        }

                        this.field_1244 = var5 + var5 - 1 - this.field_1244;
                        this.field_1243 = -this.field_1243;
                     } while(--this.field_1249 != 0);
                  }
               } else {
                  int var10;
                  if(this.field_1243 < 0) {
                     while(true) {
                        var9 = this.method_2089(var1, var9, var5, var3, var4.field_1266[this.field_1251 - 1]);
                        if(this.field_1244 >= var5) {
                           return;
                        }

                        var10 = (var6 - 1 - this.field_1244) / var8;
                        if(var10 >= this.field_1249) {
                           this.field_1244 += var8 * this.field_1249;
                           this.field_1249 = 0;
                           break;
                        }

                        this.field_1244 += var8 * var10;
                        this.field_1249 -= var10;
                     }
                  } else {
                     while(true) {
                        var9 = this.method_2088(var1, var9, var6, var3, var4.field_1266[this.field_1250]);
                        if(this.field_1244 < var6) {
                           return;
                        }

                        var10 = (this.field_1244 - var5) / var8;
                        if(var10 >= this.field_1249) {
                           this.field_1244 -= var8 * this.field_1249;
                           this.field_1249 = 0;
                           break;
                        }

                        this.field_1244 -= var8 * var10;
                        this.field_1249 -= var10;
                     }
                  }
               }
            }

            if(this.field_1243 < 0) {
               this.method_2089(var1, var9, 0, var3, 0);
               if(this.field_1244 < 0) {
                  this.field_1244 = -1;
                  this.method_2081();
                  this.method_108();
               }
            } else {
               this.method_2088(var1, var9, var7, var3, 0);
               if(this.field_1244 >= var7) {
                  this.field_1244 = var7;
                  this.method_2081();
                  this.method_108();
               }
            }

         }
      }
   }

   // $FF: renamed from: u (int) void
   public synchronized void method_1933(int var1) {
      if(this.field_1253 > 0) {
         if(var1 >= this.field_1253) {
            if(this.field_1245 == Integer.MIN_VALUE) {
               this.field_1245 = 0;
               this.field_1248 = 0;
               this.field_1247 = 0;
               this.field_1252 = 0;
               this.method_108();
               var1 = this.field_1253;
            }

            this.field_1253 = 0;
            this.method_2073();
         } else {
            this.field_1252 += this.field_1254 * var1;
            this.field_1247 += this.field_1255 * var1;
            this.field_1248 += this.field_1256 * var1;
            this.field_1253 -= var1;
         }
      }

      class_110 var2 = (class_110)this.field_1205;
      int var3 = this.field_1250 << 8;
      int var4 = this.field_1251 << 8;
      int var5 = var2.field_1266.length << 8;
      int var6 = var4 - var3;
      if(var6 <= 0) {
         this.field_1249 = 0;
      }

      if(this.field_1244 < 0) {
         if(this.field_1243 <= 0) {
            this.method_2081();
            this.method_108();
            return;
         }

         this.field_1244 = 0;
      }

      if(this.field_1244 >= var5) {
         if(this.field_1243 >= 0) {
            this.method_2081();
            this.method_108();
            return;
         }

         this.field_1244 = var5 - 1;
      }

      this.field_1244 += this.field_1243 * var1;
      if(this.field_1249 < 0) {
         if(!this.field_1246) {
            if(this.field_1243 < 0) {
               if(this.field_1244 >= var3) {
                  return;
               }

               this.field_1244 = var4 - 1 - (var4 - 1 - this.field_1244) % var6;
            } else {
               if(this.field_1244 < var4) {
                  return;
               }

               this.field_1244 = var3 + (this.field_1244 - var3) % var6;
            }

         } else {
            if(this.field_1243 < 0) {
               if(this.field_1244 >= var3) {
                  return;
               }

               this.field_1244 = var3 + var3 - 1 - this.field_1244;
               this.field_1243 = -this.field_1243;
            }

            while(this.field_1244 >= var4) {
               this.field_1244 = var4 + var4 - 1 - this.field_1244;
               this.field_1243 = -this.field_1243;
               if(this.field_1244 >= var3) {
                  return;
               }

               this.field_1244 = var3 + var3 - 1 - this.field_1244;
               this.field_1243 = -this.field_1243;
            }

         }
      } else {
         if(this.field_1249 > 0) {
            if(this.field_1246) {
               label179: {
                  if(this.field_1243 < 0) {
                     if(this.field_1244 >= var3) {
                        return;
                     }

                     this.field_1244 = var3 + var3 - 1 - this.field_1244;
                     this.field_1243 = -this.field_1243;
                     if(--this.field_1249 == 0) {
                        break label179;
                     }
                  }

                  do {
                     if(this.field_1244 < var4) {
                        return;
                     }

                     this.field_1244 = var4 + var4 - 1 - this.field_1244;
                     this.field_1243 = -this.field_1243;
                     if(--this.field_1249 == 0) {
                        break;
                     }

                     if(this.field_1244 >= var3) {
                        return;
                     }

                     this.field_1244 = var3 + var3 - 1 - this.field_1244;
                     this.field_1243 = -this.field_1243;
                  } while(--this.field_1249 != 0);
               }
            } else {
               label189: {
                  int var7;
                  if(this.field_1243 < 0) {
                     if(this.field_1244 >= var3) {
                        return;
                     }

                     var7 = (var4 - 1 - this.field_1244) / var6;
                     if(var7 >= this.field_1249) {
                        this.field_1244 += var6 * this.field_1249;
                        this.field_1249 = 0;
                        break label189;
                     }

                     this.field_1244 += var6 * var7;
                     this.field_1249 -= var7;
                  } else {
                     if(this.field_1244 < var4) {
                        return;
                     }

                     var7 = (this.field_1244 - var3) / var6;
                     if(var7 >= this.field_1249) {
                        this.field_1244 -= var6 * this.field_1249;
                        this.field_1249 = 0;
                        break label189;
                     }

                     this.field_1244 -= var6 * var7;
                     this.field_1249 -= var7;
                  }

                  return;
               }
            }
         }

         if(this.field_1243 < 0) {
            if(this.field_1244 < 0) {
               this.field_1244 = -1;
               this.method_2081();
               this.method_108();
            }
         } else if(this.field_1244 >= var5) {
            this.field_1244 = var5;
            this.method_2081();
            this.method_108();
         }

      }
   }

   // $FF: renamed from: as (int[], int, int, int, int) int
   int method_2088(int[] var1, int var2, int var3, int var4, int var5) {
      while(true) {
         if(this.field_1253 > 0) {
            int var6 = var2 + this.field_1253;
            if(var6 > var4) {
               var6 = var4;
            }

            this.field_1253 += var2;
            if(this.field_1243 == 256 && (this.field_1244 & 255) == 0) {
               if(class_139.field_1781) {
                  var2 = method_2100(((class_110)this.field_1205).field_1266, var1, this.field_1244, var2, this.field_1247, this.field_1248, this.field_1255, this.field_1256, 0, var6, var3, this);
               } else {
                  var2 = method_2099(((class_110)this.field_1205).field_1266, var1, this.field_1244, var2, this.field_1252, this.field_1254, 0, var6, var3, this);
               }
            } else if(class_139.field_1781) {
               var2 = method_2174(0, 0, ((class_110)this.field_1205).field_1266, var1, this.field_1244, var2, this.field_1247, this.field_1248, this.field_1255, this.field_1256, 0, var6, var3, this, this.field_1243, var5);
            } else {
               var2 = method_2178(0, ((class_110)this.field_1205).field_1266, var1, this.field_1244, var2, this.field_1252, this.field_1254, 0, var6, var3, this, this.field_1243, var5);
            }

            this.field_1253 -= var2;
            if(this.field_1253 != 0) {
               return var2;
            }

            if(!this.method_2090()) {
               continue;
            }

            return var4;
         }

         if(this.field_1243 == 256 && (this.field_1244 & 255) == 0) {
            if(class_139.field_1781) {
               return method_2092(((class_110)this.field_1205).field_1266, var1, this.field_1244, var2, this.field_1247, this.field_1248, 0, var4, var3, this);
            }

            return method_2091(((class_110)this.field_1205).field_1266, var1, this.field_1244, var2, this.field_1252, 0, var4, var3, this);
         }

         if(class_139.field_1781) {
            return method_2096(0, 0, ((class_110)this.field_1205).field_1266, var1, this.field_1244, var2, this.field_1247, this.field_1248, 0, var4, var3, this, this.field_1243, var5);
         }

         return method_2095(0, ((class_110)this.field_1205).field_1266, var1, this.field_1244, var2, this.field_1252, 0, var4, var3, this, this.field_1243, var5);
      }
   }

   // $FF: renamed from: av (int[], int, int, int, int) int
   int method_2089(int[] var1, int var2, int var3, int var4, int var5) {
      while(true) {
         if(this.field_1253 > 0) {
            int var6 = var2 + this.field_1253;
            if(var6 > var4) {
               var6 = var4;
            }

            this.field_1253 += var2;
            if(this.field_1243 == -256 && (this.field_1244 & 255) == 0) {
               if(class_139.field_1781) {
                  var2 = method_2102(((class_110)this.field_1205).field_1266, var1, this.field_1244, var2, this.field_1247, this.field_1248, this.field_1255, this.field_1256, 0, var6, var3, this);
               } else {
                  var2 = method_2101(((class_110)this.field_1205).field_1266, var1, this.field_1244, var2, this.field_1252, this.field_1254, 0, var6, var3, this);
               }
            } else if(class_139.field_1781) {
               var2 = method_2129(0, 0, ((class_110)this.field_1205).field_1266, var1, this.field_1244, var2, this.field_1247, this.field_1248, this.field_1255, this.field_1256, 0, var6, var3, this, this.field_1243, var5);
            } else {
               var2 = method_2084(0, 0, ((class_110)this.field_1205).field_1266, var1, this.field_1244, var2, this.field_1252, this.field_1254, 0, var6, var3, this, this.field_1243, var5);
            }

            this.field_1253 -= var2;
            if(this.field_1253 != 0) {
               return var2;
            }

            if(!this.method_2090()) {
               continue;
            }

            return var4;
         }

         if(this.field_1243 == -256 && (this.field_1244 & 255) == 0) {
            if(class_139.field_1781) {
               return method_2094(((class_110)this.field_1205).field_1266, var1, this.field_1244, var2, this.field_1247, this.field_1248, 0, var4, var3, this);
            }

            return method_2093(((class_110)this.field_1205).field_1266, var1, this.field_1244, var2, this.field_1252, 0, var4, var3, this);
         }

         if(class_139.field_1781) {
            return method_2098(0, 0, ((class_110)this.field_1205).field_1266, var1, this.field_1244, var2, this.field_1247, this.field_1248, 0, var4, var3, this, this.field_1243, var5);
         }

         return method_2069(0, 0, ((class_110)this.field_1205).field_1266, var1, this.field_1244, var2, this.field_1252, 0, var4, var3, this, this.field_1243, var5);
      }
   }

   // $FF: renamed from: ac () boolean
   boolean method_2090() {
      int var1 = this.field_1245;
      int var2;
      int var3;
      if(var1 == Integer.MIN_VALUE) {
         var3 = 0;
         var2 = 0;
         var1 = 0;
      } else {
         var2 = method_2108(var1, this.field_1242);
         var3 = method_2161(var1, this.field_1242);
      }

      if(this.field_1252 == var1 && this.field_1247 == var2 && this.field_1248 == var3) {
         if(this.field_1245 == Integer.MIN_VALUE) {
            this.field_1245 = 0;
            this.field_1248 = 0;
            this.field_1247 = 0;
            this.field_1252 = 0;
            this.method_108();
            return true;
         } else {
            this.method_2073();
            return false;
         }
      } else {
         if(this.field_1252 < var1) {
            this.field_1254 = 1;
            this.field_1253 = var1 - this.field_1252;
         } else if(this.field_1252 > var1) {
            this.field_1254 = -1;
            this.field_1253 = this.field_1252 - var1;
         } else {
            this.field_1254 = 0;
         }

         if(this.field_1247 < var2) {
            this.field_1255 = 1;
            if(this.field_1253 == 0 || this.field_1253 > var2 - this.field_1247) {
               this.field_1253 = var2 - this.field_1247;
            }
         } else if(this.field_1247 > var2) {
            this.field_1255 = -1;
            if(this.field_1253 == 0 || this.field_1253 > this.field_1247 - var2) {
               this.field_1253 = this.field_1247 - var2;
            }
         } else {
            this.field_1255 = 0;
         }

         if(this.field_1248 < var3) {
            this.field_1256 = 1;
            if(this.field_1253 == 0 || this.field_1253 > var3 - this.field_1248) {
               this.field_1253 = var3 - this.field_1248;
            }
         } else if(this.field_1248 > var3) {
            this.field_1256 = -1;
            if(this.field_1253 == 0 || this.field_1253 > this.field_1248 - var3) {
               this.field_1253 = this.field_1248 - var3;
            }
         } else {
            this.field_1256 = 0;
         }

         return false;
      }
   }

   // $FF: renamed from: at (byte[], int[], int, int, int, int, int, int, bv) int
   static int method_2091(byte[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, class_107 var8) {
      var2 >>= 8;
      var7 >>= 8;
      var4 <<= 2;
      if((var5 = var3 + var7 - var2) > var6) {
         var5 = var6;
      }

      int var10001;
      for(var5 -= 3; var3 < var5; var1[var10001] += var0[var2++] * var4) {
         var10001 = var3++;
         var1[var10001] += var0[var2++] * var4;
         var10001 = var3++;
         var1[var10001] += var0[var2++] * var4;
         var10001 = var3++;
         var1[var10001] += var0[var2++] * var4;
         var10001 = var3++;
      }

      for(var5 += 3; var3 < var5; var1[var10001] += var0[var2++] * var4) {
         var10001 = var3++;
      }

      var8.field_1244 = var2 << 8;
      return var3;
   }

   // $FF: renamed from: ao (int, byte[], int[], int, int, int, int, int, int, int, bv) int
   static int method_2092(byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, class_107 var10) {
      var3 >>= 8;
      var9 >>= 8;
      var5 <<= 2;
      var6 <<= 2;
      if((var7 = var4 + var9 - var3) > var8) {
         var7 = var8;
      }

      var4 <<= 1;
      var7 <<= 1;

      int var10001;
      byte var11;
      for(var7 -= 6; var4 < var7; var2[var10001] += var11 * var6) {
         var11 = var1[var3++];
         var10001 = var4++;
         var2[var10001] += var11 * var5;
         var10001 = var4++;
         var2[var10001] += var11 * var6;
         var11 = var1[var3++];
         var10001 = var4++;
         var2[var10001] += var11 * var5;
         var10001 = var4++;
         var2[var10001] += var11 * var6;
         var11 = var1[var3++];
         var10001 = var4++;
         var2[var10001] += var11 * var5;
         var10001 = var4++;
         var2[var10001] += var11 * var6;
         var11 = var1[var3++];
         var10001 = var4++;
         var2[var10001] += var11 * var5;
         var10001 = var4++;
      }

      for(var7 += 6; var4 < var7; var2[var10001] += var11 * var6) {
         var11 = var1[var3++];
         var10001 = var4++;
         var2[var10001] += var11 * var5;
         var10001 = var4++;
      }

      var10.field_1244 = var3 << 8;
      return var4 >> 1;
   }

   // $FF: renamed from: aq (byte[], int[], int, int, int, int, int, int, bv) int
   static int method_2093(byte[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, class_107 var8) {
      var2 >>= 8;
      var7 >>= 8;
      var4 <<= 2;
      if((var5 = var3 + var2 - (var7 - 1)) > var6) {
         var5 = var6;
      }

      int var10001;
      for(var5 -= 3; var3 < var5; var1[var10001] += var0[var2--] * var4) {
         var10001 = var3++;
         var1[var10001] += var0[var2--] * var4;
         var10001 = var3++;
         var1[var10001] += var0[var2--] * var4;
         var10001 = var3++;
         var1[var10001] += var0[var2--] * var4;
         var10001 = var3++;
      }

      for(var5 += 3; var3 < var5; var1[var10001] += var0[var2--] * var4) {
         var10001 = var3++;
      }

      var8.field_1244 = var2 << 8;
      return var3;
   }

   // $FF: renamed from: aw (int, byte[], int[], int, int, int, int, int, int, int, bv) int
   static int method_2094(byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, class_107 var10) {
      var3 >>= 8;
      var9 >>= 8;
      var5 <<= 2;
      var6 <<= 2;
      if((var7 = var4 + var3 - (var9 - 1)) > var8) {
         var7 = var8;
      }

      var4 <<= 1;
      var7 <<= 1;

      int var10001;
      byte var11;
      for(var7 -= 6; var4 < var7; var2[var10001] += var11 * var6) {
         var11 = var1[var3--];
         var10001 = var4++;
         var2[var10001] += var11 * var5;
         var10001 = var4++;
         var2[var10001] += var11 * var6;
         var11 = var1[var3--];
         var10001 = var4++;
         var2[var10001] += var11 * var5;
         var10001 = var4++;
         var2[var10001] += var11 * var6;
         var11 = var1[var3--];
         var10001 = var4++;
         var2[var10001] += var11 * var5;
         var10001 = var4++;
         var2[var10001] += var11 * var6;
         var11 = var1[var3--];
         var10001 = var4++;
         var2[var10001] += var11 * var5;
         var10001 = var4++;
      }

      for(var7 += 6; var4 < var7; var2[var10001] += var11 * var6) {
         var11 = var1[var3--];
         var10001 = var4++;
         var2[var10001] += var11 * var5;
         var10001 = var4++;
      }

      var10.field_1244 = var3 << 8;
      return var4 >> 1;
   }

   // $FF: renamed from: af (int, int, byte[], int[], int, int, int, int, int, int, bv, int, int) int
   static int method_2095(int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, class_107 var10, int var11, int var12) {
      if(var11 == 0 || (var7 = var5 + (var9 - var4 + var11 - 257) / var11) > var8) {
         var7 = var8;
      }

      byte var13;
      int var10001;
      while(var5 < var7) {
         var1 = var4 >> 8;
         var13 = var2[var1];
         var10001 = var5++;
         var3[var10001] += ((var13 << 8) + (var2[var1 + 1] - var13) * (var4 & 255)) * var6 >> 6;
         var4 += var11;
      }

      if(var11 == 0 || (var7 = var5 + (var9 - var4 + var11 - 1) / var11) > var8) {
         var7 = var8;
      }

      for(var1 = var12; var5 < var7; var4 += var11) {
         var13 = var2[var4 >> 8];
         var10001 = var5++;
         var3[var10001] += ((var13 << 8) + (var1 - var13) * (var4 & 255)) * var6 >> 6;
      }

      var10.field_1244 = var4;
      return var5;
   }

   // $FF: renamed from: ak (int, int, byte[], int[], int, int, int, int, int, int, int, bv, int, int) int
   static int method_2096(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, class_107 var11, int var12, int var13) {
      if(var12 == 0 || (var8 = var5 + (var10 - var4 + var12 - 257) / var12) > var9) {
         var8 = var9;
      }

      var5 <<= 1;

      byte var14;
      int var10001;
      for(var8 <<= 1; var5 < var8; var4 += var12) {
         var1 = var4 >> 8;
         var14 = var2[var1];
         var0 = (var14 << 8) + (var2[var1 + 1] - var14) * (var4 & 255);
         var10001 = var5++;
         var3[var10001] += var0 * var6 >> 6;
         var10001 = var5++;
         var3[var10001] += var0 * var7 >> 6;
      }

      if(var12 == 0 || (var8 = (var5 >> 1) + (var10 - var4 + var12 - 1) / var12) > var9) {
         var8 = var9;
      }

      var8 <<= 1;

      for(var1 = var13; var5 < var8; var4 += var12) {
         var14 = var2[var4 >> 8];
         var0 = (var14 << 8) + (var1 - var14) * (var4 & 255);
         var10001 = var5++;
         var3[var10001] += var0 * var6 >> 6;
         var10001 = var5++;
         var3[var10001] += var0 * var7 >> 6;
      }

      var11.field_1244 = var4;
      return var5 >> 1;
   }

   // $FF: renamed from: aa (int, int, byte[], int[], int, int, int, int, int, int, int, bv, int, int) int
   static int method_2098(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, class_107 var11, int var12, int var13) {
      if(var12 == 0 || (var8 = var5 + (var10 + 256 - var4 + var12) / var12) > var9) {
         var8 = var9;
      }

      var5 <<= 1;

      int var10001;
      for(var8 <<= 1; var5 < var8; var4 += var12) {
         var1 = var4 >> 8;
         byte var14 = var2[var1 - 1];
         var0 = (var14 << 8) + (var2[var1] - var14) * (var4 & 255);
         var10001 = var5++;
         var3[var10001] += var0 * var6 >> 6;
         var10001 = var5++;
         var3[var10001] += var0 * var7 >> 6;
      }

      if(var12 == 0 || (var8 = (var5 >> 1) + (var10 - var4 + var12) / var12) > var9) {
         var8 = var9;
      }

      var8 <<= 1;

      for(var1 = var13; var5 < var8; var4 += var12) {
         var0 = (var1 << 8) + (var2[var4 >> 8] - var1) * (var4 & 255);
         var10001 = var5++;
         var3[var10001] += var0 * var6 >> 6;
         var10001 = var5++;
         var3[var10001] += var0 * var7 >> 6;
      }

      var11.field_1244 = var4;
      return var5 >> 1;
   }

   // $FF: renamed from: au (byte[], int[], int, int, int, int, int, int, int, bv) int
   static int method_2099(byte[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, class_107 var9) {
      var2 >>= 8;
      var8 >>= 8;
      var4 <<= 2;
      var5 <<= 2;
      if((var6 = var3 + var8 - var2) > var7) {
         var6 = var7;
      }

      var9.field_1247 += var9.field_1255 * (var6 - var3);
      var9.field_1248 += var9.field_1256 * (var6 - var3);

      int var10001;
      for(var6 -= 3; var3 < var6; var4 += var5) {
         var10001 = var3++;
         var1[var10001] += var0[var2++] * var4;
         var4 += var5;
         var10001 = var3++;
         var1[var10001] += var0[var2++] * var4;
         var4 += var5;
         var10001 = var3++;
         var1[var10001] += var0[var2++] * var4;
         var4 += var5;
         var10001 = var3++;
         var1[var10001] += var0[var2++] * var4;
      }

      for(var6 += 3; var3 < var6; var4 += var5) {
         var10001 = var3++;
         var1[var10001] += var0[var2++] * var4;
      }

      var9.field_1252 = var4 >> 2;
      var9.field_1244 = var2 << 8;
      return var3;
   }

   // $FF: renamed from: an (int, byte[], int[], int, int, int, int, int, int, int, int, int, bv) int
   static int method_2100(byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, class_107 var12) {
      var3 >>= 8;
      var11 >>= 8;
      var5 <<= 2;
      var6 <<= 2;
      var7 <<= 2;
      var8 <<= 2;
      if((var9 = var4 + var11 - var3) > var10) {
         var9 = var10;
      }

      var12.field_1252 += var12.field_1254 * (var9 - var4);
      var4 <<= 1;
      var9 <<= 1;

      byte var13;
      int var10001;
      for(var9 -= 6; var4 < var9; var6 += var8) {
         var13 = var1[var3++];
         var10001 = var4++;
         var2[var10001] += var13 * var5;
         var5 += var7;
         var10001 = var4++;
         var2[var10001] += var13 * var6;
         var6 += var8;
         var13 = var1[var3++];
         var10001 = var4++;
         var2[var10001] += var13 * var5;
         var5 += var7;
         var10001 = var4++;
         var2[var10001] += var13 * var6;
         var6 += var8;
         var13 = var1[var3++];
         var10001 = var4++;
         var2[var10001] += var13 * var5;
         var5 += var7;
         var10001 = var4++;
         var2[var10001] += var13 * var6;
         var6 += var8;
         var13 = var1[var3++];
         var10001 = var4++;
         var2[var10001] += var13 * var5;
         var5 += var7;
         var10001 = var4++;
         var2[var10001] += var13 * var6;
      }

      for(var9 += 6; var4 < var9; var6 += var8) {
         var13 = var1[var3++];
         var10001 = var4++;
         var2[var10001] += var13 * var5;
         var5 += var7;
         var10001 = var4++;
         var2[var10001] += var13 * var6;
      }

      var12.field_1247 = var5 >> 2;
      var12.field_1248 = var6 >> 2;
      var12.field_1244 = var3 << 8;
      return var4 >> 1;
   }

   // $FF: renamed from: bd (byte[], int[], int, int, int, int, int, int, int, bv) int
   static int method_2101(byte[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, class_107 var9) {
      var2 >>= 8;
      var8 >>= 8;
      var4 <<= 2;
      var5 <<= 2;
      if((var6 = var3 + var2 - (var8 - 1)) > var7) {
         var6 = var7;
      }

      var9.field_1247 += var9.field_1255 * (var6 - var3);
      var9.field_1248 += var9.field_1256 * (var6 - var3);

      int var10001;
      for(var6 -= 3; var3 < var6; var4 += var5) {
         var10001 = var3++;
         var1[var10001] += var0[var2--] * var4;
         var4 += var5;
         var10001 = var3++;
         var1[var10001] += var0[var2--] * var4;
         var4 += var5;
         var10001 = var3++;
         var1[var10001] += var0[var2--] * var4;
         var4 += var5;
         var10001 = var3++;
         var1[var10001] += var0[var2--] * var4;
      }

      for(var6 += 3; var3 < var6; var4 += var5) {
         var10001 = var3++;
         var1[var10001] += var0[var2--] * var4;
      }

      var9.field_1252 = var4 >> 2;
      var9.field_1244 = var2 << 8;
      return var3;
   }

   // $FF: renamed from: bt (int, byte[], int[], int, int, int, int, int, int, int, int, int, bv) int
   static int method_2102(byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, class_107 var12) {
      var3 >>= 8;
      var11 >>= 8;
      var5 <<= 2;
      var6 <<= 2;
      var7 <<= 2;
      var8 <<= 2;
      if((var9 = var4 + var3 - (var11 - 1)) > var10) {
         var9 = var10;
      }

      var12.field_1252 += var12.field_1254 * (var9 - var4);
      var4 <<= 1;
      var9 <<= 1;

      byte var13;
      int var10001;
      for(var9 -= 6; var4 < var9; var6 += var8) {
         var13 = var1[var3--];
         var10001 = var4++;
         var2[var10001] += var13 * var5;
         var5 += var7;
         var10001 = var4++;
         var2[var10001] += var13 * var6;
         var6 += var8;
         var13 = var1[var3--];
         var10001 = var4++;
         var2[var10001] += var13 * var5;
         var5 += var7;
         var10001 = var4++;
         var2[var10001] += var13 * var6;
         var6 += var8;
         var13 = var1[var3--];
         var10001 = var4++;
         var2[var10001] += var13 * var5;
         var5 += var7;
         var10001 = var4++;
         var2[var10001] += var13 * var6;
         var6 += var8;
         var13 = var1[var3--];
         var10001 = var4++;
         var2[var10001] += var13 * var5;
         var5 += var7;
         var10001 = var4++;
         var2[var10001] += var13 * var6;
      }

      for(var9 += 6; var4 < var9; var6 += var8) {
         var13 = var1[var3--];
         var10001 = var4++;
         var2[var10001] += var13 * var5;
         var5 += var7;
         var10001 = var4++;
         var2[var10001] += var13 * var6;
      }

      var12.field_1247 = var5 >> 2;
      var12.field_1248 = var6 >> 2;
      var12.field_1244 = var3 << 8;
      return var4 >> 1;
   }

   // $FF: renamed from: ar (int[], int, int) void
   public synchronized void method_1946(int[] var1, int var2, int var3) {
      if(this.field_1245 == 0 && this.field_1253 == 0) {
         this.method_1933(var3);
      } else {
         class_110 var4 = (class_110)this.field_1205;
         int var5 = this.field_1250 << 8;
         int var6 = this.field_1251 << 8;
         int var7 = var4.field_1266.length << 8;
         int var8 = var6 - var5;
         if(var8 <= 0) {
            this.field_1249 = 0;
         }

         int var9 = var2;
         var3 += var2;
         if(this.field_1244 < 0) {
            if(this.field_1243 <= 0) {
               this.method_2081();
               this.method_108();
               return;
            }

            this.field_1244 = 0;
         }

         if(this.field_1244 >= var7) {
            if(this.field_1243 >= 0) {
               this.method_2081();
               this.method_108();
               return;
            }

            this.field_1244 = var7 - 1;
         }

         if(this.field_1249 < 0) {
            if(this.field_1246) {
               if(this.field_1243 < 0) {
                  var9 = this.method_2089(var1, var2, var5, var3, var4.field_1266[this.field_1250]);
                  if(this.field_1244 >= var5) {
                     return;
                  }

                  this.field_1244 = var5 + var5 - 1 - this.field_1244;
                  this.field_1243 = -this.field_1243;
               }

               while(true) {
                  var9 = this.method_2088(var1, var9, var6, var3, var4.field_1266[this.field_1251 - 1]);
                  if(this.field_1244 < var6) {
                     return;
                  }

                  this.field_1244 = var6 + var6 - 1 - this.field_1244;
                  this.field_1243 = -this.field_1243;
                  var9 = this.method_2089(var1, var9, var5, var3, var4.field_1266[this.field_1250]);
                  if(this.field_1244 >= var5) {
                     return;
                  }

                  this.field_1244 = var5 + var5 - 1 - this.field_1244;
                  this.field_1243 = -this.field_1243;
               }
            } else if(this.field_1243 < 0) {
               while(true) {
                  var9 = this.method_2089(var1, var9, var5, var3, var4.field_1266[this.field_1251 - 1]);
                  if(this.field_1244 >= var5) {
                     return;
                  }

                  this.field_1244 = var6 - 1 - (var6 - 1 - this.field_1244) % var8;
               }
            } else {
               while(true) {
                  var9 = this.method_2088(var1, var9, var6, var3, var4.field_1266[this.field_1250]);
                  if(this.field_1244 < var6) {
                     return;
                  }

                  this.field_1244 = var5 + (this.field_1244 - var5) % var8;
               }
            }
         } else {
            if(this.field_1249 > 0) {
               if(this.field_1246) {
                  label190: {
                     if(this.field_1243 < 0) {
                        var9 = this.method_2089(var1, var2, var5, var3, var4.field_1266[this.field_1250]);
                        if(this.field_1244 >= var5) {
                           return;
                        }

                        this.field_1244 = var5 + var5 - 1 - this.field_1244;
                        this.field_1243 = -this.field_1243;
                        if(--this.field_1249 == 0) {
                           break label190;
                        }
                     }

                     do {
                        var9 = this.method_2088(var1, var9, var6, var3, var4.field_1266[this.field_1251 - 1]);
                        if(this.field_1244 < var6) {
                           return;
                        }

                        this.field_1244 = var6 + var6 - 1 - this.field_1244;
                        this.field_1243 = -this.field_1243;
                        if(--this.field_1249 == 0) {
                           break;
                        }

                        var9 = this.method_2089(var1, var9, var5, var3, var4.field_1266[this.field_1250]);
                        if(this.field_1244 >= var5) {
                           return;
                        }

                        this.field_1244 = var5 + var5 - 1 - this.field_1244;
                        this.field_1243 = -this.field_1243;
                     } while(--this.field_1249 != 0);
                  }
               } else {
                  int var10;
                  if(this.field_1243 < 0) {
                     while(true) {
                        var9 = this.method_2089(var1, var9, var5, var3, var4.field_1266[this.field_1251 - 1]);
                        if(this.field_1244 >= var5) {
                           return;
                        }

                        var10 = (var6 - 1 - this.field_1244) / var8;
                        if(var10 >= this.field_1249) {
                           this.field_1244 += var8 * this.field_1249;
                           this.field_1249 = 0;
                           break;
                        }

                        this.field_1244 += var8 * var10;
                        this.field_1249 -= var10;
                     }
                  } else {
                     while(true) {
                        var9 = this.method_2088(var1, var9, var6, var3, var4.field_1266[this.field_1250]);
                        if(this.field_1244 < var6) {
                           return;
                        }

                        var10 = (this.field_1244 - var5) / var8;
                        if(var10 >= this.field_1249) {
                           this.field_1244 -= var8 * this.field_1249;
                           this.field_1249 = 0;
                           break;
                        }

                        this.field_1244 -= var8 * var10;
                        this.field_1249 -= var10;
                     }
                  }
               }
            }

            if(this.field_1243 < 0) {
               this.method_2089(var1, var9, 0, var3, 0);
               if(this.field_1244 < 0) {
                  this.field_1244 = -1;
                  this.method_2081();
                  this.method_108();
               }
            } else {
               this.method_2088(var1, var9, var7, var3, 0);
               if(this.field_1244 >= var7) {
                  this.field_1244 = var7;
                  this.method_2081();
                  this.method_108();
               }
            }

         }
      }
   }

   // $FF: renamed from: eu (int, byte[], int[], int, int, int, int, int, int, int, int, int, bv) int
   static int method_2104(byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, class_107 var12) {
      var3 >>= 8;
      var11 >>= 8;
      var5 <<= 2;
      var6 <<= 2;
      var7 <<= 2;
      var8 <<= 2;
      if((var9 = var4 + var11 - var3) > var10) {
         var9 = var10;
      }

      var12.field_1252 += var12.field_1254 * (var9 - var4);
      var4 <<= 1;
      var9 <<= 1;

      byte var13;
      int var10001;
      for(var9 -= 6; var4 < var9; var6 += var8) {
         var13 = var1[var3++];
         var10001 = var4++;
         var2[var10001] += var13 * var5;
         var5 += var7;
         var10001 = var4++;
         var2[var10001] += var13 * var6;
         var6 += var8;
         var13 = var1[var3++];
         var10001 = var4++;
         var2[var10001] += var13 * var5;
         var5 += var7;
         var10001 = var4++;
         var2[var10001] += var13 * var6;
         var6 += var8;
         var13 = var1[var3++];
         var10001 = var4++;
         var2[var10001] += var13 * var5;
         var5 += var7;
         var10001 = var4++;
         var2[var10001] += var13 * var6;
         var6 += var8;
         var13 = var1[var3++];
         var10001 = var4++;
         var2[var10001] += var13 * var5;
         var5 += var7;
         var10001 = var4++;
         var2[var10001] += var13 * var6;
      }

      for(var9 += 6; var4 < var9; var6 += var8) {
         var13 = var1[var3++];
         var10001 = var4++;
         var2[var10001] += var13 * var5;
         var5 += var7;
         var10001 = var4++;
         var2[var10001] += var13 * var6;
      }

      var12.field_1247 = var5 >> 2;
      var12.field_1248 = var6 >> 2;
      var12.field_1244 = var3 << 8;
      return var4 >> 1;
   }

   // $FF: renamed from: dk (int, byte[], int[], int, int, int, int, int, int, int, bv) int
   static int method_2105(byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, class_107 var10) {
      var3 >>= 8;
      var9 >>= 8;
      var5 <<= 2;
      var6 <<= 2;
      if((var7 = var4 + var9 - var3) > var8) {
         var7 = var8;
      }

      var4 <<= 1;
      var7 <<= 1;

      int var10001;
      byte var11;
      for(var7 -= 6; var4 < var7; var2[var10001] += var11 * var6) {
         var11 = var1[var3++];
         var10001 = var4++;
         var2[var10001] += var11 * var5;
         var10001 = var4++;
         var2[var10001] += var11 * var6;
         var11 = var1[var3++];
         var10001 = var4++;
         var2[var10001] += var11 * var5;
         var10001 = var4++;
         var2[var10001] += var11 * var6;
         var11 = var1[var3++];
         var10001 = var4++;
         var2[var10001] += var11 * var5;
         var10001 = var4++;
         var2[var10001] += var11 * var6;
         var11 = var1[var3++];
         var10001 = var4++;
         var2[var10001] += var11 * var5;
         var10001 = var4++;
      }

      for(var7 += 6; var4 < var7; var2[var10001] += var11 * var6) {
         var11 = var1[var3++];
         var10001 = var4++;
         var2[var10001] += var11 * var5;
         var10001 = var4++;
      }

      var10.field_1244 = var3 << 8;
      return var4 >> 1;
   }

   // $FF: renamed from: ah () int
   int method_1932() {
      int var1 = this.field_1252 * 3 >> 6;
      var1 = (var1 ^ var1 >> 31) + (var1 >>> 31);
      if(this.field_1249 == 0) {
         var1 -= var1 * this.field_1244 / (((class_110)this.field_1205).field_1266.length << 8);
      } else if(this.field_1249 >= 0) {
         var1 -= var1 * this.field_1250 / ((class_110)this.field_1205).field_1266.length;
      }

      return var1 > 255?255:var1;
   }

   // $FF: renamed from: r () bm
   protected class_104 method_1947() {
      return null;
   }

   // $FF: renamed from: ap () bm
   protected class_104 method_1934() {
      return null;
   }

   // $FF: renamed from: k (boolean) void
   public synchronized void method_2107(boolean var1) {
      this.field_1243 = (this.field_1243 ^ this.field_1243 >> 31) + (this.field_1243 >>> 31);
      if(var1) {
         this.field_1243 = -this.field_1243;
      }

   }

   // $FF: renamed from: al () int
   protected int method_1941() {
      return this.field_1245 == 0 && this.field_1253 == 0?0:1;
   }

   // $FF: renamed from: ad () int
   protected int method_1944() {
      return this.field_1245 == 0 && this.field_1253 == 0?0:1;
   }

   // $FF: renamed from: ai (int[], int, int) void
   public synchronized void method_1945(int[] var1, int var2, int var3) {
      if(this.field_1245 == 0 && this.field_1253 == 0) {
         this.method_1933(var3);
      } else {
         class_110 var4 = (class_110)this.field_1205;
         int var5 = this.field_1250 << 8;
         int var6 = this.field_1251 << 8;
         int var7 = var4.field_1266.length << 8;
         int var8 = var6 - var5;
         if(var8 <= 0) {
            this.field_1249 = 0;
         }

         int var9 = var2;
         var3 += var2;
         if(this.field_1244 < 0) {
            if(this.field_1243 <= 0) {
               this.method_2081();
               this.method_108();
               return;
            }

            this.field_1244 = 0;
         }

         if(this.field_1244 >= var7) {
            if(this.field_1243 >= 0) {
               this.method_2081();
               this.method_108();
               return;
            }

            this.field_1244 = var7 - 1;
         }

         if(this.field_1249 < 0) {
            if(this.field_1246) {
               if(this.field_1243 < 0) {
                  var9 = this.method_2089(var1, var2, var5, var3, var4.field_1266[this.field_1250]);
                  if(this.field_1244 >= var5) {
                     return;
                  }

                  this.field_1244 = var5 + var5 - 1 - this.field_1244;
                  this.field_1243 = -this.field_1243;
               }

               while(true) {
                  var9 = this.method_2088(var1, var9, var6, var3, var4.field_1266[this.field_1251 - 1]);
                  if(this.field_1244 < var6) {
                     return;
                  }

                  this.field_1244 = var6 + var6 - 1 - this.field_1244;
                  this.field_1243 = -this.field_1243;
                  var9 = this.method_2089(var1, var9, var5, var3, var4.field_1266[this.field_1250]);
                  if(this.field_1244 >= var5) {
                     return;
                  }

                  this.field_1244 = var5 + var5 - 1 - this.field_1244;
                  this.field_1243 = -this.field_1243;
               }
            } else if(this.field_1243 < 0) {
               while(true) {
                  var9 = this.method_2089(var1, var9, var5, var3, var4.field_1266[this.field_1251 - 1]);
                  if(this.field_1244 >= var5) {
                     return;
                  }

                  this.field_1244 = var6 - 1 - (var6 - 1 - this.field_1244) % var8;
               }
            } else {
               while(true) {
                  var9 = this.method_2088(var1, var9, var6, var3, var4.field_1266[this.field_1250]);
                  if(this.field_1244 < var6) {
                     return;
                  }

                  this.field_1244 = var5 + (this.field_1244 - var5) % var8;
               }
            }
         } else {
            if(this.field_1249 > 0) {
               if(this.field_1246) {
                  label186: {
                     if(this.field_1243 < 0) {
                        var9 = this.method_2089(var1, var2, var5, var3, var4.field_1266[this.field_1250]);
                        if(this.field_1244 >= var5) {
                           return;
                        }

                        this.field_1244 = var5 + var5 - 1 - this.field_1244;
                        this.field_1243 = -this.field_1243;
                        if(--this.field_1249 == 0) {
                           break label186;
                        }
                     }

                     do {
                        var9 = this.method_2088(var1, var9, var6, var3, var4.field_1266[this.field_1251 - 1]);
                        if(this.field_1244 < var6) {
                           return;
                        }

                        this.field_1244 = var6 + var6 - 1 - this.field_1244;
                        this.field_1243 = -this.field_1243;
                        if(--this.field_1249 == 0) {
                           break;
                        }

                        var9 = this.method_2089(var1, var9, var5, var3, var4.field_1266[this.field_1250]);
                        if(this.field_1244 >= var5) {
                           return;
                        }

                        this.field_1244 = var5 + var5 - 1 - this.field_1244;
                        this.field_1243 = -this.field_1243;
                     } while(--this.field_1249 != 0);
                  }
               } else {
                  int var10;
                  if(this.field_1243 < 0) {
                     while(true) {
                        var9 = this.method_2089(var1, var9, var5, var3, var4.field_1266[this.field_1251 - 1]);
                        if(this.field_1244 >= var5) {
                           return;
                        }

                        var10 = (var6 - 1 - this.field_1244) / var8;
                        if(var10 >= this.field_1249) {
                           this.field_1244 += var8 * this.field_1249;
                           this.field_1249 = 0;
                           break;
                        }

                        this.field_1244 += var8 * var10;
                        this.field_1249 -= var10;
                     }
                  } else {
                     while(true) {
                        var9 = this.method_2088(var1, var9, var6, var3, var4.field_1266[this.field_1250]);
                        if(this.field_1244 < var6) {
                           return;
                        }

                        var10 = (this.field_1244 - var5) / var8;
                        if(var10 >= this.field_1249) {
                           this.field_1244 -= var8 * this.field_1249;
                           this.field_1249 = 0;
                           break;
                        }

                        this.field_1244 -= var8 * var10;
                        this.field_1249 -= var10;
                     }
                  }
               }
            }

            if(this.field_1243 < 0) {
               this.method_2089(var1, var9, 0, var3, 0);
               if(this.field_1244 < 0) {
                  this.field_1244 = -1;
                  this.method_2081();
                  this.method_108();
               }
            } else {
               this.method_2088(var1, var9, var7, var3, 0);
               if(this.field_1244 >= var7) {
                  this.field_1244 = var7;
                  this.method_2081();
                  this.method_108();
               }
            }

         }
      }
   }

   // $FF: renamed from: v (int, int) int
   static int method_2108(int var0, int var1) {
      return var1 < 0?var0:(int)((double)var0 * Math.sqrt((double)(16384 - var1) * 1.220703125E-4D) + 0.5D);
   }

   // $FF: renamed from: aj (int) void
   public synchronized void method_1950(int var1) {
      if(this.field_1253 > 0) {
         if(var1 >= this.field_1253) {
            if(this.field_1245 == Integer.MIN_VALUE) {
               this.field_1245 = 0;
               this.field_1248 = 0;
               this.field_1247 = 0;
               this.field_1252 = 0;
               this.method_108();
               var1 = this.field_1253;
            }

            this.field_1253 = 0;
            this.method_2073();
         } else {
            this.field_1252 += this.field_1254 * var1;
            this.field_1247 += this.field_1255 * var1;
            this.field_1248 += this.field_1256 * var1;
            this.field_1253 -= var1;
         }
      }

      class_110 var2 = (class_110)this.field_1205;
      int var3 = this.field_1250 << 8;
      int var4 = this.field_1251 << 8;
      int var5 = var2.field_1266.length << 8;
      int var6 = var4 - var3;
      if(var6 <= 0) {
         this.field_1249 = 0;
      }

      if(this.field_1244 < 0) {
         if(this.field_1243 <= 0) {
            this.method_2081();
            this.method_108();
            return;
         }

         this.field_1244 = 0;
      }

      if(this.field_1244 >= var5) {
         if(this.field_1243 >= 0) {
            this.method_2081();
            this.method_108();
            return;
         }

         this.field_1244 = var5 - 1;
      }

      this.field_1244 += this.field_1243 * var1;
      if(this.field_1249 < 0) {
         if(!this.field_1246) {
            if(this.field_1243 < 0) {
               if(this.field_1244 >= var3) {
                  return;
               }

               this.field_1244 = var4 - 1 - (var4 - 1 - this.field_1244) % var6;
            } else {
               if(this.field_1244 < var4) {
                  return;
               }

               this.field_1244 = var3 + (this.field_1244 - var3) % var6;
            }

         } else {
            if(this.field_1243 < 0) {
               if(this.field_1244 >= var3) {
                  return;
               }

               this.field_1244 = var3 + var3 - 1 - this.field_1244;
               this.field_1243 = -this.field_1243;
            }

            while(this.field_1244 >= var4) {
               this.field_1244 = var4 + var4 - 1 - this.field_1244;
               this.field_1243 = -this.field_1243;
               if(this.field_1244 >= var3) {
                  return;
               }

               this.field_1244 = var3 + var3 - 1 - this.field_1244;
               this.field_1243 = -this.field_1243;
            }

         }
      } else {
         if(this.field_1249 > 0) {
            if(this.field_1246) {
               label171: {
                  if(this.field_1243 < 0) {
                     if(this.field_1244 >= var3) {
                        return;
                     }

                     this.field_1244 = var3 + var3 - 1 - this.field_1244;
                     this.field_1243 = -this.field_1243;
                     if(--this.field_1249 == 0) {
                        break label171;
                     }
                  }

                  do {
                     if(this.field_1244 < var4) {
                        return;
                     }

                     this.field_1244 = var4 + var4 - 1 - this.field_1244;
                     this.field_1243 = -this.field_1243;
                     if(--this.field_1249 == 0) {
                        break;
                     }

                     if(this.field_1244 >= var3) {
                        return;
                     }

                     this.field_1244 = var3 + var3 - 1 - this.field_1244;
                     this.field_1243 = -this.field_1243;
                  } while(--this.field_1249 != 0);
               }
            } else {
               label181: {
                  int var7;
                  if(this.field_1243 < 0) {
                     if(this.field_1244 >= var3) {
                        return;
                     }

                     var7 = (var4 - 1 - this.field_1244) / var6;
                     if(var7 >= this.field_1249) {
                        this.field_1244 += var6 * this.field_1249;
                        this.field_1249 = 0;
                        break label181;
                     }

                     this.field_1244 += var6 * var7;
                     this.field_1249 -= var7;
                  } else {
                     if(this.field_1244 < var4) {
                        return;
                     }

                     var7 = (this.field_1244 - var3) / var6;
                     if(var7 >= this.field_1249) {
                        this.field_1244 -= var6 * this.field_1249;
                        this.field_1249 = 0;
                        break label181;
                     }

                     this.field_1244 -= var6 * var7;
                     this.field_1249 -= var7;
                  }

                  return;
               }
            }
         }

         if(this.field_1243 < 0) {
            if(this.field_1244 < 0) {
               this.field_1244 = -1;
               this.method_2081();
               this.method_108();
            }
         } else if(this.field_1244 >= var5) {
            this.field_1244 = var5;
            this.method_2081();
            this.method_108();
         }

      }
   }

   // $FF: renamed from: am (int) void
   public synchronized void method_1948(int var1) {
      if(this.field_1253 > 0) {
         if(var1 >= this.field_1253) {
            if(this.field_1245 == Integer.MIN_VALUE) {
               this.field_1245 = 0;
               this.field_1248 = 0;
               this.field_1247 = 0;
               this.field_1252 = 0;
               this.method_108();
               var1 = this.field_1253;
            }

            this.field_1253 = 0;
            this.method_2073();
         } else {
            this.field_1252 += this.field_1254 * var1;
            this.field_1247 += this.field_1255 * var1;
            this.field_1248 += this.field_1256 * var1;
            this.field_1253 -= var1;
         }
      }

      class_110 var2 = (class_110)this.field_1205;
      int var3 = this.field_1250 << 8;
      int var4 = this.field_1251 << 8;
      int var5 = var2.field_1266.length << 8;
      int var6 = var4 - var3;
      if(var6 <= 0) {
         this.field_1249 = 0;
      }

      if(this.field_1244 < 0) {
         if(this.field_1243 <= 0) {
            this.method_2081();
            this.method_108();
            return;
         }

         this.field_1244 = 0;
      }

      if(this.field_1244 >= var5) {
         if(this.field_1243 >= 0) {
            this.method_2081();
            this.method_108();
            return;
         }

         this.field_1244 = var5 - 1;
      }

      this.field_1244 += this.field_1243 * var1;
      if(this.field_1249 < 0) {
         if(!this.field_1246) {
            if(this.field_1243 < 0) {
               if(this.field_1244 >= var3) {
                  return;
               }

               this.field_1244 = var4 - 1 - (var4 - 1 - this.field_1244) % var6;
            } else {
               if(this.field_1244 < var4) {
                  return;
               }

               this.field_1244 = var3 + (this.field_1244 - var3) % var6;
            }

         } else {
            if(this.field_1243 < 0) {
               if(this.field_1244 >= var3) {
                  return;
               }

               this.field_1244 = var3 + var3 - 1 - this.field_1244;
               this.field_1243 = -this.field_1243;
            }

            while(this.field_1244 >= var4) {
               this.field_1244 = var4 + var4 - 1 - this.field_1244;
               this.field_1243 = -this.field_1243;
               if(this.field_1244 >= var3) {
                  return;
               }

               this.field_1244 = var3 + var3 - 1 - this.field_1244;
               this.field_1243 = -this.field_1243;
            }

         }
      } else {
         if(this.field_1249 > 0) {
            if(this.field_1246) {
               label176: {
                  if(this.field_1243 < 0) {
                     if(this.field_1244 >= var3) {
                        return;
                     }

                     this.field_1244 = var3 + var3 - 1 - this.field_1244;
                     this.field_1243 = -this.field_1243;
                     if(--this.field_1249 == 0) {
                        break label176;
                     }
                  }

                  do {
                     if(this.field_1244 < var4) {
                        return;
                     }

                     this.field_1244 = var4 + var4 - 1 - this.field_1244;
                     this.field_1243 = -this.field_1243;
                     if(--this.field_1249 == 0) {
                        break;
                     }

                     if(this.field_1244 >= var3) {
                        return;
                     }

                     this.field_1244 = var3 + var3 - 1 - this.field_1244;
                     this.field_1243 = -this.field_1243;
                  } while(--this.field_1249 != 0);
               }
            } else {
               label186: {
                  int var7;
                  if(this.field_1243 < 0) {
                     if(this.field_1244 >= var3) {
                        return;
                     }

                     var7 = (var4 - 1 - this.field_1244) / var6;
                     if(var7 >= this.field_1249) {
                        this.field_1244 += var6 * this.field_1249;
                        this.field_1249 = 0;
                        break label186;
                     }

                     this.field_1244 += var6 * var7;
                     this.field_1249 -= var7;
                  } else {
                     if(this.field_1244 < var4) {
                        return;
                     }

                     var7 = (this.field_1244 - var3) / var6;
                     if(var7 >= this.field_1249) {
                        this.field_1244 -= var6 * this.field_1249;
                        this.field_1249 = 0;
                        break label186;
                     }

                     this.field_1244 -= var6 * var7;
                     this.field_1249 -= var7;
                  }

                  return;
               }
            }
         }

         if(this.field_1243 < 0) {
            if(this.field_1244 < 0) {
               this.field_1244 = -1;
               this.method_2081();
               this.method_108();
            }
         } else if(this.field_1244 >= var5) {
            this.field_1244 = var5;
            this.method_2081();
            this.method_108();
         }

      }
   }

   // $FF: renamed from: az (int) void
   public synchronized void method_1949(int var1) {
      if(this.field_1253 > 0) {
         if(var1 >= this.field_1253) {
            if(this.field_1245 == -2144054552) {
               this.field_1245 = 0;
               this.field_1248 = 0;
               this.field_1247 = 0;
               this.field_1252 = 0;
               this.method_108();
               var1 = this.field_1253;
            }

            this.field_1253 = 0;
            this.method_2073();
         } else {
            this.field_1252 += this.field_1254 * var1;
            this.field_1247 += this.field_1255 * var1;
            this.field_1248 += this.field_1256 * var1;
            this.field_1253 -= var1;
         }
      }

      class_110 var2 = (class_110)this.field_1205;
      int var3 = this.field_1250 << 8;
      int var4 = this.field_1251 << 8;
      int var5 = var2.field_1266.length << 8;
      int var6 = var4 - var3;
      if(var6 <= 0) {
         this.field_1249 = 0;
      }

      if(this.field_1244 < 0) {
         if(this.field_1243 <= 0) {
            this.method_2081();
            this.method_108();
            return;
         }

         this.field_1244 = 0;
      }

      if(this.field_1244 >= var5) {
         if(this.field_1243 >= 0) {
            this.method_2081();
            this.method_108();
            return;
         }

         this.field_1244 = var5 - 1;
      }

      this.field_1244 += this.field_1243 * var1;
      if(this.field_1249 < 0) {
         if(!this.field_1246) {
            if(this.field_1243 < 0) {
               if(this.field_1244 >= var3) {
                  return;
               }

               this.field_1244 = var4 - 1 - (var4 - 1 - this.field_1244) % var6;
            } else {
               if(this.field_1244 < var4) {
                  return;
               }

               this.field_1244 = var3 + (this.field_1244 - var3) % var6;
            }

         } else {
            if(this.field_1243 < 0) {
               if(this.field_1244 >= var3) {
                  return;
               }

               this.field_1244 = var3 + var3 - 1 - this.field_1244;
               this.field_1243 = -this.field_1243;
            }

            while(this.field_1244 >= var4) {
               this.field_1244 = var4 + var4 - 1 - this.field_1244;
               this.field_1243 = -this.field_1243;
               if(this.field_1244 >= var3) {
                  return;
               }

               this.field_1244 = var3 + var3 - 1 - this.field_1244;
               this.field_1243 = -this.field_1243;
            }

         }
      } else {
         if(this.field_1249 > 0) {
            if(this.field_1246) {
               label166: {
                  if(this.field_1243 < 0) {
                     if(this.field_1244 >= var3) {
                        return;
                     }

                     this.field_1244 = var3 + var3 - 1 - this.field_1244;
                     this.field_1243 = -this.field_1243;
                     if(--this.field_1249 == 0) {
                        break label166;
                     }
                  }

                  do {
                     if(this.field_1244 < var4) {
                        return;
                     }

                     this.field_1244 = var4 + var4 - 1 - this.field_1244;
                     this.field_1243 = -this.field_1243;
                     if(--this.field_1249 == 0) {
                        break;
                     }

                     if(this.field_1244 >= var3) {
                        return;
                     }

                     this.field_1244 = var3 + var3 - 1 - this.field_1244;
                     this.field_1243 = -this.field_1243;
                  } while(--this.field_1249 != 0);
               }
            } else {
               label176: {
                  int var7;
                  if(this.field_1243 < 0) {
                     if(this.field_1244 >= var3) {
                        return;
                     }

                     var7 = (var4 - 1 - this.field_1244) / var6;
                     if(var7 >= this.field_1249) {
                        this.field_1244 += var6 * this.field_1249;
                        this.field_1249 = 0;
                        break label176;
                     }

                     this.field_1244 += var6 * var7;
                     this.field_1249 -= var7;
                  } else {
                     if(this.field_1244 < var4) {
                        return;
                     }

                     var7 = (this.field_1244 - var3) / var6;
                     if(var7 >= this.field_1249) {
                        this.field_1244 -= var6 * this.field_1249;
                        this.field_1249 = 0;
                        break label176;
                     }

                     this.field_1244 -= var6 * var7;
                     this.field_1249 -= var7;
                  }

                  return;
               }
            }
         }

         if(this.field_1243 < 0) {
            if(this.field_1244 < 0) {
               this.field_1244 = -1;
               this.method_2081();
               this.method_108();
            }
         } else if(this.field_1244 >= var5) {
            this.field_1244 = var5;
            this.method_2081();
            this.method_108();
         }

      }
   }

   // $FF: renamed from: a (int) void
   public synchronized void method_2113(int var1) {
      int var2 = ((class_110)this.field_1205).field_1266.length << 8;
      if(var1 < -1) {
         var1 = -1;
      }

      if(var1 > var2) {
         var1 = var2;
      }

      this.field_1244 = var1;
   }

   // $FF: renamed from: bf () int
   int method_1940() {
      int var1 = this.field_1252 * 3 >> 6;
      var1 = (var1 ^ var1 >> 31) + (var1 >>> 31);
      if(this.field_1249 == 0) {
         var1 -= var1 * this.field_1244 / (((class_110)this.field_1205).field_1266.length << 8);
      } else if(this.field_1249 >= 0) {
         var1 -= var1 * this.field_1250 / ((class_110)this.field_1205).field_1266.length;
      }

      return var1 > 255?255:var1;
   }

   // $FF: renamed from: et (int, int, byte[], int[], int, int, int, int, int, int, int, bv, int, int) int
   static int method_2124(int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, class_107 var11, int var12, int var13) {
      var11.field_1247 -= var11.field_1255 * var5;
      var11.field_1248 -= var11.field_1256 * var5;
      if(var12 == 0 || (var8 = var5 + (var10 - var4 + var12 - 1513308860) / var12) > var9) {
         var8 = var9;
      }

      byte var14;
      int var10001;
      while(var5 < var8) {
         var1 = var4 >> 8;
         var14 = var2[var1];
         var10001 = var5++;
         var3[var10001] += ((var14 << 8) + (var2[var1 + 1] - var14) * (var4 & 255)) * var6 >> 6;
         var6 += var7;
         var4 += var12;
      }

      if(var12 == 0 || (var8 = var5 + (var10 - var4 + var12 - 1) / var12) > var9) {
         var8 = var9;
      }

      for(var1 = var13; var5 < var8; var4 += var12) {
         var14 = var2[var4 >> 8];
         var10001 = var5++;
         var3[var10001] += ((var14 << 8) + (var1 - var14) * (var4 & 255)) * var6 >> 6;
         var6 += var7;
      }

      var11.field_1247 += var11.field_1255 * var5;
      var11.field_1248 += var11.field_1256 * var5;
      var11.field_1252 = var6;
      var11.field_1244 = var4;
      return var5;
   }

   // $FF: renamed from: e () int
   public synchronized int method_2126() {
      return this.field_1245 == Integer.MIN_VALUE?0:this.field_1245;
   }

   // $FF: renamed from: bv (int, int, byte[], int[], int, int, int, int, int, int, int, int, int, bv, int, int) int
   static int method_2129(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, class_107 var13, int var14, int var15) {
      var13.field_1252 -= var13.field_1254 * var5;
      if(var14 == 0 || (var10 = var5 + (var12 + 256 - var4 + var14) / var14) > var11) {
         var10 = var11;
      }

      var5 <<= 1;

      int var10001;
      for(var10 <<= 1; var5 < var10; var4 += var14) {
         var1 = var4 >> 8;
         byte var16 = var2[var1 - 1];
         var0 = (var16 << 8) + (var2[var1] - var16) * (var4 & 255);
         var10001 = var5++;
         var3[var10001] += var0 * var6 >> 6;
         var6 += var8;
         var10001 = var5++;
         var3[var10001] += var0 * var7 >> 6;
         var7 += var9;
      }

      if(var14 == 0 || (var10 = (var5 >> 1) + (var12 - var4 + var14) / var14) > var11) {
         var10 = var11;
      }

      var10 <<= 1;

      for(var1 = var15; var5 < var10; var4 += var14) {
         var0 = (var1 << 8) + (var2[var4 >> 8] - var1) * (var4 & 255);
         var10001 = var5++;
         var3[var10001] += var0 * var6 >> 6;
         var6 += var8;
         var10001 = var5++;
         var3[var10001] += var0 * var7 >> 6;
         var7 += var9;
      }

      var5 >>= 1;
      var13.field_1252 += var13.field_1254 * var5;
      var13.field_1247 = var6;
      var13.field_1248 = var7;
      var13.field_1244 = var4;
      return var5;
   }

   // $FF: renamed from: dc (int, byte[], int[], int, int, int, int, int, int, int, bv) int
   static int method_2159(byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, class_107 var10) {
      var3 >>= 8;
      var9 >>= 8;
      var5 <<= 2;
      var6 <<= 2;
      if((var7 = var4 + var9 - var3) > var8) {
         var7 = var8;
      }

      var4 <<= 1;
      var7 <<= 1;

      int var10001;
      byte var11;
      for(var7 -= 6; var4 < var7; var2[var10001] += var11 * var6) {
         var11 = var1[var3++];
         var10001 = var4++;
         var2[var10001] += var11 * var5;
         var10001 = var4++;
         var2[var10001] += var11 * var6;
         var11 = var1[var3++];
         var10001 = var4++;
         var2[var10001] += var11 * var5;
         var10001 = var4++;
         var2[var10001] += var11 * var6;
         var11 = var1[var3++];
         var10001 = var4++;
         var2[var10001] += var11 * var5;
         var10001 = var4++;
         var2[var10001] += var11 * var6;
         var11 = var1[var3++];
         var10001 = var4++;
         var2[var10001] += var11 * var5;
         var10001 = var4++;
      }

      for(var7 += 6; var4 < var7; var2[var10001] += var11 * var6) {
         var11 = var1[var3++];
         var10001 = var4++;
         var2[var10001] += var11 * var5;
         var10001 = var4++;
      }

      var10.field_1244 = var3 << 8;
      return var4 >> 1;
   }

   // $FF: renamed from: n (int, int) int
   static int method_2161(int var0, int var1) {
      return var1 < 0?-var0:(int)((double)var0 * Math.sqrt((double)var1 * 1.220703125E-4D) + 0.5D);
   }

   // $FF: renamed from: df (int, byte[], int[], int, int, int, int, int, int, int, bv) int
   static int method_2163(byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, class_107 var10) {
      var3 >>= 8;
      var9 >>= 8;
      var5 <<= 2;
      var6 <<= 2;
      if((var7 = var4 + var3 - (var9 - 1)) > var8) {
         var7 = var8;
      }

      var4 <<= 1;
      var7 <<= 1;

      int var10001;
      byte var11;
      for(var7 -= 6; var4 < var7; var2[var10001] += var11 * var6) {
         var11 = var1[var3--];
         var10001 = var4++;
         var2[var10001] += var11 * var5;
         var10001 = var4++;
         var2[var10001] += var11 * var6;
         var11 = var1[var3--];
         var10001 = var4++;
         var2[var10001] += var11 * var5;
         var10001 = var4++;
         var2[var10001] += var11 * var6;
         var11 = var1[var3--];
         var10001 = var4++;
         var2[var10001] += var11 * var5;
         var10001 = var4++;
         var2[var10001] += var11 * var6;
         var11 = var1[var3--];
         var10001 = var4++;
         var2[var10001] += var11 * var5;
         var10001 = var4++;
      }

      for(var7 += 6; var4 < var7; var2[var10001] += var11 * var6) {
         var11 = var1[var3--];
         var10001 = var4++;
         var2[var10001] += var11 * var5;
         var10001 = var4++;
      }

      var10.field_1244 = var3 << 8;
      return var4 >> 1;
   }

   // $FF: renamed from: dv (int, byte[], int[], int, int, int, int, int, int, int, bv) int
   static int method_2164(byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, class_107 var10) {
      var3 >>= 8;
      var9 >>= 8;
      var5 <<= 2;
      var6 <<= 2;
      if((var7 = var4 + var3 - (var9 - 1)) > var8) {
         var7 = var8;
      }

      var4 <<= 1;
      var7 <<= 1;

      int var10001;
      byte var11;
      for(var7 -= 6; var4 < var7; var2[var10001] += var11 * var6) {
         var11 = var1[var3--];
         var10001 = var4++;
         var2[var10001] += var11 * var5;
         var10001 = var4++;
         var2[var10001] += var11 * var6;
         var11 = var1[var3--];
         var10001 = var4++;
         var2[var10001] += var11 * var5;
         var10001 = var4++;
         var2[var10001] += var11 * var6;
         var11 = var1[var3--];
         var10001 = var4++;
         var2[var10001] += var11 * var5;
         var10001 = var4++;
         var2[var10001] += var11 * var6;
         var11 = var1[var3--];
         var10001 = var4++;
         var2[var10001] += var11 * var5;
         var10001 = var4++;
      }

      for(var7 += 6; var4 < var7; var2[var10001] += var11 * var6) {
         var11 = var1[var3--];
         var10001 = var4++;
         var2[var10001] += var11 * var5;
         var10001 = var4++;
      }

      var10.field_1244 = var3 << 8;
      return var4 >> 1;
   }

   // $FF: renamed from: dd (int, byte[], int[], int, int, int, int, int, int, int, bv) int
   static int method_2166(byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, class_107 var10) {
      var3 >>= 8;
      var9 >>= 8;
      var5 <<= 2;
      var6 <<= 2;
      if((var7 = var4 + var3 - (var9 - 1)) > var8) {
         var7 = var8;
      }

      var4 <<= 1;
      var7 <<= 1;

      int var10001;
      byte var11;
      for(var7 -= 6; var4 < var7; var2[var10001] += var11 * var6) {
         var11 = var1[var3--];
         var10001 = var4++;
         var2[var10001] += var11 * var5;
         var10001 = var4++;
         var2[var10001] += var11 * var6;
         var11 = var1[var3--];
         var10001 = var4++;
         var2[var10001] += var11 * var5;
         var10001 = var4++;
         var2[var10001] += var11 * var6;
         var11 = var1[var3--];
         var10001 = var4++;
         var2[var10001] += var11 * var5;
         var10001 = var4++;
         var2[var10001] += var11 * var6;
         var11 = var1[var3--];
         var10001 = var4++;
         var2[var10001] += var11 * var5;
         var10001 = var4++;
      }

      for(var7 += 6; var4 < var7; var2[var10001] += var11 * var6) {
         var11 = var1[var3--];
         var10001 = var4++;
         var2[var10001] += var11 * var5;
         var10001 = var4++;
      }

      var10.field_1244 = var3 << 8;
      return var4 >> 1;
   }

   // $FF: renamed from: da (int, byte[], int[], int, int, int, int, int, int, int, bv) int
   static int method_2167(byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, class_107 var10) {
      var3 >>= 8;
      var9 >>= 8;
      var5 <<= 2;
      var6 <<= 2;
      if((var7 = var4 + var3 - (var9 - 1)) > var8) {
         var7 = var8;
      }

      var4 <<= 1;
      var7 <<= 1;

      int var10001;
      byte var11;
      for(var7 -= 6; var4 < var7; var2[var10001] += var11 * var6) {
         var11 = var1[var3--];
         var10001 = var4++;
         var2[var10001] += var11 * var5;
         var10001 = var4++;
         var2[var10001] += var11 * var6;
         var11 = var1[var3--];
         var10001 = var4++;
         var2[var10001] += var11 * var5;
         var10001 = var4++;
         var2[var10001] += var11 * var6;
         var11 = var1[var3--];
         var10001 = var4++;
         var2[var10001] += var11 * var5;
         var10001 = var4++;
         var2[var10001] += var11 * var6;
         var11 = var1[var3--];
         var10001 = var4++;
         var2[var10001] += var11 * var5;
         var10001 = var4++;
      }

      for(var7 += 6; var4 < var7; var2[var10001] += var11 * var6) {
         var11 = var1[var3--];
         var10001 = var4++;
         var2[var10001] += var11 * var5;
         var10001 = var4++;
      }

      var10.field_1244 = var3 << 8;
      return var4 >> 1;
   }

   // $FF: renamed from: dx (int, int, byte[], int[], int, int, int, int, int, int, bv, int, int) int
   static int method_2168(int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, class_107 var10, int var11, int var12) {
      if(var11 == 0 || (var7 = var5 + (var9 - var4 + var11 - 2013145321) / var11) > var8) {
         var7 = var8;
      }

      byte var13;
      int var10001;
      while(var5 < var7) {
         var1 = var4 >> 8;
         var13 = var2[var1];
         var10001 = var5++;
         var3[var10001] += ((var13 << 8) + (var2[var1 + 1] - var13) * (var4 & 255)) * var6 >> 6;
         var4 += var11;
      }

      if(var11 == 0 || (var7 = var5 + (var9 - var4 + var11 - 1) / var11) > var8) {
         var7 = var8;
      }

      for(var1 = var12; var5 < var7; var4 += var11) {
         var13 = var2[var4 >> 8];
         var10001 = var5++;
         var3[var10001] += ((var13 << 8) + (var1 - var13) * (var4 & -1456411884)) * var6 >> 6;
      }

      var10.field_1244 = var4;
      return var5;
   }

   // $FF: renamed from: t (int) void
   public synchronized void method_2171(int var1) {
      if(this.field_1243 < 0) {
         this.field_1243 = -var1;
      } else {
         this.field_1243 = var1;
      }

   }

   // $FF: renamed from: bu (int, int, byte[], int[], int, int, int, int, int, int, int, int, int, bv, int, int) int
   static int method_2174(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, class_107 var13, int var14, int var15) {
      var13.field_1252 -= var13.field_1254 * var5;
      if(var14 == 0 || (var10 = var5 + (var12 - var4 + var14 - 257) / var14) > var11) {
         var10 = var11;
      }

      var5 <<= 1;

      byte var16;
      int var10001;
      for(var10 <<= 1; var5 < var10; var4 += var14) {
         var1 = var4 >> 8;
         var16 = var2[var1];
         var0 = (var16 << 8) + (var2[var1 + 1] - var16) * (var4 & 255);
         var10001 = var5++;
         var3[var10001] += var0 * var6 >> 6;
         var6 += var8;
         var10001 = var5++;
         var3[var10001] += var0 * var7 >> 6;
         var7 += var9;
      }

      if(var14 == 0 || (var10 = (var5 >> 1) + (var12 - var4 + var14 - 1) / var14) > var11) {
         var10 = var11;
      }

      var10 <<= 1;

      for(var1 = var15; var5 < var10; var4 += var14) {
         var16 = var2[var4 >> 8];
         var0 = (var16 << 8) + (var1 - var16) * (var4 & 255);
         var10001 = var5++;
         var3[var10001] += var0 * var6 >> 6;
         var6 += var8;
         var10001 = var5++;
         var3[var10001] += var0 * var7 >> 6;
         var7 += var9;
      }

      var5 >>= 1;
      var13.field_1252 += var13.field_1254 * var5;
      var13.field_1247 = var6;
      var13.field_1248 = var7;
      var13.field_1244 = var4;
      return var5;
   }

   // $FF: renamed from: bq (int, int, byte[], int[], int, int, int, int, int, int, int, bv, int, int) int
   static int method_2178(int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, class_107 var11, int var12, int var13) {
      var11.field_1247 -= var11.field_1255 * var5;
      var11.field_1248 -= var11.field_1256 * var5;
      if(var12 == 0 || (var8 = var5 + (var10 - var4 + var12 - 257) / var12) > var9) {
         var8 = var9;
      }

      byte var14;
      int var10001;
      while(var5 < var8) {
         var1 = var4 >> 8;
         var14 = var2[var1];
         var10001 = var5++;
         var3[var10001] += ((var14 << 8) + (var2[var1 + 1] - var14) * (var4 & 255)) * var6 >> 6;
         var6 += var7;
         var4 += var12;
      }

      if(var12 == 0 || (var8 = var5 + (var10 - var4 + var12 - 1) / var12) > var9) {
         var8 = var9;
      }

      for(var1 = var13; var5 < var8; var4 += var12) {
         var14 = var2[var4 >> 8];
         var10001 = var5++;
         var3[var10001] += ((var14 << 8) + (var1 - var14) * (var4 & 255)) * var6 >> 6;
         var6 += var7;
      }

      var11.field_1247 += var11.field_1255 * var5;
      var11.field_1248 += var11.field_1256 * var5;
      var11.field_1252 = var6;
      var11.field_1244 = var4;
      return var5;
   }

   // $FF: renamed from: ej (int, int, byte[], int[], int, int, int, int, int, int, int, bv, int, int) int
   static int method_2180(int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, class_107 var11, int var12, int var13) {
      var11.field_1247 -= var11.field_1255 * var5;
      var11.field_1248 -= var11.field_1256 * var5;
      if(var12 == 0 || (var8 = var5 + (var10 - var4 + var12 - 257) / var12) > var9) {
         var8 = var9;
      }

      byte var14;
      int var10001;
      while(var5 < var8) {
         var1 = var4 >> 8;
         var14 = var2[var1];
         var10001 = var5++;
         var3[var10001] += ((var14 << 8) + (var2[var1 + 1] - var14) * (var4 & 1571499895)) * var6 >> 6;
         var6 += var7;
         var4 += var12;
      }

      if(var12 == 0 || (var8 = var5 + (var10 - var4 + var12 - 1) / var12) > var9) {
         var8 = var9;
      }

      for(var1 = var13; var5 < var8; var4 += var12) {
         var14 = var2[var4 >> 8];
         var10001 = var5++;
         var3[var10001] += ((var14 << 8) + (var1 - var14) * (var4 & 255)) * var6 >> 6;
         var6 += var7;
      }

      var11.field_1247 += var11.field_1255 * var5;
      var11.field_1248 += var11.field_1256 * var5;
      var11.field_1252 = var6;
      var11.field_1244 = var4;
      return var5;
   }

   // $FF: renamed from: ek (int, byte[], int[], int, int, int, int, int, int, int, int, int, bv) int
   static int method_2182(byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, class_107 var12) {
      var3 >>= 8;
      var11 >>= 8;
      var5 <<= 2;
      var6 <<= 2;
      var7 <<= 2;
      var8 <<= 2;
      if((var9 = var4 + var11 - var3) > var10) {
         var9 = var10;
      }

      var12.field_1252 += var12.field_1254 * (var9 - var4);
      var4 <<= 1;
      var9 <<= 1;

      byte var13;
      int var10001;
      for(var9 -= 6; var4 < var9; var6 += var8) {
         var13 = var1[var3++];
         var10001 = var4++;
         var2[var10001] += var13 * var5;
         var5 += var7;
         var10001 = var4++;
         var2[var10001] += var13 * var6;
         var6 += var8;
         var13 = var1[var3++];
         var10001 = var4++;
         var2[var10001] += var13 * var5;
         var5 += var7;
         var10001 = var4++;
         var2[var10001] += var13 * var6;
         var6 += var8;
         var13 = var1[var3++];
         var10001 = var4++;
         var2[var10001] += var13 * var5;
         var5 += var7;
         var10001 = var4++;
         var2[var10001] += var13 * var6;
         var6 += var8;
         var13 = var1[var3++];
         var10001 = var4++;
         var2[var10001] += var13 * var5;
         var5 += var7;
         var10001 = var4++;
         var2[var10001] += var13 * var6;
      }

      for(var9 += 6; var4 < var9; var6 += var8) {
         var13 = var1[var3++];
         var10001 = var4++;
         var2[var10001] += var13 * var5;
         var5 += var7;
         var10001 = var4++;
         var2[var10001] += var13 * var6;
      }

      var12.field_1247 = var5 >> 2;
      var12.field_1248 = var6 >> 2;
      var12.field_1244 = var3 << 8;
      return var4 >> 1;
   }

   // $FF: renamed from: g () int
   public synchronized int method_2183() {
      return this.field_1242 < 0?-1:this.field_1242;
   }

   // $FF: renamed from: ae () bm
   protected class_104 method_1939() {
      return null;
   }

   // $FF: renamed from: ed (int, byte[], int[], int, int, int, int, int, int, int, int, int, bv) int
   static int method_2184(byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, class_107 var12) {
      var3 >>= 8;
      var11 >>= 8;
      var5 <<= 2;
      var6 <<= 2;
      var7 <<= 2;
      var8 <<= 2;
      if((var9 = var4 + var3 - (var11 - 1)) > var10) {
         var9 = var10;
      }

      var12.field_1252 += var12.field_1254 * (var9 - var4);
      var4 <<= 1;
      var9 <<= 1;

      byte var13;
      int var10001;
      for(var9 -= 6; var4 < var9; var6 += var8) {
         var13 = var1[var3--];
         var10001 = var4++;
         var2[var10001] += var13 * var5;
         var5 += var7;
         var10001 = var4++;
         var2[var10001] += var13 * var6;
         var6 += var8;
         var13 = var1[var3--];
         var10001 = var4++;
         var2[var10001] += var13 * var5;
         var5 += var7;
         var10001 = var4++;
         var2[var10001] += var13 * var6;
         var6 += var8;
         var13 = var1[var3--];
         var10001 = var4++;
         var2[var10001] += var13 * var5;
         var5 += var7;
         var10001 = var4++;
         var2[var10001] += var13 * var6;
         var6 += var8;
         var13 = var1[var3--];
         var10001 = var4++;
         var2[var10001] += var13 * var5;
         var5 += var7;
         var10001 = var4++;
         var2[var10001] += var13 * var6;
      }

      for(var9 += 6; var4 < var9; var6 += var8) {
         var13 = var1[var3--];
         var10001 = var4++;
         var2[var10001] += var13 * var5;
         var5 += var7;
         var10001 = var4++;
         var2[var10001] += var13 * var6;
      }

      var12.field_1247 = var5 >> 2;
      var12.field_1248 = var6 >> 2;
      var12.field_1244 = var3 << 8;
      return var4 >> 1;
   }

   // $FF: renamed from: ep (int, byte[], int[], int, int, int, int, int, int, int, int, int, bv) int
   static int method_2185(byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, class_107 var12) {
      var3 >>= 8;
      var11 >>= 8;
      var5 <<= 2;
      var6 <<= 2;
      var7 <<= 2;
      var8 <<= 2;
      if((var9 = var4 + var3 - (var11 - 1)) > var10) {
         var9 = var10;
      }

      var12.field_1252 += var12.field_1254 * (var9 - var4);
      var4 <<= 1;
      var9 <<= 1;

      byte var13;
      int var10001;
      for(var9 -= 6; var4 < var9; var6 += var8) {
         var13 = var1[var3--];
         var10001 = var4++;
         var2[var10001] += var13 * var5;
         var5 += var7;
         var10001 = var4++;
         var2[var10001] += var13 * var6;
         var6 += var8;
         var13 = var1[var3--];
         var10001 = var4++;
         var2[var10001] += var13 * var5;
         var5 += var7;
         var10001 = var4++;
         var2[var10001] += var13 * var6;
         var6 += var8;
         var13 = var1[var3--];
         var10001 = var4++;
         var2[var10001] += var13 * var5;
         var5 += var7;
         var10001 = var4++;
         var2[var10001] += var13 * var6;
         var6 += var8;
         var13 = var1[var3--];
         var10001 = var4++;
         var2[var10001] += var13 * var5;
         var5 += var7;
         var10001 = var4++;
         var2[var10001] += var13 * var6;
      }

      for(var9 += 6; var4 < var9; var6 += var8) {
         var13 = var1[var3--];
         var10001 = var4++;
         var2[var10001] += var13 * var5;
         var5 += var7;
         var10001 = var4++;
         var2[var10001] += var13 * var6;
      }

      var12.field_1247 = var5 >> 2;
      var12.field_1248 = var6 >> 2;
      var12.field_1244 = var3 << 8;
      return var4 >> 1;
   }

   // $FF: renamed from: ex (int, byte[], int[], int, int, int, int, int, int, int, int, int, bv) int
   static int method_2186(byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, class_107 var12) {
      var3 >>= 8;
      var11 >>= 8;
      var5 <<= 2;
      var6 <<= 2;
      var7 <<= 2;
      var8 <<= 2;
      if((var9 = var4 + var3 - (var11 - 1)) > var10) {
         var9 = var10;
      }

      var12.field_1252 += var12.field_1254 * (var9 - var4);
      var4 <<= 1;
      var9 <<= 1;

      byte var13;
      int var10001;
      for(var9 -= 6; var4 < var9; var6 += var8) {
         var13 = var1[var3--];
         var10001 = var4++;
         var2[var10001] += var13 * var5;
         var5 += var7;
         var10001 = var4++;
         var2[var10001] += var13 * var6;
         var6 += var8;
         var13 = var1[var3--];
         var10001 = var4++;
         var2[var10001] += var13 * var5;
         var5 += var7;
         var10001 = var4++;
         var2[var10001] += var13 * var6;
         var6 += var8;
         var13 = var1[var3--];
         var10001 = var4++;
         var2[var10001] += var13 * var5;
         var5 += var7;
         var10001 = var4++;
         var2[var10001] += var13 * var6;
         var6 += var8;
         var13 = var1[var3--];
         var10001 = var4++;
         var2[var10001] += var13 * var5;
         var5 += var7;
         var10001 = var4++;
         var2[var10001] += var13 * var6;
      }

      for(var9 += 6; var4 < var9; var6 += var8) {
         var13 = var1[var3--];
         var10001 = var4++;
         var2[var10001] += var13 * var5;
         var5 += var7;
         var10001 = var4++;
         var2[var10001] += var13 * var6;
      }

      var12.field_1247 = var5 >> 2;
      var12.field_1248 = var6 >> 2;
      var12.field_1244 = var3 << 8;
      return var4 >> 1;
   }

   // $FF: renamed from: ew (int, byte[], int[], int, int, int, int, int, int, int, int, int, bv) int
   static int method_2187(byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, class_107 var12) {
      var3 >>= 8;
      var11 >>= 8;
      var5 <<= 2;
      var6 <<= 2;
      var7 <<= 2;
      var8 <<= 2;
      if((var9 = var4 + var3 - (var11 - 1)) > var10) {
         var9 = var10;
      }

      var12.field_1252 += var12.field_1254 * (var9 - var4);
      var4 <<= 1;
      var9 <<= 1;

      byte var13;
      int var10001;
      for(var9 -= 6; var4 < var9; var6 += var8) {
         var13 = var1[var3--];
         var10001 = var4++;
         var2[var10001] += var13 * var5;
         var5 += var7;
         var10001 = var4++;
         var2[var10001] += var13 * var6;
         var6 += var8;
         var13 = var1[var3--];
         var10001 = var4++;
         var2[var10001] += var13 * var5;
         var5 += var7;
         var10001 = var4++;
         var2[var10001] += var13 * var6;
         var6 += var8;
         var13 = var1[var3--];
         var10001 = var4++;
         var2[var10001] += var13 * var5;
         var5 += var7;
         var10001 = var4++;
         var2[var10001] += var13 * var6;
         var6 += var8;
         var13 = var1[var3--];
         var10001 = var4++;
         var2[var10001] += var13 * var5;
         var5 += var7;
         var10001 = var4++;
         var2[var10001] += var13 * var6;
      }

      for(var9 += 6; var4 < var9; var6 += var8) {
         var13 = var1[var3--];
         var10001 = var4++;
         var2[var10001] += var13 * var5;
         var5 += var7;
         var10001 = var4++;
         var2[var10001] += var13 * var6;
      }

      var12.field_1247 = var5 >> 2;
      var12.field_1248 = var6 >> 2;
      var12.field_1244 = var3 << 8;
      return var4 >> 1;
   }

   // $FF: renamed from: el (int, int, byte[], int[], int, int, int, int, int, int, int, bv, int, int) int
   static int method_2189(int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, class_107 var11, int var12, int var13) {
      var11.field_1247 -= var11.field_1255 * var5;
      var11.field_1248 -= var11.field_1256 * var5;
      if(var12 == 0 || (var8 = var5 + (var10 - var4 + var12 - 759126595) / var12) > var9) {
         var8 = var9;
      }

      byte var14;
      int var10001;
      while(var5 < var8) {
         var1 = var4 >> 8;
         var14 = var2[var1];
         var10001 = var5++;
         var3[var10001] += ((var14 << 8) + (var2[var1 + 1] - var14) * (var4 & -944402216)) * var6 >> 6;
         var6 += var7;
         var4 += var12;
      }

      if(var12 == 0 || (var8 = var5 + (var10 - var4 + var12 - 1) / var12) > var9) {
         var8 = var9;
      }

      for(var1 = var13; var5 < var8; var4 += var12) {
         var14 = var2[var4 >> 8];
         var10001 = var5++;
         var3[var10001] += ((var14 << 8) + (var1 - var14) * (var4 & 255)) * var6 >> 6;
         var6 += var7;
      }

      var11.field_1247 += var11.field_1255 * var5;
      var11.field_1248 += var11.field_1256 * var5;
      var11.field_1252 = var6;
      var11.field_1244 = var4;
      return var5;
   }

   // $FF: renamed from: <init> (au, int, int) void
   class_107(class_110 var1, int var2, int var3) {
      super();
      this.field_1205 = var1;
      this.field_1250 = var1.field_1264;
      this.field_1251 = var1.field_1265;
      this.field_1246 = var1.field_1263;
      this.field_1243 = var2;
      this.field_1245 = var3;
      this.field_1242 = 8192;
      this.field_1244 = 0;
      this.method_2073();
   }

   // $FF: renamed from: ez (int, byte[], int[], int, int, int, int, int, int, int, int, int, bv) int
   static int method_2193(byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, class_107 var12) {
      var3 >>= 8;
      var11 >>= 8;
      var5 <<= 2;
      var6 <<= 2;
      var7 <<= 2;
      var8 <<= 2;
      if((var9 = var4 + var11 - var3) > var10) {
         var9 = var10;
      }

      var12.field_1252 += var12.field_1254 * (var9 - var4);
      var4 <<= 1;
      var9 <<= 1;

      byte var13;
      int var10001;
      for(var9 -= 6; var4 < var9; var6 += var8) {
         var13 = var1[var3++];
         var10001 = var4++;
         var2[var10001] += var13 * var5;
         var5 += var7;
         var10001 = var4++;
         var2[var10001] += var13 * var6;
         var6 += var8;
         var13 = var1[var3++];
         var10001 = var4++;
         var2[var10001] += var13 * var5;
         var5 += var7;
         var10001 = var4++;
         var2[var10001] += var13 * var6;
         var6 += var8;
         var13 = var1[var3++];
         var10001 = var4++;
         var2[var10001] += var13 * var5;
         var5 += var7;
         var10001 = var4++;
         var2[var10001] += var13 * var6;
         var6 += var8;
         var13 = var1[var3++];
         var10001 = var4++;
         var2[var10001] += var13 * var5;
         var5 += var7;
         var10001 = var4++;
         var2[var10001] += var13 * var6;
      }

      for(var9 += 6; var4 < var9; var6 += var8) {
         var13 = var1[var3++];
         var10001 = var4++;
         var2[var10001] += var13 * var5;
         var5 += var7;
         var10001 = var4++;
         var2[var10001] += var13 * var6;
      }

      var12.field_1247 = var5 >> 2;
      var12.field_1248 = var6 >> 2;
      var12.field_1244 = var3 << 8;
      return var4 >> 1;
   }

   // $FF: renamed from: z (int, int, int) void
   public synchronized void method_2195(int var1, int var2, int var3) {
      if(var1 == 0) {
         this.method_2077(var2, var3);
      } else {
         int var4 = method_2108(var2, var3);
         int var5 = method_2161(var2, var3);
         if(this.field_1247 == var4 && this.field_1248 == var5) {
            this.field_1253 = 0;
         } else {
            int var6 = var2 - this.field_1252;
            if(this.field_1252 - var2 > var6) {
               var6 = this.field_1252 - var2;
            }

            if(var4 - this.field_1247 > var6) {
               var6 = var4 - this.field_1247;
            }

            if(this.field_1247 - var4 > var6) {
               var6 = this.field_1247 - var4;
            }

            if(var5 - this.field_1248 > var6) {
               var6 = var5 - this.field_1248;
            }

            if(this.field_1248 - var5 > var6) {
               var6 = this.field_1248 - var5;
            }

            if(var1 > var6) {
               var1 = var6;
            }

            this.field_1253 = var1;
            this.field_1245 = var2;
            this.field_1242 = var3;
            this.field_1254 = (var2 - this.field_1252) / var1;
            this.field_1255 = (var4 - this.field_1247) / var1;
            this.field_1256 = (var5 - this.field_1248) / var1;
         }
      }
   }

}
