
// $FF: renamed from: l
public class class_171 {

   // $FF: renamed from: q java.lang.String[]
   public String[] field_2129;
   // $FF: renamed from: n boolean
   boolean field_2130;
   // $FF: renamed from: f boolean
   boolean field_2131;
   // $FF: renamed from: c long[]
   long[] field_2132;
   // $FF: renamed from: p int
   int field_2133;
   // $FF: renamed from: j java.lang.String
   public String field_2134;
   // $FF: renamed from: l byte
   public byte field_2135;
   // $FF: renamed from: b boolean
   public boolean field_2136;
   // $FF: renamed from: u byte
   public byte field_2137;
   // $FF: renamed from: z int
   public int field_2138;
   // $FF: renamed from: x int
   public int field_2139;
   // $FF: renamed from: k int[]
   public int[] field_2140;
   // $FF: renamed from: o int
   public int field_2141;
   // $FF: renamed from: d byte
   public byte field_2142;
   // $FF: renamed from: v int
   static final int field_2143 = 6;
   // $FF: renamed from: g int[]
   int[] field_2144;
   // $FF: renamed from: a int[]
   int[] field_2145;
   // $FF: renamed from: h java.lang.String[]
   public String[] field_2146;
   // $FF: renamed from: m boolean[]
   public boolean[] field_2147;
   // $FF: renamed from: y long
   long field_2148;
   // $FF: renamed from: e byte[]
   public byte[] field_2149;
   // $FF: renamed from: w int
   public int field_2150;
   // $FF: renamed from: t long[]
   long[] field_2151;
   // $FF: renamed from: s byte
   public byte field_2152;
   // $FF: renamed from: r int
   int field_2153;
   // $FF: renamed from: i mr
   class_369 field_2154;
   // $FF: renamed from: tn int
   static int field_2155;


   // $FF: renamed from: aa (int, byte) int
   int method_3634(int var1, byte var2) {
      if(var2 != 126 && 127 != var2) {
         if(var1 == this.field_2139 * 1791364373 && (1909839147 * this.field_2138 == -1 || this.field_2149[1909839147 * this.field_2138] < 125)) {
            return -1;
         } else if(this.field_2149[var1] == var2) {
            return -1;
         } else {
            this.field_2149[var1] = var2;
            this.method_3643(981229142);
            return var1;
         }
      } else {
         return -1;
      }
   }

   // $FF: renamed from: v (int, int) void
   void method_3635(int var1, int var2) {
      try {
         if(this.field_2130) {
            if(var2 <= 1899372753) {
               throw new IllegalStateException();
            }

            if(this.field_2132 != null) {
               if(var2 <= 1899372753) {
                  throw new IllegalStateException();
               }

               System.arraycopy(this.field_2132, 0, this.field_2132 = new long[var1], 0, -1916816431 * this.field_2141);
            } else {
               this.field_2132 = new long[var1];
            }
         }

         if(this.field_2131) {
            if(this.field_2146 != null) {
               if(var2 <= 1899372753) {
                  throw new IllegalStateException();
               }

               System.arraycopy(this.field_2146, 0, this.field_2146 = new String[var1], 0, -1916816431 * this.field_2141);
            } else {
               this.field_2146 = new String[var1];
            }
         }

         if(this.field_2149 != null) {
            if(var2 <= 1899372753) {
               return;
            }

            System.arraycopy(this.field_2149, 0, this.field_2149 = new byte[var1], 0, this.field_2141 * -1916816431);
         } else {
            this.field_2149 = new byte[var1];
         }

         if(null != this.field_2145) {
            if(var2 <= 1899372753) {
               return;
            }

            System.arraycopy(this.field_2145, 0, this.field_2145 = new int[var1], 0, this.field_2141 * -1916816431);
         } else {
            this.field_2145 = new int[var1];
         }

         if(null != this.field_2140) {
            System.arraycopy(this.field_2140, 0, this.field_2140 = new int[var1], 0, this.field_2141 * -1916816431);
         } else {
            this.field_2140 = new int[var1];
         }

         if(this.field_2147 != null) {
            if(var2 <= 1899372753) {
               throw new IllegalStateException();
            }

            System.arraycopy(this.field_2147, 0, this.field_2147 = new boolean[var1], 0, -1916816431 * this.field_2141);
         } else {
            this.field_2147 = new boolean[var1];
         }

      } catch (RuntimeException var3) {
         throw class_223.method_4281(var3);
      }
   }

   // $FF: renamed from: n (int, byte) void
   void method_3636(int var1, byte var2) {
      try {
         if(this.field_2130) {
            if(var2 != 0) {
               throw new IllegalStateException();
            }

            if(null != this.field_2151) {
               if(var2 != 0) {
                  throw new IllegalStateException();
               }

               System.arraycopy(this.field_2151, 0, this.field_2151 = new long[var1], 0, 1521260055 * this.field_2150);
            } else {
               this.field_2151 = new long[var1];
            }
         }

         if(this.field_2131) {
            if(var2 != 0) {
               throw new IllegalStateException();
            }

            if(null != this.field_2129) {
               if(var2 != 0) {
                  throw new IllegalStateException();
               }

               System.arraycopy(this.field_2129, 0, this.field_2129 = new String[var1], 0, 1521260055 * this.field_2150);
            } else {
               this.field_2129 = new String[var1];
            }
         }

      } catch (RuntimeException var3) {
         throw class_223.method_4281(var3);
      }
   }

   // $FF: renamed from: f (java.lang.String, int) int
   public int method_3637(String var1, int var2) {
      try {
         if(var1 != null) {
            if(var2 != 562871679) {
               throw new IllegalStateException();
            }

            if(var1.length() != 0) {
               for(int var3 = 0; var3 < this.field_2141 * -1916816431; ++var3) {
                  if(var2 != 562871679) {
                     throw new IllegalStateException();
                  }

                  if(this.field_2146[var3].equals(var1)) {
                     if(var2 != 562871679) {
                        throw new IllegalStateException();
                     }

                     return var3;
                  }
               }

               return -1;
            }

            if(var2 != 562871679) {
               throw new IllegalStateException();
            }
         }

         return -1;
      } catch (RuntimeException var4) {
         throw class_223.method_4281(var4);
      }
   }

   // $FF: renamed from: y (int, int, int, int) int
   public int method_3638(int var1, int var2, int var3, int var4) {
      try {
         int var10000;
         if(31 == var3) {
            if(var4 <= -1768933319) {
               throw new IllegalStateException();
            }

            var10000 = -1;
         } else {
            var10000 = (1 << 1 + var3) - 1;
         }

         int var5 = var10000;
         return (this.field_2145[var1] & var5) >>> var2;
      } catch (RuntimeException var6) {
         throw class_223.method_4281(var6);
      }
   }

   // $FF: renamed from: p (int, byte) java.lang.Integer
   public Integer method_3639(int var1, byte var2) {
      try {
         if(null == this.field_2154) {
            return null;
         } else {
            class_27 var3 = this.field_2154.method_6586((long)var1);
            if(null != var3) {
               if(var3 instanceof class_32) {
                  return new Integer(((class_32)var3).field_58);
               }

               if(var2 == 1) {
                  throw new IllegalStateException();
               }
            }

            return null;
         }
      } catch (RuntimeException var4) {
         throw class_223.method_4281(var4);
      }
   }

   // $FF: renamed from: j (int) int[]
   public int[] method_3640(int var1) {
      try {
         if(this.field_2144 == null) {
            if(var1 >= -1225232095) {
               throw new IllegalStateException();
            }

            String[] var2 = new String[this.field_2141 * -1916816431];
            this.field_2144 = new int[-1916816431 * this.field_2141];

            for(int var3 = 0; var3 < this.field_2141 * -1916816431; this.field_2144[var3] = var3++) {
               if(var1 >= -1225232095) {
                  throw new IllegalStateException();
               }

               var2[var3] = this.field_2146[var3];
               if(null != var2[var3]) {
                  if(var1 >= -1225232095) {
                     throw new IllegalStateException();
                  }

                  var2[var3] = var2[var3].toLowerCase();
               }
            }

            class_175.method_3740(var2, this.field_2144);
         }

         return this.field_2144;
      } catch (RuntimeException var4) {
         throw class_223.method_4281(var4);
      }
   }

   // $FF: renamed from: r (long, java.lang.String, int, int) void
   void method_3641(long var1, String var3, int var4, int var5) {
      try {
         if(var3 != null) {
            if(var5 != 965862752) {
               throw new IllegalStateException();
            }

            if(var3.length() == 0) {
               if(var5 != 965862752) {
                  throw new IllegalStateException();
               }

               var3 = null;
            }
         }

         boolean var10000;
         if(var1 > 0L) {
            if(var5 != 965862752) {
               throw new IllegalStateException();
            }

            var10000 = true;
         } else {
            var10000 = false;
         }

         if(var10000 != this.field_2130) {
            throw new RuntimeException("");
         } else {
            boolean var10001;
            if(var3 != null) {
               if(var5 != 965862752) {
                  throw new IllegalStateException();
               }

               var10001 = true;
            } else {
               var10001 = false;
            }

            if(this.field_2131 != var10001) {
               if(var5 != 965862752) {
                  throw new IllegalStateException();
               } else {
                  throw new RuntimeException("");
               }
            } else {
               label120: {
                  if(var1 <= 0L || null != this.field_2132 && this.field_2141 * -1916816431 < this.field_2132.length) {
                     if(null == var3) {
                        break label120;
                     }

                     if(var5 != 965862752) {
                        throw new IllegalStateException();
                     }

                     if(null != this.field_2146) {
                        if(var5 != 965862752) {
                           throw new IllegalStateException();
                        }

                        if(this.field_2141 * -1916816431 < this.field_2146.length) {
                           break label120;
                        }

                        if(var5 != 965862752) {
                           throw new IllegalStateException();
                        }
                     }
                  }

                  this.method_3635(this.field_2141 * -1916816431 + 5, 1920986266);
               }

               if(null != this.field_2132) {
                  if(var5 != 965862752) {
                     return;
                  }

                  this.field_2132[-1916816431 * this.field_2141] = var1;
               }

               if(this.field_2146 != null) {
                  if(var5 != 965862752) {
                     throw new IllegalStateException();
                  }

                  this.field_2146[this.field_2141 * -1916816431] = var3;
               }

               if(1791364373 * this.field_2139 == -1) {
                  this.field_2139 = this.field_2141 * -809708851;
                  this.field_2149[-1916816431 * this.field_2141] = 126;
               } else {
                  this.field_2149[this.field_2141 * -1916816431] = 0;
               }

               this.field_2145[this.field_2141 * -1916816431] = 0;
               this.field_2140[this.field_2141 * -1916816431] = var4;
               this.field_2147[-1916816431 * this.field_2141] = false;
               this.field_2141 += 1332970801;
               this.field_2144 = null;
            }
         }
      } catch (RuntimeException var6) {
         throw class_223.method_4281(var6);
      }
   }

