
// $FF: renamed from: jv
public abstract class class_306 {

   // $FF: renamed from: g int[]
   int[] field_3705;
   // $FF: renamed from: e int[]
   int[] field_3706;
   // $FF: renamed from: m int[]
   int[] field_3707;
   // $FF: renamed from: k int[]
   int[] field_3708;
   // $FF: renamed from: h java.lang.Object[]
   Object[] field_3709;
   // $FF: renamed from: x int[]
   int[] field_3710;
   // $FF: renamed from: al int
   static int field_3711;
   // $FF: renamed from: z int[][]
   int[][] field_3712;
   // $FF: renamed from: w int[][]
   int[][] field_3713;
   // $FF: renamed from: t ou[]
   class_402[] field_3714;
   // $FF: renamed from: a ou
   class_402 field_3715;
   // $FF: renamed from: q java.lang.Object[][]
   Object[][] field_3716;
   // $FF: renamed from: i og
   static class_398 field_3717;
   // $FF: renamed from: ae int
   public int field_3718;
   // $FF: renamed from: ap boolean
   boolean field_3719;
   // $FF: renamed from: ab boolean
   boolean field_3720;
   // $FF: renamed from: c int
   int field_3721;


   // $FF: renamed from: cw (int) int
   public int method_5378(int var1) {
      return this.field_3716[var1].length;
   }

   // $FF: renamed from: aq (byte[], int) void
   void method_5379(byte[] var1, int var2) {
      try {
         int var4 = var1.length;
         int var3 = class_151.method_3216(var1, 0, var4);
         this.field_3718 = -848786671 * var3;
         Buffer var10000 = new Buffer(class_186.method_3876(var1, 1410541122));
         Buffer var5 = var10000;
         int var6 = var5.readUnsignedByte();
         if(var6 >= 5) {
            if(var2 == 1649650644) {
               throw new IllegalStateException();
            }

            if(var6 <= 7) {
               if(var6 >= 6) {
                  if(var2 == 1649650644) {
                     throw new IllegalStateException();
                  }

                  var5.readInt();
               }

               int var7 = var5.readUnsignedByte();
               if(var6 >= 7) {
                  if(var2 == 1649650644) {
                     return;
                  }

                  this.field_3721 = var5.method_133(-1043655096) * 787231007;
               } else {
                  this.field_3721 = var5.readShort() * 787231007;
               }

               int var8 = 0;
               int var9 = -1;
               this.field_3706 = new int[15338207 * this.field_3721];
               int var10;
               if(var6 >= 7) {
                  if(var2 == 1649650644) {
                     return;
                  }

                  for(var10 = 0; var10 < this.field_3721 * 15338207; ++var10) {
                     this.field_3706[var10] = var8 += var5.method_133(-873582014);
                     if(this.field_3706[var10] > var9) {
                        if(var2 == 1649650644) {
                           throw new IllegalStateException();
                        }

                        var9 = this.field_3706[var10];
                     }
                  }
               } else {
                  for(var10 = 0; var10 < 15338207 * this.field_3721; ++var10) {
                     if(var2 == 1649650644) {
                        return;
                     }

                     this.field_3706[var10] = var8 += var5.readShort();
                     if(this.field_3706[var10] > var9) {
                        if(var2 == 1649650644) {
                           throw new IllegalStateException();
                        }

                        var9 = this.field_3706[var10];
                     }
                  }
               }

               this.field_3708 = new int[var9 + 1];
               this.field_3707 = new int[1 + var9];
               this.field_3710 = new int[1 + var9];
               this.field_3712 = new int[1 + var9][];
               this.field_3709 = new Object[var9 + 1];
               this.field_3716 = new Object[var9 + 1][];
               if(var7 != 0) {
                  if(var2 == 1649650644) {
                     throw new IllegalStateException();
                  }

                  this.field_3705 = new int[1 + var9];

                  for(var10 = 0; var10 < 15338207 * this.field_3721; ++var10) {
                     if(var2 == 1649650644) {
                        throw new IllegalStateException();
                     }

                     this.field_3705[this.field_3706[var10]] = var5.readInt();
                  }

                  class_402 var10001 = new class_402(this.field_3705);
                  this.field_3715 = var10001;
               }

               for(var10 = 0; var10 < this.field_3721 * 15338207; ++var10) {
                  if(var2 == 1649650644) {
                     throw new IllegalStateException();
                  }

                  this.field_3708[this.field_3706[var10]] = var5.readInt();
               }

               for(var10 = 0; var10 < this.field_3721 * 15338207; ++var10) {
                  if(var2 == 1649650644) {
                     throw new IllegalStateException();
                  }

                  this.field_3707[this.field_3706[var10]] = var5.readInt();
               }

               for(var10 = 0; var10 < 15338207 * this.field_3721; ++var10) {
                  if(var2 == 1649650644) {
                     throw new IllegalStateException();
                  }

                  this.field_3710[this.field_3706[var10]] = var5.readShort();
               }

               int var11;
               int var12;
               int var13;
               int var14;
               int var15;
               if(var6 >= 7) {
                  for(var10 = 0; var10 < 15338207 * this.field_3721; ++var10) {
                     if(var2 == 1649650644) {
                        return;
                     }

                     var11 = this.field_3706[var10];
                     var12 = this.field_3710[var11];
                     var8 = 0;
                     var13 = -1;
                     this.field_3712[var11] = new int[var12];

                     for(var14 = 0; var14 < var12; ++var14) {
                        if(var2 == 1649650644) {
                           throw new IllegalStateException();
                        }

                        var15 = this.field_3712[var11][var14] = var8 += var5.method_133(1124591086);
                        if(var15 > var13) {
                           var13 = var15;
                        }
                     }

                     this.field_3716[var11] = new Object[1 + var13];
                  }
               } else {
                  for(var10 = 0; var10 < this.field_3721 * 15338207; ++var10) {
                     if(var2 == 1649650644) {
                        throw new IllegalStateException();
                     }

                     var11 = this.field_3706[var10];
                     var12 = this.field_3710[var11];
                     var8 = 0;
                     var13 = -1;
                     this.field_3712[var11] = new int[var12];

                     for(var14 = 0; var14 < var12; ++var14) {
                        if(var2 == 1649650644) {
                           throw new IllegalStateException();
                        }

                        var15 = this.field_3712[var11][var14] = var8 += var5.readShort();
                        if(var15 > var13) {
                           var13 = var15;
                        }
                     }

                     this.field_3716[var11] = new Object[1 + var13];
                  }
               }

               if(var7 != 0) {
                  this.field_3713 = new int[var9 + 1][];
                  this.field_3714 = new class_402[1 + var9];

                  for(var10 = 0; var10 < this.field_3721 * 15338207; ++var10) {
                     if(var2 == 1649650644) {
                        throw new IllegalStateException();
                     }

                     var11 = this.field_3706[var10];
                     var12 = this.field_3710[var11];
                     this.field_3713[var11] = new int[this.field_3716[var11].length];

                     for(var13 = 0; var13 < var12; ++var13) {
                        this.field_3713[var11][this.field_3712[var11][var13]] = var5.readInt();
                     }

                     class_402[] var17 = this.field_3714;
                     class_402 var10002 = new class_402(this.field_3713[var11]);
                     var17[var11] = var10002;
                  }
               }

               return;
            }

            if(var2 == 1649650644) {
               throw new IllegalStateException();
            }
         }

         throw new RuntimeException("");
      } catch (RuntimeException var16) {
         throw class_223.method_4281(var16);
      }
   }

   // $FF: renamed from: bg (int, int) byte[]
   public byte[] method_5380(int var1, int var2) {
      return this.method_5382(var1, var2, (int[])null, 744457350);
   }

   // $FF: renamed from: aw (int, int, int) byte[]
   public byte[] method_5381(int var1, int var2) {
      try {
         return this.method_5382(var1, var2, (int[])null, 744457350);
      } catch (RuntimeException var4) {
         throw class_223.method_4281(var4);
      }
   }

   // $FF: renamed from: af (int, int, int[], int) byte[]
   public byte[] method_5382(int var1, int var2, int[] var3, int var4) {
      try {
         if(var1 >= 0) {
            if(var4 != 744457350) {
               throw new IllegalStateException();
            }

            if(var1 < this.field_3716.length) {
               if(var4 != 744457350) {
                  throw new IllegalStateException();
               }

               if(null != this.field_3716[var1]) {
                  if(var4 != 744457350) {
                     throw new IllegalStateException();
                  }

                  if(var2 >= 0) {
                     if(var4 != 744457350) {
                        throw new IllegalStateException();
                     }

                     if(var2 < this.field_3716[var1].length) {
                        if(this.field_3716[var1][var2] == null) {
                           if(var4 != 744457350) {
                              throw new IllegalStateException();
                           }

                           boolean var5 = this.method_5398(var1, var3, 1746231171);
                           if(!var5) {
                              if(var4 != 744457350) {
                                 throw new IllegalStateException();
                              }

                              this.method_5391(var1, (byte)0);
                              var5 = this.method_5398(var1, var3, 1753094271);
                              if(!var5) {
                                 if(var4 != 744457350) {
                                    throw new IllegalStateException();
                                 }

                                 return null;
                              }
                           }
                        }

                        byte[] var7 = class_319.method_5659(this.field_3716[var1][var2], false, (byte)-76);
                        if(this.field_3720) {
                           if(var4 != 744457350) {
                              throw new IllegalStateException();
                           }

                           this.field_3716[var1][var2] = null;
                        }

                        return var7;
                     }
                  }
               }
            }
         }

         return null;
      } catch (RuntimeException var6) {
         throw class_223.method_4281(var6);
      }
   }

   // $FF: renamed from: ak (int, int, byte) boolean
   public boolean method_5383(int var1, int var2, byte var3) {
      try {
         if(var1 >= 0) {
            if(var3 <= 0) {
               throw new IllegalStateException();
            }

            if(var1 < this.field_3716.length) {
               if(var3 <= 0) {
                  throw new IllegalStateException();
               }

               if(this.field_3716[var1] != null) {
                  if(var3 <= 0) {
                     throw new IllegalStateException();
                  }

                  if(var2 >= 0) {
                     if(var3 <= 0) {
                        throw new IllegalStateException();
                     }

                     if(var2 < this.field_3716[var1].length) {
                        if(this.field_3716[var1][var2] != null) {
                           return true;
                        }

                        if(this.field_3709[var1] != null) {
                           if(var3 <= 0) {
                              throw new IllegalStateException();
                           }

                           return true;
                        }

                        this.method_5391(var1, (byte)0);
                        if(null != this.field_3709[var1]) {
                           if(var3 <= 0) {
                              throw new IllegalStateException();
                           }

                           return true;
                        }

                        return false;
                     }

                     if(var3 <= 0) {
                        throw new IllegalStateException();
                     }
                  }
               }
            }
         }

         return false;
      } catch (RuntimeException var4) {
         throw class_223.method_4281(var4);
      }
   }

