
// $FF: renamed from: ih
public class class_105 extends class_104 {

   // $FF: renamed from: ag java.lang.String
   static String field_1209;
   // $FF: renamed from: n kx
   class_335 field_1210;
   // $FF: renamed from: f ay
   class_108 field_1211;
   // $FF: renamed from: v hp
   class_106 field_1212;


   // $FF: renamed from: ar (int[], int, int) void
   protected void method_1946(int[] var1, int var2, int var3) {
      this.field_1211.method_1943(var1, var2, var3);

      for(class_36 var6 = (class_36)this.field_1210.method_5944(); var6 != null; var6 = (class_36)this.field_1210.method_5972()) {
         if(!this.field_1212.method_1992(var6, (byte)38)) {
            int var4 = var2;
            int var5 = var3;

            do {
               if(var5 <= 730487289 * var6.field_67) {
                  this.method_1954(var6, var1, var4, var5, var4 + var5, (short)7258);
                  var6.field_67 -= -636520058 * var5;
                  break;
               }

               this.method_1954(var6, var1, var4, 730487289 * var6.field_67, var5 + var4, (short)6793);
               var4 += 730487289 * var6.field_67;
               var5 -= var6.field_67 * 221645901;
            } while(!this.field_1212.method_1993(var6, var1, var4, var5, -2124530093));
         }
      }

   }

   // $FF: renamed from: ae () bm
   protected class_104 method_1939() {
      class_36 var1 = (class_36)this.field_1210.method_5944();
      return (class_104)(null == var1?null:(var1.field_85 != null?var1.field_85:this.method_1947()));
   }

   // $FF: renamed from: r () bm
   protected class_104 method_1947() {
      try {
         class_36 var1;
         do {
            var1 = (class_36)this.field_1210.method_5972();
            if(var1 == null) {
               return null;
            }
         } while(null == var1.field_85);

         return var1.field_85;
      } catch (RuntimeException var2) {
         throw class_223.method_4281(var2, "ih.r(" + ')');
      }
   }

   // $FF: renamed from: j () bm
   protected class_104 method_1931() {
      try {
         class_36 var1 = (class_36)this.field_1210.method_5944();
         return (class_104)(null == var1?null:(var1.field_85 != null?var1.field_85:this.method_1947()));
      } catch (RuntimeException var2) {
         throw class_223.method_4281(var2, "ih.j(" + ')');
      }
   }

   // $FF: renamed from: d (int[], int, int) void
   protected void method_1943(int[] var1, int var2, int var3) {
      try {
         this.field_1211.method_1943(var1, var2, var3);

         for(class_36 var6 = (class_36)this.field_1210.method_5944(); var6 != null; var6 = (class_36)this.field_1210.method_5972()) {
            if(!this.field_1212.method_1992(var6, (byte)12)) {
               int var4 = var2;
               int var5 = var3;

               do {
                  if(var5 <= 730487289 * var6.field_67) {
                     this.method_1954(var6, var1, var4, var5, var4 + var5, (short)21802);
                     var6.field_67 -= -2059069367 * var5;
                     break;
                  }

                  this.method_1954(var6, var1, var4, 730487289 * var6.field_67, var5 + var4, (short)25857);
                  var4 += 730487289 * var6.field_67;
                  var5 -= var6.field_67 * 730487289;
               } while(!this.field_1212.method_1993(var6, var1, var4, var5, -1568490685));
            }
         }

      } catch (RuntimeException var7) {
         throw class_223.method_4281(var7, "ih.d(" + ')');
      }
   }

   // $FF: renamed from: u (int) void
   protected void method_1933(int var1) {
      try {
         this.field_1211.method_1933(var1);

         for(class_36 var3 = (class_36)this.field_1210.method_5944(); var3 != null; var3 = (class_36)this.field_1210.method_5972()) {
            if(!this.field_1212.method_1992(var3, (byte)-21)) {
               int var2 = var1;

               do {
                  if(var2 <= var3.field_67 * 730487289) {
                     this.method_1955(var3, var2, 518605816);
                     var3.field_67 -= -2059069367 * var2;
                     break;
                  }

                  this.method_1955(var3, 730487289 * var3.field_67, 1404066411);
                  var2 -= var3.field_67 * 730487289;
               } while(!this.field_1212.method_1993(var3, (int[])null, 0, var2, -1838256621));
            }
         }

      } catch (RuntimeException var4) {
         throw class_223.method_4281(var4, "ih.u(" + ')');
      }
   }