   // $FF: renamed from: bs (int, long) boolean
   boolean method_3642(int var1, long var2) {
      if(null != this.field_2154) {
         class_27 var4 = this.field_2154.method_6586((long)var1);
         if(var4 != null) {
            if(var4 instanceof class_31) {
               class_31 var5 = (class_31)var4;
               if(var5.field_57 == var2) {
                  return false;
               }

               var5.field_57 = var2;
               return true;
            }

            var4.method_108();
         }
      } else {
         class_369 var10001 = new class_369(4);
         this.field_2154 = var10001;
      }

      class_369 var10000 = this.field_2154;
      class_31 var6 = new class_31(var2);
      var10000.method_6588(var6, (long)var1);
      return true;
   }

   // $FF: renamed from: d (int) void
   void method_3643(int var1) {
      try {
         if(this.field_2141 * -1916816431 == 0) {
            if(var1 > -1446505827) {
               this.field_2139 = 775955907;
               this.field_2138 = -190595459;
            }
         } else {
            this.field_2139 = 775955907;
            this.field_2138 = -190595459;
            int var2 = 0;
            byte var3 = this.field_2149[0];

            for(int var4 = 1; var4 < this.field_2141 * -1916816431; ++var4) {
               if(var1 <= -1446505827) {
                  return;
               }

               if(this.field_2149[var4] > var3) {
                  if(var1 <= -1446505827) {
                     throw new IllegalStateException();
                  }

                  if(var3 == 125) {
                     if(var1 <= -1446505827) {
                        throw new IllegalStateException();
                     }

                     this.field_2138 = 190595459 * var2;
                  }

                  var2 = var4;
                  var3 = this.field_2149[var4];
               } else if(-1 == 1909839147 * this.field_2138) {
                  if(var1 <= -1446505827) {
                     throw new IllegalStateException();
                  }

                  if(this.field_2149[var4] == 125) {
                     if(var1 <= -1446505827) {
                        return;
                     }

                     this.field_2138 = var4 * 190595459;
                  }
               }
            }

            this.field_2139 = var2 * -775955907;
            if(1791364373 * this.field_2139 != -1) {
               if(var1 <= -1446505827) {
                  return;
               }

               this.field_2149[1791364373 * this.field_2139] = 126;
            }

         }
      } catch (RuntimeException var5) {
         throw class_223.method_4281(var5);
      }
   }

   // $FF: renamed from: s (long, java.lang.String, byte) void
   void method_3644(long var1, String var3, byte var4) {
      try {
         if(null != var3) {
            if(var4 == 25) {
               throw new IllegalStateException();
            }

            if(var3.length() == 0) {
               if(var4 == 25) {
                  throw new IllegalStateException();
               }

               var3 = null;
            }
         }

         boolean var10001;
         if(var1 > 0L) {
            if(var4 == 25) {
               throw new IllegalStateException();
            }

            var10001 = true;
         } else {
            var10001 = false;
         }

         if(this.field_2130 != var10001) {
            throw new RuntimeException("");
         } else {
            if(var3 != null) {
               if(var4 == 25) {
                  throw new IllegalStateException();
               }

               var10001 = true;
            } else {
               var10001 = false;
            }

            if(this.field_2131 != var10001) {
               throw new RuntimeException("");
            } else {
               label101: {
                  label111: {
                     if(var1 > 0L) {
                        if(var4 == 25) {
                           return;
                        }

                        if(this.field_2151 == null) {
                           break label111;
                        }

                        if(var4 == 25) {
                           return;
                        }

                        if(1521260055 * this.field_2150 >= this.field_2151.length) {
                           break label111;
                        }

                        if(var4 == 25) {
                           return;
                        }
                     }

                     if(null == var3) {
                        break label101;
                     }

                     if(var4 == 25) {
                        throw new IllegalStateException();
                     }

                     if(null != this.field_2129) {
                        if(var4 == 25) {
                           return;
                        }

                        if(1521260055 * this.field_2150 < this.field_2129.length) {
                           break label101;
                        }

                        if(var4 == 25) {
                           throw new IllegalStateException();
                        }
                     }
                  }

                  this.method_3636(1521260055 * this.field_2150 + 5, (byte)0);
               }

               if(null != this.field_2151) {
                  if(var4 == 25) {
                     throw new IllegalStateException();
                  }

                  this.field_2151[this.field_2150 * 1521260055] = var1;
               }

               if(null != this.field_2129) {
                  if(var4 == 25) {
                     throw new IllegalStateException();
                  }

                  this.field_2129[1521260055 * this.field_2150] = var3;
               }

               this.field_2150 += 306971047;
            }
         }
      } catch (RuntimeException var5) {
         throw class_223.method_4281(var5);
      }
   }

   // $FF: renamed from: ao (int) void
   void method_3645(int var1) {
      this.field_2150 -= 306971047;
      if(0 == this.field_2150 * -732747451) {
         this.field_2151 = null;
         this.field_2129 = null;
      } else {
         if(this.field_2151 != null) {
            System.arraycopy(this.field_2151, var1 + 1, this.field_2151, var1, this.field_2150 * 1521260055 - var1);
         }

         if(null != this.field_2129) {
            System.arraycopy(this.field_2129, 1 + var1, this.field_2129, var1, this.field_2150 * 1521260055 - var1);
         }
      }

   }

   // $FF: renamed from: ah (long, java.lang.String) void
   void method_3646(long var1, String var3) {
      if(null != var3 && var3.length() == 0) {
         var3 = null;
      }

      if(this.field_2130 != var1 > 0L) {
         throw new RuntimeException("");
      } else if(this.field_2131 != (var3 != null)) {
         throw new RuntimeException("");
      } else {
         if(var1 > 0L && (this.field_2151 == null || 1521260055 * this.field_2150 >= this.field_2151.length) || null != var3 && (null == this.field_2129 || 1521260055 * this.field_2150 >= this.field_2129.length)) {
            this.method_3636(1521260055 * this.field_2150 + 5, (byte)0);
         }

         if(null != this.field_2151) {
            this.field_2151[this.field_2150 * 1521260055] = var1;
         }

         if(null != this.field_2129) {
            this.field_2129[1521260055 * this.field_2150] = var3;
         }

         this.field_2150 += 306971047;
      }
   }

   // $FF: renamed from: o (int, byte) boolean
   boolean method_3647(int var1, byte var2) {
      try {
         if(var1 != 1791364373 * this.field_2139) {
            if(var2 == 6) {
               throw new IllegalStateException();
            }

            if(this.field_2149[var1] != 126) {
               this.field_2149[1791364373 * this.field_2139] = 125;
               this.field_2138 = this.field_2139 * -2026436929;
               this.field_2149[var1] = 126;
               this.field_2139 = -775955907 * var1;
               return true;
            }

            if(var2 == 6) {
               throw new IllegalStateException();
            }
         }

         return false;
      } catch (RuntimeException var3) {
         throw class_223.method_4281(var3);
      }
   }

   // $FF: renamed from: c (int, boolean, byte) int
   int method_3648(int var1, boolean var2, byte var3) {
      try {
         if(this.field_2147[var1] == var2) {
            if(var3 != 2) {
               throw new IllegalStateException();
            } else {
               return -1;
            }
         } else {
            this.field_2147[var1] = var2;
            return var1;
         }
      } catch (RuntimeException var4) {
         throw class_223.method_4281(var4);
      }
   }

   // $FF: renamed from: i (java.lang.String) int
   public int method_3649(String var1) {
      if(var1 != null && var1.length() != 0) {
         for(int var2 = 0; var2 < this.field_2141 * -1916816431; ++var2) {
            if(this.field_2146[var2].equals(var1)) {
               return var2;
            }
         }

         return -1;
      } else {
         return -1;
      }
   }

   // $FF: renamed from: l (int, byte, byte) int
   int method_3650(int var1, byte var2, byte var3) {
      try {
         if(var2 != 126) {
            if(var3 == 0) {
               throw new IllegalStateException();
            }

            if(127 != var2) {
               if(var1 == this.field_2139 * 1791364373) {
                  label51: {
                     if(var3 == 0) {
                        throw new IllegalStateException();
                     }

                     if(1909839147 * this.field_2138 != -1) {
                        if(this.field_2149[1909839147 * this.field_2138] >= 125) {
                           break label51;
                        }

                        if(var3 == 0) {
                           throw new IllegalStateException();
                        }
                     }

                     return -1;
                  }
               }

               if(this.field_2149[var1] == var2) {
                  return -1;
               }

               this.field_2149[var1] = var2;
               this.method_3643(238780631);
               return var1;
            }

            if(var3 == 0) {
               throw new IllegalStateException();
            }
         }

         return -1;
      } catch (RuntimeException var4) {
         throw class_223.method_4281(var4);
      }
   }

   // $FF: renamed from: a (int, int, int, int, int) boolean
   boolean method_3651(int var1, int var2, int var3, int var4, int var5) {
      try {
         int var6 = (1 << var3) - 1;
         int var10000;
         if(31 == var4) {
            if(var5 == -2022596169) {
               throw new IllegalStateException();
            }

            var10000 = -1;
         } else {
            var10000 = (1 << 1 + var4) - 1;
         }

         int var7 = var10000;
         int var8 = var7 ^ var6;
         var2 <<= var3;
         var2 &= var8;
         if(null != this.field_2154) {
            if(var5 == -2022596169) {
               throw new IllegalStateException();
            }

            class_27 var9 = this.field_2154.method_6586((long)var1);
            if(var9 != null) {
               if(var5 == -2022596169) {
                  throw new IllegalStateException();
               }

               if(var9 instanceof class_32) {
                  if(var5 == -2022596169) {
                     throw new IllegalStateException();
                  }

                  class_32 var10 = (class_32)var9;
                  if((var10.field_58 & var8) == var2) {
                     return false;
                  }

                  var10.field_58 &= ~var8;
                  var10.field_58 |= var2;
                  return true;
               }

               var9.method_108();
            }
         } else {
            class_369 var10001 = new class_369(4);
            this.field_2154 = var10001;
         }

         class_369 var12 = this.field_2154;
         class_32 var13 = new class_32(var2);
         var12.method_6588(var13, (long)var1);
         return true;
      } catch (RuntimeException var11) {
         throw class_223.method_4281(var11);
      }
   }

   // $FF: renamed from: t (int) void
   void method_3652(int var1) {
      if(this.field_2130) {
         if(this.field_2132 != null) {
            System.arraycopy(this.field_2132, 0, this.field_2132 = new long[var1], 0, -1916816431 * this.field_2141);
         } else {
            this.field_2132 = new long[var1];
         }
      }

      if(this.field_2131) {
         if(this.field_2146 != null) {
            System.arraycopy(this.field_2146, 0, this.field_2146 = new String[var1], 0, -96541962 * this.field_2141);
         } else {
            this.field_2146 = new String[var1];
         }
      }

      if(this.field_2149 != null) {
         System.arraycopy(this.field_2149, 0, this.field_2149 = new byte[var1], 0, this.field_2141 * 1161327047);
      } else {
         this.field_2149 = new byte[var1];
      }

      if(null != this.field_2145) {
         System.arraycopy(this.field_2145, 0, this.field_2145 = new int[var1], 0, this.field_2141 * -1916816431);
      } else {
         this.field_2145 = new int[var1];
      }

      if(null != this.field_2140) {
         System.arraycopy(this.field_2140, 0, this.field_2140 = new int[var1], 0, this.field_2141 * -1916816431);
      } else {
         this.field_2140 = new int[var1];
      }

      if(this.field_2147 != null) {
         System.arraycopy(this.field_2147, 0, this.field_2147 = new boolean[var1], 0, -1264243205 * this.field_2141);
      } else {
         this.field_2147 = new boolean[var1];
      }

   }