   // $FF: renamed from: ba (java.lang.String, java.lang.String, int) byte[]
   public byte[] method_5384(String var1, String var2) {
      try {
         var1 = var1.toLowerCase();
         var2 = var2.toLowerCase();
         int var4 = this.field_3715.method_6808(class_97.method_1790(var1, -1151135864), -2076070335);
         int var5 = this.field_3714[var4].method_6808(class_97.method_1790(var2, -194450529), -2076070335);
         return this.method_5381(var4, var5);
      } catch (RuntimeException var6) {
         throw class_223.method_4281(var6);
      }
   }

   // $FF: renamed from: cf (int) boolean
   public boolean method_5385(int var1) {
      if(1 == this.field_3716.length) {
         return this.method_5383(0, var1, (byte)55);
      } else if(1 == this.field_3716[var1].length) {
         return this.method_5383(var1, 0, (byte)31);
      } else {
         throw new RuntimeException();
      }
   }

   // $FF: renamed from: ex (byte[]) byte[]
   static final byte[] method_5386(byte[] var0) {
      Buffer var10000 = new Buffer(var0);
      Buffer var1 = var10000;
      int var2 = var1.readUnsignedByte();
      int var3 = var1.readInt();
      if(var3 >= 0 && (0 == 269464329 * field_3711 || var3 <= field_3711 * 269464329)) {
         if(0 == var2) {
            byte[] var6 = new byte[var3];
            var1.method_267(var6, 0, var3, 1018164334);
            return var6;
         } else {
            int var4 = var1.readInt();
            if(var4 >= 0 && (269464329 * field_3711 == 0 || var4 <= field_3711 * 269464329)) {
               byte[] var5 = new byte[var4];
               if(1 == var2) {
                  class_389.method_6767(var5, var4, var0, 9);
               } else {
                  field_3717.method_6794(var1, var5, (byte)7);
               }

               return var5;
            } else {
               throw new RuntimeException();
            }
         }
      } else {
         throw new RuntimeException();
      }
   }

   // $FF: renamed from: d (int, int) int
   int method_5387(int var1, int var2) {
      try {
         if(null != this.field_3709[var1]) {
            if(var2 != -1767586109) {
               throw new IllegalStateException();
            } else {
               return 100;
            }
         } else {
            return 0;
         }
      } catch (RuntimeException var3) {
         throw class_223.method_4281(var3);
      }
   }

   // $FF: renamed from: an (int, byte) byte[]
   public byte[] method_5388(int var1, byte var2) {
      try {
         if(1 == this.field_3716.length) {
            if(var2 >= 1) {
               throw new IllegalStateException();
            } else {
               return this.method_5381(0, var1);
            }
         } else if(this.field_3716[var1].length == 1) {
            return this.method_5381(var1, 0);
         } else {
            throw new RuntimeException();
         }
      } catch (RuntimeException var3) {
         throw class_223.method_4281(var3);
      }
   }

   // $FF: renamed from: ek (java.lang.String) void
   public void method_5389(String var1) {
      var1 = var1.toLowerCase();
      int var2 = this.field_3715.method_6808(class_97.method_1790(var1, -1677348314), -2076070335);
      if(var2 >= 0) {
         this.method_5432(var2);
      }
   }

   // $FF: renamed from: bt (int, int) byte[]
   public byte[] method_5390(int var1, int var2) {
      try {
         if(this.field_3716.length == 1) {
            return this.method_5418(0, var1, 791709889);
         } else if(this.field_3716[var1].length == 1) {
            if(var2 != 444746714) {
               throw new IllegalStateException();
            } else {
               return this.method_5418(var1, 0, 791709889);
            }
         } else {
            throw new RuntimeException();
         }
      } catch (RuntimeException var3) {
         throw class_223.method_4281(var3);
      }
   }

   // $FF: renamed from: y (int, byte) void
   void method_5391(int var1, byte var2) {
      try {
         ;
      } catch (RuntimeException var3) {
         throw class_223.method_4281(var3);
      }
   }

   // $FF: renamed from: bq (int, byte) int[]
   public int[] method_5392(int var1, byte var2) {
      try {
         if(var1 >= 0) {
            if(var2 != 8) {
               throw new IllegalStateException();
            }

            if(var1 < this.field_3712.length) {
               return this.field_3712[var1];
            }

            if(var2 != 8) {
               throw new IllegalStateException();
            }
         }

         return null;
      } catch (RuntimeException var3) {
         throw class_223.method_4281(var3);
      }
   }

   // $FF: renamed from: bu (int, int) int
   public int method_5393(int var1) {
      try {
         return this.field_3716[var1].length;
      } catch (RuntimeException var3) {
         throw class_223.method_4281(var3);
      }
   }

   // $FF: renamed from: co () boolean
   public boolean method_5394() {
      boolean var1 = true;

      for(int var2 = 0; var2 < this.field_3706.length; ++var2) {
         int var3 = this.field_3706[var2];
         if(null == this.field_3709[var3]) {
            this.method_5391(var3, (byte)0);
            if(this.field_3709[var3] == null) {
               var1 = false;
            }
         }
      }

      return var1;
   }

   // $FF: renamed from: bv (byte) void
   public void method_5395() {
      try {
         for(int var2 = 0; var2 < this.field_3709.length; ++var2) {
            this.field_3709[var2] = null;
         }

      } catch (RuntimeException var3) {
         throw class_223.method_4281(var3);
      }
   }

   // $FF: renamed from: bm (int, int) void
   public void method_5396(int var1, int var2) {
      try {
         for(int var3 = 0; var3 < this.field_3716[var1].length; ++var3) {
            if(var2 >= -83736147) {
               throw new IllegalStateException();
            }

            this.field_3716[var1][var3] = null;
         }

      } catch (RuntimeException var4) {
         throw class_223.method_4281(var4);
      }
   }

   // $FF: renamed from: el (byte[]) byte[]
   static final byte[] method_5397(byte[] var0) {
      Buffer var10000 = new Buffer(var0);
      Buffer var1 = var10000;
      int var2 = var1.readUnsignedByte();
      int var3 = var1.readInt();
      if(var3 >= 0 && (0 == 269464329 * field_3711 || var3 <= field_3711 * 269464329)) {
         if(0 == var2) {
            byte[] var6 = new byte[var3];
            var1.method_267(var6, 0, var3, 1647766328);
            return var6;
         } else {
            int var4 = var1.readInt();
            if(var4 >= 0 && (269464329 * field_3711 == 0 || var4 <= field_3711 * 269464329)) {
               byte[] var5 = new byte[var4];
               if(1 == var2) {
                  class_389.method_6767(var5, var4, var0, 9);
               } else {
                  field_3717.method_6794(var1, var5, (byte)14);
               }

               return var5;
            } else {
               throw new RuntimeException();
            }
         }
      } else {
         throw new RuntimeException();
      }
   }

   // $FF: renamed from: bh (int, int[], int) boolean
   boolean method_5398(int var1, int[] var2, int var3) {
      try {
         if(null == this.field_3709[var1]) {
            if(var3 <= 1647125333) {
               throw new IllegalStateException();
            } else {
               return false;
            }
         } else {
            int var4 = this.field_3710[var1];
            int[] var5 = this.field_3712[var1];
            Object[] var6 = this.field_3716[var1];
            boolean var7 = true;

            for(int var8 = 0; var8 < var4; ++var8) {
               if(var3 <= 1647125333) {
                  throw new IllegalStateException();
               }

               if(var6[var5[var8]] == null) {
                  if(var3 <= 1647125333) {
                     throw new IllegalStateException();
                  }

                  var7 = false;
                  break;
               }
            }

            if(var7) {
               if(var3 <= 1647125333) {
                  throw new IllegalStateException();
               } else {
                  return true;
               }
            } else {
               Buffer var10000;
               byte[] var21;
               label189: {
                  if(var2 != null) {
                     label187: {
                        if(0 == var2[0]) {
                           if(var3 <= 1647125333) {
                              throw new IllegalStateException();
                           }

                           if(0 == var2[1]) {
                              if(var3 <= 1647125333) {
                                 throw new IllegalStateException();
                              }

                              if(0 == var2[2]) {
                                 if(var3 <= 1647125333) {
                                    throw new IllegalStateException();
                                 }

                                 if(0 == var2[3]) {
                                    break label187;
                                 }

                                 if(var3 <= 1647125333) {
                                    throw new IllegalStateException();
                                 }
                              }
                           }
                        }

                        var21 = class_319.method_5659(this.field_3709[var1], true, (byte)47);
                        var10000 = new Buffer(var21);
                        Buffer var9 = var10000;
                        var9.method_294(var2, 5, var9.data.length, 141901592);
                        break label189;
                     }
                  }

                  var21 = class_319.method_5659(this.field_3709[var1], false, (byte)-24);
               }

               int var14;
               int var16;
               int var17;
               byte[] var22;
               try {
                  var22 = class_186.method_3876(var21, 1397720202);
               } catch (RuntimeException var19) {
                  StringBuilder var27 = (new StringBuilder()).append("");
                  boolean var10001;
                  if(var2 != null) {
                     if(var3 <= 1647125333) {
                        throw new IllegalStateException();
                     }

                     var10001 = true;
                  } else {
                     var10001 = false;
                  }

                  String var12 = var27.append(var10001).append(",").append(var1).append(",").append(var21.length).append(",").toString();
                  var14 = var21.length;
                  int var13 = class_151.method_3216(var21, 0, var14);
                  String var15 = var12 + var13 + ",";
                  var17 = var21.length - 2;
                  var16 = class_151.method_3216(var21, 0, var17);
                  throw class_223.method_4281(var19);
               }

               if(this.field_3719) {
                  if(var3 <= 1647125333) {
                     throw new IllegalStateException();
                  }

                  this.field_3709[var1] = null;
               }

               if(var4 > 1) {
                  if(var3 <= 1647125333) {
                     throw new IllegalStateException();
                  }

                  int var10 = var22.length;
                  --var10;
                  int var11 = var22[var10] & 255;
                  var10 -= var11 * var4 * 4;
                  var10000 = new Buffer(var22);
                  Buffer var23 = var10000;
                  int[] var24 = new int[var4];
                  var23.offset = -1025691571 * var10;

                  int var26;
                  for(var14 = 0; var14 < var11; ++var14) {
                     if(var3 <= 1647125333) {
                        throw new IllegalStateException();
                     }

                     var26 = 0;

                     for(var16 = 0; var16 < var4; ++var16) {
                        if(var3 <= 1647125333) {
                           throw new IllegalStateException();
                        }

                        var26 += var23.readInt();
                        var24[var16] += var26;
                     }
                  }

                  byte[][] var25 = new byte[var4][];

                  for(var26 = 0; var26 < var4; ++var26) {
                     if(var3 <= 1647125333) {
                        throw new IllegalStateException();
                     }

                     var25[var26] = new byte[var24[var26]];
                     var24[var26] = 0;
                  }

                  var23.offset = -1025691571 * var10;
                  var26 = 0;

                  for(var16 = 0; var16 < var11; ++var16) {
                     var17 = 0;

                     for(int var18 = 0; var18 < var4; ++var18) {
                        if(var3 <= 1647125333) {
                           throw new IllegalStateException();
                        }

                        var17 += var23.readInt();
                        System.arraycopy(var22, var26, var25[var18], var24[var18], var17);
                        var24[var18] += var17;
                        var26 += var17;
                     }
                  }

                  for(var16 = 0; var16 < var4; ++var16) {
                     if(var3 <= 1647125333) {
                        throw new IllegalStateException();
                     }

                     if(!this.field_3720) {
                        if(var3 <= 1647125333) {
                           throw new IllegalStateException();
                        }

                        var6[var5[var16]] = class_300.method_5357(var25[var16], false, 12460551);
                     } else {
                        var6[var5[var16]] = var25[var16];
                     }
                  }
               } else if(!this.field_3720) {
                  if(var3 <= 1647125333) {
                     throw new IllegalStateException();
                  }

                  var6[var5[0]] = class_300.method_5357(var22, false, -2087337852);
               } else {
                  var6[var5[0]] = var22;
               }

               return true;
            }
         }
      } catch (RuntimeException var20) {
         throw class_223.method_4281(var20);
      }
   }

