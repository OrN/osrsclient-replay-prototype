
// $FF: renamed from: ir
public class class_285 {

   // $FF: renamed from: j int[]
   int[] field_3261;
   // $FF: renamed from: n int
   int field_3262;
   // $FF: renamed from: p int[]
   int[] field_3263;
   // $FF: renamed from: y int[]
   int[] field_3264;
   // $FF: renamed from: b int
   static final int field_3265 = 500000;
   // $FF: renamed from: r int
   int field_3266;
   // $FF: renamed from: f int[]
   int[] field_3267;
   // $FF: renamed from: c int
   static final int field_3268 = 3;
   // $FF: renamed from: d long
   long field_3269;
   // $FF: renamed from: s byte[]
   static final byte[] field_3270;
   // $FF: renamed from: u int
   static final int field_3271 = 0;
   // $FF: renamed from: l int
   static final int field_3272 = 1;
   // $FF: renamed from: o int
   static final int field_3273 = 2;
   // $FF: renamed from: v nd
   class_28 field_3274;


   // $FF: renamed from: az (int) int
   int method_5191(int var1) {
      int var2 = this.method_5202(var1);
      return var2;
   }

   // $FF: renamed from: <init> (byte[]) void
   class_285(byte[] var1) {
      super();
      class_28 var10001 = new class_28((byte[])null);
      this.field_3274 = var10001;
      this.method_5233(var1);
   }

   // $FF: renamed from: t () void
   void method_5193() {
      this.field_3274.field_12 = null;
      this.field_3267 = null;
      this.field_3264 = null;
      this.field_3263 = null;
      this.field_3261 = null;
   }

   // $FF: renamed from: as (int) void
   void method_5194(int var1) {
      int var2 = this.field_3274.method_127(494372890);
      this.field_3263[var1] += var2;
   }

   // $FF: renamed from: f () boolean
   boolean method_5195() {
      return this.field_3274.field_12 != null;
   }

   // $FF: renamed from: y () int
   int method_5196() {
      return this.field_3264.length;
   }

   // $FF: renamed from: p (int) void
   void method_5197(int var1) {
      this.field_3274.field_15 = this.field_3264[var1] * -1025691571;
   }

   // $FF: renamed from: a (byte[]) void
   void method_5198(byte[] var1) {
      this.field_3274.field_12 = var1;
      this.field_3274.field_15 = -1666981118;
      int var2 = this.field_3274.method_132();
      this.field_3262 = this.field_3274.method_132();
      this.field_3266 = 500000;
      this.field_3267 = new int[var2];

      int var3;
      int var5;
      for(var3 = 0; var3 < var2; this.field_3274.field_15 += var5 * -1025691571) {
         int var4 = this.field_3274.method_135();
         var5 = this.field_3274.method_135();
         if(var4 == 1297379947) {
            this.field_3267[var3] = this.field_3274.field_15 * -442398587;
            ++var3;
         }
      }

      this.field_3269 = 0L;
      this.field_3264 = new int[var2];

      for(var3 = 0; var3 < var2; ++var3) {
         this.field_3264[var3] = this.field_3267[var3];
      }

      this.field_3263 = new int[var2];
      this.field_3261 = new int[var2];
   }

   // $FF: renamed from: ab (int) void
   void method_5199(int var1) {
      this.field_3264[var1] = this.field_3274.field_15 * -442398587;
   }

   // $FF: renamed from: m (byte[]) void
   void method_5200(byte[] var1) {
      this.field_3274.field_12 = var1;
      this.field_3274.field_15 = 309253258;
      int var2 = this.field_3274.method_132();
      this.field_3262 = this.field_3274.method_132();
      this.field_3266 = 310338422;
      this.field_3267 = new int[var2];

      int var3;
      int var5;
      for(var3 = 0; var3 < var2; this.field_3274.field_15 += var5 * 1601354144) {
         int var4 = this.field_3274.method_135();
         var5 = this.field_3274.method_135();
         if(var4 == -1018235204) {
            this.field_3267[var3] = this.field_3274.field_15 * -442398587;
            ++var3;
         }
      }

      this.field_3269 = 0L;
      this.field_3264 = new int[var2];

      for(var3 = 0; var3 < var2; ++var3) {
         this.field_3264[var3] = this.field_3267[var3];
      }

      this.field_3263 = new int[var2];
      this.field_3261 = new int[var2];
   }