   // $FF: renamed from: v (iq, int[], int, int, int, short) void
   void method_1954(class_36 var1, int[] var2, int var3, int var4, int var5, short var6) {
      try {
         if(0 != (this.field_1212.field_1226[-1025207361 * var1.field_81] & 4) && 1951740649 * var1.field_71 < 0) {
            if(var6 <= 765) {
               return;
            }

            int var7 = this.field_1212.field_1231[var1.field_81 * -1025207361] / (1631160541 * class_139.field_1793);

            while(true) {
               int var8 = (var7 + 1048575 - -576530835 * var1.field_80) / var7;
               if(var8 > var4) {
                  var1.field_80 += 1692574565 * var4 * var7;
                  break;
               }

               var1.field_85.method_1943(var2, var3, var8);
               var3 += var8;
               var4 -= var8;
               var1.field_80 += (var7 * var8 - 1048576) * 1692574565;
               int var9 = class_139.field_1793 * 1631160541 / 100;
               int var10 = 262144 / var7;
               if(var10 < var9) {
                  if(var6 <= 765) {
                     throw new IllegalStateException();
                  }

                  var9 = var10;
               }

               class_107 var11 = var1.field_85;
               if(0 == this.field_1212.field_1216[-1025207361 * var1.field_81]) {
                  if(var6 <= 765) {
                     return;
                  }

                  var1.field_85 = class_107.method_2072(var1.field_86, var11.method_2085(), var11.method_2126(), var11.method_2183());
               } else {
                  var1.field_85 = class_107.method_2072(var1.field_86, var11.method_2085(), 0, var11.method_2183());
                  this.field_1212.method_1974(var1, var1.field_68.field_252[var1.field_72 * -723940785] < 0, (byte)-107);
                  var1.field_85.method_2082(var9, var11.method_2126());
               }

               if(var1.field_68.field_252[var1.field_72 * -723940785] < 0) {
                  if(var6 <= 765) {
                     throw new IllegalStateException();
                  }

                  var1.field_85.method_2074(-1);
               }

               var11.method_2083(var9);
               var11.method_1943(var2, var3, var5 - var3);
               if(var11.method_2087()) {
                  this.field_1211.method_2198(var11);
               }
            }
         }

         var1.field_85.method_1943(var2, var3, var4);
      } catch (RuntimeException var12) {
         throw class_223.method_4281(var12, "ih.v(" + ')');
      }
   }

   // $FF: renamed from: n (iq, int, int) void
   void method_1955(class_36 var1, int var2, int var3) {
      try {
         if(0 != (this.field_1212.field_1226[-1025207361 * var1.field_81] & 4)) {
            if(var3 == -1918213836) {
               throw new IllegalStateException();
            }

            if(1951740649 * var1.field_71 < 0) {
               if(var3 == -1918213836) {
                  throw new IllegalStateException();
               }

               int var4 = this.field_1212.field_1231[var1.field_81 * -1025207361] / (class_139.field_1793 * 1631160541);
               int var5 = (1048575 + var4 - -576530835 * var1.field_80) / var4;
               var1.field_80 = (var4 * var2 + var1.field_80 * -576530835 & 1048575) * 1692574565;
               if(var5 <= var2) {
                  if(var3 == -1918213836) {
                     return;
                  }

                  if(0 == this.field_1212.field_1216[-1025207361 * var1.field_81]) {
                     var1.field_85 = class_107.method_2072(var1.field_86, var1.field_85.method_2085(), var1.field_85.method_2126(), var1.field_85.method_2183());
                  } else {
                     var1.field_85 = class_107.method_2072(var1.field_86, var1.field_85.method_2085(), 0, var1.field_85.method_2183());
                     this.field_1212.method_1974(var1, var1.field_68.field_252[-723940785 * var1.field_72] < 0, (byte)-23);
                  }

                  if(var1.field_68.field_252[var1.field_72 * -723940785] < 0) {
                     if(var3 == -1918213836) {
                        return;
                     }

                     var1.field_85.method_2074(-1);
                  }

                  var2 = -576530835 * var1.field_80 / var4;
               }
            }
         }

         var1.field_85.method_1933(var2);
      } catch (RuntimeException var6) {
         throw class_223.method_4281(var6, "ih.n(" + ')');
      }
   }