   // $FF: renamed from: bs (java.lang.String, int) int
   public int method_5399(String var1) {
      try {
         var1 = var1.toLowerCase();
         return this.field_3715.method_6808(class_97.method_1790(var1, 1259096833), -2076070335);
      } catch (RuntimeException var3) {
         throw class_223.method_4281(var3);
      }
   }

   // $FF: renamed from: br (int, java.lang.String, int) int
   public int method_5400(int var1, String var2) {
      try {
         var2 = var2.toLowerCase();
         return this.field_3714[var1].method_6808(class_97.method_1790(var2, -368254249), -2076070335);
      } catch (RuntimeException var4) {
         throw class_223.method_4281(var4);
      }
   }

   // $FF: renamed from: dv (int, int[]) boolean
   boolean method_5401(int var1, int[] var2) {
      if(null == this.field_3709[var1]) {
         return false;
      } else {
         int var3 = this.field_3710[var1];
         int[] var4 = this.field_3712[var1];
         Object[] var5 = this.field_3716[var1];
         boolean var6 = true;

         for(int var7 = 0; var7 < var3; ++var7) {
            if(var5[var4[var7]] == null) {
               var6 = false;
               break;
            }
         }

         if(var6) {
            return true;
         } else {
            Buffer var10000;
            byte[] var19;
            if(var2 != null && (0 != var2[0] || 0 != var2[1] || 0 != var2[2] || 0 != var2[3])) {
               var19 = class_319.method_5659(this.field_3709[var1], true, (byte)3);
               var10000 = new Buffer(var19);
               Buffer var8 = var10000;
               var8.method_294(var2, 5, var8.data.length, 141901592);
            } else {
               var19 = class_319.method_5659(this.field_3709[var1], false, (byte)84);
            }

            int var13;
            int var15;
            int var16;
            byte[] var20;
            try {
               var20 = class_186.method_3876(var19, 1943662204);
            } catch (RuntimeException var18) {
               String var11 = "" + (var2 != null) + "," + var1 + "," + var19.length + ",";
               var13 = var19.length;
               int var12 = class_151.method_3216(var19, 0, var13);
               String var14 = var11 + var12 + ",";
               var16 = var19.length - 2;
               var15 = class_151.method_3216(var19, 0, var16);
               throw class_223.method_4281(var18);
            }

            if(this.field_3719) {
               this.field_3709[var1] = null;
            }

            if(var3 > 1) {
               int var9 = var20.length;
               --var9;
               int var10 = var20[var9] & 255;
               var9 -= var10 * var3 * 4;
               var10000 = new Buffer(var20);
               Buffer var21 = var10000;
               int[] var22 = new int[var3];
               var21.offset = -1025691571 * var9;

               int var24;
               for(var13 = 0; var13 < var10; ++var13) {
                  var24 = 0;

                  for(var15 = 0; var15 < var3; ++var15) {
                     var24 += var21.readInt();
                     var22[var15] += var24;
                  }
               }

               byte[][] var23 = new byte[var3][];

               for(var24 = 0; var24 < var3; ++var24) {
                  var23[var24] = new byte[var22[var24]];
                  var22[var24] = 0;
               }

               var21.offset = -1025691571 * var9;
               var24 = 0;

               for(var15 = 0; var15 < var10; ++var15) {
                  var16 = 0;

                  for(int var17 = 0; var17 < var3; ++var17) {
                     var16 += var21.readInt();
                     System.arraycopy(var20, var24, var23[var17], var22[var17], var16);
                     var22[var17] += var16;
                     var24 += var16;
                  }
               }

               for(var15 = 0; var15 < var3; ++var15) {
                  if(!this.field_3720) {
                     var5[var4[var15]] = class_300.method_5357(var23[var15], false, 655051872);
                  } else {
                     var5[var4[var15]] = var23[var15];
                  }
               }
            } else if(!this.field_3720) {
               var5[var4[0]] = class_300.method_5357(var20, false, 986815000);
            } else {
               var5[var4[0]] = var20;
            }

            return true;
         }
      }
   }

   // $FF: renamed from: db () int
   public int method_5402() {
      return this.field_3716.length;
   }

   // $FF: renamed from: be (java.lang.String, java.lang.String, int) boolean
   public boolean method_5403(String name, String var2) {
      try {
         name = name.toLowerCase();
         var2 = var2.toLowerCase();
         int var4 = this.field_3715.method_6808(class_97.method_1790(name, -1841267567), -2076070335);
         int var5 = this.field_3714[var4].method_6808(class_97.method_1790(var2, -1263295647), -2076070335);
         return this.method_5383(var4, var5, (byte)57);
      } catch (RuntimeException var6) {
         throw class_223.method_4281(var6);
      }
   }

   // $FF: renamed from: bj (java.lang.String, int) boolean
   public boolean method_5404(String var1) {
      try {
         var1 = var1.toLowerCase();
         int var3 = this.field_3715.method_6808(class_97.method_1790(var1, -168196251), -2076070335);
         return this.method_5411(var3, (byte)112);
      } catch (RuntimeException var4) {
         throw class_223.method_4281(var4);
      }
   }

   // $FF: renamed from: bx (java.lang.String, byte) void
   public void method_5405(String var1, byte var2) {
      try {
         var1 = var1.toLowerCase();
         int var3 = this.field_3715.method_6808(class_97.method_1790(var1, 843081382), -2076070335);
         if(var3 < 0) {
            if(var2 == 1) {
               throw new IllegalStateException();
            }
         } else {
            this.method_5432(var3);
         }
      } catch (RuntimeException var4) {
         throw class_223.method_4281(var4);
      }
   }

   // $FF: renamed from: dj () int
   public int method_5406() {
      return this.field_3716.length;
   }

   // $FF: renamed from: <clinit> () void
   static {
      class_398 var10000 = new class_398();
      field_3717 = var10000;
      field_3711 = 0;
   }

   // $FF: renamed from: x (int) void
   void method_5408(int var1) {}

   // $FF: renamed from: z (int) void
   void method_5409(int var1) {}

   // $FF: renamed from: bp (java.lang.String, int) int
   public int method_5410(String var1) {
      try {
         var1 = var1.toLowerCase();
         int var3 = this.field_3715.method_6808(class_97.method_1790(var1, 1455930781), -2076070335);
         return this.method_5387(var3, -1767586109);
      } catch (RuntimeException var4) {
         throw class_223.method_4281(var4);
      }
   }

   // $FF: renamed from: aa (int, byte) boolean
   public boolean method_5411(int var1, byte var2) {
      try {
         if(this.field_3709[var1] != null) {
            if(var2 <= 1) {
               throw new IllegalStateException();
            } else {
               return true;
            }
         } else {
            this.method_5391(var1, (byte)0);
            if(null != this.field_3709[var1]) {
               if(var2 <= 1) {
                  throw new IllegalStateException();
               } else {
                  return true;
               }
            } else {
               return false;
            }
         }
      } catch (RuntimeException var3) {
         throw class_223.method_4281(var3);
      }
   }

   // $FF: renamed from: du (int, java.lang.String) int
   public int method_5412(int var1, String var2) {
      var2 = var2.toLowerCase();
      return this.field_3714[var1].method_6808(class_97.method_1790(var2, 957460868), -2076070335);
   }

   // $FF: renamed from: bb (byte[]) void
   void method_5413(byte[] var1) {
      int var3 = var1.length;
      int var2 = class_151.method_3216(var1, 0, var3);
      this.field_3718 = -848786671 * var2;
      Buffer var10000 = new Buffer(class_186.method_3876(var1, 1880620260));
      Buffer var4 = var10000;
      int var5 = var4.readUnsignedByte();
      if(var5 >= 5 && var5 <= 7) {
         if(var5 >= 6) {
            var4.readInt();
         }

         int var6 = var4.readUnsignedByte();
         if(var5 >= 7) {
            this.field_3721 = var4.method_133(-498469375) * 787231007;
         } else {
            this.field_3721 = var4.readShort() * 787231007;
         }

         int var7 = 0;
         int var8 = -1;
         this.field_3706 = new int[15338207 * this.field_3721];
         int var9;
         if(var5 >= 7) {
            for(var9 = 0; var9 < this.field_3721 * 15338207; ++var9) {
               this.field_3706[var9] = var7 += var4.method_133(241046570);
               if(this.field_3706[var9] > var8) {
                  var8 = this.field_3706[var9];
               }
            }
         } else {
            for(var9 = 0; var9 < 15338207 * this.field_3721; ++var9) {
               this.field_3706[var9] = var7 += var4.readShort();
               if(this.field_3706[var9] > var8) {
                  var8 = this.field_3706[var9];
               }
            }
         }

         this.field_3708 = new int[var8 + 1];
         this.field_3707 = new int[1 + var8];
         this.field_3710 = new int[1 + var8];
         this.field_3712 = new int[1 + var8][];
         this.field_3709 = new Object[var8 + 1];
         this.field_3716 = new Object[var8 + 1][];
         if(var6 != 0) {
            this.field_3705 = new int[1 + var8];

            for(var9 = 0; var9 < 15338207 * this.field_3721; ++var9) {
               this.field_3705[this.field_3706[var9]] = var4.readInt();
            }

            class_402 var10001 = new class_402(this.field_3705);
            this.field_3715 = var10001;
         }

         for(var9 = 0; var9 < this.field_3721 * 15338207; ++var9) {
            this.field_3708[this.field_3706[var9]] = var4.readInt();
         }

         for(var9 = 0; var9 < this.field_3721 * 15338207; ++var9) {
            this.field_3707[this.field_3706[var9]] = var4.readInt();
         }

         for(var9 = 0; var9 < 15338207 * this.field_3721; ++var9) {
            this.field_3710[this.field_3706[var9]] = var4.readShort();
         }

         int var10;
         int var11;
         int var12;
         int var13;
         int var14;
         if(var5 >= 7) {
            for(var9 = 0; var9 < 15338207 * this.field_3721; ++var9) {
               var10 = this.field_3706[var9];
               var11 = this.field_3710[var10];
               var7 = 0;
               var12 = -1;
               this.field_3712[var10] = new int[var11];

               for(var13 = 0; var13 < var11; ++var13) {
                  var14 = this.field_3712[var10][var13] = var7 += var4.method_133(-507334222);
                  if(var14 > var12) {
                     var12 = var14;
                  }
               }

               this.field_3716[var10] = new Object[1 + var12];
            }
         } else {
            for(var9 = 0; var9 < this.field_3721 * 15338207; ++var9) {
               var10 = this.field_3706[var9];
               var11 = this.field_3710[var10];
               var7 = 0;
               var12 = -1;
               this.field_3712[var10] = new int[var11];

               for(var13 = 0; var13 < var11; ++var13) {
                  var14 = this.field_3712[var10][var13] = var7 += var4.readShort();
                  if(var14 > var12) {
                     var12 = var14;
                  }
               }

               this.field_3716[var10] = new Object[1 + var12];
            }
         }

         if(var6 != 0) {
            this.field_3713 = new int[var8 + 1][];
            this.field_3714 = new class_402[1 + var8];

            for(var9 = 0; var9 < this.field_3721 * 15338207; ++var9) {
               var10 = this.field_3706[var9];
               var11 = this.field_3710[var10];
               this.field_3713[var10] = new int[this.field_3716[var10].length];

               for(var12 = 0; var12 < var11; ++var12) {
                  this.field_3713[var10][this.field_3712[var10][var12]] = var4.readInt();
               }

               class_402[] var15 = this.field_3714;
               class_402 var10002 = new class_402(this.field_3713[var10]);
               var15[var10] = var10002;
            }
         }

      } else {
         throw new RuntimeException("");
      }
   }