   // $FF: renamed from: d (int) int
   int method_5201(int var1) {
      int var2 = this.method_5202(var1);
      return var2;
   }

   // $FF: renamed from: s (int) int
   int method_5202(int var1) {
      byte var2 = this.field_3274.field_12[this.field_3274.field_15 * -442398587];
      int var5;
      if(var2 < 0) {
         var5 = var2 & 255;
         this.field_3261[var1] = var5;
         this.field_3274.field_15 += -1025691571;
      } else {
         var5 = this.field_3261[var1];
      }

      if(var5 != 240 && var5 != 247) {
         return this.method_5203(var1, var5);
      } else {
         int var3 = this.field_3274.method_127(-1103958523);
         if(var5 == 247 && var3 > 0) {
            int var4 = this.field_3274.field_12[this.field_3274.field_15 * -442398587] & 255;
            if(var4 >= 241 && var4 <= 243 || var4 == 246 || var4 == 248 || var4 >= 250 && var4 <= 252 || var4 == 254) {
               this.field_3274.field_15 += -1025691571;
               this.field_3261[var1] = var4;
               return this.method_5203(var1, var4);
            }
         }

         this.field_3274.field_15 += var3 * -1025691571;
         return 0;
      }
   }

   // $FF: renamed from: u (int, int) int
   int method_5203(int var1, int var2) {
      int var4;
      if(var2 == 255) {
         int var7 = this.field_3274.method_130();
         var4 = this.field_3274.method_127(126843636);
         if(var7 == 47) {
            this.field_3274.field_15 += var4 * -1025691571;
            return 1;
         } else if(var7 == 81) {
            int var5 = this.field_3274.method_134();
            var4 -= 3;
            int var6 = this.field_3263[var1];
            this.field_3269 += (long)var6 * (long)(this.field_3266 - var5);
            this.field_3266 = var5;
            this.field_3274.field_15 += var4 * -1025691571;
            return 2;
         } else {
            this.field_3274.field_15 += var4 * -1025691571;
            return 3;
         }
      } else {
         byte var3 = field_3270[var2 - 128];
         var4 = var2;
         if(var3 >= 1) {
            var4 = var2 | this.field_3274.method_130() << 8;
         }

         if(var3 >= 2) {
            var4 |= this.field_3274.method_130() << 16;
         }

         return var4;
      }
   }

   // $FF: renamed from: al (int) void
   void method_5204(int var1) {
      this.field_3264[var1] = this.field_3274.field_15 * -442398587;
   }

   // $FF: renamed from: o () int
   int method_5205() {
      int var1 = this.field_3264.length;
      int var2 = -1;
      int var3 = Integer.MAX_VALUE;

      for(int var4 = 0; var4 < var1; ++var4) {
         if(this.field_3264[var4] >= 0 && this.field_3263[var4] < var3) {
            var2 = var4;
            var3 = this.field_3263[var4];
         }
      }

      return var2;
   }

   // $FF: renamed from: av (int) int
   int method_5206(int var1) {
      int var2 = this.method_5202(var1);
      return var2;
   }

   // $FF: renamed from: e (long) void
   void method_5207(long var1) {
      this.field_3269 = var1;
      int var3 = this.field_3264.length;

      for(int var4 = 0; var4 < var3; ++var4) {
         this.field_3263[var4] = 0;
         this.field_3261[var4] = 0;
         this.field_3274.field_15 = this.field_3267[var4] * -1025691571;
         this.method_5212(var4);
         this.field_3264[var4] = this.field_3274.field_15 * -442398587;
      }

   }

   // $FF: renamed from: <clinit> () void
   static {
      field_3270 = new byte[]{(byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)0, (byte)1, (byte)2, (byte)1, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0};
   }