   // $FF: renamed from: m (int, java.lang.String, int) boolean
   boolean method_3653(int var1, String var2, int var3) {
      try {
         if(null == var2) {
            if(var3 <= 1213478374) {
               throw new IllegalStateException();
            }

            var2 = "";
         } else if(var2.length() > 80) {
            if(var3 <= 1213478374) {
               throw new IllegalStateException();
            }

            var2 = var2.substring(0, 80);
         }

         class_369 var10000;
         class_34 var10001;
         if(this.field_2154 != null) {
            if(var3 <= 1213478374) {
               throw new IllegalStateException();
            }

            class_27 var4 = this.field_2154.method_6586((long)var1);
            if(null != var4) {
               if(var3 <= 1213478374) {
                  throw new IllegalStateException();
               }

               if(var4 instanceof class_34) {
                  if(var3 <= 1213478374) {
                     throw new IllegalStateException();
                  }

                  class_34 var5 = (class_34)var4;
                  if(var5.field_60 instanceof String) {
                     if(var3 <= 1213478374) {
                        throw new IllegalStateException();
                     }

                     if(var2.equals(var5.field_60)) {
                        return false;
                     }

                     var5.method_108();
                     var10000 = this.field_2154;
                     var10001 = new class_34(var2);
                     var10000.method_6588(var10001, var5.field_9);
                     return true;
                  }
               }

               var4.method_108();
            }
         } else {
            class_369 var7 = new class_369(4);
            this.field_2154 = var7;
         }

         var10000 = this.field_2154;
         var10001 = new class_34(var2);
         var10000.method_6588(var10001, (long)var1);
         return true;
      } catch (RuntimeException var6) {
         throw class_223.method_4281(var6);
      }
   }

   // $FF: renamed from: bl (int, int) boolean
   boolean method_3654(int var1, int var2) {
      if(null != this.field_2154) {
         class_27 var3 = this.field_2154.method_6586((long)var1);
         if(var3 != null) {
            if(var3 instanceof class_32) {
               class_32 var4 = (class_32)var3;
               if(var2 == var4.field_58) {
                  return false;
               }

               var4.field_58 = var2;
               return true;
            }

            var3.method_108();
         }
      } else {
         class_369 var10001 = new class_369(4);
         this.field_2154 = var10001;
      }

      class_369 var10000 = this.field_2154;
      class_32 var5 = new class_32(var2);
      var10000.method_6588(var5, (long)var1);
      return true;
   }

   // $FF: renamed from: as (long, java.lang.String, int) void
   void method_3655(long var1, String var3, int var4) {
      if(var3 != null && var3.length() == 0) {
         var3 = null;
      }

      if(var1 > 0L != this.field_2130) {
         throw new RuntimeException("");
      } else if(this.field_2131 != (var3 != null)) {
         throw new RuntimeException("");
      } else {
         if(var1 > 0L && (null == this.field_2132 || this.field_2141 * -1916816431 >= this.field_2132.length) || null != var3 && (null == this.field_2146 || this.field_2141 * -1916816431 >= this.field_2146.length)) {
            this.method_3635(this.field_2141 * -1916816431 + 5, 2136611863);
         }

         if(null != this.field_2132) {
            this.field_2132[-1916816431 * this.field_2141] = var1;
         }

         if(this.field_2146 != null) {
            this.field_2146[this.field_2141 * -1916816431] = var3;
         }

         if(1791364373 * this.field_2139 == -1) {
            this.field_2139 = this.field_2141 * -809708851;
            this.field_2149[-1916816431 * this.field_2141] = 126;
         } else {
            this.field_2149[this.field_2141 * -1916816431] = 0;
         }

         this.field_2145[this.field_2141 * -1916816431] = 0;
         this.field_2140[this.field_2141 * -1916816431] = var4;
         this.field_2147[-1916816431 * this.field_2141] = false;
         this.field_2141 += 1332970801;
         this.field_2144 = null;
      }
   }

   // $FF: renamed from: w (int) void
   void method_3656(int var1) {
      if(this.field_2130) {
         if(this.field_2132 != null) {
            System.arraycopy(this.field_2132, 0, this.field_2132 = new long[var1], 0, -1916816431 * this.field_2141);
         } else {
            this.field_2132 = new long[var1];
         }
      }

      if(this.field_2131) {
         if(this.field_2146 != null) {
            System.arraycopy(this.field_2146, 0, this.field_2146 = new String[var1], 0, -1916816431 * this.field_2141);
         } else {
            this.field_2146 = new String[var1];
         }
      }

      if(this.field_2149 != null) {
         System.arraycopy(this.field_2149, 0, this.field_2149 = new byte[var1], 0, this.field_2141 * -1916816431);
      } else {
         this.field_2149 = new byte[var1];
      }

      if(null != this.field_2145) {
         System.arraycopy(this.field_2145, 0, this.field_2145 = new int[var1], 0, this.field_2141 * -1916816431);
      } else {
         this.field_2145 = new int[var1];
      }

      if(null != this.field_2140) {
         System.arraycopy(this.field_2140, 0, this.field_2140 = new int[var1], 0, this.field_2141 * -1916816431);
      } else {
         this.field_2140 = new int[var1];
      }

      if(this.field_2147 != null) {
         System.arraycopy(this.field_2147, 0, this.field_2147 = new boolean[var1], 0, -1916816431 * this.field_2141);
      } else {
         this.field_2147 = new boolean[var1];
      }

   }

   // $FF: renamed from: ad (int) java.lang.Integer
   public Integer method_3657(int var1) {
      if(null == this.field_2154) {
         return null;
      } else {
         class_27 var2 = this.field_2154.method_6586((long)var1);
         return null != var2 && var2 instanceof class_32?new Integer(((class_32)var2).field_58):null;
      }
   }

   // $FF: renamed from: h (int) void
   void method_3658(int var1) {
      if(this.field_2130) {
         if(null != this.field_2151) {
            System.arraycopy(this.field_2151, 0, this.field_2151 = new long[var1], 0, 1521260055 * this.field_2150);
         } else {
            this.field_2151 = new long[var1];
         }
      }

      if(this.field_2131) {
         if(null != this.field_2129) {
            System.arraycopy(this.field_2129, 0, this.field_2129 = new String[var1], 0, 1704429810 * this.field_2150);
         } else {
            this.field_2129 = new String[var1];
         }
      }

   }

   // $FF: renamed from: b (int, int) void
   void method_3659(int var1, int var2) {
      try {
         if(var1 >= 0) {
            if(var2 != -888167097) {
               throw new IllegalStateException();
            }

            if(var1 < this.field_2141 * -1916816431) {
               this.field_2141 -= 1332970801;
               this.field_2144 = null;
               if(this.field_2141 * -1916816431 == 0) {
                  if(var2 != -888167097) {
                     throw new IllegalStateException();
                  }

                  this.field_2132 = null;
                  this.field_2146 = null;
                  this.field_2149 = null;
                  this.field_2145 = null;
                  this.field_2140 = null;
                  this.field_2147 = null;
                  this.field_2139 = 775955907;
                  this.field_2138 = -190595459;
               } else {
                  System.arraycopy(this.field_2149, 1 + var1, this.field_2149, var1, -1916816431 * this.field_2141 - var1);
                  System.arraycopy(this.field_2145, 1 + var1, this.field_2145, var1, this.field_2141 * -1916816431 - var1);
                  System.arraycopy(this.field_2140, var1 + 1, this.field_2140, var1, this.field_2141 * -1916816431 - var1);
                  System.arraycopy(this.field_2147, var1 + 1, this.field_2147, var1, -1916816431 * this.field_2141 - var1);
                  if(this.field_2132 != null) {
                     System.arraycopy(this.field_2132, 1 + var1, this.field_2132, var1, this.field_2141 * -1916816431 - var1);
                  }

                  if(null != this.field_2146) {
                     if(var2 != -888167097) {
                        throw new IllegalStateException();
                     }

                     System.arraycopy(this.field_2146, 1 + var1, this.field_2146, var1, this.field_2141 * -1916816431 - var1);
                  }

                  this.method_3643(489001064);
               }

               return;
            }

            if(var2 != -888167097) {
               throw new IllegalStateException();
            }
         }

         throw new RuntimeException("");
      } catch (RuntimeException var3) {
         throw class_223.method_4281(var3);
      }
   }

   // $FF: renamed from: k (int, long) boolean
   boolean method_3660(int var1, long var2) {
      try {
         if(null != this.field_2154) {
            class_27 var4 = this.field_2154.method_6586((long)var1);
            if(var4 != null) {
               if(var4 instanceof class_31) {
                  class_31 var5 = (class_31)var4;
                  if(var5.field_57 == var2) {
                     return false;
                  }

                  var5.field_57 = var2;
                  return true;
               }

               var4.method_108();
            }
         } else {
            class_369 var10001 = new class_369(4);
            this.field_2154 = var10001;
         }

         class_369 var10000 = this.field_2154;
         class_31 var7 = new class_31(var2);
         var10000.method_6588(var7, (long)var1);
         return true;
      } catch (RuntimeException var6) {
         throw class_223.method_4281(var6);
      }
   }

   // $FF: renamed from: ae (int, int, int) int
   public int method_3661(int var1, int var2, int var3) {
      int var4 = 31 == var3?-1:(1 << 1 + var3) - 1;
      return (this.field_2145[var1] & var4) >>> var2;
   }

   // $FF: renamed from: ap (int, int, int) int
   public int method_3662(int var1, int var2, int var3) {
      int var4 = 31 == var3?-1:(1 << 1 + var3) - 1;
      return (this.field_2145[var1] & var4) >>> var2;
   }

   // $FF: renamed from: js (io, int) io
   static class_37 method_3663(class_37 var0, int var1) {
      try {
         class_37 var2 = class_85.method_1441(var0, 693568869);
         if(null == var2) {
            if(var1 >= 2126635867) {
               throw new IllegalStateException();
            }

            var2 = var0.field_182;
         }

         return var2;
      } catch (RuntimeException var3) {
         throw class_223.method_4281(var3);
      }
   }

   // $FF: renamed from: e (int, int, int, int, int) int
   int method_3664(int var1, int var2, int var3, int var4, int var5) {
      try {
         int var6 = (1 << var3) - 1;
         int var10000;
         if(31 == var4) {
            if(var5 != -2110063672) {
               throw new IllegalStateException();
            }

            var10000 = -1;
         } else {
            var10000 = (1 << 1 + var4) - 1;
         }

         int var7 = var10000;
         int var8 = var7 ^ var6;
         var2 <<= var3;
         var2 &= var8;
         int var9 = this.field_2145[var1];
         if((var9 & var8) == var2) {
            if(var5 != -2110063672) {
               throw new IllegalStateException();
            } else {
               return -1;
            }
         } else {
            var9 &= ~var8;
            this.field_2145[var1] = var9 | var2;
            return var1;
         }
      } catch (RuntimeException var10) {
         throw class_223.method_4281(var10);
      }
   }