   // $FF: renamed from: i () bm
   protected class_104 method_1937() {
      class_36 var1 = (class_36)this.field_1210.method_5944();
      return (class_104)(null == var1?null:(var1.field_85 != null?var1.field_85:this.method_1947()));
   }

   // $FF: renamed from: <init> (hp) void
   void method_1956(class_106 var1) {
      try {
         super.method_105();
         class_335 var10001 = new class_335;
         var10001.method_5960();
         this.field_1210 = var10001;
         class_108 var3 = new class_108;
         var3.method_105();
         this.field_1211 = var3;
         this.field_1212 = var1;
      } catch (RuntimeException var2) {
         throw class_223.method_4281(var2, "ih.<init>(" + ')');
      }
   }

   // $FF: renamed from: al () int
   protected int method_1941() {
      return 0;
   }

   // $FF: renamed from: ab () int
   protected int method_1942() {
      return 0;
   }

   // $FF: renamed from: ad () int
   protected int method_1944() {
      return 0;
   }

   // $FF: renamed from: b () int
   protected int method_1935() {
      try {
         return 0;
      } catch (RuntimeException var1) {
         throw class_223.method_4281(var1, "ih.b(" + ')');
      }
   }

   // $FF: renamed from: ap () bm
   protected class_104 method_1934() {
      class_36 var1;
      do {
         var1 = (class_36)this.field_1210.method_5972();
         if(var1 == null) {
            return null;
         }
      } while(null == var1.field_85);

      return var1.field_85;
   }

   // $FF: renamed from: ai (int[], int, int) void
   protected void method_1945(int[] var1, int var2, int var3) {
      this.field_1211.method_1943(var1, var2, var3);

      for(class_36 var6 = (class_36)this.field_1210.method_5944(); var6 != null; var6 = (class_36)this.field_1210.method_5972()) {
         if(!this.field_1212.method_1992(var6, (byte)-6)) {
            int var4 = var2;
            int var5 = var3;

            do {
               if(var5 <= 730487289 * var6.field_67) {
                  this.method_1954(var6, var1, var4, var5, var4 + var5, (short)7709);
                  var6.field_67 -= -2059069367 * var5;
                  break;
               }

               this.method_1954(var6, var1, var4, 730487289 * var6.field_67, var5 + var4, (short)3325);
               var4 += 730487289 * var6.field_67;
               var5 -= var6.field_67 * 730487289;
            } while(!this.field_1212.method_1993(var6, var1, var4, var5, -1491448117));
         }
      }

   }