   // $FF: renamed from: g (byte[]) void
   void method_5209(byte[] var1) {
      this.field_3274.field_12 = var1;
      this.field_3274.field_15 = -1666981118;
      int var2 = this.field_3274.method_132();
      this.field_3262 = this.field_3274.method_132();
      this.field_3266 = 500000;
      this.field_3267 = new int[var2];

      int var3;
      int var5;
      for(var3 = 0; var3 < var2; this.field_3274.field_15 += var5 * -1025691571) {
         int var4 = this.field_3274.method_135();
         var5 = this.field_3274.method_135();
         if(var4 == 1297379947) {
            this.field_3267[var3] = this.field_3274.field_15 * -442398587;
            ++var3;
         }
      }

      this.field_3269 = 0L;
      this.field_3264 = new int[var2];

      for(var3 = 0; var3 < var2; ++var3) {
         this.field_3264[var3] = this.field_3267[var3];
      }

      this.field_3263 = new int[var2];
      this.field_3261 = new int[var2];
   }

   // $FF: renamed from: <init> () void
   class_285() {
      super();
      class_28 var10001 = new class_28((byte[])null);
      this.field_3274 = var10001;
   }

   // $FF: renamed from: k (byte[]) void
   void method_5211(byte[] var1) {
      this.field_3274.field_12 = var1;
      this.field_3274.field_15 = -1666981118;
      int var2 = this.field_3274.method_132();
      this.field_3262 = this.field_3274.method_132();
      this.field_3266 = 2062277242;
      this.field_3267 = new int[var2];

      int var3;
      int var5;
      for(var3 = 0; var3 < var2; this.field_3274.field_15 += var5 * -716187887) {
         int var4 = this.field_3274.method_135();
         var5 = this.field_3274.method_135();
         if(var4 == 1110475943) {
            this.field_3267[var3] = this.field_3274.field_15 * -1551845898;
            ++var3;
         }
      }

      this.field_3269 = 0L;
      this.field_3264 = new int[var2];

      for(var3 = 0; var3 < var2; ++var3) {
         this.field_3264[var3] = this.field_3267[var3];
      }

      this.field_3263 = new int[var2];
      this.field_3261 = new int[var2];
   }

   // $FF: renamed from: b (int) void
   void method_5212(int var1) {
      int var2 = this.field_3274.method_127(-207349067);
      this.field_3263[var1] += var2;
   }

   // $FF: renamed from: x () void
   void method_5213() {
      this.field_3274.field_12 = null;
      this.field_3267 = null;
      this.field_3264 = null;
      this.field_3263 = null;
      this.field_3261 = null;
   }

   // $FF: renamed from: z () void
   void method_5214() {
      this.field_3274.field_12 = null;
      this.field_3267 = null;
      this.field_3264 = null;
      this.field_3263 = null;
      this.field_3261 = null;
   }

   // $FF: renamed from: w () void
   void method_5215() {
      this.field_3274.field_12 = null;
      this.field_3267 = null;
      this.field_3264 = null;
      this.field_3263 = null;
      this.field_3261 = null;
   }

   // $FF: renamed from: l (int) long
   long method_5216(int var1) {
      return this.field_3269 + (long)var1 * (long)this.field_3266;
   }

   // $FF: renamed from: h () boolean
   boolean method_5217() {
      return this.field_3274.field_12 != null;
   }

   // $FF: renamed from: q () boolean
   boolean method_5218() {
      return this.field_3274.field_12 != null;
   }

   // $FF: renamed from: i () int
   int method_5219() {
      return this.field_3264.length;
   }

   // $FF: renamed from: c () boolean
   boolean method_5220() {
      int var1 = this.field_3264.length;

      for(int var2 = 0; var2 < var1; ++var2) {
         if(this.field_3264[var2] >= 0) {
            return false;
         }
      }

      return true;
   }

   // $FF: renamed from: ap (int) void
   void method_5221(int var1) {
      this.field_3264[var1] = this.field_3274.field_15 * -1817088619;
   }