   // $FF: renamed from: x (nd, int) void
   void method_3665(Buffer var1, int var2) {
      try {
         int var3 = var1.readUnsignedByte();
         if(var3 >= 1) {
            if(var2 == 1359138405) {
               throw new IllegalStateException();
            }

            if(var3 <= 6) {
               int var4 = var1.readUnsignedByte();
               if(0 != (var4 & 1)) {
                  if(var2 == 1359138405) {
                     throw new IllegalStateException();
                  }

                  this.field_2130 = true;
               }

               if((var4 & 2) != 0) {
                  if(var2 == 1359138405) {
                     throw new IllegalStateException();
                  }

                  this.field_2131 = true;
               }

               if(!this.field_2130) {
                  if(var2 == 1359138405) {
                     return;
                  }

                  this.field_2132 = null;
                  this.field_2151 = null;
               }

               if(!this.field_2131) {
                  if(var2 == 1359138405) {
                     throw new IllegalStateException();
                  }

                  this.field_2146 = null;
                  this.field_2129 = null;
               }

               this.field_2133 = var1.readInt() * -1106268981;
               this.field_2153 = var1.readInt() * -720089017;
               if(var3 <= 3) {
                  if(var2 == 1359138405) {
                     throw new IllegalStateException();
                  }

                  if(-2010490505 * this.field_2153 != 0) {
                     if(var2 == 1359138405) {
                        return;
                     }

                     this.field_2153 += 1838474080;
                  }
               }

               this.field_2141 = var1.readShort() * 1332970801;
               this.field_2150 = var1.readUnsignedByte() * 306971047;
               this.field_2134 = var1.method_139(-391631059);
               if(var3 >= 4) {
                  if(var2 == 1359138405) {
                     throw new IllegalStateException();
                  }

                  var1.readInt();
               }

               this.field_2136 = var1.readUnsignedByte() == 1;
               this.field_2142 = var1.readByte();
               this.field_2152 = var1.readByte();
               this.field_2137 = var1.readByte();
               this.field_2135 = var1.readByte();
               int var5;
               if(this.field_2141 * -1916816431 > 0) {
                  if(var2 == 1359138405) {
                     throw new IllegalStateException();
                  }

                  if(this.field_2130) {
                     label382: {
                        if(var2 == 1359138405) {
                           return;
                        }

                        if(null != this.field_2132) {
                           if(this.field_2132.length >= this.field_2141 * -1916816431) {
                              break label382;
                           }

                           if(var2 == 1359138405) {
                              throw new IllegalStateException();
                           }
                        }

                        this.field_2132 = new long[-1916816431 * this.field_2141];
                     }
                  }

                  if(this.field_2131) {
                     label383: {
                        if(var2 == 1359138405) {
                           return;
                        }

                        if(this.field_2146 != null) {
                           if(var2 == 1359138405) {
                              return;
                           }

                           if(this.field_2146.length >= -1916816431 * this.field_2141) {
                              break label383;
                           }
                        }

                        this.field_2146 = new String[-1916816431 * this.field_2141];
                     }
                  }

                  label342: {
                     if(null != this.field_2149) {
                        if(var2 == 1359138405) {
                           return;
                        }

                        if(this.field_2149.length >= -1916816431 * this.field_2141) {
                           break label342;
                        }

                        if(var2 == 1359138405) {
                           throw new IllegalStateException();
                        }
                     }

                     this.field_2149 = new byte[this.field_2141 * -1916816431];
                  }

                  label335: {
                     if(this.field_2145 != null) {
                        if(var2 == 1359138405) {
                           throw new IllegalStateException();
                        }

                        if(this.field_2145.length >= this.field_2141 * -1916816431) {
                           break label335;
                        }

                        if(var2 == 1359138405) {
                           throw new IllegalStateException();
                        }
                     }

                     this.field_2145 = new int[this.field_2141 * -1916816431];
                  }

                  if(this.field_2140 == null || this.field_2140.length < -1916816431 * this.field_2141) {
                     this.field_2140 = new int[-1916816431 * this.field_2141];
                  }

                  label323: {
                     if(this.field_2147 != null) {
                        if(var2 == 1359138405) {
                           return;
                        }

                        if(this.field_2147.length >= this.field_2141 * -1916816431) {
                           break label323;
                        }

                        if(var2 == 1359138405) {
                           throw new IllegalStateException();
                        }
                     }

                     this.field_2147 = new boolean[-1916816431 * this.field_2141];
                  }

                  for(var5 = 0; var5 < -1916816431 * this.field_2141; ++var5) {
                     if(this.field_2130) {
                        this.field_2132[var5] = var1.readLong();
                     }

                     if(this.field_2131) {
                        if(var2 == 1359138405) {
                           throw new IllegalStateException();
                        }

                        this.field_2146[var5] = var1.method_347(-1871529570);
                     }

                     this.field_2149[var5] = var1.readByte();
                     if(var3 >= 2) {
                        if(var2 == 1359138405) {
                           throw new IllegalStateException();
                        }

                        this.field_2145[var5] = var1.readInt();
                     }

                     if(var3 >= 5) {
                        if(var2 == 1359138405) {
                           throw new IllegalStateException();
                        }

                        this.field_2140[var5] = var1.readShort();
                     } else {
                        this.field_2140[var5] = 0;
                     }

                     if(var3 >= 6) {
                        if(var2 == 1359138405) {
                           throw new IllegalStateException();
                        }

                        boolean[] var10000 = this.field_2147;
                        boolean var10002;
                        if(var1.readUnsignedByte() == 1) {
                           if(var2 == 1359138405) {
                              return;
                           }

                           var10002 = true;
                        } else {
                           var10002 = false;
                        }

                        var10000[var5] = var10002;
                     } else {
                        this.field_2147[var5] = false;
                     }
                  }

                  this.method_3643(-1130726760);
               }

               if(1521260055 * this.field_2150 > 0) {
                  if(var2 == 1359138405) {
                     throw new IllegalStateException();
                  }

                  if(this.field_2130) {
                     label390: {
                        if(var2 == 1359138405) {
                           throw new IllegalStateException();
                        }

                        if(this.field_2151 != null) {
                           if(var2 == 1359138405) {
                              return;
                           }

                           if(this.field_2151.length >= this.field_2150 * 1521260055) {
                              break label390;
                           }

                           if(var2 == 1359138405) {
                              throw new IllegalStateException();
                           }
                        }

                        this.field_2151 = new long[this.field_2150 * 1521260055];
                     }
                  }

                  if(this.field_2131) {
                     label392: {
                        if(var2 == 1359138405) {
                           throw new IllegalStateException();
                        }

                        if(null != this.field_2129) {
                           if(var2 == 1359138405) {
                              throw new IllegalStateException();
                           }

                           if(this.field_2129.length >= this.field_2150 * 1521260055) {
                              break label392;
                           }
                        }

                        this.field_2129 = new String[this.field_2150 * 1521260055];
                     }
                  }

                  for(var5 = 0; var5 < 1521260055 * this.field_2150; ++var5) {
                     if(var2 == 1359138405) {
                        throw new IllegalStateException();
                     }

                     if(this.field_2130) {
                        if(var2 == 1359138405) {
                           throw new IllegalStateException();
                        }

                        this.field_2151[var5] = var1.readLong();
                     }

                     if(this.field_2131) {
                        if(var2 == 1359138405) {
                           throw new IllegalStateException();
                        }

                        this.field_2129[var5] = var1.method_347(-2128666402);
                     }
                  }
               }

               if(var3 >= 3) {
                  var5 = var1.readShort();
                  if(var5 > 0) {
                     int var10003;
                     if(var5 < 16) {
                        if(var2 == 1359138405) {
                           return;
                        }

                        var10003 = class_100.method_1845(var5);
                     } else {
                        var10003 = 16;
                     }

                     class_369 var10001 = new class_369(var10003);
                     this.field_2154 = var10001;

                     while(var5-- > 0) {
                        if(var2 == 1359138405) {
                           throw new IllegalStateException();
                        }

                        int var6 = var1.readInt();
                        int var7 = var6 & 1073741823;
                        int var8 = var6 >>> 30;
                        class_369 var15;
                        if(0 == var8) {
                           if(var2 == 1359138405) {
                              throw new IllegalStateException();
                           }

                           int var9 = var1.readInt();
                           var15 = this.field_2154;
                           class_32 var16 = new class_32(var9);
                           var15.method_6588(var16, (long)var7);
                        } else if(var8 == 1) {
                           if(var2 == 1359138405) {
                              return;
                           }

                           long var12 = var1.readLong();
                           var15 = this.field_2154;
                           class_31 var17 = new class_31(var12);
                           var15.method_6588(var17, (long)var7);
                        } else if(2 == var8) {
                           if(var2 == 1359138405) {
                              throw new IllegalStateException();
                           }

                           String var13 = var1.method_139(-391631059);
                           var15 = this.field_2154;
                           class_34 var18 = new class_34(var13);
                           var15.method_6588(var18, (long)var7);
                        }
                     }
                  }
               }

               return;
            }

            if(var2 == 1359138405) {
               throw new IllegalStateException();
            }
         }

         throw new RuntimeException("" + var3);
      } catch (RuntimeException var11) {
         throw class_223.method_4281(var11);
      }
   }

   // $FF: renamed from: ai () int[]
   public int[] method_3666() {
      if(this.field_2144 == null) {
         String[] var1 = new String[this.field_2141 * -1916816431];
         this.field_2144 = new int[-1916816431 * this.field_2141];

         for(int var2 = 0; var2 < this.field_2141 * -1916816431; this.field_2144[var2] = var2++) {
            var1[var2] = this.field_2146[var2];
            if(null != var1[var2]) {
               var1[var2] = var1[var2].toLowerCase();
            }
         }

         class_175.method_3740(var1, this.field_2144);
      }

      return this.field_2144;
   }

   // $FF: renamed from: ar () int[]
   public int[] method_3667() {
      if(this.field_2144 == null) {
         String[] var1 = new String[this.field_2141 * -1916816431];
         this.field_2144 = new int[-226041535 * this.field_2141];

         for(int var2 = 0; var2 < this.field_2141 * -1916816431; this.field_2144[var2] = var2++) {
            var1[var2] = this.field_2146[var2];
            if(null != var1[var2]) {
               var1[var2] = var1[var2].toLowerCase();
            }
         }

         class_175.method_3740(var1, this.field_2144);
      }

      return this.field_2144;
   }

