
// $FF: renamed from: db
public final class class_99 extends class_98 {

   // $FF: renamed from: b int
   static final int field_1138 = 2;
   // $FF: renamed from: y int
   static final int field_1139 = 8;
   // $FF: renamed from: p int
   public static final int field_1140 = 4;
   // $FF: renamed from: v ef
   class_88 field_1141;


   // $FF: renamed from: jx (int, byte) boolean
   static boolean method_1814(int var0, byte var1) {
      try {
         for(int var2 = 0; var2 < client.field_1582 * 2087031963; ++var2) {
            if(client.field_1644[var2] == var0) {
               if(var1 >= 8) {
                  throw new IllegalStateException();
               }

               return true;
            }
         }

         return false;
      } catch (RuntimeException var3) {
         throw class_223.method_4281(var3);
      }
   }

   // $FF: renamed from: v (int, byte, int) void
   final void method_1815(int var1, byte var2, int var3) {
      try {
         int var4 = this.field_1112[0];
         int var5 = this.field_1126[0];
         if(var1 == 0) {
            --var4;
            ++var5;
         }

         if(var1 == 1) {
            if(var3 != -300135840) {
               throw new IllegalStateException();
            }

            ++var5;
         }

         if(2 == var1) {
            ++var4;
            ++var5;
         }

         if(3 == var1) {
            --var4;
         }

         if(var1 == 4) {
            if(var3 != -300135840) {
               return;
            }

            ++var4;
         }

         if(5 == var1) {
            --var4;
            --var5;
         }

         if(6 == var1) {
            if(var3 != -300135840) {
               throw new IllegalStateException();
            }

            --var5;
         }

         if(var1 == 7) {
            if(var3 != -300135840) {
               throw new IllegalStateException();
            }

            ++var4;
            --var5;
         }

         if(-1 != this.field_1108 * -1762760413) {
            if(var3 != -300135840) {
               throw new IllegalStateException();
            }

            if(class_162.method_3412(this.field_1108 * -1762760413, 1644214502).field_580 * -263393733 == 1) {
               if(var3 != -300135840) {
                  throw new IllegalStateException();
               }

               this.field_1108 = 1152446837;
            }
         }

         if(-664818219 * this.field_1130 < 9) {
            if(var3 != -300135840) {
               throw new IllegalStateException();
            }

            this.field_1130 += -2139872387;
         }

         for(int var6 = -664818219 * this.field_1130; var6 > 0; --var6) {
            if(var3 != -300135840) {
               throw new IllegalStateException();
            }

            this.field_1112[var6] = this.field_1112[var6 - 1];
            this.field_1126[var6] = this.field_1126[var6 - 1];
            this.field_1086[var6] = this.field_1086[var6 - 1];
         }

         this.field_1112[0] = var4;
         this.field_1126[0] = var5;
         this.field_1086[0] = var2;
      } catch (RuntimeException var7) {
         throw class_223.method_4281(var7);
      }
   }

   // $FF: renamed from: f (int, int, boolean, int) void
   final void method_1816(int var1, int var2, boolean var3, int var4) {
      try {
         if(-1762760413 * this.field_1108 != -1 && class_162.method_3412(this.field_1108 * -1762760413, 537021298).field_580 * -263393733 == 1) {
            this.field_1108 = 1152446837;
         }

         if(!var3) {
            if(var4 <= -990638784) {
               throw new IllegalStateException();
            }

            int var5 = var1 - this.field_1112[0];
            int var6 = var2 - this.field_1126[0];
            if(var5 >= -8) {
               if(var4 <= -990638784) {
                  throw new IllegalStateException();
               }

               if(var5 <= 8) {
                  if(var4 <= -990638784) {
                     return;
                  }

                  if(var6 >= -8) {
                     if(var4 <= -990638784) {
                        return;
                     }

                     if(var6 <= 8) {
                        if(var4 <= -990638784) {
                           throw new IllegalStateException();
                        }

                        if(this.field_1130 * -664818219 < 9) {
                           if(var4 <= -990638784) {
                              throw new IllegalStateException();
                           }

                           this.field_1130 += -2139872387;
                        }

                        for(int var7 = -664818219 * this.field_1130; var7 > 0; --var7) {
                           this.field_1112[var7] = this.field_1112[var7 - 1];
                           this.field_1126[var7] = this.field_1126[var7 - 1];
                           this.field_1086[var7] = this.field_1086[var7 - 1];
                        }

                        this.field_1112[0] = var1;
                        this.field_1126[0] = var2;
                        this.field_1086[0] = 1;
                        return;
                     }
                  }
               }
            }
         }

         this.field_1130 = 0;
         this.field_1114 = 0;
         this.field_1134 = 0;
         this.field_1112[0] = var1;
         this.field_1126[0] = var2;
         this.field_1077 = this.field_1112[0] * 785886848 + 1267070784 * this.field_1079;
         this.field_1076 = 1775993792 * this.field_1079 + this.field_1126[0] * -368818304;
      } catch (RuntimeException var8) {
         throw class_223.method_4281(var8);
      }
   }