   // $FF: renamed from: f (iq, int[], int, int, int) void
   void method_1957(class_36 var1, int[] var2, int var3, int var4, int var5) {
      if(0 != (this.field_1212.field_1226[-1025207361 * var1.field_81] & 4) && 1951740649 * var1.field_71 < 0) {
         int var6 = this.field_1212.field_1231[var1.field_81 * -1025207361] / (-888257726 * class_139.field_1793);

         while(true) {
            int var7 = (var6 + 1048575 - -576530835 * var1.field_80) / var6;
            if(var7 > var4) {
               var1.field_80 += 1692574565 * var4 * var6;
               break;
            }

            var1.field_85.method_1943(var2, var3, var7);
            var3 += var7;
            var4 -= var7;
            var1.field_80 += (var6 * var7 - 1048576) * 1692574565;
            int var8 = class_139.field_1793 * 1631160541 / -1159170570;
            int var9 = -928286476 / var6;
            if(var9 < var8) {
               var8 = var9;
            }

            class_107 var10 = var1.field_85;
            if(0 == this.field_1212.field_1216[-702567433 * var1.field_81]) {
               var1.field_85 = class_107.method_2072(var1.field_86, var10.method_2085(), var10.method_2126(), var10.method_2183());
            } else {
               var1.field_85 = class_107.method_2072(var1.field_86, var10.method_2085(), 0, var10.method_2183());
               this.field_1212.method_1974(var1, var1.field_68.field_252[var1.field_72 * -723940785] < 0, (byte)-39);
               var1.field_85.method_2082(var8, var10.method_2126());
            }

            if(var1.field_68.field_252[var1.field_72 * 393648763] < 0) {
               var1.field_85.method_2074(-1);
            }

            var10.method_2083(var8);
            var10.method_1943(var2, var3, var5 - var3);
            if(var10.method_2087()) {
               this.field_1211.method_2198(var10);
            }
         }
      }

      var1.field_85.method_1943(var2, var3, var4);
   }

   // $FF: renamed from: aj (int) void
   protected void method_1950(int var1) {
      this.field_1211.method_1933(var1);

      for(class_36 var3 = (class_36)this.field_1210.method_5944(); var3 != null; var3 = (class_36)this.field_1210.method_5972()) {
         if(!this.field_1212.method_1992(var3, (byte)9)) {
            int var2 = var1;

            do {
               if(var2 <= var3.field_67 * 856197992) {
                  this.method_1955(var3, var2, 141000050);
                  var3.field_67 -= -2057571944 * var2;
                  break;
               }

               this.method_1955(var3, 876833600 * var3.field_67, -476931530);
               var2 -= var3.field_67 * 315444762;
            } while(!this.field_1212.method_1993(var3, (int[])null, 0, var2, -1656962052));
         }
      }

   }

   // $FF: renamed from: am (int) void
   protected void method_1948(int var1) {
      this.field_1211.method_1933(var1);

      for(class_36 var3 = (class_36)this.field_1210.method_5944(); var3 != null; var3 = (class_36)this.field_1210.method_5972()) {
         if(!this.field_1212.method_1992(var3, (byte)54)) {
            int var2 = var1;

            do {
               if(var2 <= var3.field_67 * 730487289) {
                  this.method_1955(var3, var2, 12405373);
                  var3.field_67 -= -2059069367 * var2;
                  break;
               }

               this.method_1955(var3, 730487289 * var3.field_67, 466613692);
               var2 -= var3.field_67 * 730487289;
            } while(!this.field_1212.method_1993(var3, (int[])null, 0, var2, -1631035612));
         }
      }

   }

   // $FF: renamed from: az (int) void
   protected void method_1949(int var1) {
      this.field_1211.method_1933(var1);

      for(class_36 var3 = (class_36)this.field_1210.method_5944(); var3 != null; var3 = (class_36)this.field_1210.method_5972()) {
         if(!this.field_1212.method_1992(var3, (byte)35)) {
            int var2 = var1;

            do {
               if(var2 <= var3.field_67 * 730487289) {
                  this.method_1955(var3, var2, -356505047);
                  var3.field_67 -= -2059069367 * var2;
                  break;
               }

               this.method_1955(var3, 730487289 * var3.field_67, -1471764400);
               var2 -= var3.field_67 * 730487289;
            } while(!this.field_1212.method_1993(var3, (int[])null, 0, var2, -1941214853));
         }
      }

   }

   // $FF: renamed from: q () bm
   protected class_104 method_1938() {
      class_36 var1 = (class_36)this.field_1210.method_5944();
      return (class_104)(null == var1?null:(var1.field_85 != null?var1.field_85:this.method_1947()));
   }

