package org.polarsys.capella.scenario.editor.dslscenario.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import org.polarsys.capella.scenario.editor.dslscenario.services.DslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalDslParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'IS'", "'ES'", "'System'", "'Logical'", "'Physical'", "'unset'", "'behavior'", "'node'", "'scenario'", "'{'", "'}'", "'FS'", "'EPBS'", "'OAS'", "'OES'", "'actor'", "'as'", "'component'", "'configuration_item'", "'function'", "'activity'", "'entity'", "'role'", "'->'", "':'"
    };
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__33=33;
    public static final int T__12=12;
    public static final int T__34=34;
    public static final int T__13=13;
    public static final int T__35=35;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalDslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalDsl.g"; }


    	private DslGrammarAccess grammarAccess;

    	public void setGrammarAccess(DslGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleModel"
    // InternalDsl.g:53:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // InternalDsl.g:54:1: ( ruleModel EOF )
            // InternalDsl.g:55:1: ruleModel EOF
            {
             before(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            ruleModel();

            state._fsp--;

             after(grammarAccess.getModelRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalDsl.g:62:1: ruleModel : ( ( rule__Model__Group__0 ) ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:66:2: ( ( ( rule__Model__Group__0 ) ) )
            // InternalDsl.g:67:2: ( ( rule__Model__Group__0 ) )
            {
            // InternalDsl.g:67:2: ( ( rule__Model__Group__0 ) )
            // InternalDsl.g:68:3: ( rule__Model__Group__0 )
            {
             before(grammarAccess.getModelAccess().getGroup()); 
            // InternalDsl.g:69:3: ( rule__Model__Group__0 )
            // InternalDsl.g:69:4: rule__Model__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Model__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleScenarioTypeAndParticipants"
    // InternalDsl.g:78:1: entryRuleScenarioTypeAndParticipants : ruleScenarioTypeAndParticipants EOF ;
    public final void entryRuleScenarioTypeAndParticipants() throws RecognitionException {
        try {
            // InternalDsl.g:79:1: ( ruleScenarioTypeAndParticipants EOF )
            // InternalDsl.g:80:1: ruleScenarioTypeAndParticipants EOF
            {
             before(grammarAccess.getScenarioTypeAndParticipantsRule()); 
            pushFollow(FOLLOW_1);
            ruleScenarioTypeAndParticipants();

            state._fsp--;

             after(grammarAccess.getScenarioTypeAndParticipantsRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleScenarioTypeAndParticipants"


    // $ANTLR start "ruleScenarioTypeAndParticipants"
    // InternalDsl.g:87:1: ruleScenarioTypeAndParticipants : ( ( rule__ScenarioTypeAndParticipants__Alternatives ) ) ;
    public final void ruleScenarioTypeAndParticipants() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:91:2: ( ( ( rule__ScenarioTypeAndParticipants__Alternatives ) ) )
            // InternalDsl.g:92:2: ( ( rule__ScenarioTypeAndParticipants__Alternatives ) )
            {
            // InternalDsl.g:92:2: ( ( rule__ScenarioTypeAndParticipants__Alternatives ) )
            // InternalDsl.g:93:3: ( rule__ScenarioTypeAndParticipants__Alternatives )
            {
             before(grammarAccess.getScenarioTypeAndParticipantsAccess().getAlternatives()); 
            // InternalDsl.g:94:3: ( rule__ScenarioTypeAndParticipants__Alternatives )
            // InternalDsl.g:94:4: rule__ScenarioTypeAndParticipants__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__ScenarioTypeAndParticipants__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getScenarioTypeAndParticipantsAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleScenarioTypeAndParticipants"


    // $ANTLR start "entryRuleActor"
    // InternalDsl.g:103:1: entryRuleActor : ruleActor EOF ;
    public final void entryRuleActor() throws RecognitionException {
        try {
            // InternalDsl.g:104:1: ( ruleActor EOF )
            // InternalDsl.g:105:1: ruleActor EOF
            {
             before(grammarAccess.getActorRule()); 
            pushFollow(FOLLOW_1);
            ruleActor();

            state._fsp--;

             after(grammarAccess.getActorRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleActor"


    // $ANTLR start "ruleActor"
    // InternalDsl.g:112:1: ruleActor : ( ( rule__Actor__Group__0 ) ) ;
    public final void ruleActor() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:116:2: ( ( ( rule__Actor__Group__0 ) ) )
            // InternalDsl.g:117:2: ( ( rule__Actor__Group__0 ) )
            {
            // InternalDsl.g:117:2: ( ( rule__Actor__Group__0 ) )
            // InternalDsl.g:118:3: ( rule__Actor__Group__0 )
            {
             before(grammarAccess.getActorAccess().getGroup()); 
            // InternalDsl.g:119:3: ( rule__Actor__Group__0 )
            // InternalDsl.g:119:4: rule__Actor__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Actor__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getActorAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleActor"


    // $ANTLR start "entryRuleComponent"
    // InternalDsl.g:128:1: entryRuleComponent : ruleComponent EOF ;
    public final void entryRuleComponent() throws RecognitionException {
        try {
            // InternalDsl.g:129:1: ( ruleComponent EOF )
            // InternalDsl.g:130:1: ruleComponent EOF
            {
             before(grammarAccess.getComponentRule()); 
            pushFollow(FOLLOW_1);
            ruleComponent();

            state._fsp--;

             after(grammarAccess.getComponentRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleComponent"


    // $ANTLR start "ruleComponent"
    // InternalDsl.g:137:1: ruleComponent : ( ( rule__Component__Group__0 ) ) ;
    public final void ruleComponent() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:141:2: ( ( ( rule__Component__Group__0 ) ) )
            // InternalDsl.g:142:2: ( ( rule__Component__Group__0 ) )
            {
            // InternalDsl.g:142:2: ( ( rule__Component__Group__0 ) )
            // InternalDsl.g:143:3: ( rule__Component__Group__0 )
            {
             before(grammarAccess.getComponentAccess().getGroup()); 
            // InternalDsl.g:144:3: ( rule__Component__Group__0 )
            // InternalDsl.g:144:4: rule__Component__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Component__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getComponentAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleComponent"


    // $ANTLR start "entryRulePhysicalComponent"
    // InternalDsl.g:153:1: entryRulePhysicalComponent : rulePhysicalComponent EOF ;
    public final void entryRulePhysicalComponent() throws RecognitionException {
        try {
            // InternalDsl.g:154:1: ( rulePhysicalComponent EOF )
            // InternalDsl.g:155:1: rulePhysicalComponent EOF
            {
             before(grammarAccess.getPhysicalComponentRule()); 
            pushFollow(FOLLOW_1);
            rulePhysicalComponent();

            state._fsp--;

             after(grammarAccess.getPhysicalComponentRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePhysicalComponent"


    // $ANTLR start "rulePhysicalComponent"
    // InternalDsl.g:162:1: rulePhysicalComponent : ( ( rule__PhysicalComponent__Group__0 ) ) ;
    public final void rulePhysicalComponent() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:166:2: ( ( ( rule__PhysicalComponent__Group__0 ) ) )
            // InternalDsl.g:167:2: ( ( rule__PhysicalComponent__Group__0 ) )
            {
            // InternalDsl.g:167:2: ( ( rule__PhysicalComponent__Group__0 ) )
            // InternalDsl.g:168:3: ( rule__PhysicalComponent__Group__0 )
            {
             before(grammarAccess.getPhysicalComponentAccess().getGroup()); 
            // InternalDsl.g:169:3: ( rule__PhysicalComponent__Group__0 )
            // InternalDsl.g:169:4: rule__PhysicalComponent__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__PhysicalComponent__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPhysicalComponentAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePhysicalComponent"


    // $ANTLR start "entryRuleConfigurationItem"
    // InternalDsl.g:178:1: entryRuleConfigurationItem : ruleConfigurationItem EOF ;
    public final void entryRuleConfigurationItem() throws RecognitionException {
        try {
            // InternalDsl.g:179:1: ( ruleConfigurationItem EOF )
            // InternalDsl.g:180:1: ruleConfigurationItem EOF
            {
             before(grammarAccess.getConfigurationItemRule()); 
            pushFollow(FOLLOW_1);
            ruleConfigurationItem();

            state._fsp--;

             after(grammarAccess.getConfigurationItemRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleConfigurationItem"


    // $ANTLR start "ruleConfigurationItem"
    // InternalDsl.g:187:1: ruleConfigurationItem : ( ( rule__ConfigurationItem__Group__0 ) ) ;
    public final void ruleConfigurationItem() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:191:2: ( ( ( rule__ConfigurationItem__Group__0 ) ) )
            // InternalDsl.g:192:2: ( ( rule__ConfigurationItem__Group__0 ) )
            {
            // InternalDsl.g:192:2: ( ( rule__ConfigurationItem__Group__0 ) )
            // InternalDsl.g:193:3: ( rule__ConfigurationItem__Group__0 )
            {
             before(grammarAccess.getConfigurationItemAccess().getGroup()); 
            // InternalDsl.g:194:3: ( rule__ConfigurationItem__Group__0 )
            // InternalDsl.g:194:4: rule__ConfigurationItem__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ConfigurationItem__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getConfigurationItemAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleConfigurationItem"


    // $ANTLR start "entryRuleFunction"
    // InternalDsl.g:203:1: entryRuleFunction : ruleFunction EOF ;
    public final void entryRuleFunction() throws RecognitionException {
        try {
            // InternalDsl.g:204:1: ( ruleFunction EOF )
            // InternalDsl.g:205:1: ruleFunction EOF
            {
             before(grammarAccess.getFunctionRule()); 
            pushFollow(FOLLOW_1);
            ruleFunction();

            state._fsp--;

             after(grammarAccess.getFunctionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFunction"


    // $ANTLR start "ruleFunction"
    // InternalDsl.g:212:1: ruleFunction : ( ( rule__Function__Group__0 ) ) ;
    public final void ruleFunction() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:216:2: ( ( ( rule__Function__Group__0 ) ) )
            // InternalDsl.g:217:2: ( ( rule__Function__Group__0 ) )
            {
            // InternalDsl.g:217:2: ( ( rule__Function__Group__0 ) )
            // InternalDsl.g:218:3: ( rule__Function__Group__0 )
            {
             before(grammarAccess.getFunctionAccess().getGroup()); 
            // InternalDsl.g:219:3: ( rule__Function__Group__0 )
            // InternalDsl.g:219:4: rule__Function__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Function__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFunctionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFunction"


    // $ANTLR start "entryRuleActivity"
    // InternalDsl.g:228:1: entryRuleActivity : ruleActivity EOF ;
    public final void entryRuleActivity() throws RecognitionException {
        try {
            // InternalDsl.g:229:1: ( ruleActivity EOF )
            // InternalDsl.g:230:1: ruleActivity EOF
            {
             before(grammarAccess.getActivityRule()); 
            pushFollow(FOLLOW_1);
            ruleActivity();

            state._fsp--;

             after(grammarAccess.getActivityRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleActivity"


    // $ANTLR start "ruleActivity"
    // InternalDsl.g:237:1: ruleActivity : ( ( rule__Activity__Group__0 ) ) ;
    public final void ruleActivity() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:241:2: ( ( ( rule__Activity__Group__0 ) ) )
            // InternalDsl.g:242:2: ( ( rule__Activity__Group__0 ) )
            {
            // InternalDsl.g:242:2: ( ( rule__Activity__Group__0 ) )
            // InternalDsl.g:243:3: ( rule__Activity__Group__0 )
            {
             before(grammarAccess.getActivityAccess().getGroup()); 
            // InternalDsl.g:244:3: ( rule__Activity__Group__0 )
            // InternalDsl.g:244:4: rule__Activity__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Activity__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getActivityAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleActivity"


    // $ANTLR start "entryRuleEntity"
    // InternalDsl.g:253:1: entryRuleEntity : ruleEntity EOF ;
    public final void entryRuleEntity() throws RecognitionException {
        try {
            // InternalDsl.g:254:1: ( ruleEntity EOF )
            // InternalDsl.g:255:1: ruleEntity EOF
            {
             before(grammarAccess.getEntityRule()); 
            pushFollow(FOLLOW_1);
            ruleEntity();

            state._fsp--;

             after(grammarAccess.getEntityRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEntity"


    // $ANTLR start "ruleEntity"
    // InternalDsl.g:262:1: ruleEntity : ( ( rule__Entity__Group__0 ) ) ;
    public final void ruleEntity() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:266:2: ( ( ( rule__Entity__Group__0 ) ) )
            // InternalDsl.g:267:2: ( ( rule__Entity__Group__0 ) )
            {
            // InternalDsl.g:267:2: ( ( rule__Entity__Group__0 ) )
            // InternalDsl.g:268:3: ( rule__Entity__Group__0 )
            {
             before(grammarAccess.getEntityAccess().getGroup()); 
            // InternalDsl.g:269:3: ( rule__Entity__Group__0 )
            // InternalDsl.g:269:4: rule__Entity__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Entity__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEntityAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEntity"


    // $ANTLR start "entryRuleRole"
    // InternalDsl.g:278:1: entryRuleRole : ruleRole EOF ;
    public final void entryRuleRole() throws RecognitionException {
        try {
            // InternalDsl.g:279:1: ( ruleRole EOF )
            // InternalDsl.g:280:1: ruleRole EOF
            {
             before(grammarAccess.getRoleRule()); 
            pushFollow(FOLLOW_1);
            ruleRole();

            state._fsp--;

             after(grammarAccess.getRoleRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRole"


    // $ANTLR start "ruleRole"
    // InternalDsl.g:287:1: ruleRole : ( ( rule__Role__Group__0 ) ) ;
    public final void ruleRole() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:291:2: ( ( ( rule__Role__Group__0 ) ) )
            // InternalDsl.g:292:2: ( ( rule__Role__Group__0 ) )
            {
            // InternalDsl.g:292:2: ( ( rule__Role__Group__0 ) )
            // InternalDsl.g:293:3: ( rule__Role__Group__0 )
            {
             before(grammarAccess.getRoleAccess().getGroup()); 
            // InternalDsl.g:294:3: ( rule__Role__Group__0 )
            // InternalDsl.g:294:4: rule__Role__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Role__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRoleAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRole"


    // $ANTLR start "entryRuleMessage"
    // InternalDsl.g:303:1: entryRuleMessage : ruleMessage EOF ;
    public final void entryRuleMessage() throws RecognitionException {
        try {
            // InternalDsl.g:304:1: ( ruleMessage EOF )
            // InternalDsl.g:305:1: ruleMessage EOF
            {
             before(grammarAccess.getMessageRule()); 
            pushFollow(FOLLOW_1);
            ruleMessage();

            state._fsp--;

             after(grammarAccess.getMessageRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMessage"


    // $ANTLR start "ruleMessage"
    // InternalDsl.g:312:1: ruleMessage : ( ( rule__Message__Group__0 ) ) ;
    public final void ruleMessage() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:316:2: ( ( ( rule__Message__Group__0 ) ) )
            // InternalDsl.g:317:2: ( ( rule__Message__Group__0 ) )
            {
            // InternalDsl.g:317:2: ( ( rule__Message__Group__0 ) )
            // InternalDsl.g:318:3: ( rule__Message__Group__0 )
            {
             before(grammarAccess.getMessageAccess().getGroup()); 
            // InternalDsl.g:319:3: ( rule__Message__Group__0 )
            // InternalDsl.g:319:4: rule__Message__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Message__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMessageAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMessage"


    // $ANTLR start "rule__ScenarioTypeAndParticipants__Alternatives"
    // InternalDsl.g:327:1: rule__ScenarioTypeAndParticipants__Alternatives : ( ( ( rule__ScenarioTypeAndParticipants__Group_0__0 ) ) | ( ( rule__ScenarioTypeAndParticipants__Group_1__0 ) ) | ( ( rule__ScenarioTypeAndParticipants__Group_2__0 ) ) | ( ( rule__ScenarioTypeAndParticipants__Group_3__0 ) ) | ( ( rule__ScenarioTypeAndParticipants__Group_4__0 ) ) | ( ( rule__ScenarioTypeAndParticipants__Group_5__0 ) ) | ( ( rule__ScenarioTypeAndParticipants__Group_6__0 ) ) );
    public final void rule__ScenarioTypeAndParticipants__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:331:1: ( ( ( rule__ScenarioTypeAndParticipants__Group_0__0 ) ) | ( ( rule__ScenarioTypeAndParticipants__Group_1__0 ) ) | ( ( rule__ScenarioTypeAndParticipants__Group_2__0 ) ) | ( ( rule__ScenarioTypeAndParticipants__Group_3__0 ) ) | ( ( rule__ScenarioTypeAndParticipants__Group_4__0 ) ) | ( ( rule__ScenarioTypeAndParticipants__Group_5__0 ) ) | ( ( rule__ScenarioTypeAndParticipants__Group_6__0 ) ) )
            int alt1=7;
            alt1 = dfa1.predict(input);
            switch (alt1) {
                case 1 :
                    // InternalDsl.g:332:2: ( ( rule__ScenarioTypeAndParticipants__Group_0__0 ) )
                    {
                    // InternalDsl.g:332:2: ( ( rule__ScenarioTypeAndParticipants__Group_0__0 ) )
                    // InternalDsl.g:333:3: ( rule__ScenarioTypeAndParticipants__Group_0__0 )
                    {
                     before(grammarAccess.getScenarioTypeAndParticipantsAccess().getGroup_0()); 
                    // InternalDsl.g:334:3: ( rule__ScenarioTypeAndParticipants__Group_0__0 )
                    // InternalDsl.g:334:4: rule__ScenarioTypeAndParticipants__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ScenarioTypeAndParticipants__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getScenarioTypeAndParticipantsAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDsl.g:338:2: ( ( rule__ScenarioTypeAndParticipants__Group_1__0 ) )
                    {
                    // InternalDsl.g:338:2: ( ( rule__ScenarioTypeAndParticipants__Group_1__0 ) )
                    // InternalDsl.g:339:3: ( rule__ScenarioTypeAndParticipants__Group_1__0 )
                    {
                     before(grammarAccess.getScenarioTypeAndParticipantsAccess().getGroup_1()); 
                    // InternalDsl.g:340:3: ( rule__ScenarioTypeAndParticipants__Group_1__0 )
                    // InternalDsl.g:340:4: rule__ScenarioTypeAndParticipants__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ScenarioTypeAndParticipants__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getScenarioTypeAndParticipantsAccess().getGroup_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalDsl.g:344:2: ( ( rule__ScenarioTypeAndParticipants__Group_2__0 ) )
                    {
                    // InternalDsl.g:344:2: ( ( rule__ScenarioTypeAndParticipants__Group_2__0 ) )
                    // InternalDsl.g:345:3: ( rule__ScenarioTypeAndParticipants__Group_2__0 )
                    {
                     before(grammarAccess.getScenarioTypeAndParticipantsAccess().getGroup_2()); 
                    // InternalDsl.g:346:3: ( rule__ScenarioTypeAndParticipants__Group_2__0 )
                    // InternalDsl.g:346:4: rule__ScenarioTypeAndParticipants__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ScenarioTypeAndParticipants__Group_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getScenarioTypeAndParticipantsAccess().getGroup_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalDsl.g:350:2: ( ( rule__ScenarioTypeAndParticipants__Group_3__0 ) )
                    {
                    // InternalDsl.g:350:2: ( ( rule__ScenarioTypeAndParticipants__Group_3__0 ) )
                    // InternalDsl.g:351:3: ( rule__ScenarioTypeAndParticipants__Group_3__0 )
                    {
                     before(grammarAccess.getScenarioTypeAndParticipantsAccess().getGroup_3()); 
                    // InternalDsl.g:352:3: ( rule__ScenarioTypeAndParticipants__Group_3__0 )
                    // InternalDsl.g:352:4: rule__ScenarioTypeAndParticipants__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ScenarioTypeAndParticipants__Group_3__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getScenarioTypeAndParticipantsAccess().getGroup_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalDsl.g:356:2: ( ( rule__ScenarioTypeAndParticipants__Group_4__0 ) )
                    {
                    // InternalDsl.g:356:2: ( ( rule__ScenarioTypeAndParticipants__Group_4__0 ) )
                    // InternalDsl.g:357:3: ( rule__ScenarioTypeAndParticipants__Group_4__0 )
                    {
                     before(grammarAccess.getScenarioTypeAndParticipantsAccess().getGroup_4()); 
                    // InternalDsl.g:358:3: ( rule__ScenarioTypeAndParticipants__Group_4__0 )
                    // InternalDsl.g:358:4: rule__ScenarioTypeAndParticipants__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ScenarioTypeAndParticipants__Group_4__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getScenarioTypeAndParticipantsAccess().getGroup_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalDsl.g:362:2: ( ( rule__ScenarioTypeAndParticipants__Group_5__0 ) )
                    {
                    // InternalDsl.g:362:2: ( ( rule__ScenarioTypeAndParticipants__Group_5__0 ) )
                    // InternalDsl.g:363:3: ( rule__ScenarioTypeAndParticipants__Group_5__0 )
                    {
                     before(grammarAccess.getScenarioTypeAndParticipantsAccess().getGroup_5()); 
                    // InternalDsl.g:364:3: ( rule__ScenarioTypeAndParticipants__Group_5__0 )
                    // InternalDsl.g:364:4: rule__ScenarioTypeAndParticipants__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ScenarioTypeAndParticipants__Group_5__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getScenarioTypeAndParticipantsAccess().getGroup_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalDsl.g:368:2: ( ( rule__ScenarioTypeAndParticipants__Group_6__0 ) )
                    {
                    // InternalDsl.g:368:2: ( ( rule__ScenarioTypeAndParticipants__Group_6__0 ) )
                    // InternalDsl.g:369:3: ( rule__ScenarioTypeAndParticipants__Group_6__0 )
                    {
                     before(grammarAccess.getScenarioTypeAndParticipantsAccess().getGroup_6()); 
                    // InternalDsl.g:370:3: ( rule__ScenarioTypeAndParticipants__Group_6__0 )
                    // InternalDsl.g:370:4: rule__ScenarioTypeAndParticipants__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ScenarioTypeAndParticipants__Group_6__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getScenarioTypeAndParticipantsAccess().getGroup_6()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScenarioTypeAndParticipants__Alternatives"


    // $ANTLR start "rule__ScenarioTypeAndParticipants__Alternatives_0_1"
    // InternalDsl.g:378:1: rule__ScenarioTypeAndParticipants__Alternatives_0_1 : ( ( 'IS' ) | ( 'ES' ) );
    public final void rule__ScenarioTypeAndParticipants__Alternatives_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:382:1: ( ( 'IS' ) | ( 'ES' ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==11) ) {
                alt2=1;
            }
            else if ( (LA2_0==12) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalDsl.g:383:2: ( 'IS' )
                    {
                    // InternalDsl.g:383:2: ( 'IS' )
                    // InternalDsl.g:384:3: 'IS'
                    {
                     before(grammarAccess.getScenarioTypeAndParticipantsAccess().getISKeyword_0_1_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getScenarioTypeAndParticipantsAccess().getISKeyword_0_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDsl.g:389:2: ( 'ES' )
                    {
                    // InternalDsl.g:389:2: ( 'ES' )
                    // InternalDsl.g:390:3: 'ES'
                    {
                     before(grammarAccess.getScenarioTypeAndParticipantsAccess().getESKeyword_0_1_1()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getScenarioTypeAndParticipantsAccess().getESKeyword_0_1_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScenarioTypeAndParticipants__Alternatives_0_1"


    // $ANTLR start "rule__ScenarioTypeAndParticipants__Alternatives_1_1"
    // InternalDsl.g:399:1: rule__ScenarioTypeAndParticipants__Alternatives_1_1 : ( ( 'IS' ) | ( 'ES' ) );
    public final void rule__ScenarioTypeAndParticipants__Alternatives_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:403:1: ( ( 'IS' ) | ( 'ES' ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==11) ) {
                alt3=1;
            }
            else if ( (LA3_0==12) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalDsl.g:404:2: ( 'IS' )
                    {
                    // InternalDsl.g:404:2: ( 'IS' )
                    // InternalDsl.g:405:3: 'IS'
                    {
                     before(grammarAccess.getScenarioTypeAndParticipantsAccess().getISKeyword_1_1_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getScenarioTypeAndParticipantsAccess().getISKeyword_1_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDsl.g:410:2: ( 'ES' )
                    {
                    // InternalDsl.g:410:2: ( 'ES' )
                    // InternalDsl.g:411:3: 'ES'
                    {
                     before(grammarAccess.getScenarioTypeAndParticipantsAccess().getESKeyword_1_1_1()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getScenarioTypeAndParticipantsAccess().getESKeyword_1_1_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScenarioTypeAndParticipants__Alternatives_1_1"


    // $ANTLR start "rule__ScenarioTypeAndParticipants__ParticipantsAlternatives_1_3_0"
    // InternalDsl.g:420:1: rule__ScenarioTypeAndParticipants__ParticipantsAlternatives_1_3_0 : ( ( ruleActor ) | ( ruleComponent ) );
    public final void rule__ScenarioTypeAndParticipants__ParticipantsAlternatives_1_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:424:1: ( ( ruleActor ) | ( ruleComponent ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==26) ) {
                alt4=1;
            }
            else if ( (LA4_0==28) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalDsl.g:425:2: ( ruleActor )
                    {
                    // InternalDsl.g:425:2: ( ruleActor )
                    // InternalDsl.g:426:3: ruleActor
                    {
                     before(grammarAccess.getScenarioTypeAndParticipantsAccess().getParticipantsActorParserRuleCall_1_3_0_0()); 
                    pushFollow(FOLLOW_2);
                    ruleActor();

                    state._fsp--;

                     after(grammarAccess.getScenarioTypeAndParticipantsAccess().getParticipantsActorParserRuleCall_1_3_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDsl.g:431:2: ( ruleComponent )
                    {
                    // InternalDsl.g:431:2: ( ruleComponent )
                    // InternalDsl.g:432:3: ruleComponent
                    {
                     before(grammarAccess.getScenarioTypeAndParticipantsAccess().getParticipantsComponentParserRuleCall_1_3_0_1()); 
                    pushFollow(FOLLOW_2);
                    ruleComponent();

                    state._fsp--;

                     after(grammarAccess.getScenarioTypeAndParticipantsAccess().getParticipantsComponentParserRuleCall_1_3_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScenarioTypeAndParticipants__ParticipantsAlternatives_1_3_0"


    // $ANTLR start "rule__ScenarioTypeAndParticipants__Alternatives_2_1"
    // InternalDsl.g:441:1: rule__ScenarioTypeAndParticipants__Alternatives_2_1 : ( ( 'IS' ) | ( 'ES' ) );
    public final void rule__ScenarioTypeAndParticipants__Alternatives_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:445:1: ( ( 'IS' ) | ( 'ES' ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==11) ) {
                alt5=1;
            }
            else if ( (LA5_0==12) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalDsl.g:446:2: ( 'IS' )
                    {
                    // InternalDsl.g:446:2: ( 'IS' )
                    // InternalDsl.g:447:3: 'IS'
                    {
                     before(grammarAccess.getScenarioTypeAndParticipantsAccess().getISKeyword_2_1_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getScenarioTypeAndParticipantsAccess().getISKeyword_2_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDsl.g:452:2: ( 'ES' )
                    {
                    // InternalDsl.g:452:2: ( 'ES' )
                    // InternalDsl.g:453:3: 'ES'
                    {
                     before(grammarAccess.getScenarioTypeAndParticipantsAccess().getESKeyword_2_1_1()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getScenarioTypeAndParticipantsAccess().getESKeyword_2_1_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScenarioTypeAndParticipants__Alternatives_2_1"


    // $ANTLR start "rule__ScenarioTypeAndParticipants__ParticipantAlternatives_2_3_0"
    // InternalDsl.g:462:1: rule__ScenarioTypeAndParticipants__ParticipantAlternatives_2_3_0 : ( ( ruleActor ) | ( rulePhysicalComponent ) );
    public final void rule__ScenarioTypeAndParticipants__ParticipantAlternatives_2_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:466:1: ( ( ruleActor ) | ( rulePhysicalComponent ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==26) ) {
                alt6=1;
            }
            else if ( (LA6_0==28) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalDsl.g:467:2: ( ruleActor )
                    {
                    // InternalDsl.g:467:2: ( ruleActor )
                    // InternalDsl.g:468:3: ruleActor
                    {
                     before(grammarAccess.getScenarioTypeAndParticipantsAccess().getParticipantActorParserRuleCall_2_3_0_0()); 
                    pushFollow(FOLLOW_2);
                    ruleActor();

                    state._fsp--;

                     after(grammarAccess.getScenarioTypeAndParticipantsAccess().getParticipantActorParserRuleCall_2_3_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDsl.g:473:2: ( rulePhysicalComponent )
                    {
                    // InternalDsl.g:473:2: ( rulePhysicalComponent )
                    // InternalDsl.g:474:3: rulePhysicalComponent
                    {
                     before(grammarAccess.getScenarioTypeAndParticipantsAccess().getParticipantPhysicalComponentParserRuleCall_2_3_0_1()); 
                    pushFollow(FOLLOW_2);
                    rulePhysicalComponent();

                    state._fsp--;

                     after(grammarAccess.getScenarioTypeAndParticipantsAccess().getParticipantPhysicalComponentParserRuleCall_2_3_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScenarioTypeAndParticipants__ParticipantAlternatives_2_3_0"


    // $ANTLR start "rule__ScenarioTypeAndParticipants__Alternatives_3_0"
    // InternalDsl.g:483:1: rule__ScenarioTypeAndParticipants__Alternatives_3_0 : ( ( 'System' ) | ( 'Logical' ) | ( 'Physical' ) );
    public final void rule__ScenarioTypeAndParticipants__Alternatives_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:487:1: ( ( 'System' ) | ( 'Logical' ) | ( 'Physical' ) )
            int alt7=3;
            switch ( input.LA(1) ) {
            case 13:
                {
                alt7=1;
                }
                break;
            case 14:
                {
                alt7=2;
                }
                break;
            case 15:
                {
                alt7=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalDsl.g:488:2: ( 'System' )
                    {
                    // InternalDsl.g:488:2: ( 'System' )
                    // InternalDsl.g:489:3: 'System'
                    {
                     before(grammarAccess.getScenarioTypeAndParticipantsAccess().getSystemKeyword_3_0_0()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getScenarioTypeAndParticipantsAccess().getSystemKeyword_3_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDsl.g:494:2: ( 'Logical' )
                    {
                    // InternalDsl.g:494:2: ( 'Logical' )
                    // InternalDsl.g:495:3: 'Logical'
                    {
                     before(grammarAccess.getScenarioTypeAndParticipantsAccess().getLogicalKeyword_3_0_1()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getScenarioTypeAndParticipantsAccess().getLogicalKeyword_3_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalDsl.g:500:2: ( 'Physical' )
                    {
                    // InternalDsl.g:500:2: ( 'Physical' )
                    // InternalDsl.g:501:3: 'Physical'
                    {
                     before(grammarAccess.getScenarioTypeAndParticipantsAccess().getPhysicalKeyword_3_0_2()); 
                    match(input,15,FOLLOW_2); 
                     after(grammarAccess.getScenarioTypeAndParticipantsAccess().getPhysicalKeyword_3_0_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScenarioTypeAndParticipants__Alternatives_3_0"


    // $ANTLR start "rule__ScenarioTypeAndParticipants__ParticipantsAlternatives_6_2_0"
    // InternalDsl.g:510:1: rule__ScenarioTypeAndParticipants__ParticipantsAlternatives_6_2_0 : ( ( ruleEntity ) | ( ruleActor ) | ( ruleRole ) );
    public final void rule__ScenarioTypeAndParticipants__ParticipantsAlternatives_6_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:514:1: ( ( ruleEntity ) | ( ruleActor ) | ( ruleRole ) )
            int alt8=3;
            switch ( input.LA(1) ) {
            case 32:
                {
                alt8=1;
                }
                break;
            case 26:
                {
                alt8=2;
                }
                break;
            case 33:
                {
                alt8=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // InternalDsl.g:515:2: ( ruleEntity )
                    {
                    // InternalDsl.g:515:2: ( ruleEntity )
                    // InternalDsl.g:516:3: ruleEntity
                    {
                     before(grammarAccess.getScenarioTypeAndParticipantsAccess().getParticipantsEntityParserRuleCall_6_2_0_0()); 
                    pushFollow(FOLLOW_2);
                    ruleEntity();

                    state._fsp--;

                     after(grammarAccess.getScenarioTypeAndParticipantsAccess().getParticipantsEntityParserRuleCall_6_2_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDsl.g:521:2: ( ruleActor )
                    {
                    // InternalDsl.g:521:2: ( ruleActor )
                    // InternalDsl.g:522:3: ruleActor
                    {
                     before(grammarAccess.getScenarioTypeAndParticipantsAccess().getParticipantsActorParserRuleCall_6_2_0_1()); 
                    pushFollow(FOLLOW_2);
                    ruleActor();

                    state._fsp--;

                     after(grammarAccess.getScenarioTypeAndParticipantsAccess().getParticipantsActorParserRuleCall_6_2_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalDsl.g:527:2: ( ruleRole )
                    {
                    // InternalDsl.g:527:2: ( ruleRole )
                    // InternalDsl.g:528:3: ruleRole
                    {
                     before(grammarAccess.getScenarioTypeAndParticipantsAccess().getParticipantsRoleParserRuleCall_6_2_0_2()); 
                    pushFollow(FOLLOW_2);
                    ruleRole();

                    state._fsp--;

                     after(grammarAccess.getScenarioTypeAndParticipantsAccess().getParticipantsRoleParserRuleCall_6_2_0_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScenarioTypeAndParticipants__ParticipantsAlternatives_6_2_0"


    // $ANTLR start "rule__PhysicalComponent__Alternatives_1"
    // InternalDsl.g:537:1: rule__PhysicalComponent__Alternatives_1 : ( ( 'unset' ) | ( 'behavior' ) | ( 'node' ) );
    public final void rule__PhysicalComponent__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:541:1: ( ( 'unset' ) | ( 'behavior' ) | ( 'node' ) )
            int alt9=3;
            switch ( input.LA(1) ) {
            case 16:
                {
                alt9=1;
                }
                break;
            case 17:
                {
                alt9=2;
                }
                break;
            case 18:
                {
                alt9=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // InternalDsl.g:542:2: ( 'unset' )
                    {
                    // InternalDsl.g:542:2: ( 'unset' )
                    // InternalDsl.g:543:3: 'unset'
                    {
                     before(grammarAccess.getPhysicalComponentAccess().getUnsetKeyword_1_0()); 
                    match(input,16,FOLLOW_2); 
                     after(grammarAccess.getPhysicalComponentAccess().getUnsetKeyword_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDsl.g:548:2: ( 'behavior' )
                    {
                    // InternalDsl.g:548:2: ( 'behavior' )
                    // InternalDsl.g:549:3: 'behavior'
                    {
                     before(grammarAccess.getPhysicalComponentAccess().getBehaviorKeyword_1_1()); 
                    match(input,17,FOLLOW_2); 
                     after(grammarAccess.getPhysicalComponentAccess().getBehaviorKeyword_1_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalDsl.g:554:2: ( 'node' )
                    {
                    // InternalDsl.g:554:2: ( 'node' )
                    // InternalDsl.g:555:3: 'node'
                    {
                     before(grammarAccess.getPhysicalComponentAccess().getNodeKeyword_1_2()); 
                    match(input,18,FOLLOW_2); 
                     after(grammarAccess.getPhysicalComponentAccess().getNodeKeyword_1_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PhysicalComponent__Alternatives_1"


    // $ANTLR start "rule__Model__Group__0"
    // InternalDsl.g:564:1: rule__Model__Group__0 : rule__Model__Group__0__Impl rule__Model__Group__1 ;
    public final void rule__Model__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:568:1: ( rule__Model__Group__0__Impl rule__Model__Group__1 )
            // InternalDsl.g:569:2: rule__Model__Group__0__Impl rule__Model__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Model__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__0"


    // $ANTLR start "rule__Model__Group__0__Impl"
    // InternalDsl.g:576:1: rule__Model__Group__0__Impl : ( 'scenario' ) ;
    public final void rule__Model__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:580:1: ( ( 'scenario' ) )
            // InternalDsl.g:581:1: ( 'scenario' )
            {
            // InternalDsl.g:581:1: ( 'scenario' )
            // InternalDsl.g:582:2: 'scenario'
            {
             before(grammarAccess.getModelAccess().getScenarioKeyword_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getModelAccess().getScenarioKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__0__Impl"


    // $ANTLR start "rule__Model__Group__1"
    // InternalDsl.g:591:1: rule__Model__Group__1 : rule__Model__Group__1__Impl rule__Model__Group__2 ;
    public final void rule__Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:595:1: ( rule__Model__Group__1__Impl rule__Model__Group__2 )
            // InternalDsl.g:596:2: rule__Model__Group__1__Impl rule__Model__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Model__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__1"


    // $ANTLR start "rule__Model__Group__1__Impl"
    // InternalDsl.g:603:1: rule__Model__Group__1__Impl : ( ( rule__Model__ScenarioTypeAssignment_1 ) ) ;
    public final void rule__Model__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:607:1: ( ( ( rule__Model__ScenarioTypeAssignment_1 ) ) )
            // InternalDsl.g:608:1: ( ( rule__Model__ScenarioTypeAssignment_1 ) )
            {
            // InternalDsl.g:608:1: ( ( rule__Model__ScenarioTypeAssignment_1 ) )
            // InternalDsl.g:609:2: ( rule__Model__ScenarioTypeAssignment_1 )
            {
             before(grammarAccess.getModelAccess().getScenarioTypeAssignment_1()); 
            // InternalDsl.g:610:2: ( rule__Model__ScenarioTypeAssignment_1 )
            // InternalDsl.g:610:3: rule__Model__ScenarioTypeAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Model__ScenarioTypeAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getScenarioTypeAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__1__Impl"


    // $ANTLR start "rule__Model__Group__2"
    // InternalDsl.g:618:1: rule__Model__Group__2 : rule__Model__Group__2__Impl rule__Model__Group__3 ;
    public final void rule__Model__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:622:1: ( rule__Model__Group__2__Impl rule__Model__Group__3 )
            // InternalDsl.g:623:2: rule__Model__Group__2__Impl rule__Model__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__Model__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__2"


    // $ANTLR start "rule__Model__Group__2__Impl"
    // InternalDsl.g:630:1: rule__Model__Group__2__Impl : ( '{' ) ;
    public final void rule__Model__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:634:1: ( ( '{' ) )
            // InternalDsl.g:635:1: ( '{' )
            {
            // InternalDsl.g:635:1: ( '{' )
            // InternalDsl.g:636:2: '{'
            {
             before(grammarAccess.getModelAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getModelAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__2__Impl"


    // $ANTLR start "rule__Model__Group__3"
    // InternalDsl.g:645:1: rule__Model__Group__3 : rule__Model__Group__3__Impl rule__Model__Group__4 ;
    public final void rule__Model__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:649:1: ( rule__Model__Group__3__Impl rule__Model__Group__4 )
            // InternalDsl.g:650:2: rule__Model__Group__3__Impl rule__Model__Group__4
            {
            pushFollow(FOLLOW_5);
            rule__Model__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__3"


    // $ANTLR start "rule__Model__Group__3__Impl"
    // InternalDsl.g:657:1: rule__Model__Group__3__Impl : ( ( rule__Model__MessagesAssignment_3 )* ) ;
    public final void rule__Model__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:661:1: ( ( ( rule__Model__MessagesAssignment_3 )* ) )
            // InternalDsl.g:662:1: ( ( rule__Model__MessagesAssignment_3 )* )
            {
            // InternalDsl.g:662:1: ( ( rule__Model__MessagesAssignment_3 )* )
            // InternalDsl.g:663:2: ( rule__Model__MessagesAssignment_3 )*
            {
             before(grammarAccess.getModelAccess().getMessagesAssignment_3()); 
            // InternalDsl.g:664:2: ( rule__Model__MessagesAssignment_3 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==RULE_ID) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalDsl.g:664:3: rule__Model__MessagesAssignment_3
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__Model__MessagesAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getMessagesAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__3__Impl"


    // $ANTLR start "rule__Model__Group__4"
    // InternalDsl.g:672:1: rule__Model__Group__4 : rule__Model__Group__4__Impl ;
    public final void rule__Model__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:676:1: ( rule__Model__Group__4__Impl )
            // InternalDsl.g:677:2: rule__Model__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Model__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__4"


    // $ANTLR start "rule__Model__Group__4__Impl"
    // InternalDsl.g:683:1: rule__Model__Group__4__Impl : ( '}' ) ;
    public final void rule__Model__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:687:1: ( ( '}' ) )
            // InternalDsl.g:688:1: ( '}' )
            {
            // InternalDsl.g:688:1: ( '}' )
            // InternalDsl.g:689:2: '}'
            {
             before(grammarAccess.getModelAccess().getRightCurlyBracketKeyword_4()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getModelAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__4__Impl"


    // $ANTLR start "rule__ScenarioTypeAndParticipants__Group_0__0"
    // InternalDsl.g:699:1: rule__ScenarioTypeAndParticipants__Group_0__0 : rule__ScenarioTypeAndParticipants__Group_0__0__Impl rule__ScenarioTypeAndParticipants__Group_0__1 ;
    public final void rule__ScenarioTypeAndParticipants__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:703:1: ( rule__ScenarioTypeAndParticipants__Group_0__0__Impl rule__ScenarioTypeAndParticipants__Group_0__1 )
            // InternalDsl.g:704:2: rule__ScenarioTypeAndParticipants__Group_0__0__Impl rule__ScenarioTypeAndParticipants__Group_0__1
            {
            pushFollow(FOLLOW_7);
            rule__ScenarioTypeAndParticipants__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ScenarioTypeAndParticipants__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScenarioTypeAndParticipants__Group_0__0"


    // $ANTLR start "rule__ScenarioTypeAndParticipants__Group_0__0__Impl"
    // InternalDsl.g:711:1: rule__ScenarioTypeAndParticipants__Group_0__0__Impl : ( 'System' ) ;
    public final void rule__ScenarioTypeAndParticipants__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:715:1: ( ( 'System' ) )
            // InternalDsl.g:716:1: ( 'System' )
            {
            // InternalDsl.g:716:1: ( 'System' )
            // InternalDsl.g:717:2: 'System'
            {
             before(grammarAccess.getScenarioTypeAndParticipantsAccess().getSystemKeyword_0_0()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getScenarioTypeAndParticipantsAccess().getSystemKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScenarioTypeAndParticipants__Group_0__0__Impl"


    // $ANTLR start "rule__ScenarioTypeAndParticipants__Group_0__1"
    // InternalDsl.g:726:1: rule__ScenarioTypeAndParticipants__Group_0__1 : rule__ScenarioTypeAndParticipants__Group_0__1__Impl rule__ScenarioTypeAndParticipants__Group_0__2 ;
    public final void rule__ScenarioTypeAndParticipants__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:730:1: ( rule__ScenarioTypeAndParticipants__Group_0__1__Impl rule__ScenarioTypeAndParticipants__Group_0__2 )
            // InternalDsl.g:731:2: rule__ScenarioTypeAndParticipants__Group_0__1__Impl rule__ScenarioTypeAndParticipants__Group_0__2
            {
            pushFollow(FOLLOW_8);
            rule__ScenarioTypeAndParticipants__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ScenarioTypeAndParticipants__Group_0__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScenarioTypeAndParticipants__Group_0__1"


    // $ANTLR start "rule__ScenarioTypeAndParticipants__Group_0__1__Impl"
    // InternalDsl.g:738:1: rule__ScenarioTypeAndParticipants__Group_0__1__Impl : ( ( rule__ScenarioTypeAndParticipants__Alternatives_0_1 ) ) ;
    public final void rule__ScenarioTypeAndParticipants__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:742:1: ( ( ( rule__ScenarioTypeAndParticipants__Alternatives_0_1 ) ) )
            // InternalDsl.g:743:1: ( ( rule__ScenarioTypeAndParticipants__Alternatives_0_1 ) )
            {
            // InternalDsl.g:743:1: ( ( rule__ScenarioTypeAndParticipants__Alternatives_0_1 ) )
            // InternalDsl.g:744:2: ( rule__ScenarioTypeAndParticipants__Alternatives_0_1 )
            {
             before(grammarAccess.getScenarioTypeAndParticipantsAccess().getAlternatives_0_1()); 
            // InternalDsl.g:745:2: ( rule__ScenarioTypeAndParticipants__Alternatives_0_1 )
            // InternalDsl.g:745:3: rule__ScenarioTypeAndParticipants__Alternatives_0_1
            {
            pushFollow(FOLLOW_2);
            rule__ScenarioTypeAndParticipants__Alternatives_0_1();

            state._fsp--;


            }

             after(grammarAccess.getScenarioTypeAndParticipantsAccess().getAlternatives_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScenarioTypeAndParticipants__Group_0__1__Impl"


    // $ANTLR start "rule__ScenarioTypeAndParticipants__Group_0__2"
    // InternalDsl.g:753:1: rule__ScenarioTypeAndParticipants__Group_0__2 : rule__ScenarioTypeAndParticipants__Group_0__2__Impl rule__ScenarioTypeAndParticipants__Group_0__3 ;
    public final void rule__ScenarioTypeAndParticipants__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:757:1: ( rule__ScenarioTypeAndParticipants__Group_0__2__Impl rule__ScenarioTypeAndParticipants__Group_0__3 )
            // InternalDsl.g:758:2: rule__ScenarioTypeAndParticipants__Group_0__2__Impl rule__ScenarioTypeAndParticipants__Group_0__3
            {
            pushFollow(FOLLOW_9);
            rule__ScenarioTypeAndParticipants__Group_0__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ScenarioTypeAndParticipants__Group_0__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScenarioTypeAndParticipants__Group_0__2"


    // $ANTLR start "rule__ScenarioTypeAndParticipants__Group_0__2__Impl"
    // InternalDsl.g:765:1: rule__ScenarioTypeAndParticipants__Group_0__2__Impl : ( ( rule__ScenarioTypeAndParticipants__NameAssignment_0_2 ) ) ;
    public final void rule__ScenarioTypeAndParticipants__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:769:1: ( ( ( rule__ScenarioTypeAndParticipants__NameAssignment_0_2 ) ) )
            // InternalDsl.g:770:1: ( ( rule__ScenarioTypeAndParticipants__NameAssignment_0_2 ) )
            {
            // InternalDsl.g:770:1: ( ( rule__ScenarioTypeAndParticipants__NameAssignment_0_2 ) )
            // InternalDsl.g:771:2: ( rule__ScenarioTypeAndParticipants__NameAssignment_0_2 )
            {
             before(grammarAccess.getScenarioTypeAndParticipantsAccess().getNameAssignment_0_2()); 
            // InternalDsl.g:772:2: ( rule__ScenarioTypeAndParticipants__NameAssignment_0_2 )
            // InternalDsl.g:772:3: rule__ScenarioTypeAndParticipants__NameAssignment_0_2
            {
            pushFollow(FOLLOW_2);
            rule__ScenarioTypeAndParticipants__NameAssignment_0_2();

            state._fsp--;


            }

             after(grammarAccess.getScenarioTypeAndParticipantsAccess().getNameAssignment_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScenarioTypeAndParticipants__Group_0__2__Impl"


    // $ANTLR start "rule__ScenarioTypeAndParticipants__Group_0__3"
    // InternalDsl.g:780:1: rule__ScenarioTypeAndParticipants__Group_0__3 : rule__ScenarioTypeAndParticipants__Group_0__3__Impl ;
    public final void rule__ScenarioTypeAndParticipants__Group_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:784:1: ( rule__ScenarioTypeAndParticipants__Group_0__3__Impl )
            // InternalDsl.g:785:2: rule__ScenarioTypeAndParticipants__Group_0__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ScenarioTypeAndParticipants__Group_0__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScenarioTypeAndParticipants__Group_0__3"


    // $ANTLR start "rule__ScenarioTypeAndParticipants__Group_0__3__Impl"
    // InternalDsl.g:791:1: rule__ScenarioTypeAndParticipants__Group_0__3__Impl : ( ( rule__ScenarioTypeAndParticipants__ParticipantsAssignment_0_3 )* ) ;
    public final void rule__ScenarioTypeAndParticipants__Group_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:795:1: ( ( ( rule__ScenarioTypeAndParticipants__ParticipantsAssignment_0_3 )* ) )
            // InternalDsl.g:796:1: ( ( rule__ScenarioTypeAndParticipants__ParticipantsAssignment_0_3 )* )
            {
            // InternalDsl.g:796:1: ( ( rule__ScenarioTypeAndParticipants__ParticipantsAssignment_0_3 )* )
            // InternalDsl.g:797:2: ( rule__ScenarioTypeAndParticipants__ParticipantsAssignment_0_3 )*
            {
             before(grammarAccess.getScenarioTypeAndParticipantsAccess().getParticipantsAssignment_0_3()); 
            // InternalDsl.g:798:2: ( rule__ScenarioTypeAndParticipants__ParticipantsAssignment_0_3 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==26) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalDsl.g:798:3: rule__ScenarioTypeAndParticipants__ParticipantsAssignment_0_3
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__ScenarioTypeAndParticipants__ParticipantsAssignment_0_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getScenarioTypeAndParticipantsAccess().getParticipantsAssignment_0_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScenarioTypeAndParticipants__Group_0__3__Impl"


    // $ANTLR start "rule__ScenarioTypeAndParticipants__Group_1__0"
    // InternalDsl.g:807:1: rule__ScenarioTypeAndParticipants__Group_1__0 : rule__ScenarioTypeAndParticipants__Group_1__0__Impl rule__ScenarioTypeAndParticipants__Group_1__1 ;
    public final void rule__ScenarioTypeAndParticipants__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:811:1: ( rule__ScenarioTypeAndParticipants__Group_1__0__Impl rule__ScenarioTypeAndParticipants__Group_1__1 )
            // InternalDsl.g:812:2: rule__ScenarioTypeAndParticipants__Group_1__0__Impl rule__ScenarioTypeAndParticipants__Group_1__1
            {
            pushFollow(FOLLOW_7);
            rule__ScenarioTypeAndParticipants__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ScenarioTypeAndParticipants__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScenarioTypeAndParticipants__Group_1__0"


    // $ANTLR start "rule__ScenarioTypeAndParticipants__Group_1__0__Impl"
    // InternalDsl.g:819:1: rule__ScenarioTypeAndParticipants__Group_1__0__Impl : ( 'Logical' ) ;
    public final void rule__ScenarioTypeAndParticipants__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:823:1: ( ( 'Logical' ) )
            // InternalDsl.g:824:1: ( 'Logical' )
            {
            // InternalDsl.g:824:1: ( 'Logical' )
            // InternalDsl.g:825:2: 'Logical'
            {
             before(grammarAccess.getScenarioTypeAndParticipantsAccess().getLogicalKeyword_1_0()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getScenarioTypeAndParticipantsAccess().getLogicalKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScenarioTypeAndParticipants__Group_1__0__Impl"


    // $ANTLR start "rule__ScenarioTypeAndParticipants__Group_1__1"
    // InternalDsl.g:834:1: rule__ScenarioTypeAndParticipants__Group_1__1 : rule__ScenarioTypeAndParticipants__Group_1__1__Impl rule__ScenarioTypeAndParticipants__Group_1__2 ;
    public final void rule__ScenarioTypeAndParticipants__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:838:1: ( rule__ScenarioTypeAndParticipants__Group_1__1__Impl rule__ScenarioTypeAndParticipants__Group_1__2 )
            // InternalDsl.g:839:2: rule__ScenarioTypeAndParticipants__Group_1__1__Impl rule__ScenarioTypeAndParticipants__Group_1__2
            {
            pushFollow(FOLLOW_8);
            rule__ScenarioTypeAndParticipants__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ScenarioTypeAndParticipants__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScenarioTypeAndParticipants__Group_1__1"


    // $ANTLR start "rule__ScenarioTypeAndParticipants__Group_1__1__Impl"
    // InternalDsl.g:846:1: rule__ScenarioTypeAndParticipants__Group_1__1__Impl : ( ( rule__ScenarioTypeAndParticipants__Alternatives_1_1 ) ) ;
    public final void rule__ScenarioTypeAndParticipants__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:850:1: ( ( ( rule__ScenarioTypeAndParticipants__Alternatives_1_1 ) ) )
            // InternalDsl.g:851:1: ( ( rule__ScenarioTypeAndParticipants__Alternatives_1_1 ) )
            {
            // InternalDsl.g:851:1: ( ( rule__ScenarioTypeAndParticipants__Alternatives_1_1 ) )
            // InternalDsl.g:852:2: ( rule__ScenarioTypeAndParticipants__Alternatives_1_1 )
            {
             before(grammarAccess.getScenarioTypeAndParticipantsAccess().getAlternatives_1_1()); 
            // InternalDsl.g:853:2: ( rule__ScenarioTypeAndParticipants__Alternatives_1_1 )
            // InternalDsl.g:853:3: rule__ScenarioTypeAndParticipants__Alternatives_1_1
            {
            pushFollow(FOLLOW_2);
            rule__ScenarioTypeAndParticipants__Alternatives_1_1();

            state._fsp--;


            }

             after(grammarAccess.getScenarioTypeAndParticipantsAccess().getAlternatives_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScenarioTypeAndParticipants__Group_1__1__Impl"


    // $ANTLR start "rule__ScenarioTypeAndParticipants__Group_1__2"
    // InternalDsl.g:861:1: rule__ScenarioTypeAndParticipants__Group_1__2 : rule__ScenarioTypeAndParticipants__Group_1__2__Impl rule__ScenarioTypeAndParticipants__Group_1__3 ;
    public final void rule__ScenarioTypeAndParticipants__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:865:1: ( rule__ScenarioTypeAndParticipants__Group_1__2__Impl rule__ScenarioTypeAndParticipants__Group_1__3 )
            // InternalDsl.g:866:2: rule__ScenarioTypeAndParticipants__Group_1__2__Impl rule__ScenarioTypeAndParticipants__Group_1__3
            {
            pushFollow(FOLLOW_11);
            rule__ScenarioTypeAndParticipants__Group_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ScenarioTypeAndParticipants__Group_1__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScenarioTypeAndParticipants__Group_1__2"


    // $ANTLR start "rule__ScenarioTypeAndParticipants__Group_1__2__Impl"
    // InternalDsl.g:873:1: rule__ScenarioTypeAndParticipants__Group_1__2__Impl : ( ( rule__ScenarioTypeAndParticipants__NameAssignment_1_2 ) ) ;
    public final void rule__ScenarioTypeAndParticipants__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:877:1: ( ( ( rule__ScenarioTypeAndParticipants__NameAssignment_1_2 ) ) )
            // InternalDsl.g:878:1: ( ( rule__ScenarioTypeAndParticipants__NameAssignment_1_2 ) )
            {
            // InternalDsl.g:878:1: ( ( rule__ScenarioTypeAndParticipants__NameAssignment_1_2 ) )
            // InternalDsl.g:879:2: ( rule__ScenarioTypeAndParticipants__NameAssignment_1_2 )
            {
             before(grammarAccess.getScenarioTypeAndParticipantsAccess().getNameAssignment_1_2()); 
            // InternalDsl.g:880:2: ( rule__ScenarioTypeAndParticipants__NameAssignment_1_2 )
            // InternalDsl.g:880:3: rule__ScenarioTypeAndParticipants__NameAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__ScenarioTypeAndParticipants__NameAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getScenarioTypeAndParticipantsAccess().getNameAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScenarioTypeAndParticipants__Group_1__2__Impl"


    // $ANTLR start "rule__ScenarioTypeAndParticipants__Group_1__3"
    // InternalDsl.g:888:1: rule__ScenarioTypeAndParticipants__Group_1__3 : rule__ScenarioTypeAndParticipants__Group_1__3__Impl ;
    public final void rule__ScenarioTypeAndParticipants__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:892:1: ( rule__ScenarioTypeAndParticipants__Group_1__3__Impl )
            // InternalDsl.g:893:2: rule__ScenarioTypeAndParticipants__Group_1__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ScenarioTypeAndParticipants__Group_1__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScenarioTypeAndParticipants__Group_1__3"


    // $ANTLR start "rule__ScenarioTypeAndParticipants__Group_1__3__Impl"
    // InternalDsl.g:899:1: rule__ScenarioTypeAndParticipants__Group_1__3__Impl : ( ( rule__ScenarioTypeAndParticipants__ParticipantsAssignment_1_3 )* ) ;
    public final void rule__ScenarioTypeAndParticipants__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:903:1: ( ( ( rule__ScenarioTypeAndParticipants__ParticipantsAssignment_1_3 )* ) )
            // InternalDsl.g:904:1: ( ( rule__ScenarioTypeAndParticipants__ParticipantsAssignment_1_3 )* )
            {
            // InternalDsl.g:904:1: ( ( rule__ScenarioTypeAndParticipants__ParticipantsAssignment_1_3 )* )
            // InternalDsl.g:905:2: ( rule__ScenarioTypeAndParticipants__ParticipantsAssignment_1_3 )*
            {
             before(grammarAccess.getScenarioTypeAndParticipantsAccess().getParticipantsAssignment_1_3()); 
            // InternalDsl.g:906:2: ( rule__ScenarioTypeAndParticipants__ParticipantsAssignment_1_3 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==26||LA12_0==28) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalDsl.g:906:3: rule__ScenarioTypeAndParticipants__ParticipantsAssignment_1_3
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__ScenarioTypeAndParticipants__ParticipantsAssignment_1_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getScenarioTypeAndParticipantsAccess().getParticipantsAssignment_1_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScenarioTypeAndParticipants__Group_1__3__Impl"


    // $ANTLR start "rule__ScenarioTypeAndParticipants__Group_2__0"
    // InternalDsl.g:915:1: rule__ScenarioTypeAndParticipants__Group_2__0 : rule__ScenarioTypeAndParticipants__Group_2__0__Impl rule__ScenarioTypeAndParticipants__Group_2__1 ;
    public final void rule__ScenarioTypeAndParticipants__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:919:1: ( rule__ScenarioTypeAndParticipants__Group_2__0__Impl rule__ScenarioTypeAndParticipants__Group_2__1 )
            // InternalDsl.g:920:2: rule__ScenarioTypeAndParticipants__Group_2__0__Impl rule__ScenarioTypeAndParticipants__Group_2__1
            {
            pushFollow(FOLLOW_7);
            rule__ScenarioTypeAndParticipants__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ScenarioTypeAndParticipants__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScenarioTypeAndParticipants__Group_2__0"


    // $ANTLR start "rule__ScenarioTypeAndParticipants__Group_2__0__Impl"
    // InternalDsl.g:927:1: rule__ScenarioTypeAndParticipants__Group_2__0__Impl : ( 'Physical' ) ;
    public final void rule__ScenarioTypeAndParticipants__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:931:1: ( ( 'Physical' ) )
            // InternalDsl.g:932:1: ( 'Physical' )
            {
            // InternalDsl.g:932:1: ( 'Physical' )
            // InternalDsl.g:933:2: 'Physical'
            {
             before(grammarAccess.getScenarioTypeAndParticipantsAccess().getPhysicalKeyword_2_0()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getScenarioTypeAndParticipantsAccess().getPhysicalKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScenarioTypeAndParticipants__Group_2__0__Impl"


    // $ANTLR start "rule__ScenarioTypeAndParticipants__Group_2__1"
    // InternalDsl.g:942:1: rule__ScenarioTypeAndParticipants__Group_2__1 : rule__ScenarioTypeAndParticipants__Group_2__1__Impl rule__ScenarioTypeAndParticipants__Group_2__2 ;
    public final void rule__ScenarioTypeAndParticipants__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:946:1: ( rule__ScenarioTypeAndParticipants__Group_2__1__Impl rule__ScenarioTypeAndParticipants__Group_2__2 )
            // InternalDsl.g:947:2: rule__ScenarioTypeAndParticipants__Group_2__1__Impl rule__ScenarioTypeAndParticipants__Group_2__2
            {
            pushFollow(FOLLOW_8);
            rule__ScenarioTypeAndParticipants__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ScenarioTypeAndParticipants__Group_2__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScenarioTypeAndParticipants__Group_2__1"


    // $ANTLR start "rule__ScenarioTypeAndParticipants__Group_2__1__Impl"
    // InternalDsl.g:954:1: rule__ScenarioTypeAndParticipants__Group_2__1__Impl : ( ( rule__ScenarioTypeAndParticipants__Alternatives_2_1 ) ) ;
    public final void rule__ScenarioTypeAndParticipants__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:958:1: ( ( ( rule__ScenarioTypeAndParticipants__Alternatives_2_1 ) ) )
            // InternalDsl.g:959:1: ( ( rule__ScenarioTypeAndParticipants__Alternatives_2_1 ) )
            {
            // InternalDsl.g:959:1: ( ( rule__ScenarioTypeAndParticipants__Alternatives_2_1 ) )
            // InternalDsl.g:960:2: ( rule__ScenarioTypeAndParticipants__Alternatives_2_1 )
            {
             before(grammarAccess.getScenarioTypeAndParticipantsAccess().getAlternatives_2_1()); 
            // InternalDsl.g:961:2: ( rule__ScenarioTypeAndParticipants__Alternatives_2_1 )
            // InternalDsl.g:961:3: rule__ScenarioTypeAndParticipants__Alternatives_2_1
            {
            pushFollow(FOLLOW_2);
            rule__ScenarioTypeAndParticipants__Alternatives_2_1();

            state._fsp--;


            }

             after(grammarAccess.getScenarioTypeAndParticipantsAccess().getAlternatives_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScenarioTypeAndParticipants__Group_2__1__Impl"


    // $ANTLR start "rule__ScenarioTypeAndParticipants__Group_2__2"
    // InternalDsl.g:969:1: rule__ScenarioTypeAndParticipants__Group_2__2 : rule__ScenarioTypeAndParticipants__Group_2__2__Impl rule__ScenarioTypeAndParticipants__Group_2__3 ;
    public final void rule__ScenarioTypeAndParticipants__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:973:1: ( rule__ScenarioTypeAndParticipants__Group_2__2__Impl rule__ScenarioTypeAndParticipants__Group_2__3 )
            // InternalDsl.g:974:2: rule__ScenarioTypeAndParticipants__Group_2__2__Impl rule__ScenarioTypeAndParticipants__Group_2__3
            {
            pushFollow(FOLLOW_11);
            rule__ScenarioTypeAndParticipants__Group_2__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ScenarioTypeAndParticipants__Group_2__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScenarioTypeAndParticipants__Group_2__2"


    // $ANTLR start "rule__ScenarioTypeAndParticipants__Group_2__2__Impl"
    // InternalDsl.g:981:1: rule__ScenarioTypeAndParticipants__Group_2__2__Impl : ( ( rule__ScenarioTypeAndParticipants__NameAssignment_2_2 ) ) ;
    public final void rule__ScenarioTypeAndParticipants__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:985:1: ( ( ( rule__ScenarioTypeAndParticipants__NameAssignment_2_2 ) ) )
            // InternalDsl.g:986:1: ( ( rule__ScenarioTypeAndParticipants__NameAssignment_2_2 ) )
            {
            // InternalDsl.g:986:1: ( ( rule__ScenarioTypeAndParticipants__NameAssignment_2_2 ) )
            // InternalDsl.g:987:2: ( rule__ScenarioTypeAndParticipants__NameAssignment_2_2 )
            {
             before(grammarAccess.getScenarioTypeAndParticipantsAccess().getNameAssignment_2_2()); 
            // InternalDsl.g:988:2: ( rule__ScenarioTypeAndParticipants__NameAssignment_2_2 )
            // InternalDsl.g:988:3: rule__ScenarioTypeAndParticipants__NameAssignment_2_2
            {
            pushFollow(FOLLOW_2);
            rule__ScenarioTypeAndParticipants__NameAssignment_2_2();

            state._fsp--;


            }

             after(grammarAccess.getScenarioTypeAndParticipantsAccess().getNameAssignment_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScenarioTypeAndParticipants__Group_2__2__Impl"


    // $ANTLR start "rule__ScenarioTypeAndParticipants__Group_2__3"
    // InternalDsl.g:996:1: rule__ScenarioTypeAndParticipants__Group_2__3 : rule__ScenarioTypeAndParticipants__Group_2__3__Impl ;
    public final void rule__ScenarioTypeAndParticipants__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1000:1: ( rule__ScenarioTypeAndParticipants__Group_2__3__Impl )
            // InternalDsl.g:1001:2: rule__ScenarioTypeAndParticipants__Group_2__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ScenarioTypeAndParticipants__Group_2__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScenarioTypeAndParticipants__Group_2__3"


    // $ANTLR start "rule__ScenarioTypeAndParticipants__Group_2__3__Impl"
    // InternalDsl.g:1007:1: rule__ScenarioTypeAndParticipants__Group_2__3__Impl : ( ( rule__ScenarioTypeAndParticipants__ParticipantAssignment_2_3 )* ) ;
    public final void rule__ScenarioTypeAndParticipants__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1011:1: ( ( ( rule__ScenarioTypeAndParticipants__ParticipantAssignment_2_3 )* ) )
            // InternalDsl.g:1012:1: ( ( rule__ScenarioTypeAndParticipants__ParticipantAssignment_2_3 )* )
            {
            // InternalDsl.g:1012:1: ( ( rule__ScenarioTypeAndParticipants__ParticipantAssignment_2_3 )* )
            // InternalDsl.g:1013:2: ( rule__ScenarioTypeAndParticipants__ParticipantAssignment_2_3 )*
            {
             before(grammarAccess.getScenarioTypeAndParticipantsAccess().getParticipantAssignment_2_3()); 
            // InternalDsl.g:1014:2: ( rule__ScenarioTypeAndParticipants__ParticipantAssignment_2_3 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==26||LA13_0==28) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalDsl.g:1014:3: rule__ScenarioTypeAndParticipants__ParticipantAssignment_2_3
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__ScenarioTypeAndParticipants__ParticipantAssignment_2_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

             after(grammarAccess.getScenarioTypeAndParticipantsAccess().getParticipantAssignment_2_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScenarioTypeAndParticipants__Group_2__3__Impl"


    // $ANTLR start "rule__ScenarioTypeAndParticipants__Group_3__0"
    // InternalDsl.g:1023:1: rule__ScenarioTypeAndParticipants__Group_3__0 : rule__ScenarioTypeAndParticipants__Group_3__0__Impl rule__ScenarioTypeAndParticipants__Group_3__1 ;
    public final void rule__ScenarioTypeAndParticipants__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1027:1: ( rule__ScenarioTypeAndParticipants__Group_3__0__Impl rule__ScenarioTypeAndParticipants__Group_3__1 )
            // InternalDsl.g:1028:2: rule__ScenarioTypeAndParticipants__Group_3__0__Impl rule__ScenarioTypeAndParticipants__Group_3__1
            {
            pushFollow(FOLLOW_13);
            rule__ScenarioTypeAndParticipants__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ScenarioTypeAndParticipants__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScenarioTypeAndParticipants__Group_3__0"


    // $ANTLR start "rule__ScenarioTypeAndParticipants__Group_3__0__Impl"
    // InternalDsl.g:1035:1: rule__ScenarioTypeAndParticipants__Group_3__0__Impl : ( ( rule__ScenarioTypeAndParticipants__Alternatives_3_0 ) ) ;
    public final void rule__ScenarioTypeAndParticipants__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1039:1: ( ( ( rule__ScenarioTypeAndParticipants__Alternatives_3_0 ) ) )
            // InternalDsl.g:1040:1: ( ( rule__ScenarioTypeAndParticipants__Alternatives_3_0 ) )
            {
            // InternalDsl.g:1040:1: ( ( rule__ScenarioTypeAndParticipants__Alternatives_3_0 ) )
            // InternalDsl.g:1041:2: ( rule__ScenarioTypeAndParticipants__Alternatives_3_0 )
            {
             before(grammarAccess.getScenarioTypeAndParticipantsAccess().getAlternatives_3_0()); 
            // InternalDsl.g:1042:2: ( rule__ScenarioTypeAndParticipants__Alternatives_3_0 )
            // InternalDsl.g:1042:3: rule__ScenarioTypeAndParticipants__Alternatives_3_0
            {
            pushFollow(FOLLOW_2);
            rule__ScenarioTypeAndParticipants__Alternatives_3_0();

            state._fsp--;


            }

             after(grammarAccess.getScenarioTypeAndParticipantsAccess().getAlternatives_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScenarioTypeAndParticipants__Group_3__0__Impl"


    // $ANTLR start "rule__ScenarioTypeAndParticipants__Group_3__1"
    // InternalDsl.g:1050:1: rule__ScenarioTypeAndParticipants__Group_3__1 : rule__ScenarioTypeAndParticipants__Group_3__1__Impl rule__ScenarioTypeAndParticipants__Group_3__2 ;
    public final void rule__ScenarioTypeAndParticipants__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1054:1: ( rule__ScenarioTypeAndParticipants__Group_3__1__Impl rule__ScenarioTypeAndParticipants__Group_3__2 )
            // InternalDsl.g:1055:2: rule__ScenarioTypeAndParticipants__Group_3__1__Impl rule__ScenarioTypeAndParticipants__Group_3__2
            {
            pushFollow(FOLLOW_8);
            rule__ScenarioTypeAndParticipants__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ScenarioTypeAndParticipants__Group_3__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScenarioTypeAndParticipants__Group_3__1"


    // $ANTLR start "rule__ScenarioTypeAndParticipants__Group_3__1__Impl"
    // InternalDsl.g:1062:1: rule__ScenarioTypeAndParticipants__Group_3__1__Impl : ( 'FS' ) ;
    public final void rule__ScenarioTypeAndParticipants__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1066:1: ( ( 'FS' ) )
            // InternalDsl.g:1067:1: ( 'FS' )
            {
            // InternalDsl.g:1067:1: ( 'FS' )
            // InternalDsl.g:1068:2: 'FS'
            {
             before(grammarAccess.getScenarioTypeAndParticipantsAccess().getFSKeyword_3_1()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getScenarioTypeAndParticipantsAccess().getFSKeyword_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScenarioTypeAndParticipants__Group_3__1__Impl"


    // $ANTLR start "rule__ScenarioTypeAndParticipants__Group_3__2"
    // InternalDsl.g:1077:1: rule__ScenarioTypeAndParticipants__Group_3__2 : rule__ScenarioTypeAndParticipants__Group_3__2__Impl rule__ScenarioTypeAndParticipants__Group_3__3 ;
    public final void rule__ScenarioTypeAndParticipants__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1081:1: ( rule__ScenarioTypeAndParticipants__Group_3__2__Impl rule__ScenarioTypeAndParticipants__Group_3__3 )
            // InternalDsl.g:1082:2: rule__ScenarioTypeAndParticipants__Group_3__2__Impl rule__ScenarioTypeAndParticipants__Group_3__3
            {
            pushFollow(FOLLOW_14);
            rule__ScenarioTypeAndParticipants__Group_3__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ScenarioTypeAndParticipants__Group_3__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScenarioTypeAndParticipants__Group_3__2"


    // $ANTLR start "rule__ScenarioTypeAndParticipants__Group_3__2__Impl"
    // InternalDsl.g:1089:1: rule__ScenarioTypeAndParticipants__Group_3__2__Impl : ( ( rule__ScenarioTypeAndParticipants__NameAssignment_3_2 ) ) ;
    public final void rule__ScenarioTypeAndParticipants__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1093:1: ( ( ( rule__ScenarioTypeAndParticipants__NameAssignment_3_2 ) ) )
            // InternalDsl.g:1094:1: ( ( rule__ScenarioTypeAndParticipants__NameAssignment_3_2 ) )
            {
            // InternalDsl.g:1094:1: ( ( rule__ScenarioTypeAndParticipants__NameAssignment_3_2 ) )
            // InternalDsl.g:1095:2: ( rule__ScenarioTypeAndParticipants__NameAssignment_3_2 )
            {
             before(grammarAccess.getScenarioTypeAndParticipantsAccess().getNameAssignment_3_2()); 
            // InternalDsl.g:1096:2: ( rule__ScenarioTypeAndParticipants__NameAssignment_3_2 )
            // InternalDsl.g:1096:3: rule__ScenarioTypeAndParticipants__NameAssignment_3_2
            {
            pushFollow(FOLLOW_2);
            rule__ScenarioTypeAndParticipants__NameAssignment_3_2();

            state._fsp--;


            }

             after(grammarAccess.getScenarioTypeAndParticipantsAccess().getNameAssignment_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScenarioTypeAndParticipants__Group_3__2__Impl"


    // $ANTLR start "rule__ScenarioTypeAndParticipants__Group_3__3"
    // InternalDsl.g:1104:1: rule__ScenarioTypeAndParticipants__Group_3__3 : rule__ScenarioTypeAndParticipants__Group_3__3__Impl ;
    public final void rule__ScenarioTypeAndParticipants__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1108:1: ( rule__ScenarioTypeAndParticipants__Group_3__3__Impl )
            // InternalDsl.g:1109:2: rule__ScenarioTypeAndParticipants__Group_3__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ScenarioTypeAndParticipants__Group_3__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScenarioTypeAndParticipants__Group_3__3"


    // $ANTLR start "rule__ScenarioTypeAndParticipants__Group_3__3__Impl"
    // InternalDsl.g:1115:1: rule__ScenarioTypeAndParticipants__Group_3__3__Impl : ( ( rule__ScenarioTypeAndParticipants__ParticipantsAssignment_3_3 )* ) ;
    public final void rule__ScenarioTypeAndParticipants__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1119:1: ( ( ( rule__ScenarioTypeAndParticipants__ParticipantsAssignment_3_3 )* ) )
            // InternalDsl.g:1120:1: ( ( rule__ScenarioTypeAndParticipants__ParticipantsAssignment_3_3 )* )
            {
            // InternalDsl.g:1120:1: ( ( rule__ScenarioTypeAndParticipants__ParticipantsAssignment_3_3 )* )
            // InternalDsl.g:1121:2: ( rule__ScenarioTypeAndParticipants__ParticipantsAssignment_3_3 )*
            {
             before(grammarAccess.getScenarioTypeAndParticipantsAccess().getParticipantsAssignment_3_3()); 
            // InternalDsl.g:1122:2: ( rule__ScenarioTypeAndParticipants__ParticipantsAssignment_3_3 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==30) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalDsl.g:1122:3: rule__ScenarioTypeAndParticipants__ParticipantsAssignment_3_3
            	    {
            	    pushFollow(FOLLOW_15);
            	    rule__ScenarioTypeAndParticipants__ParticipantsAssignment_3_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

             after(grammarAccess.getScenarioTypeAndParticipantsAccess().getParticipantsAssignment_3_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScenarioTypeAndParticipants__Group_3__3__Impl"


    // $ANTLR start "rule__ScenarioTypeAndParticipants__Group_4__0"
    // InternalDsl.g:1131:1: rule__ScenarioTypeAndParticipants__Group_4__0 : rule__ScenarioTypeAndParticipants__Group_4__0__Impl rule__ScenarioTypeAndParticipants__Group_4__1 ;
    public final void rule__ScenarioTypeAndParticipants__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1135:1: ( rule__ScenarioTypeAndParticipants__Group_4__0__Impl rule__ScenarioTypeAndParticipants__Group_4__1 )
            // InternalDsl.g:1136:2: rule__ScenarioTypeAndParticipants__Group_4__0__Impl rule__ScenarioTypeAndParticipants__Group_4__1
            {
            pushFollow(FOLLOW_16);
            rule__ScenarioTypeAndParticipants__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ScenarioTypeAndParticipants__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScenarioTypeAndParticipants__Group_4__0"


    // $ANTLR start "rule__ScenarioTypeAndParticipants__Group_4__0__Impl"
    // InternalDsl.g:1143:1: rule__ScenarioTypeAndParticipants__Group_4__0__Impl : ( 'EPBS' ) ;
    public final void rule__ScenarioTypeAndParticipants__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1147:1: ( ( 'EPBS' ) )
            // InternalDsl.g:1148:1: ( 'EPBS' )
            {
            // InternalDsl.g:1148:1: ( 'EPBS' )
            // InternalDsl.g:1149:2: 'EPBS'
            {
             before(grammarAccess.getScenarioTypeAndParticipantsAccess().getEPBSKeyword_4_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getScenarioTypeAndParticipantsAccess().getEPBSKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScenarioTypeAndParticipants__Group_4__0__Impl"


    // $ANTLR start "rule__ScenarioTypeAndParticipants__Group_4__1"
    // InternalDsl.g:1158:1: rule__ScenarioTypeAndParticipants__Group_4__1 : rule__ScenarioTypeAndParticipants__Group_4__1__Impl rule__ScenarioTypeAndParticipants__Group_4__2 ;
    public final void rule__ScenarioTypeAndParticipants__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1162:1: ( rule__ScenarioTypeAndParticipants__Group_4__1__Impl rule__ScenarioTypeAndParticipants__Group_4__2 )
            // InternalDsl.g:1163:2: rule__ScenarioTypeAndParticipants__Group_4__1__Impl rule__ScenarioTypeAndParticipants__Group_4__2
            {
            pushFollow(FOLLOW_8);
            rule__ScenarioTypeAndParticipants__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ScenarioTypeAndParticipants__Group_4__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScenarioTypeAndParticipants__Group_4__1"


    // $ANTLR start "rule__ScenarioTypeAndParticipants__Group_4__1__Impl"
    // InternalDsl.g:1170:1: rule__ScenarioTypeAndParticipants__Group_4__1__Impl : ( 'IS' ) ;
    public final void rule__ScenarioTypeAndParticipants__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1174:1: ( ( 'IS' ) )
            // InternalDsl.g:1175:1: ( 'IS' )
            {
            // InternalDsl.g:1175:1: ( 'IS' )
            // InternalDsl.g:1176:2: 'IS'
            {
             before(grammarAccess.getScenarioTypeAndParticipantsAccess().getISKeyword_4_1()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getScenarioTypeAndParticipantsAccess().getISKeyword_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScenarioTypeAndParticipants__Group_4__1__Impl"


    // $ANTLR start "rule__ScenarioTypeAndParticipants__Group_4__2"
    // InternalDsl.g:1185:1: rule__ScenarioTypeAndParticipants__Group_4__2 : rule__ScenarioTypeAndParticipants__Group_4__2__Impl rule__ScenarioTypeAndParticipants__Group_4__3 ;
    public final void rule__ScenarioTypeAndParticipants__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1189:1: ( rule__ScenarioTypeAndParticipants__Group_4__2__Impl rule__ScenarioTypeAndParticipants__Group_4__3 )
            // InternalDsl.g:1190:2: rule__ScenarioTypeAndParticipants__Group_4__2__Impl rule__ScenarioTypeAndParticipants__Group_4__3
            {
            pushFollow(FOLLOW_17);
            rule__ScenarioTypeAndParticipants__Group_4__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ScenarioTypeAndParticipants__Group_4__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScenarioTypeAndParticipants__Group_4__2"


    // $ANTLR start "rule__ScenarioTypeAndParticipants__Group_4__2__Impl"
    // InternalDsl.g:1197:1: rule__ScenarioTypeAndParticipants__Group_4__2__Impl : ( ( rule__ScenarioTypeAndParticipants__NameAssignment_4_2 ) ) ;
    public final void rule__ScenarioTypeAndParticipants__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1201:1: ( ( ( rule__ScenarioTypeAndParticipants__NameAssignment_4_2 ) ) )
            // InternalDsl.g:1202:1: ( ( rule__ScenarioTypeAndParticipants__NameAssignment_4_2 ) )
            {
            // InternalDsl.g:1202:1: ( ( rule__ScenarioTypeAndParticipants__NameAssignment_4_2 ) )
            // InternalDsl.g:1203:2: ( rule__ScenarioTypeAndParticipants__NameAssignment_4_2 )
            {
             before(grammarAccess.getScenarioTypeAndParticipantsAccess().getNameAssignment_4_2()); 
            // InternalDsl.g:1204:2: ( rule__ScenarioTypeAndParticipants__NameAssignment_4_2 )
            // InternalDsl.g:1204:3: rule__ScenarioTypeAndParticipants__NameAssignment_4_2
            {
            pushFollow(FOLLOW_2);
            rule__ScenarioTypeAndParticipants__NameAssignment_4_2();

            state._fsp--;


            }

             after(grammarAccess.getScenarioTypeAndParticipantsAccess().getNameAssignment_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScenarioTypeAndParticipants__Group_4__2__Impl"


    // $ANTLR start "rule__ScenarioTypeAndParticipants__Group_4__3"
    // InternalDsl.g:1212:1: rule__ScenarioTypeAndParticipants__Group_4__3 : rule__ScenarioTypeAndParticipants__Group_4__3__Impl ;
    public final void rule__ScenarioTypeAndParticipants__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1216:1: ( rule__ScenarioTypeAndParticipants__Group_4__3__Impl )
            // InternalDsl.g:1217:2: rule__ScenarioTypeAndParticipants__Group_4__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ScenarioTypeAndParticipants__Group_4__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScenarioTypeAndParticipants__Group_4__3"


    // $ANTLR start "rule__ScenarioTypeAndParticipants__Group_4__3__Impl"
    // InternalDsl.g:1223:1: rule__ScenarioTypeAndParticipants__Group_4__3__Impl : ( ( rule__ScenarioTypeAndParticipants__ParticipantsAssignment_4_3 )* ) ;
    public final void rule__ScenarioTypeAndParticipants__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1227:1: ( ( ( rule__ScenarioTypeAndParticipants__ParticipantsAssignment_4_3 )* ) )
            // InternalDsl.g:1228:1: ( ( rule__ScenarioTypeAndParticipants__ParticipantsAssignment_4_3 )* )
            {
            // InternalDsl.g:1228:1: ( ( rule__ScenarioTypeAndParticipants__ParticipantsAssignment_4_3 )* )
            // InternalDsl.g:1229:2: ( rule__ScenarioTypeAndParticipants__ParticipantsAssignment_4_3 )*
            {
             before(grammarAccess.getScenarioTypeAndParticipantsAccess().getParticipantsAssignment_4_3()); 
            // InternalDsl.g:1230:2: ( rule__ScenarioTypeAndParticipants__ParticipantsAssignment_4_3 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==29) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalDsl.g:1230:3: rule__ScenarioTypeAndParticipants__ParticipantsAssignment_4_3
            	    {
            	    pushFollow(FOLLOW_18);
            	    rule__ScenarioTypeAndParticipants__ParticipantsAssignment_4_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

             after(grammarAccess.getScenarioTypeAndParticipantsAccess().getParticipantsAssignment_4_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScenarioTypeAndParticipants__Group_4__3__Impl"


    // $ANTLR start "rule__ScenarioTypeAndParticipants__Group_5__0"
    // InternalDsl.g:1239:1: rule__ScenarioTypeAndParticipants__Group_5__0 : rule__ScenarioTypeAndParticipants__Group_5__0__Impl rule__ScenarioTypeAndParticipants__Group_5__1 ;
    public final void rule__ScenarioTypeAndParticipants__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1243:1: ( rule__ScenarioTypeAndParticipants__Group_5__0__Impl rule__ScenarioTypeAndParticipants__Group_5__1 )
            // InternalDsl.g:1244:2: rule__ScenarioTypeAndParticipants__Group_5__0__Impl rule__ScenarioTypeAndParticipants__Group_5__1
            {
            pushFollow(FOLLOW_8);
            rule__ScenarioTypeAndParticipants__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ScenarioTypeAndParticipants__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScenarioTypeAndParticipants__Group_5__0"


    // $ANTLR start "rule__ScenarioTypeAndParticipants__Group_5__0__Impl"
    // InternalDsl.g:1251:1: rule__ScenarioTypeAndParticipants__Group_5__0__Impl : ( 'OAS' ) ;
    public final void rule__ScenarioTypeAndParticipants__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1255:1: ( ( 'OAS' ) )
            // InternalDsl.g:1256:1: ( 'OAS' )
            {
            // InternalDsl.g:1256:1: ( 'OAS' )
            // InternalDsl.g:1257:2: 'OAS'
            {
             before(grammarAccess.getScenarioTypeAndParticipantsAccess().getOASKeyword_5_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getScenarioTypeAndParticipantsAccess().getOASKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScenarioTypeAndParticipants__Group_5__0__Impl"


    // $ANTLR start "rule__ScenarioTypeAndParticipants__Group_5__1"
    // InternalDsl.g:1266:1: rule__ScenarioTypeAndParticipants__Group_5__1 : rule__ScenarioTypeAndParticipants__Group_5__1__Impl rule__ScenarioTypeAndParticipants__Group_5__2 ;
    public final void rule__ScenarioTypeAndParticipants__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1270:1: ( rule__ScenarioTypeAndParticipants__Group_5__1__Impl rule__ScenarioTypeAndParticipants__Group_5__2 )
            // InternalDsl.g:1271:2: rule__ScenarioTypeAndParticipants__Group_5__1__Impl rule__ScenarioTypeAndParticipants__Group_5__2
            {
            pushFollow(FOLLOW_19);
            rule__ScenarioTypeAndParticipants__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ScenarioTypeAndParticipants__Group_5__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScenarioTypeAndParticipants__Group_5__1"


    // $ANTLR start "rule__ScenarioTypeAndParticipants__Group_5__1__Impl"
    // InternalDsl.g:1278:1: rule__ScenarioTypeAndParticipants__Group_5__1__Impl : ( ( rule__ScenarioTypeAndParticipants__NameAssignment_5_1 ) ) ;
    public final void rule__ScenarioTypeAndParticipants__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1282:1: ( ( ( rule__ScenarioTypeAndParticipants__NameAssignment_5_1 ) ) )
            // InternalDsl.g:1283:1: ( ( rule__ScenarioTypeAndParticipants__NameAssignment_5_1 ) )
            {
            // InternalDsl.g:1283:1: ( ( rule__ScenarioTypeAndParticipants__NameAssignment_5_1 ) )
            // InternalDsl.g:1284:2: ( rule__ScenarioTypeAndParticipants__NameAssignment_5_1 )
            {
             before(grammarAccess.getScenarioTypeAndParticipantsAccess().getNameAssignment_5_1()); 
            // InternalDsl.g:1285:2: ( rule__ScenarioTypeAndParticipants__NameAssignment_5_1 )
            // InternalDsl.g:1285:3: rule__ScenarioTypeAndParticipants__NameAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__ScenarioTypeAndParticipants__NameAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getScenarioTypeAndParticipantsAccess().getNameAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScenarioTypeAndParticipants__Group_5__1__Impl"


    // $ANTLR start "rule__ScenarioTypeAndParticipants__Group_5__2"
    // InternalDsl.g:1293:1: rule__ScenarioTypeAndParticipants__Group_5__2 : rule__ScenarioTypeAndParticipants__Group_5__2__Impl ;
    public final void rule__ScenarioTypeAndParticipants__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1297:1: ( rule__ScenarioTypeAndParticipants__Group_5__2__Impl )
            // InternalDsl.g:1298:2: rule__ScenarioTypeAndParticipants__Group_5__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ScenarioTypeAndParticipants__Group_5__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScenarioTypeAndParticipants__Group_5__2"


    // $ANTLR start "rule__ScenarioTypeAndParticipants__Group_5__2__Impl"
    // InternalDsl.g:1304:1: rule__ScenarioTypeAndParticipants__Group_5__2__Impl : ( ( rule__ScenarioTypeAndParticipants__ParticipantsAssignment_5_2 )* ) ;
    public final void rule__ScenarioTypeAndParticipants__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1308:1: ( ( ( rule__ScenarioTypeAndParticipants__ParticipantsAssignment_5_2 )* ) )
            // InternalDsl.g:1309:1: ( ( rule__ScenarioTypeAndParticipants__ParticipantsAssignment_5_2 )* )
            {
            // InternalDsl.g:1309:1: ( ( rule__ScenarioTypeAndParticipants__ParticipantsAssignment_5_2 )* )
            // InternalDsl.g:1310:2: ( rule__ScenarioTypeAndParticipants__ParticipantsAssignment_5_2 )*
            {
             before(grammarAccess.getScenarioTypeAndParticipantsAccess().getParticipantsAssignment_5_2()); 
            // InternalDsl.g:1311:2: ( rule__ScenarioTypeAndParticipants__ParticipantsAssignment_5_2 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==31) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalDsl.g:1311:3: rule__ScenarioTypeAndParticipants__ParticipantsAssignment_5_2
            	    {
            	    pushFollow(FOLLOW_20);
            	    rule__ScenarioTypeAndParticipants__ParticipantsAssignment_5_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

             after(grammarAccess.getScenarioTypeAndParticipantsAccess().getParticipantsAssignment_5_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScenarioTypeAndParticipants__Group_5__2__Impl"


    // $ANTLR start "rule__ScenarioTypeAndParticipants__Group_6__0"
    // InternalDsl.g:1320:1: rule__ScenarioTypeAndParticipants__Group_6__0 : rule__ScenarioTypeAndParticipants__Group_6__0__Impl rule__ScenarioTypeAndParticipants__Group_6__1 ;
    public final void rule__ScenarioTypeAndParticipants__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1324:1: ( rule__ScenarioTypeAndParticipants__Group_6__0__Impl rule__ScenarioTypeAndParticipants__Group_6__1 )
            // InternalDsl.g:1325:2: rule__ScenarioTypeAndParticipants__Group_6__0__Impl rule__ScenarioTypeAndParticipants__Group_6__1
            {
            pushFollow(FOLLOW_8);
            rule__ScenarioTypeAndParticipants__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ScenarioTypeAndParticipants__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScenarioTypeAndParticipants__Group_6__0"


    // $ANTLR start "rule__ScenarioTypeAndParticipants__Group_6__0__Impl"
    // InternalDsl.g:1332:1: rule__ScenarioTypeAndParticipants__Group_6__0__Impl : ( 'OES' ) ;
    public final void rule__ScenarioTypeAndParticipants__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1336:1: ( ( 'OES' ) )
            // InternalDsl.g:1337:1: ( 'OES' )
            {
            // InternalDsl.g:1337:1: ( 'OES' )
            // InternalDsl.g:1338:2: 'OES'
            {
             before(grammarAccess.getScenarioTypeAndParticipantsAccess().getOESKeyword_6_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getScenarioTypeAndParticipantsAccess().getOESKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScenarioTypeAndParticipants__Group_6__0__Impl"


    // $ANTLR start "rule__ScenarioTypeAndParticipants__Group_6__1"
    // InternalDsl.g:1347:1: rule__ScenarioTypeAndParticipants__Group_6__1 : rule__ScenarioTypeAndParticipants__Group_6__1__Impl rule__ScenarioTypeAndParticipants__Group_6__2 ;
    public final void rule__ScenarioTypeAndParticipants__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1351:1: ( rule__ScenarioTypeAndParticipants__Group_6__1__Impl rule__ScenarioTypeAndParticipants__Group_6__2 )
            // InternalDsl.g:1352:2: rule__ScenarioTypeAndParticipants__Group_6__1__Impl rule__ScenarioTypeAndParticipants__Group_6__2
            {
            pushFollow(FOLLOW_21);
            rule__ScenarioTypeAndParticipants__Group_6__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ScenarioTypeAndParticipants__Group_6__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScenarioTypeAndParticipants__Group_6__1"


    // $ANTLR start "rule__ScenarioTypeAndParticipants__Group_6__1__Impl"
    // InternalDsl.g:1359:1: rule__ScenarioTypeAndParticipants__Group_6__1__Impl : ( ( rule__ScenarioTypeAndParticipants__NameAssignment_6_1 ) ) ;
    public final void rule__ScenarioTypeAndParticipants__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1363:1: ( ( ( rule__ScenarioTypeAndParticipants__NameAssignment_6_1 ) ) )
            // InternalDsl.g:1364:1: ( ( rule__ScenarioTypeAndParticipants__NameAssignment_6_1 ) )
            {
            // InternalDsl.g:1364:1: ( ( rule__ScenarioTypeAndParticipants__NameAssignment_6_1 ) )
            // InternalDsl.g:1365:2: ( rule__ScenarioTypeAndParticipants__NameAssignment_6_1 )
            {
             before(grammarAccess.getScenarioTypeAndParticipantsAccess().getNameAssignment_6_1()); 
            // InternalDsl.g:1366:2: ( rule__ScenarioTypeAndParticipants__NameAssignment_6_1 )
            // InternalDsl.g:1366:3: rule__ScenarioTypeAndParticipants__NameAssignment_6_1
            {
            pushFollow(FOLLOW_2);
            rule__ScenarioTypeAndParticipants__NameAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getScenarioTypeAndParticipantsAccess().getNameAssignment_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScenarioTypeAndParticipants__Group_6__1__Impl"


    // $ANTLR start "rule__ScenarioTypeAndParticipants__Group_6__2"
    // InternalDsl.g:1374:1: rule__ScenarioTypeAndParticipants__Group_6__2 : rule__ScenarioTypeAndParticipants__Group_6__2__Impl ;
    public final void rule__ScenarioTypeAndParticipants__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1378:1: ( rule__ScenarioTypeAndParticipants__Group_6__2__Impl )
            // InternalDsl.g:1379:2: rule__ScenarioTypeAndParticipants__Group_6__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ScenarioTypeAndParticipants__Group_6__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScenarioTypeAndParticipants__Group_6__2"


    // $ANTLR start "rule__ScenarioTypeAndParticipants__Group_6__2__Impl"
    // InternalDsl.g:1385:1: rule__ScenarioTypeAndParticipants__Group_6__2__Impl : ( ( rule__ScenarioTypeAndParticipants__ParticipantsAssignment_6_2 )* ) ;
    public final void rule__ScenarioTypeAndParticipants__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1389:1: ( ( ( rule__ScenarioTypeAndParticipants__ParticipantsAssignment_6_2 )* ) )
            // InternalDsl.g:1390:1: ( ( rule__ScenarioTypeAndParticipants__ParticipantsAssignment_6_2 )* )
            {
            // InternalDsl.g:1390:1: ( ( rule__ScenarioTypeAndParticipants__ParticipantsAssignment_6_2 )* )
            // InternalDsl.g:1391:2: ( rule__ScenarioTypeAndParticipants__ParticipantsAssignment_6_2 )*
            {
             before(grammarAccess.getScenarioTypeAndParticipantsAccess().getParticipantsAssignment_6_2()); 
            // InternalDsl.g:1392:2: ( rule__ScenarioTypeAndParticipants__ParticipantsAssignment_6_2 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==26||(LA17_0>=32 && LA17_0<=33)) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalDsl.g:1392:3: rule__ScenarioTypeAndParticipants__ParticipantsAssignment_6_2
            	    {
            	    pushFollow(FOLLOW_22);
            	    rule__ScenarioTypeAndParticipants__ParticipantsAssignment_6_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

             after(grammarAccess.getScenarioTypeAndParticipantsAccess().getParticipantsAssignment_6_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScenarioTypeAndParticipants__Group_6__2__Impl"


    // $ANTLR start "rule__Actor__Group__0"
    // InternalDsl.g:1401:1: rule__Actor__Group__0 : rule__Actor__Group__0__Impl rule__Actor__Group__1 ;
    public final void rule__Actor__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1405:1: ( rule__Actor__Group__0__Impl rule__Actor__Group__1 )
            // InternalDsl.g:1406:2: rule__Actor__Group__0__Impl rule__Actor__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__Actor__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Actor__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Actor__Group__0"


    // $ANTLR start "rule__Actor__Group__0__Impl"
    // InternalDsl.g:1413:1: rule__Actor__Group__0__Impl : ( 'actor' ) ;
    public final void rule__Actor__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1417:1: ( ( 'actor' ) )
            // InternalDsl.g:1418:1: ( 'actor' )
            {
            // InternalDsl.g:1418:1: ( 'actor' )
            // InternalDsl.g:1419:2: 'actor'
            {
             before(grammarAccess.getActorAccess().getActorKeyword_0()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getActorAccess().getActorKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Actor__Group__0__Impl"


    // $ANTLR start "rule__Actor__Group__1"
    // InternalDsl.g:1428:1: rule__Actor__Group__1 : rule__Actor__Group__1__Impl rule__Actor__Group__2 ;
    public final void rule__Actor__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1432:1: ( rule__Actor__Group__1__Impl rule__Actor__Group__2 )
            // InternalDsl.g:1433:2: rule__Actor__Group__1__Impl rule__Actor__Group__2
            {
            pushFollow(FOLLOW_23);
            rule__Actor__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Actor__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Actor__Group__1"


    // $ANTLR start "rule__Actor__Group__1__Impl"
    // InternalDsl.g:1440:1: rule__Actor__Group__1__Impl : ( ( rule__Actor__NameAssignment_1 ) ) ;
    public final void rule__Actor__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1444:1: ( ( ( rule__Actor__NameAssignment_1 ) ) )
            // InternalDsl.g:1445:1: ( ( rule__Actor__NameAssignment_1 ) )
            {
            // InternalDsl.g:1445:1: ( ( rule__Actor__NameAssignment_1 ) )
            // InternalDsl.g:1446:2: ( rule__Actor__NameAssignment_1 )
            {
             before(grammarAccess.getActorAccess().getNameAssignment_1()); 
            // InternalDsl.g:1447:2: ( rule__Actor__NameAssignment_1 )
            // InternalDsl.g:1447:3: rule__Actor__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Actor__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getActorAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Actor__Group__1__Impl"


    // $ANTLR start "rule__Actor__Group__2"
    // InternalDsl.g:1455:1: rule__Actor__Group__2 : rule__Actor__Group__2__Impl rule__Actor__Group__3 ;
    public final void rule__Actor__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1459:1: ( rule__Actor__Group__2__Impl rule__Actor__Group__3 )
            // InternalDsl.g:1460:2: rule__Actor__Group__2__Impl rule__Actor__Group__3
            {
            pushFollow(FOLLOW_24);
            rule__Actor__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Actor__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Actor__Group__2"


    // $ANTLR start "rule__Actor__Group__2__Impl"
    // InternalDsl.g:1467:1: rule__Actor__Group__2__Impl : ( 'as' ) ;
    public final void rule__Actor__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1471:1: ( ( 'as' ) )
            // InternalDsl.g:1472:1: ( 'as' )
            {
            // InternalDsl.g:1472:1: ( 'as' )
            // InternalDsl.g:1473:2: 'as'
            {
             before(grammarAccess.getActorAccess().getAsKeyword_2()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getActorAccess().getAsKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Actor__Group__2__Impl"


    // $ANTLR start "rule__Actor__Group__3"
    // InternalDsl.g:1482:1: rule__Actor__Group__3 : rule__Actor__Group__3__Impl ;
    public final void rule__Actor__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1486:1: ( rule__Actor__Group__3__Impl )
            // InternalDsl.g:1487:2: rule__Actor__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Actor__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Actor__Group__3"


    // $ANTLR start "rule__Actor__Group__3__Impl"
    // InternalDsl.g:1493:1: rule__Actor__Group__3__Impl : ( ( rule__Actor__IdAssignment_3 ) ) ;
    public final void rule__Actor__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1497:1: ( ( ( rule__Actor__IdAssignment_3 ) ) )
            // InternalDsl.g:1498:1: ( ( rule__Actor__IdAssignment_3 ) )
            {
            // InternalDsl.g:1498:1: ( ( rule__Actor__IdAssignment_3 ) )
            // InternalDsl.g:1499:2: ( rule__Actor__IdAssignment_3 )
            {
             before(grammarAccess.getActorAccess().getIdAssignment_3()); 
            // InternalDsl.g:1500:2: ( rule__Actor__IdAssignment_3 )
            // InternalDsl.g:1500:3: rule__Actor__IdAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Actor__IdAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getActorAccess().getIdAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Actor__Group__3__Impl"


    // $ANTLR start "rule__Component__Group__0"
    // InternalDsl.g:1509:1: rule__Component__Group__0 : rule__Component__Group__0__Impl rule__Component__Group__1 ;
    public final void rule__Component__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1513:1: ( rule__Component__Group__0__Impl rule__Component__Group__1 )
            // InternalDsl.g:1514:2: rule__Component__Group__0__Impl rule__Component__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__Component__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Component__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group__0"


    // $ANTLR start "rule__Component__Group__0__Impl"
    // InternalDsl.g:1521:1: rule__Component__Group__0__Impl : ( 'component' ) ;
    public final void rule__Component__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1525:1: ( ( 'component' ) )
            // InternalDsl.g:1526:1: ( 'component' )
            {
            // InternalDsl.g:1526:1: ( 'component' )
            // InternalDsl.g:1527:2: 'component'
            {
             before(grammarAccess.getComponentAccess().getComponentKeyword_0()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getComponentAccess().getComponentKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group__0__Impl"


    // $ANTLR start "rule__Component__Group__1"
    // InternalDsl.g:1536:1: rule__Component__Group__1 : rule__Component__Group__1__Impl rule__Component__Group__2 ;
    public final void rule__Component__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1540:1: ( rule__Component__Group__1__Impl rule__Component__Group__2 )
            // InternalDsl.g:1541:2: rule__Component__Group__1__Impl rule__Component__Group__2
            {
            pushFollow(FOLLOW_23);
            rule__Component__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Component__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group__1"


    // $ANTLR start "rule__Component__Group__1__Impl"
    // InternalDsl.g:1548:1: rule__Component__Group__1__Impl : ( ( rule__Component__NameAssignment_1 ) ) ;
    public final void rule__Component__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1552:1: ( ( ( rule__Component__NameAssignment_1 ) ) )
            // InternalDsl.g:1553:1: ( ( rule__Component__NameAssignment_1 ) )
            {
            // InternalDsl.g:1553:1: ( ( rule__Component__NameAssignment_1 ) )
            // InternalDsl.g:1554:2: ( rule__Component__NameAssignment_1 )
            {
             before(grammarAccess.getComponentAccess().getNameAssignment_1()); 
            // InternalDsl.g:1555:2: ( rule__Component__NameAssignment_1 )
            // InternalDsl.g:1555:3: rule__Component__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Component__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getComponentAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group__1__Impl"


    // $ANTLR start "rule__Component__Group__2"
    // InternalDsl.g:1563:1: rule__Component__Group__2 : rule__Component__Group__2__Impl rule__Component__Group__3 ;
    public final void rule__Component__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1567:1: ( rule__Component__Group__2__Impl rule__Component__Group__3 )
            // InternalDsl.g:1568:2: rule__Component__Group__2__Impl rule__Component__Group__3
            {
            pushFollow(FOLLOW_24);
            rule__Component__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Component__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group__2"


    // $ANTLR start "rule__Component__Group__2__Impl"
    // InternalDsl.g:1575:1: rule__Component__Group__2__Impl : ( 'as' ) ;
    public final void rule__Component__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1579:1: ( ( 'as' ) )
            // InternalDsl.g:1580:1: ( 'as' )
            {
            // InternalDsl.g:1580:1: ( 'as' )
            // InternalDsl.g:1581:2: 'as'
            {
             before(grammarAccess.getComponentAccess().getAsKeyword_2()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getComponentAccess().getAsKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group__2__Impl"


    // $ANTLR start "rule__Component__Group__3"
    // InternalDsl.g:1590:1: rule__Component__Group__3 : rule__Component__Group__3__Impl ;
    public final void rule__Component__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1594:1: ( rule__Component__Group__3__Impl )
            // InternalDsl.g:1595:2: rule__Component__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Component__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group__3"


    // $ANTLR start "rule__Component__Group__3__Impl"
    // InternalDsl.g:1601:1: rule__Component__Group__3__Impl : ( ( rule__Component__IdAssignment_3 ) ) ;
    public final void rule__Component__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1605:1: ( ( ( rule__Component__IdAssignment_3 ) ) )
            // InternalDsl.g:1606:1: ( ( rule__Component__IdAssignment_3 ) )
            {
            // InternalDsl.g:1606:1: ( ( rule__Component__IdAssignment_3 ) )
            // InternalDsl.g:1607:2: ( rule__Component__IdAssignment_3 )
            {
             before(grammarAccess.getComponentAccess().getIdAssignment_3()); 
            // InternalDsl.g:1608:2: ( rule__Component__IdAssignment_3 )
            // InternalDsl.g:1608:3: rule__Component__IdAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Component__IdAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getComponentAccess().getIdAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group__3__Impl"


    // $ANTLR start "rule__PhysicalComponent__Group__0"
    // InternalDsl.g:1617:1: rule__PhysicalComponent__Group__0 : rule__PhysicalComponent__Group__0__Impl rule__PhysicalComponent__Group__1 ;
    public final void rule__PhysicalComponent__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1621:1: ( rule__PhysicalComponent__Group__0__Impl rule__PhysicalComponent__Group__1 )
            // InternalDsl.g:1622:2: rule__PhysicalComponent__Group__0__Impl rule__PhysicalComponent__Group__1
            {
            pushFollow(FOLLOW_25);
            rule__PhysicalComponent__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PhysicalComponent__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PhysicalComponent__Group__0"


    // $ANTLR start "rule__PhysicalComponent__Group__0__Impl"
    // InternalDsl.g:1629:1: rule__PhysicalComponent__Group__0__Impl : ( ( rule__PhysicalComponent__ComponentAssignment_0 ) ) ;
    public final void rule__PhysicalComponent__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1633:1: ( ( ( rule__PhysicalComponent__ComponentAssignment_0 ) ) )
            // InternalDsl.g:1634:1: ( ( rule__PhysicalComponent__ComponentAssignment_0 ) )
            {
            // InternalDsl.g:1634:1: ( ( rule__PhysicalComponent__ComponentAssignment_0 ) )
            // InternalDsl.g:1635:2: ( rule__PhysicalComponent__ComponentAssignment_0 )
            {
             before(grammarAccess.getPhysicalComponentAccess().getComponentAssignment_0()); 
            // InternalDsl.g:1636:2: ( rule__PhysicalComponent__ComponentAssignment_0 )
            // InternalDsl.g:1636:3: rule__PhysicalComponent__ComponentAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__PhysicalComponent__ComponentAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getPhysicalComponentAccess().getComponentAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PhysicalComponent__Group__0__Impl"


    // $ANTLR start "rule__PhysicalComponent__Group__1"
    // InternalDsl.g:1644:1: rule__PhysicalComponent__Group__1 : rule__PhysicalComponent__Group__1__Impl ;
    public final void rule__PhysicalComponent__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1648:1: ( rule__PhysicalComponent__Group__1__Impl )
            // InternalDsl.g:1649:2: rule__PhysicalComponent__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PhysicalComponent__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PhysicalComponent__Group__1"


    // $ANTLR start "rule__PhysicalComponent__Group__1__Impl"
    // InternalDsl.g:1655:1: rule__PhysicalComponent__Group__1__Impl : ( ( rule__PhysicalComponent__Alternatives_1 )? ) ;
    public final void rule__PhysicalComponent__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1659:1: ( ( ( rule__PhysicalComponent__Alternatives_1 )? ) )
            // InternalDsl.g:1660:1: ( ( rule__PhysicalComponent__Alternatives_1 )? )
            {
            // InternalDsl.g:1660:1: ( ( rule__PhysicalComponent__Alternatives_1 )? )
            // InternalDsl.g:1661:2: ( rule__PhysicalComponent__Alternatives_1 )?
            {
             before(grammarAccess.getPhysicalComponentAccess().getAlternatives_1()); 
            // InternalDsl.g:1662:2: ( rule__PhysicalComponent__Alternatives_1 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( ((LA18_0>=16 && LA18_0<=18)) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalDsl.g:1662:3: rule__PhysicalComponent__Alternatives_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__PhysicalComponent__Alternatives_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPhysicalComponentAccess().getAlternatives_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PhysicalComponent__Group__1__Impl"


    // $ANTLR start "rule__ConfigurationItem__Group__0"
    // InternalDsl.g:1671:1: rule__ConfigurationItem__Group__0 : rule__ConfigurationItem__Group__0__Impl rule__ConfigurationItem__Group__1 ;
    public final void rule__ConfigurationItem__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1675:1: ( rule__ConfigurationItem__Group__0__Impl rule__ConfigurationItem__Group__1 )
            // InternalDsl.g:1676:2: rule__ConfigurationItem__Group__0__Impl rule__ConfigurationItem__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__ConfigurationItem__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConfigurationItem__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConfigurationItem__Group__0"


    // $ANTLR start "rule__ConfigurationItem__Group__0__Impl"
    // InternalDsl.g:1683:1: rule__ConfigurationItem__Group__0__Impl : ( 'configuration_item' ) ;
    public final void rule__ConfigurationItem__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1687:1: ( ( 'configuration_item' ) )
            // InternalDsl.g:1688:1: ( 'configuration_item' )
            {
            // InternalDsl.g:1688:1: ( 'configuration_item' )
            // InternalDsl.g:1689:2: 'configuration_item'
            {
             before(grammarAccess.getConfigurationItemAccess().getConfiguration_itemKeyword_0()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getConfigurationItemAccess().getConfiguration_itemKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConfigurationItem__Group__0__Impl"


    // $ANTLR start "rule__ConfigurationItem__Group__1"
    // InternalDsl.g:1698:1: rule__ConfigurationItem__Group__1 : rule__ConfigurationItem__Group__1__Impl rule__ConfigurationItem__Group__2 ;
    public final void rule__ConfigurationItem__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1702:1: ( rule__ConfigurationItem__Group__1__Impl rule__ConfigurationItem__Group__2 )
            // InternalDsl.g:1703:2: rule__ConfigurationItem__Group__1__Impl rule__ConfigurationItem__Group__2
            {
            pushFollow(FOLLOW_23);
            rule__ConfigurationItem__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConfigurationItem__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConfigurationItem__Group__1"


    // $ANTLR start "rule__ConfigurationItem__Group__1__Impl"
    // InternalDsl.g:1710:1: rule__ConfigurationItem__Group__1__Impl : ( ( rule__ConfigurationItem__NameAssignment_1 ) ) ;
    public final void rule__ConfigurationItem__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1714:1: ( ( ( rule__ConfigurationItem__NameAssignment_1 ) ) )
            // InternalDsl.g:1715:1: ( ( rule__ConfigurationItem__NameAssignment_1 ) )
            {
            // InternalDsl.g:1715:1: ( ( rule__ConfigurationItem__NameAssignment_1 ) )
            // InternalDsl.g:1716:2: ( rule__ConfigurationItem__NameAssignment_1 )
            {
             before(grammarAccess.getConfigurationItemAccess().getNameAssignment_1()); 
            // InternalDsl.g:1717:2: ( rule__ConfigurationItem__NameAssignment_1 )
            // InternalDsl.g:1717:3: rule__ConfigurationItem__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ConfigurationItem__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getConfigurationItemAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConfigurationItem__Group__1__Impl"


    // $ANTLR start "rule__ConfigurationItem__Group__2"
    // InternalDsl.g:1725:1: rule__ConfigurationItem__Group__2 : rule__ConfigurationItem__Group__2__Impl rule__ConfigurationItem__Group__3 ;
    public final void rule__ConfigurationItem__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1729:1: ( rule__ConfigurationItem__Group__2__Impl rule__ConfigurationItem__Group__3 )
            // InternalDsl.g:1730:2: rule__ConfigurationItem__Group__2__Impl rule__ConfigurationItem__Group__3
            {
            pushFollow(FOLLOW_24);
            rule__ConfigurationItem__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConfigurationItem__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConfigurationItem__Group__2"


    // $ANTLR start "rule__ConfigurationItem__Group__2__Impl"
    // InternalDsl.g:1737:1: rule__ConfigurationItem__Group__2__Impl : ( 'as' ) ;
    public final void rule__ConfigurationItem__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1741:1: ( ( 'as' ) )
            // InternalDsl.g:1742:1: ( 'as' )
            {
            // InternalDsl.g:1742:1: ( 'as' )
            // InternalDsl.g:1743:2: 'as'
            {
             before(grammarAccess.getConfigurationItemAccess().getAsKeyword_2()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getConfigurationItemAccess().getAsKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConfigurationItem__Group__2__Impl"


    // $ANTLR start "rule__ConfigurationItem__Group__3"
    // InternalDsl.g:1752:1: rule__ConfigurationItem__Group__3 : rule__ConfigurationItem__Group__3__Impl ;
    public final void rule__ConfigurationItem__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1756:1: ( rule__ConfigurationItem__Group__3__Impl )
            // InternalDsl.g:1757:2: rule__ConfigurationItem__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ConfigurationItem__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConfigurationItem__Group__3"


    // $ANTLR start "rule__ConfigurationItem__Group__3__Impl"
    // InternalDsl.g:1763:1: rule__ConfigurationItem__Group__3__Impl : ( ( rule__ConfigurationItem__IdAssignment_3 ) ) ;
    public final void rule__ConfigurationItem__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1767:1: ( ( ( rule__ConfigurationItem__IdAssignment_3 ) ) )
            // InternalDsl.g:1768:1: ( ( rule__ConfigurationItem__IdAssignment_3 ) )
            {
            // InternalDsl.g:1768:1: ( ( rule__ConfigurationItem__IdAssignment_3 ) )
            // InternalDsl.g:1769:2: ( rule__ConfigurationItem__IdAssignment_3 )
            {
             before(grammarAccess.getConfigurationItemAccess().getIdAssignment_3()); 
            // InternalDsl.g:1770:2: ( rule__ConfigurationItem__IdAssignment_3 )
            // InternalDsl.g:1770:3: rule__ConfigurationItem__IdAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__ConfigurationItem__IdAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getConfigurationItemAccess().getIdAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConfigurationItem__Group__3__Impl"


    // $ANTLR start "rule__Function__Group__0"
    // InternalDsl.g:1779:1: rule__Function__Group__0 : rule__Function__Group__0__Impl rule__Function__Group__1 ;
    public final void rule__Function__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1783:1: ( rule__Function__Group__0__Impl rule__Function__Group__1 )
            // InternalDsl.g:1784:2: rule__Function__Group__0__Impl rule__Function__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__Function__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Function__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__Group__0"


    // $ANTLR start "rule__Function__Group__0__Impl"
    // InternalDsl.g:1791:1: rule__Function__Group__0__Impl : ( 'function' ) ;
    public final void rule__Function__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1795:1: ( ( 'function' ) )
            // InternalDsl.g:1796:1: ( 'function' )
            {
            // InternalDsl.g:1796:1: ( 'function' )
            // InternalDsl.g:1797:2: 'function'
            {
             before(grammarAccess.getFunctionAccess().getFunctionKeyword_0()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getFunctionAccess().getFunctionKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__Group__0__Impl"


    // $ANTLR start "rule__Function__Group__1"
    // InternalDsl.g:1806:1: rule__Function__Group__1 : rule__Function__Group__1__Impl rule__Function__Group__2 ;
    public final void rule__Function__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1810:1: ( rule__Function__Group__1__Impl rule__Function__Group__2 )
            // InternalDsl.g:1811:2: rule__Function__Group__1__Impl rule__Function__Group__2
            {
            pushFollow(FOLLOW_23);
            rule__Function__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Function__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__Group__1"


    // $ANTLR start "rule__Function__Group__1__Impl"
    // InternalDsl.g:1818:1: rule__Function__Group__1__Impl : ( ( rule__Function__NameAssignment_1 ) ) ;
    public final void rule__Function__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1822:1: ( ( ( rule__Function__NameAssignment_1 ) ) )
            // InternalDsl.g:1823:1: ( ( rule__Function__NameAssignment_1 ) )
            {
            // InternalDsl.g:1823:1: ( ( rule__Function__NameAssignment_1 ) )
            // InternalDsl.g:1824:2: ( rule__Function__NameAssignment_1 )
            {
             before(grammarAccess.getFunctionAccess().getNameAssignment_1()); 
            // InternalDsl.g:1825:2: ( rule__Function__NameAssignment_1 )
            // InternalDsl.g:1825:3: rule__Function__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Function__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getFunctionAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__Group__1__Impl"


    // $ANTLR start "rule__Function__Group__2"
    // InternalDsl.g:1833:1: rule__Function__Group__2 : rule__Function__Group__2__Impl rule__Function__Group__3 ;
    public final void rule__Function__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1837:1: ( rule__Function__Group__2__Impl rule__Function__Group__3 )
            // InternalDsl.g:1838:2: rule__Function__Group__2__Impl rule__Function__Group__3
            {
            pushFollow(FOLLOW_24);
            rule__Function__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Function__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__Group__2"


    // $ANTLR start "rule__Function__Group__2__Impl"
    // InternalDsl.g:1845:1: rule__Function__Group__2__Impl : ( 'as' ) ;
    public final void rule__Function__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1849:1: ( ( 'as' ) )
            // InternalDsl.g:1850:1: ( 'as' )
            {
            // InternalDsl.g:1850:1: ( 'as' )
            // InternalDsl.g:1851:2: 'as'
            {
             before(grammarAccess.getFunctionAccess().getAsKeyword_2()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getFunctionAccess().getAsKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__Group__2__Impl"


    // $ANTLR start "rule__Function__Group__3"
    // InternalDsl.g:1860:1: rule__Function__Group__3 : rule__Function__Group__3__Impl ;
    public final void rule__Function__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1864:1: ( rule__Function__Group__3__Impl )
            // InternalDsl.g:1865:2: rule__Function__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Function__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__Group__3"


    // $ANTLR start "rule__Function__Group__3__Impl"
    // InternalDsl.g:1871:1: rule__Function__Group__3__Impl : ( ( rule__Function__IdAssignment_3 ) ) ;
    public final void rule__Function__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1875:1: ( ( ( rule__Function__IdAssignment_3 ) ) )
            // InternalDsl.g:1876:1: ( ( rule__Function__IdAssignment_3 ) )
            {
            // InternalDsl.g:1876:1: ( ( rule__Function__IdAssignment_3 ) )
            // InternalDsl.g:1877:2: ( rule__Function__IdAssignment_3 )
            {
             before(grammarAccess.getFunctionAccess().getIdAssignment_3()); 
            // InternalDsl.g:1878:2: ( rule__Function__IdAssignment_3 )
            // InternalDsl.g:1878:3: rule__Function__IdAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Function__IdAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getFunctionAccess().getIdAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__Group__3__Impl"


    // $ANTLR start "rule__Activity__Group__0"
    // InternalDsl.g:1887:1: rule__Activity__Group__0 : rule__Activity__Group__0__Impl rule__Activity__Group__1 ;
    public final void rule__Activity__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1891:1: ( rule__Activity__Group__0__Impl rule__Activity__Group__1 )
            // InternalDsl.g:1892:2: rule__Activity__Group__0__Impl rule__Activity__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__Activity__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Activity__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__Group__0"


    // $ANTLR start "rule__Activity__Group__0__Impl"
    // InternalDsl.g:1899:1: rule__Activity__Group__0__Impl : ( 'activity' ) ;
    public final void rule__Activity__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1903:1: ( ( 'activity' ) )
            // InternalDsl.g:1904:1: ( 'activity' )
            {
            // InternalDsl.g:1904:1: ( 'activity' )
            // InternalDsl.g:1905:2: 'activity'
            {
             before(grammarAccess.getActivityAccess().getActivityKeyword_0()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getActivityAccess().getActivityKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__Group__0__Impl"


    // $ANTLR start "rule__Activity__Group__1"
    // InternalDsl.g:1914:1: rule__Activity__Group__1 : rule__Activity__Group__1__Impl rule__Activity__Group__2 ;
    public final void rule__Activity__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1918:1: ( rule__Activity__Group__1__Impl rule__Activity__Group__2 )
            // InternalDsl.g:1919:2: rule__Activity__Group__1__Impl rule__Activity__Group__2
            {
            pushFollow(FOLLOW_23);
            rule__Activity__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Activity__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__Group__1"


    // $ANTLR start "rule__Activity__Group__1__Impl"
    // InternalDsl.g:1926:1: rule__Activity__Group__1__Impl : ( ( rule__Activity__NameAssignment_1 ) ) ;
    public final void rule__Activity__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1930:1: ( ( ( rule__Activity__NameAssignment_1 ) ) )
            // InternalDsl.g:1931:1: ( ( rule__Activity__NameAssignment_1 ) )
            {
            // InternalDsl.g:1931:1: ( ( rule__Activity__NameAssignment_1 ) )
            // InternalDsl.g:1932:2: ( rule__Activity__NameAssignment_1 )
            {
             before(grammarAccess.getActivityAccess().getNameAssignment_1()); 
            // InternalDsl.g:1933:2: ( rule__Activity__NameAssignment_1 )
            // InternalDsl.g:1933:3: rule__Activity__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Activity__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getActivityAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__Group__1__Impl"


    // $ANTLR start "rule__Activity__Group__2"
    // InternalDsl.g:1941:1: rule__Activity__Group__2 : rule__Activity__Group__2__Impl rule__Activity__Group__3 ;
    public final void rule__Activity__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1945:1: ( rule__Activity__Group__2__Impl rule__Activity__Group__3 )
            // InternalDsl.g:1946:2: rule__Activity__Group__2__Impl rule__Activity__Group__3
            {
            pushFollow(FOLLOW_24);
            rule__Activity__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Activity__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__Group__2"


    // $ANTLR start "rule__Activity__Group__2__Impl"
    // InternalDsl.g:1953:1: rule__Activity__Group__2__Impl : ( 'as' ) ;
    public final void rule__Activity__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1957:1: ( ( 'as' ) )
            // InternalDsl.g:1958:1: ( 'as' )
            {
            // InternalDsl.g:1958:1: ( 'as' )
            // InternalDsl.g:1959:2: 'as'
            {
             before(grammarAccess.getActivityAccess().getAsKeyword_2()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getActivityAccess().getAsKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__Group__2__Impl"


    // $ANTLR start "rule__Activity__Group__3"
    // InternalDsl.g:1968:1: rule__Activity__Group__3 : rule__Activity__Group__3__Impl ;
    public final void rule__Activity__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1972:1: ( rule__Activity__Group__3__Impl )
            // InternalDsl.g:1973:2: rule__Activity__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Activity__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__Group__3"


    // $ANTLR start "rule__Activity__Group__3__Impl"
    // InternalDsl.g:1979:1: rule__Activity__Group__3__Impl : ( ( rule__Activity__IdAssignment_3 ) ) ;
    public final void rule__Activity__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1983:1: ( ( ( rule__Activity__IdAssignment_3 ) ) )
            // InternalDsl.g:1984:1: ( ( rule__Activity__IdAssignment_3 ) )
            {
            // InternalDsl.g:1984:1: ( ( rule__Activity__IdAssignment_3 ) )
            // InternalDsl.g:1985:2: ( rule__Activity__IdAssignment_3 )
            {
             before(grammarAccess.getActivityAccess().getIdAssignment_3()); 
            // InternalDsl.g:1986:2: ( rule__Activity__IdAssignment_3 )
            // InternalDsl.g:1986:3: rule__Activity__IdAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Activity__IdAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getActivityAccess().getIdAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__Group__3__Impl"


    // $ANTLR start "rule__Entity__Group__0"
    // InternalDsl.g:1995:1: rule__Entity__Group__0 : rule__Entity__Group__0__Impl rule__Entity__Group__1 ;
    public final void rule__Entity__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1999:1: ( rule__Entity__Group__0__Impl rule__Entity__Group__1 )
            // InternalDsl.g:2000:2: rule__Entity__Group__0__Impl rule__Entity__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__Entity__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entity__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__0"


    // $ANTLR start "rule__Entity__Group__0__Impl"
    // InternalDsl.g:2007:1: rule__Entity__Group__0__Impl : ( 'entity' ) ;
    public final void rule__Entity__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2011:1: ( ( 'entity' ) )
            // InternalDsl.g:2012:1: ( 'entity' )
            {
            // InternalDsl.g:2012:1: ( 'entity' )
            // InternalDsl.g:2013:2: 'entity'
            {
             before(grammarAccess.getEntityAccess().getEntityKeyword_0()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getEntityAccess().getEntityKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__0__Impl"


    // $ANTLR start "rule__Entity__Group__1"
    // InternalDsl.g:2022:1: rule__Entity__Group__1 : rule__Entity__Group__1__Impl rule__Entity__Group__2 ;
    public final void rule__Entity__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2026:1: ( rule__Entity__Group__1__Impl rule__Entity__Group__2 )
            // InternalDsl.g:2027:2: rule__Entity__Group__1__Impl rule__Entity__Group__2
            {
            pushFollow(FOLLOW_23);
            rule__Entity__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entity__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__1"


    // $ANTLR start "rule__Entity__Group__1__Impl"
    // InternalDsl.g:2034:1: rule__Entity__Group__1__Impl : ( ( rule__Entity__NameAssignment_1 ) ) ;
    public final void rule__Entity__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2038:1: ( ( ( rule__Entity__NameAssignment_1 ) ) )
            // InternalDsl.g:2039:1: ( ( rule__Entity__NameAssignment_1 ) )
            {
            // InternalDsl.g:2039:1: ( ( rule__Entity__NameAssignment_1 ) )
            // InternalDsl.g:2040:2: ( rule__Entity__NameAssignment_1 )
            {
             before(grammarAccess.getEntityAccess().getNameAssignment_1()); 
            // InternalDsl.g:2041:2: ( rule__Entity__NameAssignment_1 )
            // InternalDsl.g:2041:3: rule__Entity__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Entity__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getEntityAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__1__Impl"


    // $ANTLR start "rule__Entity__Group__2"
    // InternalDsl.g:2049:1: rule__Entity__Group__2 : rule__Entity__Group__2__Impl rule__Entity__Group__3 ;
    public final void rule__Entity__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2053:1: ( rule__Entity__Group__2__Impl rule__Entity__Group__3 )
            // InternalDsl.g:2054:2: rule__Entity__Group__2__Impl rule__Entity__Group__3
            {
            pushFollow(FOLLOW_24);
            rule__Entity__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entity__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__2"


    // $ANTLR start "rule__Entity__Group__2__Impl"
    // InternalDsl.g:2061:1: rule__Entity__Group__2__Impl : ( 'as' ) ;
    public final void rule__Entity__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2065:1: ( ( 'as' ) )
            // InternalDsl.g:2066:1: ( 'as' )
            {
            // InternalDsl.g:2066:1: ( 'as' )
            // InternalDsl.g:2067:2: 'as'
            {
             before(grammarAccess.getEntityAccess().getAsKeyword_2()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getEntityAccess().getAsKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__2__Impl"


    // $ANTLR start "rule__Entity__Group__3"
    // InternalDsl.g:2076:1: rule__Entity__Group__3 : rule__Entity__Group__3__Impl ;
    public final void rule__Entity__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2080:1: ( rule__Entity__Group__3__Impl )
            // InternalDsl.g:2081:2: rule__Entity__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Entity__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__3"


    // $ANTLR start "rule__Entity__Group__3__Impl"
    // InternalDsl.g:2087:1: rule__Entity__Group__3__Impl : ( ( rule__Entity__IdAssignment_3 ) ) ;
    public final void rule__Entity__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2091:1: ( ( ( rule__Entity__IdAssignment_3 ) ) )
            // InternalDsl.g:2092:1: ( ( rule__Entity__IdAssignment_3 ) )
            {
            // InternalDsl.g:2092:1: ( ( rule__Entity__IdAssignment_3 ) )
            // InternalDsl.g:2093:2: ( rule__Entity__IdAssignment_3 )
            {
             before(grammarAccess.getEntityAccess().getIdAssignment_3()); 
            // InternalDsl.g:2094:2: ( rule__Entity__IdAssignment_3 )
            // InternalDsl.g:2094:3: rule__Entity__IdAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Entity__IdAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getEntityAccess().getIdAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__3__Impl"


    // $ANTLR start "rule__Role__Group__0"
    // InternalDsl.g:2103:1: rule__Role__Group__0 : rule__Role__Group__0__Impl rule__Role__Group__1 ;
    public final void rule__Role__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2107:1: ( rule__Role__Group__0__Impl rule__Role__Group__1 )
            // InternalDsl.g:2108:2: rule__Role__Group__0__Impl rule__Role__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__Role__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Role__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Role__Group__0"


    // $ANTLR start "rule__Role__Group__0__Impl"
    // InternalDsl.g:2115:1: rule__Role__Group__0__Impl : ( 'role' ) ;
    public final void rule__Role__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2119:1: ( ( 'role' ) )
            // InternalDsl.g:2120:1: ( 'role' )
            {
            // InternalDsl.g:2120:1: ( 'role' )
            // InternalDsl.g:2121:2: 'role'
            {
             before(grammarAccess.getRoleAccess().getRoleKeyword_0()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getRoleAccess().getRoleKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Role__Group__0__Impl"


    // $ANTLR start "rule__Role__Group__1"
    // InternalDsl.g:2130:1: rule__Role__Group__1 : rule__Role__Group__1__Impl rule__Role__Group__2 ;
    public final void rule__Role__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2134:1: ( rule__Role__Group__1__Impl rule__Role__Group__2 )
            // InternalDsl.g:2135:2: rule__Role__Group__1__Impl rule__Role__Group__2
            {
            pushFollow(FOLLOW_23);
            rule__Role__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Role__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Role__Group__1"


    // $ANTLR start "rule__Role__Group__1__Impl"
    // InternalDsl.g:2142:1: rule__Role__Group__1__Impl : ( ( rule__Role__NameAssignment_1 ) ) ;
    public final void rule__Role__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2146:1: ( ( ( rule__Role__NameAssignment_1 ) ) )
            // InternalDsl.g:2147:1: ( ( rule__Role__NameAssignment_1 ) )
            {
            // InternalDsl.g:2147:1: ( ( rule__Role__NameAssignment_1 ) )
            // InternalDsl.g:2148:2: ( rule__Role__NameAssignment_1 )
            {
             before(grammarAccess.getRoleAccess().getNameAssignment_1()); 
            // InternalDsl.g:2149:2: ( rule__Role__NameAssignment_1 )
            // InternalDsl.g:2149:3: rule__Role__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Role__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getRoleAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Role__Group__1__Impl"


    // $ANTLR start "rule__Role__Group__2"
    // InternalDsl.g:2157:1: rule__Role__Group__2 : rule__Role__Group__2__Impl rule__Role__Group__3 ;
    public final void rule__Role__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2161:1: ( rule__Role__Group__2__Impl rule__Role__Group__3 )
            // InternalDsl.g:2162:2: rule__Role__Group__2__Impl rule__Role__Group__3
            {
            pushFollow(FOLLOW_24);
            rule__Role__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Role__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Role__Group__2"


    // $ANTLR start "rule__Role__Group__2__Impl"
    // InternalDsl.g:2169:1: rule__Role__Group__2__Impl : ( 'as' ) ;
    public final void rule__Role__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2173:1: ( ( 'as' ) )
            // InternalDsl.g:2174:1: ( 'as' )
            {
            // InternalDsl.g:2174:1: ( 'as' )
            // InternalDsl.g:2175:2: 'as'
            {
             before(grammarAccess.getRoleAccess().getAsKeyword_2()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getRoleAccess().getAsKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Role__Group__2__Impl"


    // $ANTLR start "rule__Role__Group__3"
    // InternalDsl.g:2184:1: rule__Role__Group__3 : rule__Role__Group__3__Impl ;
    public final void rule__Role__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2188:1: ( rule__Role__Group__3__Impl )
            // InternalDsl.g:2189:2: rule__Role__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Role__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Role__Group__3"


    // $ANTLR start "rule__Role__Group__3__Impl"
    // InternalDsl.g:2195:1: rule__Role__Group__3__Impl : ( ( rule__Role__IdAssignment_3 ) ) ;
    public final void rule__Role__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2199:1: ( ( ( rule__Role__IdAssignment_3 ) ) )
            // InternalDsl.g:2200:1: ( ( rule__Role__IdAssignment_3 ) )
            {
            // InternalDsl.g:2200:1: ( ( rule__Role__IdAssignment_3 ) )
            // InternalDsl.g:2201:2: ( rule__Role__IdAssignment_3 )
            {
             before(grammarAccess.getRoleAccess().getIdAssignment_3()); 
            // InternalDsl.g:2202:2: ( rule__Role__IdAssignment_3 )
            // InternalDsl.g:2202:3: rule__Role__IdAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Role__IdAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getRoleAccess().getIdAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Role__Group__3__Impl"


    // $ANTLR start "rule__Message__Group__0"
    // InternalDsl.g:2211:1: rule__Message__Group__0 : rule__Message__Group__0__Impl rule__Message__Group__1 ;
    public final void rule__Message__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2215:1: ( rule__Message__Group__0__Impl rule__Message__Group__1 )
            // InternalDsl.g:2216:2: rule__Message__Group__0__Impl rule__Message__Group__1
            {
            pushFollow(FOLLOW_26);
            rule__Message__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Message__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Message__Group__0"


    // $ANTLR start "rule__Message__Group__0__Impl"
    // InternalDsl.g:2223:1: rule__Message__Group__0__Impl : ( ( rule__Message__Name1Assignment_0 ) ) ;
    public final void rule__Message__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2227:1: ( ( ( rule__Message__Name1Assignment_0 ) ) )
            // InternalDsl.g:2228:1: ( ( rule__Message__Name1Assignment_0 ) )
            {
            // InternalDsl.g:2228:1: ( ( rule__Message__Name1Assignment_0 ) )
            // InternalDsl.g:2229:2: ( rule__Message__Name1Assignment_0 )
            {
             before(grammarAccess.getMessageAccess().getName1Assignment_0()); 
            // InternalDsl.g:2230:2: ( rule__Message__Name1Assignment_0 )
            // InternalDsl.g:2230:3: rule__Message__Name1Assignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Message__Name1Assignment_0();

            state._fsp--;


            }

             after(grammarAccess.getMessageAccess().getName1Assignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Message__Group__0__Impl"


    // $ANTLR start "rule__Message__Group__1"
    // InternalDsl.g:2238:1: rule__Message__Group__1 : rule__Message__Group__1__Impl rule__Message__Group__2 ;
    public final void rule__Message__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2242:1: ( rule__Message__Group__1__Impl rule__Message__Group__2 )
            // InternalDsl.g:2243:2: rule__Message__Group__1__Impl rule__Message__Group__2
            {
            pushFollow(FOLLOW_24);
            rule__Message__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Message__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Message__Group__1"


    // $ANTLR start "rule__Message__Group__1__Impl"
    // InternalDsl.g:2250:1: rule__Message__Group__1__Impl : ( '->' ) ;
    public final void rule__Message__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2254:1: ( ( '->' ) )
            // InternalDsl.g:2255:1: ( '->' )
            {
            // InternalDsl.g:2255:1: ( '->' )
            // InternalDsl.g:2256:2: '->'
            {
             before(grammarAccess.getMessageAccess().getHyphenMinusGreaterThanSignKeyword_1()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getMessageAccess().getHyphenMinusGreaterThanSignKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Message__Group__1__Impl"


    // $ANTLR start "rule__Message__Group__2"
    // InternalDsl.g:2265:1: rule__Message__Group__2 : rule__Message__Group__2__Impl rule__Message__Group__3 ;
    public final void rule__Message__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2269:1: ( rule__Message__Group__2__Impl rule__Message__Group__3 )
            // InternalDsl.g:2270:2: rule__Message__Group__2__Impl rule__Message__Group__3
            {
            pushFollow(FOLLOW_27);
            rule__Message__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Message__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Message__Group__2"


    // $ANTLR start "rule__Message__Group__2__Impl"
    // InternalDsl.g:2277:1: rule__Message__Group__2__Impl : ( ( rule__Message__Name2Assignment_2 ) ) ;
    public final void rule__Message__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2281:1: ( ( ( rule__Message__Name2Assignment_2 ) ) )
            // InternalDsl.g:2282:1: ( ( rule__Message__Name2Assignment_2 ) )
            {
            // InternalDsl.g:2282:1: ( ( rule__Message__Name2Assignment_2 ) )
            // InternalDsl.g:2283:2: ( rule__Message__Name2Assignment_2 )
            {
             before(grammarAccess.getMessageAccess().getName2Assignment_2()); 
            // InternalDsl.g:2284:2: ( rule__Message__Name2Assignment_2 )
            // InternalDsl.g:2284:3: rule__Message__Name2Assignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Message__Name2Assignment_2();

            state._fsp--;


            }

             after(grammarAccess.getMessageAccess().getName2Assignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Message__Group__2__Impl"


    // $ANTLR start "rule__Message__Group__3"
    // InternalDsl.g:2292:1: rule__Message__Group__3 : rule__Message__Group__3__Impl rule__Message__Group__4 ;
    public final void rule__Message__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2296:1: ( rule__Message__Group__3__Impl rule__Message__Group__4 )
            // InternalDsl.g:2297:2: rule__Message__Group__3__Impl rule__Message__Group__4
            {
            pushFollow(FOLLOW_8);
            rule__Message__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Message__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Message__Group__3"


    // $ANTLR start "rule__Message__Group__3__Impl"
    // InternalDsl.g:2304:1: rule__Message__Group__3__Impl : ( ':' ) ;
    public final void rule__Message__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2308:1: ( ( ':' ) )
            // InternalDsl.g:2309:1: ( ':' )
            {
            // InternalDsl.g:2309:1: ( ':' )
            // InternalDsl.g:2310:2: ':'
            {
             before(grammarAccess.getMessageAccess().getColonKeyword_3()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getMessageAccess().getColonKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Message__Group__3__Impl"


    // $ANTLR start "rule__Message__Group__4"
    // InternalDsl.g:2319:1: rule__Message__Group__4 : rule__Message__Group__4__Impl ;
    public final void rule__Message__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2323:1: ( rule__Message__Group__4__Impl )
            // InternalDsl.g:2324:2: rule__Message__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Message__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Message__Group__4"


    // $ANTLR start "rule__Message__Group__4__Impl"
    // InternalDsl.g:2330:1: rule__Message__Group__4__Impl : ( ( rule__Message__NameAssignment_4 ) ) ;
    public final void rule__Message__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2334:1: ( ( ( rule__Message__NameAssignment_4 ) ) )
            // InternalDsl.g:2335:1: ( ( rule__Message__NameAssignment_4 ) )
            {
            // InternalDsl.g:2335:1: ( ( rule__Message__NameAssignment_4 ) )
            // InternalDsl.g:2336:2: ( rule__Message__NameAssignment_4 )
            {
             before(grammarAccess.getMessageAccess().getNameAssignment_4()); 
            // InternalDsl.g:2337:2: ( rule__Message__NameAssignment_4 )
            // InternalDsl.g:2337:3: rule__Message__NameAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Message__NameAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getMessageAccess().getNameAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Message__Group__4__Impl"


    // $ANTLR start "rule__Model__ScenarioTypeAssignment_1"
    // InternalDsl.g:2346:1: rule__Model__ScenarioTypeAssignment_1 : ( ruleScenarioTypeAndParticipants ) ;
    public final void rule__Model__ScenarioTypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2350:1: ( ( ruleScenarioTypeAndParticipants ) )
            // InternalDsl.g:2351:2: ( ruleScenarioTypeAndParticipants )
            {
            // InternalDsl.g:2351:2: ( ruleScenarioTypeAndParticipants )
            // InternalDsl.g:2352:3: ruleScenarioTypeAndParticipants
            {
             before(grammarAccess.getModelAccess().getScenarioTypeScenarioTypeAndParticipantsParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleScenarioTypeAndParticipants();

            state._fsp--;

             after(grammarAccess.getModelAccess().getScenarioTypeScenarioTypeAndParticipantsParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__ScenarioTypeAssignment_1"


    // $ANTLR start "rule__Model__MessagesAssignment_3"
    // InternalDsl.g:2361:1: rule__Model__MessagesAssignment_3 : ( ruleMessage ) ;
    public final void rule__Model__MessagesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2365:1: ( ( ruleMessage ) )
            // InternalDsl.g:2366:2: ( ruleMessage )
            {
            // InternalDsl.g:2366:2: ( ruleMessage )
            // InternalDsl.g:2367:3: ruleMessage
            {
             before(grammarAccess.getModelAccess().getMessagesMessageParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleMessage();

            state._fsp--;

             after(grammarAccess.getModelAccess().getMessagesMessageParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__MessagesAssignment_3"


    // $ANTLR start "rule__ScenarioTypeAndParticipants__NameAssignment_0_2"
    // InternalDsl.g:2376:1: rule__ScenarioTypeAndParticipants__NameAssignment_0_2 : ( RULE_STRING ) ;
    public final void rule__ScenarioTypeAndParticipants__NameAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2380:1: ( ( RULE_STRING ) )
            // InternalDsl.g:2381:2: ( RULE_STRING )
            {
            // InternalDsl.g:2381:2: ( RULE_STRING )
            // InternalDsl.g:2382:3: RULE_STRING
            {
             before(grammarAccess.getScenarioTypeAndParticipantsAccess().getNameSTRINGTerminalRuleCall_0_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getScenarioTypeAndParticipantsAccess().getNameSTRINGTerminalRuleCall_0_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScenarioTypeAndParticipants__NameAssignment_0_2"


    // $ANTLR start "rule__ScenarioTypeAndParticipants__ParticipantsAssignment_0_3"
    // InternalDsl.g:2391:1: rule__ScenarioTypeAndParticipants__ParticipantsAssignment_0_3 : ( ruleActor ) ;
    public final void rule__ScenarioTypeAndParticipants__ParticipantsAssignment_0_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2395:1: ( ( ruleActor ) )
            // InternalDsl.g:2396:2: ( ruleActor )
            {
            // InternalDsl.g:2396:2: ( ruleActor )
            // InternalDsl.g:2397:3: ruleActor
            {
             before(grammarAccess.getScenarioTypeAndParticipantsAccess().getParticipantsActorParserRuleCall_0_3_0()); 
            pushFollow(FOLLOW_2);
            ruleActor();

            state._fsp--;

             after(grammarAccess.getScenarioTypeAndParticipantsAccess().getParticipantsActorParserRuleCall_0_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScenarioTypeAndParticipants__ParticipantsAssignment_0_3"


    // $ANTLR start "rule__ScenarioTypeAndParticipants__NameAssignment_1_2"
    // InternalDsl.g:2406:1: rule__ScenarioTypeAndParticipants__NameAssignment_1_2 : ( RULE_STRING ) ;
    public final void rule__ScenarioTypeAndParticipants__NameAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2410:1: ( ( RULE_STRING ) )
            // InternalDsl.g:2411:2: ( RULE_STRING )
            {
            // InternalDsl.g:2411:2: ( RULE_STRING )
            // InternalDsl.g:2412:3: RULE_STRING
            {
             before(grammarAccess.getScenarioTypeAndParticipantsAccess().getNameSTRINGTerminalRuleCall_1_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getScenarioTypeAndParticipantsAccess().getNameSTRINGTerminalRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScenarioTypeAndParticipants__NameAssignment_1_2"


    // $ANTLR start "rule__ScenarioTypeAndParticipants__ParticipantsAssignment_1_3"
    // InternalDsl.g:2421:1: rule__ScenarioTypeAndParticipants__ParticipantsAssignment_1_3 : ( ( rule__ScenarioTypeAndParticipants__ParticipantsAlternatives_1_3_0 ) ) ;
    public final void rule__ScenarioTypeAndParticipants__ParticipantsAssignment_1_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2425:1: ( ( ( rule__ScenarioTypeAndParticipants__ParticipantsAlternatives_1_3_0 ) ) )
            // InternalDsl.g:2426:2: ( ( rule__ScenarioTypeAndParticipants__ParticipantsAlternatives_1_3_0 ) )
            {
            // InternalDsl.g:2426:2: ( ( rule__ScenarioTypeAndParticipants__ParticipantsAlternatives_1_3_0 ) )
            // InternalDsl.g:2427:3: ( rule__ScenarioTypeAndParticipants__ParticipantsAlternatives_1_3_0 )
            {
             before(grammarAccess.getScenarioTypeAndParticipantsAccess().getParticipantsAlternatives_1_3_0()); 
            // InternalDsl.g:2428:3: ( rule__ScenarioTypeAndParticipants__ParticipantsAlternatives_1_3_0 )
            // InternalDsl.g:2428:4: rule__ScenarioTypeAndParticipants__ParticipantsAlternatives_1_3_0
            {
            pushFollow(FOLLOW_2);
            rule__ScenarioTypeAndParticipants__ParticipantsAlternatives_1_3_0();

            state._fsp--;


            }

             after(grammarAccess.getScenarioTypeAndParticipantsAccess().getParticipantsAlternatives_1_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScenarioTypeAndParticipants__ParticipantsAssignment_1_3"


    // $ANTLR start "rule__ScenarioTypeAndParticipants__NameAssignment_2_2"
    // InternalDsl.g:2436:1: rule__ScenarioTypeAndParticipants__NameAssignment_2_2 : ( RULE_STRING ) ;
    public final void rule__ScenarioTypeAndParticipants__NameAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2440:1: ( ( RULE_STRING ) )
            // InternalDsl.g:2441:2: ( RULE_STRING )
            {
            // InternalDsl.g:2441:2: ( RULE_STRING )
            // InternalDsl.g:2442:3: RULE_STRING
            {
             before(grammarAccess.getScenarioTypeAndParticipantsAccess().getNameSTRINGTerminalRuleCall_2_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getScenarioTypeAndParticipantsAccess().getNameSTRINGTerminalRuleCall_2_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScenarioTypeAndParticipants__NameAssignment_2_2"


    // $ANTLR start "rule__ScenarioTypeAndParticipants__ParticipantAssignment_2_3"
    // InternalDsl.g:2451:1: rule__ScenarioTypeAndParticipants__ParticipantAssignment_2_3 : ( ( rule__ScenarioTypeAndParticipants__ParticipantAlternatives_2_3_0 ) ) ;
    public final void rule__ScenarioTypeAndParticipants__ParticipantAssignment_2_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2455:1: ( ( ( rule__ScenarioTypeAndParticipants__ParticipantAlternatives_2_3_0 ) ) )
            // InternalDsl.g:2456:2: ( ( rule__ScenarioTypeAndParticipants__ParticipantAlternatives_2_3_0 ) )
            {
            // InternalDsl.g:2456:2: ( ( rule__ScenarioTypeAndParticipants__ParticipantAlternatives_2_3_0 ) )
            // InternalDsl.g:2457:3: ( rule__ScenarioTypeAndParticipants__ParticipantAlternatives_2_3_0 )
            {
             before(grammarAccess.getScenarioTypeAndParticipantsAccess().getParticipantAlternatives_2_3_0()); 
            // InternalDsl.g:2458:3: ( rule__ScenarioTypeAndParticipants__ParticipantAlternatives_2_3_0 )
            // InternalDsl.g:2458:4: rule__ScenarioTypeAndParticipants__ParticipantAlternatives_2_3_0
            {
            pushFollow(FOLLOW_2);
            rule__ScenarioTypeAndParticipants__ParticipantAlternatives_2_3_0();

            state._fsp--;


            }

             after(grammarAccess.getScenarioTypeAndParticipantsAccess().getParticipantAlternatives_2_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScenarioTypeAndParticipants__ParticipantAssignment_2_3"


    // $ANTLR start "rule__ScenarioTypeAndParticipants__NameAssignment_3_2"
    // InternalDsl.g:2466:1: rule__ScenarioTypeAndParticipants__NameAssignment_3_2 : ( RULE_STRING ) ;
    public final void rule__ScenarioTypeAndParticipants__NameAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2470:1: ( ( RULE_STRING ) )
            // InternalDsl.g:2471:2: ( RULE_STRING )
            {
            // InternalDsl.g:2471:2: ( RULE_STRING )
            // InternalDsl.g:2472:3: RULE_STRING
            {
             before(grammarAccess.getScenarioTypeAndParticipantsAccess().getNameSTRINGTerminalRuleCall_3_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getScenarioTypeAndParticipantsAccess().getNameSTRINGTerminalRuleCall_3_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScenarioTypeAndParticipants__NameAssignment_3_2"


    // $ANTLR start "rule__ScenarioTypeAndParticipants__ParticipantsAssignment_3_3"
    // InternalDsl.g:2481:1: rule__ScenarioTypeAndParticipants__ParticipantsAssignment_3_3 : ( ruleFunction ) ;
    public final void rule__ScenarioTypeAndParticipants__ParticipantsAssignment_3_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2485:1: ( ( ruleFunction ) )
            // InternalDsl.g:2486:2: ( ruleFunction )
            {
            // InternalDsl.g:2486:2: ( ruleFunction )
            // InternalDsl.g:2487:3: ruleFunction
            {
             before(grammarAccess.getScenarioTypeAndParticipantsAccess().getParticipantsFunctionParserRuleCall_3_3_0()); 
            pushFollow(FOLLOW_2);
            ruleFunction();

            state._fsp--;

             after(grammarAccess.getScenarioTypeAndParticipantsAccess().getParticipantsFunctionParserRuleCall_3_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScenarioTypeAndParticipants__ParticipantsAssignment_3_3"


    // $ANTLR start "rule__ScenarioTypeAndParticipants__NameAssignment_4_2"
    // InternalDsl.g:2496:1: rule__ScenarioTypeAndParticipants__NameAssignment_4_2 : ( RULE_STRING ) ;
    public final void rule__ScenarioTypeAndParticipants__NameAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2500:1: ( ( RULE_STRING ) )
            // InternalDsl.g:2501:2: ( RULE_STRING )
            {
            // InternalDsl.g:2501:2: ( RULE_STRING )
            // InternalDsl.g:2502:3: RULE_STRING
            {
             before(grammarAccess.getScenarioTypeAndParticipantsAccess().getNameSTRINGTerminalRuleCall_4_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getScenarioTypeAndParticipantsAccess().getNameSTRINGTerminalRuleCall_4_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScenarioTypeAndParticipants__NameAssignment_4_2"


    // $ANTLR start "rule__ScenarioTypeAndParticipants__ParticipantsAssignment_4_3"
    // InternalDsl.g:2511:1: rule__ScenarioTypeAndParticipants__ParticipantsAssignment_4_3 : ( ruleConfigurationItem ) ;
    public final void rule__ScenarioTypeAndParticipants__ParticipantsAssignment_4_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2515:1: ( ( ruleConfigurationItem ) )
            // InternalDsl.g:2516:2: ( ruleConfigurationItem )
            {
            // InternalDsl.g:2516:2: ( ruleConfigurationItem )
            // InternalDsl.g:2517:3: ruleConfigurationItem
            {
             before(grammarAccess.getScenarioTypeAndParticipantsAccess().getParticipantsConfigurationItemParserRuleCall_4_3_0()); 
            pushFollow(FOLLOW_2);
            ruleConfigurationItem();

            state._fsp--;

             after(grammarAccess.getScenarioTypeAndParticipantsAccess().getParticipantsConfigurationItemParserRuleCall_4_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScenarioTypeAndParticipants__ParticipantsAssignment_4_3"


    // $ANTLR start "rule__ScenarioTypeAndParticipants__NameAssignment_5_1"
    // InternalDsl.g:2526:1: rule__ScenarioTypeAndParticipants__NameAssignment_5_1 : ( RULE_STRING ) ;
    public final void rule__ScenarioTypeAndParticipants__NameAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2530:1: ( ( RULE_STRING ) )
            // InternalDsl.g:2531:2: ( RULE_STRING )
            {
            // InternalDsl.g:2531:2: ( RULE_STRING )
            // InternalDsl.g:2532:3: RULE_STRING
            {
             before(grammarAccess.getScenarioTypeAndParticipantsAccess().getNameSTRINGTerminalRuleCall_5_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getScenarioTypeAndParticipantsAccess().getNameSTRINGTerminalRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScenarioTypeAndParticipants__NameAssignment_5_1"


    // $ANTLR start "rule__ScenarioTypeAndParticipants__ParticipantsAssignment_5_2"
    // InternalDsl.g:2541:1: rule__ScenarioTypeAndParticipants__ParticipantsAssignment_5_2 : ( ruleActivity ) ;
    public final void rule__ScenarioTypeAndParticipants__ParticipantsAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2545:1: ( ( ruleActivity ) )
            // InternalDsl.g:2546:2: ( ruleActivity )
            {
            // InternalDsl.g:2546:2: ( ruleActivity )
            // InternalDsl.g:2547:3: ruleActivity
            {
             before(grammarAccess.getScenarioTypeAndParticipantsAccess().getParticipantsActivityParserRuleCall_5_2_0()); 
            pushFollow(FOLLOW_2);
            ruleActivity();

            state._fsp--;

             after(grammarAccess.getScenarioTypeAndParticipantsAccess().getParticipantsActivityParserRuleCall_5_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScenarioTypeAndParticipants__ParticipantsAssignment_5_2"


    // $ANTLR start "rule__ScenarioTypeAndParticipants__NameAssignment_6_1"
    // InternalDsl.g:2556:1: rule__ScenarioTypeAndParticipants__NameAssignment_6_1 : ( RULE_STRING ) ;
    public final void rule__ScenarioTypeAndParticipants__NameAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2560:1: ( ( RULE_STRING ) )
            // InternalDsl.g:2561:2: ( RULE_STRING )
            {
            // InternalDsl.g:2561:2: ( RULE_STRING )
            // InternalDsl.g:2562:3: RULE_STRING
            {
             before(grammarAccess.getScenarioTypeAndParticipantsAccess().getNameSTRINGTerminalRuleCall_6_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getScenarioTypeAndParticipantsAccess().getNameSTRINGTerminalRuleCall_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScenarioTypeAndParticipants__NameAssignment_6_1"


    // $ANTLR start "rule__ScenarioTypeAndParticipants__ParticipantsAssignment_6_2"
    // InternalDsl.g:2571:1: rule__ScenarioTypeAndParticipants__ParticipantsAssignment_6_2 : ( ( rule__ScenarioTypeAndParticipants__ParticipantsAlternatives_6_2_0 ) ) ;
    public final void rule__ScenarioTypeAndParticipants__ParticipantsAssignment_6_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2575:1: ( ( ( rule__ScenarioTypeAndParticipants__ParticipantsAlternatives_6_2_0 ) ) )
            // InternalDsl.g:2576:2: ( ( rule__ScenarioTypeAndParticipants__ParticipantsAlternatives_6_2_0 ) )
            {
            // InternalDsl.g:2576:2: ( ( rule__ScenarioTypeAndParticipants__ParticipantsAlternatives_6_2_0 ) )
            // InternalDsl.g:2577:3: ( rule__ScenarioTypeAndParticipants__ParticipantsAlternatives_6_2_0 )
            {
             before(grammarAccess.getScenarioTypeAndParticipantsAccess().getParticipantsAlternatives_6_2_0()); 
            // InternalDsl.g:2578:3: ( rule__ScenarioTypeAndParticipants__ParticipantsAlternatives_6_2_0 )
            // InternalDsl.g:2578:4: rule__ScenarioTypeAndParticipants__ParticipantsAlternatives_6_2_0
            {
            pushFollow(FOLLOW_2);
            rule__ScenarioTypeAndParticipants__ParticipantsAlternatives_6_2_0();

            state._fsp--;


            }

             after(grammarAccess.getScenarioTypeAndParticipantsAccess().getParticipantsAlternatives_6_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScenarioTypeAndParticipants__ParticipantsAssignment_6_2"


    // $ANTLR start "rule__Actor__NameAssignment_1"
    // InternalDsl.g:2586:1: rule__Actor__NameAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Actor__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2590:1: ( ( RULE_STRING ) )
            // InternalDsl.g:2591:2: ( RULE_STRING )
            {
            // InternalDsl.g:2591:2: ( RULE_STRING )
            // InternalDsl.g:2592:3: RULE_STRING
            {
             before(grammarAccess.getActorAccess().getNameSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getActorAccess().getNameSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Actor__NameAssignment_1"


    // $ANTLR start "rule__Actor__IdAssignment_3"
    // InternalDsl.g:2601:1: rule__Actor__IdAssignment_3 : ( RULE_ID ) ;
    public final void rule__Actor__IdAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2605:1: ( ( RULE_ID ) )
            // InternalDsl.g:2606:2: ( RULE_ID )
            {
            // InternalDsl.g:2606:2: ( RULE_ID )
            // InternalDsl.g:2607:3: RULE_ID
            {
             before(grammarAccess.getActorAccess().getIdIDTerminalRuleCall_3_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getActorAccess().getIdIDTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Actor__IdAssignment_3"


    // $ANTLR start "rule__Component__NameAssignment_1"
    // InternalDsl.g:2616:1: rule__Component__NameAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Component__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2620:1: ( ( RULE_STRING ) )
            // InternalDsl.g:2621:2: ( RULE_STRING )
            {
            // InternalDsl.g:2621:2: ( RULE_STRING )
            // InternalDsl.g:2622:3: RULE_STRING
            {
             before(grammarAccess.getComponentAccess().getNameSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getComponentAccess().getNameSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__NameAssignment_1"


    // $ANTLR start "rule__Component__IdAssignment_3"
    // InternalDsl.g:2631:1: rule__Component__IdAssignment_3 : ( RULE_ID ) ;
    public final void rule__Component__IdAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2635:1: ( ( RULE_ID ) )
            // InternalDsl.g:2636:2: ( RULE_ID )
            {
            // InternalDsl.g:2636:2: ( RULE_ID )
            // InternalDsl.g:2637:3: RULE_ID
            {
             before(grammarAccess.getComponentAccess().getIdIDTerminalRuleCall_3_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getComponentAccess().getIdIDTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__IdAssignment_3"


    // $ANTLR start "rule__PhysicalComponent__ComponentAssignment_0"
    // InternalDsl.g:2646:1: rule__PhysicalComponent__ComponentAssignment_0 : ( ruleComponent ) ;
    public final void rule__PhysicalComponent__ComponentAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2650:1: ( ( ruleComponent ) )
            // InternalDsl.g:2651:2: ( ruleComponent )
            {
            // InternalDsl.g:2651:2: ( ruleComponent )
            // InternalDsl.g:2652:3: ruleComponent
            {
             before(grammarAccess.getPhysicalComponentAccess().getComponentComponentParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleComponent();

            state._fsp--;

             after(grammarAccess.getPhysicalComponentAccess().getComponentComponentParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PhysicalComponent__ComponentAssignment_0"


    // $ANTLR start "rule__ConfigurationItem__NameAssignment_1"
    // InternalDsl.g:2661:1: rule__ConfigurationItem__NameAssignment_1 : ( RULE_STRING ) ;
    public final void rule__ConfigurationItem__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2665:1: ( ( RULE_STRING ) )
            // InternalDsl.g:2666:2: ( RULE_STRING )
            {
            // InternalDsl.g:2666:2: ( RULE_STRING )
            // InternalDsl.g:2667:3: RULE_STRING
            {
             before(grammarAccess.getConfigurationItemAccess().getNameSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getConfigurationItemAccess().getNameSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConfigurationItem__NameAssignment_1"


    // $ANTLR start "rule__ConfigurationItem__IdAssignment_3"
    // InternalDsl.g:2676:1: rule__ConfigurationItem__IdAssignment_3 : ( RULE_ID ) ;
    public final void rule__ConfigurationItem__IdAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2680:1: ( ( RULE_ID ) )
            // InternalDsl.g:2681:2: ( RULE_ID )
            {
            // InternalDsl.g:2681:2: ( RULE_ID )
            // InternalDsl.g:2682:3: RULE_ID
            {
             before(grammarAccess.getConfigurationItemAccess().getIdIDTerminalRuleCall_3_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getConfigurationItemAccess().getIdIDTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConfigurationItem__IdAssignment_3"


    // $ANTLR start "rule__Function__NameAssignment_1"
    // InternalDsl.g:2691:1: rule__Function__NameAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Function__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2695:1: ( ( RULE_STRING ) )
            // InternalDsl.g:2696:2: ( RULE_STRING )
            {
            // InternalDsl.g:2696:2: ( RULE_STRING )
            // InternalDsl.g:2697:3: RULE_STRING
            {
             before(grammarAccess.getFunctionAccess().getNameSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getFunctionAccess().getNameSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__NameAssignment_1"


    // $ANTLR start "rule__Function__IdAssignment_3"
    // InternalDsl.g:2706:1: rule__Function__IdAssignment_3 : ( RULE_ID ) ;
    public final void rule__Function__IdAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2710:1: ( ( RULE_ID ) )
            // InternalDsl.g:2711:2: ( RULE_ID )
            {
            // InternalDsl.g:2711:2: ( RULE_ID )
            // InternalDsl.g:2712:3: RULE_ID
            {
             before(grammarAccess.getFunctionAccess().getIdIDTerminalRuleCall_3_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getFunctionAccess().getIdIDTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__IdAssignment_3"


    // $ANTLR start "rule__Activity__NameAssignment_1"
    // InternalDsl.g:2721:1: rule__Activity__NameAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Activity__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2725:1: ( ( RULE_STRING ) )
            // InternalDsl.g:2726:2: ( RULE_STRING )
            {
            // InternalDsl.g:2726:2: ( RULE_STRING )
            // InternalDsl.g:2727:3: RULE_STRING
            {
             before(grammarAccess.getActivityAccess().getNameSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getActivityAccess().getNameSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__NameAssignment_1"


    // $ANTLR start "rule__Activity__IdAssignment_3"
    // InternalDsl.g:2736:1: rule__Activity__IdAssignment_3 : ( RULE_ID ) ;
    public final void rule__Activity__IdAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2740:1: ( ( RULE_ID ) )
            // InternalDsl.g:2741:2: ( RULE_ID )
            {
            // InternalDsl.g:2741:2: ( RULE_ID )
            // InternalDsl.g:2742:3: RULE_ID
            {
             before(grammarAccess.getActivityAccess().getIdIDTerminalRuleCall_3_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getActivityAccess().getIdIDTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__IdAssignment_3"


    // $ANTLR start "rule__Entity__NameAssignment_1"
    // InternalDsl.g:2751:1: rule__Entity__NameAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Entity__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2755:1: ( ( RULE_STRING ) )
            // InternalDsl.g:2756:2: ( RULE_STRING )
            {
            // InternalDsl.g:2756:2: ( RULE_STRING )
            // InternalDsl.g:2757:3: RULE_STRING
            {
             before(grammarAccess.getEntityAccess().getNameSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getEntityAccess().getNameSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__NameAssignment_1"


    // $ANTLR start "rule__Entity__IdAssignment_3"
    // InternalDsl.g:2766:1: rule__Entity__IdAssignment_3 : ( RULE_ID ) ;
    public final void rule__Entity__IdAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2770:1: ( ( RULE_ID ) )
            // InternalDsl.g:2771:2: ( RULE_ID )
            {
            // InternalDsl.g:2771:2: ( RULE_ID )
            // InternalDsl.g:2772:3: RULE_ID
            {
             before(grammarAccess.getEntityAccess().getIdIDTerminalRuleCall_3_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getEntityAccess().getIdIDTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__IdAssignment_3"


    // $ANTLR start "rule__Role__NameAssignment_1"
    // InternalDsl.g:2781:1: rule__Role__NameAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Role__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2785:1: ( ( RULE_STRING ) )
            // InternalDsl.g:2786:2: ( RULE_STRING )
            {
            // InternalDsl.g:2786:2: ( RULE_STRING )
            // InternalDsl.g:2787:3: RULE_STRING
            {
             before(grammarAccess.getRoleAccess().getNameSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getRoleAccess().getNameSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Role__NameAssignment_1"


    // $ANTLR start "rule__Role__IdAssignment_3"
    // InternalDsl.g:2796:1: rule__Role__IdAssignment_3 : ( RULE_ID ) ;
    public final void rule__Role__IdAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2800:1: ( ( RULE_ID ) )
            // InternalDsl.g:2801:2: ( RULE_ID )
            {
            // InternalDsl.g:2801:2: ( RULE_ID )
            // InternalDsl.g:2802:3: RULE_ID
            {
             before(grammarAccess.getRoleAccess().getIdIDTerminalRuleCall_3_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getRoleAccess().getIdIDTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Role__IdAssignment_3"


    // $ANTLR start "rule__Message__Name1Assignment_0"
    // InternalDsl.g:2811:1: rule__Message__Name1Assignment_0 : ( RULE_ID ) ;
    public final void rule__Message__Name1Assignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2815:1: ( ( RULE_ID ) )
            // InternalDsl.g:2816:2: ( RULE_ID )
            {
            // InternalDsl.g:2816:2: ( RULE_ID )
            // InternalDsl.g:2817:3: RULE_ID
            {
             before(grammarAccess.getMessageAccess().getName1IDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getMessageAccess().getName1IDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Message__Name1Assignment_0"


    // $ANTLR start "rule__Message__Name2Assignment_2"
    // InternalDsl.g:2826:1: rule__Message__Name2Assignment_2 : ( RULE_ID ) ;
    public final void rule__Message__Name2Assignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2830:1: ( ( RULE_ID ) )
            // InternalDsl.g:2831:2: ( RULE_ID )
            {
            // InternalDsl.g:2831:2: ( RULE_ID )
            // InternalDsl.g:2832:3: RULE_ID
            {
             before(grammarAccess.getMessageAccess().getName2IDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getMessageAccess().getName2IDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Message__Name2Assignment_2"


    // $ANTLR start "rule__Message__NameAssignment_4"
    // InternalDsl.g:2841:1: rule__Message__NameAssignment_4 : ( RULE_STRING ) ;
    public final void rule__Message__NameAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2845:1: ( ( RULE_STRING ) )
            // InternalDsl.g:2846:2: ( RULE_STRING )
            {
            // InternalDsl.g:2846:2: ( RULE_STRING )
            // InternalDsl.g:2847:3: RULE_STRING
            {
             before(grammarAccess.getMessageAccess().getNameSTRINGTerminalRuleCall_4_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getMessageAccess().getNameSTRINGTerminalRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Message__NameAssignment_4"

    // Delegated rules


    protected DFA1 dfa1 = new DFA1(this);
    static final String dfa_1s = "\13\uffff";
    static final String dfa_2s = "\1\15\3\13\7\uffff";
    static final String dfa_3s = "\1\31\3\26\7\uffff";
    static final String dfa_4s = "\4\uffff\1\5\1\6\1\7\1\1\1\4\1\2\1\3";
    static final String dfa_5s = "\13\uffff}>";
    static final String[] dfa_6s = {
            "\1\1\1\2\1\3\7\uffff\1\4\1\5\1\6",
            "\2\7\11\uffff\1\10",
            "\2\11\11\uffff\1\10",
            "\2\12\11\uffff\1\10",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA1 extends DFA {

        public DFA1(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 1;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "327:1: rule__ScenarioTypeAndParticipants__Alternatives : ( ( ( rule__ScenarioTypeAndParticipants__Group_0__0 ) ) | ( ( rule__ScenarioTypeAndParticipants__Group_1__0 ) ) | ( ( rule__ScenarioTypeAndParticipants__Group_2__0 ) ) | ( ( rule__ScenarioTypeAndParticipants__Group_3__0 ) ) | ( ( rule__ScenarioTypeAndParticipants__Group_4__0 ) ) | ( ( rule__ScenarioTypeAndParticipants__Group_5__0 ) ) | ( ( rule__ScenarioTypeAndParticipants__Group_6__0 ) ) );";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x000000000380E000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000200020L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000014000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000014000002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000304000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000304000002L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000070000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000800000000L});

}