   // $FF: renamed from: n (byte) gr
   protected final class_92 method_1609(byte var1) {
      try {
         if(this.field_1141 == null) {
            if(var1 >= 0) {
               throw new IllegalStateException();
            } else {
               return null;
            }
         } else {
            class_72 var10000;
            label98: {
               if(this.field_1108 * -1762760413 != -1) {
                  if(var1 >= 0) {
                     throw new IllegalStateException();
                  }

                  if(0 == -1848146093 * this.field_1111) {
                     if(var1 >= 0) {
                        throw new IllegalStateException();
                     }

                     var10000 = class_162.method_3412(-1762760413 * this.field_1108, -1300363506);
                     break label98;
                  }
               }

               var10000 = null;
            }

            class_72 var2;
            label92: {
               var2 = var10000;
               if(-1 != -330797761 * this.field_1082) {
                  label103: {
                     if(var1 >= 0) {
                        throw new IllegalStateException();
                     }

                     if(-932232515 * this.field_1081 == -330797761 * this.field_1082) {
                        if(var1 >= 0) {
                           throw new IllegalStateException();
                        }

                        if(var2 != null) {
                           break label103;
                        }

                        if(var1 >= 0) {
                           throw new IllegalStateException();
                        }
                     }

                     var10000 = class_162.method_3412(this.field_1082 * -330797761, 652289471);
                     break label92;
                  }
               }

               var10000 = null;
            }

            class_72 var3 = var10000;
            class_92 var4 = this.field_1141.method_1543(var2, this.field_1131 * 2078717111, var3, this.field_1091 * 1832573289, -26460885);
            if(null == var4) {
               if(var1 >= 0) {
                  throw new IllegalStateException();
               } else {
                  return null;
               }
            } else {
               var4.method_1621();
               this.field_1116 = var4.field_911 * -1757189869;
               if(-1915525677 * this.field_1113 != -1) {
                  if(var1 >= 0) {
                     throw new IllegalStateException();
                  }

                  if(this.field_1102 * 479634489 != -1) {
                     if(var1 >= 0) {
                        throw new IllegalStateException();
                     }

                     class_92 var5 = class_84.method_1417(this.field_1113 * -1915525677, (short)-15763).method_1226(this.field_1102 * 479634489, (byte)99);
                     if(var5 != null) {
                        if(var1 >= 0) {
                           throw new IllegalStateException();
                        }

                        var5.method_1632(0, -(-1377519793 * this.field_1117), 0);
                        class_92[] var6 = new class_92[]{var4, var5};
                        class_92 var8 = new class_92(var6, 2);
                        var4 = var8;
                     }
                  }
               }

               if(1748856001 * this.field_1141.field_859 == 1) {
                  if(var1 >= 0) {
                     throw new IllegalStateException();
                  }

                  var4.field_938 = true;
               }

               return var4;
            }
         }
      } catch (RuntimeException var7) {
         throw class_223.method_4281(var7);
      }
   }

   // $FF: renamed from: m (byte) boolean
   final boolean method_1796(byte var1) {
      try {
         return this.field_1141 != null;
      } catch (RuntimeException var2) {
         throw class_223.method_4281(var2);
      }
   }