   // $FF: renamed from: ag () int[]
   public int[] method_3668() {
      if(this.field_2144 == null) {
         String[] var1 = new String[this.field_2141 * -1916816431];
         this.field_2144 = new int[-212803152 * this.field_2141];

         for(int var2 = 0; var2 < this.field_2141 * -1947773705; this.field_2144[var2] = var2++) {
            var1[var2] = this.field_2146[var2];
            if(null != var1[var2]) {
               var1[var2] = var1[var2].toLowerCase();
            }
         }

         class_175.method_3740(var1, this.field_2144);
      }

      return this.field_2144;
   }

   // $FF: renamed from: ax (long, java.lang.String, int) void
   void method_3669(long var1, String var3, int var4) {
      if(var3 != null && var3.length() == 0) {
         var3 = null;
      }

      if(var1 > 0L != this.field_2130) {
         throw new RuntimeException("");
      } else if(this.field_2131 != (var3 != null)) {
         throw new RuntimeException("");
      } else {
         if(var1 > 0L && (null == this.field_2132 || this.field_2141 * -1916816431 >= this.field_2132.length) || null != var3 && (null == this.field_2146 || this.field_2141 * -1916816431 >= this.field_2146.length)) {
            this.method_3635(this.field_2141 * -1916816431 + 5, 2024010995);
         }

         if(null != this.field_2132) {
            this.field_2132[-1916816431 * this.field_2141] = var1;
         }

         if(this.field_2146 != null) {
            this.field_2146[this.field_2141 * -1916816431] = var3;
         }

         if(1791364373 * this.field_2139 == -1) {
            this.field_2139 = this.field_2141 * -809708851;
            this.field_2149[-1916816431 * this.field_2141] = 126;
         } else {
            this.field_2149[this.field_2141 * -1916816431] = 0;
         }

         this.field_2145[this.field_2141 * -1916816431] = 0;
         this.field_2140[this.field_2141 * -1916816431] = var4;
         this.field_2147[-1916816431 * this.field_2141] = false;
         this.field_2141 += 1332970801;
         this.field_2144 = null;
      }
   }

   // $FF: renamed from: bz (int, long) boolean
   boolean method_3670(int var1, long var2) {
      if(null != this.field_2154) {
         class_27 var4 = this.field_2154.method_6586((long)var1);
         if(var4 != null) {
            if(var4 instanceof class_31) {
               class_31 var5 = (class_31)var4;
               if(var5.field_57 == var2) {
                  return false;
               }

               var5.field_57 = var2;
               return true;
            }

            var4.method_108();
         }
      } else {
         class_369 var10001 = new class_369(4);
         this.field_2154 = var10001;
      }

      class_369 var10000 = this.field_2154;
      class_31 var6 = new class_31(var2);
      var10000.method_6588(var6, (long)var1);
      return true;
   }

   // $FF: renamed from: aj (long, java.lang.String, int) void
   void method_3671(long var1, String var3, int var4) {
      if(var3 != null && var3.length() == 0) {
         var3 = null;
      }

      if(var1 > 0L != this.field_2130) {
         throw new RuntimeException("");
      } else if(this.field_2131 != (var3 != null)) {
         throw new RuntimeException("");
      } else {
         if(var1 > 0L && (null == this.field_2132 || this.field_2141 * -1916816431 >= this.field_2132.length) || null != var3 && (null == this.field_2146 || this.field_2141 * -1916816431 >= this.field_2146.length)) {
            this.method_3635(this.field_2141 * -1916816431 + 5, 1932154777);
         }

         if(null != this.field_2132) {
            this.field_2132[-1916816431 * this.field_2141] = var1;
         }

         if(this.field_2146 != null) {
            this.field_2146[this.field_2141 * -1916816431] = var3;
         }

         if(1791364373 * this.field_2139 == -1) {
            this.field_2139 = this.field_2141 * -809708851;
            this.field_2149[-1916816431 * this.field_2141] = 126;
         } else {
            this.field_2149[this.field_2141 * -1916816431] = 0;
         }

         this.field_2145[this.field_2141 * -1916816431] = 0;
         this.field_2140[this.field_2141 * -1916816431] = var4;
         this.field_2147[-1916816431 * this.field_2141] = false;
         this.field_2141 += 1332970801;
         this.field_2144 = null;
      }
   }

   // $FF: renamed from: am (int) void
   void method_3672(int var1) {
      if(var1 >= 0 && var1 < this.field_2141 * -1916816431) {
         this.field_2141 -= 1332970801;
         this.field_2144 = null;
         if(this.field_2141 * 624677713 == 0) {
            this.field_2132 = null;
            this.field_2146 = null;
            this.field_2149 = null;
            this.field_2145 = null;
            this.field_2140 = null;
            this.field_2147 = null;
            this.field_2139 = 775955907;
            this.field_2138 = -190595459;
         } else {
            System.arraycopy(this.field_2149, 1 + var1, this.field_2149, var1, -1916816431 * this.field_2141 - var1);
            System.arraycopy(this.field_2145, 1 + var1, this.field_2145, var1, this.field_2141 * 856770892 - var1);
            System.arraycopy(this.field_2140, var1 + 1, this.field_2140, var1, this.field_2141 * -1916816431 - var1);
            System.arraycopy(this.field_2147, var1 + 1, this.field_2147, var1, 35997027 * this.field_2141 - var1);
            if(this.field_2132 != null) {
               System.arraycopy(this.field_2132, 1 + var1, this.field_2132, var1, this.field_2141 * 1498099370 - var1);
            }

            if(null != this.field_2146) {
               System.arraycopy(this.field_2146, 1 + var1, this.field_2146, var1, this.field_2141 * -1916816431 - var1);
            }

            this.method_3643(1752989150);
         }

      } else {
         throw new RuntimeException("");
      }
   }

   // $FF: renamed from: az () void
   void method_3673() {
      if(this.field_2141 * -779343243 == 0) {
         this.field_2139 = 1474117987;
         this.field_2138 = -190595459;
      } else {
         this.field_2139 = 763001615;
         this.field_2138 = -1540035787;
         int var1 = 0;
         byte var2 = this.field_2149[0];

         for(int var3 = 1; var3 < this.field_2141 * -84245528; ++var3) {
            if(this.field_2149[var3] > var2) {
               if(var2 == 125) {
                  this.field_2138 = 190595459 * var1;
               }

               var1 = var3;
               var2 = this.field_2149[var3];
            } else if(-1 == 1909839147 * this.field_2138 && this.field_2149[var3] == -83853102) {
               this.field_2138 = var3 * 190595459;
            }
         }

         this.field_2139 = var1 * -775955907;
         if(1791364373 * this.field_2139 != -1) {
            this.field_2149[1472631497 * this.field_2139] = (byte)592492684;
         }

      }
   }

   // $FF: renamed from: av () void
   void method_3674() {
      if(this.field_2141 * -1916816431 == 0) {
         this.field_2139 = 775955907;
         this.field_2138 = -190595459;
      } else {
         this.field_2139 = 775955907;
         this.field_2138 = -190595459;
         int var1 = 0;
         byte var2 = this.field_2149[0];

         for(int var3 = 1; var3 < this.field_2141 * -1916816431; ++var3) {
            if(this.field_2149[var3] > var2) {
               if(var2 == 125) {
                  this.field_2138 = 190595459 * var1;
               }

               var1 = var3;
               var2 = this.field_2149[var3];
            } else if(-1 == 1909839147 * this.field_2138 && this.field_2149[var3] == 125) {
               this.field_2138 = var3 * 190595459;
            }
         }

         this.field_2139 = var1 * -775955907;
         if(1791364373 * this.field_2139 != -1) {
            this.field_2149[1791364373 * this.field_2139] = 126;
         }

      }
   }

   // $FF: renamed from: ac () void
   void method_3675() {
      if(this.field_2141 * -1916816431 == 0) {
         this.field_2139 = 775955907;
         this.field_2138 = -190595459;
      } else {
         this.field_2139 = 775955907;
         this.field_2138 = -190595459;
         int var1 = 0;
         byte var2 = this.field_2149[0];

         for(int var3 = 1; var3 < this.field_2141 * -1916816431; ++var3) {
            if(this.field_2149[var3] > var2) {
               if(var2 == 125) {
                  this.field_2138 = 190595459 * var1;
               }

               var1 = var3;
               var2 = this.field_2149[var3];
            } else if(-1 == 1909839147 * this.field_2138 && this.field_2149[var3] == 125) {
               this.field_2138 = var3 * 190595459;
            }
         }

         this.field_2139 = var1 * -775955907;
         if(1791364373 * this.field_2139 != -1) {
            this.field_2149[1791364373 * this.field_2139] = 126;
         }

      }
   }

   // $FF: renamed from: z (int) void
   void method_3676(int var1) {
      if(this.field_2130) {
         if(this.field_2132 != null) {
            System.arraycopy(this.field_2132, 0, this.field_2132 = new long[var1], 0, -1916816431 * this.field_2141);
         } else {
            this.field_2132 = new long[var1];
         }
      }

      if(this.field_2131) {
         if(this.field_2146 != null) {
            System.arraycopy(this.field_2146, 0, this.field_2146 = new String[var1], 0, -1916816431 * this.field_2141);
         } else {
            this.field_2146 = new String[var1];
         }
      }

      if(this.field_2149 != null) {
         System.arraycopy(this.field_2149, 0, this.field_2149 = new byte[var1], 0, this.field_2141 * -1916816431);
      } else {
         this.field_2149 = new byte[var1];
      }

      if(null != this.field_2145) {
         System.arraycopy(this.field_2145, 0, this.field_2145 = new int[var1], 0, this.field_2141 * -1916816431);
      } else {
         this.field_2145 = new int[var1];
      }

      if(null != this.field_2140) {
         System.arraycopy(this.field_2140, 0, this.field_2140 = new int[var1], 0, this.field_2141 * -1916816431);
      } else {
         this.field_2140 = new int[var1];
      }

      if(this.field_2147 != null) {
         System.arraycopy(this.field_2147, 0, this.field_2147 = new boolean[var1], 0, -1916816431 * this.field_2141);
      } else {
         this.field_2147 = new boolean[var1];
      }

   }

   // $FF: renamed from: u (int, int) void
   void method_3677(int var1, int var2) {
      try {
         this.field_2150 -= 306971047;
         if(0 == this.field_2150 * 1521260055) {
            if(var2 == -1270974472) {
               throw new IllegalStateException();
            }

            this.field_2151 = null;
            this.field_2129 = null;
         } else {
            if(this.field_2151 != null) {
               if(var2 == -1270974472) {
                  throw new IllegalStateException();
               }

               System.arraycopy(this.field_2151, var1 + 1, this.field_2151, var1, this.field_2150 * 1521260055 - var1);
            }

            if(null != this.field_2129) {
               if(var2 == -1270974472) {
                  throw new IllegalStateException();
               }

               System.arraycopy(this.field_2129, 1 + var1, this.field_2129, var1, this.field_2150 * 1521260055 - var1);
            }
         }

      } catch (RuntimeException var3) {
         throw class_223.method_4281(var3);
      }
   }