   // $FF: renamed from: dm (java.lang.String) boolean
   public boolean method_5414(String var1) {
      var1 = var1.toLowerCase();
      int var2 = this.field_3715.method_6808(class_97.method_1790(var1, 690756070), -2076070335);
      return this.method_5411(var2, (byte)23);
   }

   // $FF: renamed from: ag (int) int
   int method_5415(int var1) {
      return null != this.field_3709[var1]?100:0;
   }

   // $FF: renamed from: cg () boolean
   public boolean method_5416() {
      boolean var1 = true;

      for(int var2 = 0; var2 < this.field_3706.length; ++var2) {
         int var3 = this.field_3706[var2];
         if(null == this.field_3709[var3]) {
            this.method_5391(var3, (byte)0);
            if(this.field_3709[var3] == null) {
               var1 = false;
            }
         }
      }

      return var1;
   }

   // $FF: renamed from: bk (int, int) byte[]
   public byte[] method_5417(int var1, int var2) {
      return this.method_5382(var1, var2, (int[])null, 744457350);
   }

   // $FF: renamed from: bd (int, int, int) byte[]
   public byte[] method_5418(int var1, int var2, int var3) {
      try {
         if(var1 >= 0) {
            if(var3 != 791709889) {
               throw new IllegalStateException();
            }

            if(var1 < this.field_3716.length) {
               if(var3 != 791709889) {
                  throw new IllegalStateException();
               }

               if(null != this.field_3716[var1]) {
                  if(var3 != 791709889) {
                     throw new IllegalStateException();
                  }

                  if(var2 >= 0) {
                     if(var3 != 791709889) {
                        throw new IllegalStateException();
                     }

                     if(var2 < this.field_3716[var1].length) {
                        if(null == this.field_3716[var1][var2]) {
                           if(var3 != 791709889) {
                              throw new IllegalStateException();
                           }

                           boolean var4 = this.method_5398(var1, (int[])null, 1811679469);
                           if(!var4) {
                              if(var3 != 791709889) {
                                 throw new IllegalStateException();
                              }

                              this.method_5391(var1, (byte)0);
                              var4 = this.method_5398(var1, (int[])null, 2117295120);
                              if(!var4) {
                                 if(var3 != 791709889) {
                                    throw new IllegalStateException();
                                 }

                                 return null;
                              }
                           }
                        }

                        byte[] var6 = class_319.method_5659(this.field_3716[var1][var2], false, (byte)91);
                        return var6;
                     }
                  }
               }
            }
         }

         return null;
      } catch (RuntimeException var5) {
         throw class_223.method_4281(var5);
      }
   }

   // $FF: renamed from: by (int, int) byte[]
   public byte[] method_5419(int var1, int var2) {
      return this.method_5382(var1, var2, (int[])null, 744457350);
   }

   // $FF: renamed from: bf (java.lang.String, java.lang.String, byte) boolean
   public boolean method_5420(String var1, String var2, byte var3) {
      try {
         var1 = var1.toLowerCase();
         var2 = var2.toLowerCase();
         int var4 = this.field_3715.method_6808(class_97.method_1790(var1, -209254651), -2076070335);
         if(var4 < 0) {
            if(var3 != 0) {
               throw new IllegalStateException();
            } else {
               return false;
            }
         } else {
            int var5 = this.field_3714[var4].method_6808(class_97.method_1790(var2, 253494530), -2076070335);
            if(var5 < 0) {
               if(var3 != 0) {
                  throw new IllegalStateException();
               } else {
                  return false;
               }
            } else {
               return true;
            }
         }
      } catch (RuntimeException var6) {
         throw class_223.method_4281(var6);
      }
   }

   // $FF: renamed from: cd (int, int, int[]) byte[]
   public byte[] method_5421(int var1, int var2, int[] var3) {
      if(var1 >= 0 && var1 < this.field_3716.length && null != this.field_3716[var1] && var2 >= 0 && var2 < this.field_3716[var1].length) {
         if(this.field_3716[var1][var2] == null) {
            boolean var4 = this.method_5398(var1, var3, 1780752239);
            if(!var4) {
               this.method_5391(var1, (byte)0);
               var4 = this.method_5398(var1, var3, 2000605234);
               if(!var4) {
                  return null;
               }
            }
         }

         byte[] var5 = class_319.method_5659(this.field_3716[var1][var2], false, (byte)34);
         if(this.field_3720) {
            this.field_3716[var1][var2] = null;
         }

         return var5;
      } else {
         return null;
      }
   }

   // $FF: renamed from: cm (int, int, int[]) byte[]
   public byte[] method_5422(int var1, int var2, int[] var3) {
      if(var1 >= 0 && var1 < this.field_3716.length && null != this.field_3716[var1] && var2 >= 0 && var2 < this.field_3716[var1].length) {
         if(this.field_3716[var1][var2] == null) {
            boolean var4 = this.method_5398(var1, var3, 2065174875);
            if(!var4) {
               this.method_5391(var1, (byte)0);
               var4 = this.method_5398(var1, var3, 1817328020);
               if(!var4) {
                  return null;
               }
            }
         }

         byte[] var5 = class_319.method_5659(this.field_3716[var1][var2], false, (byte)23);
         if(this.field_3720) {
            this.field_3716[var1][var2] = null;
         }

         return var5;
      } else {
         return null;
      }
   }

   // $FF: renamed from: au (int) boolean
   public boolean method_5423(int var1) {
      try {
         boolean var2 = true;

         for(int var3 = 0; var3 < this.field_3706.length; ++var3) {
            if(var1 <= 2048033494) {
               throw new IllegalStateException();
            }

            int var4 = this.field_3706[var3];
            if(null == this.field_3709[var4]) {
               if(var1 <= 2048033494) {
                  throw new IllegalStateException();
               }

               this.method_5391(var4, (byte)0);
               if(this.field_3709[var4] == null) {
                  var2 = false;
               }
            }
         }

         return var2;
      } catch (RuntimeException var5) {
         throw class_223.method_4281(var5);
      }
   }

   // $FF: renamed from: cp (int, int) boolean
   public boolean method_5424(int var1, int var2) {
      if(var1 >= 0 && var1 < this.field_3716.length && this.field_3716[var1] != null && var2 >= 0 && var2 < this.field_3716[var1].length) {
         if(this.field_3716[var1][var2] != null) {
            return true;
         } else if(this.field_3709[var1] != null) {
            return true;
         } else {
            this.method_5391(var1, (byte)0);
            return null != this.field_3709[var1];
         }
      } else {
         return false;
      }
   }

   // $FF: renamed from: ci (int, int) boolean
   public boolean method_5425(int var1, int var2) {
      if(var1 >= 0 && var1 < this.field_3716.length && this.field_3716[var1] != null && var2 >= 0 && var2 < this.field_3716[var1].length) {
         if(this.field_3716[var1][var2] != null) {
            return true;
         } else if(this.field_3709[var1] != null) {
            return true;
         } else {
            this.method_5391(var1, (byte)0);
            return null != this.field_3709[var1];
         }
      } else {
         return false;
      }
   }

   // $FF: renamed from: ct (int, int) boolean
   public boolean method_5426(int var1, int var2) {
      if(var1 >= 0 && var1 < this.field_3716.length && this.field_3716[var1] != null && var2 >= 0 && var2 < this.field_3716[var1].length) {
         if(this.field_3716[var1][var2] != null) {
            return true;
         } else if(this.field_3709[var1] != null) {
            return true;
         } else {
            this.method_5391(var1, (byte)0);
            return null != this.field_3709[var1];
         }
      } else {
         return false;
      }
   }

   // $FF: renamed from: cq (int) boolean
   public boolean method_5427(int var1) {
      if(1 == this.field_3716.length) {
         return this.method_5383(0, var1, (byte)33);
      } else if(1 == this.field_3716[var1].length) {
         return this.method_5383(var1, 0, (byte)50);
      } else {
         throw new RuntimeException();
      }
   }

   // $FF: renamed from: cr (int) boolean
   public boolean method_5428(int var1) {
      if(1 == this.field_3716.length) {
         return this.method_5383(0, var1, (byte)24);
      } else if(1 == this.field_3716[var1].length) {
         return this.method_5383(var1, 0, (byte)117);
      } else {
         throw new RuntimeException();
      }
   }

   // $FF: renamed from: ay (int, byte) boolean
   public boolean method_5429(int var1, byte var2) {
      try {
         if(1 == this.field_3716.length) {
            if(var2 != 0) {
               throw new IllegalStateException();
            } else {
               return this.method_5383(0, var1, (byte)96);
            }
         } else if(1 == this.field_3716[var1].length) {
            return this.method_5383(var1, 0, (byte)28);
         } else {
            throw new RuntimeException();
         }
      } catch (RuntimeException var3) {
         throw class_223.method_4281(var3);
      }
   }

   // $FF: renamed from: cn (int) boolean
   public boolean method_5430(int var1) {
      if(this.field_3709[var1] != null) {
         return true;
      } else {
         this.method_5391(var1, (byte)0);
         return null != this.field_3709[var1];
      }
   }

   // $FF: renamed from: cs (int) boolean
   public boolean method_5431(int var1) {
      if(this.field_3709[var1] != null) {
         return true;
      } else {
         this.method_5391(var1, (byte)0);
         return null != this.field_3709[var1];
      }
   }

   // $FF: renamed from: f (int, byte) void
   void method_5432(int var1) {
      try {
         ;
      } catch (RuntimeException var3) {
         throw class_223.method_4281(var3);
      }
   }

   // $FF: renamed from: dr () void
   public void method_5433() {
      for(int var1 = 0; var1 < this.field_3709.length; ++var1) {
         this.field_3709[var1] = null;
      }

   }

   // $FF: renamed from: ck (int) byte[]
   public byte[] method_5434(int var1) {
      if(1 == this.field_3716.length) {
         return this.method_5381(0, var1);
      } else if(this.field_3716[var1].length == 1) {
         return this.method_5381(var1, 0);
      } else {
         throw new RuntimeException();
      }
   }