   // $FF: renamed from: s (int, int, boolean) void
   final void method_1817(int var1, int var2, boolean var3) {
      if(-1762760413 * this.field_1108 != -1 && class_162.method_3412(this.field_1108 * -1762760413, 1405990205).field_580 * -263393733 == 1) {
         this.field_1108 = 1152446837;
      }

      if(!var3) {
         int var4 = var1 - this.field_1112[0];
         int var5 = var2 - this.field_1126[0];
         if(var4 >= -8 && var4 <= 8 && var5 >= -8 && var5 <= 8) {
            if(this.field_1130 * -664818219 < 9) {
               this.field_1130 += -2139872387;
            }

            for(int var6 = -664818219 * this.field_1130; var6 > 0; --var6) {
               this.field_1112[var6] = this.field_1112[var6 - 1];
               this.field_1126[var6] = this.field_1126[var6 - 1];
               this.field_1086[var6] = this.field_1086[var6 - 1];
            }

            this.field_1112[0] = var1;
            this.field_1126[0] = var2;
            this.field_1086[0] = 1;
            return;
         }
      }

      this.field_1130 = 0;
      this.field_1114 = 0;
      this.field_1134 = 0;
      this.field_1112[0] = var1;
      this.field_1126[0] = var2;
      this.field_1077 = this.field_1112[0] * 785886848 + 1267070784 * this.field_1079;
      this.field_1076 = 1775993792 * this.field_1079 + this.field_1126[0] * -368818304;
   }

   // $FF: renamed from: y (int, byte) void
   final void method_1818(int var1, byte var2) {
      int var3 = this.field_1112[0];
      int var4 = this.field_1126[0];
      if(var1 == 0) {
         --var3;
         ++var4;
      }

      if(var1 == 1) {
         ++var4;
      }

      if(2 == var1) {
         ++var3;
         ++var4;
      }

      if(3 == var1) {
         --var3;
      }

      if(var1 == 4) {
         ++var3;
      }

      if(5 == var1) {
         --var3;
         --var4;
      }

      if(6 == var1) {
         --var4;
      }

      if(var1 == 7) {
         ++var3;
         --var4;
      }

      if(-1 != this.field_1108 * -1762760413 && class_162.method_3412(this.field_1108 * -1762760413, -564647722).field_580 * -263393733 == 1) {
         this.field_1108 = 1152446837;
      }

      if(-664818219 * this.field_1130 < 9) {
         this.field_1130 += -2139872387;
      }

      for(int var5 = -664818219 * this.field_1130; var5 > 0; --var5) {
         this.field_1112[var5] = this.field_1112[var5 - 1];
         this.field_1126[var5] = this.field_1126[var5 - 1];
         this.field_1086[var5] = this.field_1086[var5 - 1];
      }

      this.field_1112[0] = var3;
      this.field_1126[0] = var4;
      this.field_1086[0] = var2;
   }

   // $FF: renamed from: d (int, byte) void
   final void method_1819(int var1, byte var2) {
      int var3 = this.field_1112[0];
      int var4 = this.field_1126[0];
      if(var1 == 0) {
         --var3;
         ++var4;
      }

      if(var1 == 1) {
         ++var4;
      }

      if(2 == var1) {
         ++var3;
         ++var4;
      }

      if(3 == var1) {
         --var3;
      }

      if(var1 == 4) {
         ++var3;
      }

      if(5 == var1) {
         --var3;
         --var4;
      }

      if(6 == var1) {
         --var4;
      }

      if(var1 == 7) {
         ++var3;
         --var4;
      }

      if(-1 != this.field_1108 * -1762760413 && class_162.method_3412(this.field_1108 * -1762760413, 399305802).field_580 * -263393733 == 1) {
         this.field_1108 = 1152446837;
      }

      if(-664818219 * this.field_1130 < 9) {
         this.field_1130 += -2139872387;
      }

      for(int var5 = -664818219 * this.field_1130; var5 > 0; --var5) {
         this.field_1112[var5] = this.field_1112[var5 - 1];
         this.field_1126[var5] = this.field_1126[var5 - 1];
         this.field_1086[var5] = this.field_1086[var5 - 1];
      }

      this.field_1112[0] = var3;
      this.field_1126[0] = var4;
      this.field_1086[0] = var2;
   }

   // $FF: renamed from: bh () boolean
   final boolean method_1797() {
      return this.field_1141 != null;
   }

   // $FF: renamed from: bs () boolean
   final boolean method_1795() {
      return this.field_1141 != null;
   }

   // $FF: renamed from: br () boolean
   final boolean method_1791() {
      return this.field_1141 != null;
   }

   // $FF: renamed from: <init> () void
   class_99() {
      super();
      try {
      } catch (RuntimeException var1) {
         throw class_223.method_4281(var1);
      }
   }

   // $FF: renamed from: ba () boolean
   final boolean method_1800() {
      return this.field_1141 != null;
   }