   // $FF: renamed from: ba (nd) void
   void method_3678(Buffer var1) {
      int var2 = var1.readUnsignedByte();
      if(var2 >= 1 && var2 <= 6) {
         int var3 = var1.readUnsignedByte();
         if(0 != (var3 & 1)) {
            this.field_2130 = true;
         }

         if((var3 & 2) != 0) {
            this.field_2131 = true;
         }

         if(!this.field_2130) {
            this.field_2132 = null;
            this.field_2151 = null;
         }

         if(!this.field_2131) {
            this.field_2146 = null;
            this.field_2129 = null;
         }

         this.field_2133 = var1.readInt() * -1106268981;
         this.field_2153 = var1.readInt() * -720089017;
         if(var2 <= 3 && -2010490505 * this.field_2153 != 0) {
            this.field_2153 += 1838474080;
         }

         this.field_2141 = var1.readShort() * 1332970801;
         this.field_2150 = var1.readUnsignedByte() * 306971047;
         this.field_2134 = var1.method_139(-391631059);
         if(var2 >= 4) {
            var1.readInt();
         }

         this.field_2136 = var1.readUnsignedByte() == 1;
         this.field_2142 = var1.readByte();
         this.field_2152 = var1.readByte();
         this.field_2137 = var1.readByte();
         this.field_2135 = var1.readByte();
         int var4;
         if(this.field_2141 * -1916816431 > 0) {
            if(this.field_2130 && (null == this.field_2132 || this.field_2132.length < this.field_2141 * -1916816431)) {
               this.field_2132 = new long[-1916816431 * this.field_2141];
            }

            if(this.field_2131 && (this.field_2146 == null || this.field_2146.length < -1916816431 * this.field_2141)) {
               this.field_2146 = new String[-1916816431 * this.field_2141];
            }

            if(null == this.field_2149 || this.field_2149.length < -1916816431 * this.field_2141) {
               this.field_2149 = new byte[this.field_2141 * -1916816431];
            }

            if(this.field_2145 == null || this.field_2145.length < this.field_2141 * -1916816431) {
               this.field_2145 = new int[this.field_2141 * -1916816431];
            }

            if(this.field_2140 == null || this.field_2140.length < -1916816431 * this.field_2141) {
               this.field_2140 = new int[-1916816431 * this.field_2141];
            }

            if(this.field_2147 == null || this.field_2147.length < this.field_2141 * -1916816431) {
               this.field_2147 = new boolean[-1916816431 * this.field_2141];
            }

            for(var4 = 0; var4 < -1916816431 * this.field_2141; ++var4) {
               if(this.field_2130) {
                  this.field_2132[var4] = var1.readLong();
               }

               if(this.field_2131) {
                  this.field_2146[var4] = var1.method_347(-519378041);
               }

               this.field_2149[var4] = var1.readByte();
               if(var2 >= 2) {
                  this.field_2145[var4] = var1.readInt();
               }

               if(var2 >= 5) {
                  this.field_2140[var4] = var1.readShort();
               } else {
                  this.field_2140[var4] = 0;
               }

               if(var2 >= 6) {
                  this.field_2147[var4] = var1.readUnsignedByte() == 1;
               } else {
                  this.field_2147[var4] = false;
               }
            }

            this.method_3643(708694779);
         }

         if(1521260055 * this.field_2150 > 0) {
            if(this.field_2130 && (this.field_2151 == null || this.field_2151.length < this.field_2150 * 1521260055)) {
               this.field_2151 = new long[this.field_2150 * 1521260055];
            }

            if(this.field_2131 && (null == this.field_2129 || this.field_2129.length < this.field_2150 * 1521260055)) {
               this.field_2129 = new String[this.field_2150 * 1521260055];
            }

            for(var4 = 0; var4 < 1521260055 * this.field_2150; ++var4) {
               if(this.field_2130) {
                  this.field_2151[var4] = var1.readLong();
               }

               if(this.field_2131) {
                  this.field_2129[var4] = var1.method_347(-801513938);
               }
            }
         }

         if(var2 >= 3) {
            var4 = var1.readShort();
            if(var4 > 0) {
               class_369 var10001 = new class_369(var4 < 16?class_100.method_1845(var4):16);
               this.field_2154 = var10001;

               while(var4-- > 0) {
                  int var5 = var1.readInt();
                  int var6 = var5 & 1073741823;
                  int var7 = var5 >>> 30;
                  class_369 var12;
                  if(0 == var7) {
                     int var8 = var1.readInt();
                     var12 = this.field_2154;
                     class_32 var13 = new class_32(var8);
                     var12.method_6588(var13, (long)var6);
                  } else if(var7 == 1) {
                     long var10 = var1.readLong();
                     var12 = this.field_2154;
                     class_31 var14 = new class_31(var10);
                     var12.method_6588(var14, (long)var6);
                  } else if(2 == var7) {
                     String var11 = var1.method_139(-391631059);
                     var12 = this.field_2154;
                     class_34 var15 = new class_34(var11);
                     var12.method_6588(var15, (long)var6);
                  }
               }
            }
         }

      } else {
         throw new RuntimeException("" + var2);
      }
   }

   // $FF: renamed from: aq (int) void
   void method_3679(int var1) {
      this.field_2150 -= 1792998263;
      if(0 == this.field_2150 * 1521260055) {
         this.field_2151 = null;
         this.field_2129 = null;
      } else {
         if(this.field_2151 != null) {
            System.arraycopy(this.field_2151, var1 + 1, this.field_2151, var1, this.field_2150 * 1258377466 - var1);
         }

         if(null != this.field_2129) {
            System.arraycopy(this.field_2129, 1 + var1, this.field_2129, var1, this.field_2150 * 1971144696 - var1);
         }
      }

   }

   // $FF: renamed from: aw (int) void
   void method_3680(int var1) {
      this.field_2150 -= 306971047;
      if(0 == this.field_2150 * 1521260055) {
         this.field_2151 = null;
         this.field_2129 = null;
      } else {
         if(this.field_2151 != null) {
            System.arraycopy(this.field_2151, var1 + 1, this.field_2151, var1, this.field_2150 * 1521260055 - var1);
         }

         if(null != this.field_2129) {
            System.arraycopy(this.field_2129, 1 + var1, this.field_2129, var1, this.field_2150 * 1521260055 - var1);
         }
      }

   }

   // $FF: renamed from: af (int, byte) int
   int method_3681(int var1, byte var2) {
      if(var2 != 126 && 127 != var2) {
         if(var1 == this.field_2139 * 1982396689 && (-280888736 * this.field_2138 == -1 || this.field_2149[1909839147 * this.field_2138] < -127593293)) {
            return -1;
         } else if(this.field_2149[var1] == var2) {
            return -1;
         } else {
            this.field_2149[var1] = var2;
            this.method_3643(-1242954850);
            return var1;
         }
      } else {
         return -1;
      }
   }

   // $FF: renamed from: ak (int, byte) int
   int method_3682(int var1, byte var2) {
      if(var2 != 126 && 1248565365 != var2) {
         if(var1 == this.field_2139 * -1804824699 && (-559813009 * this.field_2138 == -1 || this.field_2149[1909839147 * this.field_2138] < 1170310297)) {
            return -1;
         } else if(this.field_2149[var1] == var2) {
            return -1;
         } else {
            this.field_2149[var1] = var2;
            this.method_3643(679488487);
            return var1;
         }
      } else {
         return -1;
      }
   }

   // $FF: renamed from: bu (int, int) boolean
   boolean method_3683(int var1, int var2) {
      if(null != this.field_2154) {
         class_27 var3 = this.field_2154.method_6586((long)var1);
         if(var3 != null) {
            if(var3 instanceof class_32) {
               class_32 var4 = (class_32)var3;
               if(var2 == var4.field_58) {
                  return false;
               }

               var4.field_58 = var2;
               return true;
            }

            var3.method_108();
         }
      } else {
         class_369 var10001 = new class_369(4);
         this.field_2154 = var10001;
      }

      class_369 var10000 = this.field_2154;
      class_32 var5 = new class_32(var2);
      var10000.method_6588(var5, (long)var1);
      return true;
   }

   // $FF: renamed from: bv (int, long) boolean
   boolean method_3684(int var1, long var2) {
      if(null != this.field_2154) {
         class_27 var4 = this.field_2154.method_6586((long)var1);
         if(var4 != null) {
            if(var4 instanceof class_31) {
               class_31 var5 = (class_31)var4;
               if(var5.field_57 == var2) {
                  return false;
               }

               var5.field_57 = var2;
               return true;
            }

            var4.method_108();
         }
      } else {
         class_369 var10001 = new class_369(4);
         this.field_2154 = var10001;
      }

      class_369 var10000 = this.field_2154;
      class_31 var6 = new class_31(var2);
      var10000.method_6588(var6, (long)var1);
      return true;
   }

   // $FF: renamed from: au (int) boolean
   boolean method_3685(int var1) {
      if(var1 != 1791364373 * this.field_2139 && this.field_2149[var1] != 126) {
         this.field_2149[1791364373 * this.field_2139] = 125;
         this.field_2138 = this.field_2139 * -2026436929;
         this.field_2149[var1] = 126;
         this.field_2139 = -775955907 * var1;
         return true;
      } else {
         return false;
      }
   }

   // $FF: renamed from: an (int, boolean) int
   int method_3686(int var1, boolean var2) {
      if(this.field_2147[var1] == var2) {
         return -1;
      } else {
         this.field_2147[var1] = var2;
         return var1;
      }
   }

   // $FF: renamed from: bd (int, int, int, int) int
   int method_3687(int var1, int var2, int var3, int var4) {
      int var5 = (1 << var3) - 1;
      int var6 = 166493087 == var4?-1:(1 << 1 + var4) - 1;
      int var7 = var6 ^ var5;
      var2 <<= var3;
      var2 &= var7;
      int var8 = this.field_2145[var1];
      if((var8 & var7) == var2) {
         return -1;
      } else {
         var8 &= ~var7;
         this.field_2145[var1] = var8 | var2;
         return var1;
      }
   }

   // $FF: renamed from: bt (int, int, int, int) int
   int method_3688(int var1, int var2, int var3, int var4) {
      int var5 = (1 << var3) - 1;
      int var6 = 31 == var4?-1:(1 << 1 + var4) - 1;
      int var7 = var6 ^ var5;
      var2 <<= var3;
      var2 &= var7;
      int var8 = this.field_2145[var1];
      if((var8 & var7) == var2) {
         return -1;
      } else {
         var8 &= ~var7;
         this.field_2145[var1] = var8 | var2;
         return var1;
      }
   }

   // $FF: renamed from: <init> (nd) void
   public class_171(Buffer var1) {
      super();
      try {
         this.field_2133 = 0;
         this.field_2134 = null;
         this.field_2153 = 0;
         this.field_2139 = 775955907;
         this.field_2138 = -190595459;
         this.method_3665(var1, 469321554);
      } catch (RuntimeException var2) {
         throw class_223.method_4281(var2);
      }
   }