   // $FF: renamed from: cj (int) byte[]
   public byte[] method_5435(int var1) {
      if(1 == this.field_3716.length) {
         return this.method_5381(0, var1);
      } else if(this.field_3716[var1].length == 1) {
         return this.method_5381(var1, 0);
      } else {
         throw new RuntimeException();
      }
   }

   // $FF: renamed from: cc (int) byte[]
   public byte[] method_5436(int var1) {
      if(1 == this.field_3716.length) {
         return this.method_5381(0, var1);
      } else if(this.field_3716[var1].length == 1) {
         return this.method_5381(var1, 0);
      } else {
         throw new RuntimeException();
      }
   }

   // $FF: renamed from: cu (int, int) byte[]
   public byte[] method_5437(int var1, int var2) {
      if(var1 >= 0 && var1 < this.field_3716.length && null != this.field_3716[var1] && var2 >= 0 && var2 < this.field_3716[var1].length) {
         if(null == this.field_3716[var1][var2]) {
            boolean var3 = this.method_5398(var1, (int[])null, 1892962702);
            if(!var3) {
               this.method_5391(var1, (byte)0);
               var3 = this.method_5398(var1, (int[])null, 1701073747);
               if(!var3) {
                  return null;
               }
            }
         }

         byte[] var4 = class_319.method_5659(this.field_3716[var1][var2], false, (byte)30);
         return var4;
      } else {
         return null;
      }
   }

   // $FF: renamed from: cz (int, int) byte[]
   public byte[] method_5438(int var1, int var2) {
      if(var1 >= 0 && var1 < this.field_3716.length && null != this.field_3716[var1] && var2 >= 0 && var2 < this.field_3716[var1].length) {
         if(null == this.field_3716[var1][var2]) {
            boolean var3 = this.method_5398(var1, (int[])null, 1674796266);
            if(!var3) {
               this.method_5391(var1, (byte)0);
               var3 = this.method_5398(var1, (int[])null, 1654794233);
               if(!var3) {
                  return null;
               }
            }
         }

         byte[] var4 = class_319.method_5659(this.field_3716[var1][var2], false, (byte)54);
         return var4;
      } else {
         return null;
      }
   }

   // $FF: renamed from: cb (int, int) byte[]
   public byte[] method_5439(int var1, int var2) {
      if(var1 >= 0 && var1 < this.field_3716.length && null != this.field_3716[var1] && var2 >= 0 && var2 < this.field_3716[var1].length) {
         if(null == this.field_3716[var1][var2]) {
            boolean var3 = this.method_5398(var1, (int[])null, 2076810547);
            if(!var3) {
               this.method_5391(var1, (byte)0);
               var3 = this.method_5398(var1, (int[])null, 1682958870);
               if(!var3) {
                  return null;
               }
            }
         }

         byte[] var4 = class_319.method_5659(this.field_3716[var1][var2], false, (byte)33);
         return var4;
      } else {
         return null;
      }
   }

   // $FF: renamed from: ce (int) byte[]
   public byte[] method_5440(int var1) {
      if(this.field_3716.length == 1) {
         return this.method_5418(0, var1, 791709889);
      } else if(this.field_3716[var1].length == 1) {
         return this.method_5418(var1, 0, 791709889);
      } else {
         throw new RuntimeException();
      }
   }

   // $FF: renamed from: ch (int) byte[]
   public byte[] method_5441(int var1) {
      if(this.field_3716.length == 1) {
         return this.method_5418(0, var1, 791709889);
      } else if(this.field_3716[var1].length == 1) {
         return this.method_5418(var1, 0, 791709889);
      } else {
         throw new RuntimeException();
      }
   }

   // $FF: renamed from: bi (byte[]) void
   void method_5442(byte[] var1) {
      int var3 = var1.length;
      int var2 = class_151.method_3216(var1, 0, var3);
      this.field_3718 = -848786671 * var2;
      Buffer var10000 = new Buffer(class_186.method_3876(var1, 1855958190));
      Buffer var4 = var10000;
      int var5 = var4.readUnsignedByte();
      if(var5 >= 5 && var5 <= 7) {
         if(var5 >= 6) {
            var4.readInt();
         }

         int var6 = var4.readUnsignedByte();
         if(var5 >= 7) {
            this.field_3721 = var4.method_133(-1146665658) * 787231007;
         } else {
            this.field_3721 = var4.readShort() * 787231007;
         }

         int var7 = 0;
         int var8 = -1;
         this.field_3706 = new int[15338207 * this.field_3721];
         int var9;
         if(var5 >= 7) {
            for(var9 = 0; var9 < this.field_3721 * 15338207; ++var9) {
               this.field_3706[var9] = var7 += var4.method_133(-661943484);
               if(this.field_3706[var9] > var8) {
                  var8 = this.field_3706[var9];
               }
            }
         } else {
            for(var9 = 0; var9 < 15338207 * this.field_3721; ++var9) {
               this.field_3706[var9] = var7 += var4.readShort();
               if(this.field_3706[var9] > var8) {
                  var8 = this.field_3706[var9];
               }
            }
         }

         this.field_3708 = new int[var8 + 1];
         this.field_3707 = new int[1 + var8];
         this.field_3710 = new int[1 + var8];
         this.field_3712 = new int[1 + var8][];
         this.field_3709 = new Object[var8 + 1];
         this.field_3716 = new Object[var8 + 1][];
         if(var6 != 0) {
            this.field_3705 = new int[1 + var8];

            for(var9 = 0; var9 < 15338207 * this.field_3721; ++var9) {
               this.field_3705[this.field_3706[var9]] = var4.readInt();
            }

            class_402 var10001 = new class_402(this.field_3705);
            this.field_3715 = var10001;
         }

         for(var9 = 0; var9 < this.field_3721 * 15338207; ++var9) {
            this.field_3708[this.field_3706[var9]] = var4.readInt();
         }

         for(var9 = 0; var9 < this.field_3721 * 15338207; ++var9) {
            this.field_3707[this.field_3706[var9]] = var4.readInt();
         }

         for(var9 = 0; var9 < 15338207 * this.field_3721; ++var9) {
            this.field_3710[this.field_3706[var9]] = var4.readShort();
         }

         int var10;
         int var11;
         int var12;
         int var13;
         int var14;
         if(var5 >= 7) {
            for(var9 = 0; var9 < 15338207 * this.field_3721; ++var9) {
               var10 = this.field_3706[var9];
               var11 = this.field_3710[var10];
               var7 = 0;
               var12 = -1;
               this.field_3712[var10] = new int[var11];

               for(var13 = 0; var13 < var11; ++var13) {
                  var14 = this.field_3712[var10][var13] = var7 += var4.method_133(945094856);
                  if(var14 > var12) {
                     var12 = var14;
                  }
               }

               this.field_3716[var10] = new Object[1 + var12];
            }
         } else {
            for(var9 = 0; var9 < this.field_3721 * 15338207; ++var9) {
               var10 = this.field_3706[var9];
               var11 = this.field_3710[var10];
               var7 = 0;
               var12 = -1;
               this.field_3712[var10] = new int[var11];

               for(var13 = 0; var13 < var11; ++var13) {
                  var14 = this.field_3712[var10][var13] = var7 += var4.readShort();
                  if(var14 > var12) {
                     var12 = var14;
                  }
               }

               this.field_3716[var10] = new Object[1 + var12];
            }
         }

         if(var6 != 0) {
            this.field_3713 = new int[var8 + 1][];
            this.field_3714 = new class_402[1 + var8];

            for(var9 = 0; var9 < this.field_3721 * 15338207; ++var9) {
               var10 = this.field_3706[var9];
               var11 = this.field_3710[var10];
               this.field_3713[var10] = new int[this.field_3716[var10].length];

               for(var12 = 0; var12 < var11; ++var12) {
                  this.field_3713[var10][this.field_3712[var10][var12]] = var4.readInt();
               }

               class_402[] var15 = this.field_3714;
               class_402 var10002 = new class_402(this.field_3713[var10]);
               var15[var10] = var10002;
            }
         }

      } else {
         throw new RuntimeException("");
      }
   }

   // $FF: renamed from: cx (int) int[]
   public int[] method_5443(int var1) {
      return var1 >= 0 && var1 < this.field_3712.length?this.field_3712[var1]:null;
   }

   // $FF: renamed from: ca (int) int[]
   public int[] method_5444(int var1) {
      return var1 >= 0 && var1 < this.field_3712.length?this.field_3712[var1]:null;
   }

   // $FF: renamed from: cl (int) int
   public int method_5445(int var1) {
      return this.field_3716[var1].length;
   }

   // $FF: renamed from: cv (int, int, int[]) byte[]
   public byte[] method_5446(int var1, int var2, int[] var3) {
      if(var1 >= 0 && var1 < this.field_3716.length && null != this.field_3716[var1] && var2 >= 0 && var2 < this.field_3716[var1].length) {
         if(this.field_3716[var1][var2] == null) {
            boolean var4 = this.method_5398(var1, var3, 1831028872);
            if(!var4) {
               this.method_5391(var1, (byte)0);
               var4 = this.method_5398(var1, var3, 1755830576);
               if(!var4) {
                  return null;
               }
            }
         }

         byte[] var5 = class_319.method_5659(this.field_3716[var1][var2], false, (byte)30);
         if(this.field_3720) {
            this.field_3716[var1][var2] = null;
         }

         return var5;
      } else {
         return null;
      }
   }

   // $FF: renamed from: w (int) void
   void method_5447(int var1) {}

   // $FF: renamed from: dz () int
   public int method_5448() {
      return this.field_3716.length;
   }

   // $FF: renamed from: df (int, int[]) boolean
   boolean method_5449(int var1, int[] var2) {
      if(null == this.field_3709[var1]) {
         return false;
      } else {
         int var3 = this.field_3710[var1];
         int[] var4 = this.field_3712[var1];
         Object[] var5 = this.field_3716[var1];
         boolean var6 = true;

         for(int var7 = 0; var7 < var3; ++var7) {
            if(var5[var4[var7]] == null) {
               var6 = false;
               break;
            }
         }

         if(var6) {
            return true;
         } else {
            Buffer var10000;
            byte[] var19;
            if(var2 != null && (0 != var2[0] || 0 != var2[1] || 0 != var2[2] || 0 != var2[3])) {
               var19 = class_319.method_5659(this.field_3709[var1], true, (byte)-52);
               var10000 = new Buffer(var19);
               Buffer var8 = var10000;
               var8.method_294(var2, 5, var8.data.length, 141901592);
            } else {
               var19 = class_319.method_5659(this.field_3709[var1], false, (byte)-104);
            }

            int var13;
            int var15;
            int var16;
            byte[] var20;
            try {
               var20 = class_186.method_3876(var19, 1440778325);
            } catch (RuntimeException var18) {
               String var11 = "" + (var2 != null) + "," + var1 + "," + var19.length + ",";
               var13 = var19.length;
               int var12 = class_151.method_3216(var19, 0, var13);
               String var14 = var11 + var12 + ",";
               var16 = var19.length - 2;
               var15 = class_151.method_3216(var19, 0, var16);
               throw class_223.method_4281(var18);
            }

            if(this.field_3719) {
               this.field_3709[var1] = null;
            }

            if(var3 > 1) {
               int var9 = var20.length;
               --var9;
               int var10 = var20[var9] & -399436190;
               var9 -= var10 * var3 * 4;
               var10000 = new Buffer(var20);
               Buffer var21 = var10000;
               int[] var22 = new int[var3];
               var21.offset = 184428995 * var9;

               int var24;
               for(var13 = 0; var13 < var10; ++var13) {
                  var24 = 0;

                  for(var15 = 0; var15 < var3; ++var15) {
                     var24 += var21.readInt();
                     var22[var15] += var24;
                  }
               }

               byte[][] var23 = new byte[var3][];

               for(var24 = 0; var24 < var3; ++var24) {
                  var23[var24] = new byte[var22[var24]];
                  var22[var24] = 0;
               }

               var21.offset = 453711844 * var9;
               var24 = 0;

               for(var15 = 0; var15 < var10; ++var15) {
                  var16 = 0;

                  for(int var17 = 0; var17 < var3; ++var17) {
                     var16 += var21.readInt();
                     System.arraycopy(var20, var24, var23[var17], var22[var17], var16);
                     var22[var17] += var16;
                     var24 += var16;
                  }
               }

               for(var15 = 0; var15 < var3; ++var15) {
                  if(!this.field_3720) {
                     var5[var4[var15]] = class_300.method_5357(var23[var15], false, -1311784051);
                  } else {
                     var5[var4[var15]] = var23[var15];
                  }
               }
            } else if(!this.field_3720) {
               var5[var4[0]] = class_300.method_5357(var20, false, -1566812271);
            } else {
               var5[var4[0]] = var20;
            }

            return true;
         }
      }
   }