   // $FF: renamed from: ac (int) int
   int method_5222(int var1) {
      byte var2 = this.field_3274.field_12[this.field_3274.field_15 * -442398587];
      int var5;
      if(var2 < 0) {
         var5 = var2 & 255;
         this.field_3261[var1] = var5;
         this.field_3274.field_15 += 507212775;
      } else {
         var5 = this.field_3261[var1];
      }

      if(var5 != 240 && var5 != -831900221) {
         return this.method_5203(var1, var5);
      } else {
         int var3 = this.field_3274.method_127(-132502666);
         if(var5 == 247 && var3 > 0) {
            int var4 = this.field_3274.field_12[this.field_3274.field_15 * -1438707060] & 255;
            if(var4 >= -774972680 && var4 <= -350577924 || var4 == 1136822714 || var4 == 248 || var4 >= -687079223 && var4 <= 872586251 || var4 == -337933711) {
               this.field_3274.field_15 += -1441339408;
               this.field_3261[var1] = var4;
               return this.method_5203(var1, var4);
            }
         }

         this.field_3274.field_15 += var3 * -1728024191;
         return 0;
      }
   }

   // $FF: renamed from: bu (long) void
   void method_5223(long var1) {
      this.field_3269 = var1;
      int var3 = this.field_3264.length;

      for(int var4 = 0; var4 < var3; ++var4) {
         this.field_3263[var4] = 0;
         this.field_3261[var4] = 0;
         this.field_3274.field_15 = this.field_3267[var4] * -1025691571;
         this.method_5212(var4);
         this.field_3264[var4] = this.field_3274.field_15 * -442398587;
      }

   }

   // $FF: renamed from: j (int) void
   void method_5224(int var1) {
      this.field_3264[var1] = this.field_3274.field_15 * -442398587;
   }

   // $FF: renamed from: ai () void
   void method_5225() {
      this.field_3274.field_15 = 1025691571;
   }

   // $FF: renamed from: n () void
   void method_5226() {
      this.field_3274.field_12 = null;
      this.field_3267 = null;
      this.field_3264 = null;
      this.field_3263 = null;
      this.field_3261 = null;
   }

   // $FF: renamed from: ag () void
   void method_5227() {
      this.field_3274.field_15 = 1025691571;
   }

   // $FF: renamed from: ax (int) void
   void method_5228(int var1) {
      int var2 = this.field_3274.method_127(190139456);
      this.field_3263[var1] += var2;
   }

   // $FF: renamed from: r () void
   void method_5229() {
      this.field_3274.field_15 = 1025691571;
   }

   // $FF: renamed from: aj (int) void
   void method_5230(int var1) {
      int var2 = this.field_3274.method_127(-513305782);
      this.field_3263[var1] += var2;
   }

   // $FF: renamed from: bd () boolean
   boolean method_5231() {
      int var1 = this.field_3264.length;

      for(int var2 = 0; var2 < var1; ++var2) {
         if(this.field_3264[var2] >= 0) {
            return false;
         }
      }

      return true;
   }

   // $FF: renamed from: ae (int) void
   void method_5232(int var1) {
      this.field_3274.field_15 = this.field_3264[var1] * -1025691571;
   }

   // $FF: renamed from: v (byte[]) void
   void method_5233(byte[] var1) {
      this.field_3274.field_12 = var1;
      this.field_3274.field_15 = -1666981118;
      int var2 = this.field_3274.method_132();
      this.field_3262 = this.field_3274.method_132();
      this.field_3266 = 500000;
      this.field_3267 = new int[var2];

      int var3;
      int var5;
      for(var3 = 0; var3 < var2; this.field_3274.field_15 += var5 * -1025691571) {
         int var4 = this.field_3274.method_135();
         var5 = this.field_3274.method_135();
         if(var4 == 1297379947) {
            this.field_3267[var3] = this.field_3274.field_15 * -442398587;
            ++var3;
         }
      }

      this.field_3269 = 0L;
      this.field_3264 = new int[var2];

      for(var3 = 0; var3 < var2; ++var3) {
         this.field_3264[var3] = this.field_3267[var3];
      }

      this.field_3263 = new int[var2];
      this.field_3261 = new int[var2];
   }