   // $FF: renamed from: bf () boolean
   final boolean method_1799() {
      return this.field_1141 != null;
   }

   // $FF: renamed from: b (int, byte) void
   final void method_1820(int var1, byte var2) {
      int var3 = this.field_1112[0];
      int var4 = this.field_1126[0];
      if(var1 == 0) {
         --var3;
         ++var4;
      }

      if(var1 == 1) {
         ++var4;
      }

      if(2 == var1) {
         ++var3;
         ++var4;
      }

      if(3 == var1) {
         --var3;
      }

      if(var1 == 4) {
         ++var3;
      }

      if(5 == var1) {
         --var3;
         --var4;
      }

      if(6 == var1) {
         --var4;
      }

      if(var1 == 7) {
         ++var3;
         --var4;
      }

      if(-1 != this.field_1108 * -1762760413 && class_162.method_3412(this.field_1108 * -1762760413, -847332860).field_580 * -263393733 == 1) {
         this.field_1108 = 1152446837;
      }

      if(-664818219 * this.field_1130 < 9) {
         this.field_1130 += -2139872387;
      }

      for(int var5 = -664818219 * this.field_1130; var5 > 0; --var5) {
         this.field_1112[var5] = this.field_1112[var5 - 1];
         this.field_1126[var5] = this.field_1126[var5 - 1];
         this.field_1086[var5] = this.field_1086[var5 - 1];
      }

      this.field_1112[0] = var3;
      this.field_1126[0] = var4;
      this.field_1086[0] = var2;
   }

   // $FF: renamed from: p () gr
   protected final class_92 method_1613() {
      if(this.field_1141 == null) {
         return null;
      } else {
         class_72 var1 = this.field_1108 * -1762760413 != -1 && 0 == -1848146093 * this.field_1111?class_162.method_3412(-1762760413 * this.field_1108, -320112550):null;
         class_72 var2 = -1 != -330797761 * this.field_1082 && (-932232515 * this.field_1081 != -330797761 * this.field_1082 || var1 == null)?class_162.method_3412(this.field_1082 * -330797761, -933039793):null;
         class_92 var3 = this.field_1141.method_1543(var1, this.field_1131 * 2078717111, var2, this.field_1091 * 1832573289, -26460885);
         if(null == var3) {
            return null;
         } else {
            var3.method_1621();
            this.field_1116 = var3.field_911 * -1757189869;
            if(-1915525677 * this.field_1113 != -1 && this.field_1102 * 479634489 != -1) {
               class_92 var4 = class_84.method_1417(this.field_1113 * -1915525677, (short)-22707).method_1226(this.field_1102 * 479634489, (byte)92);
               if(var4 != null) {
                  var4.method_1632(0, -(-1377519793 * this.field_1117), 0);
                  class_92[] var5 = new class_92[]{var3, var4};
                  class_92 var10000 = new class_92(var5, 2);
                  var3 = var10000;
               }
            }

            if(1748856001 * this.field_1141.field_859 == 1) {
               var3.field_938 = true;
            }

            return var3;
         }
      }
   }

   // $FF: renamed from: j () gr
   protected final class_92 method_1608() {
      if(this.field_1141 == null) {
         return null;
      } else {
         class_72 var1 = this.field_1108 * -1762760413 != -1 && 0 == -1848146093 * this.field_1111?class_162.method_3412(-1762760413 * this.field_1108, 1188069907):null;
         class_72 var2 = -1 != -330797761 * this.field_1082 && (-932232515 * this.field_1081 != -330797761 * this.field_1082 || var1 == null)?class_162.method_3412(this.field_1082 * -330797761, 355626978):null;
         class_92 var3 = this.field_1141.method_1543(var1, this.field_1131 * 2078717111, var2, this.field_1091 * 1832573289, -26460885);
         if(null == var3) {
            return null;
         } else {
            var3.method_1621();
            this.field_1116 = var3.field_911 * -1757189869;
            if(-1915525677 * this.field_1113 != -1 && this.field_1102 * 479634489 != -1) {
               class_92 var4 = class_84.method_1417(this.field_1113 * -1915525677, (short)14008).method_1226(this.field_1102 * 479634489, (byte)21);
               if(var4 != null) {
                  var4.method_1632(0, -(-1377519793 * this.field_1117), 0);
                  class_92[] var5 = new class_92[]{var3, var4};
                  class_92 var10000 = new class_92(var5, 2);
                  var3 = var10000;
               }
            }

            if(1748856001 * this.field_1141.field_859 == 1) {
               var3.field_938 = true;
            }

            return var3;
         }
      }
   }