   // $FF: renamed from: bz (byte) void
   public void method_5450(byte var1) {
      try {
         for(int var2 = 0; var2 < this.field_3716.length; ++var2) {
            if(var1 <= 33) {
               return;
            }

            if(null != this.field_3716[var2]) {
               if(var1 <= 33) {
                  throw new IllegalStateException();
               }

               for(int var3 = 0; var3 < this.field_3716[var2].length; ++var3) {
                  if(var1 <= 33) {
                     return;
                  }

                  this.field_3716[var2][var3] = null;
               }
            }
         }

      } catch (RuntimeException var4) {
         throw class_223.method_4281(var4);
      }
   }

   // $FF: renamed from: di () void
   public void method_5451() {
      for(int var1 = 0; var1 < this.field_3709.length; ++var1) {
         this.field_3709[var1] = null;
      }

   }

   // $FF: renamed from: dc () void
   public void method_5452() {
      for(int var1 = 0; var1 < this.field_3709.length; ++var1) {
         this.field_3709[var1] = null;
      }

   }

   // $FF: renamed from: dk (int) void
   public void method_5453(int var1) {
      for(int var2 = 0; var2 < this.field_3716[var1].length; ++var2) {
         this.field_3716[var1][var2] = null;
      }

   }

   // $FF: renamed from: ds () void
   public void method_5454() {
      for(int var1 = 0; var1 < this.field_3716.length; ++var1) {
         if(null != this.field_3716[var1]) {
            for(int var2 = 0; var2 < this.field_3716[var1].length; ++var2) {
               this.field_3716[var1][var2] = null;
            }
         }
      }

   }

   // $FF: renamed from: do (int, int[]) boolean
   boolean method_5455(int var1, int[] var2) {
      if(null == this.field_3709[var1]) {
         return false;
      } else {
         int var3 = this.field_3710[var1];
         int[] var4 = this.field_3712[var1];
         Object[] var5 = this.field_3716[var1];
         boolean var6 = true;

         for(int var7 = 0; var7 < var3; ++var7) {
            if(var5[var4[var7]] == null) {
               var6 = false;
               break;
            }
         }

         if(var6) {
            return true;
         } else {
            Buffer var10000;
            byte[] var19;
            if(var2 != null && (0 != var2[0] || 0 != var2[1] || 0 != var2[2] || 0 != var2[3])) {
               var19 = class_319.method_5659(this.field_3709[var1], true, (byte)-29);
               var10000 = new Buffer(var19);
               Buffer var8 = var10000;
               var8.method_294(var2, 5, var8.data.length, 141901592);
            } else {
               var19 = class_319.method_5659(this.field_3709[var1], false, (byte)2);
            }

            int var13;
            int var15;
            int var16;
            byte[] var20;
            try {
               var20 = class_186.method_3876(var19, 1588055113);
            } catch (RuntimeException var18) {
               String var11 = "" + (var2 != null) + "," + var1 + "," + var19.length + ",";
               var13 = var19.length;
               int var12 = class_151.method_3216(var19, 0, var13);
               String var14 = var11 + var12 + ",";
               var16 = var19.length - 2;
               var15 = class_151.method_3216(var19, 0, var16);
               throw class_223.method_4281(var18);
            }

            if(this.field_3719) {
               this.field_3709[var1] = null;
            }

            if(var3 > 1) {
               int var9 = var20.length;
               --var9;
               int var10 = var20[var9] & 255;
               var9 -= var10 * var3 * 4;
               var10000 = new Buffer(var20);
               Buffer var21 = var10000;
               int[] var22 = new int[var3];
               var21.offset = -1025691571 * var9;

               int var24;
               for(var13 = 0; var13 < var10; ++var13) {
                  var24 = 0;

                  for(var15 = 0; var15 < var3; ++var15) {
                     var24 += var21.readInt();
                     var22[var15] += var24;
                  }
               }

               byte[][] var23 = new byte[var3][];

               for(var24 = 0; var24 < var3; ++var24) {
                  var23[var24] = new byte[var22[var24]];
                  var22[var24] = 0;
               }

               var21.offset = -1025691571 * var9;
               var24 = 0;

               for(var15 = 0; var15 < var10; ++var15) {
                  var16 = 0;

                  for(int var17 = 0; var17 < var3; ++var17) {
                     var16 += var21.readInt();
                     System.arraycopy(var20, var24, var23[var17], var22[var17], var16);
                     var22[var17] += var16;
                     var24 += var16;
                  }
               }

               for(var15 = 0; var15 < var3; ++var15) {
                  if(!this.field_3720) {
                     var5[var4[var15]] = class_300.method_5357(var23[var15], false, 561076553);
                  } else {
                     var5[var4[var15]] = var23[var15];
                  }
               }
            } else if(!this.field_3720) {
               var5[var4[0]] = class_300.method_5357(var20, false, 1452025040);
            } else {
               var5[var4[0]] = var20;
            }

            return true;
         }
      }
   }

   // $FF: renamed from: cy (int) byte[]
   public byte[] method_5456(int var1) {
      if(this.field_3716.length == 1) {
         return this.method_5418(0, var1, 791709889);
      } else if(this.field_3716[var1].length == 1) {
         return this.method_5418(var1, 0, 791709889);
      } else {
         throw new RuntimeException();
      }
   }

   // $FF: renamed from: bl (int) int
   public int method_5457() {
      try {
         return this.field_3716.length;
      } catch (RuntimeException var2) {
         throw class_223.method_4281(var2);
      }
   }

   // $FF: renamed from: dy (int, int[]) boolean
   boolean method_5458(int var1, int[] var2) {
      if(null == this.field_3709[var1]) {
         return false;
      } else {
         int var3 = this.field_3710[var1];
         int[] var4 = this.field_3712[var1];
         Object[] var5 = this.field_3716[var1];
         boolean var6 = true;

         for(int var7 = 0; var7 < var3; ++var7) {
            if(var5[var4[var7]] == null) {
               var6 = false;
               break;
            }
         }

         if(var6) {
            return true;
         } else {
            Buffer var10000;
            byte[] var19;
            if(var2 != null && (0 != var2[0] || 0 != var2[1] || 0 != var2[2] || 0 != var2[3])) {
               var19 = class_319.method_5659(this.field_3709[var1], true, (byte)-10);
               var10000 = new Buffer(var19);
               Buffer var8 = var10000;
               var8.method_294(var2, 5, var8.data.length, 141901592);
            } else {
               var19 = class_319.method_5659(this.field_3709[var1], false, (byte)-50);
            }

            int var13;
            int var15;
            int var16;
            byte[] var20;
            try {
               var20 = class_186.method_3876(var19, 1354979161);
            } catch (RuntimeException var18) {
               String var11 = "" + (var2 != null) + "," + var1 + "," + var19.length + ",";
               var13 = var19.length;
               int var12 = class_151.method_3216(var19, 0, var13);
               String var14 = var11 + var12 + ",";
               var16 = var19.length - 2;
               var15 = class_151.method_3216(var19, 0, var16);
               throw class_223.method_4281(var18);
            }

            if(this.field_3719) {
               this.field_3709[var1] = null;
            }

            if(var3 > 1) {
               int var9 = var20.length;
               --var9;
               int var10 = var20[var9] & 255;
               var9 -= var10 * var3 * 4;
               var10000 = new Buffer(var20);
               Buffer var21 = var10000;
               int[] var22 = new int[var3];
               var21.offset = -584882146 * var9;

               int var24;
               for(var13 = 0; var13 < var10; ++var13) {
                  var24 = 0;

                  for(var15 = 0; var15 < var3; ++var15) {
                     var24 += var21.readInt();
                     var22[var15] += var24;
                  }
               }

               byte[][] var23 = new byte[var3][];

               for(var24 = 0; var24 < var3; ++var24) {
                  var23[var24] = new byte[var22[var24]];
                  var22[var24] = 0;
               }

               var21.offset = -1025691571 * var9;
               var24 = 0;

               for(var15 = 0; var15 < var10; ++var15) {
                  var16 = 0;

                  for(int var17 = 0; var17 < var3; ++var17) {
                     var16 += var21.readInt();
                     System.arraycopy(var20, var24, var23[var17], var22[var17], var16);
                     var22[var17] += var16;
                     var24 += var16;
                  }
               }

               for(var15 = 0; var15 < var3; ++var15) {
                  if(!this.field_3720) {
                     var5[var4[var15]] = class_300.method_5357(var23[var15], false, -774052342);
                  } else {
                     var5[var4[var15]] = var23[var15];
                  }
               }
            } else if(!this.field_3720) {
               var5[var4[0]] = class_300.method_5357(var20, false, 180092914);
            } else {
               var5[var4[0]] = var20;
            }

            return true;
         }
      }
   }