   // $FF: renamed from: he (int, int, byte) void
   static final void method_3690(int var0, int var1, byte var2) {
      try {
         class_335 var3 = client.field_1635[class_115.field_1289 * 1115122599][var0][var1];
         if(null == var3) {
            if(var2 != 0) {
               throw new IllegalStateException();
            } else {
               class_206.field_2401.method_4805(class_115.field_1289 * 1115122599, var0, var1);
            }
         } else {
            long var4 = -99999999L;
            class_94 var6 = null;

            class_94 var7;
            for(var7 = (class_94)var3.method_5944(); var7 != null; var7 = (class_94)var3.method_5972()) {
               if(var2 != 0) {
                  return;
               }

               class_80 var8 = class_299.method_5347(-467972035 * var7.field_1022, 520420920);
               long var9 = (long)(var8.field_719 * -407851249);
               if(1 == -1049731853 * var8.field_705) {
                  if(var2 != 0) {
                     throw new IllegalStateException();
                  }

                  var9 *= (long)(var7.field_1023 * 223075527 + 1);
               }

               if(var9 > var4) {
                  if(var2 != 0) {
                     throw new IllegalStateException();
                  }

                  var4 = var9;
                  var6 = var7;
               }
            }

            if(null == var6) {
               if(var2 == 0) {
                  class_206.field_2401.method_4805(class_115.field_1289 * 1115122599, var0, var1);
               }
            } else {
               var3.method_5970(var6);
               class_94 var13 = null;
               class_94 var14 = null;

               for(var7 = (class_94)var3.method_5944(); null != var7; var7 = (class_94)var3.method_5972()) {
                  if(var2 != 0) {
                     throw new IllegalStateException();
                  }

                  if(var7.field_1022 * -467972035 != -467972035 * var6.field_1022) {
                     if(var2 != 0) {
                        throw new IllegalStateException();
                     }

                     if(null == var13) {
                        var13 = var7;
                     }

                     if(var13.field_1022 * -467972035 != -467972035 * var7.field_1022) {
                        if(var2 != 0) {
                           throw new IllegalStateException();
                        }

                        if(var14 == null) {
                           if(var2 != 0) {
                              throw new IllegalStateException();
                           }

                           var14 = var7;
                        }
                     }
                  }
               }

               long var10 = class_141.method_3047(var0, var1, 3, false, 0, -591767217);
               class_206.field_2401.method_4730(1115122599 * class_115.field_1289, var0, var1, class_205.method_4113(var0 * 128 + 64, 64 + 128 * var1, class_115.field_1289 * 1115122599, -1010872808), var6, var10, var13, var14);
            }
         }
      } catch (RuntimeException var12) {
         throw class_223.method_4281(var12);
      }
   }

   // $FF: renamed from: ay (int, byte) int
   int method_3691(int var1, byte var2) {
      if(var2 != 126 && 127 != var2) {
         if(var1 == this.field_2139 * 1791364373 && (1909839147 * this.field_2138 == -1 || this.field_2149[1909839147 * this.field_2138] < 125)) {
            return -1;
         } else if(this.field_2149[var1] == var2) {
            return -1;
         } else {
            this.field_2149[var1] = var2;
            this.method_3643(139575888);
            return var1;
         }
      } else {
         return -1;
      }
   }

   // $FF: renamed from: bq (int, int) boolean
   boolean method_3692(int var1, int var2) {
      if(null != this.field_2154) {
         class_27 var3 = this.field_2154.method_6586((long)var1);
         if(var3 != null) {
            if(var3 instanceof class_32) {
               class_32 var4 = (class_32)var3;
               if(var2 == var4.field_58) {
                  return false;
               }

               var4.field_58 = var2;
               return true;
            }

            var3.method_108();
         }
      } else {
         class_369 var10001 = new class_369(4);
         this.field_2154 = var10001;
      }

      class_369 var10000 = this.field_2154;
      class_32 var5 = new class_32(var2);
      var10000.method_6588(var5, (long)var1);
      return true;
   }

   // $FF: renamed from: bm (int, long) boolean
   boolean method_3693(int var1, long var2) {
      if(null != this.field_2154) {
         class_27 var4 = this.field_2154.method_6586((long)var1);
         if(var4 != null) {
            if(var4 instanceof class_31) {
               class_31 var5 = (class_31)var4;
               if(var5.field_57 == var2) {
                  return false;
               }

               var5.field_57 = var2;
               return true;
            }

            var4.method_108();
         }
      } else {
         class_369 var10001 = new class_369(4);
         this.field_2154 = var10001;
      }

      class_369 var10000 = this.field_2154;
      class_31 var6 = new class_31(var2);
      var10000.method_6588(var6, (long)var1);
      return true;
   }

   // $FF: renamed from: bh (int, long) boolean
   boolean method_3694(int var1, long var2) {
      if(null != this.field_2154) {
         class_27 var4 = this.field_2154.method_6586((long)var1);
         if(var4 != null) {
            if(var4 instanceof class_31) {
               class_31 var5 = (class_31)var4;
               if(var5.field_57 == var2) {
                  return false;
               }

               var5.field_57 = var2;
               return true;
            }

            var4.method_108();
         }
      } else {
         class_369 var10001 = new class_369(4);
         this.field_2154 = var10001;
      }

      class_369 var10000 = this.field_2154;
      class_31 var6 = new class_31(var2);
      var10000.method_6588(var6, (long)var1);
      return true;
   }

   // $FF: renamed from: at (long, java.lang.String) void
   void method_3695(long var1, String var3) {
      if(null != var3 && var3.length() == 0) {
         var3 = null;
      }

      if(this.field_2130 != var1 > 0L) {
         throw new RuntimeException("");
      } else if(this.field_2131 != (var3 != null)) {
         throw new RuntimeException("");
      } else {
         if(var1 > 0L && (this.field_2151 == null || 1521260055 * this.field_2150 >= this.field_2151.length) || null != var3 && (null == this.field_2129 || 1521260055 * this.field_2150 >= this.field_2129.length)) {
            this.method_3636(1521260055 * this.field_2150 + 5, (byte)0);
         }

         if(null != this.field_2151) {
            this.field_2151[this.field_2150 * 1521260055] = var1;
         }

         if(null != this.field_2129) {
            this.field_2129[1521260055 * this.field_2150] = var3;
         }

         this.field_2150 += 306971047;
      }
   }

   // $FF: renamed from: g (int, int, int) boolean
   boolean method_3696(int var1, int var2, int var3) {
      try {
         if(null != this.field_2154) {
            if(var3 == -2021665747) {
               throw new IllegalStateException();
            }

            class_27 var4 = this.field_2154.method_6586((long)var1);
            if(var4 != null) {
               if(var3 == -2021665747) {
                  throw new IllegalStateException();
               }

               if(var4 instanceof class_32) {
                  if(var3 == -2021665747) {
                     throw new IllegalStateException();
                  }

                  class_32 var5 = (class_32)var4;
                  if(var2 == var5.field_58) {
                     if(var3 == -2021665747) {
                        throw new IllegalStateException();
                     }

                     return false;
                  }

                  var5.field_58 = var2;
                  return true;
               }

               var4.method_108();
            }
         } else {
            class_369 var10001 = new class_369(4);
            this.field_2154 = var10001;
         }

         class_369 var10000 = this.field_2154;
         class_32 var7 = new class_32(var2);
         var10000.method_6588(var7, (long)var1);
         return true;
      } catch (RuntimeException var6) {
         throw class_223.method_4281(var6);
      }
   }

   // $FF: renamed from: br (int, java.lang.String) boolean
   boolean method_3697(int var1, String var2) {
      if(null == var2) {
         var2 = "";
      } else if(var2.length() > 80) {
         var2 = var2.substring(0, 80);
      }

      class_369 var10000;
      class_34 var10001;
      if(this.field_2154 != null) {
         class_27 var3 = this.field_2154.method_6586((long)var1);
         if(null != var3) {
            if(var3 instanceof class_34) {
               class_34 var4 = (class_34)var3;
               if(var4.field_60 instanceof String) {
                  if(var2.equals(var4.field_60)) {
                     return false;
                  }

                  var4.method_108();
                  var10000 = this.field_2154;
                  var10001 = new class_34(var2);
                  var10000.method_6588(var10001, var4.field_9);
                  return true;
               }
            }

            var3.method_108();
         }
      } else {
         class_369 var5 = new class_369(4);
         this.field_2154 = var5;
      }

      var10000 = this.field_2154;
      var10001 = new class_34(var2);
      var10000.method_6588(var10001, (long)var1);
      return true;
   }

   // $FF: renamed from: bf (nd) void
   void method_3698(Buffer var1) {
      int var2 = var1.readUnsignedByte();
      if(var2 >= 1 && var2 <= 6) {
         int var3 = var1.readUnsignedByte();
         if(0 != (var3 & 1)) {
            this.field_2130 = true;
         }

         if((var3 & 2) != 0) {
            this.field_2131 = true;
         }

         if(!this.field_2130) {
            this.field_2132 = null;
            this.field_2151 = null;
         }

         if(!this.field_2131) {
            this.field_2146 = null;
            this.field_2129 = null;
         }

         this.field_2133 = var1.readInt() * -1106268981;
         this.field_2153 = var1.readInt() * -720089017;
         if(var2 <= 3 && -2010490505 * this.field_2153 != 0) {
            this.field_2153 += 1838474080;
         }

         this.field_2141 = var1.readShort() * 1332970801;
         this.field_2150 = var1.readUnsignedByte() * 306971047;
         this.field_2134 = var1.method_139(-391631059);
         if(var2 >= 4) {
            var1.readInt();
         }

         this.field_2136 = var1.readUnsignedByte() == 1;
         this.field_2142 = var1.readByte();
         this.field_2152 = var1.readByte();
         this.field_2137 = var1.readByte();
         this.field_2135 = var1.readByte();
         int var4;
         if(this.field_2141 * -1916816431 > 0) {
            if(this.field_2130 && (null == this.field_2132 || this.field_2132.length < this.field_2141 * -1916816431)) {
               this.field_2132 = new long[-1916816431 * this.field_2141];
            }

            if(this.field_2131 && (this.field_2146 == null || this.field_2146.length < -1916816431 * this.field_2141)) {
               this.field_2146 = new String[-1916816431 * this.field_2141];
            }

            if(null == this.field_2149 || this.field_2149.length < -1916816431 * this.field_2141) {
               this.field_2149 = new byte[this.field_2141 * -1916816431];
            }

            if(this.field_2145 == null || this.field_2145.length < this.field_2141 * -1916816431) {
               this.field_2145 = new int[this.field_2141 * -1916816431];
            }

            if(this.field_2140 == null || this.field_2140.length < -1916816431 * this.field_2141) {
               this.field_2140 = new int[-1916816431 * this.field_2141];
            }

            if(this.field_2147 == null || this.field_2147.length < this.field_2141 * -1916816431) {
               this.field_2147 = new boolean[-1916816431 * this.field_2141];
            }

            for(var4 = 0; var4 < -1916816431 * this.field_2141; ++var4) {
               if(this.field_2130) {
                  this.field_2132[var4] = var1.readLong();
               }

               if(this.field_2131) {
                  this.field_2146[var4] = var1.method_347(-2064536503);
               }

               this.field_2149[var4] = var1.readByte();
               if(var2 >= 2) {
                  this.field_2145[var4] = var1.readInt();
               }

               if(var2 >= 5) {
                  this.field_2140[var4] = var1.readShort();
               } else {
                  this.field_2140[var4] = 0;
               }

               if(var2 >= 6) {
                  this.field_2147[var4] = var1.readUnsignedByte() == 1;
               } else {
                  this.field_2147[var4] = false;
               }
            }

            this.method_3643(-507124235);
         }

         if(1521260055 * this.field_2150 > 0) {
            if(this.field_2130 && (this.field_2151 == null || this.field_2151.length < this.field_2150 * 1521260055)) {
               this.field_2151 = new long[this.field_2150 * 1521260055];
            }

            if(this.field_2131 && (null == this.field_2129 || this.field_2129.length < this.field_2150 * 1521260055)) {
               this.field_2129 = new String[this.field_2150 * 1521260055];
            }

            for(var4 = 0; var4 < 1521260055 * this.field_2150; ++var4) {
               if(this.field_2130) {
                  this.field_2151[var4] = var1.readLong();
               }

               if(this.field_2131) {
                  this.field_2129[var4] = var1.method_347(-1838389697);
               }
            }
         }

         if(var2 >= 3) {
            var4 = var1.readShort();
            if(var4 > 0) {
               class_369 var10001 = new class_369(var4 < 16?class_100.method_1845(var4):16);
               this.field_2154 = var10001;

               while(var4-- > 0) {
                  int var5 = var1.readInt();
                  int var6 = var5 & 1073741823;
                  int var7 = var5 >>> 30;
                  class_369 var12;
                  if(0 == var7) {
                     int var8 = var1.readInt();
                     var12 = this.field_2154;
                     class_32 var13 = new class_32(var8);
                     var12.method_6588(var13, (long)var6);
                  } else if(var7 == 1) {
                     long var10 = var1.readLong();
                     var12 = this.field_2154;
                     class_31 var14 = new class_31(var10);
                     var12.method_6588(var14, (long)var6);
                  } else if(2 == var7) {
                     String var11 = var1.method_139(-391631059);
                     var12 = this.field_2154;
                     class_34 var15 = new class_34(var11);
                     var12.method_6588(var15, (long)var6);
                  }
               }
            }
         }

      } else {
         throw new RuntimeException("" + var2);
      }
   }