   // $FF: renamed from: u (int, int, boolean) void
   final void method_1821(int var1, int var2, boolean var3) {
      if(-1762760413 * this.field_1108 != -1 && class_162.method_3412(this.field_1108 * -1762760413, -2086448811).field_580 * -263393733 == 1) {
         this.field_1108 = 1152446837;
      }

      if(!var3) {
         int var4 = var1 - this.field_1112[0];
         int var5 = var2 - this.field_1126[0];
         if(var4 >= -8 && var4 <= 8 && var5 >= -8 && var5 <= 8) {
            if(this.field_1130 * -664818219 < 9) {
               this.field_1130 += -2139872387;
            }

            for(int var6 = -664818219 * this.field_1130; var6 > 0; --var6) {
               this.field_1112[var6] = this.field_1112[var6 - 1];
               this.field_1126[var6] = this.field_1126[var6 - 1];
               this.field_1086[var6] = this.field_1086[var6 - 1];
            }

            this.field_1112[0] = var1;
            this.field_1126[0] = var2;
            this.field_1086[0] = 1;
            return;
         }
      }

      this.field_1130 = 0;
      this.field_1114 = 0;
      this.field_1134 = 0;
      this.field_1112[0] = var1;
      this.field_1126[0] = var2;
      this.field_1077 = this.field_1112[0] * 785886848 + 1267070784 * this.field_1079;
      this.field_1076 = 1775993792 * this.field_1079 + this.field_1126[0] * -368818304;
   }

   // $FF: renamed from: r () gr
   protected final class_92 method_1610() {
      if(this.field_1141 == null) {
         return null;
      } else {
         class_72 var1 = this.field_1108 * -1762760413 != -1 && 0 == -1848146093 * this.field_1111?class_162.method_3412(-1762760413 * this.field_1108, -1935045789):null;
         class_72 var2 = -1 != -330797761 * this.field_1082 && (-932232515 * this.field_1081 != -330797761 * this.field_1082 || var1 == null)?class_162.method_3412(this.field_1082 * -330797761, -229541730):null;
         class_92 var3 = this.field_1141.method_1543(var1, this.field_1131 * 2078717111, var2, this.field_1091 * 1832573289, -26460885);
         if(null == var3) {
            return null;
         } else {
            var3.method_1621();
            this.field_1116 = var3.field_911 * -1757189869;
            if(-1915525677 * this.field_1113 != -1 && this.field_1102 * 479634489 != -1) {
               class_92 var4 = class_84.method_1417(this.field_1113 * -1915525677, (short)-11653).method_1226(this.field_1102 * 479634489, (byte)117);
               if(var4 != null) {
                  var4.method_1632(0, -(-1377519793 * this.field_1117), 0);
                  class_92[] var5 = new class_92[]{var3, var4};
                  class_92 var10000 = new class_92(var5, 2);
                  var3 = var10000;
               }
            }

            if(1748856001 * this.field_1141.field_859 == 1) {
               var3.field_938 = true;
            }

            return var3;
         }
      }
   }

   // $FF: renamed from: v (int, int) boolean
   public static boolean method_1822(int var0, int var1) {
      try {
         boolean var10000;
         if(var0 != 10) {
            if(var1 == 185062409) {
               throw new IllegalStateException();
            }

            if(11 != var0 && 12 != var0) {
               if(var1 == 185062409) {
                  throw new IllegalStateException();
               }

               if(13 != var0) {
                  if(var1 == 185062409) {
                     throw new IllegalStateException();
                  }

                  if(14 != var0) {
                     if(var1 == 185062409) {
                        throw new IllegalStateException();
                     }

                     if(var0 != 15 && 16 != var0) {
                        if(var1 == 185062409) {
                           throw new IllegalStateException();
                        }

                        if(var0 != 17) {
                           var10000 = false;
                           return var10000;
                        }

                        if(var1 == 185062409) {
                           throw new IllegalStateException();
                        }
                     }
                  }
               }
            }
         }

         var10000 = true;
         return var10000;
      } catch (RuntimeException var2) {
         throw class_223.method_4281(var2);
      }
   }
}