   // $FF: renamed from: y (iq, int[], int, int, int) void
   void method_1958(class_36 var1, int[] var2, int var3, int var4, int var5) {
      if(0 != (this.field_1212.field_1226[-1025207361 * var1.field_81] & 4) && 1951740649 * var1.field_71 < 0) {
         int var6 = this.field_1212.field_1231[var1.field_81 * -1025207361] / (1631160541 * class_139.field_1793);

         while(true) {
            int var7 = (var6 + 1048575 - -576530835 * var1.field_80) / var6;
            if(var7 > var4) {
               var1.field_80 += 1692574565 * var4 * var6;
               break;
            }

            var1.field_85.method_1943(var2, var3, var7);
            var3 += var7;
            var4 -= var7;
            var1.field_80 += (var6 * var7 - 1048576) * 1692574565;
            int var8 = class_139.field_1793 * 1631160541 / 100;
            int var9 = 262144 / var6;
            if(var9 < var8) {
               var8 = var9;
            }

            class_107 var10 = var1.field_85;
            if(0 == this.field_1212.field_1216[-1025207361 * var1.field_81]) {
               var1.field_85 = class_107.method_2072(var1.field_86, var10.method_2085(), var10.method_2126(), var10.method_2183());
            } else {
               var1.field_85 = class_107.method_2072(var1.field_86, var10.method_2085(), 0, var10.method_2183());
               this.field_1212.method_1974(var1, var1.field_68.field_252[var1.field_72 * -723940785] < 0, (byte)-51);
               var1.field_85.method_2082(var8, var10.method_2126());
            }

            if(var1.field_68.field_252[var1.field_72 * -723940785] < 0) {
               var1.field_85.method_2074(-1);
            }

            var10.method_2083(var8);
            var10.method_1943(var2, var3, var5 - var3);
            if(var10.method_2087()) {
               this.field_1211.method_2198(var10);
            }
         }
      }

      var1.field_85.method_1943(var2, var3, var4);
   }

   // $FF: renamed from: p (iq, int) void
   void method_1959(class_36 var1, int var2) {
      if(0 != (this.field_1212.field_1226[-1247183542 * var1.field_81] & 4) && 1951740649 * var1.field_71 < 0) {
         int var3 = this.field_1212.field_1231[var1.field_81 * -1952087731] / (class_139.field_1793 * 759107453);
         int var4 = (1048575 + var3 - -1826857511 * var1.field_80) / var3;
         var1.field_80 = (var3 * var2 + var1.field_80 * -576530835 & 1811671200) * 1692574565;
         if(var4 <= var2) {
            if(0 == this.field_1212.field_1216[-1025207361 * var1.field_81]) {
               var1.field_85 = class_107.method_2072(var1.field_86, var1.field_85.method_2085(), var1.field_85.method_2126(), var1.field_85.method_2183());
            } else {
               var1.field_85 = class_107.method_2072(var1.field_86, var1.field_85.method_2085(), 0, var1.field_85.method_2183());
               this.field_1212.method_1974(var1, var1.field_68.field_252[-723940785 * var1.field_72] < 0, (byte)-42);
            }

            if(var1.field_68.field_252[var1.field_72 * 1080191754] < 0) {
               var1.field_85.method_2074(-1);
            }

            var2 = 773165478 * var1.field_80 / var3;
         }
      }

      var1.field_85.method_1933(var2);
   }

   // $FF: renamed from: f (char, byte) char
   static char method_1960(char var0, byte var1) {
      try {
         if(var0 == 198) {
            if(var1 >= 0) {
               throw new IllegalStateException();
            } else {
               return 'E';
            }
         } else if(var0 == 230) {
            return 'e';
         } else if(223 == var0) {
            if(var1 >= 0) {
               throw new IllegalStateException();
            } else {
               return 's';
            }
         } else if(338 == var0) {
            if(var1 >= 0) {
               throw new IllegalStateException();
            } else {
               return 'E';
            }
         } else if(339 == var0) {
            if(var1 >= 0) {
               throw new IllegalStateException();
            } else {
               return 'e';
            }
         } else {
            return '\u0000';
         }
      } catch (RuntimeException var2) {
         throw class_223.method_4281(var2, "ih.f(" + ')');
      }
   }
}