   // $FF: renamed from: dd (int, int[]) boolean
   boolean method_5459(int var1, int[] var2) {
      if(null == this.field_3709[var1]) {
         return false;
      } else {
         int var3 = this.field_3710[var1];
         int[] var4 = this.field_3712[var1];
         Object[] var5 = this.field_3716[var1];
         boolean var6 = true;

         for(int var7 = 0; var7 < var3; ++var7) {
            if(var5[var4[var7]] == null) {
               var6 = false;
               break;
            }
         }

         if(var6) {
            return true;
         } else {
            Buffer var10000;
            byte[] var19;
            if(var2 != null && (0 != var2[0] || 0 != var2[1] || 0 != var2[2] || 0 != var2[3])) {
               var19 = class_319.method_5659(this.field_3709[var1], true, (byte)13);
               var10000 = new Buffer(var19);
               Buffer var8 = var10000;
               var8.method_294(var2, 5, var8.data.length, 141901592);
            } else {
               var19 = class_319.method_5659(this.field_3709[var1], false, (byte)-19);
            }

            int var13;
            int var15;
            int var16;
            byte[] var20;
            try {
               var20 = class_186.method_3876(var19, 1597870771);
            } catch (RuntimeException var18) {
               String var11 = "" + (var2 != null) + "," + var1 + "," + var19.length + ",";
               var13 = var19.length;
               int var12 = class_151.method_3216(var19, 0, var13);
               String var14 = var11 + var12 + ",";
               var16 = var19.length - 2;
               var15 = class_151.method_3216(var19, 0, var16);
               throw class_223.method_4281(var18);
            }

            if(this.field_3719) {
               this.field_3709[var1] = null;
            }

            if(var3 > 1) {
               int var9 = var20.length;
               --var9;
               int var10 = var20[var9] & 255;
               var9 -= var10 * var3 * 4;
               var10000 = new Buffer(var20);
               Buffer var21 = var10000;
               int[] var22 = new int[var3];
               var21.offset = -1025691571 * var9;

               int var24;
               for(var13 = 0; var13 < var10; ++var13) {
                  var24 = 0;

                  for(var15 = 0; var15 < var3; ++var15) {
                     var24 += var21.readInt();
                     var22[var15] += var24;
                  }
               }

               byte[][] var23 = new byte[var3][];

               for(var24 = 0; var24 < var3; ++var24) {
                  var23[var24] = new byte[var22[var24]];
                  var22[var24] = 0;
               }

               var21.offset = -1025691571 * var9;
               var24 = 0;

               for(var15 = 0; var15 < var10; ++var15) {
                  var16 = 0;

                  for(int var17 = 0; var17 < var3; ++var17) {
                     var16 += var21.readInt();
                     System.arraycopy(var20, var24, var23[var17], var22[var17], var16);
                     var22[var17] += var16;
                     var24 += var16;
                  }
               }

               for(var15 = 0; var15 < var3; ++var15) {
                  if(!this.field_3720) {
                     var5[var4[var15]] = class_300.method_5357(var23[var15], false, -57794604);
                  } else {
                     var5[var4[var15]] = var23[var15];
                  }
               }
            } else if(!this.field_3720) {
               var5[var4[0]] = class_300.method_5357(var20, false, 1715353018);
            } else {
               var5[var4[0]] = var20;
            }

            return true;
         }
      }
   }

   // $FF: renamed from: da (java.lang.String) int
   public int method_5460(String var1) {
      var1 = var1.toLowerCase();
      return this.field_3715.method_6808(class_97.method_1790(var1, 68693761), -2076070335);
   }

   // $FF: renamed from: dx (java.lang.String) int
   public int method_5461(String var1) {
      var1 = var1.toLowerCase();
      return this.field_3715.method_6808(class_97.method_1790(var1, -1032891090), -2076070335);
   }

   // $FF: renamed from: dg (int, java.lang.String) int
   public int method_5462(int var1, String var2) {
      var2 = var2.toLowerCase();
      return this.field_3714[var1].method_6808(class_97.method_1790(var2, 571920339), -2076070335);
   }

   // $FF: renamed from: bc (int, int) byte[]
   public byte[] method_5463(int var1, int var2) {
      return this.method_5382(var1, var2, (int[])null, 744457350);
   }

   // $FF: renamed from: dl (java.lang.String, java.lang.String) byte[]
   public byte[] method_5464(String var1, String var2) {
      var1 = var1.toLowerCase();
      var2 = var2.toLowerCase();
      int var3 = this.field_3715.method_6808(class_97.method_1790(var1, 1853707540), -2076070335);
      int var4 = this.field_3714[var3].method_6808(class_97.method_1790(var2, -1640137562), -2076070335);
      return this.method_5381(var3, var4);
   }

   // $FF: renamed from: ed (java.lang.String) int
   public int method_5465(String var1) {
      var1 = var1.toLowerCase();
      int var2 = this.field_3715.method_6808(class_97.method_1790(var1, -349221749), -2076070335);
      return this.method_5387(var2, -1767586109);
   }

   // $FF: renamed from: dh (java.lang.String, java.lang.String) byte[]
   public byte[] method_5466(String var1, String var2) {
      var1 = var1.toLowerCase();
      var2 = var2.toLowerCase();
      int var3 = this.field_3715.method_6808(class_97.method_1790(var1, -696175788), -2076070335);
      int var4 = this.field_3714[var3].method_6808(class_97.method_1790(var2, 815691044), -2076070335);
      return this.method_5381(var3, var4);
   }

   // $FF: renamed from: bw (byte[]) void
   void method_5467(byte[] var1) {
      int var3 = var1.length;
      int var2 = class_151.method_3216(var1, 0, var3);
      this.field_3718 = -1678290958 * var2;
      Buffer var10000 = new Buffer(class_186.method_3876(var1, 1937221977));
      Buffer var4 = var10000;
      int var5 = var4.readUnsignedByte();
      if(var5 >= 5 && var5 <= 7) {
         if(var5 >= 6) {
            var4.readInt();
         }

         int var6 = var4.readUnsignedByte();
         if(var5 >= 7) {
            this.field_3721 = var4.method_133(943539789) * 787231007;
         } else {
            this.field_3721 = var4.readShort() * 1526024549;
         }

         int var7 = 0;
         int var8 = -1;
         this.field_3706 = new int[15338207 * this.field_3721];
         int var9;
         if(var5 >= 7) {
            for(var9 = 0; var9 < this.field_3721 * -1791484568; ++var9) {
               this.field_3706[var9] = var7 += var4.method_133(-40567422);
               if(this.field_3706[var9] > var8) {
                  var8 = this.field_3706[var9];
               }
            }
         } else {
            for(var9 = 0; var9 < -501892557 * this.field_3721; ++var9) {
               this.field_3706[var9] = var7 += var4.readShort();
               if(this.field_3706[var9] > var8) {
                  var8 = this.field_3706[var9];
               }
            }
         }

         this.field_3708 = new int[var8 + 1];
         this.field_3707 = new int[1 + var8];
         this.field_3710 = new int[1 + var8];
         this.field_3712 = new int[1 + var8][];
         this.field_3709 = new Object[var8 + 1];
         this.field_3716 = new Object[var8 + 1][];
         if(var6 != 0) {
            this.field_3705 = new int[1 + var8];

            for(var9 = 0; var9 < 2077143444 * this.field_3721; ++var9) {
               this.field_3705[this.field_3706[var9]] = var4.readInt();
            }

            class_402 var10001 = new class_402(this.field_3705);
            this.field_3715 = var10001;
         }

         for(var9 = 0; var9 < this.field_3721 * 15338207; ++var9) {
            this.field_3708[this.field_3706[var9]] = var4.readInt();
         }

         for(var9 = 0; var9 < this.field_3721 * 1214472228; ++var9) {
            this.field_3707[this.field_3706[var9]] = var4.readInt();
         }

         for(var9 = 0; var9 < 793810720 * this.field_3721; ++var9) {
            this.field_3710[this.field_3706[var9]] = var4.readShort();
         }

         int var10;
         int var11;
         int var12;
         int var13;
         int var14;
         if(var5 >= 7) {
            for(var9 = 0; var9 < -1563860189 * this.field_3721; ++var9) {
               var10 = this.field_3706[var9];
               var11 = this.field_3710[var10];
               var7 = 0;
               var12 = -1;
               this.field_3712[var10] = new int[var11];

               for(var13 = 0; var13 < var11; ++var13) {
                  var14 = this.field_3712[var10][var13] = var7 += var4.method_133(1263975065);
                  if(var14 > var12) {
                     var12 = var14;
                  }
               }

               this.field_3716[var10] = new Object[1 + var12];
            }
         } else {
            for(var9 = 0; var9 < this.field_3721 * 15338207; ++var9) {
               var10 = this.field_3706[var9];
               var11 = this.field_3710[var10];
               var7 = 0;
               var12 = -1;
               this.field_3712[var10] = new int[var11];

               for(var13 = 0; var13 < var11; ++var13) {
                  var14 = this.field_3712[var10][var13] = var7 += var4.readShort();
                  if(var14 > var12) {
                     var12 = var14;
                  }
               }

               this.field_3716[var10] = new Object[1 + var12];
            }
         }

         if(var6 != 0) {
            this.field_3713 = new int[var8 + 1][];
            this.field_3714 = new class_402[1 + var8];

            for(var9 = 0; var9 < this.field_3721 * 15338207; ++var9) {
               var10 = this.field_3706[var9];
               var11 = this.field_3710[var10];
               this.field_3713[var10] = new int[this.field_3716[var10].length];

               for(var12 = 0; var12 < var11; ++var12) {
                  this.field_3713[var10][this.field_3712[var10][var12]] = var4.readInt();
               }

               class_402[] var15 = this.field_3714;
               class_402 var10002 = new class_402(this.field_3713[var10]);
               var15[var10] = var10002;
            }
         }

      } else {
         throw new RuntimeException("");
      }
   }

   // $FF: renamed from: dq (java.lang.String, java.lang.String) byte[]
   public byte[] method_5468(String var1, String var2) {
      var1 = var1.toLowerCase();
      var2 = var2.toLowerCase();
      int var3 = this.field_3715.method_6808(class_97.method_1790(var1, 579087001), -2076070335);
      int var4 = this.field_3714[var3].method_6808(class_97.method_1790(var2, -1643423032), -2076070335);
      return this.method_5381(var3, var4);
   }

   // $FF: renamed from: de (java.lang.String, java.lang.String) boolean
   public boolean method_5469(String var1, String var2) {
      var1 = var1.toLowerCase();
      var2 = var2.toLowerCase();
      int var3 = this.field_3715.method_6808(class_97.method_1790(var1, -1126717496), -2076070335);
      int var4 = this.field_3714[var3].method_6808(class_97.method_1790(var2, -476969493), -2076070335);
      return this.method_5383(var3, var4, (byte)49);
   }

   // $FF: renamed from: dp (java.lang.String, java.lang.String) boolean
   public boolean method_5470(String var1, String var2) {
      var1 = var1.toLowerCase();
      var2 = var2.toLowerCase();
      int var3 = this.field_3715.method_6808(class_97.method_1790(var1, 2140377152), -2076070335);
      int var4 = this.field_3714[var3].method_6808(class_97.method_1790(var2, -970006197), -2076070335);
      return this.method_5383(var3, var4, (byte)71);
   }