   // $FF: renamed from: bl (long) void
   void method_5234(long var1) {
      this.field_3269 = var1;
      int var3 = this.field_3264.length;

      for(int var4 = 0; var4 < var3; ++var4) {
         this.field_3263[var4] = 0;
         this.field_3261[var4] = 0;
         this.field_3274.field_15 = this.field_3267[var4] * -1025691571;
         this.method_5212(var4);
         this.field_3264[var4] = this.field_3274.field_15 * -442398587;
      }

   }

   // $FF: renamed from: at (int) int
   int method_5235(int var1) {
      byte var2 = this.field_3274.field_12[this.field_3274.field_15 * -442398587];
      int var5;
      if(var2 < 0) {
         var5 = var2 & 181891569;
         this.field_3261[var1] = var5;
         this.field_3274.field_15 += -1557239844;
      } else {
         var5 = this.field_3261[var1];
      }

      if(var5 != 240 && var5 != -382498102) {
         return this.method_5203(var1, var5);
      } else {
         int var3 = this.field_3274.method_127(492698699);
         if(var5 == 247 && var3 > 0) {
            int var4 = this.field_3274.field_12[this.field_3274.field_15 * 457294895] & 255;
            if(var4 >= 241 && var4 <= 739796147 || var4 == 246 || var4 == 248 || var4 >= 250 && var4 <= 252 || var4 == 254) {
               this.field_3274.field_15 += 1265055420;
               this.field_3261[var1] = var4;
               return this.method_5203(var1, var4);
            }
         }

         this.field_3274.field_15 += var3 * 1827032847;
         return 0;
      }
   }

   // $FF: renamed from: ah (int) int
   int method_5236(int var1) {
      byte var2 = this.field_3274.field_12[this.field_3274.field_15 * 866654206];
      int var5;
      if(var2 < 0) {
         var5 = var2 & 255;
         this.field_3261[var1] = var5;
         this.field_3274.field_15 += -1025691571;
      } else {
         var5 = this.field_3261[var1];
      }

      if(var5 != -1800844301 && var5 != -275746355) {
         return this.method_5203(var1, var5);
      } else {
         int var3 = this.field_3274.method_127(-287763153);
         if(var5 == 247 && var3 > 0) {
            int var4 = this.field_3274.field_12[this.field_3274.field_15 * -609836213] & 255;
            if(var4 >= 171633906 && var4 <= 243 || var4 == 246 || var4 == 248 || var4 >= -243148223 && var4 <= 252 || var4 == 1537114512) {
               this.field_3274.field_15 += -1025691571;
               this.field_3261[var1] = var4;
               return this.method_5203(var1, var4);
            }
         }

         this.field_3274.field_15 += var3 * -1025691571;
         return 0;
      }
   }

   // $FF: renamed from: ao (int, int) int
   int method_5237(int var1, int var2) {
      int var4;
      if(var2 == 255) {
         int var7 = this.field_3274.method_130();
         var4 = this.field_3274.method_127(-502415018);
         if(var7 == 47) {
            this.field_3274.field_15 += var4 * -1025691571;
            return 1;
         } else if(var7 == 81) {
            int var5 = this.field_3274.method_134();
            var4 -= 3;
            int var6 = this.field_3263[var1];
            this.field_3269 += (long)var6 * (long)(this.field_3266 - var5);
            this.field_3266 = var5;
            this.field_3274.field_15 += var4 * -1025691571;
            return 2;
         } else {
            this.field_3274.field_15 += var4 * -1025691571;
            return 3;
         }
      } else {
         byte var3 = field_3270[var2 - 128];
         var4 = var2;
         if(var3 >= 1) {
            var4 = var2 | this.field_3274.method_130() << 8;
         }

         if(var3 >= 2) {
            var4 |= this.field_3274.method_130() << 16;
         }

         return var4;
      }
   }

