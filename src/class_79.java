
// $FF: renamed from: er
public class class_79 extends class_59 {

   // $FF: renamed from: s java.lang.String[]
   public String[] field_687;
   // $FF: renamed from: n hz
   static class_272 field_688;
   // $FF: renamed from: p java.lang.String
   public String field_689;
   // $FF: renamed from: v jv
   static class_306 field_690;
   // $FF: renamed from: y char
   public char field_691;
   // $FF: renamed from: j int
   public int field_692;
   // $FF: renamed from: r int
   public int field_693;
   // $FF: renamed from: b int[]
   public int[] field_694;
   // $FF: renamed from: d int[]
   public int[] field_695;
   // $FF: renamed from: f char
   public char field_696;


   // $FF: renamed from: p (int) int
   public int method_1240() {
      try {
         return this.field_693 * -2113237229;
      } catch (RuntimeException var2) {
         throw class_223.method_4281(var2);
      }
   }

   // $FF: renamed from: f (nd, int) void
   void method_1241(class_28 var1, int var2) {
      try {
         while(true) {
            int var3 = var1.method_130();
            if(0 == var3) {
               if(var2 == -1529946437) {
                  throw new IllegalStateException();
               }

               return;
            }

            this.method_1248(var1, var3, (byte)-60);
         }
      } catch (RuntimeException var4) {
         throw class_223.method_4281(var4);
      }
   }

   // $FF: renamed from: <init> () void
   class_79() {
      super();
      try {
         this.field_689 = class_305.field_3410;
         this.field_693 = 0;
      } catch (RuntimeException var1) {
         throw class_223.method_4281(var1);
      }
   }

   // $FF: renamed from: g (nd, int) void
   void method_1242(class_28 var1, int var2) {
      if(1 == var2) {
         this.field_696 = (char)var1.method_130();
      } else if(var2 == 2) {
         this.field_691 = (char)var1.method_130();
      } else if(3 == var2) {
         this.field_689 = var1.method_139(-391631059);
      } else if(var2 == 4) {
         this.field_692 = var1.method_135() * -1084945299;
      } else {
         int var3;
         if(var2 == 5) {
            this.field_693 = var1.method_132() * 1555665691;
            this.field_694 = new int[-2113237229 * this.field_693];
            this.field_687 = new String[this.field_693 * -2113237229];

            for(var3 = 0; var3 < -2113237229 * this.field_693; ++var3) {
               this.field_694[var3] = var1.method_135();
               this.field_687[var3] = var1.method_139(-391631059);
            }
         } else if(var2 == 6) {
            this.field_693 = var1.method_132() * 1555665691;
            this.field_694 = new int[this.field_693 * -2113237229];
            this.field_695 = new int[this.field_693 * -2113237229];

            for(var3 = 0; var3 < -2113237229 * this.field_693; ++var3) {
               this.field_694[var3] = var1.method_135();
               this.field_695[var3] = var1.method_135();
            }
         }
      }

   }

   // $FF: renamed from: <clinit> () void
   static {
      class_272 var10000 = new class_272(64);
      field_688 = var10000;
   }

   // $FF: renamed from: j (jv) void
   public static void method_1244(class_306 var0) {
      field_690 = var0;
   }

   // $FF: renamed from: r (jv) void
   public static void method_1245(class_306 var0) {
      field_690 = var0;
   }

   // $FF: renamed from: b (jv) void
   public static void method_1246(class_306 var0) {
      field_690 = var0;
   }

   // $FF: renamed from: d (nd) void
   void method_1247(class_28 var1) {
      while(true) {
         int var2 = var1.method_130();
         if(0 == var2) {
            return;
         }

         this.method_1248(var1, var2, (byte)16);
      }
   }

   // $FF: renamed from: y (nd, int, byte) void
   void method_1248(class_28 var1, int var2, byte var3) {
      try {
         if(1 == var2) {
            if(var3 == 1) {
               throw new IllegalStateException();
            }

            this.field_696 = (char)var1.method_130();
         } else if(var2 == 2) {
            if(var3 == 1) {
               return;
            }

            this.field_691 = (char)var1.method_130();
         } else if(3 == var2) {
            if(var3 == 1) {
               throw new IllegalStateException();
            }

            this.field_689 = var1.method_139(-391631059);
         } else if(var2 == 4) {
            this.field_692 = var1.method_135() * -1084945299;
         } else {
            int var4;
            if(var2 == 5) {
               if(var3 == 1) {
                  throw new IllegalStateException();
               }

               this.field_693 = var1.method_132() * 1555665691;
               this.field_694 = new int[-2113237229 * this.field_693];
               this.field_687 = new String[this.field_693 * -2113237229];

               for(var4 = 0; var4 < -2113237229 * this.field_693; ++var4) {
                  if(var3 == 1) {
                     throw new IllegalStateException();
                  }

                  this.field_694[var4] = var1.method_135();
                  this.field_687[var4] = var1.method_139(-391631059);
               }
            } else if(var2 == 6) {
               if(var3 == 1) {
                  throw new IllegalStateException();
               }

               this.field_693 = var1.method_132() * 1555665691;
               this.field_694 = new int[this.field_693 * -2113237229];
               this.field_695 = new int[this.field_693 * -2113237229];

               for(var4 = 0; var4 < -2113237229 * this.field_693; ++var4) {
                  this.field_694[var4] = var1.method_135();
                  this.field_695[var4] = var1.method_135();
               }
            }
         }

      } catch (RuntimeException var5) {
         throw class_223.method_4281(var5);
      }
   }