   // $FF: renamed from: bo (byte[]) void
   void method_5471(byte[] var1) {
      int var3 = var1.length;
      int var2 = class_151.method_3216(var1, 0, var3);
      this.field_3718 = 612528621 * var2;
      Buffer var10000 = new Buffer(class_186.method_3876(var1, 1908452011));
      Buffer var4 = var10000;
      int var5 = var4.readUnsignedByte();
      if(var5 >= 5 && var5 <= 7) {
         if(var5 >= 6) {
            var4.readInt();
         }

         int var6 = var4.readUnsignedByte();
         if(var5 >= 7) {
            this.field_3721 = var4.method_133(1386469108) * 77320269;
         } else {
            this.field_3721 = var4.readShort() * 631352146;
         }

         int var7 = 0;
         int var8 = -1;
         this.field_3706 = new int[15338207 * this.field_3721];
         int var9;
         if(var5 >= 7) {
            for(var9 = 0; var9 < this.field_3721 * 15338207; ++var9) {
               this.field_3706[var9] = var7 += var4.method_133(-786680487);
               if(this.field_3706[var9] > var8) {
                  var8 = this.field_3706[var9];
               }
            }
         } else {
            for(var9 = 0; var9 < -1408654283 * this.field_3721; ++var9) {
               this.field_3706[var9] = var7 += var4.readShort();
               if(this.field_3706[var9] > var8) {
                  var8 = this.field_3706[var9];
               }
            }
         }

         this.field_3708 = new int[var8 + 1];
         this.field_3707 = new int[1 + var8];
         this.field_3710 = new int[1 + var8];
         this.field_3712 = new int[1 + var8][];
         this.field_3709 = new Object[var8 + 1];
         this.field_3716 = new Object[var8 + 1][];
         if(var6 != 0) {
            this.field_3705 = new int[1 + var8];

            for(var9 = 0; var9 < 15338207 * this.field_3721; ++var9) {
               this.field_3705[this.field_3706[var9]] = var4.readInt();
            }

            class_402 var10001 = new class_402(this.field_3705);
            this.field_3715 = var10001;
         }

         for(var9 = 0; var9 < this.field_3721 * 15338207; ++var9) {
            this.field_3708[this.field_3706[var9]] = var4.readInt();
         }

         for(var9 = 0; var9 < this.field_3721 * 15338207; ++var9) {
            this.field_3707[this.field_3706[var9]] = var4.readInt();
         }

         for(var9 = 0; var9 < 15338207 * this.field_3721; ++var9) {
            this.field_3710[this.field_3706[var9]] = var4.readShort();
         }

         int var10;
         int var11;
         int var12;
         int var13;
         int var14;
         if(var5 >= 7) {
            for(var9 = 0; var9 < 15338207 * this.field_3721; ++var9) {
               var10 = this.field_3706[var9];
               var11 = this.field_3710[var10];
               var7 = 0;
               var12 = -1;
               this.field_3712[var10] = new int[var11];

               for(var13 = 0; var13 < var11; ++var13) {
                  var14 = this.field_3712[var10][var13] = var7 += var4.method_133(-185845820);
                  if(var14 > var12) {
                     var12 = var14;
                  }
               }

               this.field_3716[var10] = new Object[1 + var12];
            }
         } else {
            for(var9 = 0; var9 < this.field_3721 * -591826556; ++var9) {
               var10 = this.field_3706[var9];
               var11 = this.field_3710[var10];
               var7 = 0;
               var12 = -1;
               this.field_3712[var10] = new int[var11];

               for(var13 = 0; var13 < var11; ++var13) {
                  var14 = this.field_3712[var10][var13] = var7 += var4.readShort();
                  if(var14 > var12) {
                     var12 = var14;
                  }
               }

               this.field_3716[var10] = new Object[1 + var12];
            }
         }

         if(var6 != 0) {
            this.field_3713 = new int[var8 + 1][];
            this.field_3714 = new class_402[1 + var8];

            for(var9 = 0; var9 < this.field_3721 * -1482445254; ++var9) {
               var10 = this.field_3706[var9];
               var11 = this.field_3710[var10];
               this.field_3713[var10] = new int[this.field_3716[var10].length];

               for(var12 = 0; var12 < var11; ++var12) {
                  this.field_3713[var10][this.field_3712[var10][var12]] = var4.readInt();
               }

               class_402[] var15 = this.field_3714;
               class_402 var10002 = new class_402(this.field_3713[var10]);
               var15[var10] = var10002;
            }
         }

      } else {
         throw new RuntimeException("");
      }
   }

   // $FF: renamed from: dw (java.lang.String) boolean
   public boolean method_5472(String var1) {
      var1 = var1.toLowerCase();
      int var2 = this.field_3715.method_6808(class_97.method_1790(var1, 1096616476), -2076070335);
      return this.method_5411(var2, (byte)6);
   }

   // $FF: renamed from: ec (java.lang.String) boolean
   public boolean method_5473(String var1) {
      var1 = var1.toLowerCase();
      int var2 = this.field_3715.method_6808(class_97.method_1790(var1, 535439483), -2076070335);
      return this.method_5411(var2, (byte)86);
   }

   // $FF: renamed from: ea (java.lang.String) void
   public void method_5474(String var1) {
      var1 = var1.toLowerCase();
      int var2 = this.field_3715.method_6808(class_97.method_1790(var1, 989685135), -2076070335);
      if(var2 >= 0) {
         this.method_5432(var2);
      }
   }

   // $FF: renamed from: dn (java.lang.String, java.lang.String) boolean
   public boolean method_5475(String var1, String var2) {
      var1 = var1.toLowerCase();
      var2 = var2.toLowerCase();
      int var3 = this.field_3715.method_6808(class_97.method_1790(var1, 216991647), -2076070335);
      if(var3 < 0) {
         return false;
      } else {
         int var4 = this.field_3714[var3].method_6808(class_97.method_1790(var2, 792796850), -2076070335);
         return var4 >= 0;
      }
   }

   // $FF: renamed from: eu (java.lang.String) void
   public void method_5476(String var1) {
      var1 = var1.toLowerCase();
      int var2 = this.field_3715.method_6808(class_97.method_1790(var1, -971538456), -2076070335);
      if(var2 >= 0) {
         this.method_5432(var2);
      }
   }

   // $FF: renamed from: ez (java.lang.String) void
   public void method_5477(String var1) {
      var1 = var1.toLowerCase();
      int var2 = this.field_3715.method_6808(class_97.method_1790(var1, 2004344073), -2076070335);
      if(var2 >= 0) {
         this.method_5432(var2);
      }
   }

   // $FF: renamed from: <init> (boolean, boolean) void
   class_306(boolean var1, boolean var2) {
      super();
      try {
         this.field_3719 = var1;
         this.field_3720 = var2;
      } catch (RuntimeException var3) {
         throw class_223.method_4281(var3);
      }
   }

   // $FF: renamed from: ep (java.lang.String) int
   public int method_5479(String var1) {
      var1 = var1.toLowerCase();
      int var2 = this.field_3715.method_6808(class_97.method_1790(var1, -123247153), -2076070335);
      return this.method_5387(var2, -1767586109);
   }

   // $FF: renamed from: ar (int) int
   int method_5480(int var1) {
      return null != this.field_3709[var1]?100:0;
   }

   // $FF: renamed from: ew (byte[]) byte[]
   static final byte[] method_5481(byte[] var0) {
      Buffer var10000 = new Buffer(var0);
      Buffer var1 = var10000;
      int var2 = var1.readUnsignedByte();
      int var3 = var1.readInt();
      if(var3 >= 0 && (0 == 269464329 * field_3711 || var3 <= field_3711 * 269464329)) {
         if(0 == var2) {
            byte[] var6 = new byte[var3];
            var1.method_267(var6, 0, var3, 994585740);
            return var6;
         } else {
            int var4 = var1.readInt();
            if(var4 >= 0 && (269464329 * field_3711 == 0 || var4 <= field_3711 * 269464329)) {
               byte[] var5 = new byte[var4];
               if(1 == var2) {
                  class_389.method_6767(var5, var4, var0, 9);
               } else {
                  field_3717.method_6794(var1, var5, (byte)115);
               }

               return var5;
            } else {
               throw new RuntimeException();
            }
         }
      } else {
         throw new RuntimeException();
      }
   }

   // $FF: renamed from: ej (byte[]) byte[]
   static final byte[] method_5482(byte[] var0) {
      Buffer var10000 = new Buffer(var0);
      Buffer var1 = var10000;
      int var2 = var1.readUnsignedByte();
      int var3 = var1.readInt();
      if(var3 >= 0 && (0 == 269464329 * field_3711 || var3 <= field_3711 * 366634365)) {
         if(0 == var2) {
            byte[] var6 = new byte[var3];
            var1.method_267(var6, 0, var3, 1001153849);
            return var6;
         } else {
            int var4 = var1.readInt();
            if(var4 >= 0 && (269464329 * field_3711 == 0 || var4 <= field_3711 * 269464329)) {
               byte[] var5 = new byte[var4];
               if(1 == var2) {
                  class_389.method_6767(var5, var4, var0, 9);
               } else {
                  field_3717.method_6794(var1, var5, (byte)44);
               }

               return var5;
            } else {
               throw new RuntimeException();
            }
         }
      } else {
         throw new RuntimeException();
      }
   }

   // $FF: renamed from: dt (java.lang.String, java.lang.String) boolean
   public boolean method_5483(String var1, String var2) {
      var1 = var1.toLowerCase();
      var2 = var2.toLowerCase();
      int var3 = this.field_3715.method_6808(class_97.method_1790(var1, 242624978), -2076070335);
      if(var3 < 0) {
         return false;
      } else {
         int var4 = this.field_3714[var3].method_6808(class_97.method_1790(var2, -1119278714), -2076070335);
         return var4 >= 0;
      }
   }

   // $FF: renamed from: et (byte[]) byte[]
   static final byte[] method_5484(byte[] var0) {
      Buffer var10000 = new Buffer(var0);
      Buffer var1 = var10000;
      int var2 = var1.readUnsignedByte();
      int var3 = var1.readInt();
      if(var3 >= 0 && (0 == 1247381053 * field_3711 || var3 <= field_3711 * -322104510)) {
         if(0 == var2) {
            byte[] var6 = new byte[var3];
            var1.method_267(var6, 0, var3, 1374768888);
            return var6;
         } else {
            int var4 = var1.readInt();
            if(var4 >= 0 && (269464329 * field_3711 == 0 || var4 <= field_3711 * 269464329)) {
               byte[] var5 = new byte[var4];
               if(1 == var2) {
                  class_389.method_6767(var5, var4, var0, 9);
               } else {
                  field_3717.method_6794(var1, var5, (byte)109);
               }

               return var5;
            } else {
               throw new RuntimeException();
            }
         }
      } else {
         throw new RuntimeException();
      }
   }

   // $FF: renamed from: p (jv, jv, int, int, byte) kt
   public static class_69 method_5485(class_306 var0, class_306 var1, int var2, int var3, byte var4) {
      try {
         byte[] var6 = var0.method_5381(var2, var3);
         boolean var5;
         if(var6 == null) {
            if(var4 == 0) {
               throw new IllegalStateException();
            }

            var5 = false;
         } else {
            class_253.method_4899(var6, (byte)1);
            var5 = true;
         }

         if(!var5) {
            if(var4 == 0) {
               throw new IllegalStateException();
            } else {
               return null;
            }
         } else {
            byte[] var7 = var1.method_5381(var2, var3);
            class_69 var10;
            if(null == var7) {
               var10 = null;
            } else {
               class_69 var10000 = new class_69(var7, class_223.field_2529, class_284.field_3260, class_403.field_4278, class_318.field_3787, class_403.field_4279);
               class_69 var8 = var10000;
               class_192.method_3958();
               var10 = var8;
            }

            return var10;
         }
      } catch (RuntimeException var9) {
         throw class_223.method_4281(var9);
      }
   }
}