   // $FF: renamed from: aq (int, int) int
   int method_5238(int var1, int var2) {
      int var4;
      if(var2 == 255) {
         int var7 = this.field_3274.method_130();
         var4 = this.field_3274.method_127(158930);
         if(var7 == 47) {
            this.field_3274.field_15 += var4 * -1025691571;
            return 1;
         } else if(var7 == 81) {
            int var5 = this.field_3274.method_134();
            var4 -= 3;
            int var6 = this.field_3263[var1];
            this.field_3269 += (long)var6 * (long)(this.field_3266 - var5);
            this.field_3266 = var5;
            this.field_3274.field_15 += var4 * -338323148;
            return 2;
         } else {
            this.field_3274.field_15 += var4 * -1025691571;
            return 3;
         }
      } else {
         byte var3 = field_3270[var2 - 128];
         var4 = var2;
         if(var3 >= 1) {
            var4 = var2 | this.field_3274.method_130() << 8;
         }

         if(var3 >= 2) {
            var4 |= this.field_3274.method_130() << 16;
         }

         return var4;
      }
   }

   // $FF: renamed from: aw (int) long
   long method_5239(int var1) {
      return this.field_3269 + (long)var1 * (long)this.field_3266;
   }

   // $FF: renamed from: af (int) long
   long method_5240(int var1) {
      return this.field_3269 + (long)var1 * (long)this.field_3266;
   }

   // $FF: renamed from: ak (int) long
   long method_5241(int var1) {
      return this.field_3269 + (long)var1 * (long)this.field_3266;
   }

   // $FF: renamed from: ay () int
   int method_5242() {
      int var1 = this.field_3264.length;
      int var2 = -1;
      int var3 = Integer.MAX_VALUE;

      for(int var4 = 0; var4 < var1; ++var4) {
         if(this.field_3264[var4] >= 0 && this.field_3263[var4] < var3) {
            var2 = var4;
            var3 = this.field_3263[var4];
         }
      }

      return var2;
   }

   // $FF: renamed from: aa () int
   int method_5243() {
      int var1 = this.field_3264.length;
      int var2 = -1;
      int var3 = Integer.MAX_VALUE;

      for(int var4 = 0; var4 < var1; ++var4) {
         if(this.field_3264[var4] >= 0 && this.field_3263[var4] < var3) {
            var2 = var4;
            var3 = this.field_3263[var4];
         }
      }

      return var2;
   }

   // $FF: renamed from: au () int
   int method_5244() {
      int var1 = this.field_3264.length;
      int var2 = -1;
      int var3 = Integer.MAX_VALUE;

      for(int var4 = 0; var4 < var1; ++var4) {
         if(this.field_3264[var4] >= 0 && this.field_3263[var4] < var3) {
            var2 = var4;
            var3 = this.field_3263[var4];
         }
      }

      return var2;
   }

   // $FF: renamed from: an () boolean
   boolean method_5245() {
      int var1 = this.field_3264.length;

      for(int var2 = 0; var2 < var1; ++var2) {
         if(this.field_3264[var2] >= 0) {
            return false;
         }
      }

      return true;
   }

   // $FF: renamed from: am (int) int
   int method_5246(int var1) {
      int var2 = this.method_5202(var1);
      return var2;
   }

   // $FF: renamed from: bt (long) void
   void method_5247(long var1) {
      this.field_3269 = var1;
      int var3 = this.field_3264.length;

      for(int var4 = 0; var4 < var3; ++var4) {
         this.field_3263[var4] = 0;
         this.field_3261[var4] = 0;
         this.field_3274.field_15 = this.field_3267[var4] * -1025691571;
         this.method_5212(var4);
         this.field_3264[var4] = this.field_3274.field_15 * -442398587;
      }

   }

   // $FF: renamed from: bq (long) void
   void method_5248(long var1) {
      this.field_3269 = var1;
      int var3 = this.field_3264.length;

      for(int var4 = 0; var4 < var3; ++var4) {
         this.field_3263[var4] = 0;
         this.field_3261[var4] = 0;
         this.field_3274.field_15 = this.field_3267[var4] * -1025691571;
         this.method_5212(var4);
         this.field_3264[var4] = this.field_3274.field_15 * -442398587;
      }

   }

   // $FF: renamed from: ar () void
   void method_5249() {
      this.field_3274.field_15 = 1025691571;
   }

   // $FF: renamed from: ad (int) void
   void method_5250(int var1) {
      this.field_3264[var1] = this.field_3274.field_15 * -442398587;
   }
}
