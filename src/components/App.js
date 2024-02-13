import React from 'react';
import { BrowserRouter as Router, Route, Switch } from 'react-router-dom';
import PersonalDashboard from './PersonalDashboard/PersonalDashboard';
import BadgesDashboard from './BadgesDashboard/BadgesDashboard';

function App() {
  return (
    <Router>
      <div>
        <Switch>
          {/* Other routes */}
          <Route path="/badges">
            <BadgesDashboard />
          </Route>
          <Route path="/">
            <PersonalDashboard />
          </Route>
        </Switch>
      </div>
    </Router>
  );
}

export default App;