   // $FF: renamed from: q (int) void
   void method_3699(int var1) {
      if(this.field_2130) {
         if(null != this.field_2151) {
            System.arraycopy(this.field_2151, 0, this.field_2151 = new long[var1], 0, -2120131086 * this.field_2150);
         } else {
            this.field_2151 = new long[var1];
         }
      }

      if(this.field_2131) {
         if(null != this.field_2129) {
            System.arraycopy(this.field_2129, 0, this.field_2129 = new String[var1], 0, 1521260055 * this.field_2150);
         } else {
            this.field_2129 = new String[var1];
         }
      }

   }

   // $FF: renamed from: be (nd) void
   void method_3700(Buffer var1) {
      int var2 = var1.readUnsignedByte();
      if(var2 >= 1 && var2 <= 6) {
         int var3 = var1.readUnsignedByte();
         if(0 != (var3 & 1)) {
            this.field_2130 = true;
         }

         if((var3 & 2) != 0) {
            this.field_2131 = true;
         }

         if(!this.field_2130) {
            this.field_2132 = null;
            this.field_2151 = null;
         }

         if(!this.field_2131) {
            this.field_2146 = null;
            this.field_2129 = null;
         }

         this.field_2133 = var1.readInt() * 575094551;
         this.field_2153 = var1.readInt() * -759132496;
         if(var2 <= 3 && -2121158282 * this.field_2153 != 0) {
            this.field_2153 += -1758876806;
         }

         this.field_2141 = var1.readShort() * 1332970801;
         this.field_2150 = var1.readUnsignedByte() * 1285697513;
         this.field_2134 = var1.method_139(-391631059);
         if(var2 >= 4) {
            var1.readInt();
         }

         this.field_2136 = var1.readUnsignedByte() == 1;
         this.field_2142 = var1.readByte();
         this.field_2152 = var1.readByte();
         this.field_2137 = var1.readByte();
         this.field_2135 = var1.readByte();
         int var4;
         if(this.field_2141 * -1916816431 > 0) {
            if(this.field_2130 && (null == this.field_2132 || this.field_2132.length < this.field_2141 * 608088773)) {
               this.field_2132 = new long[1811104617 * this.field_2141];
            }

            if(this.field_2131 && (this.field_2146 == null || this.field_2146.length < -1114248372 * this.field_2141)) {
               this.field_2146 = new String[-1916816431 * this.field_2141];
            }

            if(null == this.field_2149 || this.field_2149.length < 841905288 * this.field_2141) {
               this.field_2149 = new byte[this.field_2141 * -1916816431];
            }

            if(this.field_2145 == null || this.field_2145.length < this.field_2141 * -1916816431) {
               this.field_2145 = new int[this.field_2141 * -1916816431];
            }

            if(this.field_2140 == null || this.field_2140.length < 2045143768 * this.field_2141) {
               this.field_2140 = new int[-944869598 * this.field_2141];
            }

            if(this.field_2147 == null || this.field_2147.length < this.field_2141 * -1916816431) {
               this.field_2147 = new boolean[-447675756 * this.field_2141];
            }

            for(var4 = 0; var4 < -1916816431 * this.field_2141; ++var4) {
               if(this.field_2130) {
                  this.field_2132[var4] = var1.readLong();
               }

               if(this.field_2131) {
                  this.field_2146[var4] = var1.method_347(-1798064360);
               }

               this.field_2149[var4] = var1.readByte();
               if(var2 >= 2) {
                  this.field_2145[var4] = var1.readInt();
               }

               if(var2 >= 5) {
                  this.field_2140[var4] = var1.readShort();
               } else {
                  this.field_2140[var4] = 0;
               }

               if(var2 >= 6) {
                  this.field_2147[var4] = var1.readUnsignedByte() == 1;
               } else {
                  this.field_2147[var4] = false;
               }
            }

            this.method_3643(1886304864);
         }

         if(1521260055 * this.field_2150 > 0) {
            if(this.field_2130 && (this.field_2151 == null || this.field_2151.length < this.field_2150 * 1521260055)) {
               this.field_2151 = new long[this.field_2150 * 1431658667];
            }

            if(this.field_2131 && (null == this.field_2129 || this.field_2129.length < this.field_2150 * 1521260055)) {
               this.field_2129 = new String[this.field_2150 * 1521260055];
            }

            for(var4 = 0; var4 < 1521260055 * this.field_2150; ++var4) {
               if(this.field_2130) {
                  this.field_2151[var4] = var1.readLong();
               }

               if(this.field_2131) {
                  this.field_2129[var4] = var1.method_347(-1210259178);
               }
            }
         }

         if(var2 >= 3) {
            var4 = var1.readShort();
            if(var4 > 0) {
               class_369 var10001 = new class_369(var4 < 16?class_100.method_1845(var4):16);
               this.field_2154 = var10001;

               while(var4-- > 0) {
                  int var5 = var1.readInt();
                  int var6 = var5 & 1073741823;
                  int var7 = var5 >>> 30;
                  class_369 var12;
                  if(0 == var7) {
                     int var8 = var1.readInt();
                     var12 = this.field_2154;
                     class_32 var13 = new class_32(var8);
                     var12.method_6588(var13, (long)var6);
                  } else if(var7 == 1) {
                     long var10 = var1.readLong();
                     var12 = this.field_2154;
                     class_31 var14 = new class_31(var10);
                     var12.method_6588(var14, (long)var6);
                  } else if(2 == var7) {
                     String var11 = var1.method_139(-391631059);
                     var12 = this.field_2154;
                     class_34 var15 = new class_34(var11);
                     var12.method_6588(var15, (long)var6);
                  }
               }
            }
         }

      } else {
         throw new RuntimeException("" + var2);
      }
   }

   // $FF: renamed from: al (int) java.lang.Integer
   public Integer method_3701(int var1) {
      if(null == this.field_2154) {
         return null;
      } else {
         class_27 var2 = this.field_2154.method_6586((long)var1);
         return null != var2 && var2 instanceof class_32?new Integer(((class_32)var2).field_58):null;
      }
   }

   // $FF: renamed from: lj (int, byte) void
   static void method_3702(int var0) {
      try {
         client.field_1660 = -1724064175 * var0;
      } catch (RuntimeException var2) {
         throw class_223.method_4281(var2);
      }
   }

   // $FF: renamed from: n (int, int) ex
   public static class_74 method_3703(int var0, int var1) {
      try {
         class_74 var2 = (class_74)class_74.field_593.method_5065((long)var0);
         if(var2 != null) {
            if(var1 == -65536) {
               throw new IllegalStateException();
            } else {
               return var2;
            }
         } else {
            byte[] var3 = class_74.field_594.method_5381(16, var0);
            class_74 var10000 = new class_74();
            var2 = var10000;
            if(var3 != null) {
               if(var1 == -65536) {
                  throw new IllegalStateException();
               }

               Buffer var10001 = new Buffer(var3);
               var2.method_1119(var10001, 1856210017);
            }

            class_74.field_593.method_5064(var2, (long)var0);
            return var2;
         }
      } catch (RuntimeException var4) {
         throw class_223.method_4281(var4);
      }
   }

   // $FF: renamed from: fv (int) void
   static final void method_3704(int var0) {
      try {
         int[] var1 = class_195.field_2318;

         int var2;
         for(var2 = 0; var2 < class_195.field_2313 * -1143549299; ++var2) {
            if(var0 != 1049112805) {
               throw new IllegalStateException();
            }

            class_100 var3 = client.field_1605[var1[var2]];
            if(null != var3) {
               if(var0 != 1049112805) {
                  throw new IllegalStateException();
               }

               if(var3.field_1092 * -1654949393 > 0) {
                  var3.field_1092 -= -137308913;
                  if(0 == var3.field_1092 * -1654949393) {
                     if(var0 != 1049112805) {
                        throw new IllegalStateException();
                     }

                     var3.field_1089 = null;
                  }
               }
            }
         }

         for(var2 = 0; var2 < client.field_1459 * -1300723479; ++var2) {
            if(var0 != 1049112805) {
               throw new IllegalStateException();
            }

            int var6 = client.field_1460[var2];
            class_99 var4 = client.field_1458[var6];
            if(var4 != null) {
               if(var0 != 1049112805) {
                  throw new IllegalStateException();
               }

               if(var4.field_1092 * -1654949393 > 0) {
                  var4.field_1092 -= -137308913;
                  if(0 == -1654949393 * var4.field_1092) {
                     if(var0 != 1049112805) {
                        throw new IllegalStateException();
                     }

                     var4.field_1089 = null;
                  }
               }
            }
         }

      } catch (RuntimeException var5) {
         throw class_223.method_4281(var5);
      }
   }

   // $FF: renamed from: ab (int, int, int) int
   public int method_3705(int var1, int var2, int var3) {
      int var4 = 31 == var3?-1:(1 << 1 + var3) - 1;
      return (this.field_2145[var1] & var4) >>> var2;
   }
}