   // $FF: renamed from: l (nd) void
   void method_1249(class_28 var1) {
      while(true) {
         int var2 = var1.method_130();
         if(0 == var2) {
            return;
         }

         this.method_1248(var1, var2, (byte)-90);
      }
   }

   // $FF: renamed from: s (nd) void
   void method_1250(class_28 var1) {
      while(true) {
         int var2 = var1.method_130();
         if(0 == var2) {
            return;
         }

         this.method_1248(var1, var2, (byte)-1);
      }
   }

   // $FF: renamed from: o (nd, int) void
   void method_1251(class_28 var1, int var2) {
      if(1 == var2) {
         this.field_696 = (char)var1.method_130();
      } else if(var2 == 2) {
         this.field_691 = (char)var1.method_130();
      } else if(3 == var2) {
         this.field_689 = var1.method_139(-391631059);
      } else if(var2 == 4) {
         this.field_692 = var1.method_135() * -1084945299;
      } else {
         int var3;
         if(var2 == 5) {
            this.field_693 = var1.method_132() * 1555665691;
            this.field_694 = new int[-2113237229 * this.field_693];
            this.field_687 = new String[this.field_693 * -2113237229];

            for(var3 = 0; var3 < -2113237229 * this.field_693; ++var3) {
               this.field_694[var3] = var1.method_135();
               this.field_687[var3] = var1.method_139(-391631059);
            }
         } else if(var2 == 6) {
            this.field_693 = var1.method_132() * 1555665691;
            this.field_694 = new int[this.field_693 * -2113237229];
            this.field_695 = new int[this.field_693 * -2113237229];

            for(var3 = 0; var3 < -2113237229 * this.field_693; ++var3) {
               this.field_694[var3] = var1.method_135();
               this.field_695[var3] = var1.method_135();
            }
         }
      }

   }

   // $FF: renamed from: c (nd, int) void
   void method_1252(class_28 var1, int var2) {
      if(1 == var2) {
         this.field_696 = (char)var1.method_130();
      } else if(var2 == 2) {
         this.field_691 = (char)var1.method_130();
      } else if(3 == var2) {
         this.field_689 = var1.method_139(-391631059);
      } else if(var2 == 4) {
         this.field_692 = var1.method_135() * -1084945299;
      } else {
         int var3;
         if(var2 == 5) {
            this.field_693 = var1.method_132() * 1555665691;
            this.field_694 = new int[-2113237229 * this.field_693];
            this.field_687 = new String[this.field_693 * -2113237229];

            for(var3 = 0; var3 < -2113237229 * this.field_693; ++var3) {
               this.field_694[var3] = var1.method_135();
               this.field_687[var3] = var1.method_139(-391631059);
            }
         } else if(var2 == 6) {
            this.field_693 = var1.method_132() * 1555665691;
            this.field_694 = new int[this.field_693 * -2113237229];
            this.field_695 = new int[this.field_693 * -2113237229];

            for(var3 = 0; var3 < -2113237229 * this.field_693; ++var3) {
               this.field_694[var3] = var1.method_135();
               this.field_695[var3] = var1.method_135();
            }
         }
      }

   }

   // $FF: renamed from: e (nd, int) void
   void method_1253(class_28 var1, int var2) {
      if(1 == var2) {
         this.field_696 = (char)var1.method_130();
      } else if(var2 == 2) {
         this.field_691 = (char)var1.method_130();
      } else if(3 == var2) {
         this.field_689 = var1.method_139(-391631059);
      } else if(var2 == 4) {
         this.field_692 = var1.method_135() * 1794243031;
      } else {
         int var3;
         if(var2 == 5) {
            this.field_693 = var1.method_132() * 684257681;
            this.field_694 = new int[-2113237229 * this.field_693];
            this.field_687 = new String[this.field_693 * 223195537];

            for(var3 = 0; var3 < 1108020597 * this.field_693; ++var3) {
               this.field_694[var3] = var1.method_135();
               this.field_687[var3] = var1.method_139(-391631059);
            }
         } else if(var2 == 6) {
            this.field_693 = var1.method_132() * 1910502704;
            this.field_694 = new int[this.field_693 * -2113237229];
            this.field_695 = new int[this.field_693 * 982270869];

            for(var3 = 0; var3 < -1343904899 * this.field_693; ++var3) {
               this.field_694[var3] = var1.method_135();
               this.field_695[var3] = var1.method_135();
            }
         }
      }

   }

   // $FF: renamed from: u (nd) void
   void method_1254(class_28 var1) {
      while(true) {
         int var2 = var1.method_130();
         if(0 == var2) {
            return;
         }

         this.method_1248(var1, var2, (byte)-18);
      }
   }

   // $FF: renamed from: a () int
   public int method_1255() {
      return this.field_693 * -2113237229;
   }

   // $FF: renamed from: k () int
   public int method_1256() {
      return this.field_693 * -2113237229;
   }

   // $FF: renamed from: j (jv, java.lang.String, java.lang.String, int) op
   public static class_66 method_1257(class_306 var0, String var1, String var2) {
      try {
         int var4 = var0.method_5399(var1);
         int var5 = var0.method_5400(var4, var2);
         return class_277.method_5140(var0, var4, var5, 1690865732);
      } catch (RuntimeException var6) {
         throw class_223.method_4281(var6);
      }
   }
}
